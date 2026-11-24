package a;

import android.gov.nist.javax.sdp.fields.SDPKeywords;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class uiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uiy f35755a;
    public static final uiy b;
    public static final uiy c;
    public static final /* synthetic */ uiy[] d;

    static {
        uiy uiyVar = new uiy("INVARIANT", 0);
        f35755a = uiyVar;
        uiy uiyVar2 = new uiy(SDPKeywords.IN, 1);
        b = uiyVar2;
        uiy uiyVar3 = new uiy("OUT", 2);
        c = uiyVar3;
        d = new uiy[]{uiyVar, uiyVar2, uiyVar3};
    }

    public static uiy valueOf(String str) {
        return (uiy) Enum.valueOf(uiy.class, str);
    }

    public static uiy[] values() {
        return (uiy[]) d.clone();
    }
}
