package recursion

object LogBase2 {
	def main(args: Array[String]): Unit = {
		println(logBase2(16))
	}

	private def logBase2(n: Int): Int = {
		if(n == 1) 0
		else 1 + logBase2(n / 2)
	}
}
