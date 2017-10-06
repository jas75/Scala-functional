
import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial{
	def main(args:Array[String]){


		//define an array with its type and its size
		val favNums = new Array[Int](20)

		val friends = Array("Bpb","Tom")

		friends(0) = "Sue"

		println("Bestfriends "+friends(0))


		// array buffer size ca change
		val friends2 = ArrayBuffer[String]()

		friends2.insert(0,"Phil")

		//insert to the next avalaible slot
		friends2+= "Mark"

		//add multiple different values
		friends2 ++= Array("Sysy","paul")


		// add items starting at the second slot
		friends2.insert(1,"Mike","szly","sam","mary","sue")

		//remove starting at the second slot and remove 2 elements
		friends2.remove(1,2)


		var friend: String= ""

		for(friend <- friends2){
			println(friend)
		}

		for(j <- 0 to (favNums.length -1)){
			favNums(j) = j

			println(favNums(j))
		}

		// now that we've created this favNums this is another loop

		val favNumsTimes2= for(num<-favNums) yield 2* num

		favNumsTimes2.foreach(println)



		var favNumsDiv4= for(num<-favNums if num % 4 == 0) yield num

		favNumsDiv4.foreach(println)



		//multimiensional arrays
		var multTable = Array.ofDim[Int](10,10)

		for(i <- 0 to 9){
			for(j <- 0 to 9){
				multTable(i)(j)=i*j
			}
		}

		for(i <- 0 to 9){
			for(j<-0 to 9){
				printf("%d : %d = %d\n", i, j, multTable(i)(j))
			}
		}

		//different fonction avalible for mutlidimensional arrays

		println("Sum: " + favNums.sum)
		println("Min: " + favNums.min)
		println("max: " + favNums.max)

		// sort items in the array
		val sortedNums=favNums.sortWith(_>_)

		//insert commas between items
		println(sortedNums.deep.mkString(", "))



	}
}