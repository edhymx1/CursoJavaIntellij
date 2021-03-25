package basico.numericos.wrapper;

public class WrapperBoolean {
    public static void main(String[] args) {
        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2;
        Boolean objetoBoolean = Boolean.valueOf(primBoolean);
        Boolean objetoBoolean2 = Boolean.valueOf("false");
        Boolean objetoBoolean3 = false;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);

        System.out.println("comparando dos objetos boolean:  " + (objetoBoolean == objetoBoolean2));
        System.out.println("comparando dos objetos boolean:  " + (objetoBoolean.equals(objetoBoolean2)));
    }
}
