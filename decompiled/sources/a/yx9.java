package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yx9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yx9 f43409a;
    public static final yx9 b;
    public static final yx9 c;
    public static final yx9 d;
    public static final yx9 e;
    public static final yx9 f;
    public static final /* synthetic */ yx9[] g;

    static {
        yx9 yx9Var = new yx9(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f43409a = yx9Var;
        yx9 yx9Var2 = new yx9("INACTIVE", 1);
        b = yx9Var2;
        yx9 yx9Var3 = new yx9("SEARCHING", 2);
        c = yx9Var3;
        yx9 yx9Var4 = new yx9("FLASH_REQUIRED", 3);
        d = yx9Var4;
        yx9 yx9Var5 = new yx9("CONVERGED", 4);
        e = yx9Var5;
        yx9 yx9Var6 = new yx9("LOCKED", 5);
        f = yx9Var6;
        g = new yx9[]{yx9Var, yx9Var2, yx9Var3, yx9Var4, yx9Var5, yx9Var6};
    }

    public static yx9 valueOf(String str) {
        return (yx9) Enum.valueOf(yx9.class, str);
    }

    public static yx9[] values() {
        return (yx9[]) g.clone();
    }
}
