package a;

import android.gov.nist.javax.sip.parser.TokenNames;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class uyp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uyp f36502a;
    public static final uyp b;
    public static final uyp c;
    public static final uyp d;
    public static final uyp e;
    public static final /* synthetic */ uyp[] f;

    static {
        uyp uypVar = new uyp("B", 0);
        f36502a = uypVar;
        uyp uypVar2 = new uyp(TokenNames.F, 1);
        b = uypVar2;
        uyp uypVar3 = new uyp("FS", 2);
        c = uypVar3;
        uyp uypVar4 = new uyp("KO", 3);
        d = uypVar4;
        uyp uypVar5 = new uyp(TokenNames.R, 4);
        e = uypVar5;
        f = new uyp[]{uypVar, uypVar2, uypVar3, uypVar4, uypVar5};
    }

    public static uyp valueOf(String str) {
        return (uyp) Enum.valueOf(uyp.class, str);
    }

    public static uyp[] values() {
        return (uyp[]) f.clone();
    }
}
