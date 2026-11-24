package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class jgp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jgp0 f16491a;
    public static final jgp0 b;
    public static final jgp0 c;
    public static final /* synthetic */ jgp0[] d;

    static {
        jgp0 jgp0Var = new jgp0("None", 0);
        f16491a = jgp0Var;
        jgp0 jgp0Var2 = new jgp0("First", 1);
        b = jgp0Var2;
        jgp0 jgp0Var3 = new jgp0("Second", 2);
        c = jgp0Var3;
        d = new jgp0[]{jgp0Var, jgp0Var2, jgp0Var3};
    }

    public static jgp0 valueOf(String str) {
        return (jgp0) Enum.valueOf(jgp0.class, str);
    }

    public static jgp0[] values() {
        return (jgp0[]) d.clone();
    }
}
