package org.institutoserpis.proyectoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class ProyectoMain extends AppCompatActivity {
   public final static String EXTRA_MESSAGE = "org.institutoserpis.proyectoandorid.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto_main);
    }
    public void next(View view){
        //Toast toast=Toast.makeText(this,"has hecho click",Toast.LENGTH_LONG).show();
        Log.i("ProyectoMain", "in the method next");
       EditText editText = (EditText) findViewById(R.id.edit_message);
        Intent intent=new Intent(this,Displaymessage.class);
       intent.putExtra(EXTRA_MESSAGE,editText.getText().toString());
        startActivity(intent);
    }
}
