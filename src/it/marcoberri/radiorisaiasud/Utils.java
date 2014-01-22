package it.marcoberri.radiorisaiasud;

import android.app.Activity;
import android.widget.Toast;


public class Utils {

	public static void getToast(Activity act, String message, int duration){
		CharSequence text = message;
    	
    	Toast toast = Toast.makeText(act, text, duration);
    	toast.show();
		
	}

}
