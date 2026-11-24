package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class sj90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rl70 f32294a;
    public static final sj90 b;
    public static final sj90 c;
    public static final sj90 d;
    public static final sj90 e;
    public static final sj90 f;
    public static final sj90 g;
    public static final /* synthetic */ sj90[] h;

    static {
        sj90 sj90Var = new sj90("NONE", 0);
        b = sj90Var;
        sj90 sj90Var2 = new sj90("EDIT_PROFILE_DATA", 1);
        c = sj90Var2;
        sj90 sj90Var3 = new sj90("CREATE_LOGIN", 2);
        d = sj90Var3;
        sj90 sj90Var4 = new sj90("BIND_EMAIL", 3);
        e = sj90Var4;
        sj90 sj90Var5 = new sj90("BIND_PHONE", 4);
        f = sj90Var5;
        sj90 sj90Var6 = new sj90("CHANGE_PASSWORD", 5);
        g = sj90Var6;
        h = new sj90[]{sj90Var, sj90Var2, sj90Var3, sj90Var4, sj90Var5, sj90Var6};
        f32294a = new rl70();
    }

    public static sj90 valueOf(String str) {
        return (sj90) Enum.valueOf(sj90.class, str);
    }

    public static sj90[] values() {
        return (sj90[]) h.clone();
    }
}
