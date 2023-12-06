fun main() {
    fun lv1(num1: Int, num2: Int) {
        var lv1Class = Lv1Calculate(num1, num2)
        print("Choose operator(+, -, *, /): ")
        var operator: String = readln()
        if(operator == "+")
            lv1Class.addNum()
        else if(operator == "-")
            lv1Class.subsNum()
        else if(operator == "*")
            lv1Class.multiNum()
        else if(operator == "/")
            lv1Class.divNum()
        else{
            println("Wrong Operator.")
            return
        }
    }

    fun lv2(num1: Int, num2: Int) {
        var lv2Class = Lv2Calculate(num1, num2)
        print("Choose operator(+, -, *, /, %): ")
        var operator: String = readln()
        if(operator == "+")
            lv2Class.addNum()
        else if(operator == "-")
            lv2Class.subsNum()
        else if(operator == "*")
            lv2Class.multiNum()
        else if(operator == "/")
            lv2Class.divNum()
        else if(operator == "%")
            lv2Class.remainderNum()
        else{
            println("Wrong Operator.")
            return
        }
    }

    fun lv3(num1: Int, num2: Int){
        var lv3class = Lv3Calculator(
            Lv3AddOperation(),
            Lv3SubstractOperation(),
            Lv3MultiplyOperation(),
            Lv3DivideOperation())
        print("Choose operator(+, -, *, /): ")
        var operator: String = readln()
        if(operator == "+")
            lv3class.addNum(num1, num2)
        else if(operator == "-")
            lv3class.subsNum(num1, num2)
        else if(operator == "*")
            lv3class.multiNum(num1, num2)
        else if(operator == "/")
            lv3class.divNum(num1, num2)
        else{
            println("Wrong Operator.")
            return
        }
    }
    print("num1: ")
    var num1 = readln().toInt()
    print("num2: ")
    var num2 = readln().toInt()
    print("Choose level (1 ~ 4, 0 is exit): ")
    var choice = readln().toInt()

    when (choice) {
        1 -> lv1(num1, num2)
        2 -> lv2(num1, num2)
        3 -> lv3(num1, num2)
        0 -> return
        else -> print("wrong choice.")
    }
}