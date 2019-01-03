/**
 * 三元运算符
 */
String name = "know";
println name = name != null ? name : "unknow";
name = name ?: 'unknown' // 在Groovy真值中，非空也为true
println name
