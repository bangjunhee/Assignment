class Lv2Calculate(val num1: Int, val num2: Int) {
    fun addNum() {
        val sumNum = num1+num2
        println("$num1 + $num2 = $sumNum")
    }
    fun subsNum() {
        val subsNum = num1-num2
        println("$num1 - $num2 = $subsNum")
    }
    fun multiNum() {
        val multiNum = num1*num2
        println("$num1 x $num2 = $multiNum")
    }
    fun divNum() {
        val divNum = num1.toFloat()/num2
        println("$num1 / $num2 = $divNum")
    }
    fun remainderNum() {
        val remainderNum = num1 % num2
        println("$num1 % $num2 = $remainderNum")
    }
}
