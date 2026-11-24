package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ulo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ulo0 f35883a;
    public static final ulo0 b;
    public static final /* synthetic */ ulo0[] c;

    static {
        ulo0 ulo0Var = new ulo0("FIXED", 0);
        f35883a = ulo0Var;
        ulo0 ulo0Var2 = new ulo0("SCROLLABLE", 1);
        b = ulo0Var2;
        c = new ulo0[]{ulo0Var, ulo0Var2};
    }

    public static ulo0 valueOf(String str) {
        return (ulo0) Enum.valueOf(ulo0.class, str);
    }

    public static ulo0[] values() {
        return (ulo0[]) c.clone();
    }
}
