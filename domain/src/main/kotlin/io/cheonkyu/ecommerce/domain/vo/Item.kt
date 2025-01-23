package io.cheonkyu.io.cheonkyu.ecommerce.domain.vo

class Item(
    val id: Long,
    val name: String,
    val price: Long,
    val quantity: Long,
) {
    fun changeQuantity(quantity: Long): Item {
        return Item(
            id = this.id,
            name = this.name,
            price = this.price,
            quantity = quantity
        )
    }
}