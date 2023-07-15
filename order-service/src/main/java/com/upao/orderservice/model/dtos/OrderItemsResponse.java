package com.upao.orderservice.model.dtos;

public record OrderItemsResponse(Long id, String sku, Double price, Long quantity) {
}
