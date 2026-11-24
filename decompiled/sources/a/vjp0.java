package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class vjp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vjp0 f37541a;
    public static final vjp0 b;
    public static final vjp0 c;
    public static final /* synthetic */ vjp0[] d;

    static {
        vjp0 vjp0Var = new vjp0("NO_TEAM_SERVE", 0);
        f37541a = vjp0Var;
        vjp0 vjp0Var2 = new vjp0("FIRST_TEAM_SERVE", 1);
        b = vjp0Var2;
        vjp0 vjp0Var3 = new vjp0("SECOND_TEAM_SERVE", 2);
        c = vjp0Var3;
        d = new vjp0[]{vjp0Var, vjp0Var2, vjp0Var3};
    }

    public static vjp0 valueOf(String str) {
        return (vjp0) Enum.valueOf(vjp0.class, str);
    }

    public static vjp0[] values() {
        return (vjp0[]) d.clone();
    }
}
