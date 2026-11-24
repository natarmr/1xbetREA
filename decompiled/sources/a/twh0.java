package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class twh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final twh0 f34649a;
    public static final twh0 b;
    public static final /* synthetic */ twh0[] c;

    static {
        twh0 twh0Var = new twh0("Live", 0);
        f34649a = twh0Var;
        twh0 twh0Var2 = new twh0("Line", 1);
        b = twh0Var2;
        c = new twh0[]{twh0Var, twh0Var2};
    }

    public static twh0 valueOf(String str) {
        return (twh0) Enum.valueOf(twh0.class, str);
    }

    public static twh0[] values() {
        return (twh0[]) c.clone();
    }
}
