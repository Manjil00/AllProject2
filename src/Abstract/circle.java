package Abstract;

public class circle extends Shape
{
    private float radius;

    circle(float radius)
    {
        this.radius=radius;
    }
    @Override
    protected float area()
    {
        return 3.14f*radius*radius;
    }
}
