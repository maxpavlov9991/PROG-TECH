public class Main {
  /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        /**
         * byte — диапазон допустимых значений от -128 до 127
         * Переменные типа byte полезны при работе с  потоком данных, который поступает из сети или файла.
         */
        byte v_byte = 0;
        System.out.println("This is a byte"+v_byte);

        /**
         * short — диапазон допустимых значений от -32768 до 32767
         */
        short v_short = 0;
        System.out.println("This is a short"+v_short);

        /**
         * int — диапазон допустимых значений от -2147483648 до 2147483647
         */
        int v_int = 2147483647;
        System.out.println("This is a int"+v_int);

        /**
         * long — диапазон допустимых значений от -9223372036854775808 до 9223372036854775807
         * Тип удобен для работы с большими целыми числами.
         */
        long v_long = 822;
        System.out.println("This is a long"+v_long);

        /**
         * float — диапазон допустимых значений от ~1,4*10-45 до ~3,4*1038
         * Удобен для использования, когда не требуется особой точности в дробной части числа.
         */
        float v_float = 31.24f;
        System.out.println("This is a float"+v_float);

        /**
         * double — диапазон допустимых значений от ~4,9*10-324  до ~1,8*10308
         * Математические функции такие как sin(), cos(), sqrt() возвращают значение double
         */
        double v_double = 3.14159;
        System.out.println("This is a double"+v_double);

        /**
         * char — символьный тип данных представляет собой один 16-битный Unicode символ.
         * Он имеет минимальное значение ‘\ u0000’ (или 0), и максимальное значение ‘\ uffff’ (или 65535 включительно).
         */
        char v_char ='Ы';
        System.out.println("This is a char"+v_char);
        
        /**
         * boolean — предназначен для хранения логических значений.
         * Переменные этого типа могут принимать только одно из 2х возможных значений true или false.
         */
        boolean v_boolean = true;
        System.out.println("This is a boolean"+v_boolean);


        System.out.println("Starting project");
    }
}