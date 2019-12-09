package cn.caiyx.springboot.rabbitmq;

import cn.caiyx.springboot.entity.DsMember;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MemberSender implements RabbitTemplate.ReturnCallback {
    @Autowired
//    private AmqpTemplate rabbitTemplate;
    private RabbitTemplate rabbitTemplate;
    public void send() {
        String context = "你好现在是 " + new Date() +"";
        System.out.println("HelloSender发送内容 : " + context);
//        this.rabbitTemplate.setConfirmCallback(this);
        this.rabbitTemplate.setReturnCallback(this);
        this.rabbitTemplate.setConfirmCallback((correlationData, ack, cause) -> {
            if (!ack) {
                System.out.println("HelloSender消息发送失败" + cause + correlationData.toString());
            } else {
                System.out.println("HelloSender 消息发送成功 ");
            }
        });
        this.rabbitTemplate.convertAndSend("TestDirectExchange","TestDirectRouting", context);
    }

    public void sendObj() {
        DsMember obj = new DsMember();
        obj.setMemberId(1);
        obj.setFullName("张三");
        System.out.println("发送 : " + obj);
        this.rabbitTemplate.convertAndSend("TestDirectExchange","TestDirectRouting", obj);
    }

    @Override
    public void returnedMessage(Message message, int i, String s, String s1, String s2) {
        System.out.println("sender return success" + message.toString()+"==="+i+"==="+s1+"==="+s2);
    }

//    @Override
//    public void confirm(CorrelationData correlationData, boolean b, String s) {
//        System.out.println("sender success");
//    }
}
