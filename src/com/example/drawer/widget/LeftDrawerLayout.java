package com.example.drawer.widget;

import com.example.drawer.R;
import com.example.drawer.R.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class LeftDrawerLayout extends LinearLayout {

	private View mRootView;

	public LeftDrawerLayout(Context context) {
		super(context);
		initView(context);
	}

	public LeftDrawerLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		initView(context);
	}

	public void initView(Context context) {
		mRootView = LayoutInflater.from(context).inflate(R.layout.left_drawer_layout, null);
		LayoutParams params=new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
		addView(mRootView,params);
	}
	
	

}
