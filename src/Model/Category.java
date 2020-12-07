package Model;

import java.util.ArrayList;

public class Category {
    private String name;
    ArrayList<Report> reportArrayList = null;

    public Category(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Report> getReportArrayList() {
        return reportArrayList;
    }
    public void setReportArrayList(ArrayList<Report> reportArrayList) {
        this.reportArrayList = reportArrayList;
    }
    public double GetTotalCost() {
        double sum = 0;
        for(int i=0; i<reportArrayList.size(); i++) {
            sum += reportArrayList.get(i).price;
        }
        return sum;
    }
    public class Report {
        private double price;
        private Currency currency;
        private String comment;

        public Report(double price, Currency currency, String comment) {
            setComment(comment);
            setCurrency(currency);
            setPrice(price);
        }

        public Report(){
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public Currency getCurrency() {
            return currency;
        }

        public void setCurrency(Currency currency) {
            this.currency = currency;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getCategoryName() {
            return name;
        }
    }
}
