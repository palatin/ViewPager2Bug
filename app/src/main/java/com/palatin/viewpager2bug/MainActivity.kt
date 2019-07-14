package com.palatin.viewpager2bug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.children
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayoutMediator: TabLayoutMediator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vp.adapter = VPAdapter()
        //expected behaviour
        //(vp.children.firstOrNull() as? RecyclerView)?.isNestedScrollingEnabled = false
        tabLayoutMediator = TabLayoutMediator(tabs_layout, vp, true,
            TabLayoutMediator.OnConfigureTabCallback { tab, position ->
            })
        tabLayoutMediator.attach()
    }

    override fun onDestroy() {
        super.onDestroy()
        tabLayoutMediator.detach()
    }
}
