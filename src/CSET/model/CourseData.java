package CSET.model;

import CSET.model.Course;

/**
 * Created by Matt on 2/9/2017.
 */
public class CourseData {

    // array of all cset courses
    private Course[] cset = new Course[]{
            new Course("Fr", "CSET", 1100, 3),
            new Course("Fr", "CSET", 1200, 3),
            new Course("So", "CSET", 2230, 4),
            new Course("So", "CSET", 2200, 4),
            new Course("Jr", "CSET", 3150, 4),
            new Course("Jr", "CSET", 3300, 4),
            new Course("Jr", "CSET", 3100, 3),
            new Course("Jr", "CSET", 3200, 3),
            new Course("Jr", "CSET", 3250, 3),
            new Course("Jr", "CSET", 3400, 3),
            new Course("Jr", "CSET", 4150, 3),
            new Course("Sr", "CSET", 3600, 3),
            new Course("Sr", "CSET", 4350, 3),

            new Course("Sr", "CSET", 4750, 4),
            new Course("Sr", "CSET", 4250, 3),
            new Course("Sr", "CSET", 4200, 4),
            new Course("Sr", "CSET", 4650, 4),
            new Course("Sr", "CSET", 4850, 4)
    };

    // array of all math courses
    private Course[] math ={
            new Course("So", "MATH",2460, 3),
            new Course("So", "MATH",2450, 3),

            new Course("Jr", "MATH",2890,3)
    };

    //methods to return the list of courses of a subject
    public Course[] getCset() {
        return cset;
    }

    public Course[] getMath() {
        return math;
    }

    public void setCset(Course[] cset) {
        this.cset = cset;
    }

    public void setMath(Course[] math) {
        this.math = math;
    }











}