package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class tig0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tig0 f34009a;
    public static final tig0 b;
    public static final tig0 c;
    public static final tig0 d;
    public static final tig0 e;
    public static final /* synthetic */ tig0[] f;

    static {
        tig0 tig0Var = new tig0("NOT_FINISHED", 0);
        f34009a = tig0Var;
        tig0 tig0Var2 = new tig0("ONE_WINNER", 1);
        b = tig0Var2;
        tig0 tig0Var3 = new tig0("TWO_WINNER", 2);
        c = tig0Var3;
        tig0 tig0Var4 = new tig0("NO_WINNER", 3);
        d = tig0Var4;
        tig0 tig0Var5 = new tig0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        e = tig0Var5;
        f = new tig0[]{tig0Var, tig0Var2, tig0Var3, tig0Var4, tig0Var5};
    }

    public static tig0 valueOf(String str) {
        return (tig0) Enum.valueOf(tig0.class, str);
    }

    public static tig0[] values() {
        return (tig0[]) f.clone();
    }
}
