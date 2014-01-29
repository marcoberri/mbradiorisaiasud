package it.marcoberri.radiorisaiasud;

import it.marcoberri.radiorisaiasud.helper.MusicPlayer;
import it.marcoberri.radiorisaiasud.helper.Utils;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Gallery;

@SuppressWarnings("deprecation")
public class GalleryActivity extends Main implements OnItemSelectedListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gallery);
		Gallery g = (Gallery) findViewById(R.id.gallery);
		g.setAdapter(new ImageAdapter(this));
		g.setOnItemSelectedListener(this);
	}

	@Override
<<<<<<< HEAD
	public boolean onCreateOptionsMenu(Menu menu) {
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle item selection
		switch (item.getItemId()) {
		case R.id.menu_main_gallery:
			Intent gallery = new Intent();
			gallery.setClass(this, GalleryActivity.class);
			startActivity(gallery);
			return true;
		case R.id.menu_main_website:
			Utils.launchWebBrowser("http://www.radiorisaiasud.it", this);
			return true;
		case R.id.menu_main_facebook:
			Utils.launchFacebookPage("Radio-Risaia-Sud/224882854223371",
					getPackageManager(), this);
			return true;
		case R.id.action_play:
			final boolean play = MusicPlayer.toggle(this, R.raw.mulitta_mulit);
			if (play) {
				item.setIcon(R.drawable.ic_pause);

			} else {
				item.setIcon(R.drawable.ic_play);
			}
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	@Override
=======
>>>>>>> 35962149f801eff4b3bd456a1352ba1704502965
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub

	}

}
