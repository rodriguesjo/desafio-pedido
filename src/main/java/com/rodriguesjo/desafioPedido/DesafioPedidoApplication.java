package com.rodriguesjo.desafioPedido;

import com.rodriguesjo.desafioPedido.entities.Order;
import com.rodriguesjo.desafioPedido.services.OrderService;
import com.rodriguesjo.desafioPedido.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class DesafioPedidoApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	@Autowired
	private ShippingService shippingService;

	public static void main(String[] args) {

		SpringApplication.run(DesafioPedidoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int code = sc.nextInt();
		double basic = sc.nextDouble();
		double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);
		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total: R$ %.2f\n", orderService.total(order));
	}
}
