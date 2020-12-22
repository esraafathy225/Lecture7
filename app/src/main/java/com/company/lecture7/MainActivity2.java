package com.company.lecture7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        checkBox=findViewById(R.id.checkbox);

        /*checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox.isChecked())
                    Toast.makeText(MainActivity2.this,"Checked",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity2.this,"UnChecked",Toast.LENGTH_SHORT).show();

            }
        });*/

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(MainActivity2.this,"Checked",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity2.this,"UnChecked",Toast.LENGTH_SHORT).show();

            }
        });

    }
}