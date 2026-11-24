package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jkg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jkg0 f16667a;
    public static final jkg0 b;
    public static final jkg0 c;
    public static final jkg0 d;
    public static final /* synthetic */ jkg0[] e;

    static {
        jkg0 jkg0Var = new jkg0("ONE_WINNER", 0);
        f16667a = jkg0Var;
        jkg0 jkg0Var2 = new jkg0("TWO_WINNER", 1);
        b = jkg0Var2;
        jkg0 jkg0Var3 = new jkg0("NO_WINNER", 2);
        c = jkg0Var3;
        jkg0 jkg0Var4 = new jkg0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        d = jkg0Var4;
        e = new jkg0[]{jkg0Var, jkg0Var2, jkg0Var3, jkg0Var4};
    }

    public static jkg0 valueOf(String str) {
        return (jkg0) Enum.valueOf(jkg0.class, str);
    }

    public static jkg0[] values() {
        return (jkg0[]) e.clone();
    }
}
