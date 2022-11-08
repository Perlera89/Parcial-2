package com.example.parcial_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.parcial_2.entity.Animal
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager

//    private lateinit var image: ImageView
//    private lateinit var especie: TextView
//    private lateinit var sexo: TextView
//    private lateinit var habitad: TextView
//
//    var especies = arrayListOf<String>("Leon","Pato","Perro")
//    var sexos = arrayListOf<String>("macho","hembra")
//    var habitads = arrayListOf<String>("Bosque","Padrera", "Montaña")
//
//    var images = arrayOf(
//        R.drawable.leon,
//        R.drawable.pato,
//        R.drawable.perro
//    )
//
//    var animales = arrayOf(
//        Animal(images.get(0), especies.get(0),sexos.get(0), habitads.get(0)),
//        Animal(images.get(1), especies.get(1),sexos.get(1), habitads.get(1)),
//        Animal(images.get(2), especies.get(2),sexos.get(0), habitads.get(2))
//    )
//
//    var listAnimal = ArrayList<Animal>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        viewPager = findViewById(R.id.vp_viewAnimal)
//        viewPager.adapter = adapter

        initView()
    }

    private fun initView(){
        tabLayout = findViewById(R.id.tab_layout_main)
        viewPager = findViewById(R.id.view_pager_main)

        val titles: MutableList<String> = ArrayList()
        titles.add("Leon")
        titles.add("Gato")
        titles.add("Pato")

        tabLayout.addTab(tabLayout.newTab().setText(titles[0]))
        tabLayout.addTab(tabLayout.newTab().setText(titles[1]))
        tabLayout.addTab(tabLayout.newTab().setText(titles[2]))

        val fragments: MutableList<Fragment> = ArrayList()

//        for(fragment in fragments){
//            var view = fragment.view
//        }

        fragments.add(LeonFragment())
        fragments.add(PerroFragment())
        fragments.add(PatoFragment())
        viewPager.offscreenPageLimit = 3

        val mFragmentAdapter = FragmentAdapter(supportFragmentManager, fragments, titles)
        viewPager.adapter = mFragmentAdapter
        tabLayout.setupWithViewPager(viewPager)
        tabLayout.setTabsFromPagerAdapter(mFragmentAdapter)
    }
}