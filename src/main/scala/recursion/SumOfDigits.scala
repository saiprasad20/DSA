package recursion
object SumOfDigits {
	def main(args: Array[String]): Unit = {
		println(sumOfDigits(10, 0))
	}

	private def sumOfDigits(n: Int, acc: Int): Int = {
		if(n == 0) acc
		else sumOfDigits(n / 10, acc + (n % 10))
	}
}