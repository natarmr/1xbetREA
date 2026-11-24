package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class av0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final av0 f1504a;
    public static final av0 b;
    public static final /* synthetic */ av0[] c;
    public static final /* synthetic */ c0o d;

    static {
        av0 av0Var = new av0("REAL", 0);
        f1504a = av0Var;
        av0 av0Var2 = new av0("DEMO", 1);
        b = av0Var2;
        av0[] av0VarArr = {av0Var, av0Var2};
        c = av0VarArr;
        d = new c0o(av0VarArr);
    }

    public static av0 valueOf(String str) {
        return (av0) Enum.valueOf(av0.class, str);
    }

    public static av0[] values() {
        return (av0[]) c.clone();
    }
}
