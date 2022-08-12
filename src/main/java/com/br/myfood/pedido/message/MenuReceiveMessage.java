package com.br.myfood.pedido.message;

import com.br.myfood.pedido.dto.ClientOrderDto;
import com.br.myfood.pedido.dto.MenuOrderDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class MenuReceiveMessage {

    @RabbitListener(queues = {"${cadastro.client.rabbitmq.queu}"})
    public void receiveMessage(@Payload MenuOrderDto menuOrderDto){

        System.out.println(menuOrderDto);

    }
}
