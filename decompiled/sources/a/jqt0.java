package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jqt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uxs0 f16972a;
    public static final jqt0 b;
    public static final jqt0 c;
    public static final jqt0 d;
    public static final jqt0 e;
    public static final jqt0 f;
    public static final /* synthetic */ jqt0[] g;

    static {
        jqt0 jqt0Var = new jqt0("NONE", 0);
        b = jqt0Var;
        jqt0 jqt0Var2 = new jqt0("MAIL", 1);
        c = jqt0Var2;
        jqt0 jqt0Var3 = new jqt0("PHONE_AND_MAIL", 2);
        d = jqt0Var3;
        jqt0 jqt0Var4 = new jqt0("PHONE", 3);
        e = jqt0Var4;
        jqt0 jqt0Var5 = new jqt0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        f = jqt0Var5;
        g = new jqt0[]{jqt0Var, jqt0Var2, jqt0Var3, jqt0Var4, jqt0Var5};
        f16972a = new uxs0((byte) 4);
    }

    public static jqt0 valueOf(String str) {
        return (jqt0) Enum.valueOf(jqt0.class, str);
    }

    public static jqt0[] values() {
        return (jqt0[]) g.clone();
    }
}
