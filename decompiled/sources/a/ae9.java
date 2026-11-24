package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ae9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ae9 f717a;
    public static final ae9 b;
    public static final ae9 c;
    public static final /* synthetic */ ae9[] d;
    public static final /* synthetic */ c0o e;

    static {
        ae9 ae9Var = new ae9("ALL", 0);
        f717a = ae9Var;
        ae9 ae9Var2 = new ae9("FILTER", 1);
        b = ae9Var2;
        ae9 ae9Var3 = new ae9("SPORT", 2);
        c = ae9Var3;
        ae9[] ae9VarArr = {ae9Var, ae9Var2, ae9Var3};
        d = ae9VarArr;
        e = new c0o(ae9VarArr);
    }

    public static ae9 valueOf(String str) {
        return (ae9) Enum.valueOf(ae9.class, str);
    }

    public static ae9[] values() {
        return (ae9[]) d.clone();
    }
}
