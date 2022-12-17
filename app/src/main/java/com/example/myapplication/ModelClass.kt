package com.example.myapplication

class ModelClass {
    private var name: String? = null
    private var qty: String? = null
    private var price: String? = null
    private var location: String? = null

    constructor(name: String, qty: String, price: String, location: String){
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.location = location;
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String?) {
        this.name = name
    }

    fun getQty(): String? {
        return qty
    }

    fun setQty(qty: String?) {
        this.qty = qty
    }

    fun getPrice(): String? {
        return price
    }

    fun setPrice(price: String?) {
        this.price = price
    }

    fun getLocation(): String? {
        return location
    }

    fun setLocation(location: String?) {
        this.location = location
    }

}