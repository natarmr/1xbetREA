package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class qrf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qrf0 f29208a;
    public static final qrf0 b;
    public static final qrf0 c;
    public static final qrf0 d;
    public static final qrf0 e;
    public static final qrf0 f;
    public static final qrf0 g;
    public static final /* synthetic */ qrf0[] h;

    static {
        qrf0 qrf0Var = new qrf0("DYNAMITE", 0);
        f29208a = qrf0Var;
        qrf0 qrf0Var2 = new qrf0("CUP", 1);
        b = qrf0Var2;
        qrf0 qrf0Var3 = new qrf0("GOLD", 2);
        c = qrf0Var3;
        qrf0 qrf0Var4 = new qrf0("ALCOHOL", 3);
        d = qrf0Var4;
        qrf0 qrf0Var5 = new qrf0("EMPTY", 4);
        e = qrf0Var5;
        qrf0 qrf0Var6 = new qrf0("DYNAMITE_EXTINGUISHER", 5);
        f = qrf0Var6;
        qrf0 qrf0Var7 = new qrf0("CLOSED", 6);
        g = qrf0Var7;
        h = new qrf0[]{qrf0Var, qrf0Var2, qrf0Var3, qrf0Var4, qrf0Var5, qrf0Var6, qrf0Var7};
    }

    public static qrf0 valueOf(String str) {
        return (qrf0) Enum.valueOf(qrf0.class, str);
    }

    public static qrf0[] values() {
        return (qrf0[]) h.clone();
    }
}
