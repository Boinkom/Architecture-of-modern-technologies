package com.example.myapplication

import com.example.myapplication.Product

object MockData {
    fun getProducts(): List<Product> {
        return listOf(
            Product(1, "Laptop", 1500.0),
            Product(2, "Smartphone", 800.0),
            Product(3, "Headphones", 150.0),
            Product(4, "Keyboard", 100.0),
            Product(5, "Mouse", 50.0)
        )
    }
}
