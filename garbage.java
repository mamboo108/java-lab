class Main{
    public static void main(String args[]){
        Main ob = new Main();
        ob = null;
        System.gc();
        System.out.println("Garbage collected");
    }
}
