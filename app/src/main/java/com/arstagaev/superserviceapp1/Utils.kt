package com.arstagaev.superserviceapp1

import android.util.Log

fun log(msg: String) {
    Log.d("ENDLESS-SERVICE", msg)
}
class Utils {
    companion object{
        const val BASE_URL = "http://ips.itelma.su:8080/qpe/"
        const val NAME_OF_HOLDER = "Alex Sokolov"

        const val MINIMAL_DISTANCE = 6F
    }
}
