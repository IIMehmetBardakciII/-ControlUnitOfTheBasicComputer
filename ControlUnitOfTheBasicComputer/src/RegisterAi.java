import java.util.Map;
import java.util.TreeMap;

public class RegisterAi extends Instructors {
    static Map<String, String> instructors = new TreeMap<>();

    public RegisterAi() {
        inputTheInstructurs();
    }

    @Override
    public void inputTheInstructurs() {
        instructors.put("100000000000", "CLA");
        instructors.put("010000000000", "CLE");
        instructors.put("001000000000", "CMA");
        instructors.put("000100000000", "CME");
        instructors.put("000010000000", "CIR");
        instructors.put("000001000000", "CIL");
        instructors.put("000000100000", "INC");
        instructors.put("000000010000", "SPA");
        instructors.put("000000001000", "SNA");
        instructors.put("000000000100", "SZA");
        instructors.put("000000000010", "SZE");
        instructors.put("000000000001", "HLT");

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
