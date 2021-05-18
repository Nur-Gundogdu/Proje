package com.nurgundogdu.recyclerviewkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.nurgundogdu.recyclerviewkullanimi.databinding.FragmentGetirAnasayfaBinding


class GetirAnasayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentGetirAnasayfaBinding
    private lateinit var kategoriListesi:ArrayList<Kategoriler>
    private lateinit var adapter:KategoriAdapter


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        tasarim = DataBindingUtil.inflate(inflater,R.layout.fragment_getir_anasayfa, container, false)

        tasarim.rvkategori.layoutManager=StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)

        val k1 = Kategoriler(1, "Yemek","yemek")
        val k2 = Kategoriler(2, "İçecek","icecek")
        val k3 = Kategoriler(3, "Kişisel Bakım","ic_baseline_bathtub_24")
        val k4 = Kategoriler(4, "Kıyafet","ic_baseline_checkroom_24")
        val k5 = Kategoriler(5, "Kitap","ic_baseline_menu_book_24")
        val k6 = Kategoriler(6, "Kahve","coffee")

        kategoriListesi = ArrayList()
        kategoriListesi.add(k1)
        kategoriListesi.add(k2)
        kategoriListesi.add(k3)
        kategoriListesi.add(k4)
        kategoriListesi.add(k5)
        kategoriListesi.add(k6)

        adapter = KategoriAdapter(requireContext(), kategoriListesi)
        tasarim.rvkategori.adapter = adapter




        return tasarim.root
    }



}