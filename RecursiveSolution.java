package Homework5;

import java.util.ArrayList;
import java.util.HashMap;

public class RecursiveSolution {
    private KnapsackK knapsack;
    private ArrayList<ItemK> item;
    private HashMap<String,Integer> objFunc;
    private HashMap<String,Boolean> decision;


    public RecursiveSolution(KnapsackK knapsack) {
        this.knapsack = knapsack;
        this.objFunc = new HashMap<String,Integer>();
        this.decision =new HashMap<String,Boolean>();
        this.item = new ArrayList<ItemK>();
        for (int i = 0; i < knapsack.items.length; i++) {
            this.item.add(this.knapsack.items[i]);
        }
        System.out.println(recursion(item.size()-1,this.knapsack.knapsackCapacity));
    }

    public int recursion(int index, int remainingCapacity) {

        int w = this.item.get(index).getWeight();
        int v = this.item.get(index).getValue();
        boolean check=index!=0;

        if(check){
            int include=0;
            int exclude=0;

            if (remainingCapacity>=w) {
                include = recursion(index - 1, remainingCapacity - w) + v;
                exclude = recursion(index - 1, remainingCapacity);
                if (include < exclude) {
                    this.decision.put((index+"/"+remainingCapacity) , false);
                }
                else if(include > exclude){
                    this.decision.put((index+"/"+remainingCapacity) , true);
                }
                else{
                    this.decision.put((index+"/"+remainingCapacity) , true);
                }
            }
            this.objFunc.put((index+"/"+remainingCapacity) ,Math.max(include, exclude));
        }

        else {
            if (!(w <= remainingCapacity)) {

                this.decision.put((index + "/" + remainingCapacity), false);
                this.objFunc.put((index + "/" + remainingCapacity), 0);
                return 0;
            }
            if ( w <= remainingCapacity) {
                this.decision.put((index + "/" + remainingCapacity), true);
                this.objFunc.put((index + "/" + remainingCapacity), this.item.get(0).getValue());
                return this.item.get(0).getValue();
            }

        }

        return this.objFunc.get((index+"/"+remainingCapacity));

    }

}