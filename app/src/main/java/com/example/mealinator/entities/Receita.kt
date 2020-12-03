package com.example.mealinator.entities

data class Receita(
    val idMeal: String,
    val strMeal: String,
    val strMealThumb: String,
    val strYoutube: String,
    val strInstructions: String,
    val strIngredient1: String,
    val strIngredient2: String,
    val strIngredient3: String,
    val strIngredient4: String,
    val strIngredient5: String,
    val strIngredient6: String,
    val strIngredient7: String,
    val strIngredient8: String,
    val strIngredient9: String,
    val strIngredient10: String,
    val strIngredient11: String,
    val strIngredient12: String,
    val strIngredient13: String,
    val strIngredient14: String,
    val strIngredient15: String,
    val strIngredient16: String,
    val strIngredient17: String,
    val strIngredient18: String,
    val strIngredient19: String,
    val strIngredient20: String,
    val strMeasure1: String,
    val strMeasure2: String,
    val strMeasure3: String,
    val strMeasure4: String,
    val strMeasure5: String,
    val strMeasure6: String,
    val strMeasure7: String,
    val strMeasure8: String,
    val strMeasure9: String,
    val strMeasure10: String,
    val strMeasure11: String,
    val strMeasure12: String,
    val strMeasure13: String,
    val strMeasure14: String,
    val strMeasure15: String,
    val strMeasure16: String,
    val strMeasure17: String,
    val strMeasure18: String,
    val strMeasure19: String,
    val strMeasure20: String
) {
    override fun toString(): String {
        return "Receita(idMeal='$idMeal', strMeal='$strMeal', strMealThumb='$strMealThumb', strYoutube='$strYoutube', strInstructions='$strInstructions', strIngredient1='$strIngredient1', strIngredient2='$strIngredient2', strIngredient3='$strIngredient3', strIngredient4='$strIngredient4', strIngredient5='$strIngredient5', strIngredient6='$strIngredient6', strIngredient7='$strIngredient7', strIngredient8='$strIngredient8', strIngredient9='$strIngredient9', strIngredient10='$strIngredient10', strIngredient11='$strIngredient11', strIngredient12='$strIngredient12', strIngredient13='$strIngredient13', strIngredient14='$strIngredient14', strIngredient15='$strIngredient15', strIngredient16='$strIngredient16', strIngredient17='$strIngredient17', strIngredient18='$strIngredient18', strIngredient19='$strIngredient19', strIngredient20='$strIngredient20', strMeasure1='$strMeasure1', strMeasure2='$strMeasure2', strMeasure3='$strMeasure3', strMeasure4='$strMeasure4', strMeasure5='$strMeasure5', strMeasure6='$strMeasure6', strMeasure7='$strMeasure7', strMeasure8='$strMeasure8', strMeasure9='$strMeasure9', strMeasure10='$strMeasure10', strMeasure11='$strMeasure11', strMeasure12='$strMeasure12', strMeasure13='$strMeasure13', strMeasure14='$strMeasure14', strMeasure15='$strMeasure15', strMeasure16='$strMeasure16', strMeasure17='$strMeasure17', strMeasure18='$strMeasure18', strMeasure19='$strMeasure19', strMeasure20='$strMeasure20')"
    }

    fun ingredientesMedidas(): String {
        return "$strIngredient1 - $strMeasure1 - $strIngredient2 - $strMeasure2 - $strIngredient3 - $strMeasure3 - $strIngredient4 - $strMeasure4 - $strIngredient5 - $strMeasure5 - $strIngredient6 - $strMeasure6 - $strIngredient7 - $strMeasure7 - $strIngredient8 - $strMeasure8 - $strIngredient9 - $strMeasure9 - $strIngredient10 - $strMeasure10 - $strIngredient11 - $strMeasure11 - $strIngredient12 - $strMeasure12 - $strIngredient13 - $strMeasure13 - $strIngredient14 - $strMeasure14 - $strIngredient15 - $strMeasure15 - $strIngredient16 - $strMeasure16 - $strIngredient17 - $strMeasure17 - $strIngredient18 - $strMeasure18 - $strIngredient19 - $strMeasure19 - $strIngredient20 - $strMeasure20"
    }
}
