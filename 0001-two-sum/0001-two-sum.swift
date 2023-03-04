class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
    var dictionary = [Int: Int]()
    
        for (i, num) in nums.enumerated() {
            if let index = dictionary[target - num] {
                if i != index {
                    return [index, i]
                }
            }
            dictionary[num] = i
        }
        return[0]
    }
}