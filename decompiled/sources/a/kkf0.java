package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kkf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kkf0 f18436a;
    public static final kkf0 b;
    public static final /* synthetic */ kkf0[] c;

    static {
        kkf0 kkf0Var = new kkf0("Restart", 0);
        f18436a = kkf0Var;
        kkf0 kkf0Var2 = new kkf0("Reverse", 1);
        b = kkf0Var2;
        c = new kkf0[]{kkf0Var, kkf0Var2};
    }

    public static kkf0 valueOf(String str) {
        return (kkf0) Enum.valueOf(kkf0.class, str);
    }

    public static kkf0[] values() {
        return (kkf0[]) c.clone();
    }
}
