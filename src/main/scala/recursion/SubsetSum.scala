package recursion

object SubsetSum {
	def main(args: Array[String]): Unit = {
		println(countSubsets(Array(1, 2, 3), 3, 3))
	}

	private def countSubsets(array: Array[Int], n: Int, sum: Int): Int = {
		if(n == 0) if(sum == 0) 1 else 0
		else {
			countSubsets(array, n - 1, sum) + countSubsets(array, n - 1, sum - array(n - 1))
		} 
	}
}