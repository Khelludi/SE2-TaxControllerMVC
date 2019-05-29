public class MainClass {

    public static void main(String[] args) {

        //fetch tax record  from the database
        TaxModel model  = retriveStudentFromDatabase();

        //Create a view : to write tax details on console
        TaxView view = new TaxView();

        TaxController controller = new TaxController(model, view);

        controller.updateView();

        //update model data
        controller.setStudentName("V8");

        controller.updateView();
    }

    private static TaxModel retriveStudentFromDatabase(){
        TaxModel tax = new TaxModel();
        tax.setName("V8");
        tax.setRollNo("4,000,000");
        tax.setTax(" 30 %");

        return tax;
    }
}
