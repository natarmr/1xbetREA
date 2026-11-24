package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class zq8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hz40 f44795a = b(true);
    public static final hz40 b = b(false);
    public static final r71 c = r71.k;

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(-211209833);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            int iHashCode = Long.hashCode(fetVar.T);
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            bh90 bh90VarM = fetVar.m();
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, c, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y30(mm40Var, i, (byte) 12);
        }
    }

    public static final hz40 b(boolean z) {
        hz40 hz40Var = new hz40(9);
        zx7 zx7Var = gqw0.f11754a;
        hz40Var.n(zx7Var, new ar8(zx7Var, z));
        zx7 zx7Var2 = gqw0.b;
        hz40Var.n(zx7Var2, new ar8(zx7Var2, z));
        zx7 zx7Var3 = gqw0.c;
        hz40Var.n(zx7Var3, new ar8(zx7Var3, z));
        zx7 zx7Var4 = gqw0.d;
        hz40Var.n(zx7Var4, new ar8(zx7Var4, z));
        zx7 zx7Var5 = gqw0.e;
        hz40Var.n(zx7Var5, new ar8(zx7Var5, z));
        zx7 zx7Var6 = gqw0.f;
        hz40Var.n(zx7Var6, new ar8(zx7Var6, z));
        zx7 zx7Var7 = gqw0.g;
        hz40Var.n(zx7Var7, new ar8(zx7Var7, z));
        zx7 zx7Var8 = gqw0.h;
        hz40Var.n(zx7Var8, new ar8(zx7Var8, z));
        zx7 zx7Var9 = gqw0.i;
        hz40Var.n(zx7Var9, new ar8(zx7Var9, z));
        return hz40Var;
    }

    public static final tj30 c(u12 u12Var, boolean z) {
        tj30 tj30Var = (tj30) (z ? f44795a : b).g(u12Var);
        return tj30Var == null ? new ar8(u12Var, z) : tj30Var;
    }

    public static final void d(ou90 ou90Var, pu90 pu90Var, pj30 pj30Var, k6z k6zVar, int i, int i2, u12 u12Var) {
        u12 u12Var2;
        Object objN = pj30Var.n();
        yq8 yq8Var = objN instanceof yq8 ? (yq8) objN : null;
        ou90.j(ou90Var, pu90Var, ((yq8Var == null || (u12Var2 = yq8Var.o) == null) ? u12Var : u12Var2).a((((long) pu90Var.f27604a) << 32) | (((long) pu90Var.b) & 4294967295L), (((long) i) << 32) | (((long) i2) & 4294967295L), k6zVar));
    }
}
