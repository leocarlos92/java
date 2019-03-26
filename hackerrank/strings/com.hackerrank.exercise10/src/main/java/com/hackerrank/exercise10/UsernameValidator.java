package com.hackerrank.exercise10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UsernameValidator {


    static String regularExpression =   "^[A-Za-z]" +      //  The first character of the username must be an alphabetic character

                                        "\\w"       +       // The username can only contain alphanumeric characters and underscores ( _ ).
                                                            // Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits.

                                        "{7,29}$";          // The username consists of 8 to 30 characters inclusive.
}
