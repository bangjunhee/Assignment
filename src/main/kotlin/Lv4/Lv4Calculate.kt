class Lv4Calculate() {
    lateinit var operation: Lv4AbstractOperation
    fun operate(num1: Int, num2: Int): Double {
        return operation.operate(num1, num2)
    }
}