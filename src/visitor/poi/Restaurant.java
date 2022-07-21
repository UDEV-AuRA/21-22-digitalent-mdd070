package visitor.poi;

public class Restaurant implements Lieu {
    private String type;

    public String getType() {
        return type;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.doForRestaurant(this);
    }
}
