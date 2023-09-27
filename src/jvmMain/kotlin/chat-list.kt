import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import entity.ChatEntity

/**
 * chat-list
 *
 * @author : zhen51.wang
 * @date : 2023/9/27/027
 */
@Composable
fun ChatListComposable() {
    var searchText by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.width(240.dp).fillMaxHeight(),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            OutlinedTextField(modifier = Modifier.height(30.dp).weight(1f), value = searchText, leadingIcon = {
                Icon(
                    Icons.Default.Search, contentDescription = null, modifier = Modifier.size(20.dp)
                )
            }, onValueChange = { value ->
                searchText = value
            })

            HoverContainer(exitColor = Color(COLOR_PANEL), padding = PaddingValues(start = 10.dp), onClick = {

            }) {
                Icon(
                    Icons.Default.Add,
                    contentDescription = null,
                    tint = Color(COLOR_TEXT),
                    modifier = Modifier.height(30.dp).aspectRatio(1f).padding(8.dp)
                )
            }
        }

        val chats = DataRepository.provideChats()
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(chats) { data ->
                ChatItem(data)
            }
        }
    }
}

@Composable
fun ChatItem(data: ChatEntity) {
    HoverContainer(shape = RectangleShape, onClick = {}) {
        Row(
            modifier = Modifier.fillMaxWidth().padding(15.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(data.portrait), contentDescription = null,
                modifier = Modifier.size(40.dp).clip(
                    CircleShape
                ),
                contentScale = ContentScale.Crop,
            )
            Column(modifier = Modifier.padding(start = 10.dp)) {
                Row {
                    Text(
                        data.name,
                        modifier = Modifier.weight(1f),
                        fontSize = 14.sp,
                        color = Color(COLOR_TEXT),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                    )
                    Text(
                        data.date,
                        fontSize = 12.sp,
                        color = Color(COLOR_TEXT_SECONDARY),
                    )
                }
                Text(
                    data.lastContent ?: "",
                    fontSize = 12.sp,
                    color = Color(COLOR_TEXT_SECONDARY),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier.padding(top = 5.dp)
                )
            }
        }
    }
}
