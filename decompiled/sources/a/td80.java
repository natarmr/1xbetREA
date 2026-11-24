package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class td80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final td80 f33755a;
    public static final td80 b;
    public static final td80 c;
    public static final /* synthetic */ td80[] d;

    static {
        td80 td80Var = new td80("WIN_1", 0);
        f33755a = td80Var;
        td80 td80Var2 = new td80("DRAW", 1);
        b = td80Var2;
        td80 td80Var3 = new td80("WIN_2", 2);
        c = td80Var3;
        d = new td80[]{td80Var, td80Var2, td80Var3};
    }

    public static td80 valueOf(String str) {
        return (td80) Enum.valueOf(td80.class, str);
    }

    public static td80[] values() {
        return (td80[]) d.clone();
    }
}
