public class Successors {

    public static Position findPosition(int value, int[][] array) {
        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                if (array[r][c] == value) {
                    return new Position(r, c);
                }
            }
        }
        return null; // Return null if the value is not found
    }

    // Method to get a 2D successor array of positions
    public static Position[][] getSuccessorArray(int[][] array) {
        Position[][] successorArray = new Position[array.length][array[0].length];

        for (int r = 0; r < array.length; r++) {
            for (int c = 0; c < array[r].length; c++) {
                int successorValue = array[r][c] + 1;
                Position pos = findPosition(successorValue, array);
                successorArray[r][c] = pos; // Store the position of the successor
            }
        }

        return successorArray;
    }
}


