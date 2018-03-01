public class SalesPerson {

    private String id;
    private Sales[] salesHistory; // details of the different sales
    private int count = 0;	// number of sales made
    //constructor for a new salesperson public SalesPerson(String id)
    public SalesPerson(String id){
        this.id = id;
    }
    // constructor for a salesperson transferred (together with
// their sales details) from another branch
    public SalesPerson(String id, Sales[] s, int c) {
        //code missing
    }
    public int getCount(){return count;}
    public Sales[] getSalesHistory(){return salesHistory;}
    public String getId() {return id;}
    public void setSalesHistory(Sales s) {
        salesHistory[count] = s;
        count = count + 1;
    }
    public double calcTotalSales() {
        double returnDouble = 0;
        for(int i = 0; i < this.count; i++){
            returnDouble += this.salesHistory[i].getValue();
        }
        return returnDouble;
    }
    public Sales largestSale() // calculates the sale with the largest
// value
    {
// code missing
    }
}
