package hashcode_2002;

//import hasCustomer;
import hascode_2002.Customer;

import java.util.Comparator;


class CustomerComparator implements Comparator<Customer>{

    @Override
    public int compare(Customer o1, Customer o2) {
        if(o1.getDislikedIngredients().size()==o2.getDislikedIngredients().size()){
            return o1.getLikedIngredients().size()-o2.getLikedIngredients().size();
        }
        return o1.getDislikedIngredients().size()
                -o2.getDislikedIngredients().size();
    }

}