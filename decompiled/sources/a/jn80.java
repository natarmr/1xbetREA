package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class jn80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jn80 f16802a;
    public static final jn80 b;
    public static final jn80 c;
    public static final jn80 d;
    public static final jn80 e;
    public static final jn80 f;
    public static final /* synthetic */ jn80[] g;
    public static final /* synthetic */ c0o h;

    static {
        jn80 jn80Var = new jn80("THEME", 0);
        f16802a = jn80Var;
        jn80 jn80Var2 = new jn80("INDIVIDUAL", 1);
        b = jn80Var2;
        jn80 jn80Var3 = new jn80("CUSTOM", 2);
        c = jn80Var3;
        jn80 jn80Var4 = new jn80("STATIC", 3);
        d = jn80Var4;
        jn80 jn80Var5 = new jn80("WIDGET", 4);
        e = jn80Var5;
        jn80 jn80Var6 = new jn80("AGGREGATOR", 5);
        f = jn80Var6;
        jn80[] jn80VarArr = {jn80Var, jn80Var2, jn80Var3, jn80Var4, jn80Var5, jn80Var6};
        g = jn80VarArr;
        h = new c0o(jn80VarArr);
    }

    public static jn80 valueOf(String str) {
        return (jn80) Enum.valueOf(jn80.class, str);
    }

    public static jn80[] values() {
        return (jn80[]) g.clone();
    }
}
