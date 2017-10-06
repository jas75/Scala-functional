import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial{
	def main(args:Array[String]){
		// tupples hold values of numerous different types but normally immutable

		var tupleMarge = (103, "Marge Simpson", 10.25)

		printf("%s owes us $%.2f\n",tupleMarge._2,tupleMarge._3)

		//loops through tuple
		tupleMarge.productIterator.foreach{i => println(i)}

		println(tupleMarge.toString())

	}
}