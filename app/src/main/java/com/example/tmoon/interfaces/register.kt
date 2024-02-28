package com.example.tmoon.interfaces

import com.example.tmoon.dataclass.RegistrationRequest
import com.example.tmoon.dataclass.RegistrationResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface UserApiService {
    @POST("/register")
   suspend fun registerUser(@Body registrationRequest: RegistrationRequest): Response<RegistrationResponse>
}