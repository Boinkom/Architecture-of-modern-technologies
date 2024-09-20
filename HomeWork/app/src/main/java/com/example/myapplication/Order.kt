package com.example.myapplication


class Order {
    private val items: MutableList<Product> = mutableListOf()

    fun addItem(product: Product) {
        items.add(product)
    }

    fun removeItem(product: Product) {
        items.remove(product)
    }

    fun getTotalPrice(): Double {
        return items.sumOf { it.price }
    }

    fun getItems(): List<Product> {
        return items
    }
}
