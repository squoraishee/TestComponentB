package com.vmn.ComponentB;


import android.os.Bundle;
import android.app.Activity;
import android.content.pm.PackageManager.NameNotFoundException;
import android.view.Menu;
import android.widget.TextView;

public class ComponentB extends Activity {

	TextView view;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_component_b);
	
		view = (TextView)findViewById(R.id.component_version_text);
		//view.setText(getPackageManager().getPackageInfo(getPackageName(), 0).versionName);
		view.setText(getResources().getString(R.string.libB));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.component_b, menu);
		return true;
	}

}
