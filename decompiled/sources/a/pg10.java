package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class pg10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pg10 f26933a;
    public static final pg10 b;
    public static final pg10 c;
    public static final /* synthetic */ pg10[] d;

    static {
        pg10 pg10Var = new pg10("FIRST", 0);
        f26933a = pg10Var;
        pg10 pg10Var2 = new pg10("SECOND", 1);
        b = pg10Var2;
        pg10 pg10Var3 = new pg10("THIRD", 2);
        c = pg10Var3;
        d = new pg10[]{pg10Var, pg10Var2, pg10Var3};
    }

    public static pg10 valueOf(String str) {
        return (pg10) Enum.valueOf(pg10.class, str);
    }

    public static pg10[] values() {
        return (pg10[]) d.clone();
    }
}
