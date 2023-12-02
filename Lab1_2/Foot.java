public class Foot {
    private FootShape footshape;
    public Foot(FootShape fs){
        this.footshape = fs;
    }
    
    public String draw(int shape){
        switch(shape){
            case 1:
                return footshape.drawAsEllipse();
            case 2:
                return footshape.drawAsRectangle();
        }
        return null;
    }
}
