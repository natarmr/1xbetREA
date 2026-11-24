package a;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.ColorMatrixColorFilter;
import android.javax.sip.message.Response;
import android.media.ImageWriter;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Surface;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.favorites.impl.presentation.screen.category_image_header.models.CategoryImageHeaderTab;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class o2e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ugd f24526a = new ugd(-1723296676, false, new wgd(28));
    public static final ugd b = new ugd(1596832853, false, new ehd(4));
    public static final ugd c = new ugd(451427733, false, new ihd(14));
    public static final ugd d = new ugd(-161004157, false, new mhd(28));
    public static final ugd e = new ugd(191652357, false, new mhd(29));

    public static final void A(xkp xkpVar, boolean z, String str, Function1 function1, fet fetVar, int i) {
        uf5 of5Var;
        n3l0 l3l0Var;
        fetVar.g0(2042089346);
        int i2 = i | (fetVar.g(xkpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.g(str) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (xkpVar.h) {
                of5Var = new pf5(3, null);
            } else {
                of5Var = xkpVar.i ? new of5() : null;
            }
            boolean z2 = xkpVar.j;
            if (z2) {
                zcl zclVar = qmk.f28987a;
                l3l0Var = new m3l0();
            } else {
                zcl zclVar2 = qmk.f28987a;
                l3l0Var = new l3l0(16.0f);
            }
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, (z || z2) ? 0.0f : 8.0f, 7);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String str2 = xkpVar.b;
            s6l0 s6l0Var = new s6l0(new y1l0(((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), str2, str + Separators.SP + xkpVar.f), xkpVar.e, null, null, of5Var, xkpVar.j, Integer.valueOf(xkpVar.g.size()), 12);
            int i3 = i2 & 7168;
            int i4 = i2 & 14;
            boolean z3 = (i3 == 2048) | (i4 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new tvy(function1, xkpVar, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = (i4 == 4) | (i3 == 2048);
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new uvy(function1, xkpVar, (byte) 0);
                fetVar.o0(objP2);
            }
            xbc.o(null, s6l0Var, l3l0Var, null, false, function0, null, null, (Function1) objP2, fetVar, 0, 217);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n((Object) xkpVar, z, (Object) str, function1, i, (byte) 15);
        }
    }

    public static final void B(alp alpVar, boolean z, String str, Function1 function1, fet fetVar, int i) {
        n3l0 l3l0Var;
        fetVar.g0(-835034778);
        int i2 = i | (fetVar.g(alpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.g(str) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            pf5 pf5Var = alpVar.c ? new pf5(3, null) : null;
            boolean z2 = alpVar.d;
            if (z2) {
                zcl zclVar = qmk.f28987a;
                l3l0Var = new m3l0();
            } else {
                zcl zclVar2 = qmk.f28987a;
                l3l0Var = new l3l0(16.0f);
            }
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, (z || z2) ? 0.0f : 8.0f, 7);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String str2 = alpVar.f1079a;
            zfn zfnVar = zaq0.b;
            s6l0 s6l0Var = new s6l0(new y1l0(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), str2, str + Separators.SP + alpVar.b), null, Integer.valueOf(R.drawable.ic_glyph_express), new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary()), pf5Var, alpVar.d, null, 66);
            int i3 = i2 & 7168;
            int i4 = i2 & 14;
            boolean z3 = (i3 == 2048) | (i4 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z3 || objP == cl5Var) {
                objP = new wvy(function1, alpVar, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z4 = (i4 == 4) | (i3 == 2048);
            Object objP2 = fetVar.P();
            if (z4 || objP2 == cl5Var) {
                objP2 = new xvy(function1, alpVar, (byte) 0);
                fetVar.o0(objP2);
            }
            xbc.o(null, s6l0Var, l3l0Var, null, false, function0, null, null, (Function1) objP2, fetVar, 0, 217);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n((Object) alpVar, z, (Object) str, function1, i, (byte) 16);
        }
    }

    public static final void C(int i, e2d e2dVar, fet fetVar, usv usvVar, mm40 mm40Var, Function0 function0, Function1 function1) {
        mm40 mm40Var2;
        fetVar.g0(-1734156436);
        int i2 = i | 6 | (fetVar.g(e2dVar) ? 32 : 16) | (fetVar.g(usvVar) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            w((i2 & 57344) | ((i2 >> 3) & 112) | ((i2 << 3) & 896) | (i2 & 7168), e2dVar, fetVar, usvVar, k7n0.H(jm40Var, 10.0f), function0, function1);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var2, (Object) e2dVar, (Object) usvVar, (Object) function0, (Object) function1, i, (byte) 24);
        }
    }

    public static final void D(g9z g9zVar, a1l0 a1l0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1093709014);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(g9zVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(a1l0Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            if (a1l0Var != null) {
                boolean z = a1l0Var instanceof y0l0;
                jm40 jm40Var = jm40.b;
                if (z) {
                    fetVar2.e0(-1063182420);
                    zcl zclVar = qmk.f28987a;
                    obc.q(g9z.b(g9zVar, s5x0.L(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), xfn.a(fetVar2).e, 0.0f, 2), null, 7), ((y0l0) a1l0Var).b, false, null, null, null, null, null, fetVar, 0, 252);
                    fetVar.r(false);
                    fetVar2 = fetVar;
                } else if (a1l0Var instanceof z0l0) {
                    fetVar2.e0(-1062831624);
                    zcl zclVar2 = qmk.f28987a;
                    fetVar2 = fetVar2;
                    nkb.h(g9z.b(g9zVar, s5x0.L(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), xfn.a(fetVar2).e + 8.0f, 0.0f, 2), null, 7), new hjm(((z0l0) a1l0Var).f43573a, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar2, 384, 56);
                    fetVar2.r(false);
                } else {
                    fetVar2 = fetVar2;
                }
            }
            throw b1j.f(1212628301, fetVar2, false);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) g9zVar, (Object) a1l0Var, i, (byte) 28);
        }
    }

    public static final void E(slp slpVar, boolean z, j700 j700Var, zcz zczVar, Function1 function1, fet fetVar, int i) {
        int i2;
        zczVar.getClass();
        function1.getClass();
        fetVar.g0(-1752742751);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(jm40.b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(slpVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(j700Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(zczVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            mm40 mm40VarQ = i120.Q(o7k0.c, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
            float f = slpVar.e;
            float f2 = xfn.a(fetVar).d;
            float f3 = xfn.a(fetVar).d;
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(f2, f, f3, z ? 12.0f : 24.0f);
            boolean z2 = ((i2 & 112) == 32) | ((458752 & i2) == 131072) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new svy(slpVar, function1, z, b2);
                fetVar.o0(objP);
            }
            bfb.e(mm40VarQ, slpVar, lh80Var, j700Var, zczVar, function1, (Function1) objP, fetVar, i2 & 523376);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yvy(slpVar, z, j700Var, zczVar, function1, i, (byte) 0);
        }
    }

    public static final void F(l7m0 l7m0Var, g2v g2vVar, Function1 function1, fet fetVar, int i) {
        int i2;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-715113328);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(l7m0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(g2vVar) : fetVar2.i(g2vVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            qk40 qk40Var = (qk40) l7m0Var.getValue();
            if (qk40Var == null) {
                z = false;
            } else if (qk40Var instanceof ok40) {
                fetVar2.e0(-903098663);
                mdm mdmVar = ((ok40) qk40Var).f25388a;
                boolean z2 = (i2 & 896) == 256;
                Object objP = fetVar2.P();
                if (z2 || objP == ukd.f35823a) {
                    objP = new m040(function1, (byte) 21);
                    fetVar2.o0(objP);
                }
                jcb.l(null, mdmVar, false, (Function0) objP, fetVar, 0, 5);
                fetVar.r(false);
                fetVar2 = fetVar;
            } else if (qk40Var instanceof pk40) {
                fetVar2.e0(-902865202);
                fetVar2 = fetVar;
                jcb.l(null, g2v.b(g2vVar, ozb.K(36L), null, ldm.b, 0, 0, 0, 0, 0, 0L, 0L, 1018), false, null, fetVar2, 0, 13);
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar2;
                z = false;
                if (qk40Var instanceof nk40) {
                    fetVar2.e0(-902533471);
                    N(((nk40) qk40Var).f23665a, function1, fetVar2, (i2 >> 3) & 112);
                    fetVar2.r(false);
                }
            }
            throw b1j.f(-29134251, fetVar2, z);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) l7m0Var, (Object) g2vVar, (Object) function1, i, (byte) 13);
        }
    }

    public static final void G(g2v g2vVar, wk40 wk40Var, Function0 function0, fet fetVar, int i) {
        g2vVar.getClass();
        wk40Var.getClass();
        function0.getClass();
        fetVar.g0(-1323751766);
        int i2 = i | (fetVar.g(g2vVar) ? 4 : 2) | (fetVar.i(wk40Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            pz40 pz40VarQ = gkb.Q(wk40Var.w, null, fetVar, 0, 7);
            pz40 pz40VarQ2 = gkb.Q((n7m0) wk40Var.B.getValue(), null, fetVar, 0, 7);
            boolean z = (i2 & 112) == 32 || fetVar.i(wk40Var);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new f340(1, wk40Var, wk40.class, "onScreenEvent", "onScreenEvent(Lorg/xplatform/cyber/game/mlbb/impl/presentation/post_game/model/MlbbPostGameStatAction;)V", 0, (byte) 9);
                fetVar.o0(objP);
            }
            o(pz40VarQ, pz40VarQ2, g2vVar, (Function1) ((jhy) objP), function0, fetVar, (i2 << 6) & 58240);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtz(g2vVar, wk40Var, function0, i, (byte) 22);
        }
    }

    public static final void H(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(384768595);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            p0a0 p0a0Var = (p0a0) l7m0Var.getValue();
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            boolean zG = fetVar.g(p0a0Var.a());
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new imm(new ilm(secondary), new plm(p0a0Var.a(), ha50.TWO_LINES, secondary, fa50.f9191a), fmm.f9790a, backgroundContent, true, null);
                fetVar.o0(objP);
            }
            imm immVar = (imm) objP;
            mm40 mm40VarQ = i120.Q(o7k0.c, backgroundContent, jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new qu80(function1, (byte) 29);
                fetVar.o0(objP2);
            }
            hlm.c(null, immVar, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            if (p0a0Var instanceof o0a0) {
                fetVar.e0(-1925208493);
                S((o0a0) p0a0Var, function1, fetVar, ((i2 << 3) & 896) | 6);
                fetVar.r(false);
            } else if (p0a0Var instanceof l0a0) {
                fetVar.e0(-1925205115);
                v(((l0a0) p0a0Var).b, function1, fetVar, i3);
                fetVar.r(false);
            } else if (p0a0Var instanceof m0a0) {
                fetVar.e0(-1925200187);
                v(((m0a0) p0a0Var).b, function1, fetVar, i3);
                fetVar.r(false);
            } else {
                if (!(p0a0Var instanceof n0a0)) {
                    throw b1j.f(-1925210221, fetVar, false);
                }
                fetVar.e0(-1925195289);
                hmw0.V(0, fetVar);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function1, i, (byte) 7);
        }
    }

    public static final void I(mm40 mm40Var, v1g v1gVar, fet fetVar, int i) {
        float f;
        fet fetVar2 = fetVar;
        fetVar2.g0(40944391);
        int i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i | (fetVar2.g(v1gVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarC = o7k0.c(mm40Var, 1.0f);
            xx7 xx7Var = gqw0.n;
            nw3 nw3Var = uc9.e;
            x5d x5dVarA = w5d.a(nw3Var, xx7Var, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarC);
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
            String str = v1gVar.f36627a;
            a4x a4xVar = v1gVar.b;
            J(str, v1gVar.d, v1gVar.c, fetVar2, 0);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 110.0f), 46.0f);
            thg0 thg0VarA = shg0.a(nw3Var, gqw0.j, fetVar2, 6);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            Iterator itO = h97.o(fetVar2, mm40VarC1, shdVar4, -2082863174, a4xVar);
            int i3 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                int i5 = ((una0) next).f35951a;
                fetVar2.b0(1760624188, fetVar2.G(Integer.valueOf(i5), Integer.valueOf(i3)));
                if (i3 == a4xVar.size() - 1) {
                    zcl zclVar2 = qmk.f28987a;
                    f = 0.0f;
                } else {
                    zcl zclVar3 = qmk.f28987a;
                    f = 4.0f;
                }
                jm40 jm40Var2 = jm40Var;
                j0x.b(a8k0.F(i5, 0, fetVar2), null, e0(o7k0.e(o7k0.s(s5x0.N(jm40Var2, 0.0f, 0.0f, f, 0.0f, 11), 34.0f), 46.0f), "CYBER_CARD"), null, null, 0.0f, null, fetVar, 56, 120);
                fetVar2 = fetVar;
                fetVar2.r(false);
                i3 = i4;
                itO = itO;
                jm40Var = jm40Var2;
            }
            ohs0.x(fetVar2, false, true, true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eod(mm40Var, v1gVar, i, (byte) 16);
        }
    }

    public static final void J(String str, String str2, long j, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1309690593);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16) | (fetVar2.f(j) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), 64.0f), 18.0f);
            zcl zclVar2 = qmk.c;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarE, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 4.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar2, 54);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(str, e0(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), "PLAYER_NAME"), staticColors.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.e(), fetVar2, i2 & 14, 24960, 109560);
            v8q0.a(str2, e0(jm40Var, "PLAYER_SCORE"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, ((i2 >> 3) & 14) | 48, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new my2((Object) str, (Object) str2, j, i, (byte) 1);
        }
    }

    public static final void K(mm40 mm40Var, bef0 bef0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(750065050);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(bef0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            ngv ngvVar = new ngv(bef0Var.b);
            zcl zclVar = qmk.f28987a;
            byte b2 = 14;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b2));
            qw3 qw3Var2 = new qw3(4.0f, true, new jf4(b2));
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 4.0f, 0.0f, 24.0f, 5), fetVar);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new xwe0(bef0Var, function1, (byte) 29);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            g8x.i(ngvVar, jm40Var, null, ch80VarG, qw3Var2, qw3Var, null, false, null, (Function1) objP, fetVar, (i2 << 3) & 112, 916);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var2, bef0Var, function1, i, (byte) 27);
        }
    }

    public static final void L(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i) {
        mdm mdmVar2;
        mm40 mm40Var2;
        fetVar.g0(-1066173406);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            mdmVar2 = mdmVar;
            i2 |= fetVar.g(mdmVar2) ? 32 : 16;
        } else {
            mdmVar2 = mdmVar;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(n0qVar, 0.0f, 0.0f, 0.0f, 40.0f, 7);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new pme0(function1, (byte) 7);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar2, false, (Function0) objP, fetVar, i2 & 112, 5);
            fetVar.r(true);
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var2, mdmVar, function1, i, (byte) 27);
        }
    }

    public static final void M(mm40 mm40Var, def0 def0Var, Function1 function1, fet fetVar, int i) {
        def0Var.getClass();
        function1.getClass();
        fetVar.g0(-880954525);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(def0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE = i120.Q(mm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n).e(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (def0Var instanceof bef0) {
                fetVar.e0(2001271889);
                K(null, (bef0) def0Var, function1, fetVar, i2 & 1008);
                fetVar.r(false);
            } else {
                if (!(def0Var instanceof cef0)) {
                    throw b1j.f(-628181365, fetVar, false);
                }
                fetVar.e0(2001466600);
                L(null, ((cef0) def0Var).f4209a, function1, fetVar, i2 & 896);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rwc0(mm40Var, def0Var, function1, i, (byte) 19);
        }
    }

    public static final void N(a4x a4xVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1205840102);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(a4xVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            float f = xfn.a(fetVar).c;
            int i3 = i2;
            n0q n0qVar = o7k0.c;
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarU = s5x0.u(f, 0.0f, f, 28.0f, 2);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new or0(a4xVar, function1, (byte) 21);
                fetVar.o0(objP);
            }
            b8k0.e(n0qVar, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP, fetVar, 6, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lr0((byte) 6, i, a4xVar, function1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void O(ilp ilpVar, boolean z, String str, Function1 function1, fet fetVar, int i) {
        uf5 of5Var;
        byte b2;
        fetVar.g0(1739509516);
        int i2 = i | (fetVar.g(ilpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.g(str) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        byte b3 = 0;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (ilpVar.h) {
                of5Var = new pf5(3, null);
            } else {
                of5Var = ilpVar.i ? new of5() : null;
            }
            String str2 = ilpVar.b;
            y1l0 y1l0Var = new y1l0(((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), str2, str + Separators.SP + ilpVar.g);
            b8l0 u6l0Var = ilpVar.o ? new u6l0(y1l0Var, ilpVar.f, of5Var, ilpVar.p, ilpVar.q, 12) : new t6l0(y1l0Var, ilpVar.m.b, ilpVar.f, of5Var, 24);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, z ? 0.0f : 8.0f, 7);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            l3l0 l3l0Var = new l3l0(16.0f);
            int i3 = i2 & 7168;
            int i4 = i2 & 14;
            boolean z2 = (i3 == 2048) | (i4 == 4);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z2 || objP == obj) {
                objP = new zvy(function1, ilpVar, b3);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = (i3 == 2048) | (i4 == 4);
            Object objP2 = fetVar.P();
            if (z3 || objP2 == obj) {
                b2 = 1;
                objP2 = new zvy(function1, ilpVar, b2);
                fetVar.o0(objP2);
            } else {
                b2 = 1;
            }
            Function0 function2 = (Function0) objP2;
            int i5 = (i4 == 4 ? b2 : (byte) 0) | (i3 == 2048 ? b2 : (byte) 0);
            Object objP3 = fetVar.P();
            if (i5 != 0 || objP3 == obj) {
                objP3 = new awy(function1, ilpVar, b3);
                fetVar.o0(objP3);
            }
            xbc.o(null, u6l0Var, l3l0Var, null, false, function0, function2, null, (Function1) objP3, fetVar, 0, 153);
            fetVar.r(b2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n((Object) ilpVar, z, (Object) str, function1, i, (byte) 17);
        }
    }

    public static final void P(i1l0 i1l0Var, Function1 function1, fet fetVar, int i) {
        i1l0Var.getClass();
        function1.getClass();
        fetVar.g0(689055);
        byte b2 = 2;
        int i2 = i | (fetVar.g(i1l0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            pkk0 pkk0Var = (pkk0) fetVar.k(bmd.q);
            boolean zG = fetVar.g(pkk0Var);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new ifc(pkk0Var, b2);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = o050.W(pzw.A(6, fetVar, jm40.b, (Function0) objP));
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40VarW.e(n0qVar);
            androidx.compose.runtime.d dVar = zaq0.b;
            long background = ((ThemeColors) fetVar.k(dVar)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarE, background, ljcVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            imm immVar = new imm(new ilm(((ThemeColors) fetVar.k(dVar)).getSecondary()), new plm((String) i1l0Var.e().f27863a, ((ThemeColors) fetVar.k(dVar)).getSecondary(), fa50.f9191a), fmm.f9790a, ((ThemeColors) fetVar.k(dVar)).getBackgroundContent(), xczVarA.c(), null);
            boolean z = (i2 & 112) == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == obj) {
                objP2 = new uck0(function1, (byte) 3);
                fetVar.o0(objP2);
            }
            hlm.c(null, immVar, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            mm40 mm40VarQ2 = i120.Q(n0qVar, ((ThemeColors) fetVar.k(dVar)).getBackground(), ljcVar);
            zx7 zx7Var = gqw0.e;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = new ejk0((byte) 19);
                fetVar.o0(objP3);
            }
            Function1 function2 = (Function1) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = new ejk0((byte) 20);
                fetVar.o0(objP4);
            }
            ay3.f(i1l0Var, mm40VarQ2, function2, zx7Var, "Sport Cashback Screen Animated Content", (Function1) objP4, u1c.M(-1478993603, new d2s(function1, xczVarA, (byte) 21), fetVar), fetVar, (i2 & 14) | 1797504, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(i1l0Var, function1, i, (byte) 12);
        }
    }

    public static final void Q(olp olpVar, boolean z, boolean z2, String str, Function1 function1, fet fetVar, int i) {
        uf5 of5Var;
        ugg0 ugg0Var;
        boolean z3;
        fetVar.g0(689340102);
        int i2 = i | (fetVar.g(olpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.g(str) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            if (olpVar.g) {
                of5Var = new pf5(3, null);
            } else {
                of5Var = olpVar.h ? new of5() : null;
            }
            if (z2) {
                zcl zclVar = qmk.i;
                zcl zclVar2 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar2, zclVar2, zclVar, zclVar);
            } else {
                zcl zclVar3 = qmk.f28987a;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar3, zclVar3, zclVar3, zclVar3);
            }
            String str2 = olpVar.b;
            zfn zfnVar = zaq0.b;
            y1l0 y1l0Var = new y1l0(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), str2, str + Separators.SP + olpVar.f);
            b8l0 u6l0Var = olpVar.n ? new u6l0(y1l0Var, olpVar.e, of5Var, olpVar.o, olpVar.r, 12) : new t6l0(y1l0Var, olpVar.j.b, olpVar.e, of5Var, 24);
            float f = (z || z2) ? 8.0f : 0.0f;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, f, 7), ugg0Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z4 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
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
            mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
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
            mm40 mm40VarN = s5x0.N(jm40Var, 20.0f, 0.0f, 0.0f, 0.0f, 14);
            boolean z5 = !z2;
            int i3 = i2 & 57344;
            int i4 = i2 & 14;
            boolean z6 = (i3 == 16384) | (i4 == 4);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z6 || objP == cl5Var) {
                objP = new bwy(function1, olpVar, (byte) 0);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z7 = (i3 == 16384) | (i4 == 4);
            Object objP2 = fetVar.P();
            if (z7 || objP2 == cl5Var) {
                z3 = true;
                objP2 = new bwy(function1, olpVar, 1 == true ? 1 : 0);
                fetVar.o0(objP2);
            } else {
                z3 = true;
            }
            Function0 function2 = (Function0) objP2;
            boolean z8 = (i3 == 16384 ? z3 : false) | (i4 == 4 ? z3 : false);
            Object objP3 = fetVar.P();
            if (z8 != 0 || objP3 == cl5Var) {
                objP3 = new cwy(function1, olpVar, (byte) 0);
                fetVar.o0(objP3);
            }
            xbc.o(mm40VarN, u6l0Var, null, null, z5, function0, function2, null, (Function1) objP3, fetVar, 0, 140);
            fetVar.r(z3);
            fetVar.r(z3);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qg5((Object) olpVar, z, z2, (Object) str, (wdr) function1, i, (byte) 4);
        }
    }

    public static final void R(clp clpVar, boolean z, boolean z2, String str, Function1 function1, fet fetVar, int i) {
        ugg0 ugg0Var;
        fetVar.g0(1645022954);
        int i2 = i | (fetVar.g(clpVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.h(z2) ? 256 : 128) | (fetVar.g(str) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            if (z2) {
                zcl zclVar = qmk.i;
                zcl zclVar2 = qmk.f28987a;
                ugg0Var = new ugg0(zclVar2, zclVar2, zclVar, zclVar);
            } else {
                zcl zclVar3 = qmk.f28987a;
                ugg0 ugg0Var2 = vgg0.f37379a;
                ugg0Var = new ugg0(zclVar3, zclVar3, zclVar3, zclVar3);
            }
            float f = (z || z2) ? 8.0f : 0.0f;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = lgb.J(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, f, 7), ugg0Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
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
            mm40 mm40VarN = s5x0.N(jm40Var, 20.0f, 0.0f, 0.0f, 0.0f, 14);
            String str2 = clpVar.f4571a;
            w6l0 w6l0Var = new w6l0(new y1l0(((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), str2, str + Separators.SP + clpVar.c), Integer.valueOf(clpVar.f), new y3d(((ThemeColors) fetVar.k(zfnVar)).getSecondary()));
            boolean z4 = z2 ^ true;
            boolean z5 = ((i2 & 57344) == 16384) | ((i2 & 14) == 4);
            Object objP = fetVar.P();
            if (z5 || objP == ukd.f35823a) {
                objP = new vvy(function1, clpVar, (byte) 0);
                fetVar.o0(objP);
            }
            xbc.o(mm40VarN, w6l0Var, null, null, z4, (Function0) objP, null, null, null, fetVar, 0, 460);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qg5((Object) clpVar, z, z2, (Object) str, (wdr) function1, i, (byte) 3);
        }
    }

    public static final void S(o0a0 o0a0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1200263590);
        int i3 = i & 6;
        y5d y5dVar = y5d.f42040a;
        if (i3 == 0) {
            i2 = (fetVar.g(y5dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(o0a0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 0.0f, 8.0f, 1);
            vxl vxlVar = vxl.b;
            fyl fylVar = o0a0Var.b;
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new hs80(function1, (byte) 11);
                fetVar.o0(objP);
            }
            ebc.r(mm40VarL, fylVar, vxlVar, (Function1) objP, null, fetVar, 384, 40);
            l(y5dVar.b(jm40Var, true), o0a0Var.c, fetVar, 64);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o680((Object) o0a0Var, (Object) function1, i, (byte) 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void T(mm40 mm40Var, ukl uklVar, fet fetVar, int i) {
        int i2;
        byte b2;
        fet fetVar2;
        boolean z;
        fet fetVar3;
        boolean z2;
        String str;
        fet fetVar4;
        fet fetVar5;
        float f;
        fet fetVar6 = fetVar;
        fetVar6.g0(1965523367);
        if ((i & 6) == 0) {
            i2 = i | (fetVar6.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar6.g(uklVar) ? 32 : 16;
        }
        if (fetVar6.U(i2 & 1, (i2 & 19) != 18)) {
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar6.k(m8m0.f21378a)).m123getWhite0d7_KjU();
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar6, 6);
            int iHashCode = Long.hashCode(fetVar6.T);
            bh90 bh90VarM = fetVar6.m();
            mm40 mm40VarC0 = kbc.c0(fetVar6, mm40Var);
            mkd.c0.getClass();
            fetVar6.i0();
            if (fetVar6.S) {
                fetVar6.l(e7z.u1);
            } else {
                fetVar6.r0();
            }
            jpm0.o(fetVar6, x5dVarA, gqw0.x);
            jpm0.o(fetVar6, bh90VarM, gqw0.w);
            jpm0.o(fetVar6, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar6);
            jpm0.o(fetVar6, mm40VarC0, gqw0.v);
            qc0 qc0Var = uklVar.b;
            String str2 = uklVar.e;
            int iOrdinal = qc0Var.ordinal();
            jm40 jm40Var = jm40.b;
            if (iOrdinal == 0) {
                z = false;
                fetVar6.e0(358445303);
                mm40 mm40VarA = o7k0.A(jm40Var, null, 3);
                zcl zclVar = qmk.f28987a;
                j6n.h(uklVar.e, dqo0.f6527a, e0(s5x0.N(mm40VarA, 0.0f, 0.0f, 0.0f, 8.0f, 7), "AGGREGATOR_BONUSES_TAG_PICTUREL_STYLE"), 0, 0, fetVar6, 48, 24);
                long j = qmk.r;
                long j2 = qmk.w;
                v8q0.a(uklVar.d, null, jM123getWhite0d7_KjU, new n05(j, j2, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j2, null, j1t0.f15753a, 0L, null, 0, 0, qmk.I, 16646109), fetVar, 0, 24960, 110578);
                fet fetVar7 = fetVar;
                fetVar7.r(false);
                fetVar3 = fetVar7;
            } else if (iOrdinal == 1) {
                z = false;
                fetVar6.e0(359361322);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                long j3 = qmk.p;
                long j4 = qmk.q;
                long j5 = qmk.n;
                v8q0.a(uklVar.e, mm40VarN, jM123getWhite0d7_KjU, new n05(j3, j4, j5), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110576);
                v8q0.a(uklVar.d, null, jM123getWhite0d7_KjU, new n05(qmk.r, qmk.w, j5), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.p(), fetVar, 0, 24960, 110578);
                fet fetVar8 = fetVar;
                fetVar8.r(false);
                fetVar3 = fetVar8;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    throw b1j.f(-681172543, fetVar6, false);
                }
                fetVar6.e0(360523698);
                if (uklVar.c.length() > 0) {
                    fetVar6.e0(360572957);
                    if (str2.length() > 0) {
                        zcl zclVar3 = qmk.f28987a;
                        f = 8.0f;
                    } else {
                        zcl zclVar4 = qmk.f28987a;
                        f = 0.0f;
                    }
                    mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, f, 7);
                    long j6 = qmk.r;
                    long j7 = qmk.w;
                    str = str2;
                    z2 = false;
                    v8q0.a(uklVar.c, mm40VarN2, jM123getWhite0d7_KjU, new n05(j6, j7, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j7, null, j1t0.f15753a, 0L, null, 0, 0, qmk.I, 16646109), fetVar, 0, 24960, 110576);
                    fet fetVar9 = fetVar;
                    fetVar9.r(false);
                    fetVar4 = fetVar9;
                } else {
                    z2 = false;
                    str = str2;
                    fetVar6.e0(361255825);
                    fetVar6.r(false);
                    fetVar4 = fetVar6;
                }
                if (str.length() > 0) {
                    fetVar4.e0(361350127);
                    zcl zclVar5 = qmk.f28987a;
                    mm40 mm40VarN3 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    long j8 = qmk.p;
                    long j9 = qmk.q;
                    v8q0.a(uklVar.e, mm40VarN3, jM123getWhite0d7_KjU, new n05(j8, j9, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, j9, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110576);
                    fet fetVar10 = fetVar;
                    fetVar10.r(z2);
                    fetVar5 = fetVar10;
                } else {
                    fetVar4.e0(361984945);
                    fetVar4.r(z2);
                    fetVar5 = fetVar4;
                }
                fetVar5.r(z2);
                z = z2;
                fetVar3 = fetVar5;
            }
            fetVar3.r(true);
            b2 = z;
            fetVar2 = fetVar3;
        } else {
            b2 = 0;
            fetVar6.X();
            fetVar2 = fetVar6;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl(mm40Var, uklVar, i, b2);
        }
    }

    public static final void U(mm40 mm40Var, f1l0 f1l0Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(90023824);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(f1l0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40Var, backgroundContent, ljcVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            rcb.r(s5x0.L(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), xfn.a(fetVar2).e, 0.0f, 2), new se((String) f1l0Var.e().b, f1l0Var.a(), null), null, fetVar2, 0, 4);
            mm40 mm40VarL = s5x0.L(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 18.0f, 5), xfn.a(fetVar2).e, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
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
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objP = fetVar2.P();
            byte b2 = 3;
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new elk0(function1, b2);
                fetVar2.o0(objP);
            }
            mm40 mm40VarH = dw9.h(1.0f, j120.b0(jm40Var, (Function1) objP), true);
            String strD = f1l0Var.d();
            y5q0 y5q0Var = new y5q0(3, null, null, 6);
            String str = (String) f1l0Var.e().c;
            String str2 = (String) f1l0Var.e().d;
            pz40 pz40Var = s6t0.f31722a;
            s6q0 s6q0Var = new s6q0(strD, e6q0.f7299a, new m6q0(str2, new y3d(s6t0.b().f33626a.getTextPrimary())), r7q0.f29989a, true, false, y5q0Var, null, str, 27392);
            boolean z3 = i3 == 256;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new elk0(function1, (byte) 4);
                fetVar2.o0(objP2);
            }
            jwb.o(mm40VarH, s6q0Var, 0, null, (Function1) objP2, fetVar, 0, 12);
            mm40 mm40VarN = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            wul wulVar = new wul(lul.e, oe9.b, new ue9((String) f1l0Var.e().e), f1l0Var.f(), f1l0Var.c(), false);
            boolean z4 = i3 == 256;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new uck0(function1, (byte) 4);
                fetVar.o0(objP3);
            }
            qzb.n(mm40VarN, wulVar, (Function0) objP3, fetVar, 0, 0);
            fetVar.r(true);
            mm40 mm40VarQ2 = i120.Q(jm40Var, ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ljcVar);
            long background = ((ThemeColors) fetVar.k(zfnVar)).getBackground();
            zcl zclVar2 = qmk.l;
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarL2 = s5x0.L(s5x0.N(i120.Q(mm40VarQ2, background, new ugg0(zclVar2, zclVar2, zclVar3, zclVar3)), 0.0f, 12.0f, 0.0f, 0.0f, 13), xfn.a(fetVar).e, 0.0f, 2);
            rqm rqmVar = new rqm((vui0) new tui0((String) f1l0Var.e().f, null), (pui0) new nui0(null, null, new m0x(R.drawable.ic_info_rules, null, 6), null, null, null, 0.0f, 251), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508);
            boolean z5 = i3 == 256;
            Object objP4 = fetVar.P();
            if (z5 || objP4 == cl5Var) {
                objP4 = new uck0(function1, (byte) 5);
                fetVar.o0(objP4);
            }
            obc.q(mm40VarL2, rqmVar, false, null, (Function0) objP4, null, null, null, fetVar, 0, 236);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var, f1l0Var, function1, i, (byte) 9);
        }
    }

    public static final void V(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        function0.getClass();
        fetVar.g0(-683600229);
        int i2 = i | 6 | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarR = knm0.r(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
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
            jr8 jr8Var = jr8.f16991a;
            zx7 zx7Var = gqw0.e;
            jm40 jm40Var = jm40.b;
            jcb.l(jr8Var.b(jm40Var, zx7Var), mdmVar, false, function0, fetVar, (i2 & 112) | ((i2 << 3) & 7168), 4);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gg8(mm40Var2, mdmVar, function0, i, (byte) 15);
        }
    }

    public static final fv3 W(wsy wsyVar) {
        xxs0 xxs0Var;
        xxs0 xxs0Var2;
        wsyVar.getClass();
        if (wsyVar.j0() instanceof kkq) {
            fv3 fv3VarW = W(thb.P(wsyVar));
            fv3 fv3VarW2 = W(thb.Z(wsyVar));
            return new fv3(xsm0.n(ucx.W(thb.P((wsy) fv3VarW.f10195a), thb.Z((wsy) fv3VarW2.f10195a)), wsyVar), xsm0.n(ucx.W(thb.P((wsy) fv3VarW.b), thb.Z((wsy) fv3VarW2.b)), wsyVar));
        }
        iys0 iys0VarS = wsyVar.S();
        boolean z = true;
        if (wsyVar.S() instanceof baa) {
            iys0VarS.getClass();
            pzs0 pzs0VarF = ((baa) iys0VarS).f();
            wsy wsyVarB = pzs0VarF.b();
            wsyVarB.getClass();
            wsy wsyVarI = e0t0.i(wsyVarB, wsyVar.U());
            int iOrdinal = pzs0VarF.a().ordinal();
            if (iOrdinal == 1) {
                return new fv3(wsyVarI, vsm0.q(wsyVar).p());
            }
            if (iOrdinal == 2) {
                return new fv3(e0t0.i(vsm0.q(wsyVar).o(), wsyVar.U()), wsyVarI);
            }
            hny.n(pzs0VarF, "Only nontrivial projections should have been captured, not: ");
            return null;
        }
        if (wsyVar.J().isEmpty() || wsyVar.J().size() != iys0VarS.getParameters().size()) {
            return new fv3(wsyVar, wsyVar);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listJ = wsyVar.J();
        List parameters = iys0VarS.getParameters();
        parameters.getClass();
        for (Pair pair : CollectionsKt.T0(listJ, parameters)) {
            pzs0 pzs0Var = (pzs0) pair.f46059a;
            hzs0 hzs0Var = (hzs0) pair.b;
            hzs0Var.getClass();
            t3u0 t3u0VarT = hzs0Var.t();
            if (t3u0VarT == null) {
                xzs0.a(35);
                throw null;
            }
            if (pzs0Var == null) {
                xzs0.a(36);
                throw null;
            }
            xzs0 xzs0Var = xzs0.b;
            int iOrdinal2 = (pzs0Var.c() ? t3u0.e : xzs0.b(t3u0VarT, pzs0Var.a())).ordinal();
            if (iOrdinal2 == 0) {
                wsy wsyVarB2 = pzs0Var.b();
                wsyVarB2.getClass();
                wsy wsyVarB3 = pzs0Var.b();
                wsyVarB3.getClass();
                xxs0Var2 = new xxs0(hzs0Var, wsyVarB2, wsyVarB3);
            } else if (iOrdinal2 == 1) {
                wsy wsyVarB4 = pzs0Var.b();
                wsyVarB4.getClass();
                int i = rek.f30339a;
                ym40 ym40VarC = oek.c(hzs0Var);
                ym40VarC.getClass();
                kzj0 kzj0VarP = ym40VarC.c().p();
                kzj0VarP.getClass();
                xxs0Var2 = new xxs0(hzs0Var, wsyVarB4, kzj0VarP);
            } else {
                if (iOrdinal2 != 2) {
                    t9f.b();
                    return null;
                }
                int i2 = rek.f30339a;
                ym40 ym40VarC2 = oek.c(hzs0Var);
                ym40VarC2.getClass();
                kzj0 kzj0VarO = ym40VarC2.c().o();
                wsy wsyVarB5 = pzs0Var.b();
                wsyVarB5.getClass();
                xxs0Var2 = new xxs0(hzs0Var, kzj0VarO, wsyVarB5);
            }
            if (pzs0Var.c()) {
                arrayList.add(xxs0Var2);
                arrayList2.add(xxs0Var2);
            } else {
                fv3 fv3VarW3 = W(xxs0Var2.b);
                wsy wsyVar2 = (wsy) fv3VarW3.f10195a;
                wsy wsyVar3 = (wsy) fv3VarW3.b;
                fv3 fv3VarW4 = W(xxs0Var2.c);
                wsy wsyVar4 = (wsy) fv3VarW4.f10195a;
                wsy wsyVar5 = (wsy) fv3VarW4.b;
                hzs0 hzs0Var2 = xxs0Var2.f41674a;
                xxs0 xxs0Var3 = new xxs0(hzs0Var2, wsyVar3, wsyVar4);
                xxs0 xxs0Var4 = new xxs0(hzs0Var2, wsyVar2, wsyVar5);
                arrayList.add(xxs0Var3);
                arrayList2.add(xxs0Var4);
            }
        }
        if (arrayList.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            xxs0Var = (xxs0) it.next();
            xxs0Var.getClass();
        } while (ysy.f43192a.b(xxs0Var.b, xxs0Var.c));
        return new fv3(z ? vsm0.q(wsyVar).o() : d0(wsyVar, arrayList), d0(wsyVar, arrayList2));
    }

    public static final x04 X(boolean z) {
        x04 x04Var = new x04();
        x04Var.f40052a = z ? 1 : 0;
        return x04Var;
    }

    public static final z04 Y(int i) {
        z04 z04Var = new z04();
        z04Var.f43546a = i;
        return z04Var;
    }

    public static final c14 Z(Object obj) {
        c14 c14Var = new c14();
        c14Var.f3556a = obj;
        return c14Var;
    }

    public static final void a(mm40 mm40Var, ph0 ph0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        ph0Var.getClass();
        fetVar.g0(1241829964);
        int i2 = i | 6 | (fetVar.g(ph0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarE0 = e0(o7k0.e(o7k0.s(mm40Var2, 148.0f), 64.0f), "CATEGORY_ICON_RIGHT");
            if (ph0Var instanceof nh0) {
                fetVar.e0(-1491453506);
                b(mm40VarE0, (nh0) ph0Var, function1, fetVar, i2 & 1008);
                fetVar.r(false);
            } else {
                if (!ph0Var.equals(oh0.f25241a)) {
                    throw b1j.f(-602302759, fetVar, false);
                }
                fetVar.e0(-1491224385);
                mrv.b(0, fetVar, null);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ih0(mm40Var2, ph0Var, function1, i, (byte) 3);
        }
    }

    public static yz2 a0(Surface surface, int i, grm0 grm0Var, Handler handler) {
        ImageWriter imageWriterNewInstance;
        handler.getClass();
        int i2 = Build.VERSION.SDK_INT;
        int i3 = grm0Var.f11787a;
        if (i2 >= 29) {
            imageWriterNewInstance = ImageWriter.newInstance(surface, 1, i3);
            imageWriterNewInstance.getClass();
        } else {
            Log.w("CXCP", "Ignoring format (" + ((Object) grm0.b(i3)) + ") for " + ((Object) ("Input-" + i)) + ". Android " + i2 + " does not support creating ImageWriters with formats. This may lead to unexpected behaviors.");
            imageWriterNewInstance = ImageWriter.newInstance(surface, 1);
            imageWriterNewInstance.getClass();
        }
        yz2 yz2Var = new yz2(imageWriterNewInstance, i);
        imageWriterNewInstance.setOnImageReleasedListener(yz2Var, handler);
        return yz2Var;
    }

    public static final void b(mm40 mm40Var, nh0 nh0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        nh0 nh0Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1269946598);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(nh0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 148.0f), 64.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), vgg0.a(12.0f));
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar2.P();
            if (z || objP2 == cl5Var) {
                objP2 = new jh0(function1, nh0Var, (byte) 3);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP2, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.a(0.0f);
                fetVar2.o0(objP3);
            }
            agk0 agk0Var = (agk0) objP3;
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = androidx.compose.runtime.e.b(0);
                fetVar2.o0(objP4);
            }
            cgk0 cgk0Var = (cgk0) objP4;
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP5);
            }
            pz40 pz40Var = (pz40) objP5;
            mm40 mm40VarE0 = e0(s5x0.M(new x7z(1.0f, true), 8.0f, 8.0f, 12.0f, 8.0f), "CATEGORY_CARD_TITLE");
            Object objP6 = fetVar2.P();
            if (objP6 == cl5Var) {
                objP6 = new kh0(agk0Var, cgk0Var, pz40Var, (byte) 2);
                fetVar2.o0(objP6);
            }
            mm40 mm40VarA = pai0.a(mm40VarE0, false, (Function1) objP6);
            String str = nh0Var.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            qrq qrqVar = j1t0.b;
            long j = qmk.q;
            y9q0 y9q0Var = new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.D, 16646045);
            n05 n05Var = new n05(j, qmk.r, idm0.s(0.25d));
            f2q0 f2q0Var = new f2q0(5);
            Object objP7 = fetVar2.P();
            if (objP7 == cl5Var) {
                objP7 = new kh0(agk0Var, cgk0Var, pz40Var, (byte) 3);
                fetVar2.o0(objP7);
            }
            v8q0.a(str, mm40VarA, textPrimary, n05Var, 0L, null, null, null, 0L, f2q0Var, 0L, 2, true, 3, 0, (Function1) objP7, y9q0Var, fetVar, 0, 1600896, 35824);
            fetVar2 = fetVar;
            jm40 jm40Var = jm40.b;
            qxw.o(fetVar2, o7k0.s(jm40Var, 8.0f));
            mm40 mm40VarN = o7k0.n(jm40Var, 48.0f);
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            zcl zclVar2 = qmk.g;
            mm40 mm40VarE1 = e0(i120.Q(mm40VarN, background, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "CATEGORY_CARD_BOX");
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE1);
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
            Object objP8 = fetVar2.P();
            if (objP8 == cl5Var) {
                objP8 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar2.o0(objP8);
            }
            pz40 pz40Var2 = (pz40) objP8;
            k1x k1xVar = new k1x((Context) fetVar2.k(dy2.b));
            nh0Var2 = nh0Var;
            k1xVar.c = nh0Var2.c;
            t1x.f(k1xVar, R.drawable.ic_glyph_category_new);
            t1x.c(k1xVar, R.drawable.ic_glyph_category_new);
            k1xVar.c((int) pkd.b(32.0f, fetVar2));
            o1x o1xVarA = k1xVar.a();
            Object objP9 = fetVar2.P();
            if (objP9 == cl5Var) {
                objP9 = new we(pz40Var2, (byte) 7);
                fetVar2.o0(objP9);
            }
            mz3 mz3VarX = l7x.X(o1xVarA, (Function1) objP9, null, fetVar2, 384, 26);
            mm40 mm40VarE2 = e0(o7k0.n(jm40Var, 32.0f), "CATEGORY_CARD_IMAGE");
            Object objP10 = fetVar2.P();
            if (objP10 == cl5Var) {
                objP10 = new we(pz40Var2, (byte) 8);
                fetVar2.o0(objP10);
            }
            j0x.b(mz3VarX, null, pai0.a(mm40VarE2, false, (Function1) objP10), null, gqw0.A, 0.0f, new m78(((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), 5), fetVar2, 24624, 40);
            fetVar2.r(true);
            qxw.o(fetVar2, o7k0.s(jm40Var, 8.0f));
            fetVar2.r(true);
        } else {
            nh0Var2 = nh0Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lh0(mm40Var, nh0Var2, function1, i, (byte) 3);
        }
    }

    public static final n0x b0(int i, long j, String str, List list, boolean z) {
        String string;
        if (z && list.contains(Integer.valueOf(i))) {
            str.getClass();
            bzu bzuVar = new bzu((byte) 23);
            bzuVar.g("static");
            bzuVar.g("img");
            bzuVar.g("android");
            bzuVar.g("TopChamps");
            if (str.length() == 0) {
                str = String.valueOf(i);
            }
            axq.u(bzuVar, str, "backgrounds", "icon.svg");
            string = ((StringBuilder) bzuVar.b).toString();
        } else if (j != 0) {
            bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
            rz4.s(j, ".svg", bzuVarD);
            string = ((StringBuilder) bzuVarD.b).toString();
        } else {
            string = "";
        }
        return new n0x(string);
    }

    public static final void c(mm40 mm40Var, pe0 pe0Var, float f, Function1 function1, Function1 function2, Function1 function3, fet fetVar, int i) {
        Function1 function4;
        Function1 function5;
        mm40 mm40Var2;
        pe0Var.getClass();
        fetVar.g0(-760498812);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(pe0Var) : fetVar.i(pe0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            function4 = function2;
            i2 |= fetVar.i(function4) ? 16384 : 8192;
        } else {
            function4 = function2;
        }
        if ((196608 & i) == 0) {
            function5 = function3;
            i2 |= fetVar.i(function5) ? 131072 : 65536;
        } else {
            function5 = function3;
        }
        boolean z = true;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            boolean zIsNaN = Float.isNaN(f);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarO = zIsNaN ? ny9.O(1.6666666f, jm40Var, false) : ny9.O(1.6666666f, o7k0.s(jm40Var, f), false);
            if (pe0Var instanceof st0) {
                fetVar.e0(-66981554);
                int i3 = i2 & 112;
                int i4 = i2 >> 6;
                e(mm40VarO, (st0) pe0Var, function4, function5, fetVar, i3 | (i4 & 896) | (i4 & 7168));
                fetVar.r(false);
            } else if (pe0Var instanceof ra0) {
                fetVar.e0(-66697036);
                boolean z2 = (i2 & 7168) == 2048;
                int i5 = i2 & 112;
                if (i5 != 32 && ((i2 & 64) == 0 || !fetVar.i(pe0Var))) {
                    z = false;
                }
                boolean z3 = z2 | z;
                Object objP = fetVar.P();
                if (z3 || objP == ukd.f35823a) {
                    objP = new ct0(function1, pe0Var, (byte) 2);
                    fetVar.o0(objP);
                }
                d(y860.W(mm40VarO, null, null, false, null, (Function0) objP, 28), (ra0) pe0Var, fetVar, i5);
                fetVar.r(false);
            } else if (pe0Var instanceof fp1) {
                fetVar.e0(-66332724);
                f(0, fetVar, mm40VarO);
                fetVar.r(false);
            } else {
                fetVar.e0(-66247970);
                fetVar.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ht0(mm40Var2, pe0Var, f, function1, function2, function3, i, (byte) 2);
        }
    }

    public static final y3d c0(int i, List list, boolean z) {
        if (!z || !list.contains(Integer.valueOf(i))) {
            return null;
        }
        int i2 = y3d.h;
        return new y3d(y3d.g);
    }

    public static final void d(mm40 mm40Var, ra0 ra0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1905683453);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar2.g(ra0Var) : fetVar2.i(ra0Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40Var, vgg0.a(16.0f));
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarJ, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarB = jr8.f16991a.b(s5x0.J(o7k0.y(jm40Var, null, 3), 8.0f), gqw0.e);
            x5d x5dVarA = w5d.a(new qw3(12.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarB);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            ra0Var.getClass();
            dww.c(a8k0.F(R.drawable.ic_glyph_plus_small, 0, fetVar2), null, null, ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), fetVar2, 56, 4);
            v8q0.a(ra0Var.f30110a, o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 48, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new et0(mm40Var, ra0Var, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    public static final wsy d0(wsy wsyVar, ArrayList arrayList) {
        q4m0 q4m0Var;
        wsyVar.J().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xxs0 xxs0Var = (xxs0) it.next();
            xxs0Var.getClass();
            wsy wsyVar2 = xxs0Var.c;
            wsy wsyVar3 = xxs0Var.b;
            hzs0 hzs0Var = xxs0Var.f41674a;
            ysy.f43192a.b(wsyVar3, wsyVar2);
            if (Intrinsics.d(wsyVar3, wsyVar2)) {
                q4m0Var = new q4m0(wsyVar3);
            } else {
                t3u0 t3u0VarT = hzs0Var.t();
                t3u0 t3u0Var = t3u0.d;
                if (t3u0VarT == t3u0Var) {
                    q4m0Var = new q4m0(wsyVar3);
                } else if (ary.F(wsyVar3) && hzs0Var.t() != t3u0Var) {
                    t3u0 t3u0Var2 = t3u0.e;
                    if (t3u0Var2 == hzs0Var.t()) {
                        t3u0Var2 = t3u0.c;
                    }
                    q4m0Var = new q4m0(wsyVar2, t3u0Var2);
                } else {
                    if (wsyVar2 == null) {
                        ary.a(140);
                        throw null;
                    }
                    if (ary.y(wsyVar2) && wsyVar2.U()) {
                        if (t3u0Var == hzs0Var.t()) {
                            t3u0Var = t3u0.c;
                        }
                        q4m0Var = new q4m0(wsyVar3, t3u0Var);
                    } else {
                        t3u0 t3u0Var3 = t3u0.e;
                        if (t3u0Var3 == hzs0Var.t()) {
                            t3u0Var3 = t3u0.c;
                        }
                        q4m0Var = new q4m0(wsyVar2, t3u0Var3);
                    }
                }
            }
            arrayList2.add(q4m0Var);
        }
        return qsm0.y(wsyVar, arrayList2, null, 6);
    }

    public static final void e(mm40 mm40Var, st0 st0Var, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fet fetVar3 = fetVar;
        fetVar3.g0(-99872405);
        if ((i & 6) == 0) {
            i2 = (fetVar3.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar3.g(st0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar3.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar3.i(function2) ? 2048 : 1024;
        }
        int i3 = i2;
        if (fetVar3.U(i3 & 1, (i3 & 1171) != 1170)) {
            mtr mtrVar = st0Var.d;
            boolean z = mtrVar != null && mtrVar.f22382a > 0;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(mm40Var, ((ThemeColors) fetVar3.k(zaq0.b)).getBackgroundContent(), vgg0.a(16.0f));
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            int i4 = i3 & 112;
            boolean z2 = ((i3 & 7168) == 2048) | (i4 == 32);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dt0(function2, st0Var, (byte) 4);
                fetVar2 = fetVar;
                fetVar2.o0(objP2);
            } else {
                fetVar2 = fetVar;
            }
            mm40 mm40VarW = y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP2, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            boolean z4 = z;
            j0x.b(lv00.T(st0Var.e, st0Var.f, null, null, fetVar, 0, 12), null, lgb.J(o7k0.c, vgg0.a(16.0f)), null, gqw0.A, 0.0f, null, fetVar, 24624, 104);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 80.0f);
            zx7 zx7Var = gqw0.h;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarJ = lgb.J(jr8Var.b(mm40VarE, zx7Var), vgg0.a(16.0f));
            StaticColors staticColors = StaticColors.INSTANCE;
            zq8.a(0, fetVar, i120.P(mm40VarJ, yk5.n(q3d.j(new y3d(staticColors.m121getTransparent0d7_KjU()), new y3d(staticColors.m75getBlack600d7_KjU()), new y3d(staticColors.m78getBlack800d7_KjU())), 0.0f, Float.POSITIVE_INFINITY, 8), null, 6));
            mm40 mm40VarB = jr8Var.b(s5x0.N(o7k0.d(jm40Var, 1.0f), 8.0f, 0.0f, 8.0f, 8.0f, 2), zx7Var);
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarB);
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
            v8q0.a(st0Var.b, o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.j(), fetVar, 48, 24960, 110584);
            v8q0.a(st0Var.c, o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3), staticColors.m131getWhite800d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.n(), fetVar, 48, 24960, 110584);
            fetVar3 = fetVar;
            fetVar3.r(true);
            g(null, st0Var.h, z4, fetVar3, 0);
            if (z4) {
                fetVar3.e0(-1587280681);
                mm40 mm40VarQ2 = ffb0.Q(jr8Var.b(jm40Var, gqw0.c), -8.0f, 8.0f);
                zcl zclVar2 = qmk.f;
                mm40 mm40VarQ3 = i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarQ2), staticColors.m75getBlack600d7_KjU(), jd8.n);
                boolean z5 = (i4 == 32) | ((i3 & 896) == 256);
                Object objP3 = fetVar3.P();
                if (z5 || objP3 == cl5Var) {
                    objP3 = new dt0(function1, st0Var, (byte) 5);
                    fetVar3.o0(objP3);
                }
                dww.c(a8k0.F(st0Var.d.f22382a, 0, fetVar3), null, s5x0.J(y860.W(mm40VarQ3, null, null, true, null, (Function0) objP3, 24), 6.0f), staticColors.m123getWhite0d7_KjU(), fetVar3, 56, 0);
                fetVar3.r(false);
            } else {
                fetVar3.e0(-1586538479);
                fetVar3.r(false);
            }
            fetVar3.r(true);
        } else {
            fetVar3.X();
        }
        yfe0 yfe0VarU = fetVar3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new it0(mm40Var, st0Var, function1, function2, i, (byte) 2);
        }
    }

    public static final mm40 e0(mm40 mm40Var, String str) {
        return mm40Var.e(new y1q0(str));
    }

    public static final void f(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1115302858);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar, zclVar, zclVar, zclVar, mm40Var), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i, (byte) 7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        if (r0 == a.f40.e) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final a.x30 f0(a.xm5 r4, a.ko7 r5, boolean r6) {
        /*
            a.h40 r0 = r4.d
            double r1 = r0.f12411a
            a.ql5 r4 = r4.c
            java.lang.String r4 = r4.f
            a.f40 r0 = r0.b
            a.f40 r3 = a.f40.f8887a
            if (r0 == r3) goto L75
            boolean r5 = r5 instanceof a.jo7
            if (r5 != 0) goto L13
            goto L75
        L13:
            if (r6 == 0) goto L16
            goto L72
        L16:
            a.f40 r5 = a.f40.b
            if (r0 != r5) goto L1d
            a.l30 r4 = a.l30.f19337a
            return r4
        L1d:
            a.f40 r5 = a.f40.c
            if (r0 != r5) goto L3e
            r5 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L2a
            a.c30 r4 = a.c30.f3649a
            return r4
        L2a:
            a.u30 r5 = new a.u30
            int r6 = a.cy7.f5159a
            a.pn40 r6 = a.pn40.f27267a
            a.p3u0 r6 = a.p3u0.c
            java.lang.String r6 = a.pn40.c(r1, r6)
            java.lang.String r6 = a.cy7.e(r6)
            r5.<init>(r6, r4)
            return r5
        L3e:
            a.f40 r5 = a.f40.d
            if (r0 != r5) goto L56
            a.r30 r5 = new a.r30
            int r6 = a.cy7.f5159a
            a.pn40 r6 = a.pn40.f27267a
            a.p3u0 r6 = a.p3u0.c
            java.lang.String r6 = a.pn40.c(r1, r6)
            java.lang.String r6 = a.cy7.e(r6)
            r5.<init>(r6, r4)
            return r5
        L56:
            a.f40 r5 = a.f40.f
            if (r0 != r5) goto L6e
            a.o30 r5 = new a.o30
            int r6 = a.cy7.f5159a
            a.pn40 r6 = a.pn40.f27267a
            a.p3u0 r6 = a.p3u0.c
            java.lang.String r6 = a.pn40.c(r1, r6)
            java.lang.String r6 = a.cy7.e(r6)
            r5.<init>(r6, r4)
            return r5
        L6e:
            a.f40 r4 = a.f40.e
            if (r0 != r4) goto L75
        L72:
            a.f30 r4 = a.f30.f8838a
            return r4
        L75:
            a.i30 r4 = a.i30.f14073a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a.o2e.f0(a.xm5, a.ko7, boolean):a.x30");
    }

    public static final void g(mm40 mm40Var, nur nurVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(72261211);
        int i2 = i | 6 | (fetVar.g(nurVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = nurVar instanceof mur;
            mm40Var2 = jm40.b;
            if (z2) {
                fetVar.e0(955341800);
                mm40 mm40VarD = o7k0.d(mm40Var2, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(ffb0.Q(mm40VarD, -1.0f, -1.0f), 0.0f, 0.0f, z ? 54.0f : 0.0f, 0.0f, 11);
                thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
                mur murVar = (mur) nurVar;
                j6n.h(murVar.f22425a, murVar.b, ohs0.i(fetVar, mm40VarC0, gqw0.v, 1.0f, false), 0, 0, fetVar, 0, 24);
                fetVar.r(true);
                fetVar.r(false);
            } else {
                if (!Intrinsics.d(nurVar, lur.f20686a)) {
                    throw b1j.f(723553411, fetVar, false);
                }
                fetVar.e0(956825925);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mt0(mm40Var2, nurVar, z, i, (byte) 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v25, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v27, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v29, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r21v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v40, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList] */
    public static final l65 g0(k65 k65Var) {
        ?? arrayList;
        Object next;
        List list;
        nnm0 nnm0Var;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        ?? arrayList5;
        ?? arrayList6;
        ?? arrayList7;
        k65Var.getClass();
        i65 i65Var = k65Var.f17750a;
        if (i65Var == null || (list = i65Var.f14224a) == null) {
            arrayList = 0;
        } else {
            int i = 10;
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d65 d65Var = (d65) it.next();
                Integer num = d65Var.f5536a;
                int iIntValue = num != null ? num.intValue() : 0;
                Double d2 = d65Var.b;
                double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
                String str = d65Var.c;
                if (str == null) {
                    str = "";
                }
                Double d3 = d65Var.d;
                double dDoubleValue2 = d3 != null ? d3.doubleValue() : 0.0d;
                Integer num2 = d65Var.e;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                Long l = d65Var.f;
                long jLongValue = l != null ? l.longValue() : 0L;
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long l2 = d65Var.g;
                zmq0 zmq0Var = new zmq0(TimeUnit.SECONDS.toMillis(l2 != null ? l2.longValue() : 0L) + jCurrentTimeMillis);
                Long l3 = d65Var.h;
                long jLongValue2 = l3 != null ? l3.longValue() : 0L;
                fom0 fom0Var = d65Var.i;
                if (fom0Var == null || (nnm0Var = fom0Var.f9889a) == null) {
                    nnm0Var = nnm0.UNKNOWN;
                }
                String str2 = fom0Var != null ? fom0Var.b : null;
                if (str2 == null) {
                    str2 = "";
                }
                gom0 gom0Var = new gom0(nnm0Var, str2);
                List list2 = d65Var.j;
                if (list2 != null) {
                    arrayList2 = new ArrayList(r3d.q(list2, i));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        c8b c8bVar = (c8b) it2.next();
                        Iterator it3 = it2;
                        Integer num3 = c8bVar.f3905a;
                        int iIntValue3 = num3 != null ? num3.intValue() : 0;
                        String str3 = c8bVar.b;
                        if (str3 == null) {
                            str3 = r7;
                        }
                        arrayList2.add(new g8b(iIntValue3, str3));
                        it2 = it3;
                    }
                } else {
                    arrayList2 = 0;
                }
                if (arrayList2 == 0) {
                    arrayList2 = iun.f15405a;
                }
                List list3 = d65Var.k;
                if (list3 != null) {
                    arrayList3 = new ArrayList(r3d.q(list3, 10));
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        cqs cqsVar = (cqs) it4.next();
                        Iterator it5 = it4;
                        Integer num4 = cqsVar.f4812a;
                        int iIntValue4 = num4 != null ? num4.intValue() : 0;
                        String str4 = cqsVar.b;
                        if (str4 == null) {
                            str4 = r7;
                        }
                        arrayList3.add(new dqs(iIntValue4, str4));
                        it4 = it5;
                    }
                } else {
                    arrayList3 = 0;
                }
                if (arrayList3 == 0) {
                    arrayList3 = iun.f15405a;
                }
                List list4 = d65Var.l;
                if (list4 != null) {
                    arrayList4 = new ArrayList(r3d.q(list4, 10));
                    Iterator it6 = list4.iterator();
                    while (it6.hasNext()) {
                        rzb0 rzb0Var = (rzb0) it6.next();
                        Iterator it7 = it6;
                        Integer num5 = rzb0Var.f31352a;
                        int iIntValue5 = num5 != null ? num5.intValue() : 0;
                        String str5 = rzb0Var.b;
                        if (str5 == null) {
                            str5 = r7;
                        }
                        arrayList4.add(new tzb0(iIntValue5, str5));
                        it6 = it7;
                    }
                } else {
                    arrayList4 = 0;
                }
                if (arrayList4 == 0) {
                    arrayList4 = iun.f15405a;
                }
                ?? r23 = arrayList4;
                List list5 = d65Var.m;
                if (list5 != null) {
                    arrayList5 = new ArrayList(r3d.q(list5, 10));
                    Iterator it8 = list5.iterator();
                    while (it8.hasNext()) {
                        c8b c8bVar2 = (c8b) it8.next();
                        Iterator it9 = it8;
                        Integer num6 = c8bVar2.f3905a;
                        int iIntValue6 = num6 != null ? num6.intValue() : 0;
                        String str6 = c8bVar2.b;
                        if (str6 == null) {
                            str6 = r7;
                        }
                        arrayList5.add(new g8b(iIntValue6, str6));
                        it8 = it9;
                    }
                } else {
                    arrayList5 = 0;
                }
                if (arrayList5 == 0) {
                    arrayList5 = iun.f15405a;
                }
                ?? r24 = arrayList5;
                List list6 = d65Var.n;
                if (list6 != null) {
                    arrayList6 = new ArrayList(r3d.q(list6, 10));
                    Iterator it10 = list6.iterator();
                    while (it10.hasNext()) {
                        cqs cqsVar2 = (cqs) it10.next();
                        Iterator it11 = it10;
                        Integer num7 = cqsVar2.f4812a;
                        int iIntValue7 = num7 != null ? num7.intValue() : 0;
                        String str7 = cqsVar2.b;
                        if (str7 == null) {
                            str7 = r7;
                        }
                        arrayList6.add(new dqs(iIntValue7, str7));
                        it10 = it11;
                    }
                } else {
                    arrayList6 = 0;
                }
                if (arrayList6 == 0) {
                    arrayList6 = iun.f15405a;
                }
                ?? r25 = arrayList6;
                List<rzb0> list7 = d65Var.o;
                if (list7 != null) {
                    arrayList7 = new ArrayList(r3d.q(list7, 10));
                    for (rzb0 rzb0Var2 : list7) {
                        Integer num8 = rzb0Var2.f31352a;
                        int iIntValue8 = num8 != null ? num8.intValue() : 0;
                        String str8 = rzb0Var2.b;
                        if (str8 == null) {
                            str8 = r7;
                        }
                        arrayList7.add(new tzb0(iIntValue8, str8));
                    }
                } else {
                    arrayList7 = 0;
                }
                if (arrayList7 == 0) {
                    arrayList7 = iun.f15405a;
                }
                arrayList.add(new e65(iIntValue, dDoubleValue, str, dDoubleValue2, iIntValue2, jLongValue, zmq0Var, jLongValue2, gom0Var, arrayList2, arrayList3, r23, r24, r25, arrayList7));
                it = it;
                i = 10;
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        Iterator it12 = arrayList.iterator();
        do {
            if (!it12.hasNext()) {
                next = null;
                break;
            }
            next = it12.next();
        } while (((e65) next).i.f11638a != nnm0.ACTIVE);
        e65 e65Var = (e65) next;
        if (e65Var == null) {
            return new l65(arrayList);
        }
        List listC = kotlin.collections.a.c(e65Var);
        ArrayList arrayList8 = new ArrayList();
        for (Object obj : arrayList) {
            if (((e65) obj).i.f11638a != nnm0.ACTIVE) {
                arrayList8.add(obj);
            }
        }
        return new l65(CollectionsKt.q0(listC, arrayList8));
    }

    public static final void h(mm40 mm40Var, cv1 cv1Var, xcz xczVar, d9z d9zVar, xcz xczVar2, xcz xczVar3, Function1 function1, fet fetVar, int i) {
        cv1Var.getClass();
        bv1 bv1Var = cv1Var.b;
        xczVar.getClass();
        d9zVar.getClass();
        xczVar2.getClass();
        xczVar3.getClass();
        function1.getClass();
        fetVar.g0(-592860680);
        int i2 = i | (fetVar.g(cv1Var) ? 32 : 16) | (fetVar.g(xczVar) ? 256 : 128) | (fetVar.g(d9zVar) ? 2048 : 1024) | (fetVar.g(xczVar2) ? 16384 : 8192) | (fetVar.g(xczVar3) ? 131072 : 65536) | (fetVar.i(function1) ? 1048576 : 524288);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            int iOrdinal = bv1Var.ordinal();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new c51((byte) 14);
                fetVar.o0(objP);
            }
            kwj kwjVarB = zk80.b(iOrdinal, (Function0) objP, fetVar, 384, 2);
            boolean zG = fetVar.g(kwjVarB) | ((i2 & 112) == 32);
            Object objP2 = fetVar.P();
            if (zG || objP2 == obj) {
                objP2 = new wt1(cv1Var, kwjVarB, null, b2);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, bv1Var, (Function2) objP2);
            q5x.e(kwjVarB, mm40Var, null, null, q3d.i(bv1.g), 0.0f, null, null, false, null, null, null, null, u1c.M(-183421033, new ut1(cv1Var, xczVar, function1, d9zVar, xczVar2, xczVar3, (byte) 1), fetVar), fetVar, 100663344, 24576, 16108);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vt1(mm40Var, cv1Var, xczVar, d9zVar, xczVar2, xczVar3, function1, i, (byte) 1);
        }
    }

    public static final vf7 h0(g0f g0fVar, String str, boolean z) {
        g0fVar.getClass();
        str.getClass();
        long j = g0fVar.f10456a;
        double d2 = g0fVar.e;
        double d3 = g0fVar.c;
        boolean z2 = g0fVar.i;
        double d4 = g0fVar.j;
        boolean z3 = g0fVar.k;
        return new vf7(j, d2, d3, g0fVar.s, g0fVar.r, str, z, z2, d4, z3);
    }

    public static final void i(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        mm40 mm40Var2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(704428853);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            x1o x1oVar = ((g94) l7m0Var.getValue()).d;
            if (x1oVar instanceof v1o) {
                fetVar.e0(430012551);
                n0q n0qVar = o7k0.c;
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (objP == cl5Var) {
                    objP = y74.f42132a;
                    fetVar.o0(objP);
                }
                xdr xdrVar = (xdr) ((jhy) objP);
                boolean zG = fetVar.g(x1oVar) | ((i2 & 896) == 256);
                Object objP2 = fetVar.P();
                if (zG || objP2 == cl5Var) {
                    objP2 = new ys3(x1oVar, function1, (byte) 3);
                    fetVar.o0(objP2);
                }
                y860.f(xdrVar, n0qVar, (Function1) objP2, fetVar, 6, 0);
                fetVar.r(false);
            } else {
                if (!x1oVar.equals(w1o.f38412a)) {
                    throw b1j.f(-1648699457, fetVar, false);
                }
                fetVar.e0(430541163);
                fetVar.r(false);
            }
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new x74(mm40Var2, l7m0Var, function1, i, (byte) 0);
        }
    }

    public static final c4i i0(u1w u1wVar, List list, boolean z, boolean z2, String str) {
        str.getClass();
        String str2 = u1wVar.b;
        int i = u1wVar.e;
        String str3 = (String) u1wVar.i.get(w1w.b);
        if (str3 == null) {
            str3 = "";
        }
        return new c4i(k7x.D(i, str2, str3, list, false), z, b0(u1wVar.e, u1wVar.d, str, list, z2), new m0x(R.drawable.sport_new, null, 6), c0(i, list, z2), 32);
    }

    public static final void j(mm40 mm40Var, he8 he8Var, Function1 function1, fet fetVar, int i) {
        he8Var.getClass();
        function1.getClass();
        fetVar.g0(-1792853628);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(he8Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            c6q0 c6q0Var = he8Var.f12909a;
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            byte b2 = 14;
            if (z || objP == ukd.f35823a) {
                objP = new uo6(function1, b2);
                fetVar.o0(objP);
            }
            wvb.t(mm40Var, c6q0Var, 0, null, (Function1) objP, fetVar, i2 & 14, 12);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zb8(mm40Var, he8Var, function1, i, (byte) 3);
        }
    }

    public static final c4i j0(x1w x1wVar, List list, boolean z, boolean z2, String str, boolean z3) {
        x1wVar.getClass();
        list.getClass();
        str.getClass();
        String str2 = x1wVar.b;
        int i = x1wVar.e;
        String str3 = (String) x1wVar.i.get(w1w.b);
        if (str3 == null) {
            str3 = "";
        }
        return new c4i(k7x.D(i, str2, str3, list, z3), z, b0(x1wVar.e, x1wVar.d, str, list, z2), new m0x(R.drawable.sport_new, null, 6), c0(i, list, z2), 32);
    }

    public static final void k(i4 i4Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        i4Var.getClass();
        fetVar.g0(-755331069);
        int i3 = i & 6;
        byte b2 = 2;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(i4Var) : fetVar.i(i4Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            byte b3 = 14;
            fetVar2 = fetVar;
            jwb.p(jm40Var, new qw3(4.0f, true, new jf4(b3)), new qw3(4.0f, true, new jf4(b3)), gqw0.k, 0, 0, u1c.M(-1153856728, new sd8(i4Var, b2), fetVar), fetVar2, (i2 & 14) | 1575936, 48);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(i4Var, i);
        }
    }

    public static final c4i k0(y1w y1wVar, List list, boolean z, boolean z2, String str, boolean z3) {
        y1wVar.getClass();
        list.getClass();
        str.getClass();
        String str2 = y1wVar.b;
        int i = y1wVar.e;
        String str3 = (String) y1wVar.i.get(w1w.b);
        if (str3 == null) {
            str3 = "";
        }
        return new c4i(k7x.D(i, str2, str3, list, z3), z, b0(y1wVar.e, y1wVar.d, str, list, z2), new m0x(R.drawable.sport_new, null, 6), c0(i, list, z2), 32);
    }

    public static final void l(mm40 mm40Var, iva ivaVar, fet fetVar, int i) {
        mm40 mm40Var2;
        iva ivaVar2;
        fetVar.g0(-778476548);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.i(ivaVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new glo0();
                fetVar.o0(objP);
            }
            glo0 glo0Var = (glo0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP3);
            }
            pz40 pz40Var2 = (pz40) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP4);
            }
            pz40 pz40Var3 = (pz40) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP5);
            }
            pz40 pz40Var4 = (pz40) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP6);
            }
            pz40 pz40Var5 = (pz40) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                objP7 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP7);
            }
            mm40Var2 = mm40Var;
            ivaVar2 = ivaVar;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1863264060, new j0a0(mm40Var2, glo0Var, ivaVar2, pz40Var, pz40Var3, pz40Var2, pz40Var5, (pz40) objP7, pz40Var4), fetVar), fetVar, 56);
        } else {
            mm40Var2 = mm40Var;
            ivaVar2 = ivaVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(mm40Var2, ivaVar2, i, (byte) 17);
        }
    }

    public static final c4i l0(c2w c2wVar, List list, boolean z, boolean z2, String str, boolean z3) {
        c2wVar.getClass();
        list.getClass();
        str.getClass();
        String str2 = c2wVar.b;
        int i = c2wVar.e;
        String str3 = (String) c2wVar.i.get(w1w.b);
        if (str3 == null) {
            str3 = "";
        }
        return new c4i(k7x.D(i, str2, str3, list, z3), z, b0(c2wVar.e, c2wVar.d, str, list, z2), new m0x(R.drawable.sport_new, null, 6), c0(i, list, z2), 32);
    }

    public static final void m(mm40 mm40Var, q5b q5bVar, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        q5bVar.getClass();
        CategoryImageHeaderTab categoryImageHeaderTab = q5bVar.b;
        function1.getClass();
        fetVar.g0(-868943127);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(q5bVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) fetVar.k(dy2.b);
            Activity activity = context instanceof Activity ? (Activity) context : null;
            Window window = activity != null ? activity.getWindow() : null;
            boolean zC = pkd.c(fetVar);
            bzl bzlVarZ = mbc.Z(fetVar);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = jgk0.b(new rd7(zC, (Object) bzlVarZ, (byte) 3));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var = (l7m0) objP;
            Boolean boolValueOf = Boolean.valueOf(zC);
            Boolean bool = (Boolean) l7m0Var.getValue();
            bool.booleanValue();
            boolean zI = fetVar.i(window) | fetVar.i(context) | fetVar.h(zC);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                Object h5bVar = new h5b(window, context, zC, l7m0Var, (byte) 0);
                fetVar.o0(h5bVar);
                objP2 = h5bVar;
            }
            s0x.e(boolValueOf, bool, null, (Function1) objP2, fetVar, 0, 4);
            boolean zE = fetVar.e(categoryImageHeaderTab.ordinal());
            Object objP3 = fetVar.P();
            if (zE || objP3 == obj) {
                objP3 = jgk0.b(new yra(bzlVarZ, b2));
                fetVar.o0(objP3);
            }
            l7m0 l7m0Var2 = (l7m0) objP3;
            ugg0 ugg0VarC = vgg0.c(((ycl) l7m0Var2.getValue()).f42389a, ((ycl) l7m0Var2.getValue()).f42389a, 0.0f, 0.0f, 12);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z) {
                fetVar.l(function0);
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
            whm whmVar = q5bVar.f28143a;
            boolean z2 = (i2 & 896) == 256;
            Object objP4 = fetVar.P();
            if (z2 || objP4 == obj) {
                objP4 = new xz8(function1, (byte) 17);
                fetVar.o0(objP4);
            }
            thb.g(whmVar, bzlVarZ, (Function1) objP4, fetVar, 1);
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = new i5b((byte) 0);
                fetVar.o0(objP5);
            }
            mm40 mm40VarN = mbc.N(i120.Q(lgb.J(knx.Q(n0qVar, (xdr) objP5), ugg0VarC), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), ugg0VarC), bzlVarZ, fetVar, 0);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            ugdVar.O(jr8.f16991a, bzlVarZ, categoryImageHeaderTab, fetVar, 3078);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gf9((Object) mm40Var, (Object) q5bVar, function1, (wdr) ugdVar, i, (byte) 7);
        }
    }

    public static final void n(f1l0 f1l0Var, xcz xczVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-728739205);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(f1l0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            boolean zB = f1l0Var.b();
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new uck0(function1, (byte) 7);
                fetVar.o0(objP);
            }
            mom.c(n0qVar, zB, womVarF, null, false, null, (Function0) objP, null, u1c.M(1830280848, new qb(xczVar, (Object) f1l0Var, function1, (byte) 11), fetVar), fetVar, 100663302, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) f1l0Var, (Object) xczVar, (Object) function1, i, (byte) 25);
        }
    }

    public static final void o(l7m0 l7m0Var, l7m0 l7m0Var2, g2v g2vVar, Function1 function1, Function0 function0, fet fetVar, int i) {
        int i2;
        g2v g2vVar2 = g2vVar;
        fetVar.g0(1377136090);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar.g(g2vVar2) : fetVar.i(g2vVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            n0q n0qVar = o7k0.c;
            mm40 mm40VarR = knm0.r(n0qVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarR);
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
            int i3 = i2 >> 3;
            j120.H(i3 & 14, fetVar, null, l7m0Var2);
            mm40 mm40VarE = o050.W(jm40.b).e(n0qVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
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
            boolean z2 = (57344 & i2) == 16384;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new a2z(function0, (byte) 12);
                fetVar.o0(objP);
            }
            n4c.b((Function0) objP, fetVar);
            g2vVar2 = g2vVar;
            F(l7m0Var, g2vVar2, function1, fetVar, (i2 & 14) | (i3 & 112) | (i3 & 896));
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) l7m0Var, (Object) l7m0Var2, (Object) g2vVar2, (Object) function1, (wdr) function0, i, (byte) 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:65:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e3  */
    public static final void p(a4x a4xVar, e2d e2dVar, Function1 function1, fet fetVar, int i) {
        int i2;
        cl5 cl5Var;
        byte b2;
        boolean z;
        Object objP;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        fetVar2.g0(1212281026);
        byte b3 = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(a4xVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(e2dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function2) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
            boolean z2 = (i2 & 112) == 32;
            Object objP2 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z2 || objP2 == cl5Var2) {
                objP2 = new o6n(e2dVar, b3);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarT = i4w0.T(mm40VarY, (Function1) objP2);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarT);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, qmk.a(fetVar2).d, 0.0f, 11), 1.0f);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarD);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true);
            jwo[] jwoVarArr = {jwo.b};
            zfn zfnVar = zaq0.b;
            mm40 mm40VarM = rq8.M(x7zVarI, new sl1(jwoVarArr, xczVarA.d(), y3d.c(0.8f, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent())));
            lh80 lh80Var = new lh80(qmk.a(fetVar2).d, 8.0f, 16.0f, 8.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z4 = (i2 & 14) == 4;
            int i3 = i2 & 896;
            boolean z5 = z4 | (i3 == 256);
            Object objP3 = fetVar2.P();
            if (z5) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP3 != cl5Var) {
                    b2 = 16;
                }
                cl5 cl5Var3 = cl5Var;
                b8k0.f(mm40VarM, xczVarA, lh80Var, false, qw3Var, yx7Var, null, false, null, (Function1) objP3, fetVar2, 196608, 456);
                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 8.0f, 5);
                long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
                if (i3 == 256) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar2.P();
                if (!z || objP == cl5Var3) {
                    function2 = function1;
                    objP = new mfp(function2, (byte) 16);
                    fetVar2.o0(objP);
                } else {
                    function2 = function1;
                }
                obc.w(mm40VarN, secondary, background, (Function0) objP, fetVar2, 0);
                fetVar2 = fetVar2;
                fetVar2.r(true);
                fetVar2.r(true);
            }
            b2 = 16;
            objP3 = new or0(a4xVar, function2, b2);
            fetVar2.o0(objP3);
            cl5 cl5Var4 = cl5Var;
            b8k0.f(mm40VarM, xczVarA, lh80Var, false, qw3Var, yx7Var, null, false, null, (Function1) objP3, fetVar2, 196608, 456);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 8.0f, 5);
            long secondary2 = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            long background2 = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            if (i3 == 256) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar2.P();
            if (z) {
                function2 = function1;
                objP = new mfp(function2, (byte) 16);
                fetVar2.o0(objP);
            } else {
                function2 = function1;
                objP = new mfp(function2, (byte) 16);
                fetVar2.o0(objP);
            }
            obc.w(mm40VarN2, secondary2, background2, (Function0) objP, fetVar2, 0);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) a4xVar, (Object) e2dVar, (Object) function2, i, (byte) 6);
        }
    }

    public static final void q(a4x a4xVar, Function1 function1, fet fetVar, int i) {
        int i2;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1691178795);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(a4xVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.i(function2) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 12.0f, 0.0f, 11), 1.0f);
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
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
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC0, gqw0.v, 1.0f, true);
            int i3 = i2;
            lh80 lh80Var = new lh80(12.0f, 8.0f, 16.0f, 8.0f);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            int i4 = i3 & 112;
            boolean z = ((i3 & 14) == 4) | (i4 == 32);
            Object objP = fetVar2.P();
            byte b2 = 17;
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new or0(a4xVar, function2, b2);
                fetVar2.o0(objP);
            }
            b8k0.f(x7zVarI, null, lh80Var, false, qw3Var, yx7Var, null, false, null, (Function1) objP, fetVar2, 196608, 458);
            mm40 mm40VarN = s5x0.N(jm40Var, 8.0f, 8.0f, 0.0f, 8.0f, 4);
            zfn zfnVar = m8m0.f21378a;
            long jM123getWhite0d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m123getWhite0d7_KjU();
            long jM127getWhite300d7_KjU = ((StaticColors) fetVar2.k(zfnVar)).m127getWhite300d7_KjU();
            boolean z2 = i4 == 32;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                function2 = function1;
                objP2 = new mfp(function2, (byte) 17);
                fetVar2.o0(objP2);
            } else {
                function2 = function1;
            }
            obc.w(mm40VarN, jM123getWhite0d7_KjU, jM127getWhite300d7_KjU, (Function0) objP2, fetVar2, 0);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lr0((byte) 3, i, a4xVar, function2);
        }
    }

    public static final void r(h8l0 h8l0Var, e2d e2dVar, a4x a4xVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(1095926798);
        int i2 = (fetVar.e(h8l0Var.ordinal()) ? 4 : 2) | i | (fetVar.g(e2dVar) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            int iOrdinal = h8l0Var.ordinal();
            if (iOrdinal == 0) {
                fetVar.e0(-1585875799);
                p(a4xVar, null, function1, fetVar, ((i2 >> 3) & 896) | ((i2 >> 6) & 14) | 48);
                fetVar.r(false);
            } else if (iOrdinal == 1 || iOrdinal == 2) {
                fetVar.e0(918683388);
                p(a4xVar, e2dVar, function1, fetVar, ((i2 >> 3) & 896) | ((i2 >> 6) & 14) | (i2 & 112));
                fetVar.r(false);
            } else {
                if (iOrdinal != 3) {
                    throw b1j.f(918672346, fetVar, false);
                }
                fetVar.e0(918690103);
                q(a4xVar, function1, fetVar, (i2 >> 6) & 126);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 26, i, (Object) h8l0Var, (Object) e2dVar, (Object) a4xVar, (Object) function1);
        }
    }

    public static final void s(w1g w1gVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(406754242);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(w1gVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d((mm40) fetVar.k(t0h.f33118a), 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = e0(o7k0.e(mm40VarD, 160.0f), "BACCARAT_CYBER_BOX");
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
            mm40 mm40VarB = jr8.f16991a.b(o7k0.c, gqw0.e);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            k7x.a(w1gVar.e, null, i120.S(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarB), 1.0f, kkg.G, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), gqw0.A, null, fetVar, 1572912, 1976);
            y(0, fetVar);
            z(w1gVar, fetVar, i2 & 14);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t1g(w1gVar, i, b2);
        }
    }

    public static final void t(mm40 mm40Var, ukl uklVar, Function0 function0, fet fetVar, int i) {
        long j;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1364259783);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(uklVar) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            long secondary0 = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary0();
            zfn zfnVar2 = bmd.n;
            Object objK = fetVar2.k(zfnVar2);
            k6z k6zVar = k6z.b;
            boolean z = objK == k6zVar;
            qc0 qc0Var = uklVar.b;
            boolean zE = fetVar2.e(qc0Var.ordinal());
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zE || objP == cl5Var) {
                int iOrdinal = qc0Var.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                    j = hi0.b;
                } else {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return;
                    }
                    j = secondary;
                }
                objP = dw9.e(j, fetVar2);
            }
            long j2 = ((y3d) objP).f41946a;
            boolean zE2 = fetVar2.e(qc0Var.ordinal());
            Object objP2 = fetVar2.P();
            if (zE2 || objP2 == cl5Var) {
                int iOrdinal2 = qc0Var.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                    objP2 = yk5.n(q3d.j(new y3d(hi0.d), new y3d(hi0.c)), 0.0f, 0.0f, 14);
                } else {
                    if (iOrdinal2 != 3) {
                        t9f.b();
                        return;
                    }
                    objP2 = yk5.n(q3d.j(new y3d(secondary0), new y3d(secondary)), 0.0f, 0.0f, 14);
                }
                fetVar2.o0(objP2);
            }
            t89 t89Var = (t89) objP2;
            boolean zE3 = fetVar2.e(qc0Var.ordinal());
            Object objP3 = fetVar2.P();
            if (zE3 || objP3 == cl5Var) {
                int iOrdinal3 = qc0Var.ordinal();
                if (iOrdinal3 == 0 || iOrdinal3 == 1 || iOrdinal3 == 2) {
                    objP3 = null;
                } else {
                    if (iOrdinal3 != 3) {
                        t9f.b();
                        return;
                    }
                    float[] fArrA = g4d.a();
                    g4d.b(fArrA);
                    h4d h4dVar = new h4d(new ColorMatrixColorFilter(fArrA));
                    h4dVar.b = fArrA;
                    objP3 = h4dVar;
                }
                fetVar2.o0(objP3);
            }
            a4d a4dVar = (a4d) objP3;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = y860.W(o7k0.e(mm40Var, 120.0f), null, null, false, null, function0, 28);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarW), j2, jd8.n);
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
            j0x.b(l7x.X(uklVar.f35832a.a(), null, null, fetVar2, 0, 30), null, e0(yyw.V(o7k0.c, fetVar2.k(zfnVar2) == k6zVar), "AGGREGATOR_BONUSES_IMAGE_PICTUREL_STYLE"), z ? gqw0.d : gqw0.f, gqw0.A, 0.0f, a4dVar, fetVar, 24624, 32);
            fetVar2 = fetVar;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = i120.P(o7k0.e(o7k0.d(jm40Var, 1.0f), 72.0f), t89Var, null, 6);
            zx7 zx7Var = gqw0.h;
            jr8 jr8Var = jr8.f16991a;
            zq8.a(0, fetVar2, jr8Var.b(mm40VarP, zx7Var));
            T(s5x0.N(jr8Var.b(o7k0.e(o7k0.d(jm40Var, 1.0f), 68.0f), gqw0.g), 16.0f, 0.0f, 16.0f, 16.0f, 2), uklVar, fetVar2, i2 & 112);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var, uklVar, function0, i, (byte) 17);
        }
    }

    public static final void u(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(896086776);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 120.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dka(mm40Var, i, (byte) 26);
        }
    }

    public static final void v(mdm mdmVar, Function1 function1, fet fetVar, int i) {
        fetVar.g0(1755021655);
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
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
                objP = new i0a0(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i2 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t48(mdmVar, function1, i, (byte) 15);
        }
    }

    public static final void w(int i, e2d e2dVar, fet fetVar, usv usvVar, mm40 mm40Var, Function0 function0, Function1 function1) {
        Object dmmVar;
        String str;
        boolean z;
        Object oimVar;
        ugd ugdVarM;
        String str2 = usvVar.e;
        fetVar.g0(-306577728);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(usvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(e2dVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            androidx.compose.runtime.d dVar = zaq0.b;
            long primary = ((ThemeColors) fetVar.k(dVar)).getPrimary();
            long secondary = ((ThemeColors) fetVar.k(dVar)).getSecondary();
            h8l0 h8l0Var = usvVar.f36229a;
            a4x a4xVar = usvVar.g;
            a4x<xip> a4xVar2 = usvVar.f;
            boolean zE = fetVar.e(h8l0Var.ordinal()) | fetVar.g(a4xVar2);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zE || objP == cl5Var) {
                int i3 = yjp.f42752a[h8l0Var.ordinal()];
                dmmVar = fmm.f9790a;
                if (i3 == 1) {
                    str = str2;
                    ArrayList arrayList = new ArrayList(r3d.q(a4xVar2, 10));
                    for (Iterator it = a4xVar2.iterator(); it.hasNext(); it = it) {
                        xip xipVar = (xip) it.next();
                        arrayList.add(new skm(xipVar.f40956a, xipVar.b, xipVar.d, (y3d) null, 48));
                    }
                    a4x a4xVarO0 = dyb.o0(arrayList);
                    skm skmVar = (skm) CollectionsKt.W(0, a4xVarO0);
                    skm skmVar2 = (skm) CollectionsKt.W(1, a4xVarO0);
                    skm skmVar3 = (skm) CollectionsKt.W(2, a4xVarO0);
                    if (skmVar != null) {
                        dmmVar = new emm((skmVar2 == null || skmVar3 == null) ? skmVar2 != null ? new na50(skmVar, skmVar2) : new la50(skmVar) : new ma50(skmVar, skmVar2, skmVar3));
                    }
                    z = false;
                } else {
                    str = str2;
                    ArrayList arrayList2 = new ArrayList(r3d.q(a4xVar2, 10));
                    for (xip xipVar2 : a4xVar2) {
                        arrayList2.add(new wkm(xipVar2.f40956a, xipVar2.b, xipVar2.d, ra50.f30118a, xipVar2.c ? primary : secondary));
                    }
                    a4x a4xVarO1 = dyb.o0(arrayList2);
                    z = false;
                    wkm wkmVar = (wkm) CollectionsKt.W(0, a4xVarO1);
                    wkm wkmVar2 = (wkm) CollectionsKt.W(1, a4xVarO1);
                    wkm wkmVar3 = (wkm) CollectionsKt.W(2, a4xVarO1);
                    if (wkmVar != null) {
                        dmmVar = new dmm((wkmVar2 == null || wkmVar3 == null) ? wkmVar2 != null ? new va50(wkmVar, wkmVar2) : new ta50(wkmVar) : new ua50(wkmVar, wkmVar2, wkmVar3));
                    }
                }
                fetVar.o0(dmmVar);
            } else {
                str = str2;
                dmmVar = objP;
                z = false;
            }
            gmm gmmVar = (gmm) dmmVar;
            boolean z2 = (i2 & 112) == 32 ? true : z;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                int iOrdinal = h8l0Var.ordinal();
                if (iOrdinal == 0) {
                    String str3 = str;
                    String str4 = usvVar.c;
                    boolean z3 = usvVar.b;
                    String str5 = usvVar.d;
                    int i4 = usvVar.j;
                    ArrayList arrayList3 = new ArrayList(r3d.q(a4xVar, 10));
                    Iterator<E> it2 = a4xVar.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((pim) it2.next()).b);
                    }
                    oimVar = new oim(str4, z3, str5, str3, usvVar.k, gmmVar, i4, dyb.o0(arrayList3), axh0.f1625a, null);
                } else if (iOrdinal == 1) {
                    String str6 = str;
                    boolean z4 = usvVar.b;
                    String str7 = usvVar.d;
                    int i5 = usvVar.j;
                    ArrayList arrayList4 = new ArrayList(r3d.q(a4xVar, 10));
                    Iterator<E> it3 = a4xVar.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(((pim) it3.next()).b);
                    }
                    oimVar = new mim(gmmVar, z4, str7, str6, usvVar.k, i5, dyb.o0(arrayList4), (String) null, 384);
                } else if (iOrdinal == 2) {
                    oimVar = new lim(usvVar.j, gmmVar, usvVar.g, usvVar.c, usvVar.d, str, null, usvVar.b, usvVar.k);
                } else {
                    if (iOrdinal != 3) {
                        t9f.b();
                        return;
                    }
                    z = false;
                    oimVar = new nim(usvVar.j, gmmVar, usvVar.g, usvVar.c, usvVar.d, str, null, usvVar.b, usvVar.k);
                }
                objP2 = oimVar;
                fetVar.o0(objP2);
            } else {
                cl5Var = cl5Var;
            }
            qim qimVar = (qim) objP2;
            mm40 mm40VarW = o050.W(mm40Var);
            boolean z5 = usvVar.h;
            if (usvVar.i.isEmpty()) {
                fetVar.e0(2142901862);
                fetVar.r(z);
                ugdVarM = null;
            } else {
                fetVar.e0(2142613469);
                ugdVarM = u1c.M(417900762, new ann(usvVar, e2dVar, function1, (byte) 21), fetVar);
                fetVar.r(z);
            }
            boolean z6 = ((i2 & 7168) == 2048 ? true : z) | ((57344 & i2) == 16384 ? true : z);
            Object objP3 = fetVar.P();
            if (z6 || objP3 == cl5Var) {
                objP3 = new ya4(function0, function1, (byte) 3);
                fetVar.o0(objP3);
            }
            ckb.k(mm40VarW, qimVar, z5, e2dVar, ugdVarM, (Function1) objP3, fetVar, (i2 << 3) & 7168, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) mm40Var, (Object) usvVar, (Object) e2dVar, (Object) function0, (Object) function1, i, (byte) 0);
        }
    }

    public static final void x(e2d e2dVar, l7m0 l7m0Var, Function0 function0, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        e2dVar.getClass();
        l7m0Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(-1000103565);
        int i2 = i | (fetVar.g(e2dVar) ? 4 : 2) | (fetVar.g(l7m0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object[] objArr = new Object[0];
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new jfl(l7m0Var, (byte) 17);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            int i4 = i2 & 7168;
            boolean z2 = i4 == 2048;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj) {
                objP2 = new mfp(function1, (byte) 15);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z3 = i4 == 2048;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == obj) {
                objP3 = new mfp(function1, (byte) 18);
                fetVar.o0(objP3);
            }
            v3c.A(function2, (Function0) objP3, null, fetVar, 0, 4);
            Context context = (Context) fetVar.k(dy2.b);
            Activity activity = context instanceof Activity ? (Activity) context : null;
            Window window = activity != null ? activity.getWindow() : null;
            boolean zC = pkd.c(fetVar);
            Object[] objArr2 = new Object[0];
            boolean z4 = i3 == 32;
            Object objP4 = fetVar.P();
            if (z4 || objP4 == obj) {
                objP4 = new plh(l7m0Var, (byte) 27);
                fetVar.o0(objP4);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP4, fetVar);
            Boolean bool = (Boolean) l7m0VarY2.getValue();
            bool.getClass();
            Boolean boolValueOf = Boolean.valueOf(zC);
            boolean zG = fetVar.g(l7m0VarY2) | fetVar.i(window) | fetVar.i(context) | fetVar.h(zC);
            Object objP5 = fetVar.P();
            if (zG || objP5 == obj) {
                objP5 = new h5b(window, context, zC, l7m0VarY2, (byte) 1);
                fetVar.o0(objP5);
            }
            s0x.e(bool, boolValueOf, null, (Function1) objP5, fetVar, 0, 4);
            m8x.y(o7k0.c, u1c.M(1981658927, new eqk(l7m0Var, e2dVar, function0, function1), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), ((y3d) l7m0VarY.getValue()).f41946a, null, u1c.M(807914308, new kw0(ugdVar, l7m0Var), fetVar), fetVar, 805306422, 316);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(e2dVar, l7m0Var, function0, function1, ugdVar, i);
        }
    }

    public static final void y(int i, fet fetVar) {
        fetVar.g0(1807908872);
        if (fetVar.U(i & 1, i != 0)) {
            n0q n0qVar = o7k0.c;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new vlf((byte) 9);
                fetVar.o0(objP);
            }
            qxw.o(fetVar, rq8.K(n0qVar, (Function1) objP));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jyf(i);
        }
    }

    public static final void z(w1g w1gVar, fet fetVar, int i) {
        int i2;
        w1g w1gVar2;
        byte b2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1252157839);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(w1gVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(o7k0.d(o7k0.e(jm40Var, 32.0f), 1.0f), 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar2, 54);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
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
            String str = w1gVar.f38396a;
            wnq0 wnq0Var = w1gVar.b;
            v8q0.a(str, hne.i(1.0f, false, "TIMER_TITLE"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            if (wnq0Var.f39460a) {
                fetVar2.e0(338833495);
                q5x.f(wnq0Var, s5x0.L(jm40Var, 8.0f, 0.0f, 2), fetVar2, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(339008397);
                fetVar2.r(false);
            }
            b2 = 1;
            fetVar2.r(true);
            w1gVar2 = w1gVar;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1878274201, new cnc(w1gVar2, (byte) 26), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            w1gVar2 = w1gVar;
            b2 = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t1g(w1gVar2, i, b2);
        }
    }
}
