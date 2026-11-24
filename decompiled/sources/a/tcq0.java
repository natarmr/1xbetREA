package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class tcq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tcq0 f33730a;
    public static final tcq0 b;
    public static final tcq0 c;
    public static final tcq0 d;
    public static final tcq0 e;
    public static final /* synthetic */ tcq0[] f;

    static {
        tcq0 tcq0Var = new tcq0("SINGLE_EXTERNAL", 0);
        f33730a = tcq0Var;
        tcq0 tcq0Var2 = new tcq0("SINGLE_INTERNAL", 1);
        b = tcq0Var2;
        tcq0 tcq0Var3 = new tcq0("DOUBLE", 2);
        c = tcq0Var3;
        tcq0 tcq0Var4 = new tcq0("TREBLE", 3);
        d = tcq0Var4;
        tcq0 tcq0Var5 = new tcq0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        e = tcq0Var5;
        f = new tcq0[]{tcq0Var, tcq0Var2, tcq0Var3, tcq0Var4, tcq0Var5};
    }

    public static tcq0 valueOf(String str) {
        return (tcq0) Enum.valueOf(tcq0.class, str);
    }

    public static tcq0[] values() {
        return (tcq0[]) f.clone();
    }
}
