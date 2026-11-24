package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xsf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xsf0 f41414a;
    public static final xsf0 b;
    public static final /* synthetic */ xsf0[] c;

    static {
        xsf0 xsf0Var = new xsf0("Ltr", 0);
        f41414a = xsf0Var;
        xsf0 xsf0Var2 = new xsf0("Rtl", 1);
        b = xsf0Var2;
        c = new xsf0[]{xsf0Var, xsf0Var2};
    }

    public static xsf0 valueOf(String str) {
        return (xsf0) Enum.valueOf(xsf0.class, str);
    }

    public static xsf0[] values() {
        return (xsf0[]) c.clone();
    }
}
