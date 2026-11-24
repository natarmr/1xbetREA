package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fb9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fb9 f9246a;
    public static final fb9 b;
    public static final fb9 c;
    public static final /* synthetic */ fb9[] d;

    static {
        fb9 fb9Var = new fb9("Default", 0);
        f9246a = fb9Var;
        fb9 fb9Var2 = new fb9("Higher", 1);
        b = fb9Var2;
        fb9 fb9Var3 = new fb9("Lower", 2);
        c = fb9Var3;
        d = new fb9[]{fb9Var, fb9Var2, fb9Var3};
    }

    public static fb9 valueOf(String str) {
        return (fb9) Enum.valueOf(fb9.class, str);
    }

    public static fb9[] values() {
        return (fb9[]) d.clone();
    }
}
