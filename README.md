# ViewPager2Bug
Test project which shows the need to set options on RecyclerView

ViewPager2 has inner private RecyclerView. It's not possible to set such options as isNestestedScrollingEnable, overScrollMode and so forth directly.

For example with MotionLayout horizontal ViewPager2 causes the problem of triggering onSwipe action.

Actual behaviour:
</p>
<img src="/actual.gif" alt="sample" title="sample" width="146" height="260" />

Expected behaviour:
</p>
<img src="/expected.gif" alt="sample" title="sample" width="146" height="260" />
