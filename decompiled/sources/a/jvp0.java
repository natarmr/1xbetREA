package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class jvp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jvp0 f17215a;
    public static final jvp0 b;
    public static final /* synthetic */ jvp0[] c;

    static {
        jvp0 jvp0Var = new jvp0("MENU_OTHER", 0);
        f17215a = jvp0Var;
        jvp0 jvp0Var2 = new jvp0("MAILING", 1);
        b = jvp0Var2;
        c = new jvp0[]{jvp0Var, jvp0Var2};
    }

    public static jvp0 valueOf(String str) {
        return (jvp0) Enum.valueOf(jvp0.class, str);
    }

    public static jvp0[] values() {
        return (jvp0[]) c.clone();
    }
}
