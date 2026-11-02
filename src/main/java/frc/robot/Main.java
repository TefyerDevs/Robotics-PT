package frc.robot;

public final class Main
{
    public static int missionCycles = 1;
    public static void main(String... args)
    {

        MarsRover rover = new MarsRover.Builder()
                .setRoverId((byte) 0b0000000111)
                .setStatusCode(0x2F)
                .setDistanceTraveled(1000L)
                .setBatteryLevel(75.5f)
                .setExactOrbitSpeed(12.34)
                .setSignalQuality('A')
                .setOxygenGenerator(true)
                .build();

        increaseCycles();

        rover.renderData(missionCycles);
    }

    public static void increaseCycles() {
        missionCycles++;
    }
}
