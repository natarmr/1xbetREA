package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class xmp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xmp0 f41140a;
    public static final xmp0 b;
    public static final xmp0 c;
    public static final xmp0 d;
    public static final /* synthetic */ xmp0[] e;

    static {
        xmp0 xmp0Var = new xmp0("RETIRED", 0);
        f41140a = xmp0Var;
        xmp0 xmp0Var2 = new xmp0("INACTIVE", 1);
        b = xmp0Var2;
        xmp0 xmp0Var3 = new xmp0("FREE", 2);
        c = xmp0Var3;
        xmp0 xmp0Var4 = new xmp0("TEAM", 3);
        d = xmp0Var4;
        e = new xmp0[]{xmp0Var, xmp0Var2, xmp0Var3, xmp0Var4};
    }

    public static xmp0 valueOf(String str) {
        return (xmp0) Enum.valueOf(xmp0.class, str);
    }

    public static xmp0[] values() {
        return (xmp0[]) e.clone();
    }
}
