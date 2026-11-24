package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class amo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final amo0 f1119a;
    public static final amo0 b;
    public static final /* synthetic */ amo0[] c;

    static {
        amo0 amo0Var = new amo0("RED", 0);
        f1119a = amo0Var;
        amo0 amo0Var2 = new amo0("BLUE", 1);
        b = amo0Var2;
        c = new amo0[]{amo0Var, amo0Var2};
    }

    public static amo0 valueOf(String str) {
        return (amo0) Enum.valueOf(amo0.class, str);
    }

    public static amo0[] values() {
        return (amo0[]) c.clone();
    }
}
