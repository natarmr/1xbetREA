package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ijv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ey40 f14897a;
    public static final gjv0[] b;

    static {
        ey40 ey40Var = new ey40(8);
        gjv0.f11419a.getClass();
        hjv0 hjv0Var = fjv0.g;
        ey40Var.j(1, hjv0Var);
        hjv0 hjv0Var2 = fjv0.f;
        ey40Var.j(2, hjv0Var2);
        hjv0 hjv0Var3 = fjv0.b;
        ey40Var.j(4, hjv0Var3);
        hjv0 hjv0Var4 = fjv0.d;
        ey40Var.j(8, hjv0Var4);
        hjv0 hjv0Var5 = fjv0.h;
        ey40Var.j(16, hjv0Var5);
        hjv0 hjv0Var6 = fjv0.e;
        ey40Var.j(32, hjv0Var6);
        hjv0 hjv0Var7 = fjv0.i;
        ey40Var.j(64, hjv0Var7);
        hjv0 hjv0Var8 = fjv0.c;
        ey40Var.j(128, hjv0Var8);
        f14897a = ey40Var;
        b = new gjv0[]{hjv0Var, hjv0Var2, hjv0Var3, hjv0Var7, hjv0Var5, hjv0Var6, hjv0Var4, fjv0.j, hjv0Var8};
    }

    public static final void a(a810 a810Var, tdx tdxVar, long j, int i, int i2) {
        if (knm0.k(j, -1L)) {
            return;
        }
        a810Var.a(tdxVar.b, (int) ((j >>> 48) & 65535));
        a810Var.a(tdxVar.c, (int) ((j >>> 32) & 65535));
        a810Var.a(tdxVar.d, i - ((int) ((j >>> 16) & 65535)));
        a810Var.a(tdxVar.e, i2 - ((int) (j & 65535)));
    }
}
