package br.com.digitalhousefoods.domain

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.digitalhousefoods.R
import br.com.digitalhousefoods.contract.OnClickItemListener
import kotlinx.android.synthetic.main.item_restaurante.view.*

class RestauranteAdapter(
    private val restaurantes: ArrayList<Restaurante>,
    val listener: OnClickItemListener
) : RecyclerView.Adapter<RestauranteAdapter.ItemRestaurante>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemRestaurante {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_restaurante, parent, false)
        return ItemRestaurante(itemView)
    }

    override fun onBindViewHolder(holder: ItemRestaurante, position: Int) {
        val restaurante = restaurantes[position]

        holder.nome.text = restaurante.nome
        holder.endereco.text = restaurante.endereco
        holder.horario.text = restaurante.horario
        holder.imagem.setImageResource(restaurante.imagem)

    }

    inner class ItemRestaurante(itemView: View) : RecyclerView.ViewHolder(itemView),
        View.OnClickListener {
        val nome: TextView = itemView.tvRestauranteNome
        val endereco: TextView = itemView.tvRestauranteEndereco
        val horario: TextView = itemView.tvRestauranteHorario
        val imagem: ImageView = itemView.imgRestauranteImagem

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION)
                listener.OnClickItem(position)
        }
    }

    override fun getItemCount() = restaurantes.size

}