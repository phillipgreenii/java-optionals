package ii.green.phillip.optionals;


public class NullsPersonService {

    public Person lookupPerson(final long id){
        return Person.REPOSITORY.getOrDefault(id, null);
    }

    
}
