package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class q3u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q3u0 f28068a;
    public static final q3u0 b;
    public static final q3u0 c;
    public static final q3u0 d;
    public static final /* synthetic */ q3u0[] e;

    static {
        q3u0 q3u0Var = new q3u0("Float", 0);
        f28068a = q3u0Var;
        q3u0 q3u0Var2 = new q3u0("Int", 1);
        b = q3u0Var2;
        q3u0 q3u0Var3 = new q3u0("Color", 2);
        c = q3u0Var3;
        q3u0 q3u0Var4 = new q3u0("Path", 3);
        d = q3u0Var4;
        e = new q3u0[]{q3u0Var, q3u0Var2, q3u0Var3, q3u0Var4};
    }

    public static q3u0 valueOf(String str) {
        return (q3u0) Enum.valueOf(q3u0.class, str);
    }

    public static q3u0[] values() {
        return (q3u0[]) e.clone();
    }
}
