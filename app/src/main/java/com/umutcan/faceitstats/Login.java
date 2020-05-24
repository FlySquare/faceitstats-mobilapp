package com.umutcan.faceitstats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    Button loginbtn;
    EditText username;
    SharedPreferences webinyoPref;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        webinyoPref = getApplicationContext().getSharedPreferences("VeriSakla", MODE_PRIVATE);
        editor = webinyoPref.edit();


        String myString = webinyoPref.getString("editPref", "N/A");
        if(myString != null){
            Intent intent = new Intent(Login.this,MainActivity.class);
            startActivity(intent);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = (EditText) findViewById(R.id.usernamef);
        loginbtn = (Button) findViewById(R.id.loginbutton);
       loginbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               // EDİTTEXT'E GİRİLEN DEĞERİ ALDIK
               String girilenVeri = username.getText().toString();
               // GİRİLEN DEĞERİ editPref isimli SHAREDPREF DEĞİŞKENİNE ATADIK
               editor.putString("editPref", girilenVeri);
               editor.commit();
               Intent intent = new Intent(Login.this,MainActivity.class);
               startActivity(intent);
           }
       });
    }
}
