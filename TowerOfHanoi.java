class Solution {
    public int towerOfHanoi(int n, int from, int to, int aux) {
        if (n == 0) {
            return 0; 
        }
        if (n == 1) {
            return 1; 
        }
        
        int steps = 0;
        steps += towerOfHanoi(n - 1, from, aux, to); 
        steps += 1; 
        steps += towerOfHanoi(n - 1, aux, to, from); 

        return steps;
    }
}
