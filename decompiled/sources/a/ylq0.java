package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ylq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ylq0 f42857a;
    public static final ylq0 b;
    public static final ylq0 c;
    public static final /* synthetic */ ylq0[] d;

    static {
        ylq0 ylq0Var = new ylq0("URAL_PLUS", 0);
        f42857a = ylq0Var;
        ylq0 ylq0Var2 = new ylq0("URAL_MINUS", 1);
        b = ylq0Var2;
        ylq0 ylq0Var3 = new ylq0("OTHER", 2);
        c = ylq0Var3;
        d = new ylq0[]{ylq0Var, ylq0Var2, ylq0Var3};
    }

    public static ylq0 valueOf(String str) {
        return (ylq0) Enum.valueOf(ylq0.class, str);
    }

    public static ylq0[] values() {
        return (ylq0[]) d.clone();
    }
}
