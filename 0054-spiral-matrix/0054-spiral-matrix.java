class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        	List<Integer> result = new ArrayList<Integer>();
		int m = matrix.length;
		int n = matrix[0].length;
		int startingrow = 0;
		int endingrow = m - 1;
		int startingcolumn = 0;
		int endingcolumn = n - 1;

		while (startingrow <= endingrow && startingcolumn <= endingcolumn) {

    // Top
    for (int i = startingcolumn; i <= endingcolumn; i++)
        result.add(matrix[startingrow][i]);
    startingrow++;

    // Right
    for (int i = startingrow; i <= endingrow; i++)
        result.add(matrix[i][endingcolumn]);
    endingcolumn--;

    // Bottom
    if (startingrow <= endingrow) {
        for (int i = endingcolumn; i >= startingcolumn; i--)
            result.add(matrix[endingrow][i]);
        endingrow--;
    }

    // Left
    if (startingcolumn <= endingcolumn) {
        for (int i = endingrow; i >= startingrow; i--)
            result.add(matrix[i][startingcolumn]);
        startingcolumn++;
    }
}return result;
    }
}