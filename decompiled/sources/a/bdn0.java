package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class bdn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bdn0 f2407a;
    public static final bdn0 b;
    public static final bdn0 c;
    public static final /* synthetic */ bdn0[] d;

    static {
        bdn0 bdn0Var = new bdn0("NONE", 0);
        f2407a = bdn0Var;
        bdn0 bdn0Var2 = new bdn0("SUBSCRIPTIONS_GAMES", 1);
        b = bdn0Var2;
        bdn0 bdn0Var3 = new bdn0("TOP_LINE_GAMES", 2);
        c = bdn0Var3;
        d = new bdn0[]{bdn0Var, bdn0Var2, bdn0Var3};
    }

    public static bdn0 valueOf(String str) {
        return (bdn0) Enum.valueOf(bdn0.class, str);
    }

    public static bdn0[] values() {
        return (bdn0[]) d.clone();
    }
}
