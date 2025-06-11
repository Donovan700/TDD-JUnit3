package src;

public class Calcul {
    public int additionner(int a, int b) {
        return a + b;
    }
    public int soustraire(int a, int b) {
        return a-b;
    }
    public int sumInt(int n) {
        if(n <= 0) return 0;
        else return n+sumInt(n-1);
    }
    public String checkObj(Object obj1, Object obj2) {
        if(obj1.getClass().equals(obj2.getClass())) return "Same";
        else return "Not Same";
    }
}
