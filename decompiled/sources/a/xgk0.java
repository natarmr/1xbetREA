package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class xgk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xgk0 f40845a;
    public static final xgk0 b;
    public static final xgk0 c;
    public static final /* synthetic */ xgk0[] d;

    static {
        xgk0 xgk0Var = new xgk0("SELECTED", 0);
        f40845a = xgk0Var;
        xgk0 xgk0Var2 = new xgk0("ERROR", 1);
        b = xgk0Var2;
        xgk0 xgk0Var3 = new xgk0("DEFAULT", 2);
        c = xgk0Var3;
        d = new xgk0[]{xgk0Var, xgk0Var2, xgk0Var3};
    }

    public static xgk0 valueOf(String str) {
        return (xgk0) Enum.valueOf(xgk0.class, str);
    }

    public static xgk0[] values() {
        return (xgk0[]) d.clone();
    }
}
