public class ShopAssistant {
    public void showFoodMenu()
    {
        Restaurant rest = new Restaurant();
        rest.getFood();
    }

    public void showClothsCollection()
    {
        ClothsShop cloths=new ClothsShop();
        cloths.showItems();
    }

    public void showPromotions()
    {
        Electronics electronics=new Electronics();
        electronics.printPromotions();
    }

    public void showSeasonRecommendations()
    {
        Hobbies hobbies = new Hobbies();
        hobbies.displaySeasonRecommendations();
    }
}
