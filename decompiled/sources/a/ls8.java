package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ls8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ls8 f20564a;
    public static final ls8 b;
    public static final /* synthetic */ ls8[] c;

    static {
        ls8 ls8Var = new ls8("SINGLE_VIEW", 0);
        f20564a = ls8Var;
        ls8 ls8Var2 = new ls8("FULL_SIZE", 1);
        b = ls8Var2;
        c = new ls8[]{ls8Var, ls8Var2};
    }

    public static ls8 valueOf(String str) {
        return (ls8) Enum.valueOf(ls8.class, str);
    }

    public static ls8[] values() {
        return (ls8[]) c.clone();
    }
}
