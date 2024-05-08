import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {

        String inputString = "2023-03-01T13:00:00Z";

        OffsetDateTime dateTime = OffsetDateTime.parse(inputString);
        int year = dateTime.getYear();
        int month = dateTime.getMonthValue();
        int day = dateTime.getDayOfMonth();
        DayOfWeek dayOfWeek = dateTime.getDayOfWeek();

        assertEquals(2023, year);
        assertEquals(3, month);
        assertEquals(1, day);
        assertEquals(DayOfWeek.WEDNESDAY, dayOfWeek);
    }
    }
