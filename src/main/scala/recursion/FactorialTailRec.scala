package recursion
object FactorialTailRec {
	def main(args: Array[String]): Unit = {
		println(factorial(5, 1))
	}

	private def factorial(n: Int, acc: Int): Int = {
		if(n == 0) acc
		else factorial(n - 1, n * acc)
	}
}