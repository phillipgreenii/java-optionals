package ii.green.phillip.optionals;
import org.junit.Test;
import org.junit.Before;
import org.junit.rules.ErrorCollector;
import java.util.Optional;
import org.junit.Rule;

import static org.hamcrest.Matchers.*;

public class NullsPersonServiceTest {
    
    private NullsPersonService service;
    
    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Before
    public void setup() {
        service = new NullsPersonService();
    }
    
    @Test
    public void itShouldReturnValueWhenFound() {
        Person result = service.lookupPerson(1L);
        this.errorCollector.checkThat(result, is(not(nullValue())));
    }
    
    @Test
    public void itShouldReturnNullWhenValueNotFound() {
        Person result = service.lookupPerson(2L);
        this.errorCollector.checkThat(result, is(nullValue()));
    }
}
