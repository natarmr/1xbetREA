package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class bys0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bys0 f3435a;
    public static final bys0 b;
    public static final /* synthetic */ bys0[] c;

    static {
        bys0 bys0Var = new bys0("TWO_HORIZONTAL_BUTTONS", 0);
        f3435a = bys0Var;
        bys0 bys0Var2 = new bys0("VERTICAL_BUTTONS", 1);
        b = bys0Var2;
        c = new bys0[]{bys0Var, bys0Var2};
    }

    public static bys0 valueOf(String str) {
        return (bys0) Enum.valueOf(bys0.class, str);
    }

    public static bys0[] values() {
        return (bys0[]) c.clone();
    }
}
