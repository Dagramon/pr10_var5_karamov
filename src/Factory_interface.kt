interface Factory_interface
{
    var product : String
    var createdProduct : Int
    //Сменить создаваемые детали
    fun ChangeProduct()
    {
        print("Введите новый товар для производства: ")
        product = readln()
        createdProduct = 0
    }
    //Создание деталей или товаров по партиям
    fun CreateProduct()
    {
        try
        {
            print("Сколько нужно произвести в партии?: ")
            var number = readln().toInt()
            if (number in 0..500)
            {
                createdProduct += number
            }
            else
            {
                println("Слишком много для 1 партии")
            }
        }
        catch (e:Exception)
        {
            println("Неверный тип данных")
        }
    }
}