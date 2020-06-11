package com.thefuturestic.arproject.StartUp

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class LoginRequest {
    @SerializedName("Username")
    @Expose
    var userName: String? = null

    @SerializedName("Password")
    @Expose
    var password: String? = null

}