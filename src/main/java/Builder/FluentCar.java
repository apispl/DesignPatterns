package Builder;

import Builder.Entities.Body;
import Builder.Entities.Engine;

public class FluentCar {
    private String name;
    private String producent;
    private int serialNumber;
    private Engine engine;
    private Body body;

    @Override
    public String toString(){
        return "Object: name-" + name
                + ", producent-" + producent
                + ", serialNumber-" + serialNumber
                + ", engine-" + engine
                + ", body-" + body;
    }

    public static final class FluentBuilder{
        private String name;
        private String producent;
        private int serialNumber;
        private Engine engine;
        private Body body;

        public FluentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public FluentBuilder producent(String producent) {
            this.producent = producent;
            return this;
        }

        public FluentBuilder serialNumber(int serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public FluentBuilder engine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public FluentBuilder body(Body body) {
            this.body = body;
            return this;
        }

        public FluentCar build(){
            if (body.equals(null)){
                throw new IllegalStateException("Name cannot be empty!");
            }
            if (engine.equals(null)){
                throw new IllegalStateException("Name cannot be empty!");
            }

            FluentCar fluentCar = new FluentCar();
            fluentCar.name = this.name;
            fluentCar.producent = this.producent;
            fluentCar.serialNumber = this.serialNumber;
            fluentCar.engine = this.engine;
            fluentCar.body = this.body;
            return fluentCar;
        }
    }
}
