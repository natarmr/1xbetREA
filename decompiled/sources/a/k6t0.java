package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class k6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k6t0 f17788a;
    public static final k6t0 b;
    public static final k6t0 c;
    public static final k6t0 d;
    public static final /* synthetic */ k6t0[] e;

    static {
        k6t0 k6t0Var = new k6t0("FIRST", 0);
        f17788a = k6t0Var;
        k6t0 k6t0Var2 = new k6t0("SECOND", 1);
        b = k6t0Var2;
        k6t0 k6t0Var3 = new k6t0("DRAW", 2);
        c = k6t0Var3;
        k6t0 k6t0Var4 = new k6t0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        d = k6t0Var4;
        e = new k6t0[]{k6t0Var, k6t0Var2, k6t0Var3, k6t0Var4};
    }

    public static k6t0 valueOf(String str) {
        return (k6t0) Enum.valueOf(k6t0.class, str);
    }

    public static k6t0[] values() {
        return (k6t0[]) e.clone();
    }
}
