package ahud.ahudtemplate;

import ahud.adaptivehud.renderhud.variables.annotations.SetDefaultGlobalFlag;
import ahud.adaptivehud.renderhud.variables.annotations.SpecialFlagName;

import java.util.Objects;

public class Variables {

    // Creates a variable named "example1" which will display "example".
    public String example1() {
        return "example";
    }

    // Creates a variable named "example2" that will return "potato"
    // And also apply the global flag "uc", meaning it will display "POTATO".
    @SetDefaultGlobalFlag(flag = "uc")
    public String example2() {
        return "potato";
    }

    // Creates a variable named "example3" with a local flag "PARTY"
    // If the user then does "{example3 --PARTY=party}" it will display "PARTYYYY" otherwise "boooring".
    public String example3(@SpecialFlagName("PARTY") String text) {
        if (text == null) {
            return "eyo, use da flag!";
        }
        if (text.equalsIgnoreCase("party")) {
            return "PARTYYYY";
        } else {
            return "boooring";
        }
    }
}
