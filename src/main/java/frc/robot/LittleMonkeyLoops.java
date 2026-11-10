package frc.robot;

public class LittleMonkeyLoops {

    int numberOfMonkeys;

    boolean isJumping;

    public LittleMonkeyLoops(int numberOfMonkeys, boolean isJumping) {
        this.numberOfMonkeys = numberOfMonkeys;
        this.isJumping = isJumping;
    }

    public void renderAll(){
        System.out.println("=== 1. For Loop: The Nursery Rhyme Countdown ===");
        for(int i = numberOfMonkeys; i > 0; i--){
            renderJumpingMonkeyText(i);
        }

        System.out.println("\n=== 2. While Loop: The Doctor's Checkup Routine ===");

        int count = 0;
        while(count < numberOfMonkeys){
            renderDoctorCheckupMonkeysText(numberOfMonkeys - count);
            count++;
        }

        System.out.println("\n=== 3. Do-While Loop: Bedtime Verification ===");
        count = 0;
        do{
            renderBedMonkeysText(numberOfMonkeys - count);
            count++;
        } while(count < numberOfMonkeys);
    }

    private void renderBedMonkeysText(int index) {
        System.out.println("Tucking in monkey #" + index + "... Fast Asleep!");
    }

    private void renderDoctorCheckupMonkeysText(int index) {
        System.out.println("Doctor checkup for monkey #" + index + "... All Cleared!");
    }


    public void renderJumpingMonkeyText(int monkeyNumber){
        if(numberOfMonkeys == 1)
            System.out.printf("%d little monkey %b on the bed.%n", monkeyNumber, isJumping);
        System.out.printf("%d little monkeys %b on the bed.%n", monkeyNumber, isJumping);

        if(!isJumping) return;

        System.out.println("One fell off and bumped his head.");
        System.out.println("Mama called the doctor and the doctor said,");
        System.out.println('"'+"No more monkeys jumping on the bed!"+'"');

    }
}
