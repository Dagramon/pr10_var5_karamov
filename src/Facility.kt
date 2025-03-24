abstract class Facility(val name : String)
{
    abstract var planned_volume: Int
    abstract var fact_volume: Int
    open fun SetFactVolume()
    {
        try
        {
            print("Введите фактический объём: ")
            fact_volume = readln().toInt()
        }
        catch (e:Exception)
        {
         println("Неверный тип данных")
        }
    }
    open fun Calculate()
    {
        val q = fact_volume/planned_volume.toDouble()
        if (q > 1)
        {
            println("Предприятие прибыльное")
        }
        else if (q in 0.95..1.0)
        {
            println("Предприятие не приносит прибыли")
        }
        else
        {
            println("Предприятие убыточное")
        }
    }
    open fun Info()
    {
    }
}