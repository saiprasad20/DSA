package recursion
object BinaryRepresentation {
	def main(args: Array[String]): Unit = {
		printDecimalToBinary(8)
	}

	private def printDecimalToBinary(n: Int): Unit = {
		if(n == 0) ()
		else {
			printDecimalToBinary(n / 2)
			print(n % 2)
		}
	}
}