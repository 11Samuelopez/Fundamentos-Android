package com.example.android.adapters

import android.location.GnssAntennaInfo
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ViewGroup
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import com.example.android.R
import com.example.android.models.Friend
import com.example.android.models.Friends
import io.keepcoding.android.domain.models.Friend
import io.keepcoding.android.domain.models.Friends
import org.w3c.dom.Text

public interface  ItemClickListener {
    fun onItemClickListener(position: Int)
}

class FriendsListAdapter(private val items: Friends,
                        private val listener: ItemClickListener? = null) :
    RecyclerView.Adapter<FriendsListAdapter.FriendsListViewHolder>(){


    class FriendsListViewHolder(private val items: Friends)

        val view = null
        private val friendImageView = view.findViewById<ImageView>(R.id.ivFriend)
        private val friendTextView = view.findViewById<TextView>(R.id.ivFriendName)
        private val friendLastNameTextView = view.findViewById<TextView>(R.id.ivFriendLastName)
        private val friendScoreTextView = view.findViewById<TextView>(R.id.ivFriendScore)

        fun updateViews(item: Friend) {
            view.setOnClickListener {
                listener?.onItemClickListener()
            }


            friendTextView.text = item.name
            friendLastNameTextView.text = item.lastname
            friendScoreTextView.text = "${item.score}"

            with(view.context) {
                val imageDrawableId = resources.getIdentifier(item.image, defType: "drawable", packageName)

                friendImageView.setImageDrawable(
                    AppCompatResources.getDrawable(this, imageDrawableId))

            }
        }
    }

    override  fun getItemCount(): Int {
        val items = null
        return items.size

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendsListViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.row_friend_list,parent , false)

        return FriendsListViewHolder(itemView,GnssAntennaInfo.Listener)

    }

    override  fun onBindViewHolder(holder: FriendsListViewHolder, position : Int) {
        val items = null
        holder.updateViews(items[position])

    }
}