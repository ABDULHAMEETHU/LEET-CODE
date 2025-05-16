class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int GasAtGasStation = 0;
        int CostOfGas = 0;
        for (int i = 0; i < gas.length; i++) {
            GasAtGasStation += gas[i];
            CostOfGas += cost[i];
        }
        if (CostOfGas > GasAtGasStation) {
            return -1;
        }
        int startindex = 0, currentgas = 0;
        for (int j = 0; j < gas.length; j++) {
            currentgas = currentgas + gas[j] - cost[j];

            if (currentgas < 0) {
                startindex = j + 1;
                currentgas = 0;
            }
        }
        return startindex;
    }
}