package Homework5;

public class ItemK {
    private String itemId;
    private int value;
    private int weight;

    ItemK(String itemId){
        this.itemId=itemId;
    }
    public void setValue(int value) {
        this.value=value;
    }
    public void setWeight(int weight) {
        this.weight=weight;
    }
    public int getValue() {
        return this.value;
    }
    public int getWeight() {
        return this.weight;
    }
    public String getItemId(){
        return this.itemId;
    }
}

