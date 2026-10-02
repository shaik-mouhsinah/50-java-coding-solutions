

class Add {

    void add(int... numbers) {

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum = sum + numbers[i];

            if (i > 0) {
                System.out.print("+");
            }

            System.out.print(numbers[i]);
        }

        System.out.println("=" + sum);
    }
}
