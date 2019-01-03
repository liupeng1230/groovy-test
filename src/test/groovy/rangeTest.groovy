/**
 * 使用 range 定义一个整型范围
 */
def range = 1..10
println(range.from)
println(range.to)
//遍历1
//range.each {print it+ " "}
//遍历2
//for (i in range) {
//    println i + " "
//}

//在switch中使用range
Number num = 17
switch (num) {
//range 1..17)
    case 1..<18:
        result = "未成年"
        break
    case 18..100:
        result = "成年"
        break
    default:
        result = "unknow"
        break
}

println result//成年
