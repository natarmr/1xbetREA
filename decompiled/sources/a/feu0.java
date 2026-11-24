package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class feu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final feu0 f9423a;
    public static final feu0 b;
    public static final feu0 c;
    public static final feu0 d;
    public static final feu0 e;
    public static final /* synthetic */ feu0[] f;

    static {
        feu0 feu0Var = new feu0("SUM_SUM", 0);
        f9423a = feu0Var;
        feu0 feu0Var2 = new feu0("SUM_MULTIPLY", 1);
        b = feu0Var2;
        feu0 feu0Var3 = new feu0("MULTIPLY_SUM", 2);
        c = feu0Var3;
        feu0 feu0Var4 = new feu0("MULTIPLY_MULTIPLY", 3);
        d = feu0Var4;
        feu0 feu0Var5 = new feu0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        e = feu0Var5;
        f = new feu0[]{feu0Var, feu0Var2, feu0Var3, feu0Var4, feu0Var5};
    }

    public static feu0 valueOf(String str) {
        return (feu0) Enum.valueOf(feu0.class, str);
    }

    public static feu0[] values() {
        return (feu0[]) f.clone();
    }
}
