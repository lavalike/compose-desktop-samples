import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

/**
 * sidebar
 *
 * @author : zhen51.wang
 * @date : 2023/9/26/026
 */
@Preview
@Composable
fun SidebarComposable() {
    Box(
        modifier = Modifier.width(60.dp).fillMaxHeight().background(color = Color(COLOR_PANEL)).padding(12.dp),
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Box(modifier = Modifier.fillMaxWidth().aspectRatio(1f)) {
                Image(
                    painter = painterResource("banner.jpg"),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize().clip(CircleShape)
                )
                Box(
                    modifier = Modifier.size(12.dp).clip(CircleShape)
                        .border(border = BorderStroke(1.dp, color = Color.White), shape = CircleShape)
                        .background(color = Color.Green).align(Alignment.BottomEnd)
                )
            }

            HoverContainer(padding = PaddingValues(top = 20.dp), onClick = {

            }) {
                Icon(
                    Icons.Default.Face,
                    contentDescription = null,
                    tint = Color(COLOR_TEXT),
                    modifier = Modifier.fillMaxWidth().aspectRatio(1f).padding(8.dp)
                )
            }

            HoverContainer(padding = PaddingValues(top = 10.dp), onClick = {

            }) {
                Icon(
                    Icons.Default.Person,
                    contentDescription = null,
                    tint = Color(COLOR_TEXT),
                    modifier = Modifier.fillMaxWidth().aspectRatio(1f).padding(8.dp)
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            HoverContainer(onClick = {

            }) {
                Icon(
                    Icons.Default.Settings,
                    contentDescription = null,
                    tint = Color(COLOR_TEXT),
                    modifier = Modifier.fillMaxWidth().aspectRatio(1f).padding(8.dp)
                )
            }
        }
    }
}