package it.marcoberri.radiorisaiasud;

import it.marcoberri.radiorisaiasud.helper.MusicPlayer;
import it.marcoberri.radiorisaiasud.helper.Utils;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class Main extends Activity {

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

	

	
}
