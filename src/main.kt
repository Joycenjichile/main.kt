fun main(){

    var x=interges(arrayOf(4,6,8))
    println(x)
    var y=mixed(arrayOf(5.34F,"Jane",32.0,"Kamu",43.5))
    println(y)
   var z= characters(arrayOf('a','e','i','o','u'))
     println(z)


}
fun interges(numbers:Array<Int>):Int{
    var product=1
    numbers.forEach { nav ->
        product*=nav

    }
    return product
}
fun mixed(nums:Array<Any>):Float{
    var sum=0.0F
    nums.forEach { nk ->

        if (nk is Float || nk is Double){
         sum+=nk.toString().toFloat()
    }
        }
    return sum
}
fun characters(noms:Array<Char>):Int{
    var vowels=0
    noms.forEach { ray ->

        if(ray== 'a'|| ray== 'e' || ray== 'i'|| ray== 'o'|| ray == 'u'){

            vowels++
        }
    }
    return vowels


}