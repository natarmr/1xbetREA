package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class jwq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jwq0 f17266a;
    public static final jwq0 b;
    public static final jwq0 c;
    public static final /* synthetic */ jwq0[] d;

    static {
        jwq0 jwq0Var = new jwq0("BACKGROUND", 0);
        f17266a = jwq0Var;
        jwq0 jwq0Var2 = new jwq0("NAVIGATION_BAR", 1);
        b = jwq0Var2;
        jwq0 jwq0Var3 = new jwq0("CARD", 2);
        c = jwq0Var3;
        d = new jwq0[]{jwq0Var, jwq0Var2, jwq0Var3};
    }

    public static jwq0 valueOf(String str) {
        return (jwq0) Enum.valueOf(jwq0.class, str);
    }

    public static jwq0[] values() {
        return (jwq0[]) d.clone();
    }
}
