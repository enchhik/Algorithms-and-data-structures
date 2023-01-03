package org.example;

public class RegexMain {

    public boolean phoneNumber(String number) {

        String pattern = "^\\(\\+380\\)\\d{2}-\\d{3}-\\d{2}-\\d{2}$";

        if (number.matches(pattern)) {
            return true;
        } else {
            return false;
        }
    }

    public String removeSpace(String st) {

        String s = st.replaceAll("\\s{2,}", " ");
        return s;
    }

    public String removeHtml(String st) {
        String s = st.replaceAll("<[^>]*>", "");
        return s;
    }


}