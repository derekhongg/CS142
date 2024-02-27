public class Point {
  int x;
  int y;

  public void setLocation(int newX, int newY) {
    x = newX;
    y = newY;
  }

  public void translate(int dx, int dy) {
    x = x + dx;
    y = y + dy;
  }

  // alternative solution that utilizes setLocation
  // public void translate(int dx, int dy) {
  // setLocation(x + dx, y + dy);
  // }

  public double distance(Point other) {
    int dx = x - other.x;
    int dy = y - other.y;
    return Math.sqrt(dx * dx + dy * dy);
  }

  public double distanceFromOrigin() {
    return Math.sqrt(x * x + y * y);
  }

  public String toString() {
    return "()";
  }

  public int quadrant() {
    if (this.y > 0 && this.x > 0) {
      return 1;
    } else if (this.x < 0 && this.y > 0) {
      return 2;
    } else if (this.x < 0 && this.y < 0) {
      return 3;
    } else if (this.x > 0 && this.y < 0) {
      return 4;
    } else {
      return 0;
    }
  }

  public void flip() {
    int temp = this.x;
    this.x = -this.y;
    this.y = -temp;
  }
}
