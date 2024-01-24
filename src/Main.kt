//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    print("Digita cantidad de números del listado: ")
    var longitudListado = readln().toInt()
    var listado = mutableListOf<Int>()
    for (i in 1..longitudListado){
        print("Digita un número: ")
        listado.add(readln().toInt())
    }
    val sumaPares = sumarPares(listado)
    println("La suma es: $sumaPares")

}

fun sumarPares(listadoPares: List<Int>) : Int {
    var suma = 0;
    for (numero in listadoPares) {
        val esPar = (numero % 2 == 0)
        if (esPar){
            suma += numero
        }
    }
    return suma
}