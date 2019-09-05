package com.ritika.agecalc

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
    fun buClick(view:View)
    {
        val buSel=view as Button

        var buVal:String=etShow.text.toString()

        when(buSel.id)
        {
            button2.id->
            {
                buVal+="-"+buVal

            }
            button5.id->
            {
                buVal+="7"

            }
            button6.id->
            {
                buVal+="8"

            }
            button7.id->
            {
                buVal+="9"

            }
            button9.id->
            {
                buVal+="4"

            }
            button10.id->
            {
                buVal+="5"

            }
            button11.id->
            {
                buVal+="6"

            }
            button13.id->
            {
                buVal+="1"

            }
            button14.id->
            {
                buVal+="2"

            }
            button15.id->
            {
                buVal+="3"

            }
            button17.id->
            {
                buVal+="0"

            }
            button18.id->
            {
                buVal+="."

            }

        }
        etShow.setText(buVal)
    }


}
