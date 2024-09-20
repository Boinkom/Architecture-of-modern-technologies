package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.orderapp.ProductAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var totalPriceTextView: TextView
    private val order = Order()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        totalPriceTextView = findViewById(R.id.totalPriceTextView)

        val products = MockData.getProducts()

        val productAdapter = ProductAdapter(products, ::onProductClicked)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = productAdapter

        updateTotalPrice()
    }

    private fun onProductClicked(product: Product) {
        order.addItem(product)
        updateTotalPrice()
    }

    private fun updateTotalPrice() {
        totalPriceTextView.text = "Total: $${order.getTotalPrice()}"
    }
}
