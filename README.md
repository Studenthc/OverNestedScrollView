# OverNestedScrollView
<img src="https://github.com/Studenthc/OverNestedScrollView/raw/308334ec470c58be1ad9ba39be1c12fa56a66b9d/app/src/main/res/raw/device-2018-10-31-143821.gif" width="50%" height="50%">
![gif](https://github.com/Studenthc/OverNestedScrollView/raw/308334ec470c58be1ad9ba39be1c12fa56a66b9d/app/src/main/res/raw/device-2018-10-31-143821.gif){:height="10%" width="10%"}
NestedScrollView that can elastic sliding
## Usage
In xml,just use it as NestedScrollView.  
In code,remember to setNestedScrollingEnabled to false that any view can nested scroll,as follows  
recyclerView.setNestedScrollingEnabled(false);  
You can set the distance of overscroll by setOverScrollY().
