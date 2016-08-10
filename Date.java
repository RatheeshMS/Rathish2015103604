package rat;

public class Date {
    public int d,m,y,month,day,year;
    public void get_data()
    {
    	d=1;
    	m=11;
    	y=1998;
    }
    public void set_data()
    {
    	day=d;
    	month=m;
    	year=y;
    }
    Date()
    {
    	day=0;
    	month=0;
    	year=0;
    }
    public void disp_date()
    {
    	System.out.println("date\n"+day+"/"+month+"/"+year);
    }
	
}
