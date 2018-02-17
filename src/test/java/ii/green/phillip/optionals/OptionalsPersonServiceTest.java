package ii.green.phillip.optionals;
import org.junit.Test;
import org.junit.Before;
import org.junit.rules.ErrorCollector;
import java.util.Optional;
import org.junit.Rule;

import static org.hamcrest.Matchers.*;

public class OptionalsPersonServiceTest {
    
    private OptionalsPersonService service;
    
    @Rule
    public ErrorCollector errorCollector = new ErrorCollector();

    @Before
    public void setup() {
        service = new OptionalsPersonService();
    }
    
    @Test
    public void itShouldReturnPresentOptionalWithValueWhenFound() {
        Optional<Person> result = service.lookupPerson(1L);
        this.errorCollector.checkThat(result.isPresent(), is(true));
    }
    
    @Test
    public void itShouldReturnNonPresentOptionalWhenValueNotFound() {
        Optional<Person> result = service.lookupPerson(2L);
        this.errorCollector.checkThat(result.isPresent(), is(false));
    }
}
