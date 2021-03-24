package basico.string;

public class Practica1 {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        long inicio = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(c);
        for (int i = 0; i < 1000; i++) {
            //c = c.concat(a).concat(b).concat("\n"); // 500 -> 0ms
            //c += a + b + "\n";
            sb.append(a).append(b).append("\n");
        }

        long fin = System.currentTimeMillis();
        System.out.println("sb = " + sb);
        System.out.println(fin - inicio);
    }
}
