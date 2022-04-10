package pl.plurasight.oopjava;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static pl.plurasight.oopjava.BusinessCustomer.BusinessSize.LARGE;

public class Main {

    public static void main(String[] args) {
       Customer janeDoe = new Customer("Jakub Duda", 5420238236234823L);
       Customer acme = new BusinessCustomer("Acme Products", 5420238236234823L, LARGE);
       Customer globex = new BusinessCustomer("Dudex", 2423874236742734L, LARGE);
       Customer saveTheWorld = new NonprofitCustomer("Save Ukraine", 19863182731897263L);
       BusinessCustomer acme2 = new BusinessCustomer("Acme Products", 5420238236234823L, LARGE);

       List<Customer> customers = List.of(janeDoe, acme, globex, saveTheWorld);

       Map<Integer, Long> discountMap = customers.stream().collect(Collectors.groupingBy(Customer::calculateDiscount, Collectors.counting()));

       System.out.println(discountMap);
//       Druga opcja zliczenia klientów grupując po promocji
//       HashMap<Integer, Long> discountsMap = new HashMap<>();
//       for(Customer c : customers){
//           discountsMap.merge(c.calculateDiscount(), 1L, Long::sum);
//       }

        acme2.testMethod();

    }

}
