package ii.green.phillip.optionals;

import java.util.Optional;

public class OptionalsPersonService {
    
    public Optional<Person> lookupPerson(final long id) {
        return Optional.ofNullable(Person.REPOSITORY.get(id));
    }
    
}
