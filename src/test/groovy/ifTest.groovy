/**
 * if 结构
 * 在java中条件的表达式计算结果只能为布尔值
 * 在groovy中
 * 传入boolean或Boolean时，与java相同
 * 传入数字时，非0为真，0为假
 * 传入字符串时，空字符串为假，反之为真
 * 传入集合时，元素个数等于0为假，元素个数大于0为真
 * 传入对象时，null为假，反之为真
 */
/////////////////////////// if判断为真的情况 ///////////////////////////
//传入boolean或Boolean时
if(true){
    println("true")
}else{
    println "false"
}
//传入数字
if(5){
    println("true")
}else{
    println "false"
}
//传入字符串
if("wuLin"){
    println("true")
}else{
    println "false"
}
//传入集合
if([1,2,5]){
    println("true")
}else{
    println "false"
}
//传入对象
if(new String("Helen")){
    println("true")
}else{
    println "false"
}

/////////////////////////// if判断为假的情况 ///////////////////////////
//传入boolean或Boolean时
if(false){
    println("true")
}else{
    println "false"
}
//传入数字
if(0){
    println("true")
}else{
    println "false"
}
//传入字符串
if(""){
    println("true")
}else{
    println "false"
}
//传入集合
if([]){
    println("true")
}else{
    println "false"
}
//传入对象
if(null){
    println("true")
}else{
    println "false"
}