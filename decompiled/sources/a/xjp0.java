package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class xjp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xjp0 f40998a;
    public static final xjp0 b;
    public static final /* synthetic */ xjp0[] c;

    static {
        xjp0 xjp0Var = new xjp0("LEFT", 0);
        f40998a = xjp0Var;
        xjp0 xjp0Var2 = new xjp0("RIGHT", 1);
        b = xjp0Var2;
        c = new xjp0[]{xjp0Var, xjp0Var2};
    }

    public static xjp0 valueOf(String str) {
        return (xjp0) Enum.valueOf(xjp0.class, str);
    }

    public static xjp0[] values() {
        return (xjp0[]) c.clone();
    }
}
