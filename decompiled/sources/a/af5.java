package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class af5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final af5 f761a;
    public static final af5 b;
    public static final /* synthetic */ af5[] c;

    static {
        af5 af5Var = new af5("EXPONENTIAL", 0);
        f761a = af5Var;
        af5 af5Var2 = new af5("LINEAR", 1);
        b = af5Var2;
        c = new af5[]{af5Var, af5Var2};
    }

    public static af5 valueOf(String str) {
        return (af5) Enum.valueOf(af5.class, str);
    }

    public static af5[] values() {
        return (af5[]) c.clone();
    }
}
