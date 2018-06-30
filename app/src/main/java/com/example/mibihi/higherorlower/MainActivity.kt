package com.example.mibihi.higherorlower

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
  var rnd:Int=0
  //val tops:Int=20
  var hint:String=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        generaternd()

        btnGuess.setOnClickListener {
            println("guess clicked")
            var guess:Int  = etxtguessnum.text.toString().toInt()
            println("guess is ==="+guess)
            println("rnd ==="+rnd)


            when {
                (guess>rnd) -> hint="Lower"
                (guess<rnd) -> hint="Higher"
                else -> {hint="YOU Matched IT!!!"
                    generaternd()

                }



            }
              etxtguessnum.text.clear()
              Toast.makeText(this, hint, Toast.LENGTH_SHORT).show()




        }

    }
    fun generaternd(){
        println("from generate")
        rnd = Random().nextInt( 20)+1

    }
}
