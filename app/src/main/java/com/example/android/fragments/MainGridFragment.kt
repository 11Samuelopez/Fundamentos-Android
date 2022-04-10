package com.example.android.fragments

import android.content.Intent
import android.os.Bundle
import android.provider.Contacts.SettingsColumns.KEY
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.R
import com.example.android.activities.DetailActivity
import com.example.android.adapters.FriendsAdapter
import com.example.android.adapters.FriendsListAdapter
import com.example.android.adapters.ItemClickListener
import com.example.android.models.Friend
import com.example.android.models.Friends
import com.example.android.repositories.FriendRepository


/**
 * A simple [Fragment] subclass.
 * Use the [MainGridFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainGridFragment : Fragment() {

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         */

        @JvmStatic
        fun newInstance() =
            MainListFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }


    private lateinit var recyclerView: RecyclerView
    private var friends: Friends? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_grid, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         */

        @JvmStatic
        fun newInstance() =
            MainGridFragment().apply {
                arguments = Bundle().apply {

                }

            }
    }

    private val itemClickListener = object : ItemClickListener {
        override fun onItemClickListener(item: Friend) {
            startActivity(
                Intent(activity, DetailActivity::class.java).apply {
                    putExtra(KEY, item)
                }
            )
        }

    }

    override fun onViewCreated(view: View,savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        configureViews(view)
    }

    private fun configureViews(view: View) {

        recyclerView = view.findViewByid< RecyclerView(R.id.GridRecyclerView).apply {
            layoutManager = GridLayoutManager(activity)
            adapter = FriendsAdapter(
                friends ?: arrayListOf()
                itemClickListener)
        }
    }

    /*************** Data **********/
    private fun loadData() {
        friends = FriendRepository.friendsSample
    }
}