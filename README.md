# OverNestedScrollView
<img src="https://github.com/Studenthc/OverNestedScrollView/raw/308334ec470c58be1ad9ba39be1c12fa56a66b9d/app/src/main/res/raw/device-2018-10-31-143821.gif" width="30%" height="30%">  

NestedScrollView that can elastic sliding
## Usage
In xml,just use it as NestedScrollView.  
In code,remember to setNestedScrollingEnabled to false that any view can nested scroll,as follows  
recyclerView.setNestedScrollingEnabled(false);  
You can set the distance of overscroll by setOverScrollY().

### xml:
<com.huchenhao.overnestedscrollview.base.OverNestedScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:fillViewport="true"
    android:overScrollMode="ifContentScrolls"
    android:scrollbarStyle="outsideOverlay"
    android:scrollbars="vertical"
    >

    <android.support.v7.widget.RecyclerView
        android:id="@+id/recyclerview"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

</com.huchenhao.overnestedscrollview.base.OverNestedScrollView>

### code:
recyclerView.setNestedScrollingEnabled(false);
