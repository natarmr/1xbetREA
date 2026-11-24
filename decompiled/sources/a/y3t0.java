package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class y3t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y3t0 f41970a;
    public static final y3t0 b;
    public static final /* synthetic */ y3t0[] c;

    static {
        y3t0 y3t0Var = new y3t0("VERTICAL", 0);
        f41970a = y3t0Var;
        y3t0 y3t0Var2 = new y3t0("HORIZONTAL", 1);
        b = y3t0Var2;
        c = new y3t0[]{y3t0Var, y3t0Var2};
    }

    public static y3t0 valueOf(String str) {
        return (y3t0) Enum.valueOf(y3t0.class, str);
    }

    public static y3t0[] values() {
        return (y3t0[]) c.clone();
    }
}
