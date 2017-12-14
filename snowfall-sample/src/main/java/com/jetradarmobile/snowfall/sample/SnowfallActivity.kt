package com.jetradarmobile.snowfall.sample

import android.app.Activity
import android.os.Bundle
import com.jetradarmobile.snowfall.SnowfallView

class SnowfallActivity : Activity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_snowfall)
    findViewById(R.id.snowflakes).setOnClickListener {
        (it as SnowfallView).terminateSnow = !it.terminateSnow
    }
  }
}