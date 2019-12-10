package cn.caiyx.springboot.rabbitmq.config;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    @Bean
    public ConnectionFactory connectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        //省略其它属性设置...
        connectionFactory.setAddresses("127.0.0.1");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("admin");
        connectionFactory.setPassword("123456");
        connectionFactory.setVirtualHost("testHost");
        //根据配置决定是否开启 Confirm 机制
        connectionFactory.setPublisherConfirms(true);
        //根据配置决定是否开启 Return 机制
//        connectionFactory.setPublisherReturns(enableReturn);
        return connectionFactory;
    }

    @Bean
    public RabbitTemplate rabbitTemplate() throws Exception {
        //根据配置决定使用哪种 RabbitTemplate
        RabbitTemplate template = new RabbitTemplate(connectionFactory());
        //如果启用 Confirm 机制，设置 ConfirmCallback
        template.setConfirmCallback(confirmCallback());
        //如果启用 Return 机制，设置 ReturnCallback，及打开 Mandatory
//            template.setReturnCallback(returnCallback());
//            template.setMandatory(true);
        return template;
    }

    @Bean
    @ConditionalOnMissingBean(value = RabbitTemplate.ConfirmCallback.class)
    public RabbitTemplate.ConfirmCallback confirmCallback() {
        return new RabbitTemplate.ConfirmCallback() {
            @Override
            public void confirm(CorrelationData correlationData, boolean ack, String cause) {
                if(ack){
                    System.out.println("消费发送成功");
                }else{
                    System.out.println("消息发送失败");
                }
            }
        };
    }


    @Bean
    @ConditionalOnMissingBean(value = RabbitTemplate.ReturnCallback.class)
    public RabbitTemplate.ReturnCallback returnCallback() {
        return new RabbitTemplate.ReturnCallback() {
            @Override
            public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
                // do something ...
            }
        };
    }
}
