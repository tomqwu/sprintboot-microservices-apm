package com.sivalabs.orderservice.web.controllers;

import com.sivalabs.orderservice.entities.Order;
import com.sivalabs.orderservice.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import io.opentracing.Span;
import io.opentracing.Tracer;
import co.elastic.apm.opentracing.ElasticApmTracer;

@RestController
public class OrderController {

    private OrderRepository repo;
    Tracer tracer = new ElasticApmTracer();

    @Autowired
    public OrderController(OrderRepository repo) {
        this.repo = repo;
    }

    @PostMapping("/api/orders")
    public Order createOrder(@RequestBody Order order) {
        Span span = tracer.buildSpan("createOrder-opening-tracing-bridge").start();
        try {
            return repo.save(order);
        } finally {
            span.finish();
        }
    }

    @GetMapping("/api/orders/{id}")
    public Optional<Order> findOrderById(@PathVariable Long id) {
        Span span = tracer.buildSpan("findOrderById-opening-tracing-bridge").start();
        try {
            return repo.findById(id);
        } finally {
            span.finish();
        }

    }

}
