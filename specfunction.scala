import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial{
	def main(args:Array[String]){
		val log10func = log10 _

		println(log10func(1000))

		List(1000.0,10000.0).map(log10func).foreach(println) //execute log10func on the List

		List(1,2,3,4,5).map((x: Int)=> x * 50).foreach(println)

		List(1,2,3,4,5).filter(_ % 2 == 0).foreach(println)

		def times3(num : Int)= num * 3
		def times4(num : Int)= num * 4

		def multIt(func : (Int)=>Double, num : Int) = {
			func(num)
		} // function in parameter of a function

		printf("3 * 10 = %.1f\n", multIt(times4,1000))

		val divisorVal= 5

		val divisor5 = (num : Double)=> num / divisorVal

		println("5/5 = " + divisor5(5.0)) // closure



	}
}