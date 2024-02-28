package com.example.tmoon.models

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tmoon.dataclass.RegistrationRequest
import com.example.tmoon.dataclass.RegistrationResponse
import kotlinx.coroutines.launch
import retrofit2.Response
import com.example.tmoon.objects.RetrofitClient

class RegistrationViewModel : ViewModel() {
    @SuppressLint("SuspiciousIndentation")
    fun register(first_name: String, last_name: String, email: String, phone:String,
                 login: String, password: String) {
        viewModelScope.launch {
            try{
            val response = RetrofitClient.userApiService.registerUser(
                    RegistrationRequest(first_name,last_name, email, phone, login, password)
                )
                if (response.isSuccessful && response.body() != null) {
                    Log.d("Log", "success message" + response.message())
                    Log.d("Log", "success code " + response.code().toString())
                val responseBody = response.body()!!
                    Log.d("Log", "success respBody.message" + responseBody.message)
                    println(responseBody.message)

            } else {

                    Log.d("Log", "Error: responseBody.errorBody " + response.errorBody().toString())
                    Log.d("Log", "Error: responce.message " + response.message().toString())
                    Log.d("Log", "Error Code = " + response.code().toString())

            }
            } catch (e: Exception) {
                Log.d("Log", "exception e.message  " + e.message.toString())
                return@launch
            }
        }
    }

}