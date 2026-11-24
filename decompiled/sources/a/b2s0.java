package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b2s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b2s0 f1870a;
    public static final b2s0 b;
    public static final b2s0 c;
    public static final b2s0 d;
    public static final b2s0 e;
    public static final b2s0 f;
    public static final /* synthetic */ b2s0[] g;

    static {
        b2s0 b2s0Var = new b2s0("SUP", 0);
        f1870a = b2s0Var;
        b2s0 b2s0Var2 = new b2s0("TOP", 1);
        b = b2s0Var2;
        b2s0 b2s0Var3 = new b2s0("MID", 2);
        c = b2s0Var3;
        b2s0 b2s0Var4 = new b2s0("JUN", 3);
        d = b2s0Var4;
        b2s0 b2s0Var5 = new b2s0("ADC", 4);
        e = b2s0Var5;
        b2s0 b2s0Var6 = new b2s0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
        f = b2s0Var6;
        g = new b2s0[]{b2s0Var, b2s0Var2, b2s0Var3, b2s0Var4, b2s0Var5, b2s0Var6};
    }

    public static b2s0 valueOf(String str) {
        return (b2s0) Enum.valueOf(b2s0.class, str);
    }

    public static b2s0[] values() {
        return (b2s0[]) g.clone();
    }
}
