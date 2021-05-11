package Homework5;

public class TestHomework {
    public static void main(String[] args) {
        KnapsackK knapsack = ReadData();
        RecursiveSolution solution1 = new RecursiveSolution(knapsack);
    }

    private static KnapsackK ReadData() {
        KnapsackK knapsackVariable=new KnapsackK();
        ItemK []items =new ItemK[10];
        for(int i=0;i<10;i++){
            items[i]=new ItemK(String.valueOf(i));
        }
/*
 int val[] = {22, 20, 15, 30, 24, 54, 21, 32, 18, 25};
        int wt[] = {4, 2, 3, 5, 5, 6, 9, 7, 8, 10};
 */
        items[0].setValue(22);
        items[1].setValue(20);
        items[2].setValue(15);
        items[3].setValue(30);
        items[4].setValue(24);
        items[5].setValue(54);
        items[6].setValue(21);
        items[7].setValue(32);
        items[8].setValue(18);
        items[9].setValue(19);

        items[0].setWeight(4);
        items[1].setWeight(2);
        items[2].setWeight(3);
        items[3].setWeight(5);
        items[4].setWeight(5);
        items[5].setWeight(6);
        items[6].setWeight(9);
        items[7].setWeight(7);
        items[8].setWeight(8);
        items[9].setWeight(10);

        int knapsackCapacity=30;
        knapsackVariable.items=items;
        knapsackVariable.knapsackCapacity=knapsackCapacity;

        return knapsackVariable;

    }
}