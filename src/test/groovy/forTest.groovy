/**
 * Groovy 循环
 */
def names = ["Michael", "James", "Kavin", "Steven"]
/*for (String name : names) {
    println name
}*/

// 使用in形式的for循环
/*for (name in names) {
    println name
}*/
// 整型方法循环
/*for (i in 1..3) {
    println i
}*/
//upto和downto方法
/*1.upto(3){
    println it
}*/
//The argument (5) to downto() cannot be greater than the value (3) it's called on
//downto()的参数(5)不能大于它所调用的值(3)
/*3.downto(1){
    println it
}*/
// times方法
/*10.times {
    println it
}*/

//step方法
1.step(7, 2) {
    println it
}
