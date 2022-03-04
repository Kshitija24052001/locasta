package aavidsoft.localinstagram

import android.app.AlertDialog
import android.app.Instrumentation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import aavidsoft.localinstagram.R.id as id1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.logout_menu, menu)
            return true
        }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menuItemoLogout ->{
                var builder = AlertDialog.Builder(this)
                builder.setTitle("AlertDialog!")
                builder.setMessage("You want to logout?")

                builder.setPositiveButton("Yes")
                { dialoginterface, which ->
                    Toast.makeText(
                        applicationContext,
                        "The App will be logout now",
                        Toast.LENGTH_LONG
                    ).show()
                    finish()
                }
                builder.setNegativeButton("No")
                { dialoginterface, which ->
                    Toast.makeText(
                        applicationContext,
                        "You Stop The Logout Process",
                        Toast.LENGTH_LONG
                    ).show()
                }
                builder.show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}























