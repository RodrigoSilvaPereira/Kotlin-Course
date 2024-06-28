package c_variablestypes

fun main() {
    /**
     * VARIABLES INT - INTEGER - Example "4"
     * Byte: 1 Byte or 8 Bits
     * Short: 2 Bytes or 16 Bits
     * => Int: 4 Bytes or 32 Bits
     * => Long: 8 Bytes or 64 Bits
     */

    val variableInteger = 10
    val variableInteger2: Int = 20
    val variableInteger3: Long = 3000000

    /**
     * VARIABLES with DECIMAL places - Example: 4.2
     * Float: 4 Bytes or 32 Bits
     * Double: 8 Bytes or 64 Bits
     */

    // Declaring a Float variable
        var myFloat: Float = 4.2f

    // Declaring a Double variable
        var myDouble: Double = 4.2

    // Example of Float with explicit type declaration
        var anotherFloat: Float = 3.14f

    // Example of Double with explicit type declaration
        var anotherDouble: Double = 3.141592653589793

    // Float has a precision of approximately 6-7 decimal digits
        var floatPrecisionExample: Float = 123.45679f // Output: 123.45679

    // Double has a precision of approximately 15-16 decimal digits
        var doublePrecisionExample: Double = 123.45678901234568 // Output: 123.45678901234568

    // Arithmetic operations with Float
        var floatSum: Float = 1.1f + 2.2f // Output: 3.3f

    // Arithmetic operations with Double
        var doubleSum: Double = 1.1 + 2.2 // Output: 3.3

    // Note: Kotlin infers the type of decimal literals as Double by default
        var inferredDouble = 2.718281828459045

    // To use Float, you must add the suffix 'f' or 'F'
        var inferredFloat = 2.7182817f

    // Converting Double to Float
        val doubleValue: Double = 3.14159
        var floatValue: Float = doubleValue.toFloat() // Output: 3.14159f

    // Converting Float to Double
        val floatVal: Float = 3.14f
        var doubleVal: Double = floatVal.toDouble() // Output: 3.14

    /**
     * NÚMEROS SEM SINAIS
     * Byte -> UByte
     * Short -> UShort
     * Int -> UInt
     * Long -> ULong
     */

    val x = 100U
    val y = 200UL

    x.toInt()

    val z = 200

    val uz = z.toUInt()

    /**
     * BOOLEAN TYPE IN KOTLIN
     */

    val variableBoolean: Boolean = true
    val variableBooleanTwo: Boolean = false

    /**
     * VARIABLES CHAR - ONE CHARACTER
     */

    val variableChar: Char = 'A'
    //println(variableChar)

    /**
     * VARIABLES STRING
     */
    val variableString: String = "Hello World"
    println(variableString)

    val varString1: String = "Hello World!"
    val varString2: String = "Welcome Again!"

    val varString12 = "$varString1 $varString2"
    println(varString12)

    /**
     * LITERAL STRINGS
     * O rato roeu
     * a roupa do
     * rei de "Roma"
     */

    val stringTest = "O rato roeu\na roupa do\nrei de \"Roma\""

    //println(stringTest)

    val stringTest2 = """
        O rato rodeu
            a roupa do
                rei de "Roma"
    """.trimIndent()

    print(stringTest2)

}