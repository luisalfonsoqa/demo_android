package com.lquispe.android.p010_imagenes;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener {
	Button btnCambiar;
	ImageView ivLogo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btnCambiar = (Button) findViewById(R.id.btnCambiar);
		ivLogo = (ImageView) findViewById(R.id.ivLogo);
		
		btnCambiar.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		//Set imagen en tiempo de ejecucion
		ivLogo.setImageResource(R.drawable.ic_launcher);
	}


}
