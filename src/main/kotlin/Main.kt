import kotlin.random.Random

    abstract class Animals() {
        var name: String = ""
        var age: Int = 0
        abstract fun talk()

    }
    class Cats : Animals() {
        override fun talk() {
            println("Meow")
        }

    }

    class Dogs : Animals() {
        override fun talk() {
            println("Woof")
        }
    }

    fun main() {

    var cats = Cats()
    val cat = mutableMapOf<Any?,Any?>()
    val catName = listOf("Lili" , "Meep","Patchy","Furball","Snowball")
    val catAge = listOf(5,6,7,1,2)

    var dogs = Dogs()
    val dog = mutableMapOf<Any?,Any?>()
    val dogName = listOf("Rufus","Fred","Spot","Teddy","Rex")
    val dogAge = listOf(8,3,9,2,1)

    for (i in 0..4)
    {
        cats.name = catName[i]
        cats.age = catAge[i]

        dogs.name = dogName[i]
        dogs.age = dogAge[i]

        cat.put(cats.name,cats.age)
        dog.put(dogs.name,dogs.age)

    }

    for (catKey in cat.keys)
    {
        print(" $catKey : ")
        cats.talk()

        for (dogKey in dog.keys)
        {
            if (dog[dogKey] as Int > cat[catKey] as Int )
            {

                print("  $dogKey : ")
                dogs.talk()
            }
        }
    }
}