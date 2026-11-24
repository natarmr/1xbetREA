package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ijf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ijf0 f14871a;
    public static final ijf0 b;
    public static final ijf0 c;
    public static final /* synthetic */ ijf0[] d;

    static {
        ijf0 ijf0Var = new ijf0("AUTOMATIC", 0);
        f14871a = ijf0Var;
        ijf0 ijf0Var2 = new ijf0("HARDWARE", 1);
        b = ijf0Var2;
        ijf0 ijf0Var3 = new ijf0("SOFTWARE", 2);
        c = ijf0Var3;
        d = new ijf0[]{ijf0Var, ijf0Var2, ijf0Var3};
    }

    public static ijf0 valueOf(String str) {
        return (ijf0) Enum.valueOf(ijf0.class, str);
    }

    public static ijf0[] values() {
        return (ijf0[]) d.clone();
    }
}
