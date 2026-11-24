package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class isp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final isp f15316a;
    public static final isp b;
    public static final isp c;
    public static final isp d;
    public static final isp e;
    public static final /* synthetic */ isp[] f;

    static {
        isp ispVar = new isp("B", 0);
        f15316a = ispVar;
        isp ispVar2 = new isp(TokenNames.F, 1);
        b = ispVar2;
        isp ispVar3 = new isp("FS", 2);
        c = ispVar3;
        isp ispVar4 = new isp("KO", 3);
        d = ispVar4;
        isp ispVar5 = new isp(TokenNames.R, 4);
        e = ispVar5;
        f = new isp[]{ispVar, ispVar2, ispVar3, ispVar4, ispVar5};
    }

    public static isp valueOf(String str) {
        return (isp) Enum.valueOf(isp.class, str);
    }

    public static isp[] values() {
        return (isp[]) f.clone();
    }
}
