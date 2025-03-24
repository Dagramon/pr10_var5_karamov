import kotlin.random.Random

class SchoolNalog(name : String, override var planned_volume: Int, override var fact_volume: Int) : School(name, planned_volume, fact_volume)
{
    var p : Int = Random.nextInt(0, 15)
    constructor(name: String, _planned_volume: Int) : this(name, _planned_volume, 0)
    {
        planned_volume = _planned_volume
    }

    override fun Info()
    {
        println("Предприятие $name\n$fact_volume/$planned_volume\nНалог $p%")
    }
    override fun Calculate()
    {
        val q = fact_volume/planned_volume.toDouble()
        var qp: Double
        if (p <= 6)
        {
            qp = q - (q * p/100)
        }
        else
        {
            qp = q-0.2*q
        }
        if (qp > 1)
        {
            println("Предприятие прибыльное")
        }
        else if (qp in 0.95..1.0)
        {
            println("Предприятие не приносит прибыли")
        }
        else
        {
            println("Предприятие убыточное")
        }
    }
}