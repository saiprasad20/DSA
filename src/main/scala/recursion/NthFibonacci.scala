object NthFibonacci {
	def main(args: Array[String]): Unit = {
		println(nthFibonacci(5))
	}

	private def nthFibonacci(n: Int): Int = {
		if(n <= 1) n
		else nthFibonacci(n - 1) + nthFibonacci(n - 2)
	}
}