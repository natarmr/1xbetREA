package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jki0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jki0 f16670a;
    public static final jki0 b;
    public static final /* synthetic */ jki0[] c;

    static {
        jki0 jki0Var = new jki0("CRASHLYTICS", 0);
        f16670a = jki0Var;
        jki0 jki0Var2 = new jki0("PERFORMANCE", 1);
        b = jki0Var2;
        c = new jki0[]{jki0Var, jki0Var2, new jki0("MATT_SAYS_HI", 2)};
    }

    public static jki0 valueOf(String str) {
        return (jki0) Enum.valueOf(jki0.class, str);
    }

    public static jki0[] values() {
        return (jki0[]) c.clone();
    }
}
