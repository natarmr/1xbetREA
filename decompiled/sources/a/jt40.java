package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class jt40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jt40 f17082a;
    public static final jt40 b;
    public static final jt40 c;
    public static final /* synthetic */ jt40[] d;

    static {
        jt40 jt40Var = new jt40("NAVIGATION_BAR", 0);
        f17082a = jt40Var;
        jt40 jt40Var2 = new jt40("BACKGROUND", 1);
        b = jt40Var2;
        jt40 jt40Var3 = new jt40("TOP_INFO", 2);
        c = jt40Var3;
        d = new jt40[]{jt40Var, jt40Var2, jt40Var3};
    }

    public static jt40 valueOf(String str) {
        return (jt40) Enum.valueOf(jt40.class, str);
    }

    public static jt40[] values() {
        return (jt40[]) d.clone();
    }
}
