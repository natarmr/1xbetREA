package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zs40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zs40 f44890a;
    public static final zs40 b;
    public static final zs40 c;
    public static final zs40 d;
    public static final /* synthetic */ zs40[] e;

    static {
        zs40 zs40Var = new zs40("UNDEFINED", 0);
        f44890a = zs40Var;
        zs40 zs40Var2 = new zs40("SETUP", 1);
        b = zs40Var2;
        zs40 zs40Var3 = new zs40("MOVING", 2);
        c = zs40Var3;
        zs40 zs40Var4 = new zs40("FINISHED", 3);
        d = zs40Var4;
        e = new zs40[]{zs40Var, zs40Var2, zs40Var3, zs40Var4};
    }

    public static zs40 valueOf(String str) {
        return (zs40) Enum.valueOf(zs40.class, str);
    }

    public static zs40[] values() {
        return (zs40[]) e.clone();
    }
}
