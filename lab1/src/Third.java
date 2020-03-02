public class Third {
    /**
    * 
    * @param args
    * @throws Exception
    */
    public static void main(String[] args) throws Exception {
        for(char i = 'a';i<='z';i++){
            System.out.println(i);
        }

        long begin_i_int = new java.util.Date().getTime();
        for (int i = 0; i <= 100000000; i++){}
        long end_i_end = new java.util.Date().getTime();
        System.out.println(end_i_end - begin_i_int);


        long begin_i_long = new java.util.Date().getTime();
        for (long i = 0; i <= 100000000; i++){}
        long end_i_long = new java.util.Date().getTime();
        System.out.println(end_i_long - begin_i_long);

    }
}