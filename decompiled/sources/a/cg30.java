package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class cg30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cg30 f4294a;
    public static final cg30 b;
    public static final cg30 c;
    public static final cg30 d;
    public static final cg30 e;
    public static final cg30 f;
    public static final cg30 g;
    public static final cg30 h;
    public static final /* synthetic */ cg30[] i;

    static {
        cg30 cg30Var = new cg30(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f4294a = cg30Var;
        cg30 cg30Var2 = new cg30("MATCH_INTERRUPTED", 1);
        b = cg30Var2;
        cg30 cg30Var3 = new cg30("MATCH_POSTPONED", 2);
        c = cg30Var3;
        cg30 cg30Var4 = new cg30("MATCH_DETAIL_BEING_CONFIRMED", 3);
        d = cg30Var4;
        cg30 cg30Var5 = new cg30("MATCH_CANCELED_WITH_RULES", 4);
        e = cg30Var5;
        cg30 cg30Var6 = new cg30("OPPONENTS_WITHDRAWAL", 5);
        f = cg30Var6;
        cg30 cg30Var7 = new cg30("MATCH_CANCELED", 6);
        g = cg30Var7;
        cg30 cg30Var8 = new cg30("MATCH_INTERRUPTED_INFORMATION_CLARIFIED", 7);
        h = cg30Var8;
        i = new cg30[]{cg30Var, cg30Var2, cg30Var3, cg30Var4, cg30Var5, cg30Var6, cg30Var7, cg30Var8};
    }

    public static cg30 valueOf(String str) {
        return (cg30) Enum.valueOf(cg30.class, str);
    }

    public static cg30[] values() {
        return (cg30[]) i.clone();
    }
}
