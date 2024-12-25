class Result {
    public static int getPairsCount(int[] arr, int n, int k) {
      HashMap<Integer, Integer> map = new HashMap<>();
      int count = 0;
      // Store frequencies of each element
      for (int value : arr) {
          map.put(value, map.getOrDefault(value, 0) + 1);
      }
      for (int value : arr) {
          int complement = k - value;
          // Check if complement exists
          if (map.containsKey(complement)) {
              count += map.get(complement);
              // If complement is same as the value, decrease one count to avoid self-pairing
              if (complement == value) {
                  count--;
              }
          }
      }
      // Since each pair is counted twice, divide by 2
      return count / 2;
  }
}