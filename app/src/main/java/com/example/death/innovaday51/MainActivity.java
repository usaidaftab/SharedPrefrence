package com.example.death.innovaday51;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button save;
    EditText name;
    SharedPreferences shared;
    SharedPreferences.Editor editor;
    String prefname="innova";
    String Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        save=(Button)findViewById(R.id.button);
        name=(EditText) findViewById(R.id.editText);
        shared=getSharedPreferences(prefname,MODE_PRIVATE);
        editor=shared.edit();
        name.setText(shared.getString(Name,""));

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String n = name.getText().toString();
                editor.putString(Name, n);
                editor.commit();
            }
        });


    }
}