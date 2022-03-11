fun main(){
    list(arrayOf("halima","jane","james","habon"))
    country(arrayOf())
    sum(arrayOf())
    nems(arrayOf("mimi","na","jihitaji"))
}
fun list(list: Array<String>) {
    println(list.contentToString())
}
fun country(name:Array<String>){
    var cities= arrayOf("harare", "mumbai", "dodoma", "jakarta")
    for (y in cities)
        println(y.capitalize())
}
fun sum(nums:Array<Int>){
    var summation= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
        println(summation[1]+summation[4])
    println(summation.indexOf(158))
    println(summation.sorted())
}
fun nems(three:Array<String>){
    println(three.contentToString())
}
