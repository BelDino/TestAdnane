package com.example.androidpremiereformation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		TextView mytextview = (TextView) findViewById(R.id.MonTextView);
		Button mybutton = (Button) findViewById(R.id.mainbutton);
		final EditText myedittext = (EditText) findViewById(R.id.mainedittext);
		
		mytextview.setText("Modifie du code");
		
		
		
		mybutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent I = new Intent(MainActivity.this,MadeuxiemeActivity.class);
				String machaine = myedittext.getText().toString();
				I.putExtra("KEY", machaine);

				startActivity(I);
				
				
				// TODO Auto-generated method stub
				
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
