class Factory(var name : String, var planned_volume : Int, override var product: String, override var createdProduct: Int) : Factory_interface
{
    fun Calculate()
    {
        val q = createdProduct/planned_volume.toDouble()
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
    fun UpdateVolume()
    {
        try {
            print("Введите новый плановый объём: ")
            planned_volume = readln().toInt()
        }
        catch (e:Exception)
        {
            println("Неверный формат ввода")
        }
    }
    fun Info()
    {
        println("$name\n$createdProduct/$planned_volume\nСоздаваемые детали $product\nУже создано $createdProduct")
    }
}