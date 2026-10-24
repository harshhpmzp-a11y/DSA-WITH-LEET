class Solution {

    private static final int[] days = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    private int parse(String date) {

        String[] parts = date.split("-");

        int m = Integer.parseInt(parts[0]);
        int d = Integer.parseInt(parts[1]);

        int res = 0;

        for (int i = 0; i < m - 1; i++) {
            res += days[i];
        }

        res += d;

        return res;
    }

    public int countDaysTogether(
        String arriveAlice,
        String leaveAlice,
        String arriveBob,
        String leaveBob
    ) {

        int startA = parse(arriveAlice);
        int endA = parse(leaveAlice);

        int startB = parse(arriveBob);
        int endB = parse(leaveBob);

        int overlap = Math.min(endA, endB)
                    - Math.max(startA, startB) + 1;

        return overlap > 0 ? overlap : 0;
    }
}