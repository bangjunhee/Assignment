open class Lv3Calculator(
    private val addOperation: Lv3AddOperation,
    private val subsOperation: Lv3SubstractOperation,
    private val multiOperation: Lv3MultiplyOperation,
    private val divOperation: Lv3DivideOperation
) {
    fun addNum(num1: Int, num2: Int) {
        var sumNum = addOperation.operate(num1, num2)
        println("$num1 + $num2 = $sumNum")
    }
    fun subsNum(num1: Int, num2: Int) {
        var subsNum = subsOperation.operate(num1, num2)
        println("$num1 - $num2 = $subsNum")
    }
    fun multiNum(num1: Int, num2: Int) {
        val multiNum = multiOperation.operate(num1, num2)
        println("$num1 x $num2 = $multiNum")
    }
    fun divNum(num1: Int, num2: Int) {
        val divNum = divOperation.operate(num1, num2)
        println("$num1 / $num2 = $divNum")
    }
}