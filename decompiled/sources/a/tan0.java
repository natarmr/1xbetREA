package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class tan0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tan0 f33621a;
    public static final tan0 b;
    public static final tan0 c;
    public static final /* synthetic */ tan0[] d;

    static {
        tan0 tan0Var = new tan0("NONE", 0);
        f33621a = tan0Var;
        tan0 tan0Var2 = new tan0("SUBSCRIPTIONS_GAMES", 1);
        b = tan0Var2;
        tan0 tan0Var3 = new tan0("TOP_LINE_GAMES", 2);
        c = tan0Var3;
        d = new tan0[]{tan0Var, tan0Var2, tan0Var3};
    }

    public static tan0 valueOf(String str) {
        return (tan0) Enum.valueOf(tan0.class, str);
    }

    public static tan0[] values() {
        return (tan0[]) d.clone();
    }
}
