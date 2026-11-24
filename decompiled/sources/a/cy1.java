package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class cy1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cy1 f5151a;
    public static final cy1 b;
    public static final cy1 c;
    public static final /* synthetic */ cy1[] d;

    static {
        cy1 cy1Var = new cy1("PREPARE", 0);
        f5151a = cy1Var;
        cy1 cy1Var2 = new cy1("ACCEPTED", 1);
        b = cy1Var2;
        cy1 cy1Var3 = new cy1("BLOCKED", 2);
        c = cy1Var3;
        d = new cy1[]{cy1Var, cy1Var2, cy1Var3};
    }

    public static cy1 valueOf(String str) {
        return (cy1) Enum.valueOf(cy1.class, str);
    }

    public static cy1[] values() {
        return (cy1[]) d.clone();
    }
}
