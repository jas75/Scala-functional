
import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial{
	def main(args:Array[String]){

		// // STRINGS

		// var randSent=" I saw a dragon fly by"

		// println("3rd index: " + randSent(3)) //Outputs a

		// println("Length of string: "+randSent.length)


		// println(randSent.concat("and explode")) // concatenate a string

		// println("test"+"test".equals(randSent)) // return false because the two sentences aren't the same

		// println(randSent.indexOf("dragon")) // return the index of the first letter, so 8

		// val randSentArray=randSent.toArray// makes every character to an array

		// for(v <- randSentArray){ // loops it
		// 	println(v)
		// }


		// // FUNCTIONS

		// def getSum(num1: Int=1,num2: Int=1): Int= {
		// 	return num1 + num2
		// }

		// println("5+4="+getSum(5,4))

		// def sayHi(): Unit = { // Put Unit when function returns nothing like void
		// 	println("Hi how are you")
		// }

		// sayHi

		// def getSum(args:Int*): Int= { // can take multiple int with Int*
		// 	var sum : Int = 0
		// 	for(num <- args){
		// 		sum+=num
		// 	}
		// 	sum
		// }

		// println("Get sum"+getSum(2,67,1))



		// //Recursion

		// def factorial(num: BigInt) : BigInt = {
		// 	if(num <= 1){
		// 		1 // no need to precise return  
		// 	}
		// 	else{
		// 		num * factorial(num-1)
		// 	}
		// }

		// println("Factorial of 4 = " + factorial(4))





	}
}