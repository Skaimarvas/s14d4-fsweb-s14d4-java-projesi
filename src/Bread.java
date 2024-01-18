public class Bread extends ProductForSale {
    private int wheatSize;
    public Bread(String type, int price, String description, int wheatSize) {
        super(type, price, description);
        this.wheatSize = wheatSize;
    }

    public int getWheatSize() {
        return wheatSize;
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getSimpleName() + " details: ");
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("CacaoSize: " + getWheatSize());
        System.out.println("__________________________________________");
    }
}
