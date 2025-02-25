fun main() {
    val pokemon = mutableListOf<String>()

    pokemon.add("Chespin")

    while (true) {
        show(pokemon)
        val action = menu()
        when (action) {
            'Q' -> break
            'C' -> catch_pokemon(pokemon)
           // 'R' -> release_pokemon()
        }
    }


}

fun menu(): Char {
    println("(C)atch a Pokemon")
    println("(R)elease a Pokemon")
    println("(Q)uit")

    val valid_choices = "ADQ"

    while (true) {
        print("Select an option: ")
        val input = readln()
        if (input.isBlank())
            continue
        val choice = input.uppercase().first()
        if (valid_choices.contains(choice))
            return choice
    }
}

fun show(list: List<Any>){
    for ((i, item) in list.withIndex())
        println("${i+1}: ${item}")
}

fun catch_pokemon(pokemon: MutableList<String>){
    val new_pokemon = get_string("What Pokemon will you catch: ")
    pokemon.add(new_pokemon)
}

fun get_string(prompt: String):String {
    var user_input: String
    while(true) {
        print(prompt)

        user_input = readln()
        if (user_input.isNotBlank()) break
    }
    return user_input
}