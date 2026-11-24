package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ayr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ayr0 f1684a;
    public static final ayr0 b;
    public static final ayr0 c;
    public static final /* synthetic */ ayr0[] d;

    static {
        ayr0 ayr0Var = new ayr0("FIRST_TEAM_WIN", 0);
        f1684a = ayr0Var;
        ayr0 ayr0Var2 = new ayr0("SECOND_TEAM_WIN", 1);
        b = ayr0Var2;
        ayr0 ayr0Var3 = new ayr0("DEFAULT", 2);
        c = ayr0Var3;
        d = new ayr0[]{ayr0Var, ayr0Var2, ayr0Var3};
    }

    public static ayr0 valueOf(String str) {
        return (ayr0) Enum.valueOf(ayr0.class, str);
    }

    public static ayr0[] values() {
        return (ayr0[]) d.clone();
    }
}
