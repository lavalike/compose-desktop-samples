import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

/**
 * chat-area
 *
 * @author : zhen51.wang
 * @date : 2023/9/27/027
 */
@Composable
fun ChatAreaComposable() {
    Box(
        modifier = Modifier.fillMaxSize().background(color = Color(COLOR_PANEL)).padding(12.dp),
        contentAlignment = Alignment.Center,
    ) {
        Icon(
            painter = painterResource("ic_launcher.png"),
            contentDescription = null,
            tint = Color(COLOR_PANEL_DARK),
            modifier = Modifier.size(80.dp)
        )
    }
}