package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class nj40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nj40 f23617a;
    public static final nj40 b;
    public static final nj40 c;
    public static final nj40 d;
    public static final nj40 e;
    public static final nj40 f;
    public static final /* synthetic */ nj40[] g;

    static {
        nj40 nj40Var = new nj40("EXP_LANE", 0);
        f23617a = nj40Var;
        nj40 nj40Var2 = new nj40("JUNGLER", 1);
        b = nj40Var2;
        nj40 nj40Var3 = new nj40("MID_LANE", 2);
        c = nj40Var3;
        nj40 nj40Var4 = new nj40("GOLD_LANE", 3);
        d = nj40Var4;
        nj40 nj40Var5 = new nj40("ROAM", 4);
        e = nj40Var5;
        nj40 nj40Var6 = new nj40(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
        f = nj40Var6;
        g = new nj40[]{nj40Var, nj40Var2, nj40Var3, nj40Var4, nj40Var5, nj40Var6};
    }

    public static nj40 valueOf(String str) {
        return (nj40) Enum.valueOf(nj40.class, str);
    }

    public static nj40[] values() {
        return (nj40[]) g.clone();
    }
}
