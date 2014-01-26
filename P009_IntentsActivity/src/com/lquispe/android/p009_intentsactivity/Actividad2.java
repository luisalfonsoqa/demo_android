package com.lquispe.android.p009_intentsactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Actividad2 extends Activity{
	TextView tvUsuario;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//asignamos el layout
		setContentView(R.layout.actividad2);
		tvUsuario = (TextView) findViewById(R.id.tvUsuario);
		//Obtener el objeto bundle
		Bundle bolsa = getIntent().getExtras();
		tvUsuario.setText(bolsa.getString("nombreKey"));
	}

}
