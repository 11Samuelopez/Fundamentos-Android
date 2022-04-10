package com.example.android.repositories

import com.example.android.models.Friend
import com.example.android.models.Friends

object FriendRepository {
    var friendsSample: Friends
        get() {

            val name = ""
            val lastname = ""
            val image = ""
            val score = ""

            return arrayListOf(
                Friend( name:"Capitan",
                        lastname:"America",
                        image:"Capi.jpeg",
                        score:10.0f),



                Friend(  name:"Spider",
                         lastname:"Man",
                         image:"Spiderman.jpeg",
                         score:9.5f),


                Friend(  name:"Pantera",
                         lastname:"Negra",
                         image:"Pantera Negra.jpeg",
                         score:9.2f),


                Friend( name:"Hulk",
                        lastname:"Hulk",
                        image:"Hulk.jpeg",
                        score:8.0f),


                Friend( name:"Bruja",
                        lastname:"Escarlata",
                        image:"Bruja.jpeg",
                        score:9.3f),


                Friend( name:"Mapache",
                        lastname:"Cohete",
                        image:"Mapache.jpeg",
                        score:8.7f),

            )
        }

}