import kotlin.time.measureTimedValue

fun main()
{
    val School = School("№31", 500)
    val SchoolNalog = SchoolNalog("№33", 500)
    val Factory = Factory("Завод имени хамида", 1000, "Стулья", 150)
    School.SetFactVolume() //Ввод фактического объёма для школы
    SchoolNalog.SetFactVolume() //Ввод фактического объёма для школы, которая платит налог
    Factory.UpdateVolume() //Ввод планового объёма для завода
    Factory.CreateProduct() //Создание продукта на заводе (тоже самое что и фактический объём)
    School.Info()
    School.Calculate()
    println()
    SchoolNalog.Info()
    SchoolNalog.Calculate()
    println()
    Factory.Info()
    Factory.Calculate()
    Factory.ChangeProduct() //Изменение создаваемого на заводе продукта
    println()
    Factory.Info()
}