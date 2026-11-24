package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class pmt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pmt0 f27254a;
    public static final pmt0 b;
    public static final pmt0 c;
    public static final /* synthetic */ pmt0[] d;

    static {
        pmt0 pmt0Var = new pmt0("NO_UPDATE", 0);
        f27254a = pmt0Var;
        pmt0 pmt0Var2 = new pmt0("SIMPLE_UPDATE", 1);
        b = pmt0Var2;
        pmt0 pmt0Var3 = new pmt0("HARD_UPDATE", 2);
        c = pmt0Var3;
        d = new pmt0[]{pmt0Var, pmt0Var2, pmt0Var3};
    }

    public static pmt0 valueOf(String str) {
        return (pmt0) Enum.valueOf(pmt0.class, str);
    }

    public static pmt0[] values() {
        return (pmt0[]) d.clone();
    }
}
