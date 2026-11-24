package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class q5g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q5g0 f28150a;
    public static final q5g0 b;
    public static final q5g0 c;
    public static final q5g0 d;
    public static final /* synthetic */ q5g0[] e;

    static {
        q5g0 q5g0Var = new q5g0("NO_ERROR", 0);
        f28150a = q5g0Var;
        q5g0 q5g0Var2 = new q5g0("CONTENT_ERROR", 1);
        b = q5g0Var2;
        q5g0 q5g0Var3 = new q5g0("CONTENT_EMPTY_ERROR", 2);
        c = q5g0Var3;
        q5g0 q5g0Var4 = new q5g0("FILTERED_GAMES_EMPTY_ERROR", 3);
        d = q5g0Var4;
        e = new q5g0[]{q5g0Var, q5g0Var2, q5g0Var3, q5g0Var4};
    }

    public static q5g0 valueOf(String str) {
        return (q5g0) Enum.valueOf(q5g0.class, str);
    }

    public static q5g0[] values() {
        return (q5g0[]) e.clone();
    }
}
