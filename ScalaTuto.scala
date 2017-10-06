import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial{
	def main(args:Array[String]){
		var i = 0


		//MUTLIPLE WAYS TO MAKE A LOOP


		//while loop
		while(i<=10){
			println(i)
			i+=1
		}


		// do while loop
		do{
			println(i)
			i+=1
		}
		while(i<=20)

		//for loop
		for(i<- 1 to 10){
			println(i)
		}

		val randLetters= "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

		for(i <- 0 until randLetters.length){
			println(randLetters(i))
		}

		val aList= List(1,2,3,4,5)

		for(i<- aList){
			println("List items " + i)
		}

		// the value of i is stored in evenList
		var evenList=  for{ i <- 1 to 20 
			if(i % 2) == 0
			} yield i

		for(i <- evenList){
			println(i)
		}

		// loops j and increment it then loops i and increment it                                  
		for( i <- 1 to 5; j <- 6 to 10){
			println("i: "+i)
			println("j: "+j)
		}

		// NO BREAKS  IN SCALA

		def printPrimes(){
			val primeList = List(1,2,3,4,5,11)
			for(i <- primeList){
				if(i==11){
					return // like a break
				}
				if(i != 1){
					‡println(i) // doesn't read 1
				}
			}
		}

		printPrimes


		// While i don't input 15, loop goes on
		var numberGuess=0

		do{
			print("Guess a number")
			numberGuess=readLine.toInt // prompt to user readLine expect a string and we convert it to int
			//readInt readDouble readByte readShort readLong
		}
		while(numberGuess!=15)

		printf("You guessed the secret number %d\n",15)

		val name ="Jason"
		val age= 24
		val weight= 180

		println(s"Hello $name") // display variable 

		println(f"Iam ${age + 1} and weigh $weight%.2f") // calculation on variable. put decimal after weight


		/*
			%c for characters
			%d for int
			%s for strings
			%f for floats
		*/

	}
}