package com.example.deepakkushwaha.checkit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ImageView;
import android.webkit.WebView;
import android.content.Intent;

import java.net.URL;

public class MainActivity  extends AppCompatActivity {
        CheckBox Panner, Pyaz;
        EditText text;
    ImageView imageView;
    



        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                Panner = (CheckBox) findViewById(R.id.checkBox);
                Pyaz = (CheckBox) findViewById(R.id.checkBox2);
                text = (EditText) findViewById(R.id.editText2);
            imageView=(ImageView)findViewById(R.id.imageView);
                addListnerOnButton();


        }

        public void onButtonClick(View view) {
            int level=0;
                StringBuilder str = new StringBuilder("");
                if (Panner.isChecked()) {
                        str.append("Paneer Kucha(1 plate)");
                        level +=1;

                }
                if (Pyaz.isChecked()) {
                        str.append("Pyaz Kulcha(1 plate)");
                        level +=2;
                }
                if (str.length() == 0) {
                        str.append("no order");
                        level +=3;

                }
                if (Panner.isChecked() & Pyaz.isChecked()) {
                        str.append("Enjoy free coke");
                    level +=4;

                }


                text.setText(str);
             imageView.setImageLevel(level);
        }




        public void addListnerOnButton() {
                Panner = (CheckBox) findViewById(R.id.checkBox);
                Pyaz = (CheckBox) findViewById(R.id.checkBox2);
                Panner.setOnClickListener(
                        new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                        Toast.makeText(MainActivity.this, Panner.getText(), Toast.LENGTH_SHORT).show();
                                }
                        }
                );

                Pyaz.setOnClickListener(
                        new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                        Toast.makeText(MainActivity.this, Pyaz.getText(), Toast.LENGTH_SHORT).show();
                                }
                        }
                );

        }

}







