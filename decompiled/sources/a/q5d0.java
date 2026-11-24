package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class q5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q5d0 f28147a;
    public static final q5d0 b;
    public static final /* synthetic */ q5d0[] c;

    static {
        q5d0 q5d0Var = new q5d0("SIMPLE", 0);
        f28147a = q5d0Var;
        q5d0 q5d0Var2 = new q5d0("WITH_BUTTON", 1);
        b = q5d0Var2;
        c = new q5d0[]{q5d0Var, q5d0Var2};
    }

    public static q5d0 valueOf(String str) {
        return (q5d0) Enum.valueOf(q5d0.class, str);
    }

    public static q5d0[] values() {
        return (q5d0[]) c.clone();
    }
}
