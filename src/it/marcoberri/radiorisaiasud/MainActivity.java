package it.marcoberri.radiorisaiasud;

import it.marcoberri.radiorisaiasud.helper.MusicPlayer;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Main {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		/*
		if(MusicPlayer.isPlay()){
			menu.getItem(R.id.action_play).setIcon(R.drawable.ic_pause);
		}else{
			menu.getItem(R.id.action_play).setIcon(R.drawable.ic_play);
		}
		
		*/
		return true;
	}
	
}
