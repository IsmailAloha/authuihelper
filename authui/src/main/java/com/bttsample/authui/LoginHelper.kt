package com.bttsample.authui

import android.content.Context
import android.content.Intent

object LoginHelper {

    fun launchLoginActivity(context:Context) {
        context.startActivity(Intent(context, LoginActivity::class.java))
    }

}