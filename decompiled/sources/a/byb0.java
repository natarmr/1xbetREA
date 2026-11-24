package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class byb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byb0 f3409a;
    public static final byb0 b;
    public static final byb0 c;
    public static final byb0 d;
    public static final /* synthetic */ byb0[] e;

    static {
        byb0 byb0Var = new byb0("MONEY", 0);
        f3409a = byb0Var;
        byb0 byb0Var2 = new byb0("BONUS", 1);
        b = byb0Var2;
        byb0 byb0Var3 = new byb0("FREE_SPINS", 2);
        c = byb0Var3;
        byb0 byb0Var4 = new byb0("MONEY_MIN_STAGE", 3);
        d = byb0Var4;
        e = new byb0[]{byb0Var, byb0Var2, byb0Var3, byb0Var4};
    }

    public static byb0 valueOf(String str) {
        return (byb0) Enum.valueOf(byb0.class, str);
    }

    public static byb0[] values() {
        return (byb0[]) e.clone();
    }
}
