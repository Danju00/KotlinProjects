
// primer programa en Kotlin
fun main (){
    //Un val es un valor inmutable
    val veces = 35;
    val border =  "/*"

    printBorder(1, 30);
    println("Hola mundo Kotlin UwU");
    printBorder(2, 40);
    println();
    println("En este programa, el caracter de border es: ${border}");
    println("Y se imprime ${veces} veces");


}

// fun printBorder(numero: Int, caracter:String){
//     repeat(numero){
//         print(caracter);
//     }
//     println();
// }

fun printBorder(tipoCaracter: Int, numero: Int){
    when(tipoCaracter){
         1 ->
            repeat(numero){
            print('/');
    }
        
      
        2 ->
            repeat(numero){
                print('*');
            }
        
       
        3 ->
            repeat(numero){
                print('&');
            }
        
        else ->
            println("Tipo de dato no valido, no se imprie el border");
    }
    println();
}
