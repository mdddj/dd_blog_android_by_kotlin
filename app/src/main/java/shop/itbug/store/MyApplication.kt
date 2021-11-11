package shop.itbug.store

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class MyApplication : Application() {

    companion object {

        //移除内存泄露的警告
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }

}