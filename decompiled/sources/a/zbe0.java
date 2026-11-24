package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class zbe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zbe0 f44112a;
    public static final zbe0 b;
    public static final zbe0 c;
    public static final zbe0 d;
    public static final zbe0 e;
    public static final /* synthetic */ zbe0[] f;

    static {
        zbe0 zbe0Var = new zbe0("CONTINUE", 0);
        f44112a = zbe0Var;
        zbe0 zbe0Var2 = new zbe0("LOGOUT", 1);
        b = zbe0Var2;
        zbe0 zbe0Var3 = new zbe0("EXIT", 2);
        c = zbe0Var3;
        zbe0 zbe0Var4 = new zbe0("CONTINUE_CHECKBOX", 3);
        d = zbe0Var4;
        zbe0 zbe0Var5 = new zbe0("LOGOUT_CHECKBOX", 4);
        e = zbe0Var5;
        f = new zbe0[]{zbe0Var, zbe0Var2, zbe0Var3, zbe0Var4, zbe0Var5};
    }

    public static zbe0 valueOf(String str) {
        return (zbe0) Enum.valueOf(zbe0.class, str);
    }

    public static zbe0[] values() {
        return (zbe0[]) f.clone();
    }
}
