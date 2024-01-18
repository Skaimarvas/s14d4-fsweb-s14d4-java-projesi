public class Coke extends ProductForSale {
    private int caffeineSize;
    public Coke(String type, int price, String description, int caffeineSize) {
        super(type, price, description);
        this.caffeineSize = caffeineSize;
    }

    public int getCaffeineSize() {
        return caffeineSize;
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getSimpleName() + " details: ");
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("CacaoSize: " + getCaffeineSize());
        System.out.println("__________________________________________");
    }
}
