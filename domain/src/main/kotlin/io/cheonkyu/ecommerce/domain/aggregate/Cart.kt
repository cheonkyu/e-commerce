package io.cheonkyu.ecommerce.domain.aggregate

import io.cheonkyu.io.cheonkyu.ecommerce.domain.vo.Item

class Cart(val cartId: Long) {
    val items = mutableListOf<Item>();

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
    }

    fun changeQuantity(itemId: Long, quantity: Long) {
        val item = items.find { it.id == itemId }
        val newItem = item?.changeQuantity(quantity);
        println(newItem?.quantity);
        items.map { if (it == item) newItem else it }
    }

    fun removeItem(itemId: Long) {
        items.retainAll { it.id != itemId }
    }
}