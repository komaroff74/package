import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MonthServiceTest {
    @Test
    void shouldCalculateForURegisteredAndUnderLimit() {
        MonthService service = new MonthService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        long expected = 2;
        long actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}
