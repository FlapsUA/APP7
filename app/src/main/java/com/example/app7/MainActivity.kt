package com.example.app7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.example.app7.databinding.ActivityMainBinding
import com.example.app7.databinding.MenuBinding

class MainActivity : AppCompatActivity() {
lateinit var  bindAM : ActivityMainBinding
lateinit var bindMenu : MenuBinding
   lateinit var ct : TextView
   var pidor = 0
var c1 = 12
    var c2 = 13

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindAM = ActivityMainBinding.inflate(layoutInflater)
        bindMenu = MenuBinding.inflate(layoutInflater)
        setContentView(bindAM.root)
        Log.d("DMA", "onCreate")
        Log.d("DMA", "onCreate2")
    }

    override fun onStart() {
        super.onStart()

        Log.d("DMA", "onStart")


    }

    override fun onResume() {
        super.onResume()





        Log.d("DMA", "onResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("DMA", "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.d("DMA", "onStop")


    }

    override fun onRestart() {
        super.onRestart()
        Log.d("DMA", "onRestart")








    }



    fun  clickmenu(view: View){

        setContentView(bindMenu.root)

    }



    fun clickMS(view : View) {
        setContentView(bindAM.root)
        bindAM.tp.text = if(pidor == 1) {
            "Только пидор выберет Агентоса"
        }
        else{
            "Ты Красава бро"
        }

    }
    fun pressb(view: View){
        val ct = bindMenu.testtext
        ct.text = "MS Круто"
        pidor = 0
    }
 fun AgentosBC(view: View){

     val ct = bindMenu.testtext
     ct.text = "СОСАТЬ!!!"
     pidor = 1
 }

    override fun onDestroy() {
        super.onDestroy()

        Log.d("DMA", "onDestroy")


    }



}