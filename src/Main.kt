import kotlin.reflect.KProperty1

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
println(myNumbers(30,12,2))

    println(isPalindrome("madam"))
    mySentence("Barnie bakes brown bagels and buns")
}




//Write and invoke one function that takes in an array of integers and returns
//these 3 values: sum, count and average of all the elements.

fun myNumbers (num1:Int,num2:Int,num3:Int):Array<Int>{
    return arrayOf(num1+num2+num3)
}

//A palindrome is a string that reads the same forwards and backwards e.g
//madam, wow, kayak. Write and invoke a function:
//isPalindrome(word: String): Boolean
//that takes in a single word and returns true or false depending on whether the
//word is a palindrome.
fun isPalindrome(word:String):Boolean{
    if (isPalindrome("madam"))
        return true
    else
      return false

}

//Write and invoke a function that given the string “Barnie bakes brown bagels
//and buns” prints out a list of all the other words and characters making up the
//string excluding all possible occurrences of the letter b.
fun mySentence(word: String){
    println(word.removeSuffix("b"))
}
