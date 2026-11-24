package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class lig0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lig0 f20104a;
    public static final lig0 b;
    public static final lig0 c;
    public static final lig0 d;
    public static final /* synthetic */ lig0[] e;

    static {
        lig0 lig0Var = new lig0("ROCK", 0);
        f20104a = lig0Var;
        lig0 lig0Var2 = new lig0("PAPER", 1);
        b = lig0Var2;
        lig0 lig0Var3 = new lig0("SCISSORS", 2);
        c = lig0Var3;
        lig0 lig0Var4 = new lig0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        d = lig0Var4;
        e = new lig0[]{lig0Var, lig0Var2, lig0Var3, lig0Var4};
    }

    public static lig0 valueOf(String str) {
        return (lig0) Enum.valueOf(lig0.class, str);
    }

    public static lig0[] values() {
        return (lig0[]) e.clone();
    }
}
