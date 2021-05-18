package com.nurgundogdu.recyclerviewkullanimi

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.nurgundogdu.recyclerviewkullanimi.databinding.KategoriCardBinding

class KategoriAdapter (var mContext:Context, var kategoriLstesi:List<Kategoriler>)
    : RecyclerView.Adapter<KategoriAdapter.CardTasarimTutucu>(){

    inner class CardTasarimTutucu(kategoriCardBinding: KategoriCardBinding):RecyclerView.ViewHolder(kategoriCardBinding.root){
        var tasarim:KategoriCardBinding

        init {
            this.tasarim = kategoriCardBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = KategoriCardBinding.inflate(layoutInflater,parent,false)
        return CardTasarimTutucu(tasarim)
    }

    override fun getItemCount(): Int {
        return kategoriLstesi.size
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val kategori = kategoriLstesi.get(position)

        holder.tasarim.textView3.text = kategori.kategori_adi
        holder.tasarim.imageViewYemek.setImageResource(
                mContext.resources.getIdentifier(kategori.kat_resim, "drawable",mContext.packageName))

        holder.tasarim.kategoriCardView.setOnClickListener {
            val gecis = GetirAnasayfaFragmentDirections.kategoriGecis(kategori)

            Navigation.findNavController(it).navigate(gecis)
        }
        }



}