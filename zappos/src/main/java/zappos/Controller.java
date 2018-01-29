package zappos;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;


import zappos.Restaurant;
import zappos.RestaurantRepository;

@RestController
@RequestMapping(path="/restaurant")
public class Controller {

        @Autowired
        private RestaurantRepository restaurantRepository;
        
								@GetMapping("/add")
								public @ResponseBody String addNewRestaurant (@RequestParam String name
																								, @RequestParam String addr) {

																Restaurant r = new Restaurant();
																r.setName(name);
																r.setaddr(addr);
																restaurantRepository.save(r);
																return "Saved";
								}
 
        @GetMapping(path="/list")
        public @ResponseBody Iterable<Restaurant> getAllUsers() {
		              return restaurantRepository.findAll();
       	}
}
