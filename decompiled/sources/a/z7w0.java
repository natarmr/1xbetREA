package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class z7w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z7w0 f43941a;
    public static final z7w0 b;
    public static final z7w0 c;
    public static final z7w0 d;
    public static final /* synthetic */ z7w0[] e;

    static {
        z7w0 z7w0Var = new z7w0("MOBILE_GPU", 0);
        f43941a = z7w0Var;
        z7w0 z7w0Var2 = new z7w0("DESKTOP_GPU", 1);
        b = z7w0Var2;
        z7w0 z7w0Var3 = new z7w0("SOFTWARE_CPU", 2);
        c = z7w0Var3;
        z7w0 z7w0Var4 = new z7w0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        d = z7w0Var4;
        e = new z7w0[]{z7w0Var, z7w0Var2, z7w0Var3, z7w0Var4};
    }

    public static z7w0 valueOf(String str) {
        return (z7w0) Enum.valueOf(z7w0.class, str);
    }

    public static z7w0[] values() {
        return (z7w0[]) e.clone();
    }
}
