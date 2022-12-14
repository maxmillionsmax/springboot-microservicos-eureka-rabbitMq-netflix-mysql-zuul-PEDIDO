package com.br.myfood.pedido.entity;

import com.br.myfood.pedido.dto.OrderDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long idClient;
    private Long idRestaurant;
    private Long idMenu;

    public static Order create(OrderDto orderDto){
        return new ModelMapper().map(orderDto,Order.class);
    }

}
