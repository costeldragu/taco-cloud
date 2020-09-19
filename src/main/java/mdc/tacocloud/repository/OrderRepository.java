package mdc.tacocloud.repository;

import mdc.tacocloud.domain.Order;

public interface OrderRepository {
    Order save(Order order);
}
