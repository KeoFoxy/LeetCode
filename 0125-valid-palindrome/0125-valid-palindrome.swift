func isPalindrome(_ s: String) -> Bool {
   return s.lowercased().filter { $0.isLetter } == String(s.lowercased().reversed()).filter { $0.isLetter }
}
