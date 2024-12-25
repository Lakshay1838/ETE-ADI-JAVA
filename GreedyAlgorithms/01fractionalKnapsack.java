
class Result {

    static class Item {

        int value, weight;

        // Constructor
        Item(int weight, int value) {
            this.value = value;
            this.weight = weight;
        }
    }

    static double fractionalKnapsack(int val[], int weight[], int n, int capacity) {

        List<Item> items = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            items.add(new Item(weight[i], val[i]));
        }

        items.sort((a, b) -> Double.compare((double) b.value / b.weight, (double) a.value / a.weight));

        double maxi = 0.0;

        for (Item item : items) {
            if (capacity >= item.weight) {
                maxi += item.value;
                capacity -= item.weight;
            } else {
                maxi += item.value * ((double) capacity / item.weight);
                break;
            }
        }
        return maxi;
    }
}
