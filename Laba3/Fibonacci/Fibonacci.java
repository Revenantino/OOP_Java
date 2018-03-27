package Prometheus;

public class Fibonacci {
    long erste = 1;
    long zweite = 1;
    long wirkung;
    long iter = 2;
    public long getNumber(int position) {
        if(position <= 30 && position > 0){
            if(position == 1){
                return erste;
            }
            else if(position == 2){
                return zweite;
            }
            else if(iter != position){
                wirkung = erste + zweite;
                erste = zweite;
                zweite = wirkung;
                iter++;
                return getNumber(position);
            } else return wirkung;
        }else return -1;
   }
}
