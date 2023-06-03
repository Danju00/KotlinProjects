// Trabajando con mapas
fun main(){
    //Mapa inmutable
    val ladas: Map<Int, String> = mapOf( 1 to "USA", 34 to "España", 52 to "Mexico", 233 to "Ghana");

    //Imprimiendo el conjunto de pares clave-valor
    println(ladas);

    //Imprimiendo el mapa usando un for
    for ((key, value) in ladas){
        println("La clave lada de $value es $key");
    }
    //imprimiendo el mapa usando lambda
    ladas.forEach{(k,v) -> println("$k -> $v")}

    //recuperar un solo elemento del mapa
    println (ladas.get(52));
    println(ladas[52]);

    //Recuperar su tamaño, cuantos pares hay en el mapa
    println("Tamaño: ${ladas.size}");
    
    //Recuperar solo las claves
    println("Claves del mapa: ${ladas.keys}");
    
    //Recuperar solo los valores
    println("Valores del mapa: ${ladas.values}");

    //Recuperar las entradas
    println("Entradas del mapa: ${ladas.entries}");

    //Recuperar un valor si existe, sino, envia el default
    println("Valor de la lada 48: ${ladas.getOrDefault(48, "Paises desconocidos")}");

    //Comparobar si el mapa esta vacio:
    println("Mapa vacio: ${ladas.isEmpty()}");

    //Comprobar si existe una clave especifica en el mapa
    println("Existe la clave lada 86: ${86 in ladas}");

    //Comprobar si existe un valor en el mapa
    println("Existe el valor Mexico en el mapa: ${"Mexico" in ladas.values}");

    //Mapa mutable 
    var nums = mutableMapOf (
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
    );

    println("Mapa de numeros: $nums");
    //eliminar valores del mapa
    nums.remove("two");
    // agregando por al mapa
    nums["six"] = 6;
    println("Mapa nuevo de numeros: $nums");

    var sortedNums = nums.toSortedMap();
    println("Mapa ordenado: $sortedNums");

    //Reto
    //Crear un diccionario espanol-ingles usando un mapa
    // 1. Funcion para crear o cargar el diccionario
    // 2. Funcion para consulta, reciba una palabra en espanol y regrese su traduccion
    // 3 Si no existe su traduccion entrege un valor por default
    // 4 Imprimir todo el diccionario
}