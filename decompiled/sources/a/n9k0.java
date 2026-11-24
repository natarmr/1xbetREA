package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n9k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n9k0 f23145a;
    public static final n9k0 b;
    public static final n9k0 c;
    public static final /* synthetic */ n9k0[] d;

    static {
        n9k0 n9k0Var = new n9k0("Main", 0);
        f23145a = n9k0Var;
        n9k0 n9k0Var2 = new n9k0("Bottom", 1);
        b = n9k0Var2;
        n9k0 n9k0Var3 = new n9k0("Mediator", 2);
        c = n9k0Var3;
        d = new n9k0[]{n9k0Var, n9k0Var2, n9k0Var3};
    }

    public static n9k0 valueOf(String str) {
        return (n9k0) Enum.valueOf(n9k0.class, str);
    }

    public static n9k0[] values() {
        return (n9k0[]) d.clone();
    }
}
