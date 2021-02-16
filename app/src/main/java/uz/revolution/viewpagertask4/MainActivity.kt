package uz.revolution.viewpagertask4

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator
import kotlinx.android.synthetic.main.activity_main.*
import uz.revolution.viewpagertask4.adapters.MyAdapter
import uz.revolution.viewpagertask4.models.MyModel


class MainActivity : AppCompatActivity() {

    lateinit var data: ArrayList<MyModel>
    lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
            WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
        )

        loadData()
        myAdapter = MyAdapter(data, supportFragmentManager)
        view_pager.adapter = myAdapter
//        tab_layout.setupWithViewPager(view_pager)

        skip.setOnClickListener {
            view_pager.setCurrentItem(4, true)
        }

//        val dotsIndicator = findViewById<WormDotsIndicator>(R.id.tab_layout)
        tab_layout.setViewPager(view_pager)

//        setTabs()

//        tab_layout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
//            override fun onTabSelected(tab: TabLayout.Tab?) {
//                val customView = tab?.customView
//                customView?.selected?.visibility = View.VISIBLE
//                customView?.unselected?.visibility = View.INVISIBLE
//            }
//
//            override fun onTabUnselected(tab: TabLayout.Tab?) {
//                val customView = tab?.customView
//                customView?.selected?.visibility = View.INVISIBLE
//                customView?.unselected?.visibility = View.VISIBLE
//            }
//
//            override fun onTabReselected(tab: TabLayout.Tab?) {
//
//            }
//
//        })

//
//        val numOfIndicators = 4
//        val space = 10
//
//        tab_layout.setupWithViewPager(view_pager, true)
//        val params = tab_layout.layoutParams //ConstraintLayout is my layout manager
//
//        params.width = numOfIndicators * space
//        tab_layout.layoutParams = params

    }

//    private fun setTabs() {
//        val tabCount = tab_layout.tabCount
//
//        for (i in 0 until tabCount) {
//            val tabView = LayoutInflater.from(this).inflate(R.layout.item_tab, null, false)
//            val tab = tab_layout.getTabAt(i)
//            tab?.customView = tabView
//
//            if (i == 0) {
//                tabView.selected.visibility = View.VISIBLE
//                tabView.unselected.visibility = View.INVISIBLE
//            } else {
//                tabView.selected.visibility = View.INVISIBLE
//                tabView.unselected.visibility = View.VISIBLE
//            }
//
//
//        }
//    }

    private fun loadData() {
        data = ArrayList()
        data.add(
            MyModel(
                "Geoaxborot",
                "Geoaxborot moduli orqali siz o'zingizga yaqin bo'lgan migrantlar " +
                        "va boshqa muassasalar haqida ma'lumot olishingiz mumkin",
                R.drawable.geoaxborot
            )
        )
        data.add(
            MyModel(
                "Huquqiy axborot",
                "Huquqiy axborot moduli orqali siz migratsiya sohasiga oid yangiliklardan," +
                        " qonunlardan xabardor bo'lishingiz va online konsultatsiya olishingiz mumkin",
                R.drawable.huquqiyaxborot
            )
        )
        data.add(
            MyModel(
                " To'lovlar xizmatlari",
                "To'lov xizmatlari moduli orqali siz masofadan turib turli xil xizmatlarga " +
                        "to'lovlar haqida ma'lumot olishingiz va to'lovlarni amalga oshirishingiz mumkin",
                R.drawable.tolovlarxizmati
            )
        )
        data.add(
            MyModel(
                "Qo'shimcha imkoniyat",
                "Qo'shimcha imkoniyatlar moduli orqali siz interaktiv so'zlashgichlar va lug'atlar " +
                        "yordamida til bilish savodxonligingizni oshirishingiz mumkin",
                R.drawable.qoshimchaimkoniyat
            )
        )
    }
}