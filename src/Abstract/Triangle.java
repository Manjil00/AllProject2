package Abstract;

public class Triangle extends Shape
{
    private float height;
    private float base;

    void triangle (float height, float base)
    {
       this.base=base;
       this.height=height;
    }

    @Override
    protected float area()
    {
        return 0.50f*base*height;
    }
}
