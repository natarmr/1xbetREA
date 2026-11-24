package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class par0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final par0 f26668a;
    public static final par0 b;
    public static final par0 c;
    public static final /* synthetic */ par0[] d;

    static {
        par0 par0Var = new par0("NO_ERROR", 0);
        f26668a = par0Var;
        par0 par0Var2 = new par0("CONTENT_ERROR", 1);
        b = par0Var2;
        par0 par0Var3 = new par0("CONTENT_EMPTY_ERROR", 2);
        c = par0Var3;
        d = new par0[]{par0Var, par0Var2, par0Var3};
    }

    public static par0 valueOf(String str) {
        return (par0) Enum.valueOf(par0.class, str);
    }

    public static par0[] values() {
        return (par0[]) d.clone();
    }
}
