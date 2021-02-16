package uz.revolution.viewpagertask4.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import uz.revolution.viewpagertask4.fragments.MyFragment
import uz.revolution.viewpagertask4.models.MyModel


class MyAdapter(var data: ArrayList<MyModel>, fragmentManager: FragmentManager) :
    FragmentStatePagerAdapter(
        fragmentManager,
        BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT

    ) {

    override fun getCount(): Int = data.size

    override fun getItem(position: Int): Fragment {
        return MyFragment.newInstance(data[position])
    }
}