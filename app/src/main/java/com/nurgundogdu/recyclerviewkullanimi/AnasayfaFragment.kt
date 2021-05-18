package com.nurgundogdu.recyclerviewkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.nurgundogdu.recyclerviewkullanimi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var tasarim: FragmentAnasayfaBinding

    private lateinit var adapter:KisilerAdapter
    private lateinit var kisilerListesi: ArrayList<Kisiler>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa, container, false)

        //tasarim.rv.layoutManager = LinearLayoutManager(requireContext())

        //tasarim.rv.layoutManager = StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)


        kisilerListesi= ArrayList()
        val k1 =Kisiler(1, "Ahmet","999999")
        val k2 = Kisiler(2, "Mehmet","99999")
        kisilerListesi.add(k1)
        kisilerListesi.add(k2)

        adapter = KisilerAdapter(requireContext(),kisilerListesi)

        //tasarim.rv.adapter = adapter
        tasarim.kisilerAdapter = adapter

        return tasarim.root
    }


}
