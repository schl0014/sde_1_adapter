package com.hz;

import java.lang.reflect.Array;

public class BooleanAdapter {
    private boolean _answer2;

    private String[] _true = {"true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise"};

    public boolean ConvertTextToBoolean(String answer) {
        for (int i = 0; i < _true.length; i++) {
            if (answer.equals(_true[i])) {
                _answer2 = true;
            }
        }
        return _answer2;
    }

}
