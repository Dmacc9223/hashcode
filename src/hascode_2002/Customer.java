package hascode_2002;

import java.util.List;


public class Customer {
    private List<String> likedIngredients;
    private List<String> dislikedIngredients;

    public Customer(List<String> likedIngredients, List<String> dislikedIngredients) {
        this.likedIngredients = likedIngredients;
        this.dislikedIngredients = dislikedIngredients;
    }

    public List<String> getLikedIngredients() {
        return likedIngredients;
    }

    public List<String> getDislikedIngredients() {
        return dislikedIngredients;
    }

}