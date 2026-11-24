package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class uln0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uln0 f35881a;
    public static final uln0 b;
    public static final /* synthetic */ uln0[] c;

    static {
        uln0 uln0Var = new uln0("FEATURE_COMBINATION_TABLE", 0);
        f35881a = uln0Var;
        uln0 uln0Var2 = new uln0("CAPTURE_SESSION_TABLES", 1);
        b = uln0Var2;
        c = new uln0[]{uln0Var, uln0Var2};
    }

    public static uln0 valueOf(String str) {
        return (uln0) Enum.valueOf(uln0.class, str);
    }

    public static uln0[] values() {
        return (uln0[]) c.clone();
    }
}
