package recursion

object PermutationsOfString {
	def main(args: Array[String]): Unit = {
		printPermutations("ABC")
	}

	private def printPermutations(str: String): Unit = {
		printPermutationsOfString(str, 0, str.length - 1)
	}

	private def printPermutationsOfString(str: String, s: Int, e: Int): Unit = {
		var string = str
		if(s == e) println(str)
		else {
			for(i <- s to e) {
				string = swap(str, s, i)
				printPermutationsOfString(string, s + 1, e)
			}
		}
	}

	private def swap(str: String, i: Int, j: Int): String = {
		val charArray = str.toCharArray
		val temp = charArray(i)
		charArray(i) = charArray(j)
		charArray(j) = temp
		charArray.mkString
	}
}