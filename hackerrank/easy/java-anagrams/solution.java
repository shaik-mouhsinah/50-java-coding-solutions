

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);

        return java.util.Arrays.equals(arr1, arr2);
    }
    

