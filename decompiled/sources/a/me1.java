package a;

import android.gov.nist.javax.sip.header.ParameterNames;

/* JADX INFO: loaded from: classes5.dex */
public enum me1 implements sgf0 {
    HEADER("header"),
    /* JADX INFO: Fake field, exist only in values array */
    PICTURE_S("pictureS"),
    /* JADX INFO: Fake field, exist only in values array */
    CARD(ParameterNames.CARD),
    /* JADX INFO: Fake field, exist only in values array */
    PICTURE_L("pictureL"),
    BUTTON("button");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21622a;

    me1(String str) {
        this.f21622a = str;
    }

    @Override // a.sgf0
    public final String a() {
        return "aggregatorPromoGiftsStyle";
    }

    @Override // a.sgf0
    public final String getValue() {
        return this.f21622a;
    }
}
