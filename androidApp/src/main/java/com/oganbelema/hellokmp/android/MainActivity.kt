package com.oganbelema.hellokmp.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oganbelema.hellokmp.Greeting
import android.widget.TextView
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch

suspend fun greet(): String {
    return Greeting().greeting()
}

class MainActivity : AppCompatActivity() {

    private val scope = MainScope()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv: TextView = findViewById(R.id.text_view)
        tv.text = "Loading..."

        scope.launch {
            kotlin.runCatching {
                greet()
            }.onSuccess {
                tv.text = it
            }.onFailure {
                tv.text = it.localizedMessage
            }

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        scope.cancel()
    }
}
