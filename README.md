# OverNestedScrollView
![Aaron Swartz](https://https://raw.githubusercontent.com/Studenthc/OverNestedScrollView/3dfe149e4261dc43ab13b1e990eeb489203c6c45/app/src/main/res/raw/device-2018-10-31-143821.gif)
NestedScrollView that can elastic sliding
## Usage
In xml,just use it as NestedScrollView.  
In code,remember to setNestedScrollingEnabled to false that any view can nested scroll,as follows  
recyclerView.setNestedScrollingEnabled(false);  
You can set the distance of overscroll by setOverScrollY().
