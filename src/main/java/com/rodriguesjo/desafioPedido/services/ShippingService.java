package com.rodriguesjo.desafioPedido.services;

import com.rodriguesjo.desafioPedido.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order){
        double frete;
        if (order.getBasic() >= 200.0){
            frete = 0.0;
        } else if (order.getBasic() >= 100.0) {
            frete = 12.0;
        }else{
            frete = 20.0;
        }
        return frete;
    }
}
