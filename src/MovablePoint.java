public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    public MovablePoint(){
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed ){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float getXSpeed(){
        return  xSpeed;
    }
    public float getYSpeed(){
        return ySpeed;
    }
    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }
    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] speed =  new float[]{getX(),getY(),getXSpeed(),getYSpeed()};
        return speed;
    }
    public String toString(){
        return "("+ getX()+":"+getY() +"-"+getXSpeed()+","+getYSpeed()+")";
    }
    public void move(){
        setX(getX()+getXSpeed());
        setY(getY()+getYSpeed());
    }
}
