package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f43540a;
    public static final z0 b;
    public static final z0 c;
    public static final /* synthetic */ z0[] d;

    static {
        z0 z0Var = new z0("PROPERTY", 0);
        f43540a = z0Var;
        z0 z0Var2 = new z0("BACKING_FIELD", 1);
        b = z0Var2;
        z0 z0Var3 = new z0("DELEGATE_FIELD", 2);
        c = z0Var3;
        d = new z0[]{z0Var, z0Var2, z0Var3};
    }

    public static z0 valueOf(String str) {
        return (z0) Enum.valueOf(z0.class, str);
    }

    public static z0[] values() {
        return (z0[]) d.clone();
    }
}
