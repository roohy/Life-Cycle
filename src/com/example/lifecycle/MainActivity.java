package com.example.lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Toast.makeText(this, "I'm Created",Toast.LENGTH_LONG).show();
	}
	@Override
	public void onPause() {
		super.onPause();
		
		Toast.makeText(this, "I'm Paused",Toast.LENGTH_LONG).show();
	}
	
	@Override
	public void onResume(){
		super.onResume();
		
		Toast.makeText(this, "Im Started",Toast.LENGTH_LONG).show();
	}
	
	public void onClick(View view){
		Intent intent = new Intent(this, MainActivity.class);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
