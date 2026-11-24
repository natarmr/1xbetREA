package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a0t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sxs0 f39a;
    public static final a0t0 b;
    public static final a0t0 c;
    public static final /* synthetic */ a0t0[] d;

    static {
        a0t0 a0t0Var = new a0t0("BET", 0);
        b = a0t0Var;
        a0t0 a0t0Var2 = new a0t0("TRANSFER", 1);
        c = a0t0Var2;
        d = new a0t0[]{a0t0Var, a0t0Var2};
        f39a = new sxs0((byte) 1);
    }

    public static a0t0 valueOf(String str) {
        return (a0t0) Enum.valueOf(a0t0.class, str);
    }

    public static a0t0[] values() {
        return (a0t0[]) d.clone();
    }
}
