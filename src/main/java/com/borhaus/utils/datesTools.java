package com.borhaus.utils;


import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by bdiez on 4/08/17.
 */
public class datesTools {

    private String getPrettyDate(Locale locale, String inputPattern) {
        String pattern = "H:mm:ss:SSS";
        SimpleDateFormat formatter;
        if (StringUtils.isBlank(pattern)) {
            pattern = inputPattern;
        }

        formatter = new SimpleDateFormat(pattern, locale);
        return formatter.format(new Date());


    }


}
