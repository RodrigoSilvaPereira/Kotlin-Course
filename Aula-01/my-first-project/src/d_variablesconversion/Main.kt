package d_variablesconversion

fun main() {

    // Conversion INT variable to DOUBLE variable ( .toDouble() )
    val variableInt1 = 10

    val variableDouble1 = variableInt1.toDouble()
    //print(variableDouble1)

    // ---------------------------------------------------------------------------------------//

    // Conversion INT variable to LONG variable ( .toLong() )
    val variableLong1 = variableInt1.toLong()
    //print(variableLong1)

    // ----------------------------------------------------------------------------------------//

    // Conversion DOUBLE variable to INT variable ( .toInt() ) - *ATTENTION: DELETE DECIMAL PLACES*
    val variableDouble2 = 18.4
    val variableInt2 = variableDouble2.toInt()
    //print(variableInt2)


    
}