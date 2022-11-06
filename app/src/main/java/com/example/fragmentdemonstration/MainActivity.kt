package com.example.fragmentdemonstration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(),
    ListFragment.OnFragmentSendDataListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onSendData(selectedItem: String?) {
        val fragment = supportFragmentManager.findFragmentById(R.id.detailFragment) as DetailFragment?
        fragment?.setSelectedItem(selectedItem)
    }
}
