package recursion
object RopeCuttingProblem {
	def main(args: Array[String]): Unit = {
		println(maxPieces(5, 2, 5, 1))
	}

	private def maxPieces(n: Int, a: Int, b: Int, c: Int): Int = {
		if(n == 0) 0
		else if(n < 0) -1
		else {
			val nMinusA = maxPieces(n - a, a, b, c)
			val nMinusB = maxPieces(n - b, a, b, c)
			val nMinusC = maxPieces(n - c, a, b, c)
			val maxAB = Math.max(nMinusA, nMinusB)
			val result = Math.max(maxAB, nMinusC)
			if(result == -1) -1
			else result + 1
		}
	}
}