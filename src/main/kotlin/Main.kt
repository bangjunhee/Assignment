fun main() {
    fun lv1(num1: Int, num2: Int) {
        val lv1Class = Lv1Calculate(num1, num2)
        print("Choose operator(+, -, *, /): ")
        val operator: String = readln()
        when(operator) {
            "+" -> lv1Class.addNum()
            "-" -> lv1Class.subsNum()
            "*" -> lv1Class.multiNum()
            "/" -> lv1Class.divNum()
            else -> {
                println("Wrong Operator.")
                return
            }
        }
    }

    fun lv2(num1: Int, num2: Int) {
        val lv2Class = Lv2Calculate(num1, num2)
        print("Choose operator(+, -, *, /, %): ")
        val operator: String = readln()
        when(operator) {
            "+" -> lv2Class.addNum()
            "-" -> lv2Class.subsNum()
            "*" -> lv2Class.multiNum()
            "/" -> lv2Class.divNum()
            "%" -> lv2Class.remainderNum()
            else -> {
                println("Wrong Operator.")
                return
            }
        }
    }

    fun lv3(num1: Int, num2: Int){
        val lv3class = Lv3Calculator(
            Lv3AddOperation(),
            Lv3SubstractOperation(),
            Lv3MultiplyOperation(),
            Lv3DivideOperation())
        print("Choose operator(+, -, *, /): ")
        val operator: String = readln()
        when(operator) {
            "+" -> lv3class.addNum(num1, num2)
            "-" -> lv3class.subsNum(num1, num2)
            "*" -> lv3class.multiNum(num1, num2)
            "/" -> lv3class.divNum(num1, num2)
            else -> {
                println("Wrong Operator.")
                return
            }
        }
    }

    fun lv4(num1: Int, num2: Int){
        val lv4class = Lv4Calculate()
        var abstractClass: Lv4AbstractOperation ?= null
        print("Choose operator(+, -, *, /): ")
        val operator: String = readln()
        when(operator){
            "+" -> abstractClass = Lv4AddOperation()
            "-" -> abstractClass = Lv4SubstractOperation()
            "*" -> abstractClass = Lv4MultiflyOperation()
            "/" -> abstractClass = Lv4DivideOperation()
            else -> println("Wrong Operator.")
        }
        if (abstractClass != null) {
            lv4class.operation = abstractClass
            println("$num1 $operator $num2 = ${lv4class.operate(num1, num2)}")
        }
    }

    print("Choose level (1 ~ 4, 0 is exit): ")
    val choice = readln().toInt()
    print("num1: ")
    val num1 = readln().toInt()
    print("num2: ")
    val num2 = readln().toInt()

    when (choice) {
        1 -> lv1(num1, num2)
        2 -> lv2(num1, num2)
        3 -> lv3(num1, num2)
        4 -> lv4(num1, num2)
        0 -> return
        else -> print("wrong choice.")
    }
}