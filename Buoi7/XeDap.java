package Buoi7;

public class XeDap {
    public void run(){
        System.out.println("Xe chay bang suc nguoi");
    }
}
class XeDapDien extends XeDap {
    @Override
    public void run(){
        System.out.println("Xe chay bang dien");
    }
    public void sacdien(){
        System.out.println("Dang sac dien cho xe");
    }
}
