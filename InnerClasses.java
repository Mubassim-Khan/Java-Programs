package Examples;

// Nested Classes
/*
class CPU {
    double price;

    public class Processsor {
        int Cores;
        String manufacturer;
        public double Cache() {
            return 4.5;
        }
    }

    public class RAM {
        int Memory;
        String manufacturer;

        double clockSpeed() {
            return 7.9;
        }
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        CPU.Processsor processsor = cpu.new Processsor();
        CPU.RAM ram = cpu.new RAM();

        System.out.println("RAM clockspeed: " + ram.clockSpeed());
        System.out.println("Processor Cache: " + processsor.Cache());
    }
}
*/

// Accessing members of outer class
/*
class Car {
    String carName;
    String engineType;

    Car(String car, String engine){
        this.carName = car;
        this.engineType = engine;
    }

    private String getCarName() {
        return this.carName;
    }

    public class Engine {
        String engineSize;
        public void engineType() {
            if (Car.this.engineType.equals("800 CC")) {
                if (Car.this.getCarName().equals("Mehran")) {
                    this.engineSize = "Small";
                } else {
                    this.engineSize = "Big";
                }
            } else {
                this.engineSize = "Big";
            }
        }
        String getEngineSize() {
            return this.engineSize;
        }
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        Car car = new Car("Porsche", "3200 CC");

        Car.Engine engine = car.new Engine();
        engine.engineType();
        System.out.println("Getting Engine Type: " + engine.getEngineSize());
    }
}
*/


