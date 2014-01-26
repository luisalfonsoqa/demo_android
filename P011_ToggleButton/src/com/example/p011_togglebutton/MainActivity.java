package com.example.p011_togglebutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements OnCheckedChangeListener{
	ToggleButton tb1;
	ImageView iv1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tb1 = (ToggleButton) findViewById(R.id.tb1);
		iv1 = (ImageView) findViewById(R.id.iv1);
		
		tb1.setOnCheckedChangeListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if(tb1.isChecked()){
			iv1.setImageResource(R.drawable.imagen2);
		} else {
			iv1.setImageResource(R.drawable.imagen1);
		}
	}

}
