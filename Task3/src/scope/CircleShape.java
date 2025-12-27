package scope;

public class CircleShape implements Shape {

    private Draw3d draw3d;
    private Draw2d draw2d;

    public CircleShape(Draw3d draw3d, Draw2d draw2d) {
        this.draw3d = draw3d;
        this.draw2d = draw2d;
    }

    @Override
    public void draw2d(String shape) {
        draw2d.Draw(shape);
    }
    @Override
    public void draw3d(String shape) {
        draw3d.Draw(shape);
    }

    public void setDraw3d(Draw3d draw3d) {
        this.draw3d = draw3d;
    }

    public void setDraw2d(Draw2d draw2d) {
        this.draw2d = draw2d;
    }
}
