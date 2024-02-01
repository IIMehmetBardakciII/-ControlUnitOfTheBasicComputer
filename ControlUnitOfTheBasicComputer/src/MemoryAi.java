import java.util.Map;
import java.util.TreeMap;

public class MemoryAi extends Instructors {
    static Map<String, String> instructors = new TreeMap<>();

    public MemoryAi() {
        inputTheInstructurs();
    }

    @Override
    public void inputTheInstructurs() {
        instructors.put("0000", "AND");
        instructors.put("1000", "AND");

        instructors.put("0001", "ADD");
        instructors.put("1001", "ADD");

        instructors.put("0010", "LDA");
        instructors.put("1010", "LDA");

        instructors.put("0011", "STA");
        instructors.put("1011", "STA");

        instructors.put("0100", "BUN");
        instructors.put("1100", "BUN");

        instructors.put("0101", "BSA");
        instructors.put("1101", "BSA");

        instructors.put("0110", "ISZ");
        instructors.put("1110", "ISZ");
    }

    public String getInstructorName(String instructor) {
        String name="";
        for (Map.Entry<String, String> entry : instructors.entrySet()) {
          if(entry.getKey().equals(instructor.substring(0,4))){
            name=entry.getValue();
            return name;
          }
        }

        return name;
    }
}