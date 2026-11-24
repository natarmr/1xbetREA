package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class xn4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xn4 f41154a;
    public static final xn4 b;
    public static final /* synthetic */ xn4[] c;

    static {
        xn4 xn4Var = new xn4("LOGIN", 0);
        f41154a = xn4Var;
        xn4 xn4Var2 = new xn4("REGISTRATION", 1);
        b = xn4Var2;
        c = new xn4[]{xn4Var, xn4Var2};
    }

    public static xn4 valueOf(String str) {
        return (xn4) Enum.valueOf(xn4.class, str);
    }

    public static xn4[] values() {
        return (xn4[]) c.clone();
    }
}
