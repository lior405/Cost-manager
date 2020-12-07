package Model;

import java.util.*;

public interface Imodel {
    public void AddNewCost(Category.Report r) throws ReportException;
    public void DeleteCost(Category.Report r) throws ReportException;
    public void NewCategory(String CategoryName) throws ReportException;
    public ArrayList<Category.Report> GetDReport(Date x, Date y, String CategoryName) throws ReportException;
    public ArrayList<Category.Report> GetPieChart(Date x, Date y) throws ReportException;
}
