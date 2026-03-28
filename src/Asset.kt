interface Asset {
    val name: String
    val amount: Double
    fun getConvertedValue(rate: Double): Double
}