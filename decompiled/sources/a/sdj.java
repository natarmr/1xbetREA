package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX INFO: loaded from: classes5.dex */
public enum sdj {
    UNIVERSAL("dd.MM.yyyy"),
    UNIQUE_2("dd.MM"),
    UNIQUE_3("dd MMMM"),
    UNIQUE_4("LLLL"),
    UNIQUE_5("LLLL yyyy"),
    UNIQUE_6("EEE dd.MM"),
    UNIQUE_7("EEE dd.MM.yyyy"),
    UNIQUE_8("dd, EEEE"),
    UNIQUE_10("yyyy-MM-dd"),
    UNIQUE_11(TokenNames.E),
    UNIQUE_12("d"),
    UNIQUE_15("d MMMM"),
    UNIQUE_16("d MMMM yyyy");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32037a;

    sdj(String str) {
        this.f32037a = str;
    }
}
