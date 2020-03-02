import java.util.*

open class Man(){
    var name: String = ""
    var surname : String = ""
    var fathername : String = ""
    var datebirthday: Date = Date()
}
class Teacher(Name: String, name1 : String, name2 : String): Man(){
    init {
        name = Name
        surname = name1
        fathername = name2
    }
}
class Pupil() : Man() {

    var awards: MutableList<String> = mutableListOf()
    var storyaboutstuding: String = ""

    fun display(){
        println("$surname $name $fathername")
        println(datebirthday)
    }

    override fun toString(): String {
        return "$name $surname $fathername"
    }
}
class Group(){
    var pupils: MutableList<Pupil> = mutableListOf()
    var nameofgroup: String = "dfkjnhkj"
    var teacher: String = "Алексей Владимирович Костылев"
    var Name: Array<String> = arrayOf("Арвиль", "Артака", "Бестрева", "Ватерпежекосма", "Велира", "Вилора", "Гертруда", "Даздраперма")
    var surname : Array<String> = arrayOf("Иванова", "Смирнова", "Кузнецов", "Попова", "Васильева", "Петров", "Соколов", "Михайлов")
    var fathername : Array<String> = arrayOf("Александрович", "Васильевич", "Петрович", "Максимович", "Алексеевич", "Иванович", "Владимирович", "Антонович")
    fun pupil(size: Int) {
        for (i in 0..size -1) {
            pupils.add(Pupil())
            pupils[i].name = Name[(0..7).random()]
            pupils[i].fathername = fathername[(0..7).random()]
            pupils[i].surname = surname[(0..7).random()]
            pupils[i].datebirthday = Date()
        }
    }
        fun display(size: Int){
            for (i in 0..size - 1)
            pupils[i].display()
        }

    override fun toString(): String {
        return nameofgroup
    }

    }

class Kvant() {
    var groups: MutableList<Group> = mutableListOf()
    var nameofkvant: String = ""
    var description: String = ""
    var teachers: MutableList<String> = mutableListOf()


    fun Group_t_f() {
        for (i in 0..3)
            teachers.add(Group().teacher)
    }

    companion object {
        var space: Int = 0
        fun makeGroup(teacher: Teacher, name: String): Group {

            var groupi: Group = Group()
            println(name)
            groupi.pupil(space)
            groupi.display(space)
            println(teacher)
            return groupi
        }
    }

    override fun toString(): String {
        return "$nameofkvant"
    }
}

