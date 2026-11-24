package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class mt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mt2 f22349a;
    public static final mt2 b;
    public static final /* synthetic */ mt2[] c;

    static {
        mt2 mt2Var = new mt2("EXPANDED", 0);
        f22349a = mt2Var;
        mt2 mt2Var2 = new mt2("COLLAPSED", 1);
        b = mt2Var2;
        c = new mt2[]{mt2Var, mt2Var2};
    }

    public static mt2 valueOf(String str) {
        return (mt2) Enum.valueOf(mt2.class, str);
    }

    public static mt2[] values() {
        return (mt2[]) c.clone();
    }
}
