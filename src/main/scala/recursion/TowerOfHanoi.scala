package recursion

object TowerOfHanoi {
	def main(args: Array[String]): Unit = {
		towerOfHanoi(3, 'A', 'B', 'C')
	}

	private def towerOfHanoi(n: Int, A: Char, B: Char, C: Char): Unit = {
		if(n == 1) {
			println(s"Move disk 1 from $A to $C")
		} else {
			towerOfHanoi(n - 1, A, C, B)
			println(s"Move disk $n from $A to $C")
			towerOfHanoi(n - 1, B, A, C)
		}
	}
}