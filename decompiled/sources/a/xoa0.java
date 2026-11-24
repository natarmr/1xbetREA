package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class xoa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xoa0 f41207a;
    public static final xoa0 b;
    public static final xoa0 c;
    public static final /* synthetic */ xoa0[] d;

    static {
        xoa0 xoa0Var = new xoa0("Initial", 0);
        f41207a = xoa0Var;
        xoa0 xoa0Var2 = new xoa0("Main", 1);
        b = xoa0Var2;
        xoa0 xoa0Var3 = new xoa0("Final", 2);
        c = xoa0Var3;
        d = new xoa0[]{xoa0Var, xoa0Var2, xoa0Var3};
    }

    public static xoa0 valueOf(String str) {
        return (xoa0) Enum.valueOf(xoa0.class, str);
    }

    public static xoa0[] values() {
        return (xoa0[]) d.clone();
    }
}
