package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class z170 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z170 f43605a;
    public static final z170 b;
    public static final /* synthetic */ z170[] c;

    static {
        z170 z170Var = new z170("LONG", 0);
        f43605a = z170Var;
        z170 z170Var2 = new z170("SHORT", 1);
        b = z170Var2;
        c = new z170[]{z170Var, z170Var2};
    }

    public static z170 valueOf(String str) {
        return (z170) Enum.valueOf(z170.class, str);
    }

    public static z170[] values() {
        return (z170[]) c.clone();
    }
}
