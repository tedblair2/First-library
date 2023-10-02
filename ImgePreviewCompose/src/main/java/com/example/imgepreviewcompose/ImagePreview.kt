package com.example.imgepreviewcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ImagePreviewLib(
    modifier: Modifier = Modifier,
    image: Painter,
    description:String="image",
    imageScale:ContentScale= ContentScale.Crop,
    size:Dp=150.dp,
    onImageClick:()->Unit={}
) {

    Box(modifier = modifier
        .size(size)
        .clip(RoundedCornerShape(12.dp))
        .clickable { onImageClick() },
        contentAlignment = Alignment.BottomCenter){
        Image(
            painter = image,
            contentDescription ="person",
            modifier = Modifier.fillMaxSize(),
            contentScale = imageScale)
        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.5f)
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(Color.Transparent, Color.DarkGray)
                )
            ))
        Text(text = description, fontSize = 13.sp, color = Color.White)
    }
}
