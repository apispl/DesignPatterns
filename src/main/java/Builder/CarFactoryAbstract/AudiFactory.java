package Builder.CarFactoryAbstract;

public class AudiFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        AudiEngine myAudiEng = new AudiEngine();
        myAudiEng.setType("v6");
        myAudiEng.setHorsePower(120);
        return myAudiEng;
    }

    @Override
    public Body createBody() {
        AudiBody myAudiBody = new AudiBody();
        myAudiBody.setSize(1);
        myAudiBody.setType("racing");
        return myAudiBody;
    }
}
