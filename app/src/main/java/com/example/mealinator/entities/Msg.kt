package com.example.mealinator.entities

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Msg(@SerializedName("meals") @Expose var listaReceitas: List<Receita>)