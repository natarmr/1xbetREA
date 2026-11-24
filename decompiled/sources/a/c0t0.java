package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class c0t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0t0 f3540a;
    public static final c0t0 b;
    public static final /* synthetic */ c0t0[] c;

    static {
        c0t0 c0t0Var = new c0t0("SUPERTYPE", 0);
        f3540a = c0t0Var;
        c0t0 c0t0Var2 = new c0t0("COMMON", 1);
        b = c0t0Var2;
        c = new c0t0[]{c0t0Var, c0t0Var2};
    }

    public static c0t0 valueOf(String str) {
        return (c0t0) Enum.valueOf(c0t0.class, str);
    }

    public static c0t0[] values() {
        return (c0t0[]) c.clone();
    }
}
