//QAP 2 - Advanced Programming (Java)
//Written By: Kara Balsom
//Date Written: February 6, 2023

//Creates the MyLine class and the two private instance variables: 
public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    // Creates a constructor that takes in four ints as parameters; x1, y1, x1, y2.
    // Creates a new Mypoint object, which is passed x1 and y1 and sets it as the
    // begin variable. Creates a second new Mypoint object, which is passed x2 and
    // y2 and sets it as the end variable.
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);

    }

    // Creates a constructor that takes in two MyPoint objects as parameters; begin
    // and end. The begin object is set as the begin variable of the new MyLine
    // object being constructed, and the end object is set as end.
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Creates a get method, which gets the begin variable (which is a MyPoint
    // object) of the MyLine object on which the method is invoked and returns it:
    public MyPoint getBegin() {
        return begin;
    }

    // Creates a set method, which takes in a MyPoint object called begin. It then
    // sets the begin variable of the MyLine object on which the method is invoked
    // to the value being passed in.
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    // Creates a get method, which gets the end variable (which is a MyPoint
    // object) of the MyLine object on which the method is invoked and returns it:
    public MyPoint getEnd() {
        return end;
    }

    // Creates a set method, which takes in a MyPoint object called end. It then
    // sets the end variable of the MyLine object on which the method is invoked
    // to the value being passed in.
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Creates a get method, which invokes the getX() method in the MyPoint class on
    // the begin variable of the MyLine object, and returns the int result returned
    // by getX().
    public int getBeginX() {
        return begin.getX();
    }

    // Creates a set method, which takes in an int called x. The SetX() method in
    // the MyPoint class is invoked on the begin variable of the MyLine object, and
    // is passed x to set as the value.
    public void setBeginX(int x) {
        begin.setX(x);
    }

    // Creates a get method, which invokes the getY() method in the MyPoint class on
    // the begin variable of the MyLine object, and returns the int result returned
    // by getY().
    public int getBeginY() {
        return begin.getY();
    }

    // Creates a set method, which takes in an int called y. The SetY() method in
    // the MyPoint class is invoked on the begin variable of the MyLine object, and
    // is passed y to set as the value.
    public void setBeginY(int y) {
        begin.setY(y);
    }

    // Creates a get method, which invokes the getX() method in the MyPoint class on
    // the end variable of the MyLine object, and returns the int result returned
    // by getX().
    public int getEndX() {
        return end.getX();
    }

    // Creates a set method, which takes in an int called x. The SetX() method in
    // the MyPoint class is invoked on the end variable of the MyLine object, and
    // is passed x to set as the value.
    public void setEndX(int x) {
        end.setX(x);
    }

    // Creates a get method, which invokes the getY() method in the MyPoint class on
    // the end variable of the MyLine object, and returns the int result returned
    // by getY().
    public int getEndY() {
        return end.getY();
    }

    // Creates a set method, which takes in an int called y. The SetY() method in
    // the MyPoint class is invoked on the end variable of the MyLine object, and
    // is passed y to set as the value.
    public void setEndY(int y) {
        end.setY(y);
    }

    // Creates a get method, which creates a new int array with a length of two and
    // calls it xy. The getX method is invoked on the begin variable of the MyLine
    // object, and the returned result is added to the array xy in the 0 index spot.
    // The getY method is invoked on the begin variable of the MyLine object, and
    // the returned result is added to the array xy in the 1 index spot. The array
    // xy is then returned.
    public int[] getBeginXY() {
        int[] xy = new int[2];
        xy[0] = begin.getX();
        xy[1] = begin.getY();
        return xy;
    }

    // Creates a set method, which is passed two ints, x and y, as parameters.
    // The setXY() method of the MyPoint class is invoked on the begin variable of
    // the MyLine object, and is passed x and y, which are set as the values of
    // begin.
    public void setBeginXY(int x, int y) {
        begin.setXY(x, y);
    }

    // Creates a get method, which creates a new int array with a length of two and
    // calls it xy. The getX method is invoked on the end variable of the MyLine
    // object, and the returned result is added to the array xy in the 0 index spot.
    // The getY method is invoked on the end variable of the MyLine object, and
    // the returned result is added to the array xy in the 1 index spot. The array
    // xy is then returned.
    public int[] getEndXY() {
        int[] xy = new int[2];
        xy[0] = end.getX();
        xy[1] = end.getY();
        return xy;
    }

    // Creates a set method, which is passed two ints, x and y, as parameters.
    // The setXY() method of the MyPoint class is invoked on the end variable of
    // the MyLine object, and is passed x and y, which are set as the values of
    // end.
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    // Creates a method getLength(), which invokes the distance() method of the
    // MyPoint class on the begin variable of the MyLine object and passes it the
    // end variable as a parameter. distance() returns a double, which is then
    // returned by getLength().
    public double getLength() {
        return begin.distance(end);
    }

    // Creates a method getGradient(). The result of the getBeginX() method is
    // subtracted from the result of the getEndX() and the outcome is assigned to an
    // int xDiff. The result of the getBeginY() method is subtracted from the result
    // of the getEndY() and the outcome is assigned to an int YDiff. XDiff and YDiff
    // are passed to the inbuilt math.atan2()/ method, and the resulting double is
    // returned.
    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }

    // Creates a method called toString(), which returns the string below:
    public String toString() {
        return ("MyLine [begin = (" + this.begin + "), end = (" + this.end + ")]");
    }

}