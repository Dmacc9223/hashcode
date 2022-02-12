
package hashcode_2002;

import hascode_2002.Customer;

import java.util.Map;
import java.util.List;


public class Localscore {
    static List<Customer> customers;
    static Map<String,Integer> ingredient;

    public Localscore(List<Customer> customers, Map ingredient) {
        this.customers = customers;
        this.ingredient = ingredient;
    }
    public static int getScore(){
        int customerCount=0;
        boolean likedStatus;
        boolean dislikedStatus;

        for (Customer customer :customers) {
            likedStatus=true;
            dislikedStatus=true;
            for(String likedIngredient :customer.getLikedIngredients()){
                if(!ingredient.containsKey(likedIngredient)){
                    likedStatus=false;
                    break;
                }
            }
            for(String dislikedIngredient :customer.getDislikedIngredients()){
                if(ingredient.containsKey(dislikedIngredient)){
                    dislikedStatus=false;
                    break;
                }
            }
            if(likedStatus && dislikedStatus)
                customerCount++;
        }

        return customerCount;}
}