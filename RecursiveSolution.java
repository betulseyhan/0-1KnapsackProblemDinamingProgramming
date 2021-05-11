package Homework5;

import java.util.ArrayList;
import java.util.HashMap;

public class RecursiveSolution {
    private KnapsackK knapsack;
    private int[][] decision;
    private int[][] objFunc;
    private ArrayList<ItemK> item;
    //private HashMap<String, Boolean> decisions;
    //private HashMap<String, Integer> objFunc;

    public RecursiveSolution(KnapsackK knapsack) {
        this.knapsack = knapsack;
        int x = this.knapsack.knapsackCapacity + 1;
        //this.decisions = new HashMap<String, Boolean>();
        //this.objFunc=new HashMap<String, Integer>();
        this.objFunc = new int[x][x];
        this.decision = new int[x][x];
        this.item = new ArrayList<ItemK>();
        for (int i = 0; i < knapsack.items.length; i++) {
            this.item.add(this.knapsack.items[i]);
        }
        System.out.println(recursion(item.size()-1,this.knapsack.knapsackCapacity));
    }

    public int recursion(int index, int remainingCapacity) {
        int take = 0;
        int leave = 0;
        int w = this.item.get(index).getWeight();
        int v = this.item.get(index).getValue();
        if (index == 0) {
            if (w <= remainingCapacity) {
                this.objFunc[index][remainingCapacity] = 1;
                this.decision[index][remainingCapacity] =this.item.get(0).getValue();
                return this.item.get(0).getValue();
            } else {
                // current item not picked as its size exceeds the capacity of the sack
                // hence value not stored
                this.objFunc[index][remainingCapacity] = 0;
                this.decision[index][remainingCapacity] = 0;
                return 0;
            }
        }
        if (w <= remainingCapacity)
            take = recursion(index - 1, remainingCapacity - w) + v;

        // Choice 2 - of not picking it up.
        leave = recursion(index - 1, remainingCapacity);

        // optimal solution, Maximized value stored
        decision[index][remainingCapacity] = Math.max(take, leave);

        // if the item which i am picking gives the optimal solution then
        // i will store it
        if (take > leave) {
            objFunc[index][remainingCapacity] = 1;
        } else {
            objFunc[index][remainingCapacity] = 0;
        }
        // returning the optimal solution
        return decision[index][remainingCapacity];

    }

}