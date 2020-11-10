public class Main {

    public static void main(String[] args) {

        Lift l = new Lift();
        String output = l.Lift("DrOp(10) DrCl(10,100) Srv(1,20,25) DrOp(10) DrCl(10,0) Req(2,20,25)");

        System.out.println(output);
    }
}
