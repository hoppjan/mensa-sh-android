package de.janhopp.luebeckmensawidget.theme

import android.annotation.SuppressLint
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.glance.ColorFilter
import androidx.glance.LocalContext
import androidx.glance.unit.ColorProvider

@SuppressLint("RestrictedApi")
fun Color.toColorFilter() = ColorFilter.tint(ColorProvider(color = this))

@Composable
fun glanceString(@StringRes resId: Int, vararg formatArgs: Any): String =
    LocalContext.current.getString(resId, *formatArgs)
