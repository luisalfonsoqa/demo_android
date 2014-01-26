package com.lquispe.android.p012_radiobutton;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class MainActivity extends Activity implements OnCheckedChangeListener{
	RadioButton rbClasica, rbMetal, rbPop, rbElectro;
	RadioGroup rg1;
	TextView tvMsj;
	
	//Variables de la informacion
	String clasica = "Clasica: Se supone que esta musica aumenta las hormonas";
	String metal = "Metal: Se supone que esta musica aumenta las hormonas";
	String pop = "Pop la Clasica: Se supone que esta musica aumenta las hormonas";
	String electro = "Electronica: Se supone que esta musica aumenta las hormonas";
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		rbClasica = (RadioButton) findViewById(R.id.rbClasica);
		rbMetal = (RadioButton) findViewById(R.id.rbMetal);
		rbPop = (RadioButton) findViewById(R.id.rbPop);
		rbElectro = (RadioButton) findViewById(R.id.rbElectro);
		rg1 = (RadioGroup) findViewById(R.id.rg1);
		tvMsj = (TextView) findViewById(R.id.tvMsj);
		
		//Solo se asigna el lister al radio Group y no a los radio buttons
		rg1.setOnCheckedChangeListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		if(rbClasica.isChecked()){
			tvMsj.setText(clasica);
			tvMsj.setTextColor(Color.LTGRAY);
		} 
		if(rbMetal.isChecked()){
			tvMsj.setText(metal);
			tvMsj.setTextColor(Color.BLACK);
		} 
	
		if(rbPop.isChecked()){
			tvMsj.setText(pop);
			tvMsj.setTextColor(Color.GREEN);
		} 
	
		if(rbElectro.isChecked()){
			tvMsj.setText(electro);
			tvMsj.setTextColor(Color.BLUE);
		} 

	}
}

