package com.example.descontos

data class DiscountModel(
    val price: Double,
    val discountPercentage: Double
) {
    fun calculateDiscount(): Double {
        return price * discountPercentage / 100
    }
    fun calculateTotalPrice(): Double {
        return price - calculateDiscount()
    }
}