package recursion

object Josephus {
	def main(args: Array[String]): Unit = {
		println(josephus(5, 3) + 1)
	}

	private def josephus(n: Int, k: Int): Int = {
		if(n == 1) 0
		else {
			(josephus(n - 1, k) + k) % n      			// n is decremented for recursive call
														// k is added to the result since kth index will be new starting index after each kill
														// modulo n is because after adding k number can be greater than n
														// this result will be for 0 based indexing if needed for 1 based index add 1 to the result
		}
	}
}