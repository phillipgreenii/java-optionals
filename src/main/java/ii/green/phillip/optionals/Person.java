package ii.green.phillip.optionals;

import java.util.HashMap;
import java.util.Map;

public class Person {
    
     static final Map<Long, Person> REPOSITORY;
     
     static {
         REPOSITORY = new HashMap<>();
         REPOSITORY.put(1L, new Person(1L, "Mr. Potatohead"));
     }
    
    
    private final long id;
    private final String name;
    
    public Person(final long id, final String name) {
        this.id = id;
        this.name = name;
    }
    
    public long getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
}
