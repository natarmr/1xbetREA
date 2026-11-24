package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yvd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yvd0 f43313a;
    public static final yvd0 b;
    public static final yvd0 c;
    public static final yvd0 d;
    public static final /* synthetic */ yvd0[] e;

    static {
        yvd0 yvd0Var = new yvd0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f43313a = yvd0Var;
        yvd0 yvd0Var2 = new yvd0("PICK", 1);
        b = yvd0Var2;
        yvd0 yvd0Var3 = new yvd0("BAN", 2);
        c = yvd0Var3;
        yvd0 yvd0Var4 = new yvd0("DECIDE", 3);
        d = yvd0Var4;
        e = new yvd0[]{yvd0Var, yvd0Var2, yvd0Var3, yvd0Var4};
    }

    public static yvd0 valueOf(String str) {
        return (yvd0) Enum.valueOf(yvd0.class, str);
    }

    public static yvd0[] values() {
        return (yvd0[]) e.clone();
    }
}
