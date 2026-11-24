package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class qik0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qik0 f28798a;
    public static final qik0 b;
    public static final qik0 c;
    public static final qik0 d;
    public static final qik0 e;
    public static final /* synthetic */ qik0[] f;

    static {
        qik0 qik0Var = new qik0("CELLS", 0);
        f28798a = qik0Var;
        qik0 qik0Var2 = new qik0("SQUARE", 1);
        b = qik0Var2;
        qik0 qik0Var3 = new qik0("CIRCLE", 2);
        c = qik0Var3;
        qik0 qik0Var4 = new qik0("RECTANGLE_HORIZONTAL", 3);
        d = qik0Var4;
        qik0 qik0Var5 = new qik0("RECTANGLE_VERTICAL", 4);
        e = qik0Var5;
        f = new qik0[]{qik0Var, qik0Var2, qik0Var3, qik0Var4, qik0Var5};
    }

    public static qik0 valueOf(String str) {
        return (qik0) Enum.valueOf(qik0.class, str);
    }

    public static qik0[] values() {
        return (qik0[]) f.clone();
    }
}
