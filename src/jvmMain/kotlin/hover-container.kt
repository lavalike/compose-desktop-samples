import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.onPointerEvent
import androidx.compose.ui.unit.dp

/**
 * hover-container
 *
 * @author : zhen51.wang
 * @date : 2023/9/27/027
 */

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun HoverContainer(
    enterColor: Color = Color(COLOR_PANEL),
    exitColor: Color = Color.Transparent,
    shape: Shape = RoundedCornerShape(10.dp),
    padding: PaddingValues = PaddingValues(),
    onClick: () -> Unit,
    content: @Composable () -> Unit
) {
    var hover by remember { mutableStateOf(false) }

    Box(modifier = Modifier.padding(padding).clip(shape).background(color = if (hover) enterColor else exitColor)
        .onPointerEvent(PointerEventType.Enter) {
            hover = true
        }.onPointerEvent(PointerEventType.Exit) {
            hover = false
        }.clickable { onClick() }) {
        content()
    }
}