package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class x870 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x870 f40450a;
    public static final x870 b;
    public static final x870 c;
    public static final x870 d;
    public static final /* synthetic */ x870[] e;

    static {
        x870 x870Var = new x870("None", 0);
        f40450a = x870Var;
        x870 x870Var2 = new x870("Demo", 1);
        b = x870Var2;
        x870 x870Var3 = new x870("GPWebAppSetRoute", 2);
        c = x870Var3;
        x870 x870Var4 = new x870("GPWebAppShowAuthenticationRequired", 3);
        d = x870Var4;
        e = new x870[]{x870Var, x870Var2, x870Var3, x870Var4};
    }

    public static x870 valueOf(String str) {
        return (x870) Enum.valueOf(x870.class, str);
    }

    public static x870[] values() {
        return (x870[]) e.clone();
    }
}
