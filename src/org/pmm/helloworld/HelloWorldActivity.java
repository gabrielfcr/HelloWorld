package org.pmm.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class HelloWorldActivity extends BaseActivity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_world);
		Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
		Log.e("HelloWorld", "Estas dentro del Hello World");
		final Button next = (Button) findViewById(R.id.miBoton);
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				onDestroy();
				startActivity(new Intent(HelloWorldActivity.this, NextScreenActivity.class));
				int a = 1;
				
				
				
			}
		});

	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hello_world, menu);
		return true;
		
	}

}
