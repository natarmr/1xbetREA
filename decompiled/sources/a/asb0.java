package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class asb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final asb0 f1383a;
    public static final asb0 b;
    public static final /* synthetic */ asb0[] c;

    static {
        asb0 asb0Var = new asb0("EXACT", 0);
        f1383a = asb0Var;
        asb0 asb0Var2 = new asb0("INEXACT", 1);
        b = asb0Var2;
        c = new asb0[]{asb0Var, asb0Var2};
    }

    public static asb0 valueOf(String str) {
        return (asb0) Enum.valueOf(asb0.class, str);
    }

    public static asb0[] values() {
        return (asb0[]) c.clone();
    }
}
