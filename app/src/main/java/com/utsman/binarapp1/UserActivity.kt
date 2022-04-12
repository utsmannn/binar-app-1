package com.utsman.binarapp1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.utsman.binarapp1.data.Address
import com.utsman.binarapp1.data.User

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val tvUser: TextView = findViewById(R.id.tv_user)

        /* ini cara ngambil bundle */
        /*val bundle = intent.extras
        val name = bundle?.getString("user")
        tvUser.text = name*/

        /* ini cara ngambil serializable */
        /*val user = intent.getSerializableExtra("user") as User // ini disebut casting
        val name = user.name
        val age = user.age

        tvUser.text = "nama: $name, umur: $age"*/

        /* ini cara ngambil serializable hasmap */
        val user = intent.getSerializableExtra("map_data") as HashMap<String, Any> // ini disebut casting
        val name = user.getValue("name") as String
        val age = user.getValue("age") as Int

        tvUser.text = "nama: $name, umur: $age"

        /* ini cara ngambil parcel */
        /*val address = intent.getParcelableExtra<Address>("address")
        val city = address?.city
        tvUser.text = city*/

        /* ini cara ngambil parcel list */
        /*val address = intent.getParcelableArrayListExtra<Address>("addresses")
        val city = address?.map { add -> add.city }
        tvUser.text = city.toString()*/
    }
}