package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class n6l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n6l0 f23002a;
    public static final n6l0 b;
    public static final n6l0 c;
    public static final n6l0 d;
    public static final /* synthetic */ n6l0[] e;

    static {
        n6l0 n6l0Var = new n6l0("LARGE", 0);
        f23002a = n6l0Var;
        n6l0 n6l0Var2 = new n6l0("SMALL", 1);
        b = n6l0Var2;
        n6l0 n6l0Var3 = new n6l0("CIRCLE", 2);
        c = n6l0Var3;
        n6l0 n6l0Var4 = new n6l0("RECTANGLE", 3);
        d = n6l0Var4;
        e = new n6l0[]{n6l0Var, n6l0Var2, n6l0Var3, n6l0Var4};
    }

    public static n6l0 valueOf(String str) {
        return (n6l0) Enum.valueOf(n6l0.class, str);
    }

    public static n6l0[] values() {
        return (n6l0[]) e.clone();
    }
}
