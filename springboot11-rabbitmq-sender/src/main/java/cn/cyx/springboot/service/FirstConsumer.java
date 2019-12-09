package cn.cyx.springboot.service;


import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息消费者1
 * @author zhuzhe
 * @date 2018/5/25 17:32
 * @email 1529949535@qq.com
 */
@Component
public class FirstConsumer {

    @RabbitListener(queues = {"first-queue","second-queue"}, containerFactory = "rabbitListenerContainerFactory")
    public void handleMessage(Message message, Channel channel) throws Exception {
        // 处理消息
        System.out.println("FirstConsumer {} handleMessage :"+new String(message.getBody()));
        long deliveryTag = message.getMessageProperties().getDeliveryTag();
        channel.basicAck(deliveryTag, false);
    }
}