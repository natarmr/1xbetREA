package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class f3g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f3g0 f8862a;
    public static final f3g0 b;
    public static final /* synthetic */ f3g0[] c;

    static {
        f3g0 f3g0Var = new f3g0("ACTIVE_DEFAULT", 0);
        f8862a = f3g0Var;
        f3g0 f3g0Var2 = new f3g0("ACTIVE_GREEN", 1);
        b = f3g0Var2;
        c = new f3g0[]{f3g0Var, f3g0Var2};
    }

    public static f3g0 valueOf(String str) {
        return (f3g0) Enum.valueOf(f3g0.class, str);
    }

    public static f3g0[] values() {
        return (f3g0[]) c.clone();
    }
}
