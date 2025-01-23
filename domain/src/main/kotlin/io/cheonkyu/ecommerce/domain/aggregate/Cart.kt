package io.cheonkyu.ecommerce.domain.aggregate

import io.cheonkyu.ecommerce.domain.event.ItemAdded
import io.cheonkyu.ecommerce.domain.event.ItemRemoved
import io.cheonkyu.ecommerce.domain.event.QuantityChanged
import io.cheonkyu.io.cheonkyu.ecommerce.domain.vo.Item

class Cart(val cartId: Long) {
    val items = mutableListOf<Item>();
    val events = mutableListOf<Any>();

    fun addItem(
        itemId: Long,
        itemName: String,
        quantity: Long,
    ) {
        items.add(
            Item(
                id = itemId,
                name = itemName,
                quantity = quantity,
                price = 0L,
            )
        );
        val event = ItemAdded(itemId = itemId, itemName = itemName, quantity = quantity);
        events.add(event);
    }

    fun changeQuantity(
        itemId: Long,
        quantity: Long
    ) {
        val item = items.find { it.id == itemId }
        val newItem = item?.changeQuantity(quantity);
        println(newItem?.quantity);
        items.map { if (it == item) newItem else it }

        val event = QuantityChanged(itemId = itemId, quantity = quantity);
        events.add(event);
    }

    fun removeItem(itemId: Long) {
        items.retainAll { it.id != itemId }
        val event = ItemRemoved(itemId = itemId);
        events.add(event);
    }
}