package Model;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Manager m = new Manager("mor", "1111");
        m.categoryArrayList =new ArrayList<Category>();
        Category c = new Category("x");
        c.reportArrayList=new ArrayList<Category.Report>();
        m.categoryArrayList.add(c);
        Category.Report r = c.new Report(4,Currency.ILS,"STHOK");

        try {
            m.AddNewCost(r);
        } catch (ReportException e) {
            e.printStackTrace();
        }
        try {
            m.DeleteCost(r);
        } catch (ReportException e) {
            e.printStackTrace();
        }
    }

}
