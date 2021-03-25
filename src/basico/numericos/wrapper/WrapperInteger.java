package basico.numericos.wrapper;

public class WrapperInteger {
    public static void main(String[] args) {
        int intPrimitivo = 32768;
        Integer intObjeto1 = Integer.valueOf(intPrimitivo);
        Integer ibtObjeto2 = intPrimitivo;
        System.out.println("intObjeto1 = " + intObjeto1);

        int num = intObjeto1;
        System.out.println("num = " + num);
        int num2 = intObjeto1.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLvd = "67000";
        Integer valor = Integer.valueOf(valorTvLvd);
        System.out.println("valor = " + valor);

        // Hay perdida de indormacion,
        // cuando no esta dentro de este rango [-32768, 32767]
        Short shortObjeto = intObjeto1.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        // Hay perdida de indormacion,
        // cuando no esta dentro de este rango [-128, 127]
        Byte byteObjecto = intObjeto1.byteValue();
        System.out.println("byteObjecto = " + byteObjecto);


        Long longObjecto = intObjeto1.longValue();
        System.out.println("longObjecto = " + longObjecto);
    }
}
