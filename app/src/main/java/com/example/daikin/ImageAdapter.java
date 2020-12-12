package com.example.daikin;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter extends PagerAdapter {
    private Context mContext_342;
    private int[] mImageIds_342 = new int[]{R.drawable.slide1, R.drawable.slide2, R.drawable.slide3,R.drawable.slide4,R.drawable.slide5,R.drawable.slide6};

    public ImageAdapter(Context context_342) {
        mContext_342 = context_342;
    }

    @Override
    public int getCount() {
        return mImageIds_342.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView_342 = new ImageView(mContext_342);
        imageView_342.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView_342.setImageResource(mImageIds_342[position]);
        container.addView(imageView_342, 0);
        return imageView_342;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ImageView) object);
    }
}