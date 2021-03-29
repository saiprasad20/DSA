object Print1ToN {
	def main(args: Array[String]): Unit = {
		print1ToN(7)
	}

	private def print1ToN(n: Int): Unit = {
		if(n == 0) ()
		else {
			print1ToN(n - 1)
			println(n)
		}
	}
}