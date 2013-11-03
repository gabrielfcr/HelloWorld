package org.pmm.helloworld;

import android.app.Activity;
import android.util.Log;
import android.widget.Toast;

public class BaseActivity extends Activity {
	private static final int numeroAleatorio = (int)(Math.random()*10);
	private String DEBUG_TAG = Integer.toString(numeroAleatorio);
	@Override 
	protected void onStart() {
		   super.onStart();
		   Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
	}
		 
	@Override
	protected void onResume() {
		super.onResume();
		Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
	}
		 
	@Override 
	protected void onPause() {
		Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
		super.onPause();
		
	}
		 
	@Override 
	protected void onStop() {
		super.onStop();
		Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
	}
		 
	@Override 
	protected void onRestart() {
		super.onRestart();
		Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
	}
		 
	@Override 
	protected void onDestroy() {
		Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
		super.onDestroy();
	}

}