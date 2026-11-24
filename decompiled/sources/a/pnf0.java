package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class pnf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pnf0 f27283a;
    public static final pnf0 b;
    public static final pnf0 c;
    public static final /* synthetic */ pnf0[] d;

    static {
        pnf0 pnf0Var = new pnf0("INIT", 0);
        f27283a = pnf0Var;
        pnf0 pnf0Var2 = new pnf0("REOPEN_FRAGMENT", 1);
        b = pnf0Var2;
        pnf0 pnf0Var3 = new pnf0("INTERNET_OK", 2);
        c = pnf0Var3;
        d = new pnf0[]{pnf0Var, pnf0Var2, pnf0Var3};
    }

    public static pnf0 valueOf(String str) {
        return (pnf0) Enum.valueOf(pnf0.class, str);
    }

    public static pnf0[] values() {
        return (pnf0[]) d.clone();
    }
}
