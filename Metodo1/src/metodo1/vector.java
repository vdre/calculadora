package metodo1;

public class vector {

    int[] vector1(int m[]) {
        int n;
        for (int  i = 0; i < m.length; i++)
        {
            for (int j = i; j < m.length; j++) {
                    if(m[i]>m[j]){
                        n=m[i];
                        m[i]=m[j];
                        m[j]=n;
                    }
            }
        }
        return m;
    }

}
