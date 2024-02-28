package com.example.tmoon.screens

import androidx.compose.animation.VectorConverter
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.tmoon.R
import com.example.tmoon.navigation.NavRoutes


@Composable
fun Login(navController: NavHostController) {
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
            text = "Вход в систему",
            fontSize = 22.sp
        )
        Spacer(
            modifier = Modifier
                .height(16.dp)
                .fillMaxWidth()
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
            /*TO-DO*/
        }, colors = ButtonDefaults.buttonColors(containerColor =
        colorResource(id = R.color.background_color)
        ),
            border = BorderStroke(2.dp, colorResource(id = R.color.register_button_color))
        ) {
            Text("Войти", fontSize = 18.sp, color = Color.White)
        }

        /**************Button of registration***************/
        Button(onClick = {
            navController.navigate(NavRoutes.Register.route)
        }, colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
        ) {
            Text("Регистрация", fontSize = 14.sp, color = Color.White)
        }
    }

}
