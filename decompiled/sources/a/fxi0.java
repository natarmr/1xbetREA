package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class fxi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fxi0 f10312a;
    public static final fxi0 b;
    public static final /* synthetic */ fxi0[] c;

    static {
        fxi0 fxi0Var = new fxi0("DEPOSIT", 0);
        f10312a = fxi0Var;
        fxi0 fxi0Var2 = new fxi0("PAYOUT", 1);
        b = fxi0Var2;
        c = new fxi0[]{fxi0Var, fxi0Var2};
    }

    public static fxi0 valueOf(String str) {
        return (fxi0) Enum.valueOf(fxi0.class, str);
    }

    public static fxi0[] values() {
        return (fxi0[]) c.clone();
    }
}
