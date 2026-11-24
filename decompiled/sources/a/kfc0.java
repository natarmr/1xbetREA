package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class kfc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mi70 f18189a;
    public static final kfc0 b;
    public static final kfc0 c;
    public static final kfc0 d;
    public static final kfc0 e;
    public static final kfc0 f;
    public static final /* synthetic */ kfc0[] g;

    static {
        kfc0 kfc0Var = new kfc0("NONE", 0);
        b = kfc0Var;
        kfc0 kfc0Var2 = new kfc0("ACTIVE", 1);
        c = kfc0Var2;
        kfc0 kfc0Var3 = new kfc0("USED", 2);
        d = kfc0Var3;
        kfc0 kfc0Var4 = new kfc0("WASTED", 3);
        e = kfc0Var4;
        kfc0 kfc0Var5 = new kfc0("INACTIVE", 4);
        f = kfc0Var5;
        g = new kfc0[]{kfc0Var, kfc0Var2, kfc0Var3, kfc0Var4, kfc0Var5};
        f18189a = new mi70();
    }

    public static kfc0 valueOf(String str) {
        return (kfc0) Enum.valueOf(kfc0.class, str);
    }

    public static kfc0[] values() {
        return (kfc0[]) g.clone();
    }
}
