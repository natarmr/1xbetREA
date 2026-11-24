package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class mrh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cge0 f22272a;
    public static final mrh0 b;
    public static final mrh0 c;
    public static final mrh0 d;
    public static final mrh0 e;
    public static final mrh0 f;
    public static final /* synthetic */ mrh0[] g;

    static {
        mrh0 mrh0Var = new mrh0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        b = mrh0Var;
        mrh0 mrh0Var2 = new mrh0("LOW", 1);
        c = mrh0Var2;
        mrh0 mrh0Var3 = new mrh0("BAD", 2);
        d = mrh0Var3;
        mrh0 mrh0Var4 = new mrh0("NORMAL", 3);
        e = mrh0Var4;
        mrh0 mrh0Var5 = new mrh0("HIGH", 4);
        f = mrh0Var5;
        g = new mrh0[]{mrh0Var, mrh0Var2, mrh0Var3, mrh0Var4, mrh0Var5};
        f22272a = new cge0((byte) 16);
    }

    public static mrh0 valueOf(String str) {
        return (mrh0) Enum.valueOf(mrh0.class, str);
    }

    public static mrh0[] values() {
        return (mrh0[]) g.clone();
    }
}
