package petshop;

public class TestePetShop {
    public static void main(String[] args) {
        // verificar faturamento total
        // dar banho
        // dar banho com desconto
        // verificar pet

        PetShop petShop01 = new PetShop("Pet Shop Boys");
        PetShop petShop02 = new PetShop("Pet Street Boys");
        Pet pet1 = new Pet("Bob", "Vira-Lata");

        System.out.println("petshop.Pet");
        System.out.println(pet1);
        System.out.println("\npetshop.PetShop");
        System.out.println(petShop01);

        petShop01.darBanho(pet1, 100.);

        System.out.println("petshop.Pet");
        System.out.println(pet01);
        System.out.println("\npetshop.PetShop");
        System.out.println(petShop01);

        System.out.println("\npetshop.PetShop 2");
        System.out.println(petShop02);

        petShop02.darBanho(pet1, 80.);

        System.out.println("petshop.Pet");
        System.out.println(pet01);
        System.out.println("\npetshop.PetShop 2");
        System.out.println(petShop02);

    }
}
