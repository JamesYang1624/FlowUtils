package com.yangwz.flowutils

import android.util.Log


/**
 * @author : yangweizheng
 * @date : 2022/4/7 11:25
 */
object LogUtils {
    val TAG = "LogUtils"
    fun i(s: String) {
        Log.i(TAG, ": $s")
    }
}