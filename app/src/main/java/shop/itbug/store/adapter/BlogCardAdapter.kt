package shop.itbug.store.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import shop.itbug.store.R
import shop.itbug.store.model.Blog

class BlogCardAdapter(private val blogList: List<Blog>) : RecyclerView.Adapter<BlogCardAdapter.BlogCardViewHolder>() {

    inner class BlogCardViewHolder(view: View) : RecyclerView.ViewHolder(view){
        var blogTitle: TextView = view.findViewById(R.id.blog_title_text)
    }

    /// 视图绑定
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogCardViewHolder {
        val view  = LayoutInflater.from(parent.context).inflate(R.layout.blog_card_view,parent,false)
        return BlogCardViewHolder(view)
    }

    /// 数据绑定
    override fun onBindViewHolder(holder: BlogCardViewHolder, position: Int) {
        val blog = blogList[position]
        holder.blogTitle.text = blog.title
    }

    override fun getItemCount() = blogList.size
}