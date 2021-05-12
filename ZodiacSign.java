package sample;

/**********************************************************************************************
 * Zodiac Sign
 **********************************************************************************************
 * Creates a ZodiacSign object with date.
 *********************************************************************************************
 * Brianna Patrick
 * 255 003
 * 05/07/21
 **********************************************************************************************/

public class ZodiacSign {

    /**
     * birth date of ZodiacSign
     */
    private int date;

    /**
     * default constructor for ZodiacSign
     */
    public ZodiacSign() {
        this(1231);
    }

    /**
     * parameterized constructor with specified date
     * @param date
     */
    public ZodiacSign(int date) {
        this.date = date;
    }

    /**
     * determineSign method will return a zodiac sign using date value
     * @return
     */
    public String determineSign() {

        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        String month = "";
        String stringDay = "";
        int day = 0;
        if(date >= 1000 && date <= 9999) {
            n1 = date / 1000;
            n2 = (date % 1000) / 100;
            n3 = (date % 100) / 10;
            n4 = date % 10;

            month = "" + n1 + n2;
            stringDay = "" + n3 + n4;
            day = Integer.parseInt(stringDay);
        }
        else if(date > 0 && date < 930) {
            String stringDate = String.format("%d", date);
            month = "0" + stringDate.charAt(0);
            stringDay = "" + stringDate.charAt(1) + stringDate.charAt(2);
            day = Integer.parseInt(stringDay);
        }


        if (month.equals("01")) {
            if (day < 20)
                return "Capricorn!";
            else
                return "Aquarius!";
        }
        else if (month.equals("02")) {
            if (day < 19)
                return "Aquarius!";
            else
                return "Pisces!";
        }
        else if (month.equals("03")) {
            if (day < 21)
                return "Pisces!";
            else
                return "Aries!";
        }
        else if (month.equals("04")) {
            if (day < 20)
                return "Aries!";
            else
                return "Taurus!";
        }
        else if (month.equals("05")) {
            if (day < 21)
                return "Taurus!";
            else
                return "Gemini!";
        }
        else if (month.equals("06")) {
            if (day < 21)
                return "Gemini!";
            else
                return "Cancer!";
        }
        else if (month.equals("07")) {
            if (day < 23)
                return "Cancer!";
            else
                return "Leo!";
        }
        else if (month.equals("08")) {
            if (day < 23)
                return "Leo!";
            else
                return "Virgo!";
        }
        else if (month.equals("09")) {
            if (day < 23)
                return "Virgo!";
            else
                return "Libra!";
        }
        else if (month.equals("10")) {
            if (day < 23)
                return "Libra!";
            else
                return "Scorpio!";
        }
        else if (month.equals("11")) {
            if (day < 22)
                return "Scorpio!";
            else
                return "Sagittarius!";
        }
        else if (month.equals("12")) {
            if (day < 22)
                return "Sagittarius!";
            else
                return "Capricorn!";
        }
        else
            return "Please enter a correct birth month and day (e.g., 1231, 0203).";

    }

    /**
     * setDate will set the date
     * @param date
     */
    public void setDate(int date) {
        this.date = date;
    }

    /**
     * getDate will return the date
     * @return
     */
    public int getDate() {
        return this.date;
    }


}
