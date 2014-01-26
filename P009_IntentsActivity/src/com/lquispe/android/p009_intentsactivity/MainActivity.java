package com.lquispe.android.p009_intentsactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener{
	EditText etNombre, etPaswd;
	Button btnIngresar, btnBorrar;
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		etNombre = (EditText) findViewById(R.id.etNombre);
		etPaswd = (EditText) findViewById(R.id.etPaswd);
		btnIngresar = (Button) findViewById(R.id.btnIngresar);
		btnBorrar = (Button) findViewById(R.id.btnBorrar);
		
		btnIngresar.setOnClickListener(this);
		btnBorrar.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.btnIngresar:
			String nombre = etNombre.getText().toString();
			String paswd = etPaswd.getText().toString();
			if(nombre.equals("Salvador") && paswd.equals("123")){
				//Mostrar pantalla - Actividad				
				Intent int1 = new Intent("com.lquispe.android.p009_intentsactivity.Actividad2");

				//Preparamos el bundle - "bolsa" 
				Bundle bolsa = new Bundle();
				bolsa.putString("nombreKey", nombre);
				//Enviamos el bundle
				int1.putExtras(bolsa);
				
				startActivity(int1);
			} else {
				Toast t = Toast.makeText(this, "Error vuelva a intentarlo.", Toast.LENGTH_SHORT);
				t.show();
			}
			break;
		case R.id.btnBorrar:
			etNombre.setText("");
			etPaswd.setText("");
			break;
		}
	}


}
