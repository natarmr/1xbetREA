package a;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetPlayerZip;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.EventParams;
import org.xplatform.betting.core.zip.model.zip.PlayersDuelZip;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nia0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f23575a = new ugd(-1195055317, false, new qbd((byte) 28));
    public static final ugd b = new ugd(-1301728385, false, new bhd(29));
    public static final ugd c = new ugd(-1398839929, false, new jhd(22));
    public static final ugd d = new ugd(-1351422072, false, new qhd(8));

    public static final void A(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        mm40 mm40Var2;
        jm40 jm40Var;
        boolean z;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1971934470);
        int i2 = i | 6 | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            xar xarVar = (xar) l7m0Var.getValue();
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            long background = s6t0.b().f33626a.getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, background, ljcVar));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            int i3 = (i2 >> 3) & 112;
            N(null, function1, fetVar, i3);
            if (xarVar != null) {
                boolean z3 = xarVar instanceof tar;
                jm40 jm40Var2 = jm40.b;
                if (z3) {
                    fetVar.e0(232290003);
                    wha0.t((tar) xarVar, fetVar, 6);
                    fetVar.r(false);
                } else if (xarVar instanceof uar) {
                    fetVar.e0(1254425782);
                    mdm mdmVar = ((uar) xarVar).f35346a;
                    Object objP = fetVar.P();
                    if (objP == ukd.f35823a) {
                        objP = new rnp((byte) 24);
                        fetVar.o0(objP);
                    }
                    w(mdmVar, (Function1) objP, fetVar, 48);
                    fetVar.r(false);
                } else {
                    if (xarVar instanceof var) {
                        fetVar.e0(1254430588);
                        w(((var) xarVar).f37105a, function1, fetVar, i3);
                        fetVar.r(false);
                    } else if (xarVar instanceof war) {
                        fetVar.e0(232807083);
                        mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackgroundContent(), ljcVar);
                        tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                        int iHashCode2 = Long.hashCode(fetVar.T);
                        bh90 bh90VarM2 = fetVar.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(pcyVar);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, tj30VarC, shdVar);
                        jpm0.o(fetVar, bh90VarM2, shdVar2);
                        vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                        jpm0.o(fetVar, mm40VarC1, shdVar4);
                        jm40Var = jm40Var2;
                        z1x.k(6, fetVar, o7k0.d(jm40Var, 1.0f));
                        z = true;
                        fetVar.r(true);
                        fetVar.r(false);
                    }
                    fetVar.r(z);
                    mm40Var2 = jm40Var;
                }
                jm40Var = jm40Var2;
                z = true;
                fetVar.r(z);
                mm40Var2 = jm40Var;
            }
            throw b1j.f(1254417894, fetVar, false);
        }
        fetVar.X();
        mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kr0(mm40Var2, l7m0Var, function1, i, (byte) 16);
        }
    }

    public static final void B(mm40 mm40Var, boolean z, a4x a4xVar, bdz bdzVar, boolean z2, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        fetVar.g0(974837698);
        int i3 = i | 6 | (fetVar.h(z) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128) | (fetVar.g(bdzVar) ? 2048 : 1024) | (fetVar.h(z2) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536);
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            xcz xczVarB = bdzVar.b("FAVORITES_EVENTS_STATE", fetVar);
            float f = ((Resources) fetVar.k(dy2.c)).getDisplayMetrics().density;
            long jB = ((yez) ((rhv0) fetVar.k(bmd.u))).b();
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                i2 = 32;
                objP = new ujv0(((int) (jB >> 32)) / f, ((int) (jB & 4294967295L)) / f);
                fetVar.o0(objP);
            } else {
                i2 = 32;
            }
            ujv0 ujv0Var = (ujv0) objP;
            Object objP2 = fetVar.P();
            jm40 jm40Var = jm40.b;
            if (objP2 == cl5Var) {
                zcl zclVar = qmk.f28987a;
                objP2 = o7k0.s(jm40Var, dem0.n(ujv0Var));
                fetVar.o0(objP2);
            }
            mm40 mm40Var3 = (mm40) objP2;
            n0q n0qVar = o7k0.c;
            boolean z3 = !z;
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar).c, 0.0f, 2);
            zcl zclVar2 = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z4 = ((i3 & 896) == 256) | ((57344 & i3) == 16384) | ((i3 & 112) == i2) | ((i3 & 458752) == 131072);
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                f160 f160Var = new f160(a4xVar, mm40Var3, z2, z, function1);
                fetVar.o0(f160Var);
                objP3 = f160Var;
            }
            b8k0.f(n0qVar, xczVarB, lh80VarT, false, qw3Var, null, null, z3, null, (Function1) objP3, fetVar, 0, 360);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qxf(mm40Var2, z, a4xVar, bdzVar, z2, function1, i);
        }
    }

    public static final void C(int i, fet fetVar, a4x a4xVar, bdz bdzVar, mm40 mm40Var, Function1 function1, boolean z) {
        mm40 mm40Var2;
        fetVar.g0(475145481);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.g(bdzVar) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            xcz xczVarB = bdzVar.b("FAVORITES_TEAMS_STATE", fetVar);
            boolean z2 = !z;
            n0q n0qVar = o7k0.c;
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar).c, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z3 = ((i2 & 112) == 32) | ((i2 & 57344) == 16384);
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new or0(a4xVar, function1, (byte) 22);
                fetVar.o0(objP);
            }
            b8k0.f(n0qVar, xczVarB, lh80VarT, false, qw3Var, null, null, z2, null, (Function1) objP, fetVar, 0, 360);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e160(mm40Var2, a4xVar, z, bdzVar, function1, i);
        }
    }

    public static final void D(int i, fet fetVar, a4x a4xVar, bdz bdzVar, mm40 mm40Var, Function1 function1) {
        mm40 mm40Var2;
        fetVar.g0(-1106616963);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.g(bdzVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            xcz xczVarB = bdzVar.b("FAVORITES_TRACKED_STATE", fetVar);
            float f = ((Resources) fetVar.k(dy2.c)).getDisplayMetrics().density;
            long jB = ((yez) ((rhv0) fetVar.k(bmd.u))).b();
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new ujv0(((int) (jB >> 32)) / f, ((int) (jB & 4294967295L)) / f);
                fetVar.o0(objP);
            }
            ujv0 ujv0Var = (ujv0) objP;
            Object objP2 = fetVar.P();
            jm40 jm40Var = jm40.b;
            if (objP2 == cl5Var) {
                zcl zclVar = qmk.f28987a;
                objP2 = o7k0.s(jm40Var, dem0.n(ujv0Var));
                fetVar.o0(objP2);
            }
            mm40 mm40Var3 = (mm40) objP2;
            n0q n0qVar = o7k0.c;
            byte b2 = 2;
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar).c, 0.0f, 2);
            zcl zclVar2 = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new g160(a4xVar, mm40Var3, function1, b2);
                fetVar.o0(objP3);
            }
            b8k0.f(n0qVar, xczVarB, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP3, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new h160(mm40Var2, a4xVar, bdzVar, function1, i, (byte) 0);
        }
    }

    public static final void E(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(-1488336193);
        byte b2 = 16;
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            float f = ((Resources) fetVar.k(dy2.c)).getDisplayMetrics().density;
            long jB = ((yez) ((rhv0) fetVar.k(bmd.u))).b();
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                ujv0 ujv0Var = new ujv0(((int) (jB >> 32)) / f, ((int) (jB & 4294967295L)) / f);
                fetVar.o0(ujv0Var);
                objP = ujv0Var;
            }
            ujv0 ujv0Var2 = (ujv0) objP;
            Object objP2 = fetVar.P();
            mm40Var2 = jm40.b;
            if (objP2 == cl5Var) {
                zcl zclVar = qmk.f28987a;
                objP2 = o7k0.s(mm40Var2, dem0.n(ujv0Var2));
                fetVar.o0(objP2);
            }
            mm40 mm40Var3 = (mm40) objP2;
            n0q n0qVar = o7k0.c;
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar).c, 0.0f, 2);
            zcl zclVar2 = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = (i2 & 112) == 32;
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new rw40(a4xVar, mm40Var3, b2);
                fetVar.o0(objP3);
            }
            b8k0.f(n0qVar, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP3, fetVar, 12582912, 362);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var2, a4xVar, i, (byte) 15);
        }
    }

    public static final void F(int i, fet fetVar, a4x a4xVar, bdz bdzVar, mm40 mm40Var, Function1 function1, boolean z) {
        mm40 mm40Var2;
        fetVar.g0(806377115);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.g(bdzVar) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            xcz xczVarB = bdzVar.b("FAVORITES_VIEWED_STATE", fetVar);
            float f = ((Resources) fetVar.k(dy2.c)).getDisplayMetrics().density;
            long jB = ((yez) ((rhv0) fetVar.k(bmd.u))).b();
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new ujv0(((int) (jB >> 32)) / f, ((int) (jB & 4294967295L)) / f);
                fetVar.o0(objP);
            }
            ujv0 ujv0Var = (ujv0) objP;
            Object objP2 = fetVar.P();
            jm40 jm40Var = jm40.b;
            if (objP2 == cl5Var) {
                zcl zclVar = qmk.f28987a;
                objP2 = o7k0.s(jm40Var, dem0.n(ujv0Var));
                fetVar.o0(objP2);
            }
            mm40 mm40Var3 = (mm40) objP2;
            n0q n0qVar = o7k0.c;
            boolean z2 = !z;
            lh80 lh80VarT = s5x0.t(xfn.a(fetVar).c, 0.0f, 2);
            zcl zclVar2 = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z3 = ((i2 & 112) == 32) | ((i2 & 57344) == 16384);
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new g160(a4xVar, mm40Var3, function1, (byte) 0);
                fetVar.o0(objP3);
            }
            b8k0.f(n0qVar, xczVarB, lh80VarT, false, qw3Var, null, null, z2, null, (Function1) objP3, fetVar, 0, 360);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e160(mm40Var2, a4xVar, bdzVar, z, function1, i);
        }
    }

    public static final void G(mm40 mm40Var, String str, n0x n0xVar, boolean z, Function0 function0, fet fetVar, int i) {
        long backgroundContent;
        long secondary;
        long jC;
        fet fetVar2 = fetVar;
        fetVar2.g0(-753260281);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(n0xVar) ? 256 : 128) | (fetVar2.h(z) ? 2048 : 1024) | (fetVar2.i(function0) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            if (z) {
                backgroundContent = cs0.e(fetVar2, 1966352110, fetVar2, false);
            } else {
                fetVar2.e0(1966353112);
                backgroundContent = afn0.m(fetVar2).getBackgroundContent();
                fetVar2.r(false);
            }
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarF = phu0.F(i120.Q(mm40Var, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), null, (d6x) fetVar2.k(a6x.f338a), false, null, function0, fetVar, (i2 << 3) & 458752, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarF);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 28.0f);
            mz3 mz3VarT = lv00.T(n0xVar, new m0x(R.drawable.ic_glyph_category_new, null, 6), null, null, fetVar, (i2 >> 6) & 14, 12);
            if (z) {
                fetVar.e0(-687196990);
                secondary = afn0.p(fetVar).m123getWhite0d7_KjU();
            } else {
                fetVar.e0(-687196058);
                secondary = afn0.m(fetVar).getSecondary();
            }
            fetVar.r(false);
            j0x.b(mz3VarT, null, mm40VarN, null, gqw0.A, 0.0f, new m78(secondary, 5), fetVar, 24624, 40);
            mm40 mm40VarE = o7k0.e(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 24.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            mm40 mm40VarL = s5x0.L(jm40Var, 4.0f, 0.0f, 2);
            if (z) {
                fetVar.e0(-765346072);
                jC = afn0.p(fetVar).m123getWhite0d7_KjU();
                fetVar.r(false);
            } else {
                jC = rz4.c(fetVar, -765345138, fetVar, false);
            }
            afn0.v(fetVar).getClass();
            v8q0.a(str, mm40VarL, jC, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.e(), fetVar, (i2 >> 3) & 14, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hp0(mm40Var, str, n0xVar, z, function0, i, (byte) 0);
        }
    }

    public static final void H(mm40 mm40Var, String str, m0x m0xVar, boolean z, Function0 function0, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(238245807);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(m0xVar) ? 256 : 128) | (fetVar2.h(z) ? 2048 : 1024) | (fetVar2.i(function0) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarF = phu0.F(i120.Q(mm40Var, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), null, (d6x) fetVar2.k(a6x.f338a), false, null, function0, fetVar, (i2 << 3) & 458752, 13);
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarF);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
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
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            j0x.b(lv00.T(m0xVar, new m0x(R.drawable.ic_glyph_filter_line_inactive, null, 6), null, null, fetVar, (i2 >> 6) & 14, 12), null, o7k0.n(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 28.0f), null, gqw0.A, 0.0f, new m78(((ThemeColors) fetVar.k(zfnVar)).getSecondary(), 5), fetVar, 24624, 40);
            mm40 mm40VarE = o7k0.e(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 24.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            long textPrimary = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, null, textPrimary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, (i2 >> 3) & 14, 24960, 109562);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            if (z) {
                fetVar2.e0(-1489555730);
                thb.f(ffb0.Q(jr8.f16991a.b(jm40Var, gqw0.c), 0.0f, 0.0f), new lf5(2, new y3d(((ThemeColors) fetVar2.k(zfnVar)).getBackground())), fetVar2, 0, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1489279923);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0((byte) 0, i, (wdr) function0, (Object) mm40Var, (Object) str, (Object) m0xVar, z);
        }
    }

    public static final void I(int i, long j, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-2024223216);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.f(j) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            dww.c(a8k0.F(R.drawable.ic_glyph_indeterminate_ios, 0, fetVar), null, o7k0.n(mm40Var, 24.0f), j, fetVar, 56 | ((i2 << 6) & 7168), 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ly2(mm40Var, j, i, (byte) 7);
        }
    }

    public static final void J(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1569171139);
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            t(l7m0Var, function1, fetVar, i2 & 126);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i, (byte) 13);
        }
    }

    public static final void K(hh80 hh80Var, l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        l7m0 l7m0Var2;
        fetVar.g0(1262513207);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(hh80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i2 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            kqz kqzVar = (kqz) l7m0Var2.getValue();
            if (kqzVar.c) {
                fetVar.e0(2094421119);
                L(0, fetVar);
            } else {
                fetVar.e0(502552939);
            }
            fetVar.r(false);
            mm40 mm40VarL = s5x0.L(s5x0.N(o7k0.d(jm40.b, 1.0f), 0.0f, hh80Var.d(), 0.0f, 0.0f, 13), xfn.a(fetVar).d, 0.0f, 2);
            boolean zG = ((i2 & 14) == 4) | fetVar.g(kqzVar) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new k9v((Object) kqzVar, (Object) hh80Var, (Object) function1, (byte) 17);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarL, null, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 510);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new soz(hh80Var, l7m0Var, function1, i, (byte) 2);
        }
    }

    public static final void L(int i, fet fetVar) {
        fetVar.g0(-112138541);
        if (fetVar.U(i & 1, i != 0)) {
            mm40 mm40VarH = k7n0.H(o7k0.c, 2.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new pcy((byte) 25);
                fetVar.o0(objP2);
            }
            mm40 mm40VarQ = i120.Q(y860.W(mm40VarH, gy40Var, null, false, null, (Function0) objP2, 28), ((StaticColors) fetVar.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            kpb.j(jm40.b, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), 3), fetVar, 6, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hvy(i, (byte) 22);
        }
    }

    public static final void M(int i, fet fetVar) {
        fetVar.g0(1916380322);
        if (fetVar.U(i & 1, i != 0)) {
            mm40 mm40VarH = k7n0.H(o7k0.c, 2.0f);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new t07((byte) 18);
                fetVar.o0(objP2);
            }
            mm40 mm40VarQ = i120.Q(y860.W(mm40VarH, gy40Var, null, false, null, (Function0) objP2, 28), ((StaticColors) fetVar.k(m8m0.f21378a)).m109getOverlayBackground400d7_KjU(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            kpb.j(null, new dkm((ycl) null, new y3d(((ThemeColors) fetVar.k(zaq0.b)).getPrimary()), 3), fetVar, 0, 1);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i87(i, (byte) 7);
        }
    }

    public static final void N(mm40 mm40Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(-127759781);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            String strW = rsm0.w(R.string.full_description, 0, fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                imm immVar = new imm(new ilm(secondary), new plm(strW, ha50.TWO_LINES, secondary, fa50.f9191a), fmm.f9790a, backgroundContent, true, null);
                fetVar.o0(immVar);
                objP = immVar;
            }
            imm immVar2 = (imm) objP;
            boolean z = (i2 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new z9q(function1, (byte) 12);
                fetVar.o0(objP2);
            }
            int i3 = (i2 & 14) | 48;
            mm40Var2 = jm40.b;
            hlm.c(mm40Var2, immVar2, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar, i3, 0, 4084);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sx(mm40Var2, function1, i, (byte) 3);
        }
    }

    public static final void O(mm40 mm40Var, f260 f260Var, l7m0 l7m0Var, bdz bdzVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        bdz bdzVar2;
        Function1 function2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-839203966);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(f260Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(l7m0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            bdzVar2 = bdzVar;
            i2 |= fetVar2.g(bdzVar2) ? 2048 : 1024;
        } else {
            bdzVar2 = bdzVar;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function1) ? 16384 : 8192;
        }
        if (!fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            function2 = function1;
            fetVar2.X();
        } else if (f260Var instanceof d260) {
            fetVar2.e0(279602676);
            d260 d260Var = (d260) f260Var;
            z(mm40Var2, d260Var.f5342a, l7m0Var, bdzVar2, d260Var.b, function1, fetVar2, (i2 & 8078) | ((i2 << 3) & 458752));
            function2 = function1;
            fetVar2.r(false);
        } else {
            function2 = function1;
            if (!(f260Var instanceof e260)) {
                throw b1j.f(978848786, fetVar2, false);
            }
            fetVar2.e0(279978365);
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar2, false), 7);
            mdm mdmVar = ((e260) f260Var).f7070a;
            boolean z = (i2 & 57344) == 16384;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new xv50(function2, (byte) 9);
                fetVar2.o0(objP);
            }
            jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            fetVar2 = fetVar;
            fetVar2.r(false);
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) mm40Var, (Object) f260Var, (Object) l7m0Var, (Object) bdzVar, (Object) function2, i, (byte) 15);
        }
    }

    public static final void P(mm40 mm40Var, l7m0 l7m0Var, bdz bdzVar, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        bdzVar.getClass();
        function1.getClass();
        fetVar.g0(-153707759);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.g(bdzVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new x000(l7m0Var, (byte) 22);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            int i3 = i2 & 7168;
            boolean z2 = i3 == 2048;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new xv50(function1, (byte) 7);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z3 = i3 == 2048;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new xv50(function1, (byte) 8);
                fetVar.o0(objP3);
            }
            v3c.z(function0, (Function0) objP3, null, fetVar, 0, 4);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            xhm xhmVar = ((g260) l7m0Var.getValue()).b;
            boolean z4 = i3 == 2048;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new i160(function1, (byte) 0);
                fetVar.o0(objP4);
            }
            thb.g(xhmVar, null, (Function1) objP4, fetVar, 5);
            O(i120.Q(n0qVar, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n), ((g260) l7m0Var.getValue()).c, l7m0VarY, bdzVar, function1, fetVar, (i2 << 3) & 64512);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u2p(mm40Var, l7m0Var, bdzVar, function1, i, (byte) 1);
        }
    }

    public static final void Q(mm40 mm40Var, xcz xczVar, l7m0 l7m0Var, Function2 function2, Function2 function3, fet fetVar, int i) {
        int i2;
        fetVar.g0(344370178);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function3) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            ijr0 ijr0Var = (ijr0) l7m0Var.getValue();
            if (ijr0Var instanceof hjr0) {
                fetVar.e0(227272332);
                R(mm40Var.e(o7k0.c), xczVar, ((hjr0) ijr0Var).f13174a, function2, function3, fetVar, i2 & 64624);
                fetVar.r(false);
            } else if (ijr0Var instanceof djr0) {
                fetVar.e0(227284308);
                bfb.u(null, ((djr0) ijr0Var).f6201a, fetVar, 0);
                fetVar.r(false);
            } else if (ijr0Var instanceof ejr0) {
                fetVar.e0(227288600);
                ibm0.c(null, ((ejr0) ijr0Var).f7922a, fetVar, 0);
                fetVar.r(false);
            } else if (Intrinsics.d(ijr0Var, gjr0.f11415a)) {
                fetVar.e0(227292567);
                v2n0.g(0, 1, fetVar, null);
                fetVar.r(false);
            } else {
                if (!Intrinsics.d(ijr0Var, fjr0.f9657a)) {
                    throw b1j.f(227268899, fetVar, false);
                }
                fetVar.e0(-1543775330);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) mm40Var, (Object) xczVar, (Object) l7m0Var, (Object) function2, (Object) function3, i, (byte) 28);
        }
    }

    public static final void R(mm40 mm40Var, xcz xczVar, a4x a4xVar, Function2 function2, Function2 function3, fet fetVar, int i) {
        int i2;
        xcz xczVar2;
        fetVar.g0(868879574);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            xczVar2 = xczVar;
            i2 |= fetVar.g(xczVar2) ? 32 : 16;
        } else {
            xczVar2 = xczVar;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(a4xVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function3) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarS = o050.S(mm40Var.e(o7k0.c));
            float f = xfn.a(fetVar).d;
            float f2 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(f, 0.0f, f2, 76.0f, 2);
            boolean z = ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new je80(a4xVar, function2, function3, (byte) 1);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarS, xczVar2, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, i2 & 112, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ke80(mm40Var, xczVar, a4xVar, function2, function3, i, (byte) 1);
        }
    }

    public static final void S(int i, fet fetVar, xcz xczVar, mm40 mm40Var, List list, Function1 function1) {
        mm40 mm40Var2;
        list.getClass();
        xczVar.getClass();
        function1.getClass();
        fetVar.g0(107766476);
        int i2 = (fetVar.g(list) ? 32 : 16) | i | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40Var2 = mm40Var;
            mm40 mm40VarS = k7x.S(o2e.e0(mm40Var2.e(o7k0.c), "XGAMES_POPULAR_LAZY_COLUMN"), xczVar);
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 32.0f, 7), fetVar);
            boolean z = ((i2 & 112) == 32) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new rb(list, function1, (byte) 11);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarS, xczVar, ch80VarG, null, null, null, false, null, (Function1) objP, fetVar, (i2 >> 3) & 112, Response.SERVER_TIMEOUT);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sb(mm40Var2, list, xczVar, function1, i);
        }
    }

    public static final void T(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-2020884021);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 24.0f);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, i120.Q(mm40VarN, backgroundContent, ugg0Var));
            mm40 mm40VarJ = s5x0.J(i120.Q(o7k0.n(jm40Var, 20.0f), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), ugg0Var), 2.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarJ);
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
            dww.c(a8k0.F(R.drawable.ic_glyph_checkmark, 0, fetVar), null, null, ((ThemeColors) fetVar.k(zfnVar)).getPrimaryForeground(), fetVar, 56, 4);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i, (byte) 7);
        }
    }

    public static final void U(mm40 mm40Var, fbm0 fbm0Var, jbm0 jbm0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fbm0Var.getClass();
        jbm0Var.getClass();
        fetVar2.g0(-1461621077);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(fbm0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 88.0f);
            long jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, jM121getTransparent0d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            n0q n0qVar = o7k0.c;
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, n0qVar);
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
            zhg0 zhg0Var = zhg0.f44392a;
            jm40 jm40Var = jm40.b;
            oja0.N(s5x0.N(i120.Q(zhg0Var.a(1.0f, jm40Var, true), ((y3d) jbm0Var.a(fetVar).getValue()).f41946a, vgg0.c(12.0f, 0.0f, 0.0f, 12.0f, 6)), 16.0f, 0.0f, 0.0f, 0.0f, 14), 5, fbm0Var.f9267a, jbm0Var, fetVar2, 3072);
            fetVar2 = fetVar;
            oja0.N(zhg0Var.a(1.0f, jm40Var, true), 3, fbm0Var.b, jbm0Var, fetVar2, 3072);
            oja0.N(s5x0.N(i120.Q(zhg0Var.a(1.0f, jm40Var, true), ((y3d) jbm0Var.a(fetVar).getValue()).f41946a, vgg0.c(0.0f, 12.0f, 12.0f, 0.0f, 9)), 0.0f, 0.0f, 16.0f, 0.0f, 11), 6, fbm0Var.c, jbm0Var, fetVar2, 3072);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var, fbm0Var, jbm0Var, i, (byte) 28);
        }
    }

    public static final void V(njr0 njr0Var, mm40 mm40Var, fet fetVar, int i) {
        mm40 mm40Var2;
        l7m0 l7m0Var;
        int i2;
        l7m0 l7m0Var2;
        njr0Var.getClass();
        fetVar.g0(-1089012246);
        byte b2 = 2;
        byte b3 = 4;
        int i3 = (fetVar.i(njr0Var) ? 4 : 2) | i | 48;
        byte b4 = 0;
        byte b5 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            yje yjeVar = null;
            pz40 pz40VarQ = gkb.Q(njr0Var.G, null, fetVar, 0, 7);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new g7o0(pz40VarQ, (byte) 28));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var3 = (l7m0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = jgk0.b(new g7o0(l7m0Var3, (byte) 29));
                fetVar.o0(objP2);
            }
            l7m0 l7m0Var4 = (l7m0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = jgk0.b(new ojr0(pz40VarQ, b4));
                fetVar.o0(objP3);
            }
            l7m0 l7m0Var5 = (l7m0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = jgk0.b(new ojr0(l7m0Var3, b5));
                fetVar.o0(objP4);
            }
            l7m0 l7m0Var6 = (l7m0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = jgk0.b(new ojr0(l7m0Var5, b2));
                fetVar.o0(objP5);
            }
            l7m0 l7m0Var7 = (l7m0) objP5;
            Unit unit = Unit.f46060a;
            int i4 = i3 & 14;
            boolean z = i4 == 4 || fetVar.i(njr0Var);
            Object objP6 = fetVar.P();
            if (z || objP6 == cl5Var) {
                objP6 = new ljr0(njr0Var, yjeVar, b3);
                fetVar.o0(objP6);
            }
            m0x0.t(fetVar, unit, (Function2) objP6);
            mm40 mm40VarE0 = o2e.e0(o7k0.c, "TOTO_BET_COMPOSE_SCREEN");
            String str = ((jjr0) l7m0Var3.getValue()).f16632a;
            boolean z2 = ((cjr0) pz40VarQ.getValue()).c;
            boolean z3 = i4 == 4 || fetVar.i(njr0Var);
            Object objP7 = fetVar.P();
            if (z3 || objP7 == cl5Var) {
                l7m0Var = l7m0Var6;
                i2 = i4;
                l7m0Var2 = l7m0Var5;
                cym0 cym0Var = new cym0(0, njr0Var, njr0.class, "onScrollToTopConsumed", "onScrollToTopConsumed()V", 0, (byte) 20);
                fetVar.o0(cym0Var);
                objP7 = cym0Var;
            } else {
                i2 = i4;
                l7m0Var2 = l7m0Var5;
                l7m0Var = l7m0Var6;
            }
            jhy jhyVar = (jhy) objP7;
            boolean z4 = i2 == 4 || fetVar.i(njr0Var);
            Object objP8 = fetVar.P();
            if (z4 || objP8 == cl5Var) {
                objP8 = new cym0(0, njr0Var, njr0.class, "onBackgroundImageLoadError", "onBackgroundImageLoadError()V", 0, (byte) 21);
                fetVar.o0(objP8);
            }
            xia0.Y(mm40VarE0, str, z2, false, (Function0) jhyVar, (Function0) ((jhy) objP8), u1c.M(-1413610834, new pjr0(l7m0Var7, (njr0) r2), fetVar), u1c.M(-1548193523, new pjr0((njr0) r2, l7m0Var4), fetVar), u1c.M(-1682776212, new qjr0(l7m0Var, (byte) 0), fetVar), u1c.M(328703934, new d2s(l7m0Var2, r2, (byte) 25), fetVar), fetVar, 920128512, 0);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a6p0((byte) 25, i, mm40Var2, (Object) njr0Var);
        }
    }

    public static final void W(zhr0 zhr0Var, Function2 function2, Function2 function3, mm40 mm40Var, fet fetVar, int i) {
        Function2 function4;
        fet fetVar2;
        Function2 function5;
        mm40 mm40Var2;
        fetVar.g0(1254838778);
        int i2 = (fetVar.g(zhr0Var) ? 4 : 2) | i | (fetVar.i(function2) ? 32 : 16) | (fetVar.i(function3) ? 256 : 128) | 3072;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (zhr0Var != null) {
                boolean z = zhr0Var instanceof ecb;
                jm40 jm40Var = jm40.b;
                if (z) {
                    fetVar.e0(-985735303);
                    hxm0.j((ecb) zhr0Var, jm40Var, fetVar, (i2 & 14) | 48);
                    fetVar.r(false);
                    function4 = function3;
                    fetVar2 = fetVar;
                    function5 = function2;
                } else if (zhr0Var instanceof ae80) {
                    fetVar.e0(-985729623);
                    function4 = function3;
                    fetVar2 = fetVar;
                    q0x.q((ae80) zhr0Var, function2, function4, jm40Var, fetVar2, i2 & 8190);
                    function5 = function2;
                    fetVar2.r(false);
                }
                mm40Var2 = jm40Var;
            }
            throw b1j.f(-985737398, fetVar, false);
        }
        function4 = function3;
        fetVar2 = fetVar;
        function5 = function2;
        fetVar2.X();
        mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0(zhr0Var, function5, function4, mm40Var2, i);
        }
    }

    public static final void X(int i, a4x a4xVar, zhr0 zhr0Var, fet fetVar, int i2) {
        int i3;
        fetVar.g0(817613746);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(zhr0Var) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            if (i == 0 || (i != 0 && (a4xVar.get(i - 1) instanceof ecb) && (zhr0Var instanceof ae80))) {
                fetVar.e0(-252194717);
                zcl zclVar = qmk.f28987a;
                rz4.t(jm40Var, 0.0f, fetVar, false);
            } else if (i != 0 && (a4xVar.get(i - 1) instanceof ae80) && (zhr0Var instanceof ecb)) {
                fetVar.e0(-252188381);
                zcl zclVar2 = qmk.f28987a;
                rz4.t(jm40Var, 4.0f, fetVar, false);
            } else {
                fetVar.e0(-252186269);
                zcl zclVar3 = qmk.f28987a;
                rz4.t(jm40Var, 4.0f, fetVar, false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i6n(i, a4xVar, zhr0Var, i2);
        }
    }

    public static final void Y(String str, String str2, boolean z, boolean z2, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        long secondary10;
        long secondary20;
        long secondary11;
        long secondary21;
        fetVar.g0(1887601260);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            if (z) {
                fetVar.e0(-1066515348);
                secondary10 = afn0.m(fetVar).getCommerceTint();
                fetVar.r(false);
            } else {
                fetVar.e0(-1066432051);
                secondary10 = afn0.m(fetVar).getSecondary10();
                fetVar.r(false);
            }
            mm40 mm40VarK = s5x0.K(y860.W(i120.Q(x7zVar, secondary10, vgg0.a(12.0f)), null, null, z, null, function0, 24), 20.0f, 8.0f);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_deposit_account, 0, fetVar);
            if (z) {
                fetVar.e0(-1142760784);
                secondary20 = afn0.m(fetVar).getCommerce();
            } else {
                fetVar.e0(-1142759757);
                secondary20 = afn0.m(fetVar).getSecondary20();
            }
            fetVar.r(false);
            b(secondary20, str, pm80VarF, mm40VarK, fetVar, ((i3 << 3) & 112) | 512);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            if (z2) {
                fetVar.e0(-1065592385);
                secondary11 = afn0.m(fetVar).getSecondaryButtonBackground();
                fetVar.r(false);
            } else {
                fetVar.e0(-1065496595);
                secondary11 = afn0.m(fetVar).getSecondary10();
                fetVar.r(false);
            }
            mm40 mm40VarK2 = s5x0.K(y860.W(i120.Q(x7zVar2, secondary11, vgg0.a(12.0f)), null, null, z2, null, function1, 24), 20.0f, 8.0f);
            pm80 pm80VarF2 = a8k0.F(R.drawable.ic_glyph_withdraw_account, 0, fetVar);
            if (z2) {
                secondary21 = cs0.e(fetVar, -1142730481, fetVar, false);
            } else {
                fetVar.e0(-1142729485);
                secondary21 = afn0.m(fetVar).getSecondary20();
                fetVar.r(false);
            }
            fetVar2 = fetVar;
            b(secondary21, str2, pm80VarF2, mm40VarK2, fetVar2, (i3 & 112) | 512);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ag(str, str2, z, z2, function0, function1, i);
        }
    }

    public static final void Z(String str, String str2, String str3, String str4, Function0 function0, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-759907116);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function0) ? 16384 : 8192;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), vgg0.f37379a);
            zcl zclVar = qmk.f28987a;
            dww.c(a8k0.F(R.drawable.ic_glyph_wallet_alt, 0, fetVar2), null, o7k0.n(s5x0.J(mm40VarQ, 10.0f), 20.0f), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar2, 56, 0);
            int i4 = i3 << 3;
            fetVar2 = fetVar;
            a(str4, str, str2, str3, function0, fetVar2, ((i3 >> 9) & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | (57344 & i3));
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bg(str, str2, str3, str4, function0, i, (byte) 0);
        }
    }

    public static final void a(String str, String str2, String str3, String str4, Function0 function0, fet fetVar, int i) {
        int i2;
        Object obj;
        fetVar.g0(1007463779);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            obj = function0;
            i2 |= fetVar.i(obj) ? 16384 : 8192;
        } else {
            obj = function0;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new b5((byte) 6);
                fetVar.o0(objP);
            }
            Function1 function1 = (Function1) objP;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((i2 & 57344) == 16384);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                dg dgVar = new dg(str, str2, str3, str4, obj, (byte) 0);
                fetVar.o0(dgVar);
                objP2 = dgVar;
            }
            dwi0.b(function1, mm40VarN, (Function1) objP2, fetVar, 6, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bg(str, str2, str3, str4, function0, i, (byte) 1);
        }
    }

    public static final void a0(ywv0 ywv0Var, qwv0 qwv0Var, Function1 function1, xdr xdrVar, xdr xdrVar2, ugd ugdVar, fet fetVar, int i) {
        int i2;
        duv0 duv0Var;
        Object obj;
        int i3;
        ywv0Var.getClass();
        function1.getClass();
        fetVar.g0(1130957443);
        int i4 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i4 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ywv0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(qwv0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? fetVar.g(function1) : fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(xdrVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(xdrVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(ugdVar) ? 8388608 : 4194304;
        }
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            duv0 duv0Var2 = ywv0Var.f43392a;
            glt0 glt0Var = ywv0Var.d;
            h0q0 h0q0Var = ywv0Var.b;
            androidx.compose.runtime.d dVar = dy2.f;
            View view = (View) fetVar.k(dVar);
            boolean zG = fetVar.g(view);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (zG || objP == obj2) {
                view.getClass();
                ViewParent parent = view.getParent();
                objP = parent instanceof vjk ? ((vjk) parent).getWindow() : etm0.l(view);
                fetVar.o0(objP);
            }
            Window window = (Window) objP;
            View view2 = (View) fetVar.k(dVar);
            boolean zG2 = fetVar.g(view2);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj2) {
                objP2 = androidx.compose.runtime.e.e(new tly(0.0f, 0.0f, false));
                fetVar.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            boolean zI = fetVar.i(view2) | fetVar.g(pz40Var);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj2) {
                objP3 = new rly(view2, pz40Var, (byte) 3);
                fetVar.o0(objP3);
            }
            m0x0.o(view2, (Function1) objP3, fetVar);
            Object obj3 = (pkk0) fetVar.k(bmd.q);
            Object obj4 = (wpq) fetVar.k(bmd.i);
            Object objP4 = fetVar.P();
            if (objP4 == obj2) {
                qkx qkxVar = (qkx) ((hgk0) duv0Var2.b).getValue();
                long j = qkxVar.f28908a;
                objP4 = androidx.compose.runtime.e.e(qkxVar);
                fetVar.o0(objP4);
            }
            pz40 pz40Var2 = (pz40) objP4;
            long j2 = ((qkx) pz40Var2.getValue()).f28908a;
            Object objF = androidx.compose.runtime.e.f(function1, fetVar);
            Object objP5 = fetVar.P();
            if (objP5 == obj2) {
                objP5 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP5);
            }
            Object obj5 = (ttv0) ((pz40) objP5).getValue();
            int iD = duv0Var2.d();
            int iC = duv0Var2.c();
            int i5 = (int) (j2 & 4294967295L);
            boolean z = xdrVar2 != null;
            Object objA = duv0Var2.a();
            int i6 = i2 >> 9;
            objA.getClass();
            byte b2 = 6;
            boolean zG3 = ((((i6 & 14) ^ 6) > 4 && fetVar.h(false)) || (i6 & 6) == 4) | fetVar.g(obj5) | fetVar.e(iD) | fetVar.e(iC) | fetVar.e(i5) | fetVar.h(z) | fetVar.g(objA);
            Object objP6 = fetVar.P();
            if (zG3 || objP6 == obj2) {
                int i7 = !z ? iC : 0;
                objP6 = new usv0(i5, iD, 0, iC - i7, i7);
                fetVar.o0(objP6);
            }
            usv0 usv0Var = (usv0) objP6;
            int i8 = (int) (j2 >> 32);
            int i9 = usv0Var.f36230a;
            int i10 = usv0Var.b;
            int i11 = usv0Var.c;
            int i12 = usv0Var.d;
            int i13 = usv0Var.e;
            cxv0 cxv0Var = h0q0Var.p().f3395a;
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            boolean zG4 = fetVar.g(w6kVar) | fetVar.e(i8) | fetVar.e(i9) | fetVar.e(i10) | fetVar.e(i11) | fetVar.e(i12) | fetVar.e(i13) | fetVar.d(600.0f);
            Object objP7 = fetVar.P();
            if (zG4 || objP7 == obj2) {
                objP7 = new ftv0(new nuv0(i9, i10, i11, i12, i13), ycl.a(w6kVar.r0(i8), 600.0f) >= 0);
                fetVar.o0(objP7);
            }
            ftv0 ftv0Var = (ftv0) objP7;
            int i14 = i2 & 112;
            boolean z2 = i14 == 32;
            Object objP8 = fetVar.P();
            if (z2 || objP8 == obj2) {
                objP8 = jgk0.b(new td60(ywv0Var, (byte) 7));
                fetVar.o0(objP8);
            }
            l7m0 l7m0Var = (l7m0) objP8;
            l7m0 l7m0VarB = duv0Var2.b();
            int i15 = i2 & 896;
            boolean z3 = (i14 == 32) | (i15 == 256);
            Object objP9 = fetVar.P();
            int i16 = i2;
            byte b3 = 8;
            if (z3 || objP9 == obj2) {
                objP9 = new ugu0(ywv0Var, qwv0Var, b3);
                fetVar.o0(objP9);
            }
            int i17 = (i16 >> 3) & 14;
            x8x.e(ywv0Var, l7m0VarB, (Function0) objP9, fetVar, i17);
            fbc.C(ywv0Var, fetVar, i17);
            lvm0.a(window, glt0Var.f(), fetVar, 0);
            boolean zF = glt0Var.f();
            boolean z4 = i14 == 32;
            Object objP10 = fetVar.P();
            if (z4 || objP10 == obj2) {
                objP10 = new td60(ywv0Var, b3);
                fetVar.o0(objP10);
            }
            knx.i(zF, (Function0) objP10, fetVar, 0, 0);
            boolean z5 = i14 == 32;
            Object objP11 = fetVar.P();
            if (z5 || objP11 == obj2) {
                objP11 = new xn2(ywv0Var, (yje) null, b2);
                fetVar.o0(objP11);
            }
            m2x.e(0, fetVar, (Function2) objP11, zF);
            fetVar.e0(-1661666191);
            Integer numValueOf = Integer.valueOf(usv0Var.f36230a);
            Integer numValueOf2 = Integer.valueOf(usv0Var.b);
            boolean z6 = i14 == 32;
            Object objP12 = fetVar.P();
            if (z6 || objP12 == obj2) {
                objP12 = new ud60(ywv0Var, null, (byte) 4);
                fetVar.o0(objP12);
            }
            m0x0.u(ywv0Var, numValueOf, numValueOf2, (Function2) objP12, fetVar);
            fetVar.r(false);
            boolean zG5 = (i14 == 32) | fetVar.g(duv0Var2) | fetVar.g(objF) | (i15 == 256) | fetVar.g(pz40Var) | fetVar.g(obj3) | fetVar.i(obj4);
            Object objP13 = fetVar.P();
            if (zG5 || objP13 == obj2) {
                duv0Var = duv0Var2;
                obj = obj2;
                i3 = 6;
                Object pg1Var = new pg1((Object) ywv0Var, (Object) duv0Var, objF, (Object) pz40Var, obj3, obj4, (Object) qwv0Var, (byte) 17);
                fetVar.o0(pg1Var);
                objP13 = pg1Var;
            } else {
                duv0Var = duv0Var2;
                obj = obj2;
                i3 = 6;
            }
            m0x0.D((Function0) objP13, fetVar);
            boolean z7 = i14 == 32;
            Object objP14 = fetVar.P();
            if (z7 || objP14 == obj) {
                objP14 = new ud60(ywv0Var, null, (byte) 5);
                fetVar.o0(objP14);
            }
            m0x0.t(fetVar, ywv0Var, (Function2) objP14);
            boolean zG6 = fetVar.g(l7m0Var) | (i14 == 32);
            Object objP15 = fetVar.P();
            if (zG6 || objP15 == obj) {
                objP15 = new dvv0(ywv0Var, l7m0Var);
                fetVar.o0(objP15);
            }
            dvv0 dvv0Var = (dvv0) objP15;
            ugd ugdVarM = u1c.M(441017324, new uuv0(ywv0Var, duv0Var, usv0Var, xdrVar, xdrVar2, qwv0Var, ugdVar, (byte) 0), fetVar);
            fetVar.e0(223570568);
            mm40 mm40VarE = o7k0.c.e(jm40Var);
            fetVar.e0(2027169503);
            Object objP16 = fetVar.P();
            if (objP16 == obj) {
                objP16 = new dbo0(pz40Var2, (byte) 11);
                fetVar.o0(objP16);
            }
            mm40 mm40VarY = fre0.Y(mm40VarE, (Function1) objP16);
            fetVar.r(false);
            fetVar.r(false);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarY);
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
            lsv0 lsv0Var = h0q0Var.p().c;
            long jM109getOverlayBackground400d7_KjU = h0q0Var.p().d;
            if (jM109getOverlayBackground400d7_KjU == 16) {
                pz40 pz40Var3 = s6t0.f31722a;
                jM109getOverlayBackground400d7_KjU = StaticColors.INSTANCE.m109getOverlayBackground400d7_KjU();
            }
            boolean z8 = i14 == 32;
            Object objP17 = fetVar.P();
            if (z8 || objP17 == obj) {
                objP17 = new td60(ywv0Var, (byte) 9);
                fetVar.o0(objP17);
            }
            cvm0.f(ywv0Var, lsv0Var, jM109getOverlayBackground400d7_KjU, (Function0) objP17, fetVar, (i16 & 7168) | i3 | i14);
            cww.c(u1c.M(-664915448, new apd0(ftv0Var, j2, ywv0Var, l7m0Var, dvv0Var, ugdVarM), fetVar), fetVar, i3);
            fetVar.e0(-152552871);
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fer0(ywv0Var, qwv0Var, function1, xdrVar, xdrVar2, ugdVar, i);
        }
    }

    public static final void b(long j, String str, pm80 pm80Var, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-529227476);
        if ((i & 6) == 0) {
            i2 = (fetVar.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(pm80Var) : fetVar.i(pm80Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(mm40Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            dww.c(pm80Var, null, s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 4.0f, 7), j, fetVar, ((i3 >> 6) & 14) | 56 | ((i3 << 9) & 7168), 0);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, null, j, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, ((i3 >> 3) & 14) | ((i3 << 6) & 896), 24960, 110586);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg(j, str, pm80Var, mm40Var, i);
        }
    }

    public static byte[] b0(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                hny.o("exceeded size limit");
                return null;
            }
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static final void c(Function0 function0, Function0 function1, Function0 function2, mwi0 mwi0Var, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        Function0 function3;
        fet fetVar2 = fetVar;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        mwi0Var.getClass();
        fetVar2.g0(-2086658737);
        if ((i & 6) == 0) {
            i2 = (fetVar2.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function3 = function1;
            i2 |= fetVar2.i(function3) ? 32 : 16;
        } else {
            function3 = function1;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(mwi0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g(mm40Var) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(mm40VarD, 12.0f, 8.0f, 12.0f, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarM);
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
            Z(mwi0Var.f, mwi0Var.g, mwi0Var.h, mwi0Var.f22505a, function2, fetVar2, (i2 << 6) & 57344);
            Y(mwi0Var.b, mwi0Var.c, mwi0Var.d, mwi0Var.e, function0, function3, fetVar, (i2 << 12) & 516096);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf((Object) function0, (Object) function1, (Object) function2, (Object) mwi0Var, (Object) mm40Var, i, (byte) 0);
        }
    }

    public static final void c0(int i, TextView textView) {
        if (i <= 0) {
            textView.setVisibility(8);
        } else {
            textView.setText(String.valueOf(i));
            textView.setVisibility(0);
        }
    }

    public static final void d(int i, pp0 pp0Var, fet fetVar, mm40 mm40Var, lh80 lh80Var, Function0 function0, Function1 function1) {
        lh80 lh80Var2;
        mm40 mm40Var2;
        boolean z;
        fet fetVar2 = fetVar;
        yx7 yx7Var = gqw0.k;
        pp0Var.getClass();
        function1.getClass();
        fetVar2.g0(-1263832283);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(pp0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(lh80Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function0) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            k6z k6zVar = (k6z) fetVar2.k(bmd.n);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP);
            }
            vne vneVar = (vne) objP;
            xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 64.0f), 56.0f);
            mm40Var2 = jm40Var;
            mm40 mm40VarN = s5x0.N(o7k0.e(s5x0.N(jm40Var, 0.0f, lh80Var.c, 0.0f, lh80Var.e, 5), 80.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            byte b2 = 14;
            if (pp0Var instanceof np0) {
                fetVar2.e0(1450119702);
                np0 np0Var = (np0) pp0Var;
                hp4.d(xczVarA, vneVar, np0Var.f23889a.f10362a, np0Var.b && np0Var.d, np0Var.e, fetVar2, 0);
                qw3 qw3Var = new qw3(4.0f, true, new jf4(b2));
                lh80 lh80VarU = s5x0.u(s5x0.B(lh80Var, k6zVar), 0.0f, s5x0.A(lh80Var, k6zVar), 0.0f, 10);
                boolean zG = fetVar2.g(mm40VarS) | ((i2 & 112) == 32) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048);
                Object objP2 = fetVar2.P();
                if (zG || objP2 == cl5Var) {
                    dc0 dc0Var = new dc0((Object) pp0Var, (Object) mm40VarS, (Object) function0, (Object) function1, (byte) 1);
                    fetVar2.o0(dc0Var);
                    objP2 = dc0Var;
                }
                z = true;
                lh80Var2 = lh80Var;
                b8k0.f(null, xczVarA, lh80VarU, false, qw3Var, yx7Var, null, false, null, (Function1) objP2, fetVar2, 196608, 457);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                lh80Var2 = lh80Var;
                fetVar2.e0(1452126270);
                qw3 qw3Var2 = new qw3(4.0f, true, new jf4(b2));
                lh80 lh80VarU2 = s5x0.u(s5x0.B(lh80Var2, k6zVar), 0.0f, s5x0.A(lh80Var2, k6zVar), 0.0f, 10);
                boolean zG2 = fetVar2.g(mm40VarS);
                Object objP3 = fetVar2.P();
                if (zG2 || objP3 == cl5Var) {
                    objP3 = new t1(mm40VarS, (byte) 21);
                    fetVar2.o0(objP3);
                }
                z = true;
                b8k0.f(null, null, lh80VarU2, false, qw3Var2, yx7Var, null, false, null, (Function1) objP3, fetVar2, 196608, 459);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            lh80Var2 = lh80Var;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new so0(mm40Var2, pp0Var, lh80Var2, function1, function0, i, (byte) 1);
        }
    }

    public static final mm40 d0(mm40 mm40Var, bch0 bch0Var, ma80 ma80Var, vf80 vf80Var, boolean z, boolean z2, qkq qkqVar, gy40 gy40Var, j39 j39Var) {
        ma80 ma80Var2 = ma80.f21447a;
        jm40 jm40Var = jm40.b;
        return mm40Var.e(ma80Var == ma80Var2 ? lgb.J(jm40Var, ljc.d) : lgb.J(jm40Var, ljc.c)).e(new uah0(j39Var, qkqVar, gy40Var, ma80Var, vf80Var, bch0Var, z, z2, false));
    }

    public static final void e(mm40 mm40Var, l7m0 l7m0Var, fu1 fu1Var, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        l7m0 l7m0Var2;
        mm40 mm40Var2;
        ugd ugdVar2 = ugdVar;
        fu1Var.getClass();
        function1.getClass();
        fetVar.g0(309356958);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i2 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(fu1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(s5x0.N(n0qVar, 0.0f, ((Number) l7m0Var2.getValue()).floatValue() * 24.0f, 0.0f, 0.0f, 13), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
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
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            int i3 = i2;
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            z5n.h(fu1Var.e.b, fu1Var.f, aoo0.c, null, b6n.f2063a, false, function1, fetVar, ((i3 << 9) & 3670016) | 221568, 8);
            fetVar.r(true);
            mm40 mm40VarH = dw9.h(1.0f, o7k0.d(jm40Var, 1.0f), true);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarH);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            ugdVar2 = ugdVar;
            ugdVar2.invoke(fetVar, Integer.valueOf((i3 >> 12) & 14));
            fetVar.r(true);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new bu1(mm40Var2, l7m0Var, fu1Var, function1, ugdVar2, i, (byte) 0);
        }
    }

    public static final ru6 e0(qv6 qv6Var) {
        uoy uoyVarJ;
        qv6Var.getClass();
        String str = qv6Var.b;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        Double d2 = qv6Var.f29373a;
        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
        Long l = qv6Var.h;
        long jLongValue = l != null ? l.longValue() : 0L;
        Integer num = qv6Var.i;
        if (num != null) {
            int iIntValue = num.intValue();
            uoy.b.getClass();
            uoyVarJ = tqt.j(iIntValue);
        } else {
            uoyVarJ = uoy.UNKNOWN;
        }
        Double d3 = qv6Var.d;
        double dDoubleValue2 = d3 != null ? d3.doubleValue() : 0.0d;
        Long l2 = qv6Var.j;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        Long l3 = qv6Var.f;
        return new ru6(-1L, str2, dDoubleValue, jLongValue, uoyVarJ, dDoubleValue2, jLongValue2, l3 != null ? l3.longValue() : 0L, 0, qv6Var.G, qv6Var.H, 256);
    }

    public static final void f(mm40 mm40Var, n02 n02Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        n02Var.getClass();
        function1.getClass();
        fetVar2.g0(-435674427);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(n02Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) fetVar2.k(dy2.b);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = o7k0.w(o7k0.g(mm40VarD, 48.0f, 0.0f, 2), null, false, 3);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean zI = ((i2 & 112) == 32) | ((i2 & 896) == 256) | fetVar2.i(context);
            Object objP2 = fetVar2.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new k02(function1, n02Var, context, (byte) 0);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarW, gy40Var, null, false, null, (Function0) objP2, 28), "AGREEMENT_ROW");
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(s5x0.J(jm40Var, 2.0f), 40.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
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
            mm40 mm40VarE1 = o2e.e0(o7k0.n(jm40Var, 24.0f), "AGREEMENT_FIELD_ICON");
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new dj1((byte) 19);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarA = pai0.a(mm40VarE1, false, (Function1) objP3);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_document, 0, fetVar2);
            zfn zfnVar = zaq0.b;
            j0x.b(pm80VarF, null, mm40VarA, null, gqw0.f1, 0.0f, new m78(((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), 5), fetVar2, 24632, 40);
            fetVar2.r(true);
            v8q0.a(n02Var.b, o2e.e0(s5x0.N(new x7z(1.0f, true), 0.0f, 10.0f, 16.0f, 10.0f, 1), "AGREEMENT_FIELD_TITLE"), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new znk(mm40Var, n02Var, function1, i, (byte) 27);
        }
    }

    public static final BetZip f0(iq7 iq7Var) {
        iq7Var.getClass();
        long j = iq7Var.f15195a;
        th7 th7Var = iq7Var.i;
        double d2 = iq7Var.b;
        long j2 = iq7Var.c;
        double d3 = iq7Var.d;
        String str = iq7Var.e;
        if (str == null) {
            str = "";
        }
        boolean z = iq7Var.f;
        String str2 = iq7Var.g;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str;
        String str4 = iq7Var.h;
        BetPlayerZip betPlayerZip = th7Var != null ? new BetPlayerZip(0L, "") : new BetPlayerZip(0L, "");
        uoy uoyVar = iq7Var.j;
        String str5 = iq7Var.k;
        String str6 = iq7Var.l;
        izc izcVar = iq7Var.m;
        iun iunVar = iun.f15405a;
        PlayersDuelZip playersDuelZip = new PlayersDuelZip(iunVar, iunVar);
        cfo cfoVar = iq7Var.n;
        return new BetZip(j, d2, j2, d3, str3, z, str2, str4, betPlayerZip, 0, 0L, uoyVar, 0L, 0, 0L, false, 0L, false, playersDuelZip, str5, str6, izcVar, false, false, false, false, "", false, false, "", false, false, false, new EventParams(cfoVar.f4272a, cfoVar.b));
    }

    public static final void g(mm40 mm40Var, q53 q53Var, t6k t6kVar, fet fetVar, int i) {
        mm40 mm40Var2;
        vz40 vz40Var;
        db8 db8Var;
        j53 j53Var = t6kVar.f33420a;
        fetVar.g0(323956255);
        int i2 = i | (fetVar.g(q53Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            db8 db8Var2 = q53Var.b;
            String str = q53Var.f28130a;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new vz40(db8.f5790a);
                fetVar.o0(objP);
            }
            vz40 vz40Var2 = (vz40) objP;
            boolean zE = fetVar.e(db8Var2.ordinal()) | fetVar.g(str);
            Object objP2 = fetVar.P();
            if (zE || objP2 == cl5Var) {
                objP2 = xf0.c(1.0f);
                fetVar.o0(objP2);
            }
            t33 t33Var = (t33) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new vz40(m5k0.a(j53Var.b));
                fetVar.o0(objP3);
            }
            vz40 vz40Var3 = (vz40) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = new vz40(Boolean.TRUE);
                fetVar.o0(objP4);
            }
            Boolean bool = Boolean.TRUE;
            ((vz40) objP4).f38283a = bool;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = new vz40(bool);
                fetVar.o0(objP5);
            }
            vz40 vz40Var4 = (vz40) objP5;
            if (db8Var2 == db8.b) {
                j53Var = t6kVar.b;
            }
            j53 j53Var2 = j53Var;
            s4u0 s4u0VarR = iom0.r(jpm0.t(j53Var2.f15914a, 6, fetVar), fetVar);
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                vz40 vz40Var5 = new vz40(new p53(q53Var, t33Var, vz40Var3, s4u0VarR, j53Var2));
                fetVar.o0(vz40Var5);
                objP6 = vz40Var5;
            }
            vz40 vz40Var6 = (vz40) objP6;
            vz40Var6.f38283a = new p53(q53Var, t33Var, vz40Var3, s4u0VarR, j53Var2);
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                objP7 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP7);
            }
            vne vneVar = (vne) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == cl5Var) {
                objP8 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP8);
            }
            pz40 pz40Var = (pz40) objP8;
            boolean zI = fetVar.i(vneVar) | fetVar.e(db8Var2.ordinal());
            Object objP9 = fetVar.P();
            if (zI || objP9 == cl5Var) {
                jv0 jv0Var = new jv0(vneVar, vz40Var6, vz40Var2, db8Var2, pz40Var, null, (byte) 1);
                vz40Var = vz40Var6;
                db8Var = db8Var2;
                fetVar.o0(jv0Var);
                objP9 = jv0Var;
            } else {
                db8Var = db8Var2;
                vz40Var = vz40Var6;
            }
            m0x0.v(db8Var, str, (Function2) objP9, fetVar);
            p53 p53Var = (p53) vz40Var.f38283a;
            boolean zBooleanValue = ((Boolean) vz40Var4.f38283a).booleanValue();
            ugd ugdVarM = u1c.M(-1156543005, new qb((Object) db8Var, (Object) t6kVar, (Object) vz40Var3, (byte) 17), fetVar);
            uts0 uts0VarM0 = ro4.m0(Response.BAD_REQUEST, 0, new zsf(0.42f, 0.0f, 1.0f, 1.0f), 2);
            if (zBooleanValue) {
                fetVar.e0(-1237727464);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40Var2 = mm40Var;
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var2);
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
                ugdVarM.F(p53Var, fetVar, 48);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                fetVar.e0(-1237942666);
                mm40Var2 = mm40Var;
                jwb.d(phu0.Z(p53Var, "Crossfade", fetVar, 0, 0), mm40Var2, uts0VarM0, null, ugdVarM, fetVar, 24624);
                fetVar.r(false);
            }
            vz40Var4.f38283a = Boolean.FALSE;
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ry2((Object) mm40Var2, (Object) q53Var, (Object) t6kVar, i, (byte) 2);
        }
    }

    public static final List g0(String str) {
        wcy wcyVarC = vdx.f37253a;
        if (wcyVarC == null) {
            wcyVarC = qxw.c(new f8l0((byte) 15));
            vdx.f37253a = wcyVarC;
        }
        List list = (List) wcyVarC.b(mrv.j0(new zw3(vua.Companion.serializer(), (byte) 0)), str);
        return list == null ? iun.f15405a : list;
    }

    public static final void h(mm40 mm40Var, p53 p53Var, t6k t6kVar, int i, Function0 function0, fet fetVar, int i2) {
        mm40 mm40Var2;
        fetVar.g0(1083866403);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(p53Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(t6kVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.e(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = ((i3 & 112) == 32) | ((57344 & i3) == 16384) | ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ca00(p53Var, function0, i, t6kVar);
                fetVar.o0(objP);
            }
            int i4 = i3 & 14;
            jm40 jm40Var = jm40.b;
            x4n0.a(jm40Var, (Function2) objP, fetVar, i4, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k53((byte) 0, i, i2, function0, mm40Var2, p53Var, t6kVar);
        }
    }

    public static final void h0(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            jf4.o("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void i(mm40 mm40Var, ujv0 ujv0Var, l7m0 l7m0Var, l7m0 l7m0Var2, Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        boolean z;
        boolean z2;
        byte b2;
        fet fetVar3 = fetVar;
        Object obj = uc9.g;
        ujv0Var.getClass();
        l7m0Var.getClass();
        l7m0Var2.getClass();
        function1.getClass();
        fetVar3.g0(288657261);
        int i2 = (i & 6) == 0 ? (fetVar3.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar3.i(ujv0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar3.g(l7m0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar3.g(l7m0Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar3.i(function1) ? 16384 : 8192;
        }
        if (fetVar3.U(i2 & 1, (i2 & 9363) != 9362)) {
            xx7 xx7Var = gqw0.n;
            x5d x5dVarA = w5d.a(uc9.c, xx7Var, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40Var);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z3 = fetVar3.S;
            Function0 function0 = e7z.u1;
            if (z3) {
                fetVar3.l(function0);
            } else {
                fetVar3.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar3, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar3);
            jpm0.n(fetVar3);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            int i3 = i2;
            Object obj2 = obj;
            v8q0.a((String) l7m0Var.getValue(), o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar3.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 48, 24960, 109560);
            fet fetVar4 = fetVar;
            Object objP = fetVar4.P();
            Object obj3 = ukd.f35823a;
            if (objP == obj3) {
                byte b3 = 12;
                if (((List) l7m0Var2.getValue()).size() <= 4) {
                    z = true;
                    objP = new qw3(16.0f, true, new gne(xx7Var, b3));
                } else {
                    z = true;
                    Object qw3Var = new qw3(16.0f, true, new gne(xx7Var, b3));
                    Object qw3Var2 = new qw3(16.0f, true, new gne(xx7Var, b3));
                    if (ujv0Var.a(640)) {
                        obj2 = qw3Var;
                    } else if (ujv0Var.a(411)) {
                        obj2 = qw3Var2;
                    }
                    objP = obj2;
                }
                fetVar4.o0(objP);
            } else {
                z = true;
            }
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 80.0f);
            thg0 thg0VarA = shg0.a((ow3) objP, gqw0.k, fetVar4, 54);
            int iHashCode2 = Long.hashCode(fetVar4.T);
            bh90 bh90VarM2 = fetVar4.m();
            mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarE);
            fetVar4.i0();
            if (fetVar4.S) {
                fetVar4.l(function0);
            } else {
                fetVar4.r0();
            }
            jpm0.o(fetVar4, thg0VarA, shdVar);
            jpm0.o(fetVar4, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar4, shdVar3, fetVar4);
            jpm0.o(fetVar4, mm40VarC1, shdVar4);
            fetVar4.e0(1483972394);
            for (Object obj4 : (Iterable) l7m0Var2.getValue()) {
                fetVar4.b0(-1303258805, obj4);
                if (Intrinsics.d(obj4, ri4.f30520a)) {
                    fetVar4.e0(-1303255879);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarQ = i120.Q(o7k0.n(jm40Var, 56.0f), ((ThemeColors) fetVar4.k(zaq0.b)).getSecondaryButtonBackground(), vgg0.f37379a);
                    pm80 pm80VarF = a8k0.F(R.drawable.ic_more, 0, fetVar4);
                    pge pgeVar = gqw0.f1;
                    boolean z4 = (i3 & 57344) == 16384 ? z : false;
                    Object objP2 = fetVar4.P();
                    if (z4 || objP2 == obj3) {
                        b2 = 0;
                        objP2 = new fj4(function1, b2);
                        fetVar4.o0(objP2);
                    } else {
                        b2 = 0;
                    }
                    Function0 function2 = (Function0) objP2;
                    z2 = b2;
                    saj.e(mm40VarQ, pm80VarF, pgeVar, null, function2, fetVar4, 448, 8);
                    fetVar4.r(z2);
                } else {
                    if (!(obj4 instanceof si4)) {
                        throw b1j.f(-1303257831, fetVar4, false);
                    }
                    fetVar4.e0(-1303234572);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarJ = lgb.J(o7k0.n(jm40Var, 56.0f), vgg0.f37379a);
                    si4 si4Var = (si4) obj4;
                    pm80 pm80VarF2 = a8k0.F(si4Var.f32245a, 0, fetVar4);
                    boolean zI = fetVar4.i(obj4) | ((i3 & 57344) == 16384 ? z : false);
                    Object objP3 = fetVar4.P();
                    if (zI || objP3 == obj3) {
                        z2 = 0;
                        objP3 = new gj4(function1, si4Var, false ? 1 : 0);
                        fetVar4.o0(objP3);
                    } else {
                        z2 = 0;
                    }
                    saj.e(mm40VarJ, pm80VarF2, null, null, (Function0) objP3, fetVar4, 64, 12);
                    fetVar4.r(z2);
                }
                fetVar4.r(z2);
            }
            ohs0.x(fetVar4, false, z, z);
            fetVar2 = fetVar4;
        } else {
            fetVar3.X();
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var, (Object) ujv0Var, (Object) l7m0Var, (Object) l7m0Var2, (Object) function1, i, (byte) 2);
        }
    }

    public static final byte[] i0(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i3 < 0 || bArr.length - i3 < i || bArr2.length - i3 < i2) {
            jf4.o("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return null;
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    public static final void j(mm40 mm40Var, yvl yvlVar, fet fetVar, int i) {
        fet fetVar2;
        long primary;
        fetVar.g0(143872538);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(yvlVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar2 = fetVar;
            l7m0 l7m0VarB = d43.b(yvlVar.f43325a != evq0.b ? 1.0f : 0.0f, ro4.m0(250, 0, hhn.e, 2), null, null, fetVar2, 0, 28);
            if (!yvlVar.b) {
                fetVar2.e0(822566149);
                primary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary60();
                fetVar2.r(false);
            } else if (yvlVar.c) {
                fetVar2.e0(822567841);
                primary = ((ThemeColors) fetVar2.k(zaq0.b)).getWarning();
                fetVar2.r(false);
            } else {
                fetVar2.e0(822569185);
                primary = ((ThemeColors) fetVar2.k(zaq0.b)).getPrimary();
                fetVar2.r(false);
            }
            boolean zG = fetVar2.g(l7m0VarB);
            Object objP = fetVar2.P();
            if (zG || objP == ukd.f35823a) {
                objP = new x1d(l7m0VarB, (byte) 19);
                fetVar2.o0(objP);
            }
            mm40Var = jm40.b;
            mm40 mm40VarE = i4w0.T(mm40Var, (Function1) objP).e(o7k0.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarE, 10.0f);
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar2, i120.Q(mm40VarJ, primary, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) mm40Var, (Object) yvlVar, i, (byte) 5);
        }
    }

    public static final byte[] j0(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return i0(bArr, 0, bArr2, 0, bArr.length);
        }
        jf4.o("The lengths of x and y should match.");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r13v3, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v24 */
    public static final void k(mm40 mm40Var, on5 on5Var, Function1 function1, fet fetVar, int i) {
        int i2;
        ?? r13;
        ?? r15;
        int i3;
        int i4;
        cl5 cl5Var;
        on5 on5Var2 = on5Var;
        fet fetVar2 = fetVar;
        on5Var2.getClass();
        function1.getClass();
        fetVar2.g0(-210787185);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(on5Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            boolean zF = fetVar2.f(backgroundContent);
            Object objP = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (zF || objP == cl5Var2) {
                objP = new bx((byte) 7, backgroundContent);
                fetVar2.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40Var, (Function1) objP);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(mm40VarK, 12.0f, 0.0f, 12.0f, 8.0f, 2), "BalanceContainerTestTag");
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
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
            int i5 = i2;
            v8q0.a(on5Var2.b(), o2e.e0(o7k0.d(jm40Var, 1.0f).e(new wkw(xx7Var)), "CurrentAccountTextTestTag"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar, 0, 24960, 110588);
            ?? r14 = fetVar;
            mm40 mm40VarN = s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 2.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, r14, 54);
            int iHashCode2 = Long.hashCode(r14.T);
            bh90 bh90VarM2 = r14.m();
            mm40 mm40VarC1 = kbc.c0(r14, mm40VarN);
            r14.i0();
            if (r14.S) {
                r14.l(pcyVar);
            } else {
                r14.r0();
            }
            jpm0.o(r14, thg0VarA, shdVar);
            jpm0.o(r14, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, r14, shdVar3, r14);
            jpm0.o(r14, mm40VarC1, shdVar4);
            on5Var2 = on5Var;
            if (on5Var2 instanceof cn5) {
                r14.e0(820316385);
                mm40 mm40VarP = o7k0.p(jm40Var, 128.0f, 32.0f);
                zcl zclVar2 = qmk.g;
                ugg0 ugg0Var = vgg0.f37379a;
                r15 = 1;
                dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), vbc.d0(null, r14, 0, 1), r14, 0, false);
                i3 = i5;
                cl5Var = cl5Var2;
                i4 = 256;
            } else {
                r15 = 1;
                if (!(on5Var2 instanceof dn5)) {
                    throw b1j.f(-1913202205, r14, false);
                }
                mm40 mm40VarN2 = s5x0.N(rz4.f(r14, 820714456, 1.0f, true), 0.0f, 0.0f, 4.0f, 0.0f, 11);
                i3 = i5;
                i4 = 256;
                boolean z2 = (i3 & 896) == 256;
                Object objP2 = r14.P();
                cl5Var = cl5Var2;
                if (z2 || objP2 == cl5Var) {
                    objP2 = new fj4(function1, (byte) 25);
                    r14.o0(objP2);
                }
                mm40 mm40VarW = y860.W(mm40VarN2, null, null, false, null, (Function0) objP2, 28);
                dn5 dn5Var = (dn5) on5Var2;
                uc9.e(mm40VarW, dn5Var.f6351a, dn5Var.b, ((ThemeColors) r14.k(zfnVar)).getTextPrimary(), idm0.t(32), r14, 199680);
                r14.r(false);
            }
            mm40 mm40VarE1 = o2e.e0(s5x0.L(o7k0.u(jm40Var, 0.0f, 160.0f, r15), 0.0f, 2.0f, r15), "DepositButtonTestTag");
            wul wulVar = new wul(iul.e, oe9.b, new ve9(on5Var2.a(), R.drawable.ic_glyph_plus_small), true, false, false);
            ?? r8 = (i3 & 896) == i4 ? r15 : 0;
            Object objP3 = r14.P();
            if (r8 != 0 || objP3 == cl5Var) {
                objP3 = new fj4(function1, (byte) 26);
                r14.o0(objP3);
            }
            qzb.n(mm40VarE1, wulVar, (Function0) objP3, r14, 0, 0);
            r14.r(r15);
            r14.r(r15);
            r13 = r14;
        } else {
            fetVar2.X();
            r13 = fetVar2;
        }
        yfe0 yfe0VarU = r13.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5((byte) 1, i, (Object) mm40Var, (Object) on5Var2, function1);
        }
    }

    public static final void l(if7 if7Var, Function1 function1, fet fetVar, int i) {
        if7Var.getClass();
        function1.getClass();
        fetVar.g0(-680098620);
        byte b2 = 2;
        int i2 = (fetVar.g(if7Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b3 = 0;
        byte b4 = 1;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else {
            if (if7Var.h) {
                fetVar.e0(-1457103642);
                m(if7Var.e, if7Var.i, function1, fetVar, (i2 << 3) & 896);
                fetVar.r(false);
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new bf7(if7Var, function1, i, b3);
                    return;
                }
                return;
            }
            fetVar.e0(-1456896066);
            fetVar.r(false);
            m8x.y(o7k0.c, u1c.M(1746307712, new bf7(if7Var, function1, b4), fetVar), u1c.M(-862759649, new bf7(if7Var, function1, b2), fetVar), null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(-670158187, new ri1(if7Var, function1, (byte) 5), fetVar), fetVar, 805306806, 440);
            if (if7Var.f14673a) {
                fetVar.e0(-1453252667);
                M(0, fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-1453228642);
                fetVar.r(false);
            }
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new bf7(if7Var, function1, i, (byte) 3);
        }
    }

    public static final void m(imm immVar, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        imm immVar2;
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(2073334435);
        if ((i & 6) == 0) {
            immVar2 = immVar;
            i2 = (fetVar2.g(immVar2) ? 4 : 2) | i;
        } else {
            immVar2 = immVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(mdmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarW = o050.W(jm40.b);
            boolean z2 = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            boolean z3 = z2;
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new to6(function1, (byte) 12);
                fetVar2.o0(objP);
            }
            int i3 = i2;
            hlm.c(mm40VarW, immVar2, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, (i2 << 3) & 112, 0, 4084);
            fetVar2 = fetVar;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ);
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
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new t07((byte) 19);
                fetVar2.o0(objP2);
            }
            jcb.l(null, mdmVar, false, (Function0) objP2, fetVar2, (i3 & 112) | 3072, 5);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cf7(immVar, mdmVar, function1, i, (byte) 0);
        }
    }

    public static final void n(yvl yvlVar, fet fetVar, int i) {
        int i2;
        long secondary60;
        fetVar.g0(1683848565);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(yvlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            evq0 evq0Var = yvlVar.f43325a;
            boolean z = yvlVar.b;
            if (evq0Var != evq0.b && !z) {
                fetVar.e0(-1024194240);
                secondary60 = ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
                fetVar.r(false);
            } else if (!z) {
                fetVar.e0(-1024192448);
                secondary60 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary60();
                fetVar.r(false);
            } else if (yvlVar.c) {
                fetVar.e0(-1024190756);
                secondary60 = ((ThemeColors) fetVar.k(zaq0.b)).getWarning();
                fetVar.r(false);
            } else {
                fetVar.e0(-1024189408);
                secondary60 = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary60();
                fetVar.r(false);
            }
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(n0qVar, 10.0f);
            zcl zclVar2 = qmk.d;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.S(mm40VarJ, 2.0f, secondary60, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "DS_CHECKBOX_BORDER");
            boolean zF = fetVar.f(secondary60);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new nme((byte) 21, secondary60);
                fetVar.o0(objP);
            }
            qxw.o(fetVar, pai0.a(mm40VarE0, false, (Function1) objP));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(yvlVar, i, (byte) 10);
        }
    }

    public static final void o(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(407058443);
        int i2 = i | 6;
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            long jM62getBlack0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m62getBlack0d7_KjU();
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarH = k7n0.H(o7k0.w(o7k0.d(i120.Q(qcc.F(mm40Var2, jM62getBlack0d7_KjU, 20.0f, 8.0f, 0.0f, 0.4f, 88), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.c(20.0f, 20.0f, 0.0f, 0.0f, 12)), 1.0f), null, false, 3), 8.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarH);
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
            ua80.p(54, ugdVar, jr8.f16991a, fetVar, true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fb8(mm40Var2, ugdVar, i, b2);
        }
    }

    public static final void p(boolean z, Function1 function1, fet fetVar, int i) {
        fetVar.g0(1390673761);
        byte b2 = 4;
        int i2 = (fetVar.h(z) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            gq80.k(o7k0.d(jm40.b, 1.0f), u1c.M(-1153968612, new ldc(z, function1, b2), fetVar), fetVar, 54);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rt9(z, function1, i, b2);
        }
    }

    public static final void q(int i, fet fetVar, a4x a4xVar, bdz bdzVar, mm40 mm40Var, Function1 function1, boolean z) {
        mm40 mm40Var2;
        float f;
        fetVar.g0(207047829);
        int i2 = i | 6 | (fetVar.g(bdzVar) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            float f2 = xfn.a(fetVar).c;
            int size = a4xVar.size();
            if (size != 1) {
                f = size != 2 ? 206.0f : 136.0f;
            } else {
                f = 68.0f;
            }
            float f3 = ((Resources) fetVar.k(dy2.c)).getDisplayMetrics().density;
            long jB = ((yez) ((rhv0) fetVar.k(bmd.u))).b();
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                ujv0 ujv0Var = new ujv0(((int) (jB >> 32)) / f3, ((int) (4294967295L & jB)) / f3);
                fetVar.o0(ujv0Var);
                objP = ujv0Var;
            }
            ujv0 ujv0Var2 = (ujv0) objP;
            Object objP2 = fetVar.P();
            jm40 jm40Var = jm40.b;
            if (objP2 == cl5Var) {
                objP2 = o7k0.s(jm40Var, dem0.n(ujv0Var2));
                fetVar.o0(objP2);
            }
            mm40 mm40Var3 = (mm40) objP2;
            lh80 lh80VarU = s5x0.u(f2, 0.0f, f2, 0.0f, 10);
            d9z d9zVarA = bdzVar.a("FAVORITES_CHAMPS_STATE", fetVar);
            boolean z2 = !z;
            if (size > 3) {
                size = 3;
            }
            ngv ngvVar = new ngv(size);
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, f), 1.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            qw3 qw3Var2 = new qw3(4.0f, true, new jf4((byte) 14));
            boolean z3 = ((i2 & 896) == 256) | ((i2 & 57344) == 16384);
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new g160(a4xVar, mm40Var3, function1, (byte) 1);
                fetVar.o0(objP3);
            }
            g8x.h(ngvVar, mm40VarD, d9zVarA, lh80VarU, qw3Var, qw3Var2, null, z2, null, (Function1) objP3, fetVar, 0, 0, 656);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e160(mm40Var2, bdzVar, a4xVar, z, function1, i, (byte) 3);
        }
    }

    public static final void r(int i, long j, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-809532893);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.f(j) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            dww.c(a8k0.F(R.drawable.ic_glyph_check_ios, 0, fetVar), null, o7k0.n(mm40Var, 24.0f), j, fetVar, 56 | ((i2 << 6) & 7168), 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ly2(mm40Var, j, i, (byte) 8);
        }
    }

    public static final void s(mm40 mm40Var, m4d m4dVar, Function0 function0, fet fetVar, int i) {
        m4dVar.getClass();
        function0.getClass();
        fetVar.g0(-2067878414);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(m4dVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = fetVar.k(bmd.n) == k6z.b;
            mm40 mm40VarC = o7k0.c(mm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarC);
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
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(n0qVar, vgg0.a(360.0f));
            boolean zH = fetVar.h(z);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zH || objP == cl5Var) {
                objP = new z((byte) 9, z);
                fetVar.o0(objP);
            }
            mm40 mm40VarT = i4w0.T(mm40VarJ, (Function1) objP);
            boolean z2 = (i2 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new lya(m4dVar, (byte) 25);
                fetVar.o0(objP2);
            }
            zq8.a(0, fetVar, y860.W(rq8.K(mm40VarT, (Function1) objP2), null, null, false, null, function0, 28));
            if (m4dVar.b) {
                fetVar.e0(2006946269);
                T(0, fetVar, ffb0.Q(jr8.f16991a.b(jm40.b, gqw0.c), 6.0f, -6.0f));
                fetVar.r(false);
            } else {
                fetVar.e0(2007143274);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(mm40Var, m4dVar, function0, i, (byte) 11);
        }
    }

    public static final void t(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        fetVar.g0(1771598585);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            zcl zclVar = qmk.f28987a;
            m8x.y(n0qVar, u1c.M(1337505461, new x6s(function1, (byte) 9), fetVar), u1c.M(675915988, new p7y(l7m0Var, function1, (byte) 14), fetVar), null, null, 0, background, 0L, i120.N(0.0f, 0.0f, 0.0f, 0.0f, 14), u1c.M(-594955958, new dqz(l7m0Var, function1, b2), fetVar), fetVar, 805306806, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p7y(l7m0Var, function1, i, (byte) 15);
        }
    }

    public static final void u(mm40 mm40Var, jzh jzhVar, Function0 function0, fet fetVar, int i) {
        int i2;
        float f;
        fet fetVar2;
        shd shdVar;
        shd shdVar2;
        byte b2;
        pcy pcyVar;
        jzh jzhVar2 = jzhVar;
        fet fetVar3 = fetVar;
        String str = jzhVar2.f17412a;
        function0.getClass();
        fetVar3.g0(-463926564);
        if ((i & 6) == 0) {
            i2 = (fetVar3.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar3.g(jzhVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar3.i(function0) ? 256 : 128;
        }
        if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
            boolean zG = fetVar3.g(str);
            Object objP = fetVar3.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new hjm(str == null ? "" : str, null, null, null, null, null, false, null, null, false, null, null, 8190);
                fetVar3.o0(objP);
            }
            hjm hjmVar = (hjm) objP;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar3, 0);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarD);
            mkd.c0.getClass();
            fetVar3.i0();
            boolean z = fetVar3.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar3.l(pcyVar2);
            } else {
                fetVar3.r0();
            }
            shd shdVar3 = gqw0.x;
            jpm0.o(fetVar3, x5dVarA, shdVar3);
            shd shdVar4 = gqw0.w;
            jpm0.o(fetVar3, bh90VarM, shdVar4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar5 = gqw0.y;
            jpm0.o(fetVar3, numValueOf, shdVar5);
            jpm0.n(fetVar3);
            shd shdVar6 = gqw0.v;
            jpm0.o(fetVar3, mm40VarC0, shdVar6);
            boolean zW = StringsKt.W(hjmVar.f13167a);
            jm40 jm40Var = jm40.b;
            if (zW) {
                f = 1.0f;
                fetVar2 = fetVar3;
                shdVar = shdVar4;
                shdVar2 = shdVar6;
                fetVar2.e0(-760691504);
                fetVar2.r(false);
            } else {
                fetVar3.e0(-760948091);
                zcl zclVar = qmk.f28987a;
                shdVar = shdVar4;
                shdVar2 = shdVar6;
                f = 1.0f;
                nkb.h(s5x0.L(o7k0.e(jm40Var, 40.0f), 8.0f, 0.0f, 2), hjmVar, kjm.f18392a, null, null, null, fetVar, 384, 56);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            mm40 mm40VarD2 = o7k0.d(jm40Var, f);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(o7k0.e(mm40VarD2, 128.0f), vgg0.a(16.0f));
            ((hi0) fetVar2.k(ii0.f14805a)).getClass();
            long j = hi0.n;
            mm40 mm40VarQ = i120.Q(mm40VarJ, j, jd8.n);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = dw9.j(fetVar2);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, (gy40) objP2, null, false, null, function0, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar3);
            jpm0.o(fetVar2, bh90VarM2, shdVar);
            vqd.u(iHashCode2, fetVar2, shdVar5, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar2);
            n0x n0xVar = jzhVar2.l;
            fetVar2.e0(-1328942020);
            j0x.b(lv00.T(n0xVar, null, null, null, fetVar, 48, 12), null, yyw.V(jr8.f16991a.b(lgb.J(o7k0.e(o7k0.s(jm40Var, 256.0f), 128.0f), vgg0.c(0.0f, 16.0f, 0.0f, 0.0f, 13)), gqw0.c), fetVar2.k(bmd.n) == k6z.b), null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
            fetVar.r(false);
            wvb.A(null, hi0.p, j, fetVar, 6);
            mm40 mm40VarM = s5x0.M(o7k0.c, 16.0f, 12.0f, 16.0f, 12.0f);
            nw3 nw3Var = uc9.g;
            x5d x5dVarA2 = w5d.a(nw3Var, xx7Var, fetVar, 6);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarM);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar3);
            jpm0.o(fetVar, bh90VarM3, shdVar);
            vqd.u(iHashCode3, fetVar, shdVar5, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar2);
            x5d x5dVarA3 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA3, shdVar3);
            jpm0.o(fetVar, bh90VarM4, shdVar);
            vqd.u(iHashCode4, fetVar, shdVar5, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar2);
            mm40 mm40VarD3 = o7k0.d(o7k0.g(jm40Var, 20.0f, 0.0f, 2), 1.0f);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(nw3Var, yx7Var, fetVar, 54);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarD3);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar2);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar3);
            jpm0.o(fetVar, bh90VarM5, shdVar);
            vqd.u(iHashCode5, fetVar, shdVar5, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar2);
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                b2 = 6;
                objP3 = new thd(b2);
                fetVar.o0(objP3);
            } else {
                b2 = 6;
            }
            mm40 mm40VarN = s5x0.N(knx.Q(jm40Var, (xdr) objP3), 0.0f, 0.0f, 8.0f, 0.0f, 11);
            long j2 = qmk.q;
            long j3 = qmk.s;
            long j4 = qmk.n;
            n05 n05Var = new n05(j2, j3, j4);
            String str2 = jzhVar.c;
            y9q0 y9q0VarJ = g1t0.j();
            zfn zfnVar = m8m0.f21378a;
            shd shdVar7 = shdVar2;
            shd shdVar8 = shdVar;
            jzhVar2 = jzhVar;
            v8q0.a(str2, mm40VarN, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), n05Var, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarJ, fetVar, 0, 24960, 110576);
            String str3 = jzhVar2.b;
            if (str3 == null) {
                str3 = "";
            }
            j6n.h(str3, gso0.f11839a, null, 0, 0, fetVar, 48, 28);
            fetVar.r(true);
            v8q0.a(jzhVar2.f, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), new n05(qmk.p, j2, j4), 0L, null, null, null, 0L, null, 0L, 2, false, 2, 2, null, g1t0.g(), fetVar, 0, 221568, 77808);
            fetVar.r(true);
            thg0 thg0VarA2 = shg0.a(nw3Var, yx7Var, fetVar, 54);
            int iHashCode6 = Long.hashCode(fetVar.T);
            bh90 bh90VarM6 = fetVar.m();
            mm40 mm40VarC5 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar3);
            jpm0.o(fetVar, bh90VarM6, shdVar8);
            vqd.u(iHashCode6, fetVar, shdVar5, fetVar);
            mm40 mm40VarN2 = s5x0.N(ohs0.i(fetVar, mm40VarC5, shdVar7, 1.0f, true), 0.0f, 0.0f, 12.0f, 0.0f, 11);
            x5d x5dVarA4 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode7 = Long.hashCode(fetVar.T);
            bh90 bh90VarM7 = fetVar.m();
            mm40 mm40VarC6 = kbc.c0(fetVar, mm40VarN2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA4, shdVar3);
            jpm0.o(fetVar, bh90VarM7, shdVar8);
            vqd.u(iHashCode7, fetVar, shdVar5, fetVar);
            jpm0.o(fetVar, mm40VarC6, shdVar7);
            thg0 thg0VarA3 = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode8 = Long.hashCode(fetVar.T);
            bh90 bh90VarM8 = fetVar.m();
            mm40 mm40VarC7 = kbc.c0(fetVar, jm40Var);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA3, shdVar3);
            jpm0.o(fetVar, bh90VarM8, shdVar8);
            vqd.u(iHashCode8, fetVar, shdVar5, fetVar);
            jpm0.o(fetVar, mm40VarC7, shdVar7);
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = new thd((byte) 7);
                fetVar.o0(objP4);
            }
            v8q0.a(jzhVar2.o, s5x0.N(knx.Q(jm40Var, (xdr) objP4), 0.0f, 0.0f, 0.0f, 4.0f, 7), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.g(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 24960, 110584);
            v8q0.a(Separators.SLASH, s5x0.N(jm40Var, 4.0f, 0.0f, 4.0f, 4.0f, 2), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.g(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 6, 24960, 110584);
            mm40 mm40VarN3 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
            String str4 = jzhVar2.r;
            String strQ = jzhVar2.p;
            if (str4 != null) {
                strQ = w6x.q(strQ, Separators.SP, str4);
            }
            v8q0.a(strQ, mm40VarN3, ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(g1t0.g(), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679), fetVar, 0, 24960, 110584);
            fetVar3 = fetVar;
            fetVar3.r(true);
            mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
            tnm tnmVar = tnm.f34243a;
            StaticColors staticColors = StaticColors.INSTANCE;
            snm.b(mm40VarD4, new unm(tnmVar, staticColors.m122getViolet0d7_KjU(), staticColors.m122getViolet0d7_KjU(), staticColors.m95getGray0d7_KjU(), 6.0f, 6.0f, jzhVar2.q, 100, false, 768), fetVar3, 6);
            fetVar3.r(true);
            j6n.h(jzhVar2.n, bqo0.f3042a, o7k0.u(jm40Var, 0.0f, 108.0f, 1), 0, 0, fetVar3, 48, 24);
            fetVar3.r(true);
            fetVar3.r(true);
            fetVar3.r(true);
            fetVar3.r(true);
        } else {
            fetVar3.X();
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(mm40Var, jzhVar2, function0, i, (byte) 20);
        }
    }

    public static final void v(mm40 mm40Var, final yvl yvlVar, Function0 function0, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        int i4;
        long jM123getWhite0d7_KjU;
        function0.getClass();
        fetVar.g0(976083042);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(yvlVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        final byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40Var4 = i5 != 0 ? jm40Var : mm40Var2;
            Object obj = (omv) fetVar.k(bmd.l);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var4, 40.0f);
            int i6 = i3 & 112;
            boolean z = i6 == 32;
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (z || objP == obj2) {
                objP = new Function1() { // from class: a.uvl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        byte b3 = b2;
                        yvl yvlVar2 = yvlVar;
                        switch (b3) {
                            case 0:
                                uag0 uag0Var = (uag0) obj3;
                                uag0Var.getClass();
                                uag0Var.b(yvlVar2.b ? 1.0f : 0.5f);
                                break;
                            default:
                                abi0 abi0Var = (abi0) obj3;
                                abi0Var.getClass();
                                evq0 evq0Var = yvlVar2.f43325a;
                                yai0.h(abi0Var, evq0Var == evq0.f8484a ? "checked" : "unchecked");
                                yai0.i(abi0Var, evq0Var);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            }
            mm40 mm40VarT = i4w0.T(mm40VarN, (Function1) objP);
            boolean z2 = yvlVar.b;
            evq0 evq0Var = yvlVar.f43325a;
            Object objP2 = fetVar.P();
            if (objP2 == obj2) {
                objP2 = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP2;
            boolean zI = ((i3 & 896) == 256) | fetVar.i(obj) | (i6 == 32);
            Object objP3 = fetVar.P();
            byte b3 = 3;
            if (zI || objP3 == obj2) {
                objP3 = new g8l(obj, yvlVar, function0, b3);
                fetVar.o0(objP3);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarT, gy40Var, null, z2, null, (Function0) objP3, 24), "DS_CHECKBOX_TAG");
            boolean z3 = i6 == 32;
            Object objP4 = fetVar.P();
            if (z3 || objP4 == obj2) {
                final byte b4 = 1;
                objP4 = new Function1() { // from class: a.uvl
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        byte b5 = b4;
                        yvl yvlVar2 = yvlVar;
                        switch (b5) {
                            case 0:
                                uag0 uag0Var = (uag0) obj3;
                                uag0Var.getClass();
                                uag0Var.b(yvlVar2.b ? 1.0f : 0.5f);
                                break;
                            default:
                                abi0 abi0Var = (abi0) obj3;
                                abi0Var.getClass();
                                evq0 evq0Var2 = yvlVar2.f43325a;
                                yai0.h(abi0Var, evq0Var2 == evq0.f8484a ? "checked" : "unchecked");
                                yai0.i(abi0Var, evq0Var2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP4);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP4);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            mm40 mm40Var5 = mm40Var4;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA);
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
            n(yvlVar, fetVar, (i3 >> 3) & 14);
            j(null, yvlVar, fetVar, i6);
            if (!yvlVar.b || yvlVar.c) {
                i4 = 0;
                fetVar.e0(-473758523);
                jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                fetVar.r(false);
            } else {
                fetVar.e0(-473699809);
                jM123getWhite0d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getPrimaryForeground();
                i4 = 0;
                fetVar.r(false);
            }
            float f = evq0Var == evq0.f8484a ? 1.0f : 0.0f;
            zsf zsfVar = hhn.e;
            l7m0 l7m0VarB = d43.b(f, ro4.m0(250, i4, zsfVar, 2), null, null, fetVar, 0, 28);
            boolean zG = fetVar.g(l7m0VarB);
            Object objP5 = fetVar.P();
            if (zG || objP5 == obj2) {
                objP5 = new x1d(l7m0VarB, (byte) 17);
                fetVar.o0(objP5);
            }
            r(0, jM123getWhite0d7_KjU, fetVar, i4w0.T(jm40Var, (Function1) objP5));
            l7m0 l7m0VarB2 = d43.b(evq0Var == evq0.c ? 1.0f : 0.0f, ro4.m0(250, 0, zsfVar, 2), null, null, fetVar, 0, 28);
            boolean zG2 = fetVar.g(l7m0VarB2);
            Object objP6 = fetVar.P();
            if (zG2 || objP6 == obj2) {
                objP6 = new x1d(l7m0VarB2, (byte) 18);
                fetVar.o0(objP6);
            }
            I(0, jM123getWhite0d7_KjU, fetVar, i4w0.T(jm40Var, (Function1) objP6));
            fetVar.r(true);
            mm40Var3 = mm40Var5;
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(mm40Var3, (Object) yvlVar, (Object) function0, i, i2, (byte) 14);
        }
    }

    public static final void w(mdm mdmVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-19772548);
        byte b2 = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mdmVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.e);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new z9q(function1, (byte) 13);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i2 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wo6(mdmVar, function1, i, b2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    public static final void x(mm40 mm40Var, a2n a2nVar, boolean z, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(1571749298);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(a2nVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (!fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.X();
        } else if (a2nVar == null) {
            fetVar.e0(250543344);
            fetVar.r(false);
        } else if (a2nVar instanceof y56) {
            fetVar.e0(250092511);
            vcc.i(mm40Var, (y56) a2nVar, z, function1, null, fetVar, i3 & 8190, 16);
            fetVar.r(false);
        } else if (a2nVar instanceof c2o0) {
            fetVar.e0(250333660);
            hkb.n(mm40Var, (c2o0) a2nVar, z, function1, null, fetVar, i3 & 8190, 16);
            fetVar.r(false);
        } else {
            fetVar.e0(250543344);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dxe(mm40Var, a2nVar, z, function1, i);
        }
    }

    public static final void y(int i, fet fetVar, a4x a4xVar, bdz bdzVar, mm40 mm40Var, Function1 function1, boolean z) {
        mm40 mm40Var2;
        fetVar.g0(1828852823);
        int i2 = i | 6 | (fetVar.g(bdzVar) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128) | (fetVar.h(z) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = pkd.d(fetVar) ? 2 : 1;
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            ngv ngvVar = new ngv(i3);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new gne(gqw0.n, (byte) 12));
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 32.0f, 7), fetVar);
            boolean zE = ((i2 & 112) == 32) | ((i2 & 896) == 256) | fetVar.e(i3) | ((57344 & i2) == 16384) | ((i2 & 7168) == 2048);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                d5d d5dVar = new d5d(i3, a4xVar, bdzVar, function1, z);
                fetVar.o0(d5dVar);
                objP = d5dVar;
            }
            g8x.i(ngvVar, mm40VarQ, null, ch80VarG, null, qw3Var, null, false, null, (Function1) objP, fetVar, 0, 948);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e160(mm40Var2, bdzVar, a4xVar, z, function1, i, (byte) 0);
        }
    }

    public static final void z(mm40 mm40Var, a4x a4xVar, l7m0 l7m0Var, bdz bdzVar, boolean z, Function1 function1, fet fetVar, int i) {
        int i2;
        bdz bdzVar2;
        boolean z2;
        fetVar.g0(-1761281712);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            bdzVar2 = bdzVar;
            i2 |= fetVar.g(bdzVar2) ? 2048 : 1024;
        } else {
            bdzVar2 = bdzVar;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i2 |= fetVar.h(z2) ? 16384 : 8192;
        } else {
            z2 = z;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            wom womVarF = mom.f(fetVar);
            mm40 mm40VarQ = i120.Q(mm40Var.e(o7k0.c), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            boolean zBooleanValue = ((Boolean) l7m0Var.getValue()).booleanValue();
            boolean z3 = (i2 & 458752) == 131072;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new xv50(function1, (byte) 10);
                fetVar.o0(objP);
            }
            mom.c(mm40VarQ, zBooleanValue, womVarF, null, false, null, (Function0) objP, null, u1c.M(1974550171, new j160(bdzVar2, a4xVar, z2, function1, (byte) 0), fetVar), fetVar, 100663296, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2(mm40Var, a4xVar, l7m0Var, bdzVar, z, function1, i);
        }
    }
}
