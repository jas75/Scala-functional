import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

object ScalaTutorial{
	def main(args:Array[String]){
		
		val rover = new Animal
		rover.setName("rover")
		rover.setSound("woof")

		printf("%s says %s\n",rover.getName,rover.getSound)

		val whiskers = new Animal("Whiskers","Meow")
		println(s"${whiskers.getName} with id ${whiskers.id} says ${whiskers.getSound}\n")

		println(whiskers.toString)

		val spike= new Dog("Spike","woof", "Grrr")

		println(spike.toString())

	} // END OF MAIN


	class Animal(var name: String, var sound: String){ // this is the default constructor
		this.setName(name)

		// no static method in scala
		val id = Animal.newIdNum

		def getName(): String = name
		def getSound(): String = sound

		def setName(name:String){
			if(!(name.matches(".*\\d+.*"))){
				this.name = name
			}
			else{
				this.name = "No Name"
			}
		}

		def setSound(sound: String){
			this.sound=sound
		}

		// other constructor
		def this(name : String){
			this("No Name", "No sound")
			this.setName(name)
		}

		// if they dont pass any parameters
		def this(){
			this("No name", "No sound")
		}
		 // override any method, if thats prebuilt in scala or from inheritance
		override def toString(): String = {
			return "%s with the id %d says %s".format(this.name, this.id,this.sound) // like printf
		}

	}

	// companion object = static class. Exact name if the class

	object Animal{
		private var idNumber = 0
		private def newIdNum ={ idNumber += 1; idNumber} 
	}



	// inheritance
	class Dog(name: String, sound: String, growl: String) extends Animal(name,sound){ // Animal parameters must be define 


		def this(name: String,sound: String){
			this("No name", sound, "No Growl")
			this.setName(name)
		}

		def this(name: String){
			this("No name", "No sound", "No growl")
			this.setName(name)
		}

		def this(){
			this("No name", "No sound", "No growl")
		}


		override def toString(): String={
			return "%s with id %d says %s or %s".format(this.name, this.id, this.sound, this.growl)
		}

	}

} // END OF SCALA TUTO