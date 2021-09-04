public class homework6 {

    public static void main(String[] args) {
        Comp comp = new Comp("i5", "HyperX 16gb", "Samsung 120gb");
        System.out.println(comp.getCpu());
        System.out.println(comp.getRam());
        System.out.println(comp.getHdd());
        comp.comp_on();
    }
}

