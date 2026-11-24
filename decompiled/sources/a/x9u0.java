package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class x9u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x9u0 f40526a;
    public static final x9u0 b;
    public static final x9u0 c;
    public static final /* synthetic */ x9u0[] d;

    static {
        x9u0 x9u0Var = new x9u0("INITIALIZE", 0);
        f40526a = x9u0Var;
        x9u0 x9u0Var2 = new x9u0("CONTENT", 1);
        b = x9u0Var2;
        x9u0 x9u0Var3 = new x9u0("ERROR", 2);
        c = x9u0Var3;
        d = new x9u0[]{x9u0Var, x9u0Var2, x9u0Var3};
    }

    public static x9u0 valueOf(String str) {
        return (x9u0) Enum.valueOf(x9u0.class, str);
    }

    public static x9u0[] values() {
        return (x9u0[]) d.clone();
    }
}
