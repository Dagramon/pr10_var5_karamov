open class School(name : String, override var planned_volume: Int, override var fact_volume: Int) : Facility(name)
{
    constructor(name: String, _planned_volume: Int) : this(name, _planned_volume, 0)
    {
        planned_volume = _planned_volume
    }

    override fun Info()
    {
        println("Предприятие $name\n$fact_volume/$planned_volume")
    }
}