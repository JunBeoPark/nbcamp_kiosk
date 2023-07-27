package com.example.kiosk;

open class MenuItem(val id: Int, val name: String, val price: Double, val category: String,val description: String, val hotIce: String) {
    fun display() = "$name | W $price"
}
