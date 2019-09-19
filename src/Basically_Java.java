public class Basically_Java {
    public static void main(String[] args){
        int a=50,b=50;
        if(a>b){
            System.out.println("a>b");
        }else{
            System.out.println("a<=b");
        }

        //数组
        int ys[]=new int[]{1,1,4,5,1,4};

        for(int i=0;i<5;i+=2){
            System.out.println("i="+ys[i]);
        }
        //字符串
        String s=new String("stu"+"dent");
        System.out.println(s.indexOf("d"));

        int arr[][]=new int[][]{{1},{2,3},{4,5,6}};
        for(int k=0;k<arr.length;k++){
            for(int c=0;c<arr[k].length;c++){
                System.out.print(arr[k][c]);
            }
            System.out.println();
        }

        //遍历
        int i=0;
        for(int x[]:arr){
            i++;
            int j=0;
            for(int e:x) {
                if (i ==arr.length && j == x.length) {
                    System.out.print(e);
                } else {
                    System.out.print(e + ',');
                }
            }
        }

    }
}