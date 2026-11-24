package a;

import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;

/* JADX INFO: loaded from: classes4.dex */
public enum yre {
    SINGLE("single"),
    EXPRESS("express"),
    SYSTEM("system"),
    CHAIN(ReferencesHeader.CHAIN),
    MULTY("multy"),
    CONDITION("condition"),
    ANTI_EXPRESS("anti_express"),
    LUCKY("lucky"),
    PATENT("patent"),
    CONSTRUCTOR("constructor"),
    MANY_SINGLES("many_singles");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43118a;

    yre(String str) {
        this.f43118a = str;
    }
}
