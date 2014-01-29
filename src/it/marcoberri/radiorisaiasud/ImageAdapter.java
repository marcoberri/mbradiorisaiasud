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
<<<<<<< HEAD
            R.drawable.gallery_1,R.drawable.gallery_2,R.drawable.gallery_3,R.drawable.gallery_4,R.drawable.gallery_5};
    
	public ImageAdapter(Context c) {
=======
            R.drawable.gallery_1,R.drawable.gallery_2,R.drawable.gallery_3,R.drawable.gallery_4,R.drawable.gallery_5,R.drawable.gallery_11};
 
   public ImageAdapter(Context c) {
>>>>>>> 35962149f801eff4b3bd456a1352ba1704502965
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
<<<<<<< HEAD
        if(position > mThumbIds.length)
        	position = 0;
        if(position < 0)
        	position = 0;
        i.setImageResource(mThumbIds[position]);
        i.setAdjustViewBounds(true);
        i.setLayoutParams(new Gallery.LayoutParams(
=======

        if(position > mThumbIds.length)
        	position = 0;
        if(position <0)
        	position = 0;
     
        i.setImageResource(mThumbIds[position]);
        i.setAdjustViewBounds(true);
       /* i.setLayoutParams(new Gallery.LayoutParams(
>>>>>>> 35962149f801eff4b3bd456a1352ba1704502965
                LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
        //i.setBackgroundResource(R.drawable.picture_frame);
       
        return i;
    }



}
