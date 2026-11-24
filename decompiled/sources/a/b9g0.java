package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class b9g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lme0 f2207a;
    public static final b9g0 b;
    public static final b9g0 c;
    public static final b9g0 d;
    public static final /* synthetic */ b9g0[] e;
    public static final /* synthetic */ c0o f;

    static {
        b9g0 b9g0Var = new b9g0("HISTORY", 0);
        b = b9g0Var;
        b9g0 b9g0Var2 = new b9g0("LIVE", 1);
        c = b9g0Var2;
        b9g0 b9g0Var3 = new b9g0("SEARCH", 2);
        d = b9g0Var3;
        b9g0[] b9g0VarArr = {b9g0Var, b9g0Var2, b9g0Var3};
        e = b9g0VarArr;
        f = new c0o(b9g0VarArr);
        f2207a = new lme0((byte) 9);
    }

    public static b9g0 valueOf(String str) {
        return (b9g0) Enum.valueOf(b9g0.class, str);
    }

    public static b9g0[] values() {
        return (b9g0[]) e.clone();
    }
}
