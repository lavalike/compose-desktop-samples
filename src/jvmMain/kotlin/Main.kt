import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Row
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

@Composable
@Preview
fun App() {
    MaterialTheme {
        Row {
            SidebarComposable()
        }
    }
}

fun main() = application {
    val icon = painterResource("ic_launcher.png")
    Window(
        onCloseRequest = ::exitApplication,
        icon = icon,
        title = "Compose Desktop",
        state = rememberWindowState(
            width = 1280.dp,
            height = 800.dp,
            position = WindowPosition(alignment = Alignment.Center)
        )
    ) {
        App()
    }
}
