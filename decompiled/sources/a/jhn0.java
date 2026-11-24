package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class jhn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g9m0 f16537a;
    public static final jhn0 b;
    public static final jhn0 c;
    public static final /* synthetic */ jhn0[] d;

    static {
        jhn0 jhn0Var = new jhn0("VALID", 0);
        b = jhn0Var;
        jhn0 jhn0Var2 = new jhn0("INVALID", 1);
        jhn0 jhn0Var3 = new jhn0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        c = jhn0Var3;
        d = new jhn0[]{jhn0Var, jhn0Var2, jhn0Var3};
        f16537a = new g9m0();
    }

    public static jhn0 valueOf(String str) {
        return (jhn0) Enum.valueOf(jhn0.class, str);
    }

    public static jhn0[] values() {
        return (jhn0[]) d.clone();
    }
}
