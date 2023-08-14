class Solution {
    func getConcatenation(_ nums: [Int]) -> [Int] {
        var result = nums
    
        for i in nums.count..<nums.count*2 {
            result.append(nums[i - nums.count])
        }
    
        return result
    }
}