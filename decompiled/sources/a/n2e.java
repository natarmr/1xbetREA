package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class n2e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ey40 f22794a;

    static {
        ubg0 ubg0Var = a5d.e;
        int i = ubg0Var.c;
        k2e k2eVar = new k2e(ubg0Var, ubg0Var, 1);
        int i2 = ubg0Var.c;
        rf60 rf60Var = a5d.x;
        int i3 = (rf60Var.c << 6) | i2;
        m2e m2eVar = new m2e(ubg0Var, rf60Var, 0);
        int i4 = (i2 << 6) | rf60Var.c;
        m2e m2eVar2 = new m2e(rf60Var, ubg0Var, 0);
        ey40 ey40Var = hkx.f13229a;
        ey40 ey40Var2 = new ey40();
        ey40Var2.j(i | (i << 6), k2eVar);
        ey40Var2.j(i3, m2eVar);
        ey40Var2.j(i4, m2eVar2);
        f22794a = ey40Var2;
    }
}
