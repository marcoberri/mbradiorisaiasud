package it.marcoberri.radiorisaiasud;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    private Integer[] mThumbIds = {
            R.drawable.gallery_1,R.drawable.gallery_2,R.drawable.gallery_3,R.drawable.gallery_4};
 
    private Integer[] mImageIds = {
    		R.drawable.gallery_1,R.drawable.gallery_2,R.drawable.gallery_3,R.drawable.gallery_4}; 
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

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView i = new ImageView(mContext);

        i.setImageResource(mThumbIds[position]);
        i.setAdjustViewBounds(true);
        /*i.setLayoutParams(new Gallery.LayoutParams(
                LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
        i.setBackgroundResource(R.drawable.picture_frame);
       */
        return i;
    }



}
