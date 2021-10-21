class Vehicle {
    public int pass;
    public double fuel, exp;
    //рассчитываем расстояние, котрое проедет тачка
    public double rage(){
        return fuel / exp * 100;
    }
    //рассчитываем сколько топлива потребуется, чтобы тачка проехала расстояние
    public double fneed(int km){
        return (double) km / 100 * exp;
    }
    public Vehicle(int p, double f, double e) {
        this.pass = p;
        this.fuel = f;
        this.exp = e;
}
    }
