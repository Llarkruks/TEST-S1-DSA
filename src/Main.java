
public static void main(String[] args) {
    Shape[] v = new Shape[4];

    v[0] = new Rectangle(5, 3);
    v[1] = new Circle(5);
    v[2] = new Square(5);
    v[3] = new Circle(120);
k
    double res = sum(v);
j
    System.out.println("sum: " + res);

    print(v);

    sort(v);

    print(v);
}
