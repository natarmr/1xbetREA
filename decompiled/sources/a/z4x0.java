package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class z4x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z4x0 f43793a;
    public static final z4x0 b;
    public static final /* synthetic */ z4x0[] c;

    static {
        z4x0 z4x0Var = new z4x0("CONSENT", 0);
        f43793a = z4x0Var;
        z4x0 z4x0Var2 = new z4x0("LEGITIMATE_INTEREST", 1);
        z4x0 z4x0Var3 = new z4x0("FLEXIBLE_CONSENT", 2);
        z4x0 z4x0Var4 = new z4x0("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        b = z4x0Var4;
        c = new z4x0[]{z4x0Var, z4x0Var2, z4x0Var3, z4x0Var4};
    }

    public static z4x0[] values() {
        return (z4x0[]) c.clone();
    }
}
