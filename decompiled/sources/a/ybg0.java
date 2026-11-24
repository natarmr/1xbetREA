package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ybg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ybg0 f42342a;
    public static final ybg0 b;
    public static final /* synthetic */ ybg0[] c;

    static {
        ybg0 ybg0Var = new ybg0("DEFAULT", 0);
        f42342a = ybg0Var;
        ybg0 ybg0Var2 = new ybg0("DISABLED", 1);
        b = ybg0Var2;
        c = new ybg0[]{ybg0Var, ybg0Var2};
    }

    public static ybg0 valueOf(String str) {
        return (ybg0) Enum.valueOf(ybg0.class, str);
    }

    public static ybg0[] values() {
        return (ybg0[]) c.clone();
    }
}
