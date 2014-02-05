package it.marcoberri.radiorisaiasud;

import it.marcoberri.radiorisaiasud.helper.MusicPlayer;
import it.marcoberri.radiorisaiasud.helper.Utils;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Gallery;

public class MainActivity extends Main   {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}



	
	@Override
	protected void onPause() {
		super.onPause();
		MusicPlayer.pause();
	}

	@Override
	protected void onStop() {
		super.onStop();
		MusicPlayer.pause();
	}
	

	
}
