package com.example.drawer.interfaces;

import android.widget.AbsListView;

public interface OnScrollListener {
	public abstract void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount,int pageIdx);
}
