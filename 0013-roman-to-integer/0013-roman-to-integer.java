class Solution {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int previous = toNumber(chars[0]);
        int result = 0;

        for (int i = 1; i < chars.length; i++) {
            int current = toNumber(chars[i]);

            if (previous < current) {
                current -= previous;
            } else {
                result += previous;
            }
            previous = current;
        }
        result += previous;

        return result;
    }

    private static int toNumber(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalStateException("Unexpected value: " + c);
        };
    }
}