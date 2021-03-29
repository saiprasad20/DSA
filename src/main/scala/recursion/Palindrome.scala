package recursion
object Palindrome {
	def main(args: Array[String]): Unit = {
		println(isPalindrome("abcba", 0, 4))
	}

	def isPalindrome(str: String, start: Int, end: Int): Boolean = {
		if(start >= end) true
		else (str(start) == str(end)) && isPalindrome(str, start + 1, end - 1)
	}
}