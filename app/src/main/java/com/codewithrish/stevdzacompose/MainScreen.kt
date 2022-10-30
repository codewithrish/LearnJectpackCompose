package com.codewithrish.stevdzacompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {
    Image(
        modifier = Modifier
            .size(300.dp)
            .clip(RoundedCornerShape(100))
            .border(width = 5.dp, color = Color.Green, shape = RoundedCornerShape(100)),
        painter = painterResource(id = R.drawable.image),
        contentDescription = "Circular Image",
        contentScale = ContentScale.Crop
    )
}

@Composable
@Preview
fun MainScreenPreview() {
    MainScreen()
}