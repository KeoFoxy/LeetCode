class Solution {
    func mySqrt(_ x: Int) -> Int {
        guard x > 3 else {return x == 0 ? 0 : 1}
        
        var (l, r) = (0, x/2)

        while l<=r{
            let mid = (l+r)/2
            let res = mid * mid

            if res == x{
                return mid
            } else {
                res < x ? (l = mid + 1) : (r = mid - 1)
            }
        }

        return r
    }
}