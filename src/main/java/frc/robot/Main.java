package frc.robot;

import java.util.Arrays;
import java.util.Objects;

public class Main {

    public static void main(String... args)
    {
        // MODE: default | loop
        String mode = args.length > 0 ? args[0] : "default";
        System.out.println("Mode: " + mode);

        if(!Objects.equals(mode, "default") && !Objects.equals(mode, "loop")){
            throw new IllegalArgumentException("Invalid mode: " + mode + ". Valid modes are 'default' and 'loop'.");
        }

        switch(mode){
            case "loop": {
                LittleMonkeyLoops monkeys = new LittleMonkeyLoops(5, true);
                monkeys.renderAll();
                break;
            }
            default: {
                LittleMonkeys monkeys = new LittleMonkeys(5, true);
                monkeys.renderJumpingMonkeyText();
                break;
            }
        }

    }

}
