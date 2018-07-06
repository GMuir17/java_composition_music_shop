package Items;

public class Capo {

    private String description;
    private int buyingPrice;
    private int sellingPrice;

    public Capo(String description, int buyingPrice, int sellingPrice) {
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String getDescription() {
        return this.description;
    }



}
