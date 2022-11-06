import java.math.BigDecimal
import java.math.RoundingMode

class testBigDecimal {
}

fun main() {
    test1();
}


fun test1() {
    //val value = "0.01"
    val value:String = (29.99*2).toString()
    val v1 = BigDecimal(value).multiply(BigDecimal(100)).
            setScale(0,RoundingMode.UP).toString();
    println(v1);
}
