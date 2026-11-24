package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ay9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ay9 f1660a;
    public static final ay9 b;
    public static final ay9 c;
    public static final ay9 d;
    public static final ay9 e;
    public static final /* synthetic */ ay9[] f;

    static {
        ay9 ay9Var = new ay9(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f1660a = ay9Var;
        ay9 ay9Var2 = new ay9("INACTIVE", 1);
        b = ay9Var2;
        ay9 ay9Var3 = new ay9("METERING", 2);
        c = ay9Var3;
        ay9 ay9Var4 = new ay9("CONVERGED", 3);
        d = ay9Var4;
        ay9 ay9Var5 = new ay9("LOCKED", 4);
        e = ay9Var5;
        f = new ay9[]{ay9Var, ay9Var2, ay9Var3, ay9Var4, ay9Var5};
    }

    public static ay9 valueOf(String str) {
        return (ay9) Enum.valueOf(ay9.class, str);
    }

    public static ay9[] values() {
        return (ay9[]) f.clone();
    }
}
