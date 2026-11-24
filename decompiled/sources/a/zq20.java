package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zq20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final uuz f44789a;
    public static final zq20 b;
    public static final zq20 c;
    public static final zq20 d;
    public static final zq20 e;
    public static final /* synthetic */ zq20[] f;

    static {
        zq20 zq20Var = new zq20("START", 0);
        b = zq20Var;
        zq20 zq20Var2 = new zq20("CENTER", 1);
        c = zq20Var2;
        zq20 zq20Var3 = new zq20("END", 2);
        d = zq20Var3;
        zq20 zq20Var4 = new zq20("HORIZONTAL", 3);
        e = zq20Var4;
        f = new zq20[]{zq20Var, zq20Var2, zq20Var3, zq20Var4, new zq20("NONE", 4)};
        f44789a = new uuz();
    }

    public static zq20 valueOf(String str) {
        return (zq20) Enum.valueOf(zq20.class, str);
    }

    public static zq20[] values() {
        return (zq20[]) f.clone();
    }
}
