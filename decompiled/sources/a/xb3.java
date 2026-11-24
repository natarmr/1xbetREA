package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class xb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xb3 f40580a;
    public static final xb3 b;
    public static final xb3 c;
    public static final xb3 d;
    public static final /* synthetic */ xb3[] e;

    static {
        xb3 xb3Var = new xb3("EXPANDED", 0);
        f40580a = xb3Var;
        xb3 xb3Var2 = new xb3("COLLAPSED", 1);
        b = xb3Var2;
        xb3 xb3Var3 = new xb3("IDLE_UP", 2);
        c = xb3Var3;
        xb3 xb3Var4 = new xb3("IDLE_DOWN", 3);
        d = xb3Var4;
        e = new xb3[]{xb3Var, xb3Var2, xb3Var3, xb3Var4};
    }

    public static xb3 valueOf(String str) {
        return (xb3) Enum.valueOf(xb3.class, str);
    }

    public static xb3[] values() {
        return (xb3[]) e.clone();
    }
}
