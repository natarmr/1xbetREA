package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xdg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xdg0 f40691a;
    public static final xdg0 b;
    public static final /* synthetic */ xdg0[] c;

    /* JADX INFO: Fake field, exist only in values array */
    xdg0 EF0;

    static {
        xdg0 xdg0Var = new xdg0("AUTOMATIC", 0);
        xdg0 xdg0Var2 = new xdg0("TRUNCATE", 1);
        f40691a = xdg0Var2;
        xdg0 xdg0Var3 = new xdg0("WRITE_AHEAD_LOGGING", 2);
        b = xdg0Var3;
        c = new xdg0[]{xdg0Var, xdg0Var2, xdg0Var3};
    }

    public static xdg0 valueOf(String str) {
        return (xdg0) Enum.valueOf(xdg0.class, str);
    }

    public static xdg0[] values() {
        return (xdg0[]) c.clone();
    }
}
