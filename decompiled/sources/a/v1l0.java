package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class v1l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v1l0 f36638a;
    public static final v1l0 b;
    public static final v1l0 c;
    public static final v1l0 d;
    public static final /* synthetic */ v1l0[] e;
    public static final /* synthetic */ c0o f;

    static {
        v1l0 v1l0Var = new v1l0("ICON", 0);
        f36638a = v1l0Var;
        v1l0 v1l0Var2 = new v1l0("BACKGROUND_ICON", 1);
        b = v1l0Var2;
        v1l0 v1l0Var3 = new v1l0("CHAMPIONSHIP_ICON", 2);
        c = v1l0Var3;
        v1l0 v1l0Var4 = new v1l0("ACTION_ICON", 3);
        d = v1l0Var4;
        v1l0[] v1l0VarArr = {v1l0Var, v1l0Var2, v1l0Var3, v1l0Var4};
        e = v1l0VarArr;
        f = new c0o(v1l0VarArr);
    }

    public static v1l0 valueOf(String str) {
        return (v1l0) Enum.valueOf(v1l0.class, str);
    }

    public static v1l0[] values() {
        return (v1l0[]) e.clone();
    }
}
