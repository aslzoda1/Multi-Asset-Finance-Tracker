class Currency(override val name: String, override val amount: Double) : Asset {
    override fun getConvertedValue(rate: Double): Double = amount * rate
}