package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class iui0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iui0 f15398a;
    public static final iui0 b;
    public static final /* synthetic */ iui0[] c;

    static {
        iui0 iui0Var = new iui0("SHOW_ALL", 0);
        f15398a = iui0Var;
        iui0 iui0Var2 = new iui0("RESET_SETTING", 1);
        b = iui0Var2;
        c = new iui0[]{iui0Var, iui0Var2};
    }

    public static iui0 valueOf(String str) {
        return (iui0) Enum.valueOf(iui0.class, str);
    }

    public static iui0[] values() {
        return (iui0[]) c.clone();
    }
}
