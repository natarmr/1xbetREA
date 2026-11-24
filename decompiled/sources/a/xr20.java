package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class xr20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xr20 f41348a;
    public static final xr20 b;
    public static final /* synthetic */ xr20[] c;

    static {
        xr20 xr20Var = new xr20("START", 0);
        f41348a = xr20Var;
        xr20 xr20Var2 = new xr20("END", 1);
        b = xr20Var2;
        c = new xr20[]{xr20Var, xr20Var2};
    }

    public static xr20 valueOf(String str) {
        return (xr20) Enum.valueOf(xr20.class, str);
    }

    public static xr20[] values() {
        return (xr20[]) c.clone();
    }
}
