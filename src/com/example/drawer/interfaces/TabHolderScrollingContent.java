package com.example.drawer.interfaces;

public interface TabHolderScrollingContent {
    /**
     * Adjust content scroll position based on sticky tab bar position.
     */
    void adjustScroll(int position,int tabBarTop);
}
