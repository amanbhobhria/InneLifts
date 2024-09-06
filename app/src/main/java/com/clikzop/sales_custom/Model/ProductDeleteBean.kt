package com.clikzop.sales_custom.Model


import com.google.gson.annotations.SerializedName

data class ProductDeleteBean(
    @SerializedName("data")
    val `data`: List<Any>,
    @SerializedName("error")
    val error: Boolean, // true
    @SerializedName("msg")
    val msg: String // Lead Product not found.
)