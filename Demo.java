public class Demo{
    public static void main(String[] args){
        int input = 5;
        if (args.length > 0){
            input = Integer.parseInt(args[0]);
        }
        printLoop(input);

        /*
        int[] a = {1};
        int[] b = {1,2};
        int[] c = {1,2,3};
        int[] d = {1,2,3,4};
        int[] e = {1,2,3,4,5};
        System.out.println(arrToString(a));
        System.out.println(arrToString(b));
        System.out.println(arrToString(c));
        System.out.println(arrToString(d));
        System.out.println(arrToString(e));
        int[][]weak = {a,b,c,d,e};
        */
        //System.out.println(arrDeepToString(weak));
        int[][]weak = create2DArray(3,1,5);
        System.out.println(arrDeepToString(weak));
        weak = create2DArray(3,2,5);
        System.out.println(arrDeepToString(weak));
        weak = create2DArray(2,2,100);
        System.out.println(arrDeepToString(weak));
        weak = create2DArray(1,1,1);
        System.out.println(arrDeepToString(weak));
        weak = create2DArray(5,4,4);
        System.out.println(arrDeepToString(weak));
        weak = create2DArray(1,1,0);
        System.out.println(arrDeepToString(weak));
        weak = create2DArrayRandomized(3,1,5);
        System.out.println(arrDeepToString(weak));
        weak = create2DArrayRandomized(3,2,5);
        System.out.println(arrDeepToString(weak));
        weak = create2DArrayRandomized(2,2,100);
        System.out.println(arrDeepToString(weak));
        weak = create2DArrayRandomized(1,1,1);
        System.out.println(arrDeepToString(weak));
        weak = create2DArrayRandomized(5,4,4);
        System.out.println(arrDeepToString(weak));
        weak = create2DArrayRandomized(4,10,100);
        System.out.println(arrDeepToString(weak));
    }

    public static void printLoop(int n){
        for(int i=1; i<=n; i++){
        for(int j=0; j<1+n-i; j++){
            System.out.print(i);
        }
        System.out.println();
        }
    }

    public static String arrToString(int[]arr){
        String out = "{";
        for(int i = 0; i<arr.length; i++){
            out = out + arr[i];
            if (i<arr.length-1){
            out += ", ";
            }
        }
        return out + '}';
        }

        public static String arrDeepToString(int[][] arr){
        String out = "{";
        for(int i = 0; i<arr.length; i++){
            out = out + arrToString(arr[i]);
            if (i<arr.length-1){
            out += ", ";
            }
        }
        return out + '}';
        }

        public static int[][] create2DArray(int rows, int cols, int maxValue){
            maxValue++;
            int[][] output = new int[rows][cols];
            for(int r=0; r<rows; r++){
                for (int c=0; c<cols; c++){
                    output[r][c]= (int)Math.floor(Math.random()*maxValue);
                }
            }
            return output;
        }
        public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
            maxValue++;
            cols++;
            int[][] output = new int[rows][];
            int col;
            for(int r= 0; r< rows; r++){
                col = (int)Math.floor(cols * Math.random());
                output[r]=new int[col];
                for(int c=0; c<col; c++){
                    output[r][c]= (int)Math.floor(Math.random()*maxValue);
                }
            }
            return output;
    }
}