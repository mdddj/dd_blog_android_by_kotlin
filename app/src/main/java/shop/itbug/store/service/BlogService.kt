package shop.itbug.store.service

import shop.itbug.store.util.BaseApiServiceCreate
import retrofit2.http.GET
import retrofit2.http.Query
import shop.itbug.store.model.BlogListModel

// 博客的相关请求接口
interface BlogService {


    /**
     * 加载博客列表
     * 默认排序为发表时间，也就是最新发布的在最前面
     * @param page 第几页，从第一页开始
     * @param pageSize 每页几条数据
     */
    @GET("api/blog/list")
    suspend fun getBlogList(@Query("page")page: Int,@Query("pageSize")pageSize: Int) : BlogListModel

    companion object {
        private val blogService: BlogService? = null
        fun getInstance() : BlogService {
            return blogService ?: BaseApiServiceCreate.create(BlogService::class.java)
        }
    }

}