object PrintNTo1 {
	def main(args: Array[String]): Unit = {
		printNTo1(5)
	}

	private def printNTo1(n: Int): Unit = {
		if(n == 0) ()
		else {
			println(n)
			printNTo1(n - 1)
		}
	}
}