package br.com.digitalhousefoods.domain

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhousefoods.R
import br.com.digitalhousefoods.contract.OnClickItemListener
import kotlinx.android.synthetic.main.item_restaurante_prato.view.*


class PratoAdapter(
    private val pratos: ArrayList<Prato>,
    val listener: OnClickItemListener
) : RecyclerView.Adapter<PratoAdapter.ItemPrato>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemPrato {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_restaurante_prato, parent, false)
        return ItemPrato(itemView)
    }

    override fun onBindViewHolder(holder: ItemPrato, position: Int) {
        val prato = pratos[position]

        holder.nome.text = prato.nome
        holder.imagem.setImageResource(prato.imagem)
    }

    inner class ItemPrato(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        val nome: TextView = itemView.tvRestaurantePratoNome
        val imagem: ImageView = itemView.imgRestaurantePratoImagem

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION)
                listener.OnClickItem(position)
        }
    }

    override fun getItemCount() = pratos.size
}