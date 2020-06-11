package com.thefuturestic.arproject.StartUp

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class LogInResponse {
    @SerializedName("response")
    @Expose
    var response: String? = null

    @SerializedName("response_code")
    @Expose
    var response_code: String? = null

    @SerializedName("data")
    @Expose
    var user: User? = null

}