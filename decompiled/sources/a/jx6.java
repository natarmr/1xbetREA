package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class jx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jx6 f17288a;
    public static final jx6 b;
    public static final jx6 c;
    public static final /* synthetic */ jx6[] d;

    static {
        jx6 jx6Var = new jx6("Primary", 0);
        f17288a = jx6Var;
        jx6 jx6Var2 = new jx6("Error", 1);
        b = jx6Var2;
        jx6 jx6Var3 = new jx6("Disabled", 2);
        c = jx6Var3;
        d = new jx6[]{jx6Var, jx6Var2, jx6Var3};
    }

    public static jx6 valueOf(String str) {
        return (jx6) Enum.valueOf(jx6.class, str);
    }

    public static jx6[] values() {
        return (jx6[]) d.clone();
    }
}
