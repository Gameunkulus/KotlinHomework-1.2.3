fun main() {

    val Client1 = Client(800.00, true);
    CheckDiskount(Client1)
    val Client2 = Client(7000.00, false);
    CheckDiskount(Client2)
    val Client3 = Client(11000.00, false);
    CheckDiskount(Client3)
    val Client4 = Client(15000.00, true);
    CheckDiskount(Client4)

}

class Client(val basket: Double, val meloman: Boolean)

fun CheckDiskount(client: Client) {
    //берём сумму купленных товаров в корзине и переводим из рублей в копейки
    var Cashbasket: Int = (client.basket * 100).toInt()
    //определяем скидку
    if (client.basket > 10000) {
        val Diskount = Cashbasket / 100 * 5
        Cashbasket = Cashbasket - Diskount
    } else if (client.basket > 1000 && client.basket < 10000) {
        Cashbasket = Cashbasket - 10000
    } else {
        Cashbasket = Cashbasket
    }
    //проверка если клиент меломан
    if (client.meloman === true) {
        val Diskount: Int = (Cashbasket / 100 * 1)
        Cashbasket = Cashbasket - Diskount
    }
    //переменная которая отвечает за то сколько всего в результате заплатит клиент в рублях
    val TotalCash: Double = (Cashbasket / 100).toDouble()
    println("Клиент заплатит ${TotalCash}")
}