package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ehs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ehs0 f7823a;
    public static final ehs0 b;
    public static final /* synthetic */ ehs0[] c;

    static {
        ehs0 ehs0Var = new ehs0("DEFERRED", 0);
        f7823a = ehs0Var;
        ehs0 ehs0Var2 = new ehs0("IMMEDIATE", 1);
        b = ehs0Var2;
        c = new ehs0[]{ehs0Var, ehs0Var2, new ehs0("EXCLUSIVE", 2)};
    }

    public static ehs0 valueOf(String str) {
        return (ehs0) Enum.valueOf(ehs0.class, str);
    }

    public static ehs0[] values() {
        return (ehs0[]) c.clone();
    }
}
