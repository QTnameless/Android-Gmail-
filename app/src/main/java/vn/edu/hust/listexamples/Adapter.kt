package vn.edu.hust.listexamples

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class Adapter {
    class Main : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.main)

            val listView = findViewById<ListView>(R.id.listView)

            // Create a list of item data (YourItemModel) here
            val items = mutableListOf<YourItemModel>()

            // Create a custom adapter and set it to the ListView
            val adapter = CustomAdapter(this, items)
            listView.adapter = adapter
        }
    }

}