public class FootShape{
    public String drawAsEllipse(){
        Ellipse ellipse = new Ellipse();
        return ellipse.draw();
    }

    public String drawAsRectangle(){
        Rectangle rec = new Rectangle();
        return rec.draw();
    }
}