package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class tba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nh70 f33654a;
    public static final tba0 b;
    public static final tba0 c;
    public static final tba0 d;
    public static final /* synthetic */ tba0[] e;

    static {
        tba0 tba0Var = new tba0("MASS", 0);
        b = tba0Var;
        tba0 tba0Var2 = new tba0("INDIVIDUAL", 1);
        c = tba0Var2;
        tba0 tba0Var3 = new tba0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        d = tba0Var3;
        e = new tba0[]{tba0Var, tba0Var2, tba0Var3};
        f33654a = new nh70();
    }

    public static tba0 valueOf(String str) {
        return (tba0) Enum.valueOf(tba0.class, str);
    }

    public static tba0[] values() {
        return (tba0[]) e.clone();
    }
}
