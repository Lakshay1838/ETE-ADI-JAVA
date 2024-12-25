
class Result {

    static class Interval {

        int start, end;

        Interval(int s, int e) {
            this.start = s;
            this.end = e;
        }
    }

    static int intervalScheduling(int[] start, int[] end) {
        // Write your code here
        List<Interval> intervals = new ArrayList<>();
        for (int i = 0; i < start.length; i++) {
            intervals.add(new Interval(start[i], end[i]));
        }

        intervals.sort((a, b) -> Integer.compare(a.end, b.end));

        int count = 0;
        int currentEndTime = -1;

        for (Interval interval : intervals) {
            if (interval.start >= currentEndTime) {
                count++;
                currentEndTime = interval.end;
            }
        }
        return count;
    }
}
