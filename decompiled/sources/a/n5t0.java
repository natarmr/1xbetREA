package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class n5t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n5t0 f22962a;
    public static final n5t0 b;
    public static final n5t0 c;
    public static final /* synthetic */ n5t0[] d;

    static {
        n5t0 n5t0Var = new n5t0("Loading", 0);
        f22962a = n5t0Var;
        n5t0 n5t0Var2 = new n5t0("Content", 1);
        b = n5t0Var2;
        n5t0 n5t0Var3 = new n5t0("Error", 2);
        c = n5t0Var3;
        d = new n5t0[]{n5t0Var, n5t0Var2, n5t0Var3};
    }

    public static n5t0 valueOf(String str) {
        return (n5t0) Enum.valueOf(n5t0.class, str);
    }

    public static n5t0[] values() {
        return (n5t0[]) d.clone();
    }
}
