

public class Store {
    public static void main(String[] args) {
   /*     ProductForSale[] products = {
                new Chocolate("Bitter", 25, "With Nuts", 30),
                new Coke("Zero Sugar", 30, "with lemon", 15),
                new Bread("French", 5, "public bread", 14)
        };

        listProducts(products); */
        Monster troll = new Troll("Trundle", 25,34.5);
        Monster werewolf = new Werewolf("Van Helsing", 30, 50.7);
        Monster vampire = new Vampire("Dracula", 50, 79.8);

        System.out.println("____________Troll_Damage___________________");
        System.out.println("Troll bleed damage: " + troll.bleed());
        System.out.println("Troll poison damage: " + troll.poison());
        System.out.println("Troll all damage: " + troll.attack());

        System.out.println("____________Werewolf_Damage___________________");
        System.out.println("Werewolf bleed damage: " + werewolf.bleed());
        System.out.println("Werewolf poison damage: " + werewolf.poison());
        System.out.println("Werewolf all damage: " + werewolf.attack());

        System.out.println("____________Vampire_Damage___________________");
        System.out.println("Vampire bleed damage: " + vampire.bleed());
        System.out.println("Vampire poison damage: " + vampire.poison());
        System.out.println("Vampire all damage: " + vampire.attack());
    }
/*
    public static void listProducts(ProductForSale[] products) {
         for(ProductForSale product : products){
             product.showDetails();
             System.out.println("*********************************");
         }


    }

 */
}