package homework22;


public class MinMaxValues {
    public static void main(String[] args) {
        if (args.length == 0) {
            String[] types = {"byte", "short", "char", "int", "long", "float", "double"};
            printMinMaxValues(types);
        } else {
            printMinMaxValues(args);
        }
    }

    private static void printMinMaxValues(String[] types) {
        for (String type : types) {
            switch (type) {
                case "byte":
                    System.out.println("Минимальное значение типа byte: " + Byte.MIN_VALUE);
                    System.out.println("Максимальное значение типа byte: " + Byte.MAX_VALUE);
                    break;
                case "short":
                    System.out.println("Минимальное значение типа short: " + Short.MIN_VALUE);
                    System.out.println("Максимальное значение типа short: " + Short.MAX_VALUE);
                    break;
                case "char":
                    System.out.println("Минимальное значение типа char: " + (int) Character.MIN_VALUE);
                    System.out.println("Максимальное значение типа char: " + (int) Character.MAX_VALUE);
                    break;
                case "int":
                    System.out.println("Минимальное значение типа int: " + Integer.MIN_VALUE);
                    System.out.println("Максимальное значение типа int: " + Integer.MAX_VALUE);
                    break;
                case "long":
                    System.out.println("Минимальное значение типа long: " + Long.MIN_VALUE);
                    System.out.println("Максимальное значение типа long: " + Long.MAX_VALUE);
                    break;
                case "float":
                    System.out.println("Минимальное значение типа float: " + Float.MIN_VALUE);
                    System.out.println("Максимальное значение типа float: " + Float.MAX_VALUE);
                    break;
                case "double":
                    System.out.println("Минимальное значение типа double: " + Double.MIN_VALUE);
                    System.out.println("Максимальное значение типа double: " + Double.MAX_VALUE);
                    break;
                default:
                    System.out.println("Неверный тип: " + type);
            }
        }
    }
}
