package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ma80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ma80 f21447a;
    public static final ma80 b;
    public static final /* synthetic */ ma80[] c;

    static {
        ma80 ma80Var = new ma80("Vertical", 0);
        f21447a = ma80Var;
        ma80 ma80Var2 = new ma80("Horizontal", 1);
        b = ma80Var2;
        c = new ma80[]{ma80Var, ma80Var2};
    }

    public static ma80 valueOf(String str) {
        return (ma80) Enum.valueOf(ma80.class, str);
    }

    public static ma80[] values() {
        return (ma80[]) c.clone();
    }
}
