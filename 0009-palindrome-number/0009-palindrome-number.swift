class Solution {
    
    func isPalindrome(_ x: Int) -> Bool {
        return x < 0 ? false : method(x: x) == x
    }
    
    private func method(x: Int) -> Int {
        var r = 0
        var x = x
        while x != 0 {
            r = r * 10
            r = r + x % 10
            x /= 10
        }
        return (r < Int32.min || r > Int32.max) ? 0 : r
    }
    
    
    
    /*
        
    I'll just leave my solution here in a comment down below 'cause LeetCode uses 5.5.2 swift
    compiler version and mine is 5.7.2
    
    This function works properly but LeetCode gives an error such as:
    
    Line 3: Char 44: error: cannot convert value of type 'String' to expected argument type 'String.Element' (aka '        'Character') in solution.swift
        return (String(x).split(separator: "") != String(x).split(separator: "").reversed() || x < 0) ? false : true
                                           ^
Line 3: Char 78: error: cannot convert value of type 'String' to expected argument type 'String.Element' (aka 'Character') in solution.swift
        return (String(x).split(separator: "") != String(x).split(separator: "").reversed() || x < 0) ? false : true
    
    
    
    func isPalindrome(_ x: Int) -> Bool {
        return (String(x).split(separator: "") != String(x).split(separator: "").reversed() || x < 0) ? false : true
    }
    */
}