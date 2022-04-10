package com.example.android.adapters

import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import com.example.android.models.Friend
import com.example.android.models.Friends


class FriendsAdapter (private var items: Friends
                        private val listener: ItemClickListener? = null) :
    RecyclerView.Adapter<FriendsAdapter.FriendsViewHolder>() {

    class FriendsViewHolder(private val view: View ,
                           private val listener: ItemClickListener? = null ) : RecyclerView

        private var friendImageView =
            .findViewById<>(ImageView)(R.id.ivFriend)
        private  var friendNameTextView =
            .findViewById<TextView>(R.id.tvFriendName)


        fun updateViews(item: Friend) {

            .setOnClickListener { listener?.onItemClickListener() }

            with(view.context) {
                this:Context!
                val imageDrawableId =
                    resources.getIdentifier(item.image, defType: "drawable", packageName)

                friendImageView.setImageDrawable(
                    AppCompatResources.getDrawable(context: this, imageDrawableId))

            }


        friendNameTextView.text = item.name
    }

    private fun setOnClickListener(function: () -> Unit?) {

    }

    private fun witch(context: Any, any: Any) {
            TODO("Not yet implemented")
        }

        fun updateView(friend: Friend) {

        }
    }

    fun tableView(_ tableView: UITableView, numberOfRowsInSection section: Int) {} -> Int {
        val friends = null
        return friends.count
    }

    override fun getItemCount(): Int {
        val items = null
        return items.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendsAdapter.FriendsViewHolder {
        val layoutInflater = null
        val attachToRoot = null
        val itemView = layoutInflater.from(parent.context).inflate(R.layout.row_friend, parent , attachToRoot: false)
        val listener = null
        return FriendsAdapter.FriendsViewHolder(itemView, listener)
    }

    override fun onBindViewHolder(holder: FriendsAdapter.
                                  , position: Int) {
        holder.updateView(
            [position])
    }
}