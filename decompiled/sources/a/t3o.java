package a;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t3o {
    public static final void a(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        boolean z;
        boolean z2;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(1105321775);
        int i2 = (fetVar2.g(l7m0Var) ? 4 : 2) | i | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            mm40 mm40VarX = yyw.X(i120.Q(n0qVar, ((ThemeColors) fetVar2.k(zaq0.b)).getBackground(), jd8.n), null, fetVar2, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarX);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            int i3 = i2 & 112;
            dyb.v(((z3o) l7m0Var.getValue()).f43730a, function1, fetVar2, i3);
            b(null, ((z3o) l7m0Var.getValue()).b, function1, fetVar2, (i2 << 3) & 896);
            Object[] objArr = new Object[0];
            int i4 = i2 & 14;
            boolean z4 = i4 == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = new plh(l7m0Var, (byte) 17);
                fetVar2.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar2);
            Object[] objArr2 = new Object[0];
            boolean z5 = i4 == 4;
            Object objP2 = fetVar2.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new plh(l7m0Var, (byte) 19);
                fetVar2.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar2);
            p3o p3oVar = (p3o) l7m0VarY.getValue();
            if (p3oVar != null) {
                if (p3oVar instanceof n3o) {
                    fetVar2.e0(520707556);
                    wom womVarF = mom.f(fetVar2);
                    boolean zBooleanValue = ((Boolean) l7m0VarY2.getValue()).booleanValue();
                    boolean z6 = i3 == 32;
                    Object objP3 = fetVar2.P();
                    if (z6 || objP3 == cl5Var) {
                        objP3 = new ylm(function1, (byte) 20);
                        fetVar2.o0(objP3);
                    }
                    mom.c(null, zBooleanValue, womVarF, null, false, null, (Function0) objP3, null, u1c.M(1702988182, new eyn(l7m0Var, p3oVar, function1, (byte) 1), fetVar2), fetVar, 100663296, ModuleDescriptor.MODULE_VERSION);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                    z2 = true;
                } else if (p3oVar instanceof o3o) {
                    fetVar2.e0(522691928);
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, shdVar);
                    jpm0.o(fetVar2, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, shdVar4);
                    mm40 mm40VarW = o7k0.w(jm40.b, null, false, 3);
                    mdm mdmVar = ((o3o) p3oVar).b;
                    boolean z7 = i3 == 32;
                    Object objP4 = fetVar2.P();
                    if (z7 || objP4 == cl5Var) {
                        objP4 = new ylm(function1, (byte) 21);
                        fetVar2.o0(objP4);
                    }
                    jcb.l(mm40VarW, mdmVar, false, (Function0) objP4, fetVar2, 6, 4);
                    z2 = true;
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else {
                    z = false;
                }
                fetVar2.r(z2);
            } else {
                z = false;
            }
            throw b1j.f(155342063, fetVar2, z);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new quh(l7m0Var, function1, i, (byte) 9);
        }
    }

    public static final void b(mm40 mm40Var, l2o l2oVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(564862185);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(l2oVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            if (l2oVar != null) {
                fetVar2.e0(127728572);
                zfn zfnVar = zaq0.b;
                long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
                ljc ljcVar = jd8.n;
                mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ljcVar);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
                mm40 mm40VarQ2 = i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), ljcVar);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarK = s5x0.K(mm40VarQ2, qmk.a(fetVar2).d, 8.0f);
                a4x a4xVar = l2oVar.b;
                dxh0 dxh0Var = l2oVar.c;
                boolean z = (i2 & 112) == 32;
                Object objP = fetVar2.P();
                cl5 cl5Var = ukd.f35823a;
                if (z || objP == cl5Var) {
                    objP = new ntl(l2oVar, (byte) 15);
                    fetVar2.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                boolean z2 = (i2 & 896) == 256;
                Object objP2 = fetVar2.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new btm(function1, (byte) 11);
                    fetVar2.o0(objP2);
                }
                mm40Var2 = jm40Var;
                ibc.n(mm40VarK, a4xVar, gxh0.f12078a, dxh0Var, false, function0, (Function1) objP2, fetVar2, 384, 16);
                mbc.o(zfi0.f44303a, o7k0.d(jr8.f16991a.b(mm40Var2, gqw0.h), 1.0f), false, fetVar, 6, 4);
                fetVar2 = fetVar;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                mm40Var2 = jm40Var;
                fetVar2.e0(128740505);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o(mm40Var2, l2oVar, function1, i, (byte) 0);
        }
    }

    public static final void c(mm40 mm40Var, a4x a4xVar, d9z d9zVar, CyberGamesPage cyberGamesPage, boolean z, boolean z2, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        mm40 mm40VarV;
        a4xVar.getClass();
        d9zVar.getClass();
        function1.getClass();
        fetVar.g0(1496025933);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.g(d9zVar) ? 256 : 128) | (fetVar.i(cyberGamesPage) ? 2048 : 1024) | (fetVar.h(z) ? 16384 : 8192) | (fetVar.h(z2) ? 131072 : 65536) | (fetVar.i(function1) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            int i3 = (!pkd.d(fetVar) || cyberGamesPage.equals(CyberGamesPage.Virtual.INSTANCE)) ? 1 : 2;
            Object[] objArr = new Object[0];
            int i4 = i2 & 896;
            boolean z3 = i4 == 256;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z3 || objP == obj) {
                objP = new md0(d9zVar, (byte) 6);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            e2d e2dVar = (e2d) fetVar.k(nip.f23600a);
            jm40 jm40Var = jm40.b;
            if (e2dVar != null) {
                fetVar.e0(-766366249);
                boolean zG = fetVar.g(l7m0VarY);
                Object objP2 = fetVar.P();
                if (zG || objP2 == obj) {
                    objP2 = new plh(l7m0VarY, (byte) 18);
                    fetVar.o0(objP2);
                }
                mm40VarV = cjx.V(jm40Var, e2d.b(e2dVar, (Function0) objP2), null);
                fetVar.r(false);
            } else {
                fetVar.e0(-766207715);
                fetVar.r(false);
                mm40VarV = jm40Var;
            }
            mm40 mm40VarE = mm40VarV.e(o7k0.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarE, qmk.a(fetVar).c, 0.0f, 2);
            ngv ngvVar = new ngv(i3);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 12.0f, 0.0f, 32.0f, 5), fetVar);
            boolean z4 = !z2;
            boolean z5 = ((57344 & i2) == 16384) | ((i2 & 112) == 32) | ((i2 & 3670016) == 1048576);
            Object objP3 = fetVar.P();
            if (z5 || objP3 == obj) {
                objP3 = new uy0(a4xVar, z, function1, (byte) 2);
                fetVar.o0(objP3);
            }
            mm40Var2 = jm40Var;
            g8x.i(ngvVar, mm40VarL, d9zVar, ch80VarG, qw3Var2, qw3Var, null, z4, null, (Function1) objP3, fetVar, i4, 656);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q3o(mm40Var2, a4xVar, d9zVar, cyberGamesPage, z, z2, function1, i);
        }
    }
}
