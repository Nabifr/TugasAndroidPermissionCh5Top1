package com.android.androidpermissionch5top1

import android.content.Context
import android.net.wifi.WifiManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.android.androidpermissionch5top1.databinding.ActivityWifiBinding

@Suppress("DEPRECATION")
class WifiActivity : AppCompatActivity() {
    lateinit var binding : ActivityWifiBinding
    lateinit var wifiManager: WifiManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWifiBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.buttOn.setOnClickListener{
            enableWifi()
        }

        binding.buttOff.setOnClickListener{
            disableWifi()
        }


    }
    fun enableWifi() {
        val wifiManager = getSystemService(Context.WIFI_SERVICE) as WifiManager
        wifiManager.isWifiEnabled = true
        Toast.makeText(this, "Wifi enabled", Toast.LENGTH_SHORT).show()
    }
    fun disableWifi() {
        val wifiManager = getSystemService(Context.WIFI_SERVICE) as WifiManager
        wifiManager.isWifiEnabled = false
        Toast.makeText(this, "Wifi disabled", Toast.LENGTH_SHORT).show()
    }
}