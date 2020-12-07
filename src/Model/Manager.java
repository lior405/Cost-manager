package Model;

import java.util.ArrayList;
import java.util.Date;

public class Manager implements Imodel {
    private String userName;
    private String password;
    ArrayList<Category> categoryArrayList = null;

    //constructor: initialize category arraylist.
    public Manager(String userName, String password) {
        setUserName(userName);
        setPassword(password);
//        setCategoryArrayList(categoryArrayList);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Category> getCategoryArrayList() {
        return categoryArrayList;
    }

    public void setCategoryArrayList(ArrayList<Category> categoryArrayList) {
        this.categoryArrayList = categoryArrayList;
    }

    @Override
    public void AddNewCost(Category.Report r) throws ReportException {
        for(int i=0; i<categoryArrayList.size(); i++) {
            if(categoryArrayList.get(i).getName() == r.getCategoryName()) {
                System.out.println("ok");
                categoryArrayList.get(i).reportArrayList.add(r);
            }
        }
    }

    @Override
    public void DeleteCost(Category.Report r) throws ReportException {
        for(int i=0; i<categoryArrayList.size(); i++) {
            if(categoryArrayList.get(i).getName() == r.getCategoryName()) {
                System.out.println("ok");
                categoryArrayList.get(i).reportArrayList.remove(r);
            }
        }
    }

    @Override
    public void NewCategory(String CategoryName) throws ReportException {
        Category c = new Category(CategoryName);
        categoryArrayList.add(c);

    }

    @Override
    public ArrayList<Category.Report> GetDReport(Date x, Date y, String CategoryName) throws ReportException {
        return null;
    }

    @Override
    public ArrayList<Category.Report> GetPieChart(Date x, Date y) throws ReportException {
        return null;
    }
}
