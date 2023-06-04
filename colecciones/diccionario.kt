fun main() {
    var diccionario = vocabulario()
    imprimirdiccionario(diccionario)

    val palabra = "carro"
    val traduccion = consulta(diccionario, palabra)
    println("$palabra en Ingles es: $traduccion")
}

fun vocabulario(): Map<String, String> {
    var diccionario = mutableMapOf<String, String>(
      
    
    "bien" to "good",
    "rojo" to "red",
    "gato" to "cat",
    "carro" to "car",
    );

    
    return diccionario
}

fun consulta(diccionario: Map<String, String>, palabra: String): String {
    return diccionario[palabra] ?: "No se encontro la traduccion de esa palabra, ya ni modo :3"
}

fun imprimirdiccionario(diccionario: Map<String, String>) {
    println("Diccionario:")
    for ((palabra, palabraTraducida) in diccionario) {
        println("$palabra -> $palabraTraducida")
    }
}