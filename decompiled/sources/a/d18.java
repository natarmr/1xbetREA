package a;

import android.javax.sip.message.Response;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d18 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f5299a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;

    static {
        zcl zclVar = qmk.f28987a;
        f5299a = 16.0f;
        b = 18.0f;
        c = 18.0f;
        d = 18.0f;
        e = 2.0f + 18.0f + 18.0f + 4.0f + 18.0f;
    }

    public static final void a(x08 x08Var, int i, fet fetVar, int i2) {
        fetVar.g0(-2007143065);
        int i3 = (fetVar.g(x08Var) ? 4 : 2) | i2 | (fetVar.e(i) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 60.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), StaticColors.INSTANCE.m75getBlack600d7_KjU(), jd8.n);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            b(0, fetVar, s5x0.N(o7k0.u(jm40Var, 0.0f, 100.0f, 1), 8.0f, 30.0f, 8.0f, 0.0f, 8), x08Var.f40059a);
            g(i, (i3 << 3) & 896, fetVar, x08Var.b, dw9.h(1.0f, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), true));
            c(0, fetVar, s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), x08Var.c, i == x08Var.f ? x08Var.d : x08Var.e);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00((byte) 9, i, i2, x08Var);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(1070552238);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            str2 = str;
            v8q0.a(str2, mm40Var, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, ((i2 >> 3) & 14) | ((i2 << 3) & 112), 24960, 110584);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hx1(mm40Var, str2, i, (byte) 7);
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        String str3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1779625736);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            int i3 = i2 >> 3;
            v8q0.a(str, null, StaticColors.INSTANCE.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar2, i3 & 14, 0, 131066);
            fetVar2 = fetVar2;
            str3 = str2;
            h(i3 & 112, fetVar2, s5x0.N(jm40.b, 0.0f, 4.0f, 0.0f, 0.0f, 13), str3);
            fetVar2.r(true);
        } else {
            str3 = str2;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g15(mm40Var, str, str3, i, (byte) 7);
        }
    }

    public static final void d(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-1095106042);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM125getWhite100d7_KjU = staticColors.m125getWhite100d7_KjU();
            ljc ljcVar = jd8.n;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarE, jM125getWhite100d7_KjU, ljcVar), 4.0f);
            zcl zclVar3 = qmk.c;
            mm40 mm40VarP = o7k0.p(i120.Q(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarJ), staticColors.m126getWhite200d7_KjU(), ljcVar), e, d);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarP);
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
            fetVar2 = fetVar;
            j0x.b(a8k0.F(R.drawable.ic_sport_kosti_235, 0, fetVar), null, o7k0.n(jm40Var, 12.0f), null, null, 0.0f, null, fetVar2, 56, 120);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i87(i, (byte) 18);
        }
    }

    public static final void e(zz7 zz7Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1975048065);
        int i2 = i | (fetVar2.g(zz7Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            StaticColors staticColors = StaticColors.INSTANCE;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarE, staticColors.m125getWhite100d7_KjU(), jd8.n), 4.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            float f = b;
            j0x.b(a8k0.F(zz7Var.f45238a, 0, fetVar2), null, o7k0.n(jm40Var, f), null, null, 0.0f, null, fetVar2, 440, 120);
            j0x.b(a8k0.F(zz7Var.b, 0, fetVar2), null, o7k0.n(s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14), f), null, null, 0.0f, null, fetVar2, 56, 120);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            zcl zclVar3 = qmk.c;
            v8q0.a(zz7Var.c, o7k0.y(o7k0.p(i120.Q(mm40VarN2, staticColors.m126getWhite200d7_KjU(), new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), c, d), gqw0.e, 2), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, 0, 24576, 114680);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m87(zz7Var, i, (byte) 10);
        }
    }

    public static final void f(j18 j18Var, int i, fet fetVar, int i2) {
        int i3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-319249412);
        int i4 = i2 | (fetVar2.g(j18Var) ? 4 : 2) | (fetVar2.e(i) ? 32 : 16);
        if (fetVar2.U(i4 & 1, (i4 & 19) != 18)) {
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40.b);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(j18Var.b, new wkw(xx7Var), StaticColors.INSTANCE.m130getWhite600d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            yz7 yz7Var = j18Var.f15720a;
            if (yz7Var instanceof xz7) {
                fetVar2.e0(-462658068);
                e(((xz7) yz7Var).f41742a, fetVar2, 0);
                fetVar2.r(false);
                i3 = i;
            } else if (yz7Var instanceof vz7) {
                fetVar2.e0(-462655153);
                vz7 vz7Var = (vz7) yz7Var;
                i3 = i;
                if (vz7Var.b == i3) {
                    fetVar2.e0(-1457366282);
                    e(vz7Var.f38286a, fetVar2, 0);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-1457303104);
                    d(0, fetVar2);
                    fetVar2.r(false);
                }
                fetVar2.r(false);
            } else {
                i3 = i;
                if (!(yz7Var instanceof wz7)) {
                    throw b1j.f(-462660617, fetVar2, false);
                }
                fetVar2.e0(-462648382);
                d(0, fetVar2);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            i3 = i;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00((byte) 10, i3, i2, j18Var);
        }
    }

    public static final void g(int i, int i2, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        int i3;
        fetVar.g0(-608333557);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.e(i) ? 256 : 128;
        }
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            int i4 = i3 & 112;
            boolean zG = (i4 == 32) | fetVar.g(xczVarA);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new b18(a4xVar, xczVarA, null, b2);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, a4xVar, (Function2) objP);
            mm40 mm40VarM = rq8.M(i4w0.U(mm40Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 1, null, 983039), new nk7((byte) 9));
            lh80 lh80VarT = s5x0.t(f5299a, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = (i4 == 32) | ((i3 & 896) == 256);
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new z08((Object) a4xVar, i, (byte) 0);
                fetVar.o0(objP2);
            }
            b8k0.f(mm40VarM, xczVarA, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP2, fetVar, 384, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a18(mm40Var, a4xVar, i, i2);
        }
    }

    public static final void h(int i, fet fetVar, mm40 mm40Var, String str) {
        int i2;
        String str2;
        fetVar.g0(-1000315827);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM125getWhite100d7_KjU = staticColors.m125getWhite100d7_KjU();
            ljc ljcVar = jd8.n;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarE, jM125getWhite100d7_KjU, ljcVar), 4.0f);
            zcl zclVar2 = qmk.c;
            str2 = str;
            v8q0.a(str2, o7k0.y(o7k0.p(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarJ), staticColors.m126getWhite200d7_KjU(), ljcVar), 28.0f, 18.0f), gqw0.e, 2), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, (i2 >> 3) & 14, 0, 131064);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var, str2, i, (byte) 3);
        }
    }
}
