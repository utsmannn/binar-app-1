package com.utsman.binarapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.os.bundleOf
import com.utsman.binarapp1.data.Address
import com.utsman.binarapp1.data.User

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        println("binar chat -------> oncreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        /* ini bundle biasa */
        val bundle = intent.extras
        val name = bundle?.getString("name")
        val textView: TextView = findViewById(R.id.tv_chat)
        textView.text = name

        textView.setOnClickListener {
            val intent = Intent(this, UserActivity::class.java)
            bundle?.let { intent.putExtras(it) }
            startActivity(intent)
        }


        /* ini bundle biasa dengan edit text */
        val editTextUser: EditText = findViewById(R.id.edittext_chat_username)
        val btnOk: Button = findViewById(R.id.btn_ok)

        /*btnOk.setOnClickListener {
            val user = editTextUser.text.toString()
            val intent = Intent(this, UserActivity::class.java)
            val usernameBundle = bundleOf("user" to user)
            intent.putExtras(usernameBundle)
            startActivity(intent)
        }*/


        //val user = User("Fahri", 20)
        btnOk.setOnClickListener {

            /* ini serializable */
            /*val username = editTextUser.text.toString()
            val user = User(username, 20)
            val intent = Intent(this, UserActivity::class.java)
            intent.putExtra("user", user)
            startActivity(intent)*/

            /* ini serializable map */
            /*val username = editTextUser.text.toString()
            val map = hashMapOf(
                "name" to username,
                "age" to 12
            )
            val intent = Intent(this, UserActivity::class.java)
            intent.putExtra("map_data", map)
            startActivity(intent)*/

            /* ini parcelize */
            /*val city = editTextUser.text.toString()
            val address = Address(city, "depok")
            val intent = Intent(this, UserActivity::class.java)
            intent.putExtra("address", address)
            startActivity(intent)*/

            /* ini parcelize array */
            /*val address1 = Address("tangerang", "jawa barat")
            val address2 = Address("depok", "jawa barat")
            val addressList = arrayListOf(address1, address2)
            val intent = Intent(this, UserActivity::class.java)
            intent.putParcelableArrayListExtra("addresses", addressList)
            startActivity(intent)*/


            val textSend = editTextUser.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, textSend)

            /* ini cara lama */
            /*val resolverActivity = intent.resolveActivity(packageManager)
            if (resolverActivity != null) {
                startActivity(intent)
            }*/

            /* cara baru */
            val sharedIntent = Intent.createChooser(intent, "kirim text")
            startActivity(sharedIntent)
        }
    }

    override fun onStart() {
        super.onStart()
        println("binar chat -------> onstart")
    }

    override fun onResume() {
        super.onResume()
        println("binar chat -------> onresume")
    }

    override fun onPause() {
        super.onPause()
        println("binar chat -------> onpause")
    }

    override fun onStop() {
        super.onStop()
        println("binar chat -------> onstop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("binar chat -------> ondestroy")
    }

    override fun onBackPressed() {
        super.onBackPressed()
    }
}