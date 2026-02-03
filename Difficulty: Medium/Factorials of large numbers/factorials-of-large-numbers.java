import java.util.ArrayList;

class Solution {

    public ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(1); 

        for (int i = 2; i <= N; i++) {
            multiply(result, i);
        }

        return result;
    }

    private void multiply(ArrayList<Integer> digits, int num) {
        int carry = 0;

        for (int i = digits.size() - 1; i >= 0; i--) {
            int prod = digits.get(i) * num + carry;
            digits.set(i, prod % 10);
            carry = prod / 10;
        }

        while (carry > 0) {
            digits.add(0, carry % 10);
            carry /= 10;
        }
    }
}
