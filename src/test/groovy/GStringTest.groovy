/**
 * Groovy插值字符串GString
 */
def name = "xiaoming"
def age = 18
println ""+name+" is "+age+" years old this year"
//这种形式的字符串相加使得我们在编码的时候非常不方便，而Gstring则不同了，它可以使我们非常方便的编码，形式如下：
println "$name is $age years old this year"
println "${name} is $age years old this year"
println("-----------------------------------------------------")
def str1 = 'hello world'
def str2 = '''
one
two
three
'''
def str3 = "hello world"
def str4 = """hello world"""
println str1
println str2
assert str1.class == java.lang.String
assert str2.class == java.lang.String
println str3
println str4
def str5 = """1111$str1"""
//assert str5.class == groovy.lang.GString