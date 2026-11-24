package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class zxw {
    public static final zsb0 c = new zsb0("|S||P|");
    public static final zsb0 d = new zsb0("|S|id");
    public static final String[] e = {Separators.STAR, "FCM", "GCM", ""};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s8y f45178a;
    public final String b;

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public zxw(nfq nfqVar) {
        nfqVar.a();
        this.f45178a = new s8y(nfqVar.f23449a, "com.google.android.gms.appid");
        nfqVar.a();
        mgq mgqVar = nfqVar.c;
        String str = mgqVar.e;
        if (str == null) {
            nfqVar.a();
            str = mgqVar.b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(Separators.COLON);
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.b = str;
    }
}
