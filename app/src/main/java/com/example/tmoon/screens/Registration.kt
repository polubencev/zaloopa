package com.example.tmoon.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.example.tmoon.R
import com.example.tmoon.models.RegistrationViewModel
import com.example.tmoon.navigation.NavRoutes

@Composable
fun Registration(registrationViewModel: RegistrationViewModel = viewModel(), navController: NavHostController) {
    val first_name = remember {
        mutableStateOf("")
    }
    val last_name = remember {
        mutableStateOf("")
    }
    val email = remember {
        mutableStateOf("")
    }
    val phone = remember {
        mutableStateOf("")
    }
    val login = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }
    //===========================//
    Image(modifier = Modifier.fillMaxSize(),
        painter = painterResource(id = R.drawable.background),
        contentDescription = "",
        contentScale = ContentScale.FillBounds
    )
    Column(
        modifier = Modifier
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(color = Color.White,
            modifier = Modifier.padding(top = 10.dp),
            text = "Регистрация",
            fontSize = 22.sp
        )
        Spacer(
            modifier = Modifier
                .height(16.dp)
                .fillMaxWidth()
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = first_name.value,
            onValueChange = { first_name.value = it },
            label = { Text("Имя") },
            colors = TextFieldDefaults.colors(unfocusedContainerColor =
            colorResource(id = R.color.outLineText_background)
            )

        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = last_name.value,
            onValueChange = { last_name.value = it },
            label = { Text("Фамилия") },
            colors = TextFieldDefaults.colors(unfocusedContainerColor =
            colorResource(id = R.color.outLineText_background)
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = email.value,
            onValueChange = { email.value = it },
            label = { Text("Email") },
            colors = TextFieldDefaults.colors(unfocusedContainerColor =
            colorResource(id = R.color.outLineText_background)
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = phone.value,
            onValueChange = { phone.value = it },
            label = { Text("Телефон") },
            colors = TextFieldDefaults.colors(unfocusedContainerColor =
            colorResource(id = R.color.outLineText_background)
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = login.value,
            onValueChange = { login.value = it },
            label = { Text("Логин") },
            colors = TextFieldDefaults.colors(unfocusedContainerColor =
            colorResource(id = R.color.outLineText_background)
            )
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = password.value,
            onValueChange = { password.value = it },
            label = { Text("Пароль") },
            colors = TextFieldDefaults.colors(unfocusedContainerColor =
            colorResource(id = R.color.outLineText_background)
            )
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            registrationViewModel.register(
                first_name.value, last_name.value, email.value,
                phone.value, login.value, password.value
            )
        }, colors = ButtonDefaults.buttonColors(containerColor =
        colorResource(id = R.color.background_color)
        ),
            border = BorderStroke(2.dp, colorResource(id = R.color.register_button_color))
        ) {
            Text("Регистрация", fontSize = 20.sp)
        }
    }

}