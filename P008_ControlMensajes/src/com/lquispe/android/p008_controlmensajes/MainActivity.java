package com.lquispe.android.p008_controlmensajes;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnTouchListener {
	TextView tvWeb, tvTutor, tvApp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tvWeb = (TextView) findViewById(R.id.tvWeb);
		tvTutor = (TextView) findViewById(R.id.tvTutor);
		tvApp = (TextView) findViewById(R.id.tvApp);
		
		tvWeb.setOnTouchListener(this);
		tvTutor.setOnTouchListener(this);
		tvApp.setOnTouchListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		//Vista: id
		//MontioEven: el evento
		switch (v.getId()) {
		case R.id.tvWeb:
			//Se lanza y se desavanece segun el tiempo : Toast.LENGTH_LONG
			Toast t = Toast.makeText(this, "Visitanos en la web", Toast.LENGTH_LONG);
			t.show();//Mostrar
			break;
		case R.id.tvTutor:
			//Cuadro de diablo con layout
			Dialog d = new Dialog(this);
			d.setTitle("Valóranos");
			d.setContentView(R.layout.mensaje);
			d.show();//Mostrar
			break;
		case R.id.tvApp:
			tvApp.setText("Ahora te gusta nuestra App.");
			tvApp.setTextColor(Color.BLUE);
			break;
		default:
			break;
		}
		return true;
	}

}
