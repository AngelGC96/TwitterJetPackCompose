package com.example.twitterjetpackcompose.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.twitterjetpackcompose.R

@Composable
fun ArisTwit() {
    Twit()
}

@Composable
fun Twit() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF15334B))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .weight(1f)
                .padding(8.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Profile picture",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(60.dp)
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(3f)
                .padding(end = 8.dp)
        ) {
            Row {
                Text(
                    text = "Aris",
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(
                    text = "@AristiDevs",
                    color = Color.Gray,
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(text = "4h", color = Color.Gray)
                Icon(
                    painter = painterResource(id = R.drawable.ic_dots),
                    contentDescription = "Options",
                    tint = Color.White,
                    modifier = Modifier.weight(1f)
                )

            }
            SetSpacer(size = 8)
            Column {
                Text(
                    text = "¡Explorando nuevas fronteras en el mundo de la tecnología con entusiasmo! \uD83D\uDCBB✨ Descubriendo posibilidades infinitas con cada línea de código.",
                    maxLines = 5,
                    color = Color.White
                )
            }
            SetSpacer(size = 8)
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = "Twit Attached Image"
            )
            SetSpacer(size = 8)
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp), color = Color.Gray
            )
        }
    }

}

@Composable
fun SetSpacer(size: Int) {
    Spacer(modifier = Modifier.padding(vertical = size.dp))
}
