package net.madran.bby261.kotlinactivity

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //EXTRA_MESSAGE String
    companion object {
        const val EXTRA_MESSAGE: String = "net.madran.bby261.kotlinactivity.MESSAGE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button  */
    fun sendMessage(view: View) {
        // Toast Message
        Toast.makeText(this@MainActivity, "Butona Tıklandı..!", Toast.LENGTH_SHORT).show();
        // Intent
        val intent = Intent(this, DisplayMessageActivity::class.java)
        val editText = findViewById<View>(R.id.editText) as EditText
        val message = editText.text.toString()
        intent.putExtra(EXTRA_MESSAGE, message)
        startActivity(intent)
    }

}