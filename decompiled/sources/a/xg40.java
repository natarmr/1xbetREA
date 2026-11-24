package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class xg40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xg40 f40822a;
    public static final xg40 b;
    public static final /* synthetic */ xg40[] c;

    static {
        xg40 xg40Var = new xg40("DOWN", 0);
        f40822a = xg40Var;
        xg40 xg40Var2 = new xg40("UP", 1);
        b = xg40Var2;
        c = new xg40[]{xg40Var, xg40Var2};
    }

    public static xg40 valueOf(String str) {
        return (xg40) Enum.valueOf(xg40.class, str);
    }

    public static xg40[] values() {
        return (xg40[]) c.clone();
    }
}
