package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class pn50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pn50 f27269a;
    public static final pn50 b;
    public static final /* synthetic */ pn50[] c;

    /* JADX INFO: Fake field, exist only in values array */
    pn50 EF0;

    static {
        pn50 pn50Var = new pn50("EMPTY", 0);
        pn50 pn50Var2 = new pn50("TOP", 1);
        f27269a = pn50Var2;
        pn50 pn50Var3 = new pn50("OTHERS", 2);
        b = pn50Var3;
        c = new pn50[]{pn50Var, pn50Var2, pn50Var3};
    }

    public static pn50 valueOf(String str) {
        return (pn50) Enum.valueOf(pn50.class, str);
    }

    public static pn50[] values() {
        return (pn50[]) c.clone();
    }
}
