package com.example.test_android

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtContent =findViewById<TextView>(R.id.txtContent);
        var helper = MydbHelper(applicationContext)
        val db = helper.readableDatabase
        var rs = db.rawQuery("SELECT * FROM JOKES", null);

        val btnLike =findViewById<Button>(R.id.btnLike);
        val btnDisLike = findViewById<Button>(R.id.btndDslike);
        var vote = true;

        if(rs.moveToFirst()){
            txtContent.setText(rs.getString(1));
        }

        btnLike.setOnClickListener {
            if(rs.isLast()){
                Toast.makeText(this, "That's all the jokes for today! Come back another day!", Toast.LENGTH_LONG).show();
            }else{
                rs.moveToNext();
                txtContent.setText(rs.getString(1));
            }
        }

        btnDisLike.setOnClickListener {
            if(rs.isLast()){
                Toast.makeText(this, "That's all the jokes for today! Come back another day!", Toast.LENGTH_LONG).show();
            }else{
                rs.moveToNext();
                txtContent.setText(rs.getString(1));
            }
        }
    }
}