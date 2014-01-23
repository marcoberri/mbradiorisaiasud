package it.marcoberri.radiorisaiasud;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.MenuItem;

public class Main extends Activity {
	
	protected MediaPlayer media;

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
	        	Utils.launchWebBrowser("http://www.radiorisaiasud.it", this);
	        	return true;
	        case R.id.menu_main_facebook :
	        	Utils.launchFacebookPage("Radio-Risaia-Sud/224882854223371", getPackageManager(), this);
	            return true;
	        case R.id.action_play :
	        	if(media == null){
	        		media = MediaPlayer.create(this, R.raw.mulitta_mulit);
	        		media.start();
	        		item.setIcon(R.drawable.ic_pause);
	        	}else{
	        		if(media.isPlaying()){
	        			media.pause();
	        			item.setIcon(R.drawable.ic_play);
	        		}else{
	        			media.start();
	        			item.setIcon(R.drawable.ic_pause);
	        			}
	        	}
	        	
	        	return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	

}
