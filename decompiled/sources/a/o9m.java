package a;

import java.util.Iterator;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o9m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f24886a;

    static {
        zcl zclVar = qmk.f28987a;
        f24886a = 338.0f;
    }

    public static final void a(a4x a4xVar, fet fetVar, int i) {
        fet fetVar2;
        yfe0 yfe0VarU;
        eup eupVar;
        fetVar.g0(558529484);
        byte b = 4;
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            if (a4xVar.isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    eupVar = new eup(a4xVar, i, b);
                }
            } else {
                mm40 mm40VarL = s5x0.L(jm40.b, xfn.a(fetVar).e, 0.0f, 2);
                zcl zclVar = qmk.f28987a;
                thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, -1398481700, a4xVar);
                while (itO.hasNext()) {
                    t2m t2mVar = (t2m) itO.next();
                    fetVar.b0(-454014258, t2mVar.getId());
                    vdb.w(null, t2mVar, null, fetVar, 0, 5);
                    fetVar.r(false);
                }
                fetVar2 = fetVar;
                fetVar2.r(false);
                fetVar2.r(true);
            }
            yfe0VarU.d = eupVar;
        }
        fetVar2 = fetVar;
        fetVar2.X();
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            eupVar = new eup(a4xVar, i, (byte) 5);
            yfe0VarU.d = eupVar;
        }
    }

    public static final void b(a4x a4xVar, fet fetVar, int i) {
        yfe0 yfe0VarU;
        eup eupVar;
        fetVar.g0(1989391569);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            if (a4xVar.isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    eupVar = new eup(a4xVar, i, (byte) 6);
                }
            } else {
                mm40 mm40VarL = s5x0.L(jm40.b, xfn.a(fetVar).c, 0.0f, 2);
                zcl zclVar = qmk.f28987a;
                thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, gqw0.x);
                jpm0.o(fetVar, bh90VarM, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar);
                Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 1750668076, a4xVar);
                while (itO.hasNext()) {
                    m9m m9mVar = (m9m) itO.next();
                    fetVar.b0(1974036929, Integer.valueOf(m9mVar.f21417a));
                    x7z x7zVar = new x7z(1.0f, true);
                    if (!(m9mVar instanceof m9m)) {
                        throw b1j.f(148497406, fetVar, false);
                    }
                    fetVar.e0(308512122);
                    fbc.s(x7zVar, m9mVar, fetVar, 0);
                    fetVar.r(false);
                    fetVar.r(false);
                }
                fetVar.r(false);
                fetVar.r(true);
            }
            yfe0VarU.d = eupVar;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            eupVar = new eup(a4xVar, i, (byte) 7);
            yfe0VarU.d = eupVar;
        }
    }

    public static final void c(mm40 mm40Var, n9m n9mVar, fet fetVar, int i) {
        fetVar.g0(-2000485251);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(n9mVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarE = o7k0.e(o7k0.d(mm40Var, 1.0f), f24886a);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = r71.o;
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            g(n9mVar.b, fetVar, 0);
            e(0, fetVar);
            f(n9mVar, fetVar, (i2 >> 3) & 14);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5m(mm40Var, n9mVar, i, (byte) 9);
        }
    }

    public static final void d(String str, fet fetVar, int i) {
        fetVar.g0(-1546274738);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40.b, xfn.a(fetVar).e, 0.0f, 2), 1.0f);
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.p(), fetVar, i2 & 14, 24960, 110584);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 10, i, str);
        }
    }

    public static final void e(int i, fet fetVar) {
        fetVar.g0(-375312967);
        if (fetVar.U(i & 1, i != 0)) {
            float f = f24886a;
            float fB = pkd.b(f, fetVar);
            zq8.a(0, fetVar, i120.P(o7k0.e(o7k0.d(jm40.b, 1.0f), f), yk5.n(q3d.j(new y3d(((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU()), new y3d(ijg.i)), 0.25f * fB, fB * 0.9f, 8), null, 6));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f4m(i, (byte) 11);
        }
    }

    public static final void f(n9m n9mVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1824432821);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(n9mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 16.0f, 7);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            a(n9mVar.c, fetVar, 0);
            d(n9mVar.f23148a, fetVar, 0);
            b(n9mVar.d, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(n9mVar, i, (byte) 19);
        }
    }

    public static final void g(n0x n0xVar, fet fetVar, int i) {
        fetVar.g0(1657450988);
        int i2 = (fetVar.g(n0xVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            rq8.b(o7k0.e(o7k0.s(jm40.b, 206.0f), 320.0f), null, n0xVar, R.drawable.cybergames_ufc_fighter_placeholder, new y3d(y3d.g), null, gqw0.b, gqw0.Z, null, fetVar, ((i2 << 6) & 896) | 14180352, 290);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0g(n0xVar, i, (byte) 5);
        }
    }
}
