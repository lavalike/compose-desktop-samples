import entity.ChatEntity

/**
 * data-repository
 *
 * @author : zhen51.wang
 * @date : 2023/9/27/027
 */
object DataRepository {
    fun provideChats() = listOf(
        ChatEntity(
            portrait = "banner.jpg",
            name = "路人乙",
            lastContent = "https://www.gitee.com/lavalike",
            date = "昨天",
        ),
        ChatEntity(
            portrait = "banner.jpg",
            name = "小星星",
            date = "2020/02/23",
        ),
        ChatEntity(
            portrait = "banner.jpg",
            name = "大象联网圈",
            lastContent = "北京，郑州~前端开发：心动了",
            date = "昨天",
        ),
        ChatEntity(
            portrait = "banner.jpg",
            name = "进击的攻城狮",
            lastContent = "Android: [动画表情]",
            date = "2023/07/07",
        ),
    )
}