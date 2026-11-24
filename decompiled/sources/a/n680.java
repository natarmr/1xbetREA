package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class n680 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n680 f22985a;
    public static final n680 b;
    public static final /* synthetic */ n680[] c;

    static {
        n680 n680Var = new n680("AUTH_HISTORY", 0);
        f22985a = n680Var;
        n680 n680Var2 = new n680("DISABLE_AUTHENTICATOR", 1);
        b = n680Var2;
        c = new n680[]{n680Var, n680Var2};
    }

    public static n680 valueOf(String str) {
        return (n680) Enum.valueOf(n680.class, str);
    }

    public static n680[] values() {
        return (n680[]) c.clone();
    }
}
