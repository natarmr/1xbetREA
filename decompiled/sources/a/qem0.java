package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qem0 {
    public static final void a(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1877925528);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new o0q0(function1, (byte) 26);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            jcb.l(jm40Var, mdmVar, true, (Function0) objP, fetVar, (i2 & 14) | 384 | (i2 & 112), 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hak0(mm40Var2, mdmVar, function1, i, (byte) 7);
        }
    }

    public static final void b(mm40 mm40Var, a2n a2nVar, boolean z, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1261730181);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a2nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = a2nVar instanceof y56;
            cl5 cl5Var = ukd.f35823a;
            if (z2) {
                fetVar.e0(-1341919290);
                boolean z3 = true;
                y56 y56Var = (y56) a2nVar;
                if ((i2 & 7168) != 2048) {
                    z3 = false;
                }
                Object objP = fetVar.P();
                if (z3 || objP == cl5Var) {
                    objP = new coo0(function1, (byte) 26);
                    fetVar.o0(objP);
                }
                vcc.i(mm40Var, y56Var, z, (Function1) objP, null, fetVar, i2 & 1022, 16);
                fetVar.r(false);
            } else {
                boolean z4 = true;
                if (a2nVar instanceof c2o0) {
                    fetVar.e0(-1341910678);
                    c2o0 c2o0Var = (c2o0) a2nVar;
                    if ((i2 & 7168) != 2048) {
                        z4 = false;
                    }
                    Object objP2 = fetVar.P();
                    if (z4 || objP2 == cl5Var) {
                        objP2 = new coo0(function1, (byte) 27);
                        fetVar.o0(objP2);
                    }
                    hkb.n(mm40Var, c2o0Var, z, (Function1) objP2, null, fetVar, i2 & 1022, 16);
                    fetVar.r(false);
                } else {
                    fetVar.e0(1350677575);
                    fetVar.r(false);
                }
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040((byte) 14, i, (Object) mm40Var, (Object) a2nVar, (Object) function1, z);
        }
    }

    public static final void c(int i, fet fetVar) {
        int i2;
        fetVar.g0(-1228741790);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 210.0f);
            long jM75getBlack600d7_KjU = StaticColors.INSTANCE.m75getBlack600d7_KjU();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, i120.Q(mm40VarE, jM75getBlack600d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bur0(i, b);
        }
    }

    public static final void d(mm40 mm40Var, bmp0 bmp0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        bmp0Var.getClass();
        fetVar2.g0(-1323230598);
        int i2 = i | 6 | (fetVar2.g(bmp0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.d(o7k0.e(jm40Var, 20.0f), 1.0f), "STATISTIC_ITEM_TEST_TAG");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zx7 zx7Var = gqw0.d;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarB);
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
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), 10.0f);
            boolean z2 = (i2 & 112) == 32;
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new j1l0(bmp0Var, (byte) 14);
                fetVar2.o0(objP);
            }
            zq8.a(0, fetVar2, rq8.K(mm40VarN, (Function1) objP));
            String str = bmp0Var.b;
            long j = qmk.q;
            y9q0 y9q0VarD = g1t0.d();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, null, staticColors.m123getWhite0d7_KjU(), null, j, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarD, fetVar, 0, 0, 131050);
            fetVar.r(true);
            v8q0.a(bmp0Var.c, o2e.e0(jr8Var.b(jm40Var, gqw0.f), "STATISTIC_ITEM_VALUE_TEST_TAG"), staticColors.m123getWhite0d7_KjU(), null, qmk.s, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.i(), fetVar, 0, 0, 131048);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o3m0(mm40Var2, bmp0Var, i, (byte) 7);
        }
    }

    public static kin0 e() {
        return new kin0(null);
    }

    public static final void f(brq0 brq0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(166245020);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(brq0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            cem0.j(jm40Var, brq0Var, fetVar, i2 & 126);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(brq0Var, i);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-1861739119);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            j0x.b(a8k0.F(R.drawable.ic_glyph_popular_red_24dp, 0, fetVar2), null, null, null, null, 0.0f, null, fetVar2, 56, 124);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            long textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarN, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.q(), fetVar, (i2 >> 3) & 14, 0, 131064);
            str2 = str;
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgp0(mm40Var, str2, i, (byte) 3);
        }
    }

    public static final void h(mm40 mm40Var, i5r0 i5r0Var, Function1 function1, fet fetVar, int i) {
        Function1 function2;
        boolean z;
        fet fetVar2 = fetVar;
        i5r0Var.getClass();
        function1.getClass();
        fetVar2.g0(225288420);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(i5r0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarH = phu0.H(o7k0.d(mm40Var, 1.0f), null, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarH);
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
            z4r0 z4r0Var = i5r0Var.c;
            if (z4r0Var instanceof y4r0) {
                fetVar2.e0(-1101196457);
                a(null, ((y4r0) z4r0Var).f42018a, function1, fetVar2, i2 & 896);
                fetVar2.r(false);
                function2 = function1;
                z = true;
            } else {
                if (!(z4r0Var instanceof x4r0)) {
                    throw b1j.f(-1101198145, fetVar2, false);
                }
                fetVar2.e0(222843503);
                zcl zclVar = qmk.f28987a;
                jm40 jm40Var = jm40.b;
                g(0, fetVar2, s5x0.M(jm40Var, 16.0f, 24.0f, 16.0f, 8.0f), i5r0Var.f14207a);
                kkb.m(null, i5r0Var.b, null, 5, 0L, 0L, fetVar, 0, 53);
                wvb.o(null, 24.0f, 0L, fetVar, 0, 5);
                b(s5x0.L(jm40Var, 16.0f, 0.0f, 2), ((x4r0) z4r0Var).f40281a, i5r0Var.d, function1, fetVar, (i2 << 3) & 7168);
                function2 = function1;
                wvb.o(null, 24.0f, 0L, fetVar, 0, 5);
                vul vulVar = vul.f38053a;
                wul wulVar = i5r0Var.e;
                boolean z2 = (i2 & 896) == 256;
                Object objP = fetVar.P();
                if (z2 || objP == ukd.f35823a) {
                    objP = new o0q0(function2, (byte) 25);
                    fetVar.o0(objP);
                }
                ckb.i(null, vulVar, wulVar, 0L, (Function0) objP, fetVar, 48, 9);
                fetVar2 = fetVar;
                fetVar2.r(false);
                z = true;
            }
            fetVar2.r(z);
        } else {
            function2 = function1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgm0(mm40Var, i5r0Var, function2, i, (byte) 22);
        }
    }

    public static final void i(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var) {
        l7m0Var.getClass();
        fetVar.g0(576301359);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            erq0 erq0Var = (erq0) l7m0Var.getValue();
            boolean zD = Intrinsics.d(erq0Var, drq0.f6576a);
            jm40 jm40Var = jm40.b;
            if (zD) {
                fetVar.e0(-225167204);
                zcl zclVar = qmk.f28987a;
                zq8.a(0, fetVar, o7k0.e(jm40Var, 0.0f));
                fetVar.r(false);
            } else if (Intrinsics.d(erq0Var, crq0.f4858a)) {
                fetVar.e0(-225163721);
                c(i2 & 14, fetVar);
                fetVar.r(false);
            } else {
                if (!(erq0Var instanceof brq0)) {
                    throw b1j.f(-225170513, fetVar, false);
                }
                fetVar.e0(-225160444);
                f((brq0) erq0Var, fetVar, i2 & 14);
                fetVar.r(false);
            }
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cf4(mm40Var, l7m0Var, i, (byte) 4);
        }
    }

    public static final void j(mm40 mm40Var, boolean z, xds0 xds0Var, fet fetVar, int i) {
        fetVar.g0(723216338);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.e(xds0Var.ordinal()) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = xds0Var == xds0.b || xds0Var == xds0.c;
            mm40 mm40VarJ = lgb.J(o7k0.d(mm40Var, 1.0f), fem0.k(xds0Var, fetVar, (i2 >> 6) & 14));
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarJ, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarD, 12.0f, 18.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarK);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            float f = z ? 192.0f : 160.0f;
            zx7 zx7Var2 = gqw0.d;
            jr8 jr8Var = jr8.f16991a;
            qxw.o(fetVar, xbc.c0(o7k0.s(o7k0.e(lgb.J(jr8Var.b(jm40Var, zx7Var2), vgg0.a(8.0f)), 16.0f), f), vbc.d0(null, fetVar, 0, 1)));
            h97.s(o7k0.s(o7k0.e(lgb.J(jr8Var.b(jm40Var, gqw0.f), vgg0.a(8.0f)), 16.0f), 64.0f), vbc.d0(null, fetVar, 0, 1), fetVar, true);
            if (z2) {
                fetVar.e0(1984138448);
                mbc.o(zfi0.f44303a, o7k0.d(s5x0.N(jr8Var.b(jm40Var, gqw0.g), 76.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), false, fetVar, 6, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(1984400150);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) mm40Var, z, (Object) xds0Var, i, (byte) 25);
        }
    }

    public static final boo0 k(String str, aco0 aco0Var, List list, long j, pno0 pno0Var, boolean z, Function1 function1) {
        list.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aco0 aco0Var2 = (aco0) it.next();
            long j2 = aco0Var2.f639a;
            arrayList.add(new lxl(j2, (dyl) new xxl((String) function1.invoke(Long.valueOf(j2))), false, (aco0Var == null || ((long) aco0Var2.f639a) != ((long) aco0Var.f639a)) ? uxl.f36445a : uxl.b, (cwl) null, 108));
        }
        y3d y3dVar = null;
        return new boo0(str, new fyl(dyb.o0(arrayList), null, null, s5x0.t(xfn.b(z).e, 0.0f, 2), new jyl(new y3d(j), y3dVar, y3dVar, 126), 6), pno0Var);
    }

    public static final List l(int i, int i2) {
        if (i == 0) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 < i2) {
                arrayList.add(Boolean.TRUE);
            } else {
                arrayList.add(Boolean.FALSE);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX WARN: Code duplicated, block: B:21:0x004f A[LOOP:1: B:20:0x004d->B:21:0x004f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    public static final zat0 m(qbt0 qbt0Var, Date date, ctf0 ctf0Var, v5l0 v5l0Var, q0s q0sVar, boolean z, int i, boolean z2) {
        a4x a4xVarO0;
        ArrayList arrayList;
        ctf0Var.getClass();
        int i2 = 0;
        if (qbt0Var == null || !date.equals(qbt0Var.f28454a)) {
            ArrayList arrayList2 = new ArrayList(i);
            while (i2 < i) {
                arrayList2.add(pzw.I(v5l0Var));
                i2++;
            }
            a4xVarO0 = dyb.o0(arrayList2);
        } else {
            Object obj = qbt0Var.b;
            e0g0 e0g0Var = j0g0.b;
            if (obj instanceof g0g0) {
                obj = null;
            }
            List list = (List) obj;
            if (list != null) {
                ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(pzw.Z((icg) it.next(), q0sVar, v5l0Var, ctf0Var));
                }
                a4xVarO0 = dyb.o0(arrayList3);
                if (a4xVarO0 == null) {
                    if (z) {
                        arrayList = new ArrayList(i);
                        while (i2 < i) {
                            arrayList.add(pzw.I(v5l0Var));
                            i2++;
                        }
                        a4xVarO0 = dyb.o0(arrayList);
                    } else {
                        a4xVarO0 = lak0.c;
                    }
                }
            } else if (z) {
                arrayList = new ArrayList(i);
                while (i2 < i) {
                    arrayList.add(pzw.I(v5l0Var));
                    i2++;
                }
                a4xVarO0 = dyb.o0(arrayList);
            } else {
                a4xVarO0 = lak0.c;
            }
        }
        if (a4xVarO0.isEmpty()) {
            return null;
        }
        return new zat0("RESULTS".concat(rdj.c(rdj.f30294a, sdj.UNIVERSAL, date, null, 60)), new vb90(q0sVar, a4xVarO0, true, z2));
    }

    /* JADX WARN: Code duplicated, block: B:272:0x0756 A[LOOP:18: B:270:0x0750->B:272:0x0756, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:431:0x0c38  */
    /* JADX WARN: Code duplicated, block: B:432:0x0c3b  */
    /* JADX WARN: Code duplicated, block: B:434:0x0c3e  */
    /* JADX WARN: Code duplicated, block: B:439:0x0c56  */
    /* JADX WARN: Code duplicated, block: B:513:0x0e13  */
    /* JADX WARN: Code duplicated, block: B:514:0x0e16  */
    /* JADX WARN: Code duplicated, block: B:516:0x0e19  */
    /* JADX WARN: Code duplicated, block: B:521:0x0e31  */
    /* JADX WARN: Code duplicated, block: B:54:0x0146  */
    /* JADX WARN: Code duplicated, block: B:55:0x0149  */
    /* JADX WARN: Code duplicated, block: B:57:0x0151  */
    /* JADX WARN: Code duplicated, block: B:58:0x0154  */
    /* JADX WARN: Code duplicated, block: B:79:0x0238  */
    /* JADX WARN: Code duplicated, block: B:83:0x0243  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v111 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r12v23, types: [a.i4, a.y3d] */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r3v79 */
    /* JADX WARN: Type inference failed for: r3v80 */
    /* JADX WARN: Type inference failed for: r3v82, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference failed for: r3v95, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v28, types: [a.rx3] */
    /* JADX WARN: Type inference failed for: r6v88 */
    /* JADX WARN: Type inference failed for: r6v89 */
    /* JADX WARN: Type inference failed for: r6v90 */
    /* JADX WARN: Type inference failed for: r6v91 */
    /* JADX WARN: Type inference failed for: r9v61 */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Type inference failed for: r9v79 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v26 java.lang.Object, still in use, count: 2, list:
          (r9v26 java.lang.Object) from 0x0c34: PHI (r9 I:??) = (r9v18 java.lang.Object), (r9v26 java.lang.Object) binds: [B:428:0x0c33, B:624:0x0c34] A[DONT_GENERATE, DONT_INLINE]
          (r9v26 java.lang.Object) from 0x0c2a: CHECK_CAST (a.x0u0) (r9v26 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final a.i4 n(java.util.ArrayList r48, a.fzt0 r49, a.gzt0 r50, a.ctf0 r51, boolean r52, java.util.List r53, boolean r54, boolean r55) {
        /*
            Method dump skipped, instruction units count: 3868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qem0.n(java.util.ArrayList, a.fzt0, a.gzt0, a.ctf0, boolean, java.util.List, boolean, boolean):a.i4");
    }

    public static float o(ujv0 ujv0Var) {
        ujv0Var.getClass();
        return ujv0Var.a(Response.BUSY_EVERYWHERE) ? 0.8f : 1.0f;
    }

    public static final int p(Context context) {
        Object applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        z7z z7zVar = ((ApplicationLoader) ((ak3) applicationContext)).d;
        if (z7zVar != null) {
            return fem0.o(((wyu) z7zVar.get()).a());
        }
        Intrinsics.h("getThemeUseCase");
        throw null;
    }

    public static final epu0 q(v5l0 v5l0Var, String str) {
        l0l0 l0l0Var;
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            l0l0Var = g0l0.f10465a;
        } else if (iOrdinal == 1) {
            l0l0Var = k0l0.f17474a;
        } else if (iOrdinal == 2) {
            l0l0Var = j0l0.f15687a;
        } else if (iOrdinal == 3) {
            l0l0Var = i0l0.f13953a;
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return null;
            }
            l0l0Var = h0l0.f12241a;
        }
        return new epu0(str, new vb90(q0s.b, dyb.g0(new x56(l0l0Var), new x56(l0l0Var)), false, true));
    }

    public static final boolean r(Context context) {
        Object applicationContext = context != null ? context.getApplicationContext() : null;
        ak3 ak3Var = applicationContext instanceof ak3 ? (ak3) applicationContext : null;
        if (ak3Var == null) {
            return false;
        }
        z7z z7zVar = ((ApplicationLoader) ak3Var).d;
        if (z7zVar == null) {
            Intrinsics.h("getThemeUseCase");
            throw null;
        }
        uaq0 uaq0VarA = ((wyu) z7zVar.get()).a();
        uaq0.f35345a.getClass();
        return !s9m0.j(uaq0VarA);
    }

    public static final Object s(Function2 function2, zje zjeVar) {
        jin0 jin0Var = new jin0(zjeVar, zjeVar.getContext());
        Object objZ = ycm0.z(jin0Var, true, jin0Var, function2);
        wne wneVar = wne.f39444a;
        return objZ;
    }

    public static final o9p0 t(cap0 cap0Var, long j) {
        String strF;
        List list;
        String strF2;
        cap0Var.getClass();
        Long l = cap0Var.b;
        long jLongValue = l != null ? l.longValue() : 0L;
        String str = cap0Var.c;
        String str2 = str == null ? "" : str;
        String str3 = cap0Var.f4023a;
        String str4 = str3 == null ? "" : str3;
        String str5 = cap0Var.d;
        String str6 = str5 == null ? "" : str5;
        String str7 = cap0Var.f;
        String str8 = str7 == null ? "" : str7;
        String str9 = cap0Var.e;
        String str10 = str9 == null ? "" : str9;
        Long l2 = cap0Var.g;
        List list2 = null;
        if (l2 == null || l2.longValue() <= 0) {
            strF = "";
        } else {
            rdj rdjVar = rdj.f30294a;
            strF = rdj.f(new znq0(l2.longValue()), sdj.UNIVERSAL, null, 60);
        }
        List<hh> list3 = cap0Var.h;
        if (list3 != null) {
            ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
            ArrayList arrayList2 = arrayList;
            for (hh hhVar : list3) {
                hhVar.getClass();
                String str11 = hhVar.f13037a;
                String str12 = str11 == null ? "" : str11;
                String strE = lmc.E(hhVar.b);
                Long l3 = hhVar.c;
                ArrayList arrayList3 = arrayList2;
                if (l3 != null) {
                    long jLongValue2 = l3.longValue();
                    rdj rdjVar2 = rdj.f30294a;
                    strF2 = rdj.f(new znq0(jLongValue2), sdj.UNIVERSAL, null, 60);
                } else {
                    strF2 = null;
                }
                String str13 = strF2 == null ? "" : strF2;
                String str14 = hhVar.d;
                String str15 = str14 == null ? "" : str14;
                String str16 = hhVar.e;
                String strP = str16 != null ? twn.p("[^\\d-]", str16, "") : null;
                String str17 = strP == null ? "" : strP;
                Integer num = hhVar.f;
                arrayList3.add(new eh(num != null ? num.intValue() : 0, str12, strE, str13, str15, str17, Intrinsics.d(hhVar.g, Boolean.TRUE)));
                arrayList2 = arrayList3;
            }
            list = arrayList2;
        } else {
            list = null;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        List<whs0> list4 = cap0Var.i;
        if (list4 != null) {
            ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
            for (whs0 whs0Var : list4) {
                whs0Var.getClass();
                Long l4 = whs0Var.f39181a;
                rdj rdjVar3 = rdj.f30294a;
                Date dateK = rdj.k(l4 != null ? l4.longValue() : 0L);
                long jLongValue3 = l4 != null ? l4.longValue() : -1L;
                mca0 mca0Var = whs0Var.b;
                String str18 = mca0Var != null ? mca0Var.f21541a : null;
                String str19 = str18 == null ? "" : str18;
                String strE2 = lmc.E(mca0Var != null ? mca0Var.b : null);
                wmp0 wmp0Var = whs0Var.c;
                tmp0 tmp0VarQ = wmp0Var != null ? ipm0.q(wmp0Var) : new tmp0("", "", "", fks0.Empty, 0L, xmp0.d, false);
                wmp0 wmp0Var2 = whs0Var.d;
                arrayList4.add(new nhs0(dateK, jLongValue3, str19, strE2, tmp0VarQ, wmp0Var2 != null ? ipm0.q(wmp0Var2) : new tmp0("", "", "", fks0.Empty, 0L, xmp0.d, false)));
            }
            list2 = arrayList4;
        }
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        List list5 = list2;
        List list6 = cap0Var.j;
        if (list6 == null) {
            list6 = iun.f15405a;
        }
        return new o9p0(jLongValue, str2, j, str4, str6, str8, str10, strF, list, list5, list6);
    }

    public static final q56 u(d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        y1n y1nVar;
        q56 l56Var;
        d0tVar.getClass();
        ctf0Var.getClass();
        str.getClass();
        list.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        d2i d2iVar = null;
        if (iOrdinal == 0) {
            long j = d0tVar.f5282a;
            i4i i4iVarN = s7n0.n(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            f0t f0tVar = d0tVar.q;
            List list2 = f0tVar.d;
            String str3 = (String) CollectionsKt.W(0, list2);
            if (str3 == null) {
                str3 = "";
            }
            long j2 = f0tVar.f8731a;
            String str4 = (String) CollectionsKt.W(1, list2);
            if (str4 == null) {
                str4 = "";
            }
            o4i o4iVar = new o4i(qzb.s0(d0tVar), new c280(vsm0.s(j2, str3), R.drawable.ic_glyph_placeholder_player), new c280(vsm0.s(j2, str4), R.drawable.ic_glyph_placeholder_player));
            f0t f0tVar2 = d0tVar.r;
            List list3 = f0tVar2.d;
            String str5 = (String) CollectionsKt.W(0, list3);
            if (str5 == null) {
                str5 = "";
            }
            long j3 = f0tVar2.f8731a;
            String str6 = (String) CollectionsKt.W(1, list3);
            o4i o4iVar2 = new o4i(qzb.t0(d0tVar), new c280(vsm0.s(j3, str5), R.drawable.ic_glyph_placeholder_player), new c280(vsm0.s(j3, str6 != null ? str6 : ""), R.drawable.ic_glyph_placeholder_player));
            String strG = kpb.G(d0tVar, ctf0Var);
            if (qzb.B0(d0tVar) || kpb.j0(d0tVar)) {
                long jU0 = kpb.j0(d0tVar) ? kpb.u0(d0tVar) : kpb.q0(d0tVar);
                boolean zJ0 = kpb.j0(d0tVar);
                fgm fgmVar = fgm.f9498a;
                y1nVar = new y1n(jU0, zJ0, d0tVar.P.getTime());
            } else {
                y1nVar = null;
            }
            l56Var = new l56(j, i4iVarN, new f66(new bxs0(o4iVar, o4iVar2, strG, y1nVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal == 1) {
            l56Var = new p56(d0tVar.f5282a, s7n0.r(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new l76(new qws0(qzb.s0(d0tVar)), new qws0(qzb.t0(d0tVar)), dyb.a0(d0tVar), kpb.G(d0tVar, ctf0Var), pem.f26861a), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal == 2) {
            long j4 = d0tVar.f5282a;
            k4i k4iVarQ = s7n0.q(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            rws0 rws0Var = new rws0(qzb.s0(d0tVar), null);
            rws0 rws0Var2 = new rws0(qzb.t0(d0tVar), null);
            p0n p0nVarA0 = dyb.a0(d0tVar);
            String strG2 = kpb.G(d0tVar, ctf0Var);
            if (d0tVar.S && z4) {
                d2iVar = new d2i();
            }
            l56Var = new o56(j4, k4iVarQ, new d76(d2iVar, p0nVarA0, rws0Var, rws0Var2, strG2), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal == 3) {
            l56Var = new n56(d0tVar.f5282a, s7n0.p(d0tVar, str, kpb.G(d0tVar, ctf0Var), list, z2, z3, z4, qzb.B0(d0tVar) || kpb.j0(d0tVar), str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new v66(fem0.m(d0tVar), fem0.n(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), new n0x(dtb.F(str)));
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return null;
            }
            l56Var = new m56(d0tVar.f5282a, s7n0.o(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new n66(fem0.m(d0tVar), fem0.n(d0tVar), kpb.G(d0tVar, ctf0Var), dyb.Z(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        return l56Var;
    }

    public static String v(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String strL = kng0.l(obj.getClass().getName(), Separators.AT, Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strL), (Throwable) e);
            return b1j.k(Separators.LESS_THAN, strL, " threw ", e.getClass().getName(), Separators.GREATER_THAN);
        }
    }

    public static String w(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (iIndexOf = str.indexOf("%s", i2)) != -1) {
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(v(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < objArr.length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(v(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String x(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(y(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(y(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String y(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String strO = rw2.o(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, Separators.AT, hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strO), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(strO.length() + 8 + name2.length() + 1);
            f140.v(sb, Separators.LESS_THAN, strO, " threw ", name2);
            sb.append(Separators.GREATER_THAN);
            return sb.toString();
        }
    }
}
