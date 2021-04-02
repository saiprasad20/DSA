package recursion

object GenerateSubsetsOfString {
	def main(args: Array[String]): Unit = {
		generateSubsets("ABC", "", 0)
	}

	private def generateSubsets(str: String, curr: String, count: Int): Unit = {
		if(count == str.length) {
			println(curr)
		} else {
			generateSubsets(str, curr, count + 1)
			generateSubsets(str, curr + str(count), count + 1)
		}
	}
}