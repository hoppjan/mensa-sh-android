package de.janhopp.luebeckmensawidget.ui.components

import androidx.compose.runtime.Composable
import androidx.glance.GlanceModifier
import androidx.glance.color.ColorProvider
import androidx.glance.text.Text
import androidx.glance.text.TextDefaults
import androidx.glance.text.TextStyle
import androidx.compose.ui.graphics.Color

@Composable
fun StyledText(
    modifier: GlanceModifier = GlanceModifier,
    style: TextStyle = TextDefaults.appTextStyle,
    text: String,
) {
    Text(
        modifier = modifier,
        style = style,
        text = text,
    )
}

val TextDefaults.appTextStyle: TextStyle
    get() = defaultTextStyle.copy(
        color = ColorProvider(
            day = Color(red = 0, green = 0, blue = 0),
            night = Color(red = 0xFF, green = 0xFF, blue = 0xFF),
        )
    )
