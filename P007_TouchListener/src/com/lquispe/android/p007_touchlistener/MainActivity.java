package com.lquispe.android.p007_touchlistener;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnTouchListener{
	TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		tv1 = (TextView) findViewById(R.id.tv1);
		tv1.setOnTouchListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		// Mientras esta tocando
		if(event.getAction() == MotionEvent.ACTION_DOWN){
			tv1.setText("Deja de tocarme!");
		}
		//Intenta mover el textView
		if(event.getAction() == MotionEvent.ACTION_MOVE){
			tv1.setText("Dejame quieto!");
		}
		
		//Cuando deja de tocar
		if(event.getAction() == MotionEvent.ACTION_UP){
			tv1.setText("Ufff.. por fin me hiciste caso.");
		}
		//return false; //Para que se ejecute una sola vez
		
		return true; //Se ejecuta mas de una vez.
	}

}
