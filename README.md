p align="center">
  <h1 align="center"><br></br><br>🎒 0-1 Knapsack Problem Dinaming Programming<br></br></h1>

  <p align="center">
The algorithm proposed was aimed to solve the Knapsack problem recursively.
    <br>
  </p>
  
Solve the Knapsack problem using a recursion

## Here are the rules:
All of this code must be in a RecursiveSolution class. The constructor should take the Knapsack problem, make necessary adjustments and makes the necessary calls to methods to print out the optimal solution for the problem.
The items should be ordered first. You can use the index or keep them in an ArrayList to indicate which order you are considering adding items to the knapsack. The way they are ordered will not change the optimal solution, but you need preserve an order for correctness.
Create an array of arrays (or use hashmaps instead of arrays), named decisions, that has for each item and possible value of remaining capacity, if it is optimal to include this item as a boolean. Of course the items should be ordered.
Create an array of arrays (or use hashmaps instead of arrays), named objFunc, that has for each item and possible value of remaining capacity, what is the optimal objective function value from this point forward. Of course the items should be ordered.
At some point you will call a method that solves the problem in a recursive fashion. Let the name of the recursive method be recursion that takes two inputs. Item (or index of the item), and available remaining capacity.
You will call this method, named recursion, with the first item and knapsack capacity in the problem and it will give you the optimal solution.
Recursion will consist of the following:
A decision to either include the item under consideration or not.
If the item is excluded, the same recursive method should be called for the next item with the same remaining capacity.
If the item is included, the associated reward should be added, capacity of the item must be subtracted from the available capacity (if sufficient), and the same recursive method should be called for the next item with that updated remaining capacity.
Recursive method cannot immediately decide which decision is better. It should run for all the decisions until the very last item to compute the total reward. And ultimately, it will be able to tell which decision is better and what the associated reward is for any item/remaining capacity under consideration.
Once a decision is made, record the decision to include or not in decisions and the associated objective function value for that point foward to objFunc.
Write down the solution using the decisions and the objFunc. Indicate if each item is included or not, as shown in the below example.

## Example 
Here is a toy example. Suppose we have two items with the following rewards/capacities: 3/5 (item1) and 5/8 (item2) and a total capacity of 11.
Item 1 with capacity 11: max (0 + Item 2 with capacity 11, 3 + Item 2 with capacity 6) [Recursion is called again, no decision yet]
Item 2 with capacity 11: max (0 , 5) [as this is the last item] Set decisions[item2,11]=true, objFunc[item2,11]=5
Item 2 with capacity 6: max (0 , doesn't fit) Set decisions[item2,6]=false, objFunc[item2,6]=0
Now we can go back to the first line, which will be done automatically for you with the recursive calls to the same function.
Item 1 with capacity 11: max (0 + 5, 3 + 0) Set decisions[item1,11]=false, objFunc[item1,11]=5.
Use decisions[item1,11] and objFunc[item1,11] and print out: Do not include item 1, objective function value will be 5, this point forward.
As item 1 is not included we know the remaining capacity will be 11. So use decisions[item2,11] and objFunc[item2,11] and print out: Include item 2, objective function value will be 5, this point forward.
