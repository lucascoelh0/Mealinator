package com.example.mealinator.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.mealinator.R
import com.example.mealinator.entities.Receita
import com.squareup.picasso.Picasso


class ReceitaFragment : Fragment() {

    private var viewModel: MainViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_receita, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel = activity?.let {
            ViewModelProviders.of(it).get(MainViewModel::class.java)
        }
        viewModel?.receita?.value?.let { organizarReceita(it) }

        view.findViewById<AppCompatButton>(R.id.includeBotaoReceitaFragment).setOnClickListener {
            viewModel?.getReceita()
            viewModel?.receita?.value?.let { organizarReceita(it) }
        }

        super.onViewCreated(view, savedInstanceState)
    }

    fun organizarReceita(receita: List<Receita>) {

        val receitaRecuperada = receita[0]
        val ingredientes = receitaRecuperada.ingredientesMedidas().split(" - ")
        val strIng = StringBuilder()

        for (i in 1 until ingredientes.size) {
            if (ingredientes[i - 1].isEmpty()) {
                break
            }
            if (i % 2 != 0) {
                strIng.append(ingredientes[i - 1])
            } else {
                strIng.append(" - ").append(ingredientes[i - 1]).append("\n")
            }
        }

        Picasso.with(context).load(receitaRecuperada.strMealThumb).fit()
            .into(view?.findViewById<ImageView>(R.id.ivFotoReceita))
        view?.findViewById<TextView>(R.id.tvNomeReceita)?.text = receitaRecuperada.strMeal
        view?.findViewById<TextView>(R.id.tvIngredientes)?.text = strIng.toString().trim()
        view?.findViewById<TextView>(R.id.tvModoPreparo)?.text = receitaRecuperada.strInstructions
    }
}