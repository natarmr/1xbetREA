package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class xds0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xds0 f40711a;
    public static final xds0 b;
    public static final xds0 c;
    public static final xds0 d;
    public static final /* synthetic */ xds0[] e;

    static {
        xds0 xds0Var = new xds0("SINGLE", 0);
        f40711a = xds0Var;
        xds0 xds0Var2 = new xds0("FIRST", 1);
        b = xds0Var2;
        xds0 xds0Var3 = new xds0("MIDDLE", 2);
        c = xds0Var3;
        xds0 xds0Var4 = new xds0("LAST", 3);
        d = xds0Var4;
        e = new xds0[]{xds0Var, xds0Var2, xds0Var3, xds0Var4};
    }

    public static xds0 valueOf(String str) {
        return (xds0) Enum.valueOf(xds0.class, str);
    }

    public static xds0[] values() {
        return (xds0[]) e.clone();
    }
}
