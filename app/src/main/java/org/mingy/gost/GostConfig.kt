package org.mingy.gost

import android.content.Context
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.File

@Parcelize
data class GostConfig(
    val fileName: String,
) : Parcelable {
    override fun toString(): String {
        return "$fileName"
    }

    fun getFile(context: Context): File {
        return File(Commons.getDir(context), this.fileName)
    }
}
