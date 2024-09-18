package com.example.descontos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _discountValue = MutableLiveData<Double>()
    val discountValue: LiveData<Double> get() = _discountValue
    private val _totalPrice = MutableLiveData<Double>()
    val totalPrice: LiveData<Double> get() = _totalPrice
    fun calculateDiscount(price: Double, discountPercentage: Double) {
        val model = DiscountModel(price, discountPercentage)
        _discountValue.value = model.calculateDiscount()
        _totalPrice.value = model.calculateTotalPrice()
    }
    fun clearData() {
        _discountValue.value = 0.0
        _totalPrice.value = 0.0
    }
}