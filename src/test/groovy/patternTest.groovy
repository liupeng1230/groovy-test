import java.util.regex.Pattern

/**
 * pattern
 */
def pattern = ~/foo/
println pattern instanceof Pattern
println pattern.matcher("foo").matches() // returns TRUE
println pattern.matcher("foobar").matches()

//Matcher
println "cheesecheese" =~ "cheese"
println "cheesecheese" =~ /cheese/
println "cheese" == /cheese/
println ! ("cheese" =~ /ham/)

println "2009" ==~ /\d+/ // returns TRUE
println "holla" ==~ /\d+/ // returns FALSE