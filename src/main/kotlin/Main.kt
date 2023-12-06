fun main(){
    print("num1: ")
    var num1 = readLine()!!.toInt()
    print("num2: ")
    var num2 = readLine()!!.toInt()
    var classtest = Lv1Calculate(num1, num2)
    classtest.printnum()
}