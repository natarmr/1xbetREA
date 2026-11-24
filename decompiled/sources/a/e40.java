package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e40 f7159a;
    public static final e40 b;
    public static final e40 c;
    public static final e40 d;
    public static final e40 e;
    public static final e40 f;
    public static final /* synthetic */ e40[] g;

    static {
        e40 e40Var = new e40("INVISIBLE", 0);
        f7159a = e40Var;
        e40 e40Var2 = new e40("INITIAL", 1);
        b = e40Var2;
        e40 e40Var3 = new e40("LOADING", 2);
        c = e40Var3;
        e40 e40Var4 = new e40("LOADED_WITH_INACTIVE_REFRESH", 3);
        d = e40Var4;
        e40 e40Var5 = new e40("DISABLED", 4);
        e = e40Var5;
        e40 e40Var6 = new e40("LOADED_WITH_ACTIVE_REFRESH", 5);
        f = e40Var6;
        g = new e40[]{e40Var, e40Var2, e40Var3, e40Var4, e40Var5, e40Var6};
    }

    public static e40 valueOf(String str) {
        return (e40) Enum.valueOf(e40.class, str);
    }

    public static e40[] values() {
        return (e40[]) g.clone();
    }
}
