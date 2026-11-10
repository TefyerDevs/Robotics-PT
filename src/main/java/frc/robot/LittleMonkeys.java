package frc.robot;

public class LittleMonkeys {

    int numberOfMonkeys;

    boolean isJumping;

    public LittleMonkeys(int numberOfMonkeys, boolean isJumping) {
        this.numberOfMonkeys = numberOfMonkeys;
        this.isJumping = isJumping;
    }


    public void renderJumpingMonkeyText(){
        if(numberOfMonkeys == 1)
            System.out.printf("%d little monkey %b on the bed.%n", numberOfMonkeys, isJumping);
        System.out.printf("%d little monkeys %b on the bed.%n", numberOfMonkeys, isJumping);

        if(numberOfMonkeys < 1) return;
        if(!isJumping) return;

        System.out.println("One fell off and bumped his head.");
        System.out.println("Mama called the doctor and the doctor said,");
        System.out.println('"'+"No more monkeys jumping on the bed!"+'"');

    }
}
