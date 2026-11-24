package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n6m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f23003a = idm0.t(10);
    public static final long b = idm0.t(14);
    public static final ugg0 c;
    public static final ugg0 d;
    public static final ugg0 e;

    static {
        zcl zclVar = qmk.g;
        ugg0 ugg0Var = vgg0.f37379a;
        c = new ugg0(zclVar, zclVar, zclVar, zclVar);
        zcl zclVar2 = qmk.e;
        d = new ugg0(zclVar2, zclVar2, zclVar2, zclVar2);
        zcl zclVar3 = qmk.d;
        e = new ugg0(zclVar3, zclVar3, zclVar3, zclVar3);
    }

    public static final void a(n0x n0xVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(64693292);
        int i2 = i | (fetVar2.g(n0xVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) fetVar2.k(dy2.b);
            int i3 = pkd.d(fetVar2) ? R.drawable.cybergames_tablet_game_map_placeholder : R.drawable.cybergames_game_map_placeholder;
            k1x k1xVar = new k1x(context);
            k1xVar.c = Integer.valueOf(i3);
            mz3 mz3VarX = l7x.X(k1xVar.a(), null, null, fetVar2, 0, 30);
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA = jr8Var.a(jm40Var);
            k1x k1xVar2 = new k1x(context);
            k1xVar2.c = n0xVar.a();
            fetVar2 = fetVar;
            k7x.b(k1xVar2.a(), null, mm40VarA, mz3VarX, mz3VarX, null, null, null, null, null, gqw0.A, null, fetVar2, 48, 6, 31712);
            mm40 mm40VarA2 = jr8Var.a(jm40Var);
            pz40 pz40Var = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            zq8.a(0, fetVar2, i120.P(mm40VarA2, yk5.n(q3d.j(new y3d(staticColors.m73getBlack400d7_KjU()), new y3d(staticColors.m78getBlack800d7_KjU())), 0.0f, 0.0f, 14), null, 6));
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g0g(n0xVar, i, (byte) 4);
        }
    }

    public static final void b(mm40 mm40Var, o6m o6mVar, fet fetVar, int i, int i2) {
        int i3;
        k6z k6zVar;
        fetVar.g0(-1324712048);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (fetVar.g(o6mVar) ? 32 : 16);
        if (fetVar.U(i5 & 1, (i5 & 19) != 18)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            if (o6mVar.g) {
                fetVar.e0(-1737953129);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1737952205);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-477629744, new mz7(mm40Var, o6mVar, (byte) 5), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y13(mm40Var2, o6mVar, i, i2, (byte) 2);
        }
    }

    public static final void c(mm40 mm40Var, p6m p6mVar, boolean z, fet fetVar, int i) {
        String str = p6mVar.b;
        c280 c280Var = p6mVar.f26462a;
        fetVar.g0(-1202301854);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(p6mVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(z ? gqw0.m : gqw0.o, (byte) 12)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (z) {
                fetVar.e0(-318164355);
                h(c280Var, fetVar, 0);
                if (str == null) {
                    fetVar.e0(-318091630);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-318091629);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    g(0, fetVar, new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, false), str);
                    fetVar.r(false);
                }
                fetVar.r(false);
            } else {
                fetVar.e0(-317897507);
                if (str == null) {
                    fetVar.e0(-317867438);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-317867437);
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    g(0, fetVar, new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, false), str);
                    fetVar.r(false);
                }
                h(c280Var, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new igm((byte) 17, i, mm40Var, p6mVar, z);
        }
    }

    public static final void d(o6m o6mVar, fet fetVar, int i) {
        fetVar.g0(893627723);
        int i2 = (fetVar.g(o6mVar) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 32.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            c(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), o6mVar.c, false, fetVar, 384);
            e(o6mVar.e, o6mVar.f, fetVar, 0);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            c(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), o6mVar.d, true, fetVar, 384);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i3l(o6mVar, i, (byte) 8);
        }
    }

    public static final void e(String str, String str2, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-2084477322);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(jm40.b, 80.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            f(str, fetVar2, i2 & 14);
            pz40 pz40Var = s6t0.f31722a;
            long jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(Separators.COLON, null, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.l(), fetVar, 6, 0, 130042);
            fetVar2 = fetVar;
            f(str2, fetVar2, (i2 >> 3) & 14);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hw6((byte) 6, i, str, str2);
        }
    }

    public static final void f(String str, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1959515157);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 28.0f);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarS = i120.S(mm40VarN, 1.0f, StaticColors.INSTANCE.m125getWhite100d7_KjU(), d);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarL = s5x0.L(jm40Var, 2.0f, 0.0f, 2);
            n05 n05Var = new n05(f23003a, b, qmk.n);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = m6m.b;
                fetVar.o0(objP);
            }
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            aad.e(str, mm40VarL, y9q0.a(g1t0.l(), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447), null, 2, false, 1, 0, (n4d) objP, n05Var, fetVar, (i2 & 14) | 1597440, 168);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v((byte) 5, i, str);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-1555628108);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 16.0f);
            zfn zfnVar = jjg.f16616a;
            ((ijg) fetVar2.k(zfnVar)).getClass();
            long j = ijg.s0;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarE, y3d.c(0.1f, j), e), 4.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            ((ijg) fetVar2.k(zfnVar)).getClass();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.b(), fetVar2, (i2 >> 3) & 14, 24960, 110586);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var, str2, i, (byte) 29);
        }
    }

    public static final void h(c280 c280Var, fet fetVar, int i) {
        fetVar.g0(-1152272938);
        int i2 = (fetVar.g(c280Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            String str = c280Var.f3613a;
            str.getClass();
            c280 c280Var2 = new c280(str, R.drawable.ic_glyph_circle_globe);
            boolean zG = fetVar.g(c280Var2);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new ddf(c280Var2, (byte) 2);
                fetVar.o0(objP);
            }
            kkb.p(1, fetVar, null, (Function0) objP);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qqh(c280Var, i, (byte) 1);
        }
    }

    public static final void i(int i, fet fetVar) {
        fetVar.g0(-2129958925);
        int i2 = (fetVar.g(null) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(jm40.b, 14.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            brm0.x(fetVar, mm40VarC0, gqw0.v, -33509389, false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f4m(i, (byte) 3);
        }
    }

    public static final void j(String str, fet fetVar, int i) {
        fetVar.g0(-1714234321);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            long jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, jM123getWhite0d7_KjU, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.a(), fetVar, (i2 & 14) | 48, 24960, 109560);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 7, i, str);
        }
    }
}
