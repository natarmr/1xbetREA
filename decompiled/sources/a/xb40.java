package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class xb40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xb40 f40583a;
    public static final xb40 b;
    public static final xb40 c;
    public static final xb40 d;
    public static final xb40 e;
    public static final xb40 f;
    public static final /* synthetic */ xb40[] g;

    static {
        xb40 xb40Var = new xb40(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f40583a = xb40Var;
        xb40 xb40Var2 = new xb40("CARRY_POSITION", 1);
        b = xb40Var2;
        xb40 xb40Var3 = new xb40("MIDDLE_POSITION", 2);
        c = xb40Var3;
        xb40 xb40Var4 = new xb40("OFFLANE_POSITION", 3);
        d = xb40Var4;
        xb40 xb40Var5 = new xb40("SUPPORT_POSITION", 4);
        e = xb40Var5;
        xb40 xb40Var6 = new xb40("FULL_SUPPORT_POSITION", 5);
        f = xb40Var6;
        g = new xb40[]{xb40Var, xb40Var2, xb40Var3, xb40Var4, xb40Var5, xb40Var6};
    }

    public static xb40 valueOf(String str) {
        return (xb40) Enum.valueOf(xb40.class, str);
    }

    public static xb40[] values() {
        return (xb40[]) g.clone();
    }
}
