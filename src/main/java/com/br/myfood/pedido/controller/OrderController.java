package com.br.myfood.pedido.controller;

import com.br.myfood.pedido.dto.OrderDto;
import com.br.myfood.pedido.entity.Order;
import com.br.myfood.pedido.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/insert")
    public ResponseEntity insertOrder(@RequestBody OrderDto orderDto){

       return ResponseEntity.ok(orderService.insertOrder(new Order(null,orderDto.getIdClient(),orderDto.getIdRestaurant(),orderDto.getIdMenu())));
    }

}
