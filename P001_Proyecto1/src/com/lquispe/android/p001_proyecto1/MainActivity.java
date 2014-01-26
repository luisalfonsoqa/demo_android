package com.lquispe.android.p001_proyecto1;

import com.lquispe.android.proyecto1.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView tv1; 
    
    /**
     * Actividad que crea la pantalla
     */
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Editamos una vista
        tv1 = (TextView) findViewById(R.id.textView1);
        tv1.setText("Hola desde SRC");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
