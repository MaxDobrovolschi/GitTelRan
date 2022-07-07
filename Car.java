package Vehicle;

//  Характеристики Keonigsegg Gemera

//  ? Я не особо понял как создать массив и добавить все объекты моего класса в него. ?
// Так же Конструктор копирования мне не совсем понятен.

public class Car {
    private int EnginePower;
    private int ElectricRange;
    private int BatteryCapacity;
    private int Engine;
    private int TurboRPM;
    private int YearOfProduction;
    private String Class;



    public static void main(String[] args) {
        Car Keonigsegg = new Car(1700, 50, 52, 2, 8500);

        int EP = Keonigsegg.getEnginePower();
        int ER = Keonigsegg.getElectricRange();
        int BC = Keonigsegg.getBatteryCapacity();
        int EL = Keonigsegg.getEngine();
        int TRPM = Keonigsegg.getTurboRPM();
        int PY = Keonigsegg.getYearOfProduction();
        String class1 = String.valueOf(Keonigsegg.getClass());


        Keonigsegg.setEnginePower(1700);
        Keonigsegg.setTurboRPM(8500);
        Keonigsegg.setBatteryCapacity(52);
        Keonigsegg.setEngine(2);
        Keonigsegg.setElectricRange(50);
        Keonigsegg.setYearOfProduction(2021);
        Keonigsegg.setClass("Grand Tourer");

        System.out.println("Total engine output is: " + EP + "HP");
        System.out.println("Total electric range is: " + ER + "KM");
        System.out.println("Total battery capacity is: " + BC + "MJ");
        System.out.println("The type of engine is: " + EL + ".0 Litters");
        System.out.println("Total turbo rpm output is: " + TRPM + " RPM");
        System.out.println("Class type of this car is: " + class1);
        System.out.println("The production year is: " + PY);

    }

    private int getYearOfProduction() {
        return YearOfProduction;
    }

    public Car(int EnginePower, int ElectricRange, int BatteryCapacity, int Engine, int TurboRPM) {

        this.EnginePower = EnginePower;
        this.ElectricRange = ElectricRange;
        this.BatteryCapacity = BatteryCapacity;
        this.Engine = Engine;
        this.TurboRPM = TurboRPM;

    }

    public Car(Car Keonigsegg) {
        this.YearOfProduction = Keonigsegg.YearOfProduction;
        this.Class = Keonigsegg.Class;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public void setEnginePower(int enginePower) {
        if(this.EnginePower > 0) {
            this.EnginePower = enginePower;
        }
    }

    public int getElectricRange() {
        return ElectricRange;
    }

    public void setElectricRange(int electricRange) {
        if(this.ElectricRange > 0) {
            this.ElectricRange = electricRange;
        }
    }

    public int getBatteryCapacity() {
        return BatteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        if(this.BatteryCapacity > 0) {
            this.BatteryCapacity = batteryCapacity;
        }
    }

    public int getEngine() {
        return Engine;
    }

    public void setEngine(int engine) {
        if(this.Engine > 0) {
            this.Engine = engine;
        }
    }

    public int getTurboRPM() {
        return TurboRPM;
    }

    public void setTurboRPM(int turboRPM) {
        if(this.TurboRPM > 0) {
            this.TurboRPM = turboRPM;
        }
    }

    public void setYearOfProduction(int YearOfProduction) {
        this.YearOfProduction = YearOfProduction;
    }

    public void setClass(String Class) {
        this.Class = Class;
    }
}

