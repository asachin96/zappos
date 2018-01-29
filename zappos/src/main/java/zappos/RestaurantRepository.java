package zappos;

import org.springframework.data.repository.CrudRepository;

import zappos.Restaurant;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

}
