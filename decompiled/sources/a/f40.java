package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class f40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f40 f8887a;
    public static final f40 b;
    public static final f40 c;
    public static final f40 d;
    public static final f40 e;
    public static final f40 f;
    public static final /* synthetic */ f40[] g;

    static {
        f40 f40Var = new f40("INVISIBLE", 0);
        f8887a = f40Var;
        f40 f40Var2 = new f40("INITIAL", 1);
        b = f40Var2;
        f40 f40Var3 = new f40("LOADING", 2);
        c = f40Var3;
        f40 f40Var4 = new f40("LOADED_WITH_INACTIVE_REFRESH", 3);
        d = f40Var4;
        f40 f40Var5 = new f40("DISABLED", 4);
        e = f40Var5;
        f40 f40Var6 = new f40("LOADED_WITH_ACTIVE_REFRESH", 5);
        f = f40Var6;
        g = new f40[]{f40Var, f40Var2, f40Var3, f40Var4, f40Var5, f40Var6};
    }

    public static f40 valueOf(String str) {
        return (f40) Enum.valueOf(f40.class, str);
    }

    public static f40[] values() {
        return (f40[]) g.clone();
    }
}
