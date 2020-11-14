package br.com.digitalhousefoods.repository

import br.com.digitalhousefoods.R
import br.com.digitalhousefoods.domain.Prato
import br.com.digitalhousefoods.domain.Restaurante

class RestauranteRepository {
    fun obterRestaurantes(): ArrayList<Restaurante> {
        val pratos = arrayListOf(
            Prato(
                1,
                "Salada com Molho Gengibre",
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis",
                R.drawable.image4,
            ),
            Prato(
                1,
                "Salada com Molho Gengibre",
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis",
                R.drawable.image4,
            ),
            Prato(
                1,
                "Salada com Molho Gengibre",
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis",
                R.drawable.image4,
            ),
            Prato(
                1,
                "Salada com Molho Gengibre",
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis",
                R.drawable.image4,
            ),
            Prato(
                1,
                "Salada com Molho Gengibre",
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis",
                R.drawable.image4,
            ),
            Prato(
                1,
                "Salada com Molho Gengibre",
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis",
                R.drawable.image4,
            ),
            Prato(
                1,
                "Salada com Molho Gengibre",
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis",
                R.drawable.image4,
            ),
            Prato(
                1,
                "Salada com Molho Gengibre",
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis",
                R.drawable.image4,
            ),
            Prato(
                1,
                "Salada com Molho Gengibre",
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis",
                R.drawable.image4,
            ),
            Prato(
                1,
                "Salada com Molho Gengibre",
                "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis",
                R.drawable.image4,
            ),
        )

        return arrayListOf(
            Restaurante(
                1,
                "Tony Roma's",
                "Av. Lavandisca, 717 - Indianápolis, São Paulo",
                "Fecha às 22:00",
                R.drawable.image1,
                pratos
            ),

            Restaurante(
                2,
                "Aoyama - Moema",
                "Alameda dos Arapanés, 532 - Moema\n",
                "Fecha às 00:00",
                R.drawable.image4,
                pratos
            ),

            Restaurante(
                3,
                "Outback - Moema",
                "Av. Moaci, 187, 187 - Moema, São Paulo",
                "Fecha às 00:00",
                R.drawable.image5,
                pratos
            ),

            Restaurante(
                4,
                "Sí Señor!",
                "Alameda Jauaperi, 626 - Moema",
                "Fecha às 01:00",
                R.drawable.image3,
                pratos
            )
        )
    }
}