package com.example.openfga4intellij;

import com.intellij.lang.Language;

public class OpenFGALanguage extends Language {

    public static final OpenFGALanguage INSTANCE = new OpenFGALanguage();

    private OpenFGALanguage() {
        super("OpenFGA");
    }

}
