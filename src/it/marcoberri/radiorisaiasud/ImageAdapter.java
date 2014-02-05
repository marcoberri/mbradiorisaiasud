package it.marcoberri.radiorisaiasud;

import android.annotation.SuppressLint;
import android.app.ActionBar.LayoutParams;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    private Integer[] mThumbIds = {
            R.drawable.gallery_1,R.drawable.gallery_2,R.drawable.gallery_3,R.drawable.gallery_4,R.drawable.gallery_5};
    
 
   public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }

    @SuppressLint("InlinedApi")
	@SuppressWarnings("deprecation")
	public View getView(int position, View convertView, ViewGroup parent) {
        ImageView i = new ImageView(mContext);
        
        if(position > mThumbIds.length)
        	position = 0;
        
        if(position < 0)
        	position = 0;
        
        i.setImageResource(mThumbIds[position]);
        i.setAdjustViewBounds(true);
        i.setLayoutParams(new Gallery.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
        return i;
    }



}
