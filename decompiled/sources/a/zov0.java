package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zov0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zov0 f44733a;
    public static final zov0 b;
    public static final zov0 c;
    public static final zov0 d;
    public static final zov0 e;
    public static final zov0 f;
    public static final /* synthetic */ zov0[] g;

    static {
        zov0 zov0Var = new zov0("ENQUEUED", 0);
        f44733a = zov0Var;
        zov0 zov0Var2 = new zov0("RUNNING", 1);
        b = zov0Var2;
        zov0 zov0Var3 = new zov0("SUCCEEDED", 2);
        c = zov0Var3;
        zov0 zov0Var4 = new zov0("FAILED", 3);
        d = zov0Var4;
        zov0 zov0Var5 = new zov0("BLOCKED", 4);
        e = zov0Var5;
        zov0 zov0Var6 = new zov0("CANCELLED", 5);
        f = zov0Var6;
        g = new zov0[]{zov0Var, zov0Var2, zov0Var3, zov0Var4, zov0Var5, zov0Var6};
    }

    public static zov0 valueOf(String str) {
        return (zov0) Enum.valueOf(zov0.class, str);
    }

    public static zov0[] values() {
        return (zov0[]) g.clone();
    }

    public final boolean a() {
        return this == c || this == d || this == f;
    }
}
