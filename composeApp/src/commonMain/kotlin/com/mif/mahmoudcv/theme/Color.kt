package com.mif.mahmoudcv.theme

import androidx.compose.ui.graphics.Color

// Shared portfolio identity: crisp product blue, neutral surfaces, no decorative gradients.
val Primary: Color = Color(0xFF155EEF)
val PrimaryDark: Color = Color(0xFF004EEB)
val PrimaryLight: Color = Color(0xFF175CD3)

// The action colour never changes between themes. It is the fill behind white
// content on the primary Email button, where it reads 5.4:1 on either canvas.
val ActionBlue: Color = Color(0xFF155EEF)
val OnActionBlue: Color = Color(0xFFFFFFFF)

// The signal colour is the same blue in light, and lifts in dark. It is used
// for anything blue that is *drawn as ink* rather than filled: icons, links,
// the role line, selected navigation, tag text, borders. #155EEF as ink on the
// dark canvas is 3.46:1 and fails; #84ADFF is 8.38:1 and passes.
val SignalBlueLight: Color = Color(0xFF155EEF)
val SignalBlueDark: Color = Color(0xFF84ADFF)

val Accent: Color = Color(0xFF344054)
val AccentLight: Color = Color(0xFF667085)

val DarkBackground: Color = Color(0xFF0B1220)
val DarkBackgroundDarker: Color = Color(0xFF070D17)
val DarkSurface: Color = Color(0xFF111A2B)
val DarkCardBackground: Color = Color(0xFF18243A)
val DarkCardBorder: Color = Color(0xFF31415B)
val DarkTextPrimary: Color = Color(0xFFF9FAFB)
val DarkTextSecondary: Color = Color(0xFFC8D1E0)
val DarkTextMuted: Color = Color(0xFFA2AEC0)

val LightBackground: Color = Color(0xFFFFFFFF)
val LightBackgroundDarker: Color = Color(0xFFF2F4F7)
val LightSurface: Color = Color(0xFFFFFFFF)
val LightCardBackground: Color = Color(0xFFF2F4F7)
val LightCardBorder: Color = Color(0xFFD0D5DD)
val LightTextPrimary: Color = Color(0xFF101828)
val LightTextSecondary: Color = Color(0xFF344054)
val LightTextMuted: Color = Color(0xFF667085)

val Success: Color = Color(0xFF17B26A)
val Error: Color = Color(0xFFD92D20)
val Warning: Color = Color(0xFFF79009)
val Info: Color = Primary
