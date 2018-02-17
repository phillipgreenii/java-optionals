package ii.green.phillip.optionals;
import org.junit.Test;
import org.junit.Before;
import org.junit.rules.ErrorCollector;
import java.util.Optional;
import org.junit.Rule;

import static org.hamcrest.Matchers.*;

public class ExceptionsPersonServiceTest {
    
    private ExceptionsPersonService service;
    
    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Before
    public void setup() {
        service = new ExceptionsPersonService();
    }
    
    @Test
    public void itShouldReturnValueWhenFound() {
        Person result = service.lookupPerson(1L);
        this.errorCollector.checkThat(result, is(not(nullValue())));
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void itShouldThrowWhenValueNotFound() {
        service.lookupPerson(2L);
    }
}
