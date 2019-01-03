package com.zlobrynya.testkotlin.tools

import android.content.Context
import android.os.AsyncTask;
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.util.AttributeSet
import android.widget.ImageView
import java.net.URL

class WeatherImageView(context: Context?, attrs: AttributeSet?) : ImageView(context, attrs) {

    fun loadImage(url: String){
        DownloadImageURL().execute(url)
    }

    inner private class DownloadImageURL: AsyncTask<String, Void, Bitmap>() {
        lateinit var bitmap: Bitmap;

        override fun doInBackground(vararg p0: String?): Bitmap {
            val url = URL(p0[0])
            bitmap = BitmapFactory.decodeStream(url.openStream())
            return bitmap
        }

        override fun onPostExecute(result: Bitmap?) {
            setImageBitmap(result)
        }
    }

}