fun main() {
    val scanner = java.util.Scanner(System.`in`)
    val myAssets = mutableListOf<Asset>()

    println("🏦 Shaxsiy Aktivlar Boshqaruvchisi")
    println("---------------------------------")

     myAssets.add(Currency("USD", 500.0))
    myAssets.add(Currency("EUR", 200.0))
    myAssets.add(Crypto("BTC", 0.005))

    println("Hozirgi portfoilo:")
    myAssets.forEach { println("📍 ${it.name}: ${it.amount}") }

     println("\n🔄 Hisoblash uchun kurslarni kiriting:")

    print("1 USD necha so'm? ")
    val usdRate = scanner.nextDouble()

    print("1 EUR necha so'm? ")
    val eurRate = scanner.nextDouble()

    print("1 BTC necha so'm? ")
    val btcRate = scanner.nextDouble()

     var totalBalanceInUzs = 0.0

    for (asset in myAssets) {
        val rate = when (asset.name) {
            "USD" -> usdRate
            "EUR" -> eurRate
            "BTC" -> btcRate
            else -> 1.0
        }
        totalBalanceInUzs += asset.getConvertedValue(rate)
    }

     println("\n---------------------------------")
    println("📊 YAKUNIY HISOBOT:")
    println("Jami boyligingiz: ${String.format("%,.2f", totalBalanceInUzs)} so'm")

    val average = totalBalanceInUzs / myAssets.size
    println("Har bir aktivning o'rtacha qiymati: ${String.format("%,.2f", average)} so'm")
    println("---------------------------------")
}