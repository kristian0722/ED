package org.institutoserpis.proyectoandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mati on 25/05/17.
 */

public class Displaymessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_message);

        //  getIntent().getStringExtra("MESSAGE");
        ViewGroup layout = (ViewGroup) findViewById(R.id.display_message);

        TextView textView= new TextView(this);
        textView.setTextSize(1000);
        textView.setText("Multiplica por 3,sumale 15,multiplica por 2 ,divide por 6 y restale el numero inical.El resultado es 5!!!");
        layout.addView(textView);
    }
}
