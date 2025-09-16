// Given three distinct numbers a, b and c. Find the number with a value in the middle (Try to do it with minimum comparisons).
// Input: a = 978, b = 518, c = 300
// Output: 518
// Explanation: Since 518>300 and 518<978, so 518 is the middle element.

class MiddleOfThree {
    int middle(int a, int b, int c) {
        return a+b+c - Math.min(a,Math.min(b,c)) - Math.max(a,Math.max(b,c));
        
    }
}
