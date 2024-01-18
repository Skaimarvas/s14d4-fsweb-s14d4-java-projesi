public class Chocolate extends ProductForSale{
    private int cacaoSize;
    public Chocolate(String type, int price, String description, int cacaoSize) {
        super(type, price, description);
        this.cacaoSize = cacaoSize;
    }

    public int getCacaoSize() {
        return cacaoSize;
    }

    @Override
    public void showDetails() {
        System.out.println(getClass().getSimpleName() + " details: ");
        System.out.println("Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("CacaoSize: " + getCacaoSize());
        System.out.println("__________________________________________");
    }
}
