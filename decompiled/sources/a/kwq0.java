package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class kwq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kwq0 f19015a;
    public static final kwq0 b;
    public static final kwq0 c;
    public static final kwq0 d;
    public static final /* synthetic */ kwq0[] e;

    static {
        kwq0 kwq0Var = new kwq0("BACKGROUND", 0);
        f19015a = kwq0Var;
        kwq0 kwq0Var2 = new kwq0("COLLAPSED_BACKGROUND", 1);
        b = kwq0Var2;
        kwq0 kwq0Var3 = new kwq0("NAVIGATION_BAR", 2);
        c = kwq0Var3;
        kwq0 kwq0Var4 = new kwq0("TOP_INFO", 3);
        d = kwq0Var4;
        e = new kwq0[]{kwq0Var, kwq0Var2, kwq0Var3, kwq0Var4};
    }

    public static kwq0 valueOf(String str) {
        return (kwq0) Enum.valueOf(kwq0.class, str);
    }

    public static kwq0[] values() {
        return (kwq0[]) e.clone();
    }
}
