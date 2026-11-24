package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class z1s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1s0 f43637a;
    public static final z1s0 b;
    public static final /* synthetic */ z1s0[] c;

    static {
        z1s0 z1s0Var = new z1s0("CRM", 0);
        f43637a = z1s0Var;
        z1s0 z1s0Var2 = new z1s0("PROVIDER", 1);
        b = z1s0Var2;
        c = new z1s0[]{z1s0Var, z1s0Var2};
    }

    public static z1s0 valueOf(String str) {
        return (z1s0) Enum.valueOf(z1s0.class, str);
    }

    public static z1s0[] values() {
        return (z1s0[]) c.clone();
    }
}
