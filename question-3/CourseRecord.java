public int moreHistoryThanMathAbsences() {
    int count = 0;
    for (CourseRecord historyRec : historyList) {
        String histID = historyRec.getStudentID();
        for (CourseRecord mathRec : mathList) {
            if (mathRec.getStudentID().equals(histID)) {
                if (historyRec.getAbsences() > mathRec.getAbsences()) {
                    count++;
                }
            }
        }
    }
    return count;
}
