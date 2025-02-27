package org.mingy.gost

import android.content.Context
import java.io.File

object Commons {

    fun getDir(context: Context): File {
        return File(context.filesDir, "config")
    }
}
