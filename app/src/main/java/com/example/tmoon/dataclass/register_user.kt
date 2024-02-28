package com.example.tmoon.dataclass

data class RegistrationRequest(
    val first_name: String,
    val last_name: String,
    val email: String,
    val phone: String,
    val login: String,
    val password: String
)

data class RegistrationResponse(
    val message: String
)
