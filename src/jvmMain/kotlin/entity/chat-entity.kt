package entity

/**
 * chat-entity
 *
 * @author : zhen51.wang
 * @date : 2023/9/27/027
 */
data class ChatEntity(
    val portrait: String,
    val name: String,
    val lastContent: String? = null,
    val date: String,
)
