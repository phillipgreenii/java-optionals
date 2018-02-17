package ii.green.phillip.optionals;

public class ExceptionsPersonService {
    
    public Person lookupPerson(final long id){
        return Person.REPOSITORY.computeIfAbsent(id, k->{
           throw new IllegalArgumentException("No person for id: " + k); 
        });
    }
    
}
