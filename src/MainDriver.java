public class MainDriver{
    public static void main(String[] args) {
        int StudentId=1000;
        try{
            if(StudentId<1000)
            {
                System.out.println(""+StudentId);
            }
            else
            {
                throw new StudentException("Invalid exception id: "+StudentId);// throw custom exception

            }
        }
        catch (Exception e){
            System.out.println(e);

        }
    }
}
