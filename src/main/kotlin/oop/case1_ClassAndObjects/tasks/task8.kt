package org.example.oop.case1_ClassAndObjects.tasks

/*

Описание задачи:
Создайте систему, моделирующую процесс покупок в магазине.

Классы "Продукт" и "Корзина"

    Классы и их описание:

    Класс Product
    Свойства:
    name — название продукта (строка).
    price — цена продукта (целое число).

    Класс Cart
    Свойства:
    products — список продуктов (изначально пустой).
    Методы:
    addProduct(product: Product){
        добавляет продукт в корзину.
    }
    getTotalPrice() : Int{
        возвращает общую стоимость всех продуктов в корзине.
    }
    checkout(balance : Int){
        если стоимость всех продуктов в корзине равна вашему балансу то
        выводит сообщение с информацией о покупке: список продуктов и итоговую стоимость,
        и очищает корзину.
        Если ваш баланс меньше или больше, сообщить сколько не хватает или насколько перебор
    }

    Задача: Вас послали в магазин со списком продуктов которые вам необходимо купить:
    Молоко, Хлеб, Сахар
    У Вас на балансе 450 рублей, вам необходимо добавить продуктов в корзину ровно на эту стоимость.
    Стоимость других продуктов не может быть больше 80 рублей,
    Вам нужно потратить все деньги, так чтобы на балансе было 0 рублей

 */

fun main(){
    var balance = 450
//    val milk = Product("Молоко", 67)
//    val bread = Product("Хлеб", 45)
//    val sugar = Product("Сахар", 78)

}