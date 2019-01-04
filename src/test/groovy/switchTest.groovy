/**
 * switch
 */
//在Java里我们只能在switch语句中比较int或枚举类型。
// 在Groovy中我们可以比较任何类型只要这个类型提供了isCase方法。
// Groovy已经为Class(利用isInstance),
// Object(利用equals)，collections(利用contains)和正则表达式(利用matches)，
// 同样我们也可以为自己类实现isCase方法，这样也可以在switch语句中使用。最后我们还可以利用闭包来实现。
// 比较需要返回boolean类型。
def testSwitch(val) {
    def result
    switch (val) {
        case ~/^Switch.*Groovy$/:
            result = 'Pattern match'
            break
       case 60..90:
            result = 'Range contains'
            break
        case [21, 'test', 9.12]:
            result = 'List contains'
            break
        case [language:"groovy", version:"2.1"]:
            result = 'Map containsKey'
            break
        case 42.056:
            result = 'Object equals'
            break
        case { it instanceof Integer && it < 50 }:
            result = 'Closure boolean'
            break
        default:
            result = 'Default'
            break
    }
    result
}

println 'Pattern match' == testSwitch("Switch to Groovy")
println 'Range contains' == testSwitch(70)
println 'List contains' == testSwitch('test')
println 'Map containsKey'== testSwitch('language')
println 'Object equals' == testSwitch(42.056)
println 'Closure boolean' == testSwitch(20)
println 'Default' == testSwitch('default')