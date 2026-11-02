package frc.robot;


import lombok.Getter;

@Getter
public class MarsRover {

    byte roverId;

    int statusCode; // hex

    long distanceTraveled; // in meters

    float batteryLevel; // percentage

    double exactOrbitSpeed; // in km/h

    char signalQuality;

    boolean oxygenGenerator;

    public MarsRover(byte roverId, int statusCode, long distanceTraveled, float batteryLevel,
                     double exactOrbitSpeed, char signalQuality, boolean oxygenGenerator) {
        this.roverId = roverId;
        this.statusCode = statusCode;
        this.distanceTraveled = distanceTraveled;
        this.batteryLevel = batteryLevel;
        this.exactOrbitSpeed = exactOrbitSpeed;
        this.signalQuality = signalQuality;
        this.oxygenGenerator = oxygenGenerator;
    }

    public void renderData(int missionCycles) {

        StringBuilder buffer = new StringBuilder();

        buffer.append("=============================================\n");
        buffer.append("           MARS ROVER TELEMETRY HUB          \n");
        buffer.append("=============================================\n");
        buffer.append(" Mission Cycles                 : ").append(missionCycles).append("\n");
        buffer.append(" SectorID (Binary ").append(String.format("0b%8s", Integer.toBinaryString(roverId & 0xFF))
                .replace(' ', '0')).append(")   : ").append((int) roverId).append("\n");
        buffer.append(" System hex Status              : ").append(statusCode).append("\n");
        buffer.append(" Distance Traveled              : ").append(distanceTraveled).append(" m\n");
        buffer.append(" Signal Grade                   : ").append(signalQuality).append("\n");
        buffer.append("---------------------------------------------\n");
        buffer.append(" Orbit Speed (Exact)            : ").append(exactOrbitSpeed).append(" km/h\n");
        buffer.append(" HUD Display Speed (int)        : ").append((int)exactOrbitSpeed).append(" km/h\n");
        buffer.append(" Power Consumed                 : ").append(batteryLevel).append('%').append("\n");;
        buffer.append("---------------------------------------------\n");
        buffer.append(" Systems Nominal                : ").append(batteryLevel >= 20F && oxygenGenerator).append("\n");;
        buffer.append("=============================================\n");


        System.out.println(buffer);
    }

    public static class Builder {

        byte roverId;

        int statusCode; // hex

        long distanceTraveled; // in meters

        float batteryLevel; // percentage

        double exactOrbitSpeed; // in km/h

        char signalQuality;

        boolean oxygenGenerator;

        public Builder setRoverId(byte roverId) {
            this.roverId = roverId;
            return this;
        }

        public Builder setStatusCode(int statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public Builder setDistanceTraveled(long distanceTraveled) {
            this.distanceTraveled = distanceTraveled;
            return this;
        }

        public Builder setBatteryLevel(float batteryLevel) {
            this.batteryLevel = batteryLevel;
            return this;
        }

        public Builder setExactOrbitSpeed(double exactOrbitSpeed) {
            this.exactOrbitSpeed = exactOrbitSpeed;
            return this;
        }

        public Builder setSignalQuality(char signalQuality) {
            this.signalQuality = signalQuality;
            return this;
        }

        public Builder setOxygenGenerator(boolean oxygenGenerator) {
            this.oxygenGenerator = oxygenGenerator;
            return this;
        }



        public MarsRover build() {
            return new MarsRover(roverId, statusCode, distanceTraveled, batteryLevel, exactOrbitSpeed, signalQuality, oxygenGenerator);
        }
    }
}
