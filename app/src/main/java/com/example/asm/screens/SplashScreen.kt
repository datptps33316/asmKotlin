@file:Suppress("UNUSED_EXPRESSION")

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.asm.R
import com.example.asm.components.GetStartedButton



@Composable
fun SplashScreen(onNavigateToLogin: () -> Unit) {
    val backGroundPainter: Painter = painterResource(id = R.drawable.image_splash)
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = backGroundPainter,
            contentDescription = "",
            Modifier.fillMaxSize()
        )
        Column(modifier = Modifier.fillMaxSize()) {

            Text(
                modifier = Modifier
                    .padding(top = 240.2896.dp, start = 31.2.dp),
                fontSize = 24.sp,
                letterSpacing = 1.2.sp,
                fontFamily = FontFamily(Font(R.font.gelasio_bold)),
                text = "MAKE YOUR ",
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight(600),
                color = Color(0xFF606060),
            )
            Text(
                modifier = Modifier
                    .padding(top = 15.5970060736.dp, start = 31.2.dp),
                fontSize = 30.sp,
                text = "HOME BEAUTIFUL ",
                fontFamily = FontFamily(Font(R.font.gelasio_bold)),
                fontStyle = FontStyle.Normal,
                fontWeight = FontWeight(700),
                color = Color(0xFF303030),
            )
            Text(
                modifier = Modifier
                    .padding(top = 36.3636.dp, start = 50.4.dp )
                    ,
                fontSize = 18.sp,
                text = "The best simple place where you discover most wonderful furniture and make your home beautiful",
                fontStyle = FontStyle.Normal,
                fontFamily = FontFamily(Font(R.font.unnitosans_7pt_extralight)),
                lineHeight = 35.sp,
                fontWeight = FontWeight(400),
                color = Color(0xFF808080),
            )
            GetStartedButton(
                name = "Get Started ",
                onClick = { onNavigateToLogin()},
                backgroundColor = Color(0xFF242424),
                textColor = Color.White,
                radius = 4,
                modifier = Modifier
                    .padding(top = 160.0886.dp, start = 107.64.dp)
                    .width(165.36.dp)
                    .height(56.162.dp),
            )
        }

    }


}


