package shop.itbug.store.model

data class BlogListModel (
    val state: Int,
    val message: String,
    val data: Data
)

data class Data (
    val page: Pager,
    val list: List<Blog>
)

data class Blog (
    val id: Long,
    val title: String,
    val content: String,
    val createTime: Long,
    val category: Category,
    val author: String,
    val thumbnail: Any? = null,
    val dateString: String,
    val tags: List<Tag>,
    val aliasString: String? = null
)


data class Category (
    val id: Long,
    val name: String,
    val logo: String,
    val intro: String,
    val createTime: Long? = null
)

data class Tag (
    val id: Long,
    val name: String
)

data class Pager (
    val total: Long,
    val currentPage: Long,
    val pageSize: Long,
    val maxPage: Long,
    val hasPrevious: Boolean,
    val paged: Boolean
)
