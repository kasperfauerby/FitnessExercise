package demo;

public class Member extends Person {

    boolean isBasic;


    public Member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
    }

    public String getMemberType(boolean isBasic) {
        String str;
        if (isBasic == true) {
            str = "Basic";
        } else {
            str = "Full";
        }
        return str;
    }

    public int monthlyFee(boolean isBasic) {
        int fee;
        if (isBasic == true) {
            fee = 199;
        } else {
            fee = 299;
        }
        return fee;
    }


    @Override
    public String toString() {
        return name + "\t\t" + cpr + "\t\t" + getMemberType(isBasic) + "\t\t" + monthlyFee(isBasic) + " kr.";
    }
}