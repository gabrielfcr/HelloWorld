package org.pmm.helloworld;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class NextScreenActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_next_screen);
		Log.e("NextScreenActivity", "Estas dentro del Next Activity");
	}
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.next_screen, menu);
		return true;
	}

}
