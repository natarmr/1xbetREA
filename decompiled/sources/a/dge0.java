package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class dge0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dge0 f6038a;
    public static final dge0 b;
    public static final dge0 c;
    public static final dge0 d;
    public static final dge0 e;
    public static final dge0 f;
    public static final /* synthetic */ dge0[] g;

    static {
        dge0 dge0Var = new dge0("ShutDown", 0);
        f6038a = dge0Var;
        dge0 dge0Var2 = new dge0("ShuttingDown", 1);
        b = dge0Var2;
        dge0 dge0Var3 = new dge0("Inactive", 2);
        c = dge0Var3;
        dge0 dge0Var4 = new dge0("InactivePendingWork", 3);
        d = dge0Var4;
        dge0 dge0Var5 = new dge0("Idle", 4);
        e = dge0Var5;
        dge0 dge0Var6 = new dge0("PendingWork", 5);
        f = dge0Var6;
        g = new dge0[]{dge0Var, dge0Var2, dge0Var3, dge0Var4, dge0Var5, dge0Var6};
    }

    public static dge0 valueOf(String str) {
        return (dge0) Enum.valueOf(dge0.class, str);
    }

    public static dge0[] values() {
        return (dge0[]) g.clone();
    }
}
