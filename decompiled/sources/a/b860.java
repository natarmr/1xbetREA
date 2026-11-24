package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b860 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final atz f2142a;
    public static final b860 b;
    public static final b860 c;
    public static final b860 d;
    public static final b860 e;
    public static final b860 f;
    public static final /* synthetic */ b860[] g;

    static {
        b860 b860Var = new b860("MATCH_BEGIN", 0);
        b = b860Var;
        b860 b860Var2 = new b860("URGENT", 1);
        c = b860Var2;
        b860 b860Var3 = new b860("PERIOD", 2);
        d = b860Var3;
        b860 b860Var4 = new b860("INFO_GAME", 3);
        e = b860Var4;
        b860 b860Var5 = new b860(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        f = b860Var5;
        g = new b860[]{b860Var, b860Var2, b860Var3, b860Var4, b860Var5};
        f2142a = new atz();
    }

    public static b860 valueOf(String str) {
        return (b860) Enum.valueOf(b860.class, str);
    }

    public static b860[] values() {
        return (b860[]) g.clone();
    }
}
