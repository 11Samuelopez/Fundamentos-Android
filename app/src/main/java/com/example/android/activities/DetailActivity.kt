package com.example.android.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.content.res.AppCompatResources
import com.example.android.R
import com.example.android.models.Friend

class DetailActivity : AppCompatActivity() {

    private lateinit var friendImageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        configureViews()
        updateViews()
    }

    private fun updateViews() {

    }

    private fun configureViews(){
        friendImageView = findViewById(R.id.ivFriend)
    }

    private fun update(friend: Friend) {
        val defType = null
        val imageDrawableId = resources.getIdentifier(friend.image, defType: "drawable", packageName)

        val context = null
        friendImageView.setImageDrawable(
            AppCompatResources.getDrawable(context: this, imageDrawableId))

    }

}

