// type kt
package id.my.sendiko.personalfinancetracker.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import org.jetbrains.compose.resources.Font
import personalfinancetracker.composeapp.generated.resources.Res
import personalfinancetracker.composeapp.generated.resources.plusjakartasans_bold
import personalfinancetracker.composeapp.generated.resources.plusjakartasans_bolditalic
import personalfinancetracker.composeapp.generated.resources.plusjakartasans_extrabold
import personalfinancetracker.composeapp.generated.resources.plusjakartasans_extrabolditalic
import personalfinancetracker.composeapp.generated.resources.plusjakartasans_extralight
import personalfinancetracker.composeapp.generated.resources.plusjakartasans_extralighttalic
import personalfinancetracker.composeapp.generated.resources.plusjakartasans_italic
import personalfinancetracker.composeapp.generated.resources.plusjakartasans_light
import personalfinancetracker.composeapp.generated.resources.plusjakartasans_lightitalic
import personalfinancetracker.composeapp.generated.resources.plusjakartasans_medium
import personalfinancetracker.composeapp.generated.resources.plusjakartasans_mediumitalic
import personalfinancetracker.composeapp.generated.resources.plusjakartasans_regular
import personalfinancetracker.composeapp.generated.resources.plusjakartasans_semibold
import personalfinancetracker.composeapp.generated.resources.plusjakartasans_semibolditalic
import personalfinancetracker.composeapp.generated.resources.poppins_bold
import personalfinancetracker.composeapp.generated.resources.poppins_bolditalic
import personalfinancetracker.composeapp.generated.resources.poppins_extrabold
import personalfinancetracker.composeapp.generated.resources.poppins_extrabolditalic
import personalfinancetracker.composeapp.generated.resources.poppins_extralight
import personalfinancetracker.composeapp.generated.resources.poppins_extralightitalic
import personalfinancetracker.composeapp.generated.resources.poppins_italic
import personalfinancetracker.composeapp.generated.resources.poppins_light
import personalfinancetracker.composeapp.generated.resources.poppins_lightitalic
import personalfinancetracker.composeapp.generated.resources.poppins_medium
import personalfinancetracker.composeapp.generated.resources.poppins_mediumitalic
import personalfinancetracker.composeapp.generated.resources.poppins_regular
import personalfinancetracker.composeapp.generated.resources.poppins_semibold
import personalfinancetracker.composeapp.generated.resources.poppins_semibolditalic

@Composable
fun JakartaPlusFamily(modifier: Modifier = Modifier) = FontFamily(
    Font(Res.font.plusjakartasans_extralight, style = FontStyle.Normal, weight = FontWeight.ExtraLight),
    Font(Res.font.plusjakartasans_extralighttalic, style = FontStyle.Italic, weight = FontWeight.ExtraLight),
    Font(Res.font.plusjakartasans_light, style = FontStyle.Normal, weight = FontWeight.Light),
    Font(Res.font.plusjakartasans_lightitalic, style = FontStyle.Italic, weight = FontWeight.Light),
    Font(Res.font.plusjakartasans_regular, style = FontStyle.Normal, weight = FontWeight.Normal),
    Font(Res.font.plusjakartasans_italic, style = FontStyle.Italic, weight = FontWeight.Normal),
    Font(Res.font.plusjakartasans_medium, style = FontStyle.Normal, weight = FontWeight.Medium),
    Font(Res.font.plusjakartasans_mediumitalic, style = FontStyle.Italic, weight = FontWeight.Medium),
    Font(Res.font.plusjakartasans_semibold, style = FontStyle.Normal, weight = FontWeight.SemiBold),
    Font(Res.font.plusjakartasans_semibolditalic, style = FontStyle.Italic, weight = FontWeight.SemiBold),
    Font(Res.font.plusjakartasans_bold, style = FontStyle.Normal, weight = FontWeight.Bold),
    Font(Res.font.plusjakartasans_bolditalic, style = FontStyle.Italic, weight = FontWeight.Bold),
    Font(Res.font.plusjakartasans_extrabold, style = FontStyle.Normal, weight = FontWeight.ExtraBold),
    Font(Res.font.plusjakartasans_extrabolditalic, style = FontStyle.Italic, weight = FontWeight.ExtraBold),
)

@Composable
fun PoppinsFamily(modifier: Modifier = Modifier) = FontFamily(
    Font(Res.font.poppins_extralight, style = FontStyle.Normal, weight = FontWeight.ExtraLight),
    Font(Res.font.poppins_extralightitalic, style = FontStyle.Italic, weight = FontWeight.ExtraLight),
    Font(Res.font.poppins_light, style = FontStyle.Normal, weight = FontWeight.Light),
    Font(Res.font.poppins_lightitalic, style = FontStyle.Italic, weight = FontWeight.Light),
    Font(Res.font.poppins_regular, style = FontStyle.Normal, weight = FontWeight.Normal),
    Font(Res.font.poppins_italic, style = FontStyle.Italic, weight = FontWeight.Normal),
    Font(Res.font.poppins_medium, style = FontStyle.Normal, weight = FontWeight.Medium),
    Font(Res.font.poppins_mediumitalic, style = FontStyle.Italic, weight = FontWeight.Medium),
    Font(Res.font.poppins_semibold, style = FontStyle.Normal, weight = FontWeight.SemiBold),
    Font(Res.font.poppins_semibolditalic, style = FontStyle.Italic, weight = FontWeight.SemiBold),
    Font(Res.font.poppins_bold, style = FontStyle.Normal, weight = FontWeight.Bold),
    Font(Res.font.poppins_bolditalic, style = FontStyle.Italic, weight = FontWeight.Bold),
    Font(Res.font.poppins_extrabold, style = FontStyle.Normal, weight = FontWeight.ExtraBold),
    Font(Res.font.poppins_extrabolditalic, style = FontStyle.Italic, weight = FontWeight.ExtraBold),
)

@Composable
fun AppTypography(modifier: Modifier = Modifier) = Typography().run {
    val displayFontFamily = JakartaPlusFamily()
    val bodyFontFamily = PoppinsFamily()
    copy(
        displayLarge = displayLarge.copy(fontFamily = displayFontFamily),
        displayMedium = displayMedium.copy(fontFamily = displayFontFamily),
        displaySmall = displaySmall.copy(fontFamily = displayFontFamily),
        headlineLarge = headlineLarge.copy(fontFamily = displayFontFamily),
        headlineMedium = headlineMedium.copy(fontFamily = displayFontFamily),
        headlineSmall = headlineSmall.copy(fontFamily = displayFontFamily),
        titleLarge = titleLarge.copy(fontFamily = displayFontFamily),
        titleMedium = titleMedium.copy(fontFamily = displayFontFamily),
        titleSmall = titleSmall.copy(fontFamily = displayFontFamily),
        bodyLarge = bodyLarge.copy(fontFamily = bodyFontFamily),
        bodyMedium = bodyMedium.copy(fontFamily = bodyFontFamily),
        bodySmall = bodySmall.copy(fontFamily = bodyFontFamily),
        labelLarge = labelLarge.copy(fontFamily = bodyFontFamily),
        labelMedium = labelMedium.copy(fontFamily = bodyFontFamily),
        labelSmall = labelSmall.copy(fontFamily = bodyFontFamily),
    )
}