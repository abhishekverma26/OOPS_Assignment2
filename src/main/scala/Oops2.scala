class Person(var name:String,var age:Int) extends Ordered[Person] {
  def compare(that: Person): Int = {
    this.name compare that.name match {
      case 0 => { if(this.age.equals(that.age))
        println("True\nName & age both are same")
      else
        println("False\nName are same but ages are not equal");
        0
      }
      case other => { if(this.name.length.equals(that.name.length) && this.age.equals(that.age))
        println("True");
      else println("false");
        1
      }
    }
  }
}
object Person extends  App{
  var personOne = new Person("Abhi",24)
  var personTwo = new Person("Hunt",24)
  personOne compare personTwo
}