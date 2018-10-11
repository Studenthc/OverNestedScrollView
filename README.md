# OverNestedScrollView
NestedScrollView that can elastic sliding
<iframe height=300 width=300 src="https://github.com/Studenthc/OverNestedScrollView/blob/master/app/src/main/res/raw/device-2018-10-11-161635.mp4">
## Usage
In xml,just use it as NestedScrollView.  
In code,remember to setNestedScrollingEnabled to false that any view can nested scroll,as follows  
recyclerView.setNestedScrollingEnabled(false);  
You can set the distance of overscroll by setOverScrollY().
