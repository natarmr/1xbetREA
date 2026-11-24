package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class la80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final la80 f19694a;
    public static final la80 b;
    public static final /* synthetic */ la80[] c;

    static {
        la80 la80Var = new la80("Portrait", 0);
        f19694a = la80Var;
        la80 la80Var2 = new la80("Landscape", 1);
        b = la80Var2;
        c = new la80[]{la80Var, la80Var2};
    }

    public static la80 valueOf(String str) {
        return (la80) Enum.valueOf(la80.class, str);
    }

    public static la80[] values() {
        return (la80[]) c.clone();
    }
}
