package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class lgp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lgp0 f20019a;
    public static final lgp0 b;
    public static final /* synthetic */ lgp0[] c;

    static {
        lgp0 lgp0Var = new lgp0("FIRST", 0);
        f20019a = lgp0Var;
        lgp0 lgp0Var2 = new lgp0("SECOND", 1);
        b = lgp0Var2;
        c = new lgp0[]{lgp0Var, lgp0Var2, new lgp0("THIRD", 2), new lgp0("EMPTY", 3)};
    }

    public static lgp0 valueOf(String str) {
        return (lgp0) Enum.valueOf(lgp0.class, str);
    }

    public static lgp0[] values() {
        return (lgp0[]) c.clone();
    }
}
