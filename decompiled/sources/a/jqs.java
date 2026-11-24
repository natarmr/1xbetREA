package a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class jqs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfg0 f16969a;
    public static final zfg0 b;

    static {
        cgg0 cgg0Var = cgg0.f4312a;
        agg0 agg0Var = agg0.c;
        bgg0 bgg0Var = new bgg0(new egg0(cgg0Var, agg0Var));
        bgg0 bgg0Var2 = new bgg0(dgg0.f6042a);
        cgg0 cgg0Var2 = cgg0.d;
        f16969a = new zfg0(bgg0Var, bgg0Var2, new bgg0(new egg0(cgg0Var2, agg0Var)));
        b = new zfg0(new bgg0(new egg0(cgg0Var2, agg0Var)), new bgg0(new egg0(cgg0.f, agg0Var)), new bgg0(new egg0(cgg0Var, agg0Var)));
    }

    public static final zfg0 a(int i, int i2, int i3) {
        cgg0 cgg0Var;
        agg0 agg0Var;
        cgg0 cgg0Var2 = null;
        if (i2 == 0 || i2 == 1) {
            cgg0Var = cgg0.b;
        } else if (i2 != 2) {
            cgg0Var = i2 != 3 ? null : cgg0.e;
        } else {
            cgg0Var = cgg0.c;
        }
        if (i3 == 0 || i3 == 1) {
            cgg0Var2 = cgg0.b;
        } else if (i3 == 2) {
            cgg0Var2 = cgg0.c;
        } else if (i3 == 3) {
            cgg0Var2 = cgg0.e;
        }
        ggg0 egg0Var = dgg0.f6042a;
        bgg0 bgg0Var = new bgg0(cgg0Var != null ? new egg0(cgg0Var, agg0.f824a) : egg0Var);
        String strValueOf = String.valueOf(i);
        if (cgg0Var != null) {
            agg0Var = agg0.f824a;
        } else {
            agg0Var = cgg0Var2 != null ? agg0.b : agg0.c;
        }
        bgg0 bgg0Var2 = new bgg0(new fgg0(strValueOf, agg0Var));
        if (cgg0Var2 != null) {
            egg0Var = new egg0(cgg0Var2, agg0.b);
        }
        return new zfg0(bgg0Var, bgg0Var2, new bgg0(egg0Var));
    }
}
