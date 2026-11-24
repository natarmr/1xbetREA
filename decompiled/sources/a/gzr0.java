package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class gzr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gzr0 f12195a;
    public static final gzr0 b;
    public static final /* synthetic */ gzr0[] c;

    static {
        gzr0 gzr0Var = new gzr0("USER", 0);
        f12195a = gzr0Var;
        gzr0 gzr0Var2 = new gzr0("TOP", 1);
        b = gzr0Var2;
        c = new gzr0[]{gzr0Var, gzr0Var2};
    }

    public static gzr0 valueOf(String str) {
        return (gzr0) Enum.valueOf(gzr0.class, str);
    }

    public static gzr0[] values() {
        return (gzr0[]) c.clone();
    }
}
