public int getPointsForRow(int targetRow) {
    int sum = 0;
    boolean allSame = true;
    String firstColor = board[targetRow][0].getColor();
    
    for (int col = 0; col < board[targetRow].length; col++) {
        sum += board[targetRow][col].getPoints();
        if (!board[targetRow][col].getColor().equals(firstColor)) {
            allSame = false;
        }
    }
    if (allSame) {
        return sum * 2;
    }
    return sum;
}
