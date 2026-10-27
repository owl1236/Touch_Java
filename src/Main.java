void main() {
        Car car1 = new Car("GLE", "Mercedes", "white", (short) 2020, (short) 5, 350_000.0);
        Car car2 = new Car("GLE", "Mercedes", "white", (short) 2020, (short) 5, 350_000.0);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println(car1.getColor());
        car1.setColor("black");
        System.out.println(car1.getColor());

        System.out.println("Are these objects equal? " + car1.equals(car2));
        System.out.println("The HashCode of this object is: " + car1.hashCode());
        System.out.println("The HashCode of this object is: " + car2.hashCode());
}
