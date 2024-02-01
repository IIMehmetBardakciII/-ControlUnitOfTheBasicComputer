public class IR {
    private String[] word = new String[16];
    private static String Icode;
    private static String OPcode;
    private String InstructorKey;
    private String InstructorName;
    static String timer = "0";
    MemoryAi Memory = new MemoryAi();
    RegisterAi Register = new RegisterAi();
    IOInstructors IoInstructor = new IOInstructors();

    public void getInstructor() throws InterruptedException {
        for (int i = 0; i < word.length; i++) {
            timer = String.valueOf(i);
            if (getOPcode(i).equals("7")) {

                if (getIcode(i).equals("0")) {
                    InstructorName = Register.getInstructorName(word[i]);
                    InstructorKey = Register.getInstructorKey(word[i]);

                } else if (getIcode(i).equals("1")) {
                    InstructorName = IoInstructor.getInstructorName(word[i]);
                    InstructorKey = IoInstructor.getInstructorKey(word[i]);

                }
            } else {
                InstructorKey = word[i].substring(4, 16);
                InstructorName = Memory.getInstructorName(word[i]);
            }

            Thread.sleep(1000);
                
            System.out.println("T"+timer+" I="+getIcode(i)+" D"+getOPcode(i)+" aktif"+" IR(11-0) = "+InstructorKey+" buyruk = " + InstructorName);

        }
    }

   

    public String getInstructorKey() {
        return InstructorKey;
    }

    public void setInstructorKey(String instructorKey) {
        InstructorKey = instructorKey;
    }

    public String getInstructorName() {
        return InstructorName;
    }

    public void setInstructorName(String instructorName) {
        InstructorName = instructorName;
    }

    public String getIcode(int i) {
        Icode=String.valueOf(word[i].charAt(0));
        return Icode;
    }

    public void setIcode(String icode) {
        Icode = icode;
    }

    public String getOPcode(int i) {
            OPcode = String.valueOf(word[i].charAt(1));
            OPcode += String.valueOf(word[i].charAt(2));
            OPcode += String.valueOf(word[i].charAt(3));
        return binaryTurnToDecimal(OPcode);
    }

    public void setOPcode(String oPcode) {
        OPcode = oPcode;
    }

    public String[] getWord() {
        return word;
    }

    public void setWord(String[] word) {
        this.word = word;
    }

    public String binaryTurnToDecimal(String Opcode){
        int total=0;
        int tempOp=Integer.parseInt(Opcode);
        for(int i =0; i<Opcode.length();i++){
            int digit=tempOp%10;
            tempOp/=10;
            if(digit!=0){
                total += digit*Math.pow(2,i);
            }
        }
        
        return String.valueOf(total);
    }
}
