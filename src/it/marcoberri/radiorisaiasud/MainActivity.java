package it.marcoberri.radiorisaiasud;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	        case R.id.menu_main_gallery :
	        	
	        	Intent gallery = new Intent();
	        	gallery.setClass(this, GalleryActivity.class);
	        	startActivity(gallery);
	            return true;
	        case R.id.menu_main_website :
	        	Utils.getToast((Activity)this, "to web", Toast.LENGTH_SHORT);
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
}
