package sort;

public class sort {

    public static Integer[] sort1(Integer[] array){
        Integer len=array.length;
        Integer temp;
        for (int i=0;i<len;i++){
            for (int j=i;j<len;j++){
                if (array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }



}
