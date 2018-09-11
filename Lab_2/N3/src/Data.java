import java.util.Scanner;

    public class Data{
        private int cnt = 0;
        private double sum = 0;
        private double maxi = -1000;
        public Data(){
        }
        public void addVal(double a){
            if(a > maxi){
                maxi = a;
            }
            sum += a;
            cnt++;
        }
        public int getCnt(){
            return cnt;
        }
        public double findAve(){
            return sum/cnt;
        }
        public double maxxi(){
            return maxi;
        }
    }
      class Analyzer{
        double average;
        double maxx;

        public Analyzer(Data data){
            average=data.findAve();
            maxx=data.maxxi();
        }

    public static void main(String[] args) {
        Data data=new Data();
        while(true) {
            Scanner s = new Scanner(System.in);
            String string = s.next();
            int ascii = (int) string.charAt(0);
            if (ascii >= 48 && ascii <= 57) {
                data.addVal(Double.parseDouble(string));
            } else {
                Analyzer analyzer = new Analyzer(data);
                if(data.getCnt()==0){
                    System.out.println(0);
                    break;
                }
                System.out.println(analyzer.average );
                System.out.println(analyzer.maxx );
                break;
            }
        }

    }
}