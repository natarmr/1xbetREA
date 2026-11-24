package a;

import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ep20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f8165a;

    static {
        zcl zclVar = qmk.f28987a;
        f8165a = 70.0f;
    }

    public static final void a(mm40 mm40Var, wls wlsVar, fet fetVar, int i) {
        pm80 pm80VarF;
        k6z k6zVar;
        wlsVar.getClass();
        fetVar.g0(441190984);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(wlsVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 88.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), ijg.i, jd8.n), "MAPS_IN_SERIES_ITEM");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
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
            Integer num = wlsVar.g;
            if (num == null) {
                fetVar.e0(776700269);
                fetVar.r(false);
                pm80VarF = null;
            } else {
                fetVar.e0(776700270);
                pm80VarF = a8k0.F(num.intValue(), 0, fetVar);
                fetVar.r(false);
            }
            pm80 pm80Var = pm80VarF;
            k7x.b(wlsVar.d, null, o2e.e0(o7k0.c, "MAP_BACKGROUND"), pm80Var, pm80Var, null, null, null, null, null, gqw0.A, null, fetVar, 37296, 6, 31712);
            if (wlsVar.h) {
                fetVar.e0(717805609);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(717806533);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(1158186306, new tx(wlsVar, (byte) 24), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k110((byte) 23, i, mm40Var, (Object) wlsVar);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var, String str, String str2, boolean z) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-105238064);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.h(z) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.m, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "MAP_INFO_ROW");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE0);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str2, o2e.e0(jm40Var, "MAP_DESCRIPTION_TEXT"), staticColors.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.b(), fetVar2, ((i2 >> 6) & 14) | 48, 24960, 109560);
            if (z) {
                fetVar2.e0(864997333);
                zq8.a(0, fetVar2, o2e.e0(i120.Q(s5x0.J(o7k0.n(s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14).e(new ecu0(gqw0.k)), 10.0f), 2.0f), y3d.d, vgg0.f37379a), "MAP_DESCRIPTION_BADGE"));
                fetVar2.r(false);
            } else {
                fetVar2.e0(865492248);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            v8q0.a(str, o2e.e0(s5x0.N(jm40Var, 0.0f, 2.0f, 0.0f, 0.0f, 13), "MAP_NAME_TEXT"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.q(), fetVar2, (i2 >> 3) & 14, 24960, 109560);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eza((byte) 3, i, mm40Var, str, str2, z);
        }
    }

    public static final void c(fp20 fp20Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(679805393);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? fetVar2.g(fp20Var) : fetVar2.i(fp20Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.h(true) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 32.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            String str = fp20Var.f9909a;
            mm40 mm40VarN = o7k0.n(jm40Var, 24.0f);
            mm40 mm40VarN2 = o7k0.n(jm40Var, 24.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            lgb.v(mm40VarN, mm40VarN2, str, R.drawable.ic_glyph_circle_globe, staticColors.m130getWhite600d7_KjU(), gqw0.A, fetVar2, 196608, 0);
            v8q0.a(fp20Var.b, o2e.e0(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 10).e(new x7z(1.0f, true)), "TeamName"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.e(), fetVar, 0, 24960, 110584);
            fetVar.e0(-1257279701);
            String str2 = fp20Var.c;
            mm40 mm40VarL = s5x0.L(o7k0.s(jm40Var, f8165a), 16.0f, 0.0f, 2);
            long j = kkg.s;
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            v8q0.a(str2, o2e.e0(s5x0.J(i120.Q(mm40VarL, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f), "TEAM_SCORE"), fp20Var.d, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.q(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(fp20Var, i, (byte) 24);
        }
    }

    public static final void d(mm40 mm40Var, fp20 fp20Var, fp20 fp20Var2, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1081105933);
        int i2 = (fetVar.g(fp20Var) ? 32 : 16) | i | (fetVar.g(fp20Var2) ? 256 : 128) | (fetVar.h(true) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = mm40Var;
            mm40 mm40VarN = s5x0.N(mm40Var2, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA = w5d.a(uc9.f, gqw0.m, fetVar, 54);
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
            int i3 = (i2 >> 3) & 14;
            int i4 = i2 >> 6;
            c(fp20Var, fetVar, i3 | (i4 & 112));
            c(fp20Var2, fetVar, i4 & 126);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(mm40Var2, fp20Var, fp20Var2, i, (byte) 13);
        }
    }
}
