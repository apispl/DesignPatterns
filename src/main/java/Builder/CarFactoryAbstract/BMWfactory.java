package Builder.CarFactoryAbstract;

public class BMWfactory implements CarFactory {
    @Override
    public Engine createEngine() {
        BMWengine myBMWEng = new BMWengine();
        myBMWEng.setType("v6");
        myBMWEng.setHorsePower(120);
        return myBMWEng;
    }

    @Override
    public Body createBody() {
        BMWbody myBMWBody = new BMWbody();
        myBMWBody.setSize(1);
        myBMWBody.setType("racing");
        return myBMWBody;
    }
}
