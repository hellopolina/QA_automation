import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.alfabank.homework14.utils_14_2.XMLUtils;

public class Tests_XmlUtils {

    @Test
    void happyPath() {
        String tag = XMLUtils.createEmptyElement("RESERVE_NAMES");
        Assertions.assertEquals("<RESERVE_NAMES></RESERVE_NAMES>", tag, "Invalid tag in result");
    }

    @Test
    void emptyString() {
        String tag = XMLUtils.createEmptyElement("");
        Assertions.assertEquals("<invalid/>", tag, "Not invalid tag returned");
    }

    @Test
    void nullTag() {
        String tag = XMLUtils.createEmptyElement(null);
        Assertions.assertEquals("<invalid/>", tag, "Not invalid tag returned");
    }
}
