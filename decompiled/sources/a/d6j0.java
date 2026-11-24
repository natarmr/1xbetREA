package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class d6j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d6j0 f5551a;
    public static final d6j0 b;
    public static final d6j0 c;
    public static final d6j0 d;
    public static final d6j0 e;
    public static final /* synthetic */ d6j0[] f;
    public static final /* synthetic */ c0o g;

    static {
        d6j0 d6j0Var = new d6j0("NONE", 0);
        f5551a = d6j0Var;
        d6j0 d6j0Var2 = new d6j0("CHANGE_LANGUAGE", 1);
        b = d6j0Var2;
        d6j0 d6j0Var3 = new d6j0("ONE_CLICK_BET", 2);
        c = d6j0Var3;
        d6j0 d6j0Var4 = new d6j0("WITH_DRAW", 3);
        d = d6j0Var4;
        d6j0 d6j0Var5 = new d6j0("SECURITY_SETTINGS", 4);
        e = d6j0Var5;
        d6j0[] d6j0VarArr = {d6j0Var, d6j0Var2, d6j0Var3, d6j0Var4, d6j0Var5};
        f = d6j0VarArr;
        g = new c0o(d6j0VarArr);
    }

    public static d6j0 valueOf(String str) {
        return (d6j0) Enum.valueOf(d6j0.class, str);
    }

    public static d6j0[] values() {
        return (d6j0[]) f.clone();
    }
}
