package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class yyc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yyc0 f43460a;
    public static final yyc0 b;
    public static final /* synthetic */ yyc0[] c;

    static {
        yyc0 yyc0Var = new yyc0("Primary", 0);
        f43460a = yyc0Var;
        yyc0 yyc0Var2 = new yyc0("Disabled", 1);
        b = yyc0Var2;
        c = new yyc0[]{yyc0Var, yyc0Var2};
    }

    public static yyc0 valueOf(String str) {
        return (yyc0) Enum.valueOf(yyc0.class, str);
    }

    public static yyc0[] values() {
        return (yyc0[]) c.clone();
    }
}
