class AmericanSiSystem {
    companion object{
        fun meterToYard(meters: Float): Float{
            return meters * 1.09F
        }

        fun yardToMeter(yards: Float): Float{
            return yards * 0.9144F
        }

        fun poundToKilogram(pounds: Float): Float {
            return pounds * 0.454F
        }
        fun kilogramToPound(kilos: Float) : Float{
            return kilos * 2.2F
        }
    }
}