package a;

import android.javax.sip.message.Request;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yko {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ yko[] f42800a = {new yko("REPLACE", 0), new yko("KEEP", 1), new yko(Request.UPDATE, 2), new yko("CANCEL_AND_REENQUEUE", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    yko EF5;

    public static yko valueOf(String str) {
        return (yko) Enum.valueOf(yko.class, str);
    }

    public static yko[] values() {
        return (yko[]) f42800a.clone();
    }
}
