package com.example.asm.screens


import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.Visibility
import com.example.asm.R
import com.example.asm.components.GetStartedButton

@SuppressLint("InvalidColorHexValue")
@Composable
fun RegisterScreen() {
    var passwordVisible by remember { mutableStateOf(false) }
    var rPassWordVisible by remember { mutableStateOf(false) }
    var userName by remember {
        mutableStateOf("")
    }
    var rUserName by remember {
        mutableStateOf("")
    }
    var password by rememberSaveable { mutableStateOf("") }
    var passwordVisualTransformation = remember { PasswordVisualTransformation() }
    var rPassword by remember {
        mutableStateOf("")
    }

    Column(
        Modifier.background(Color(0xFFFFF))
    ) {
        Row(
            modifier = Modifier
                .padding(top = 68.5424.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center

        ) {
            Box(
                Modifier
                    .padding(end = 22.5733.dp)
                    .height(1.2.dp)
                    .width(109.2.dp)
                    .background(Color(0XFFBDBDBD))
            ) {}
            Image(
                painter = painterResource(id = R.drawable.logologin),
                contentDescription = ""
            )
            Box(
                Modifier
                    .padding(start = 22.5733.dp)
                    .height(1.2.dp)
                    .width(109.2.dp)
                    .background(Color(0XFFBDBDBD))
            ) {}
        }
        Text(
            text = "WELCOME ",
            fontSize = 24.sp,
            lineHeight = 45.sp,
            letterSpacing = 1.2.sp,
            fontFamily = FontFamily(Font(R.font.merriweather_bold)),
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight(700),
            color = Color(0xFF303030),
            modifier = Modifier.padding(start = 31.2.dp),
        )
        Column(
            modifier = Modifier
                .width(358.8.dp)
                .shadow(
                    elevation = 3.dp,
                    spotColor = Color(0xFF8A959E),
                )
                .clip(RoundedCornerShape(12.dp))
                .padding(top = 35.dp, start = 30.dp, bottom = 37.dp)
        ) {

            Text(
                text = "Email",
                fontSize = 14.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight(400),
                color = Color(0xFF909090),
            )
            TextField(
                value = userName,
                onValueChange = {userName=it},
                modifier = Modifier
                    .fillMaxWidth(),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    focusedIndicatorColor = Color(0xFFE0E0E0),
                    unfocusedIndicatorColor = Color(0xFFE0E0E0),
                )
            )
            Text(
                modifier = Modifier.padding(top = 35.dp),
                text = "Email",
                fontSize = 14.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight(400),
                color = Color(0xFF909090),
            )
            TextField(
                value = rUserName,
                onValueChange = {rUserName = it},
                modifier = Modifier
                    .fillMaxWidth(),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    focusedIndicatorColor = Color(0xFFE0E0E0),
                    unfocusedIndicatorColor = Color(0xFFE0E0E0),
                )
            )
            Text(
                text = "Password",
                Modifier.padding(top = 35.dp),
                fontSize = 14.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight(400),
                color = Color(0xFF909090),
            )
            TextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier
                    .fillMaxWidth(),
                visualTransformation = if (passwordVisible) {
                    VisualTransformation.None
                } else {
                    passwordVisualTransformation
                },

                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    focusedIndicatorColor = Color(0xFFE0E0E0),
                    unfocusedIndicatorColor = Color(0xFFE0E0E0),
                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                trailingIcon = {
                    Icon(
                        if (passwordVisible) {
                            Icons.Filled.Visibility
                        } else {
                            Icons.Filled.VisibilityOff
                        },
                        contentDescription = "Toggle password visibility",
                        modifier = Modifier
                            .padding(end = 30.dp)
                            .clickable { passwordVisible = !passwordVisible })
                }

            )
            Text(
                text = "Password",
                Modifier.padding(top = 35.dp),
                fontSize = 14.sp,
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight(400),
                color = Color(0xFF909090),
            )

            TextField(
                value = rPassword,
                onValueChange = {rPassword = it},
                modifier = Modifier
                    .fillMaxWidth(),
                visualTransformation = if (rPassWordVisible) {
                    VisualTransformation.None
                } else {
                    passwordVisualTransformation
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Transparent,
                    unfocusedContainerColor = Color.Transparent,
                    focusedIndicatorColor = Color(0xFFE0E0E0),
                    unfocusedIndicatorColor = Color(0xFFE0E0E0),
                ),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                trailingIcon = {
                    Icon(
                        if (rPassWordVisible) {
                            Icons.Filled.Visibility
                        } else {
                            Icons.Filled.VisibilityOff
                        },
                        contentDescription = "Toggle password visibility",
                        modifier = Modifier
                            .padding(end = 30.dp)
                            .clickable { rPassWordVisible = !rPassWordVisible })
                }

            )
            GetStartedButton(
                name = "SIGN UP",
                backgroundColor = Color(0xFF242424),
                textColor = Color.White,
                onClick = {},
                radius = 8,
                modifier = Modifier
                    .padding(top = 40.dp, start = 15.dp)
                    .width(268.32.dp)
                    .height(53.162.dp),
            )
            Row(
                modifier = Modifier
                    .padding(top = 30.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Already have account? ",
                    fontSize = 14.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight(600),
                    fontFamily = FontFamily(Font(R.font.unnitosans_7pt_extralight)),
                    color = Color(0xFF808080),
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "SIGN UP",
                    fontSize = 14.sp,
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight(700),
                    fontFamily = FontFamily(Font(R.font.unnitosans_7pt_extralight)),
                    color = Color(0xFF303030),
                    textAlign = TextAlign.Center
                )
            }


        }

    }
}