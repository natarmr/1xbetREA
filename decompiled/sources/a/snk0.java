package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class snk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final snk0 f32499a;
    public static final snk0 b;
    public static final snk0 c;
    public static final /* synthetic */ snk0[] d;

    static {
        snk0 snk0Var = new snk0("NONE", 0);
        f32499a = snk0Var;
        snk0 snk0Var2 = new snk0("ADDING", 1);
        b = snk0Var2;
        snk0 snk0Var3 = new snk0("REMOVING", 2);
        c = snk0Var3;
        d = new snk0[]{snk0Var, snk0Var2, snk0Var3};
    }

    public static snk0 valueOf(String str) {
        return (snk0) Enum.valueOf(snk0.class, str);
    }

    public static snk0[] values() {
        return (snk0[]) d.clone();
    }
}
