package shop.itbug.store.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.google.gson.JsonObject
import com.google.gson.JsonParser
import kotlinx.coroutines.launch
import shop.itbug.store.model.Blog
import shop.itbug.store.model.BlogListModel
import shop.itbug.store.service.BlogService
import java.util.logging.Logger

class HomeViewModel : ViewModel() {


    //博客列表
    private val _blogList = MutableLiveData<List<Blog>>().apply {
        value = emptyList()
    }
    val blogList : LiveData<List<Blog>> = _blogList



    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment"
    }
    val text: LiveData<String> = _text

    fun fetchBlogList() {
        viewModelScope.launch {
            val result = BlogService.getInstance().getBlogList(1, 20)
            if (result.state == 200 && result.data.list.isNotEmpty()) {
                _blogList.postValue(result.data.list)
            }
        }
    }
}