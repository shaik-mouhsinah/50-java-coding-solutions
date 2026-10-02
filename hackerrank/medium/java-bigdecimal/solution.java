

       Arrays.sort(s, 0, n, new Comparator<String>() {
    public int compare(String a, String b) {
        BigDecimal x = new BigDecimal(a);
        BigDecimal y = new BigDecimal(b);

        return y.compareTo(x);
        }
  });

