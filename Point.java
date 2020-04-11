class Point {
	String id
	double x,y;
	String color;

	public Point(String id, double x, double y, String color){
		this.id = id;
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public String getId() {return this.id;}

	public void setId(String id) {this.id = id;}

	public double getX(){return this.x;}

	public void setX(double x){this.x = x;}

	public double getY(){return this.y;}

	public void setY(double y){this.y = y;}

	public String getColor() {return this.color;}

	public void move (char xDirection, char yDirection) {
		//	L,R,U,D
		
		//	X
		if (xDirection == 'L') {
			this.x--;
		}
		else if (xDirection == 'R') {
			this.x++;
		}
		else {
			throw new IllegalArgumentException();
		}

		//	Y
		if (yDirection == 'U') {
			this.y++;
		}
		else if (yDirection == 'D') {
			this.y--;
		}
		else {
			throw new IllegalArgumentException();
		}
	}

	public void draw () {
		system.out.println(String.format("%s: (%f, %f) is %s", this.id, this.x, this.y, this.color));
	}
}