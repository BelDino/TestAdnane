package com.example.androidpremiereformation;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MadeuxiemeActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_2);
		TextView textview = (TextView) findViewById(R.id.mytextview_activity2);
		String machainerecupere = getIntent().getStringExtra("KEY");
		textview.setText(machainerecupere);
	
		
	
	}

}
