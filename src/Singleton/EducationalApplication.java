package Singleton;

import java.util.Date;

public class EducationalApplication {
    private static EducationalApplication instance;
    private int someData;
    private Date startDate;
    private Date endDate;

    private EducationalApplication() {
        someData = 0;
        startDate = new Date();
        endDate = new Date();
    }

    public static synchronized EducationalApplication getInstance() {
        if (instance == null) {
            instance = new EducationalApplication();
        }
        return instance;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void getSomeData(Date start, Date end) {
        startDate = start;
        endDate = end;
    }
}
