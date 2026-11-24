package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class k0p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k0p0 f17480a;
    public static final k0p0 b;
    public static final k0p0 c;
    public static final k0p0 d;
    public static final /* synthetic */ k0p0[] e;

    static {
        k0p0 k0p0Var = new k0p0("DRAW", 0);
        f17480a = k0p0Var;
        k0p0 k0p0Var2 = new k0p0("FIRST_TEAM", 1);
        b = k0p0Var2;
        k0p0 k0p0Var3 = new k0p0("SECOND_TEAM", 2);
        c = k0p0Var3;
        k0p0 k0p0Var4 = new k0p0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        d = k0p0Var4;
        e = new k0p0[]{k0p0Var, k0p0Var2, k0p0Var3, k0p0Var4};
    }

    public static k0p0 valueOf(String str) {
        return (k0p0) Enum.valueOf(k0p0.class, str);
    }

    public static k0p0[] values() {
        return (k0p0[]) e.clone();
    }
}
