/**
 * 恒等操作符
 */
//在Groovy中，使用==和在java中使用是不一样的，在Groovy中是相当于调用equals，如果你要比较对象的引用，那么你要调用is：
def list1 = ['Groovy 1.8','Groovy 2.0','Groovy 2.3']        
def list2 = ['Groovy 1.8','Groovy 2.0','Groovy 2.3']        
println list1 == list2
println list1.is(list2)

