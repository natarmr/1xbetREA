package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class rzf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rzf0 f31357a;
    public static final rzf0 b;
    public static final rzf0 c;
    public static final /* synthetic */ rzf0[] d;

    static {
        rzf0 rzf0Var = new rzf0("Idle", 0);
        f31357a = rzf0Var;
        rzf0 rzf0Var2 = new rzf0("Restoring", 1);
        b = rzf0Var2;
        rzf0 rzf0Var3 = new rzf0("Restored", 2);
        c = rzf0Var3;
        d = new rzf0[]{rzf0Var, rzf0Var2, rzf0Var3};
    }

    public static rzf0 valueOf(String str) {
        return (rzf0) Enum.valueOf(rzf0.class, str);
    }

    public static rzf0[] values() {
        return (rzf0[]) d.clone();
    }
}
