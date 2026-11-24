package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class nu4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nu4 f24131a;
    public static final nu4 b;
    public static final /* synthetic */ nu4[] c;

    static {
        nu4 nu4Var = new nu4("LOGIN", 0);
        f24131a = nu4Var;
        nu4 nu4Var2 = new nu4("REGISTRATION", 1);
        b = nu4Var2;
        c = new nu4[]{nu4Var, nu4Var2};
    }

    public static nu4 valueOf(String str) {
        return (nu4) Enum.valueOf(nu4.class, str);
    }

    public static nu4[] values() {
        return (nu4[]) c.clone();
    }
}
