package com.lquispe.android.p006_keylistener;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity{
	EditText et1;
	TextView tv1;
	int cant = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et1= (EditText) findViewById(R.id.et1);
		tv1= (TextView) findViewById(R.id.tv1);
		
		/**
		 * Otro Listener, solo para este listener
		 */
		et1.setOnKeyListener(new OnKeyListener() {
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				//Si la accion es: presiono cualquier tecla hacia abajo
				if(event.getAction() == KeyEvent.ACTION_DOWN){
					//tecla menu
					if(keyCode == KeyEvent.KEYCODE_MENU){
						cant++;
						if(cant == 1){
							tv1.setText("Nada que mostrar, siga digitando.");
						} else {
							cant=0;
							tv1.setText("");
						}
					}
					return true;
				}
				return false;
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
