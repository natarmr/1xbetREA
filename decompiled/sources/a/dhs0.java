package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dhs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dhs0 f6106a;
    public static final dhs0 b;
    public static final /* synthetic */ dhs0[] c;

    static {
        dhs0 dhs0Var = new dhs0("DEFERRED", 0);
        f6106a = dhs0Var;
        dhs0 dhs0Var2 = new dhs0("IMMEDIATE", 1);
        b = dhs0Var2;
        c = new dhs0[]{dhs0Var, dhs0Var2, new dhs0("EXCLUSIVE", 2)};
    }

    public static dhs0 valueOf(String str) {
        return (dhs0) Enum.valueOf(dhs0.class, str);
    }

    public static dhs0[] values() {
        return (dhs0[]) c.clone();
    }
}
