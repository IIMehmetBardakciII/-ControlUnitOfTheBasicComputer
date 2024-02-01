import java.util.Map;
import java.util.TreeMap;

public class IOInstructors extends Instructors {
    static Map<String, String> instructors = new TreeMap<>();

    public IOInstructors() {
        inputTheInstructurs();
    }

    @Override
    public void inputTheInstructurs() {
        instructors.put("100000000000", "INP");
        instructors.put("010000000000", "OUT");
        instructors.put("001000000000", "SKI");
        instructors.put("000100000000", "SKO");
        instructors.put("000010000000", "ION");
        instructors.put("000001000000", "IOF");

    }

    public String getInstructorName(String instructor) {
        String name = "";
        for (Map.Entry<String, String> entry : instructors.entrySet()) {
            if (entry.getKey().equals(instructor.substring(4, 16))) {
                name = entry.getValue();
                return name;
            }
        }

        return name;

    }

    public String getInstructorKey(String instructor) {
        String key = "";
        for (Map.Entry<String, String> entry : instructors.entrySet()) {
            if (entry.getKey().equals(instructor.substring(4, 16))) {
                key = entry.getKey();
                return key;
            }
        }

        return key;

    }
}
