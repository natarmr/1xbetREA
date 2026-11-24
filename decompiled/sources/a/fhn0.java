package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class fhn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fhn0 f9551a;
    public static final fhn0 b;
    public static final fhn0 c;
    public static final /* synthetic */ fhn0[] d;

    static {
        fhn0 fhn0Var = new fhn0("CONTINUE", 0);
        f9551a = fhn0Var;
        fhn0 fhn0Var2 = new fhn0("HISTORY", 1);
        b = fhn0Var2;
        fhn0 fhn0Var3 = new fhn0("SHARE", 2);
        c = fhn0Var3;
        d = new fhn0[]{fhn0Var, fhn0Var2, fhn0Var3};
    }

    public static fhn0 valueOf(String str) {
        return (fhn0) Enum.valueOf(fhn0.class, str);
    }

    public static fhn0[] values() {
        return (fhn0[]) d.clone();
    }
}
