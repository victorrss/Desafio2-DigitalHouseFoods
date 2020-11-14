package br.com.digitalhousefoods.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import br.com.digitalhousefoods.R
import br.com.digitalhousefoods.repository.RestauranteRepository
import br.com.digitalhousefoods.contract.OnClickItemListener
import br.com.digitalhousefoods.domain.RestauranteAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnClickItemListener {

    private val restaurantes = RestauranteRepository().obterRestaurantes()
    private val adapter = RestauranteAdapter(restaurantes, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvRestaurantesLista.adapter = adapter
        rvRestaurantesLista.layoutManager = LinearLayoutManager(this)
        rvRestaurantesLista.setHasFixedSize(true)
    }

    override fun OnClickItem(position: Int) {
        val restaurante = restaurantes[position]

        val intent = Intent(this, DetalheRestauranteActivity::class.java)
        intent.putExtra("restaurante", restaurante)
        startActivity(intent)
    }
}

