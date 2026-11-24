package a;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.javax.sip.message.Response;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.aggregator.impl.category.presentation.models.AggregatorProvidersFiltersUiModel;
import org.xplatform.aggregator.impl.category.presentation.models.FilterCategoryUiModel;
import org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi;
import org.xplatform.aggregator.impl.category.presentation.models.ProviderUIModel;
import org.xplatform.aggregator.impl.category.presentation.models.SortingOptionUiModel;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class dwi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b5 f6800a;
    public static final sy2 b = new sy2(11);
    public static final ugd c = new ugd(-1518833848, false, new qbd((byte) 12));
    public static final ugd d = new ugd(-591093908, false, new qbd((byte) 13));
    public static final ugd e = new ugd(1357669475, false, new qbd((byte) 14));
    public static final ugd f = new ugd(1863672092, false, new chd(5));
    public static final ugd g = new ugd(-1421659854, false, new fhd(19));
    public static final ugd h;
    public static final ugd i;
    public static final ugd j;
    public static final ugd k;
    public static final int[] l;
    public static final int[] m;
    public static final long[] n;

    static {
        byte b2 = 0;
        f6800a = new b5(b2);
        new ugd(-1411186657, false, new hhd(b2));
        h = new ugd(834049047, false, new lhd((byte) 16));
        i = new ugd(-39816177, false, new shd((byte) 7));
        j = new ugd(-124625648, false, new shd((byte) 8));
        k = new ugd(-294244590, false, new shd((byte) 9));
        l = new int[]{R.attr.theme, org.xbet.client1.R.attr.theme};
        m = new int[]{org.xbet.client1.R.attr.materialThemeOverlay};
        n = new long[0];
    }

    public static final void A(qfj0 qfj0Var, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(630522099);
        int i3 = (fetVar.g(qfj0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarK0 = q8a.k0(jm40.b, enx.b);
            zcl zclVar = qmk.f28987a;
            o5n0.l(54, u1c.M(-467321837, new awi0(qfj0Var, function1), fetVar), u1c.M(-212932430, new awi0(function1, qfj0Var), fetVar), fetVar, s5x0.N(mm40VarK0, 0.0f, 12.0f, 0.0f, 0.0f, 13));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) qfj0Var, function1, i2, (byte) 14);
        }
    }

    public static final void B(int i2, fet fetVar, b8j0 b8j0Var, Function1 function1) {
        fetVar.g0(-1778074317);
        int i3 = (fetVar.i(function1) ? 4 : 2) | i2 | (fetVar.g(b8j0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            kcx.s(function1, b8j0Var, H(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), b8j0Var.getFirst(), b8j0Var.getLast()), fetVar, i3 & 126);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ob(function1, b8j0Var, i2);
        }
    }

    public static final void C(mm40 mm40Var, bdz bdzVar, e2d e2dVar, l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        bdz bdzVar2;
        fet fetVar2;
        boolean z;
        bdzVar.getClass();
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(880377366);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            bdzVar2 = bdzVar;
            i3 |= fetVar.g(bdzVar2) ? 32 : 16;
        } else {
            bdzVar2 = bdzVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(e2dVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = 57344 & i3;
            boolean z2 = i4 == 16384;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new gno0(function1, (byte) 24);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = i4 == 16384;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new gno0(function1, (byte) 25);
                fetVar.o0(objP2);
            }
            v3c.A(function0, (Function0) objP2, null, fetVar, 0, 4);
            fetVar2 = fetVar;
            Object[] objArr = new Object[0];
            int i5 = i3 & 7168;
            boolean z4 = i5 == 2048;
            Object objP3 = fetVar2.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new g7o0(l7m0Var, (byte) 7);
                fetVar2.o0(objP3);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP3, fetVar2);
            Object[] objArr2 = new Object[0];
            boolean z5 = i5 == 2048;
            Object objP4 = fetVar2.P();
            if (z5 || objP4 == cl5Var) {
                objP4 = new g7o0(l7m0Var, (byte) 8);
                fetVar2.o0(objP4);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP4, fetVar2);
            n0q n0qVar = o7k0.c;
            mm40 mm40VarE = mm40Var.e(n0qVar);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z6 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z6) {
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
            t2p0 t2p0Var = (t2p0) l7m0VarY.getValue();
            if (t2p0Var != null) {
                if (t2p0Var instanceof s2p0) {
                    fetVar2.e0(771864208);
                    r(null, bdzVar2, e2dVar, ((s2p0) t2p0Var).f31513a, true, ((Boolean) l7m0VarY2.getValue()).booleanValue(), function1, fetVar, (i3 & 112) | 24576 | (i3 & 896) | ((i3 << 6) & 3670016));
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                    z = true;
                } else if (t2p0Var instanceof r2p0) {
                    fetVar2.e0(771875321);
                    mm40 mm40VarR = knm0.r(n0qVar);
                    tj30 tj30VarC2 = zq8.c(gqw0.e, false);
                    int iHashCode2 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM2 = fetVar2.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarR);
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC2, shdVar);
                    jpm0.o(fetVar2, bh90VarM2, shdVar2);
                    vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                    jpm0.o(fetVar2, mm40VarC1, shdVar4);
                    mdm mdmVar = ((r2p0) t2p0Var).f29748a;
                    boolean z7 = i4 == 16384;
                    Object objP5 = fetVar2.P();
                    if (z7 || objP5 == cl5Var) {
                        objP5 = new gno0(function1, (byte) 26);
                        fetVar2.o0(objP5);
                    }
                    jcb.l(null, mdmVar, false, (Function0) objP5, fetVar2, 0, 5);
                    z = true;
                    fetVar2.r(true);
                    fetVar2.r(false);
                } else {
                    z = true;
                    if (t2p0Var instanceof q2p0) {
                        fetVar2.e0(771888689);
                        r(null, bdzVar, e2dVar, ((q2p0) t2p0Var).f28012a, false, ((Boolean) l7m0VarY2.getValue()).booleanValue(), function1, fetVar, (i3 & 112) | 24576 | (i3 & 896) | ((i3 << 6) & 3670016));
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    }
                }
                fetVar2.r(z);
            }
            throw b1j.f(771861915, fetVar2, false);
        }
        fetVar2 = fetVar;
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pzo0(mm40Var, bdzVar, e2dVar, l7m0Var, function1, i2, (byte) 1);
        }
    }

    public static final void D(vmb0 vmb0Var, bxq0 bxq0Var, vne vneVar, boolean z, pz40 pz40Var, ugd ugdVar, fet fetVar, int i2) {
        vmb0 vmb0Var2;
        int i3;
        fetVar.g0(-1413720282);
        if ((i2 & 6) == 0) {
            vmb0Var2 = vmb0Var;
            i3 = (fetVar.g(vmb0Var2) ? 4 : 2) | i2;
        } else {
            vmb0Var2 = vmb0Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(bxq0Var) : fetVar.i(bxq0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(null) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.i(vneVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.g(pz40Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(ugdVar) ? 1048576 : 524288;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            String strS = xsm0.s(org.xbet.client1.R.string.tooltip_description, fetVar);
            boolean zI = ((i3 & 112) == 32 || ((i3 & 64) != 0 && fetVar.i(bxq0Var))) | ((i3 & 896) == 256) | fetVar.i(vneVar) | ((458752 & i3) == 131072);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new kk0(bxq0Var, vneVar, pz40Var, (byte) 9);
                fetVar.o0(objP);
            }
            int i4 = (i3 & 14) | 3072;
            k13.a(vmb0Var2, (Function0) objP, new wmb0(z, pnh0.f27287a, true, 0), u1c.M(-1287705660, new a8(strS, ugdVar, (byte) 5), fetVar), fetVar, i4, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2((Object) vmb0Var, (Object) bxq0Var, (Object) vneVar, z, (Object) pz40Var, (wdr) ugdVar, i2, (byte) 4);
        }
    }

    public static final void E(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        l7m0 l7m0Var2;
        int i3;
        Unit unit;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1688064096);
        byte b2 = 2;
        int i4 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            n0q n0qVar = o7k0.c;
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarR = knm0.r(i120.Q(n0qVar, s6t0.b().f33626a.getBackground(), jd8.n));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(rsm0.w(org.xbet.client1.R.string.upcoming_events, 0, fetVar), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
            int i5 = i4 & 112;
            boolean z = i5 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new zbt0(function1, b2);
                fetVar.o0(objP);
            }
            hlm.c(null, immVar, null, (Function0) objP, null, null, null, null, null, null, null, null, fetVar, 0, 0, 4085);
            mdm mdmVar = ((ugt0) l7m0Var.getValue()).f35642a;
            if (mdmVar == null) {
                fetVar.e0(752895627);
                fetVar.r(false);
                unit = null;
                i3 = i5;
            } else {
                fetVar.e0(752895628);
                i3 = i5;
                p(mdmVar, function1, fetVar, i3);
                fetVar.r(false);
                unit = Unit.f46060a;
            }
            if (unit == null) {
                fetVar.e0(-1776823896);
                zcl zclVar = qmk.f28987a;
                lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 24.0f, 7);
                boolean z2 = (i3 == 32) | ((i4 & 14) == 4);
                Object objP2 = fetVar.P();
                if (z2 || objP2 == cl5Var) {
                    l7m0Var2 = l7m0Var;
                    objP2 = new ys4(l7m0Var2, function1, (byte) 27);
                    fetVar.o0(objP2);
                } else {
                    l7m0Var2 = l7m0Var;
                }
                b8k0.e(n0qVar, xczVarA, lh80VarU, null, null, null, false, null, (Function1) objP2, fetVar, 6, Response.SERVER_TIMEOUT);
                fetVar.r(false);
            } else {
                l7m0Var2 = l7m0Var;
                fetVar.e0(-1776827647);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            l7m0Var2 = l7m0Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var2, function1, i2, (byte) 11);
        }
    }

    public static final void F(bxq0 bxq0Var, pz40 pz40Var, ugd ugdVar, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1873232064);
        byte b2 = 1;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.h(true) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar.g(bxq0Var) : fetVar.i(bxq0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(pz40Var) ? 256 : 128;
        }
        byte b3 = 0;
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.h(false) ? 2048 : 1024;
        }
        int i4 = i2 & 24576;
        jm40 jm40Var = jm40.b;
        if (i4 == 0) {
            i3 |= fetVar.g(jm40Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.i(ugdVar) ? 131072 : 65536;
        }
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            mm40 mm40VarS = j2e.S(j120.b0(fnn0.a(fnn0.a(jm40Var, bxq0Var, new pa6(bxq0Var, b3)), bxq0Var, new pa6(bxq0Var, b2)).e(new kp80(new on((Object) xsm0.s(org.xbet.client1.R.string.tooltip_label, fetVar), (Object) vneVar, (Object) bxq0Var, (byte) 26))), new qo5(vneVar, bxq0Var, (byte) 13)), new ci2(bxq0Var, pz40Var, (byte) 20));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iX = e3c.x(fetVar);
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
            shd shdVar = gqw0.y;
            if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX))) {
                rw2.t(iX, fetVar, iX, shdVar);
            }
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            twn.v((i3 >> 15) & 14, ugdVar, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sa5(bxq0Var, pz40Var, ugdVar, i2);
        }
    }

    public static final mm40 G(mm40 mm40Var, cv8 cv8Var) {
        mm40Var.getClass();
        int iOrdinal = cv8Var.c.ordinal();
        mm40 mm40VarQ = jm40.b;
        if (iOrdinal == 0) {
            zcl zclVar = qmk.f28987a;
            ugg0 ugg0VarC = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
            pz40 pz40Var = s6t0.f31722a;
            mm40VarQ = i120.Q(mm40VarQ, s6t0.b().f33626a.getBackgroundContent(), ugg0VarC);
        } else if (iOrdinal == 1) {
            zcl zclVar2 = qmk.f28987a;
            ugg0 ugg0VarC2 = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
            pz40 pz40Var2 = s6t0.f31722a;
            mm40VarQ = i120.Q(mm40VarQ, s6t0.b().f33626a.getBackgroundContent(), ugg0VarC2);
        } else if (iOrdinal == 2) {
            pz40 pz40Var3 = s6t0.f31722a;
            mm40VarQ = i120.Q(mm40VarQ, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
        } else if (iOrdinal == 3) {
            zcl zclVar3 = qmk.f28987a;
            ugg0 ugg0VarA = vgg0.a(16.0f);
            pz40 pz40Var4 = s6t0.f31722a;
            mm40VarQ = i120.Q(mm40VarQ, s6t0.b().f33626a.getBackgroundContent(), ugg0VarA);
        } else if (iOrdinal != 4) {
            t9f.b();
            return null;
        }
        return s5x0.I(s5x0.I(mm40Var, cv8Var.b).e(mm40VarQ), cv8Var.f5019a);
    }

    public static final mm40 H(long j2, boolean z, boolean z2) {
        jm40 jm40Var = jm40.b;
        if (z && z2) {
            zcl zclVar = qmk.f28987a;
            return i120.Q(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), j2, vgg0.b(16.0f, 16.0f, 16.0f, 16.0f));
        }
        if (z) {
            zcl zclVar2 = qmk.f28987a;
            return i120.Q(s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 0.0f, 13), j2, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12));
        }
        if (!z2) {
            return i120.Q(jm40Var, j2, jd8.n);
        }
        zcl zclVar3 = qmk.f28987a;
        return i120.Q(jm40Var, j2, vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3));
    }

    public static final Function0 I(Function1 function1, fet fetVar, int i2) {
        int iHashCode = Long.hashCode(fetVar.T);
        Context context = (Context) fetVar.k(dy2.b);
        androidx.compose.runtime.a aVarG = e3c.G(fetVar);
        fzg0 fzg0Var = (fzg0) fetVar.k(hzg0.f13904a);
        View view = (View) fetVar.k(dy2.f);
        boolean zI = ((((i2 & 14) ^ 6) > 4 && fetVar.g(function1)) || (i2 & 6) == 4) | fetVar.i(context) | fetVar.i(aVarG) | fetVar.i(fzg0Var) | fetVar.e(iHashCode) | fetVar.i(view);
        Object objP = fetVar.P();
        if (zI || objP == ukd.f35823a) {
            Object n33Var = new n33(context, function1, aVarG, fzg0Var, iHashCode, view);
            fetVar.o0(n33Var);
            objP = n33Var;
        }
        return (Function0) objP;
    }

    public static ColorFilter J(int i2, n78 n78Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object objR = sf3.r(n78Var);
            if (objR != null) {
                return sf3.d(i2, objR);
            }
            return null;
        }
        PorterDuff.Mode modeQ = xf0.Q(n78Var);
        if (modeQ != null) {
            return new PorterDuffColorFilter(i2, modeQ);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object K(boolean z, boolean z2, t33 t33Var, t33 t33Var2, zje zjeVar) {
        jlw jlwVar;
        if (zjeVar instanceof jlw) {
            jlwVar = (jlw) zjeVar;
            int i2 = jlwVar.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jlwVar.j = i2 - Integer.MIN_VALUE;
            } else {
                jlwVar = new jlw(zjeVar);
            }
        } else {
            jlwVar = new jlw(zjeVar);
        }
        Object obj = jlwVar.i;
        wne wneVar = wne.f39444a;
        int i3 = jlwVar.j;
        if (i3 == 0) {
            z1x.P(obj);
            tu3 tu3Var = new tu3(t33Var, z, t33Var2, z2, (yje) null);
            jlwVar.j = 1;
            if (d5c.J(jlwVar, tu3Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public static final j L(j jVar, ar20 ar20Var) {
        Object next;
        jVar.getClass();
        ar20Var.getClass();
        Iterator it = jVar.a().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.d(((j) next).f15657a, ar20Var)) {
                return (j) next;
            }
        }
        next = null;
        return (j) next;
    }

    public static final String M(d0t d0tVar) {
        d0tVar.getClass();
        String strS0 = qzb.s0(d0tVar);
        String strT0 = qzb.t0(d0tVar);
        if (StringsKt.W(strS0) || StringsKt.W(strT0)) {
            return StringsKt.W(strT0) ? strS0 : strT0;
        }
        return w6x.q(strS0, " - ", strT0);
    }

    public static final CharSequence N(j jVar, CharSequence charSequence) {
        jVar.getClass();
        charSequence.getClass();
        return charSequence.subSequence(jVar.b, jVar.c);
    }

    public static final bhu0 O(e7z e7zVar) {
        bhu0 bhu0Var = e7zVar.p;
        if (bhu0Var != null) {
            return bhu0Var;
        }
        throw cs0.g("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [a.iun] */
    public static final mi1 P(AggregatorProvidersFiltersUiModel aggregatorProvidersFiltersUiModel) {
        ?? arrayList;
        l3q o3qVar;
        aggregatorProvidersFiltersUiModel.getClass();
        long j2 = aggregatorProvidersFiltersUiModel.f46276a;
        List<FilterCategoryUiModel> list = aggregatorProvidersFiltersUiModel.b;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                List list2 = ((FilterCategoryUiModel) it.next()).d;
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((FilterItemUi) it2.next()).getC()) {
                            arrayList = new ArrayList(r3d.q(list, 10));
                            for (FilterCategoryUiModel filterCategoryUiModel : list) {
                                List list3 = filterCategoryUiModel.d;
                                w3q w3qVar = filterCategoryUiModel.c;
                                ArrayList<FilterItemUi> arrayList2 = new ArrayList();
                                for (Object obj : list3) {
                                    if (((FilterItemUi) obj).getC()) {
                                        arrayList2.add(obj);
                                    }
                                }
                                String str = filterCategoryUiModel.f46277a;
                                String str2 = filterCategoryUiModel.b;
                                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                                for (FilterItemUi filterItemUi : arrayList2) {
                                    if (w3qVar == w3q.b && (filterItemUi instanceof ProviderUIModel)) {
                                        ProviderUIModel providerUIModel = (ProviderUIModel) filterItemUi;
                                        o3qVar = new s5d0(providerUIModel.f46280a, providerUIModel.b, providerUIModel.e, providerUIModel.f, gz8.f12169a, iun.f15405a, "", 0, null);
                                    } else if (filterItemUi instanceof SortingOptionUiModel) {
                                        SortingOptionUiModel sortingOptionUiModel = (SortingOptionUiModel) filterItemUi;
                                        o3qVar = new slk0(sortingOptionUiModel.f46281a, sortingOptionUiModel.b, sortingOptionUiModel.e, sortingOptionUiModel.f);
                                    } else {
                                        o3qVar = new o3q(filterItemUi.getF46280a(), filterItemUi.getB());
                                    }
                                    arrayList3.add(o3qVar);
                                }
                                arrayList.add(new x2q(str, str2, w3qVar, arrayList3));
                            }
                        }
                    }
                }
            }
            arrayList = iun.f15405a;
        } else {
            arrayList = iun.f15405a;
        }
        return new mi1(j2, arrayList);
    }

    public static final dr3 Q(gr3 gr3Var) {
        lnm0 lnm0Var;
        mab mabVar;
        Long l2 = gr3Var.f11762a;
        Integer num = gr3Var.g;
        if (l2 == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l2.longValue();
        Integer num2 = gr3Var.b;
        if (num2 == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num2.intValue();
        Double d2 = gr3Var.c;
        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
        Double d3 = gr3Var.f;
        if (d3 == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue2 = d3.doubleValue();
        if (num != null) {
            yk5 yk5Var = mab.f21451a;
            int iIntValue2 = num.intValue();
            yk5Var.getClass();
            if (iIntValue2 == 1) {
                mabVar = mab.b;
            } else if (iIntValue2 != 2) {
                mabVar = iIntValue2 != 3 ? mab.e : mab.d;
            } else {
                mabVar = mab.c;
            }
            int iOrdinal = mabVar.ordinal();
            if (iOrdinal == 0) {
                lnm0Var = lnm0.c;
            } else if (iOrdinal == 1) {
                lnm0Var = lnm0.d;
            } else if (iOrdinal == 2) {
                lnm0Var = lnm0.e;
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return null;
                }
                lnm0Var = lnm0.b;
            }
        } else {
            lnm0Var = lnm0.b;
        }
        Double d4 = gr3Var.h;
        double dDoubleValue3 = d4 != null ? d4.doubleValue() : 0.0d;
        List list = gr3Var.k;
        if (list == null) {
            jf4.k(null);
            return null;
        }
        List list2 = gr3Var.j;
        if (list2 == null) {
            jf4.k(null);
            return null;
        }
        List list3 = gr3Var.e;
        if (list3 == null) {
            jf4.k(null);
            return null;
        }
        rk10 rk10Var = gr3Var.i;
        csr csrVarA0 = rk10Var != null ? d5c.a0(rk10Var) : csr.e;
        List list4 = gr3Var.d;
        if (list4 != null) {
            return new dr3(jLongValue, iIntValue, dDoubleValue, dDoubleValue2, lnm0Var, dDoubleValue3, list, list2, list3, csrVarA0, list4);
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    public static final px4 R(hx4 hx4Var, ctf0 ctf0Var, boolean z) {
        boolean z2;
        String strA;
        String strA2;
        boolean z3;
        fx6 fx6Var;
        boolean z4;
        ctf0Var.getClass();
        yyc yycVar = hx4Var.b;
        a8q0 a8q0Var = hx4Var.f13795a;
        bx6 bx6Var = hx4Var.c;
        tw6 tw6Var = bx6Var.b;
        boolean z5 = tw6Var.n || z;
        pn40 pn40Var = pn40.f27267a;
        BigDecimal bigDecimal = yycVar.d;
        boolean z6 = yycVar.f;
        BigDecimal bigDecimal2 = yycVar.f43459a;
        BigDecimal bigDecimal3 = yycVar.e;
        boolean z7 = z5;
        Object[] objArr = {pn40.c(bigDecimal.doubleValue(), p3u0.c)};
        lsm0 lsm0Var = ctf0Var.b;
        mx6 mx6Var = new mx6(a8q0Var, lsm0Var.a(org.xbet.client1.R.string.bet_enter_coefficient_v2, Arrays.copyOf(objArr, 1)), false, false, false);
        if (!yycVar.g) {
            if (z6) {
                strA2 = lsm0Var.a(org.xbet.client1.R.string.max_coef_v2, Arrays.copyOf(new Object[]{pn40.g(bigDecimal3)}, 1));
            } else {
                z2 = false;
                strA = lsm0Var.a(org.xbet.client1.R.string.coupon_makebet_coef, Arrays.copyOf(new Object[0], 0));
            }
            oln0 oln0Var = new oln0(strA, true, z2);
            xnb0 xnb0Var = new xnb0("", "", z2);
            if (!z7 || bigDecimal2.compareTo(bigDecimal) <= 0) {
                z3 = z2;
            } else {
                z3 = true;
            }
            if (!z7 && bigDecimal2.compareTo(bigDecimal3) < 0) {
                z2 = true;
            }
            jke jkeVar = new jke(true, true, z3, z2);
            if (z7) {
                fx6Var = fx6.c;
            } else if (z7) {
                fx6Var = fx6.b;
            } else {
                if (bigDecimal2.compareTo(bigDecimal) >= 0 || bigDecimal2.compareTo(bigDecimal3) > 0) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                boolean z8 = bigDecimal2.compareTo(new BigDecimal(String.valueOf(-1.0d))) == 0;
                if ((z4 && !z8) || z6) {
                    fx6Var = fx6.b;
                }
            }
            return new px4(new yv6(mx6Var, oln0Var, xnb0Var, jkeVar, fx6Var, "", true), unh0.m0(bx6Var, ctf0Var, hx4Var.e, z), jtt0.r(hx4Var.d, tw6Var.f, z));
        }
        strA2 = lsm0Var.a(org.xbet.client1.R.string.min_coef_v2, Arrays.copyOf(new Object[]{bigDecimal}, 1));
        strA = strA2;
        z2 = false;
        oln0 oln0Var2 = new oln0(strA, true, z2);
        xnb0 xnb0Var2 = new xnb0("", "", z2);
        if (z7) {
            z3 = z2;
        } else {
            z3 = z2;
        }
        if (!z7) {
            z2 = true;
        }
        jke jkeVar2 = new jke(true, true, z3, z2);
        if (z7) {
            fx6Var = fx6.c;
        } else if (z7) {
            fx6Var = fx6.b;
        } else {
            if (bigDecimal2.compareTo(bigDecimal) >= 0) {
                z4 = false;
            } else {
                z4 = false;
            }
            if (bigDecimal2.compareTo(new BigDecimal(String.valueOf(-1.0d))) == 0) {
            }
            fx6Var = z4 ? fx6.f10293a : fx6.f10293a;
        }
        return new px4(new yv6(mx6Var, oln0Var2, xnb0Var2, jkeVar2, fx6Var, "", true), unh0.m0(bx6Var, ctf0Var, hx4Var.e, z), jtt0.r(hx4Var.d, tw6Var.f, z));
    }

    public static String S(int i2) {
        return brm0.l("OperatingMode(mode=", i2, ')');
    }

    public static final void T(fet fetVar, mm40 mm40Var, int i2, w6k w6kVar, clz clzVar, i0h0 i0h0Var, k6z k6zVar, bh90 bh90Var) {
        mkd.c0.getClass();
        jpm0.o(fetVar, bh90Var, gqw0.w);
        jpm0.o(fetVar, mm40Var, new o33((byte) 0));
        jpm0.o(fetVar, w6kVar, new ma2((byte) 21));
        jpm0.o(fetVar, clzVar, new ma2((byte) 22));
        jpm0.o(fetVar, i0h0Var, new ma2((byte) 23));
        jpm0.o(fetVar, k6zVar, new ma2((byte) 24));
        jpm0.o(fetVar, Integer.valueOf(i2), gqw0.y);
    }

    public static Context U(int i2, int i3, Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m, i2, i3);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i4 = iArr2[0];
        boolean z = (context instanceof tje) && ((tje) context).f34043a == i4;
        if (i4 == 0 || z) {
            return context;
        }
        tje tjeVar = new tje(context, i4);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
            for (int i5 = 0; i5 < iArr.length; i5++) {
                iArr3[i5] = typedArrayObtainStyledAttributes2.getResourceId(i5, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = iArr3[i6];
            if (i7 != 0) {
                tjeVar.getTheme().applyStyle(i7, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, l);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            tjeVar.getTheme().applyStyle(resourceId, true);
        }
        return tjeVar;
    }

    public static Context V(Context context, AttributeSet attributeSet, int i2, int i3) {
        return U(i2, i3, context, attributeSet, new int[0]);
    }

    public static final void a(mm40 mm40Var, uy uyVar, fet fetVar, int i2) {
        uyVar.getClass();
        fetVar.g0(1873021630);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(uyVar) ? 32 : 16);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(uyVar, fetVar);
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(pz40VarF);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new xx(pz40VarF, b2);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Object[] objArr2 = new Object[0];
            boolean zG2 = fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj) {
                objP2 = new xx(pz40VarF, (byte) 3);
                fetVar.o0(objP2);
            }
            l7m0 l7m0VarY2 = v3c.Y(objArr2, (Function0) objP2, fetVar);
            Object[] objArr3 = new Object[0];
            boolean zG3 = fetVar.g(pz40VarF);
            Object objP3 = fetVar.P();
            if (zG3 || objP3 == obj) {
                objP3 = new xx(pz40VarF, (byte) 6);
                fetVar.o0(objP3);
            }
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(436690814, new zx(mm40Var, l7m0VarY, l7m0VarY2, v3c.Y(objArr3, (Function0) objP3, fetVar), (byte) 0), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mz7(mm40Var, uyVar, i2, (byte) 15);
        }
    }

    public static final void b(Function1 function1, mm40 mm40Var, Function1 function2, fet fetVar, int i2, int i3) {
        int i4;
        mm40 mm40Var2;
        Function1 function3;
        fetVar.g0(-1783766393);
        if ((i2 & 6) == 0) {
            i4 = (fetVar.i(function1) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= fetVar.i(function2) ? 256 : 128;
        }
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            mm40 mm40Var3 = i5 != 0 ? jm40.b : mm40Var;
            sy2 sy2Var = b;
            Function1 function4 = i6 != 0 ? sy2Var : function2;
            c(function1, mm40Var3, null, sy2Var, function4, fetVar, (i4 & 14) | 3072 | (i4 & 112) | ((i4 << 6) & 57344), 4);
            mm40Var2 = mm40Var3;
            function3 = function4;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            function3 = function2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z23(function1, mm40Var2, function3, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:61:0x009b  */
    /* JADX WARN: Code duplicated, block: B:63:0x009e  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:70:0x0103  */
    /* JADX WARN: Code duplicated, block: B:72:0x010e  */
    /* JADX WARN: Code duplicated, block: B:74:0x013c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0140  */
    /* JADX WARN: Code duplicated, block: B:78:0x0157  */
    /* JADX WARN: Code duplicated, block: B:80:0x0165  */
    /* JADX WARN: Code duplicated, block: B:82:0x016d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0193  */
    /* JADX WARN: Code duplicated, block: B:88:0x0199  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    public static final void c(Function1 function1, mm40 mm40Var, Function1 function2, Function1 function3, Function1 function4, fet fetVar, int i2, int i3) {
        int i4;
        Function1 function5;
        int i5;
        Function1 function6;
        int i6;
        int i7;
        Function1 function7;
        int i8;
        boolean z;
        Function1 function8;
        Function1 function9;
        Function1 function10;
        yfe0 yfe0VarU;
        sy2 sy2Var;
        int iHashCode;
        mm40 mm40VarC0;
        w6k w6kVar;
        k6z k6zVar;
        Function1 function11;
        bh90 bh90VarM;
        clz clzVar;
        i0h0 i0h0Var;
        Function1 function12;
        Function0 function0I;
        Function0 function0I2;
        fetVar.g0(-180024211);
        v0 v0Var = fetVar.f9421a;
        if ((i2 & 6) == 0) {
            i4 = (fetVar.i(function1) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        int i9 = i3 & 4;
        if (i9 == 0) {
            if ((i2 & 384) == 0) {
                function5 = function2;
                i4 |= fetVar.i(function5) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    function6 = function3;
                    if (fetVar.i(function6)) {
                        i6 = 2048;
                    } else {
                        i6 = 1024;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((i2 & 24576) == 0) {
                        function7 = function4;
                        if (fetVar.i(function7)) {
                            i8 = 16384;
                        } else {
                            i8 = 8192;
                        }
                        i4 |= i8;
                    }
                    if ((i4 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar.U(i4 & 1, z)) {
                        if (i9 != 0) {
                            function8 = null;
                        } else {
                            function8 = function5;
                        }
                        sy2Var = b;
                        if (i5 != 0) {
                            function6 = sy2Var;
                        }
                        if (i7 != 0) {
                            function7 = sy2Var;
                        }
                        iHashCode = Long.hashCode(fetVar.T);
                        mm40VarC0 = kbc.c0(fetVar, mm40Var.e(npq.b).e(mqq.b).e(oqq.b).e(kqq.b));
                        w6kVar = (w6k) fetVar.k(bmd.h);
                        k6zVar = (k6z) fetVar.k(bmd.n);
                        function11 = function6;
                        bh90VarM = fetVar.m();
                        clzVar = (clz) fetVar.k(or00.f25714a);
                        i0h0Var = (i0h0) fetVar.k(xr00.f41346a);
                        if (function8 != null) {
                            fetVar.e0(1313917368);
                            function0I2 = I(function1, fetVar, i4 & 14);
                            if (v0Var instanceof m6t0) {
                                e3c.E();
                                throw null;
                            }
                            fetVar.i0();
                            if (fetVar.S) {
                                fetVar.l(function0I2);
                            } else {
                                fetVar.r0();
                            }
                            function12 = function11;
                            T(fetVar, mm40VarC0, iHashCode, w6kVar, clzVar, i0h0Var, k6zVar, bh90VarM);
                            jpm0.o(fetVar, function8, new ma2((byte) 25));
                            jpm0.o(fetVar, function7, new ma2((byte) 26));
                            jpm0.o(fetVar, function12, new ma2((byte) 27));
                            fetVar.r(true);
                            fetVar.r(false);
                        } else {
                            function12 = function11;
                            fetVar.e0(1314774735);
                            function0I = I(function1, fetVar, i4 & 14);
                            if (v0Var instanceof m6t0) {
                                e3c.E();
                                throw null;
                            }
                            fetVar.Y(null, 125, 1, null);
                            fetVar.r = true;
                            if (fetVar.S) {
                                fetVar.l(function0I);
                            } else {
                                fetVar.r0();
                            }
                            T(fetVar, mm40VarC0, iHashCode, w6kVar, clzVar, i0h0Var, k6zVar, bh90VarM);
                            jpm0.o(fetVar, function7, new ma2((byte) 28));
                            jpm0.o(fetVar, function12, new ma2((byte) 29));
                            fetVar.r(true);
                            fetVar.r(false);
                        }
                        function9 = function12;
                    } else {
                        fetVar.X();
                        function8 = function5;
                        function9 = function6;
                    }
                    function10 = function7;
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new a33(function1, mm40Var, function8, function9, function10, i2, i3);
                    }
                }
                i4 |= 24576;
                function7 = function4;
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    if (i9 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    sy2Var = b;
                    if (i5 != 0) {
                        function6 = sy2Var;
                    }
                    if (i7 != 0) {
                        function7 = sy2Var;
                    }
                    iHashCode = Long.hashCode(fetVar.T);
                    mm40VarC0 = kbc.c0(fetVar, mm40Var.e(npq.b).e(mqq.b).e(oqq.b).e(kqq.b));
                    w6kVar = (w6k) fetVar.k(bmd.h);
                    k6zVar = (k6z) fetVar.k(bmd.n);
                    function11 = function6;
                    bh90VarM = fetVar.m();
                    clzVar = (clz) fetVar.k(or00.f25714a);
                    i0h0Var = (i0h0) fetVar.k(xr00.f41346a);
                    if (function8 != null) {
                        fetVar.e0(1313917368);
                        function0I2 = I(function1, fetVar, i4 & 14);
                        if (v0Var instanceof m6t0) {
                            e3c.E();
                            throw null;
                        }
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(function0I2);
                        } else {
                            fetVar.r0();
                        }
                        function12 = function11;
                        T(fetVar, mm40VarC0, iHashCode, w6kVar, clzVar, i0h0Var, k6zVar, bh90VarM);
                        jpm0.o(fetVar, function8, new ma2((byte) 25));
                        jpm0.o(fetVar, function7, new ma2((byte) 26));
                        jpm0.o(fetVar, function12, new ma2((byte) 27));
                        fetVar.r(true);
                        fetVar.r(false);
                    } else {
                        function12 = function11;
                        fetVar.e0(1314774735);
                        function0I = I(function1, fetVar, i4 & 14);
                        if (v0Var instanceof m6t0) {
                            e3c.E();
                            throw null;
                        }
                        fetVar.Y(null, 125, 1, null);
                        fetVar.r = true;
                        if (fetVar.S) {
                            fetVar.l(function0I);
                        } else {
                            fetVar.r0();
                        }
                        T(fetVar, mm40VarC0, iHashCode, w6kVar, clzVar, i0h0Var, k6zVar, bh90VarM);
                        jpm0.o(fetVar, function7, new ma2((byte) 28));
                        jpm0.o(fetVar, function12, new ma2((byte) 29));
                        fetVar.r(true);
                        fetVar.r(false);
                    }
                    function9 = function12;
                } else {
                    fetVar.X();
                    function8 = function5;
                    function9 = function6;
                }
                function10 = function7;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new a33(function1, mm40Var, function8, function9, function10, i2, i3);
                }
            }
            i4 |= 3072;
            function6 = function3;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    function7 = function4;
                    if (fetVar.i(function7)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    if (i9 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    sy2Var = b;
                    if (i5 != 0) {
                        function6 = sy2Var;
                    }
                    if (i7 != 0) {
                        function7 = sy2Var;
                    }
                    iHashCode = Long.hashCode(fetVar.T);
                    mm40VarC0 = kbc.c0(fetVar, mm40Var.e(npq.b).e(mqq.b).e(oqq.b).e(kqq.b));
                    w6kVar = (w6k) fetVar.k(bmd.h);
                    k6zVar = (k6z) fetVar.k(bmd.n);
                    function11 = function6;
                    bh90VarM = fetVar.m();
                    clzVar = (clz) fetVar.k(or00.f25714a);
                    i0h0Var = (i0h0) fetVar.k(xr00.f41346a);
                    if (function8 != null) {
                        fetVar.e0(1313917368);
                        function0I2 = I(function1, fetVar, i4 & 14);
                        if (v0Var instanceof m6t0) {
                            e3c.E();
                            throw null;
                        }
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(function0I2);
                        } else {
                            fetVar.r0();
                        }
                        function12 = function11;
                        T(fetVar, mm40VarC0, iHashCode, w6kVar, clzVar, i0h0Var, k6zVar, bh90VarM);
                        jpm0.o(fetVar, function8, new ma2((byte) 25));
                        jpm0.o(fetVar, function7, new ma2((byte) 26));
                        jpm0.o(fetVar, function12, new ma2((byte) 27));
                        fetVar.r(true);
                        fetVar.r(false);
                    } else {
                        function12 = function11;
                        fetVar.e0(1314774735);
                        function0I = I(function1, fetVar, i4 & 14);
                        if (v0Var instanceof m6t0) {
                            e3c.E();
                            throw null;
                        }
                        fetVar.Y(null, 125, 1, null);
                        fetVar.r = true;
                        if (fetVar.S) {
                            fetVar.l(function0I);
                        } else {
                            fetVar.r0();
                        }
                        T(fetVar, mm40VarC0, iHashCode, w6kVar, clzVar, i0h0Var, k6zVar, bh90VarM);
                        jpm0.o(fetVar, function7, new ma2((byte) 28));
                        jpm0.o(fetVar, function12, new ma2((byte) 29));
                        fetVar.r(true);
                        fetVar.r(false);
                    }
                    function9 = function12;
                } else {
                    fetVar.X();
                    function8 = function5;
                    function9 = function6;
                }
                function10 = function7;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new a33(function1, mm40Var, function8, function9, function10, i2, i3);
                }
            }
            i4 |= 24576;
            function7 = function4;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                if (i9 != 0) {
                    function8 = null;
                } else {
                    function8 = function5;
                }
                sy2Var = b;
                if (i5 != 0) {
                    function6 = sy2Var;
                }
                if (i7 != 0) {
                    function7 = sy2Var;
                }
                iHashCode = Long.hashCode(fetVar.T);
                mm40VarC0 = kbc.c0(fetVar, mm40Var.e(npq.b).e(mqq.b).e(oqq.b).e(kqq.b));
                w6kVar = (w6k) fetVar.k(bmd.h);
                k6zVar = (k6z) fetVar.k(bmd.n);
                function11 = function6;
                bh90VarM = fetVar.m();
                clzVar = (clz) fetVar.k(or00.f25714a);
                i0h0Var = (i0h0) fetVar.k(xr00.f41346a);
                if (function8 != null) {
                    fetVar.e0(1313917368);
                    function0I2 = I(function1, fetVar, i4 & 14);
                    if (v0Var instanceof m6t0) {
                        e3c.E();
                        throw null;
                    }
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(function0I2);
                    } else {
                        fetVar.r0();
                    }
                    function12 = function11;
                    T(fetVar, mm40VarC0, iHashCode, w6kVar, clzVar, i0h0Var, k6zVar, bh90VarM);
                    jpm0.o(fetVar, function8, new ma2((byte) 25));
                    jpm0.o(fetVar, function7, new ma2((byte) 26));
                    jpm0.o(fetVar, function12, new ma2((byte) 27));
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    function12 = function11;
                    fetVar.e0(1314774735);
                    function0I = I(function1, fetVar, i4 & 14);
                    if (v0Var instanceof m6t0) {
                        e3c.E();
                        throw null;
                    }
                    fetVar.Y(null, 125, 1, null);
                    fetVar.r = true;
                    if (fetVar.S) {
                        fetVar.l(function0I);
                    } else {
                        fetVar.r0();
                    }
                    T(fetVar, mm40VarC0, iHashCode, w6kVar, clzVar, i0h0Var, k6zVar, bh90VarM);
                    jpm0.o(fetVar, function7, new ma2((byte) 28));
                    jpm0.o(fetVar, function12, new ma2((byte) 29));
                    fetVar.r(true);
                    fetVar.r(false);
                }
                function9 = function12;
            } else {
                fetVar.X();
                function8 = function5;
                function9 = function6;
            }
            function10 = function7;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new a33(function1, mm40Var, function8, function9, function10, i2, i3);
            }
        }
        i4 |= 384;
        function5 = function2;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                function6 = function3;
                if (fetVar.i(function6)) {
                    i6 = 2048;
                } else {
                    i6 = 1024;
                }
                i4 |= i6;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    function7 = function4;
                    if (fetVar.i(function7)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i4 & 1, z)) {
                    if (i9 != 0) {
                        function8 = null;
                    } else {
                        function8 = function5;
                    }
                    sy2Var = b;
                    if (i5 != 0) {
                        function6 = sy2Var;
                    }
                    if (i7 != 0) {
                        function7 = sy2Var;
                    }
                    iHashCode = Long.hashCode(fetVar.T);
                    mm40VarC0 = kbc.c0(fetVar, mm40Var.e(npq.b).e(mqq.b).e(oqq.b).e(kqq.b));
                    w6kVar = (w6k) fetVar.k(bmd.h);
                    k6zVar = (k6z) fetVar.k(bmd.n);
                    function11 = function6;
                    bh90VarM = fetVar.m();
                    clzVar = (clz) fetVar.k(or00.f25714a);
                    i0h0Var = (i0h0) fetVar.k(xr00.f41346a);
                    if (function8 != null) {
                        fetVar.e0(1313917368);
                        function0I2 = I(function1, fetVar, i4 & 14);
                        if (v0Var instanceof m6t0) {
                            e3c.E();
                            throw null;
                        }
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(function0I2);
                        } else {
                            fetVar.r0();
                        }
                        function12 = function11;
                        T(fetVar, mm40VarC0, iHashCode, w6kVar, clzVar, i0h0Var, k6zVar, bh90VarM);
                        jpm0.o(fetVar, function8, new ma2((byte) 25));
                        jpm0.o(fetVar, function7, new ma2((byte) 26));
                        jpm0.o(fetVar, function12, new ma2((byte) 27));
                        fetVar.r(true);
                        fetVar.r(false);
                    } else {
                        function12 = function11;
                        fetVar.e0(1314774735);
                        function0I = I(function1, fetVar, i4 & 14);
                        if (v0Var instanceof m6t0) {
                            e3c.E();
                            throw null;
                        }
                        fetVar.Y(null, 125, 1, null);
                        fetVar.r = true;
                        if (fetVar.S) {
                            fetVar.l(function0I);
                        } else {
                            fetVar.r0();
                        }
                        T(fetVar, mm40VarC0, iHashCode, w6kVar, clzVar, i0h0Var, k6zVar, bh90VarM);
                        jpm0.o(fetVar, function7, new ma2((byte) 28));
                        jpm0.o(fetVar, function12, new ma2((byte) 29));
                        fetVar.r(true);
                        fetVar.r(false);
                    }
                    function9 = function12;
                } else {
                    fetVar.X();
                    function8 = function5;
                    function9 = function6;
                }
                function10 = function7;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new a33(function1, mm40Var, function8, function9, function10, i2, i3);
                }
            }
            i4 |= 24576;
            function7 = function4;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                if (i9 != 0) {
                    function8 = null;
                } else {
                    function8 = function5;
                }
                sy2Var = b;
                if (i5 != 0) {
                    function6 = sy2Var;
                }
                if (i7 != 0) {
                    function7 = sy2Var;
                }
                iHashCode = Long.hashCode(fetVar.T);
                mm40VarC0 = kbc.c0(fetVar, mm40Var.e(npq.b).e(mqq.b).e(oqq.b).e(kqq.b));
                w6kVar = (w6k) fetVar.k(bmd.h);
                k6zVar = (k6z) fetVar.k(bmd.n);
                function11 = function6;
                bh90VarM = fetVar.m();
                clzVar = (clz) fetVar.k(or00.f25714a);
                i0h0Var = (i0h0) fetVar.k(xr00.f41346a);
                if (function8 != null) {
                    fetVar.e0(1313917368);
                    function0I2 = I(function1, fetVar, i4 & 14);
                    if (v0Var instanceof m6t0) {
                        e3c.E();
                        throw null;
                    }
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(function0I2);
                    } else {
                        fetVar.r0();
                    }
                    function12 = function11;
                    T(fetVar, mm40VarC0, iHashCode, w6kVar, clzVar, i0h0Var, k6zVar, bh90VarM);
                    jpm0.o(fetVar, function8, new ma2((byte) 25));
                    jpm0.o(fetVar, function7, new ma2((byte) 26));
                    jpm0.o(fetVar, function12, new ma2((byte) 27));
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    function12 = function11;
                    fetVar.e0(1314774735);
                    function0I = I(function1, fetVar, i4 & 14);
                    if (v0Var instanceof m6t0) {
                        e3c.E();
                        throw null;
                    }
                    fetVar.Y(null, 125, 1, null);
                    fetVar.r = true;
                    if (fetVar.S) {
                        fetVar.l(function0I);
                    } else {
                        fetVar.r0();
                    }
                    T(fetVar, mm40VarC0, iHashCode, w6kVar, clzVar, i0h0Var, k6zVar, bh90VarM);
                    jpm0.o(fetVar, function7, new ma2((byte) 28));
                    jpm0.o(fetVar, function12, new ma2((byte) 29));
                    fetVar.r(true);
                    fetVar.r(false);
                }
                function9 = function12;
            } else {
                fetVar.X();
                function8 = function5;
                function9 = function6;
            }
            function10 = function7;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new a33(function1, mm40Var, function8, function9, function10, i2, i3);
            }
        }
        i4 |= 3072;
        function6 = function3;
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((i2 & 24576) == 0) {
                function7 = function4;
                if (fetVar.i(function7)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i4 & 1, z)) {
                if (i9 != 0) {
                    function8 = null;
                } else {
                    function8 = function5;
                }
                sy2Var = b;
                if (i5 != 0) {
                    function6 = sy2Var;
                }
                if (i7 != 0) {
                    function7 = sy2Var;
                }
                iHashCode = Long.hashCode(fetVar.T);
                mm40VarC0 = kbc.c0(fetVar, mm40Var.e(npq.b).e(mqq.b).e(oqq.b).e(kqq.b));
                w6kVar = (w6k) fetVar.k(bmd.h);
                k6zVar = (k6z) fetVar.k(bmd.n);
                function11 = function6;
                bh90VarM = fetVar.m();
                clzVar = (clz) fetVar.k(or00.f25714a);
                i0h0Var = (i0h0) fetVar.k(xr00.f41346a);
                if (function8 != null) {
                    fetVar.e0(1313917368);
                    function0I2 = I(function1, fetVar, i4 & 14);
                    if (v0Var instanceof m6t0) {
                        e3c.E();
                        throw null;
                    }
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(function0I2);
                    } else {
                        fetVar.r0();
                    }
                    function12 = function11;
                    T(fetVar, mm40VarC0, iHashCode, w6kVar, clzVar, i0h0Var, k6zVar, bh90VarM);
                    jpm0.o(fetVar, function8, new ma2((byte) 25));
                    jpm0.o(fetVar, function7, new ma2((byte) 26));
                    jpm0.o(fetVar, function12, new ma2((byte) 27));
                    fetVar.r(true);
                    fetVar.r(false);
                } else {
                    function12 = function11;
                    fetVar.e0(1314774735);
                    function0I = I(function1, fetVar, i4 & 14);
                    if (v0Var instanceof m6t0) {
                        e3c.E();
                        throw null;
                    }
                    fetVar.Y(null, 125, 1, null);
                    fetVar.r = true;
                    if (fetVar.S) {
                        fetVar.l(function0I);
                    } else {
                        fetVar.r0();
                    }
                    T(fetVar, mm40VarC0, iHashCode, w6kVar, clzVar, i0h0Var, k6zVar, bh90VarM);
                    jpm0.o(fetVar, function7, new ma2((byte) 28));
                    jpm0.o(fetVar, function12, new ma2((byte) 29));
                    fetVar.r(true);
                    fetVar.r(false);
                }
                function9 = function12;
            } else {
                fetVar.X();
                function8 = function5;
                function9 = function6;
            }
            function10 = function7;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new a33(function1, mm40Var, function8, function9, function10, i2, i3);
            }
        }
        i4 |= 24576;
        function7 = function4;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i4 & 1, z)) {
            if (i9 != 0) {
                function8 = null;
            } else {
                function8 = function5;
            }
            sy2Var = b;
            if (i5 != 0) {
                function6 = sy2Var;
            }
            if (i7 != 0) {
                function7 = sy2Var;
            }
            iHashCode = Long.hashCode(fetVar.T);
            mm40VarC0 = kbc.c0(fetVar, mm40Var.e(npq.b).e(mqq.b).e(oqq.b).e(kqq.b));
            w6kVar = (w6k) fetVar.k(bmd.h);
            k6zVar = (k6z) fetVar.k(bmd.n);
            function11 = function6;
            bh90VarM = fetVar.m();
            clzVar = (clz) fetVar.k(or00.f25714a);
            i0h0Var = (i0h0) fetVar.k(xr00.f41346a);
            if (function8 != null) {
                fetVar.e0(1313917368);
                function0I2 = I(function1, fetVar, i4 & 14);
                if (v0Var instanceof m6t0) {
                    e3c.E();
                    throw null;
                }
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function0I2);
                } else {
                    fetVar.r0();
                }
                function12 = function11;
                T(fetVar, mm40VarC0, iHashCode, w6kVar, clzVar, i0h0Var, k6zVar, bh90VarM);
                jpm0.o(fetVar, function8, new ma2((byte) 25));
                jpm0.o(fetVar, function7, new ma2((byte) 26));
                jpm0.o(fetVar, function12, new ma2((byte) 27));
                fetVar.r(true);
                fetVar.r(false);
            } else {
                function12 = function11;
                fetVar.e0(1314774735);
                function0I = I(function1, fetVar, i4 & 14);
                if (v0Var instanceof m6t0) {
                    e3c.E();
                    throw null;
                }
                fetVar.Y(null, 125, 1, null);
                fetVar.r = true;
                if (fetVar.S) {
                    fetVar.l(function0I);
                } else {
                    fetVar.r0();
                }
                T(fetVar, mm40VarC0, iHashCode, w6kVar, clzVar, i0h0Var, k6zVar, bh90VarM);
                jpm0.o(fetVar, function7, new ma2((byte) 28));
                jpm0.o(fetVar, function12, new ma2((byte) 29));
                fetVar.r(true);
                fetVar.r(false);
            }
            function9 = function12;
        } else {
            fetVar.X();
            function8 = function5;
            function9 = function6;
        }
        function10 = function7;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a33(function1, mm40Var, function8, function9, function10, i2, i3);
        }
    }

    public static final void d(int i2, fet fetVar, nzi0 nzi0Var, Function1 function1) {
        fetVar.g0(-642709101);
        int i3 = (fetVar.i(function1) ? 4 : 2) | i2 | (fetVar.g(nzi0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            a8k0.l(function1, nzi0Var, i120.Q(jm40.b, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n), fetVar, i3 & 126);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fb(function1, nzi0Var, i2);
        }
    }

    public static final void e(vmb0 vmb0Var, ugd ugdVar, bxq0 bxq0Var, ugd ugdVar2, fet fetVar, int i2) {
        vmb0 vmb0Var2;
        int i3;
        pz40 pz40Var;
        fetVar.g0(-1221877520);
        if ((i2 & 6) == 0) {
            vmb0Var2 = vmb0Var;
            i3 = (fetVar.g(vmb0Var2) ? 4 : 2) | i2;
        } else {
            vmb0Var2 = vmb0Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? fetVar.g(bxq0Var) : fetVar.i(bxq0Var) ? 256 : 128;
        }
        int i4 = i2 & 3072;
        jm40 jm40Var = jm40.b;
        if (i4 == 0) {
            i3 |= fetVar.g(jm40Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(null) ? 16384 : 8192;
        }
        boolean z = false;
        if ((i2 & 196608) == 0) {
            i3 |= fetVar.h(false) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.h(true) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= fetVar.h(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= fetVar.i(ugdVar2) ? 67108864 : 33554432;
        }
        int i5 = i3;
        if (fetVar.U(i5 & 1, (38347923 & i5) != 38347922)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iX = e3c.x(fetVar);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            shd shdVar = gqw0.y;
            if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX))) {
                rw2.t(iX, fetVar, iX, shdVar);
            }
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (bxq0Var.b()) {
                fetVar.e0(-1891243071);
                pz40Var = pz40Var2;
                D(vmb0Var2, bxq0Var, vneVar, false, pz40Var, ugdVar, fetVar, (i5 & 14) | 196608 | ((i5 >> 3) & 112) | ((i5 >> 6) & 896) | ((i5 << 15) & 3670016));
                fetVar.r(false);
            } else {
                pz40Var = pz40Var2;
                fetVar.e0(-1890863476);
                fetVar.r(false);
            }
            F(bxq0Var, pz40Var, ugdVar2, fetVar, ((i5 >> 18) & 14) | 384 | ((i5 >> 3) & 112) | ((i5 >> 12) & 7168) | (57344 & (i5 << 3)) | ((i5 >> 9) & 458752));
            fetVar.r(true);
            if ((i5 & 896) == 256 || ((i5 & 512) != 0 && fetVar.i(bxq0Var))) {
                z = true;
            }
            Object objP3 = fetVar.P();
            if (z || objP3 == obj) {
                objP3 = new os5(bxq0Var, (byte) 4);
                fetVar.o0(objP3);
            }
            m0x0.o(bxq0Var, (Function1) objP3, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0(vmb0Var, ugdVar, bxq0Var, ugdVar2, i2);
        }
    }

    public static final void f(mm40 mm40Var, z77 z77Var, Function1 function1, fet fetVar, int i2) {
        Object l57Var;
        xcz xczVar;
        int i3;
        Object m57Var;
        z77 z77Var2;
        Function1 function2;
        z77Var.getClass();
        function1.getClass();
        fetVar.g0(1554303028);
        int i4 = i2 | (fetVar.g(z77Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i4 & 1, (i4 & 147) != 146)) {
            w2d w2dVarW0 = uzb.w0(0, fetVar);
            wom womVarF = mom.f(fetVar);
            xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            Boolean boolValueOf = Boolean.valueOf(z77Var.e());
            int i5 = i4 & 112;
            int i6 = i4 & 896;
            boolean zI = (i5 == 32) | fetVar.i(w2dVarW0) | fetVar.g(xczVarA) | (i6 == 256);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                xczVar = xczVarA;
                i3 = i6;
                l57Var = new l57(z77Var, w2dVarW0, xczVar, function1, null, (byte) 0);
                fetVar.o0(l57Var);
            } else {
                i3 = i6;
                l57Var = objP2;
                xczVar = xczVarA;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) l57Var);
            Boolean boolValueOf2 = Boolean.valueOf(z77Var.g());
            boolean zI2 = (i5 == 32) | fetVar.i(w2dVarW0) | fetVar.i(vneVar) | fetVar.g(xczVar) | (i3 == 256);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == obj) {
                z77Var2 = z77Var;
                function2 = function1;
                xcz xczVar2 = xczVar;
                m57Var = new m57(z77Var2, w2dVarW0, vneVar, function2, xczVar2, null, (byte) 0);
                xczVar = xczVar2;
                fetVar.o0(m57Var);
            } else {
                function2 = function1;
                m57Var = objP3;
                z77Var2 = z77Var;
            }
            m0x0.t(fetVar, boolValueOf2, (Function2) m57Var);
            v2n0.b(knm0.r(mm40Var), w2dVarW0, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), 0.0f, u1c.M(-1052019233, new e57(w2dVarW0, z77Var2, function2, (byte) 0), fetVar), u1c.M(-1235736677, new i57(z77Var2, womVarF, w2dVarW0, function2, xczVar, (byte) 0), fetVar), fetVar, 224320, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j57(mm40Var, z77Var, function1, i2, (byte) 0);
        }
    }

    public static final void g(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i2) {
        mdmVar.getClass();
        function0.getClass();
        fetVar.g0(-652082995);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = mm40Var.e(o7k0.c);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            jcb.l(null, mdmVar, false, function0, fetVar, (i3 & 112) | ((i3 << 3) & 7168), 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gg8(mm40Var, mdmVar, function0, i2, (byte) 1);
        }
    }

    public static final void h(mm40 mm40Var, xdp0 xdp0Var, ow3 ow3Var, ugd ugdVar, fet fetVar, int i2, int i3) {
        xdp0Var.getClass();
        if ((i3 & 4) != 0) {
            zcl zclVar = qmk.f28987a;
            ow3Var = new qw3(4.0f, true, new jf4((byte) 14));
        }
        yx7 yx7Var = gqw0.k;
        if ((i3 & 16) != 0) {
            ugdVar = y9a.f42235a;
        }
        thg0 thg0VarA = shg0.a(ow3Var, yx7Var, fetVar, (((i2 & 14) | ((i2 >> 3) & 112)) >> 3) & 126);
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
        ugdVar.j(zhg0.f44392a, xdp0Var, fetVar, Integer.valueOf(6 | ((i2 >> 6) & 896)));
        fetVar.r(true);
    }

    public static final void i(int i2, fet fetVar, vhj0 vhj0Var, Function1 function1) {
        fetVar.g0(147979985);
        int i3 = (fetVar.i(function1) ? 4 : 2) | i2 | (fetVar.g(vhj0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            vvw.k(function1, vhj0Var, H(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vhj0Var.c, false), fetVar, i3 & 126);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hb(function1, vhj0Var, i2);
        }
    }

    public static final void j(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        int i3;
        fetVar.g0(1648637074);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarS = o050.S(o7k0.c);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 56.0f, 7);
            mdm mdmVar = (mdm) l7m0Var.getValue();
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new qu80(function1, (byte) 6);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarN, mdmVar, false, (Function0) objP, fetVar, 0, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cn(l7m0Var, function1, i2, b2);
        }
    }

    public static final void k(mm40 mm40Var, bz80 bz80Var, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        cl5 cl5Var;
        fetVar.g0(839536724);
        int i3 = i2 | 6 | (fetVar.g(bz80Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            Object objP = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (objP == cl5Var2) {
                cl5Var = cl5Var2;
                objP = new imm(new ilm(secondary), new plm(bz80Var.f3454a, secondary, fa50.f9191a), fmm.f9790a, backgroundContent, true, null);
                fetVar.o0(objP);
            } else {
                cl5Var = cl5Var2;
            }
            imm immVar = (imm) objP;
            boolean z = (i3 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new qu80(function1, (byte) 5);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            mm40Var2 = jm40Var;
            hlm.c(mm40VarD, immVar, null, function0, null, null, null, null, null, null, null, null, fetVar, 48, 0, 4084);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dr50(mm40Var2, bz80Var, function1, i2, (byte) 26);
        }
    }

    public static final void l(int i2, g4k g4kVar, fet fetVar, Function1 function1) {
        fetVar.g0(1912620346);
        int i3 = (fetVar.i(function1) ? 4 : 2) | i2 | (fetVar.g(g4kVar) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            h8x.m(function1, g4kVar, H(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), false, true), fetVar, i3 & 126);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kb(function1, g4kVar, i2);
        }
    }

    public static final void m(l7m0 l7m0Var, l7m0 l7m0Var2, xcz xczVar, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i2) {
        l7m0Var.getClass();
        l7m0Var2.getClass();
        xczVar.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(-462768322);
        int i3 = i2 | (fetVar.g(xczVar) ? 2048 : 1024) | (fetVar.g(qdzVar) ? 16384 : 8192) | (fetVar.i(function1) ? 131072 : 65536) | (fetVar.i(function2) ? 1048576 : 524288);
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            mm40 mm40VarE0 = o2e.e0(vtb.U(o7k0.c, ((Boolean) l7m0Var2.getValue()).booleanValue()), "DISCIPLINE_DETAILS_DEFAULT_LAZY_COLUMN");
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarG = knm0.g(s5x0.u(0.0f, 0.0f, 0.0f, 28.0f, 7), fetVar);
            boolean z = ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((3670016 & i3) == 1048576);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                tpk tpkVar = new tpk(l7m0Var, qdzVar, function1, function2, (byte) 0);
                fetVar.o0(tpkVar);
                objP = tpkVar;
            }
            b8k0.e(mm40VarE0, xczVar, ch80VarG, null, null, null, false, null, (Function1) objP, fetVar, (i3 >> 6) & 112, Response.SERVER_TIMEOUT);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new upk(l7m0Var, l7m0Var2, xczVar, qdzVar, function1, function2, i2, (byte) 0);
        }
    }

    public static final void n(mm40 mm40Var, mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        function1.getClass();
        fetVar.g0(-891239);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(mdmVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.i(function1) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40 mm40VarE = tfx.E(mm40Var.e(o7k0.c));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            boolean z = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ylm(function1, (byte) 17);
                fetVar.o0(objP);
            }
            jcb.l(null, mdmVar, false, (Function0) objP, fetVar, i3 & 112, 5);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wy0(mm40Var, mdmVar, function1, i2, (byte) 10);
        }
    }

    public static final void o(mdm mdmVar, Function0 function0, fet fetVar, int i2) {
        fetVar.g0(188306788);
        byte b2 = 2;
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
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
            jcb.l(jr8.f16991a.b(jm40.b, gqw0.e), mdmVar, false, function0, fetVar, ((i3 << 3) & 112) | ((i3 << 6) & 7168), 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eu60(mdmVar, function0, i2, b2);
        }
    }

    public static final void p(mdm mdmVar, Function1 function1, fet fetVar, int i2) {
        fetVar.g0(-826799255);
        int i3 = (fetVar.g(mdmVar) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC = o7k0.c(jm40Var, 1.0f);
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
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            byte b2 = 3;
            if (z || objP == ukd.f35823a) {
                objP = new zbt0(function1, b2);
                fetVar.o0(objP);
            }
            jcb.l(mm40VarB, mdmVar, false, (Function0) objP, fetVar, (i3 << 3) & 112, 4);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new okp0(mdmVar, function1, i2, (byte) 8);
        }
    }

    public static final void q(xcz xczVar, long j2, long j3, float f2, fet fetVar, int i2) {
        xczVar.getClass();
        fetVar.g0(-1085218823);
        int i3 = i2 | (fetVar.g(xczVar) ? 4 : 2) | (fetVar.f(j2) ? 32 : 16) | (fetVar.f(j3) ? 256 : 128) | (fetVar.d(f2) ? 2048 : 1024);
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z = fetVar.k(bmd.n) == k6z.b;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = jgk0.b(new a7s(xczVar, b2));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var = (l7m0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = xf0.c(1.0f);
                fetVar.o0(objP2);
            }
            t33 t33Var = (t33) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = xf0.c(1.0f);
                fetVar.o0(objP3);
            }
            t33 t33Var2 = (t33) objP3;
            Object value = l7m0Var.getValue();
            boolean zI = fetVar.i(t33Var) | fetVar.i(t33Var2);
            Object objP4 = fetVar.P();
            if (zI || objP4 == obj) {
                objP4 = new r1w(l7m0Var, t33Var, t33Var2, (yje) null);
                fetVar.o0(objP4);
            }
            m0x0.t(fetVar, value, (Function2) objP4);
            n0q n0qVar = o7k0.c;
            boolean zH = ((i3 & 7168) == 2048) | ((i3 & 112) == 32) | ((i3 & 896) == 256) | fetVar.h(z) | fetVar.i(t33Var) | fetVar.i(t33Var2);
            Object objP5 = fetVar.P();
            if (zH || objP5 == obj) {
                Object glwVar = new glw(f2, j2, j3, z, t33Var, t33Var2);
                fetVar.o0(glwVar);
                objP5 = glwVar;
            }
            zq8.a(0, fetVar, rq8.L(n0qVar, (Function1) objP5));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hlw(xczVar, j2, j3, f2, i2);
        }
    }

    public static final void r(mm40 mm40Var, bdz bdzVar, e2d e2dVar, a4x a4xVar, boolean z, boolean z2, Function1 function1, fet fetVar, int i2) {
        mm40 mm40Var2;
        xcz xczVarB;
        fetVar.g0(-287557984);
        int i3 = i2 | 6;
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(bdzVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(e2dVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= fetVar.g(a4xVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= fetVar.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        byte b2 = 1;
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            if (z) {
                fetVar.e0(1820169851);
                xczVarB = ddz.a(0, 0, fetVar, 0, 3);
                fetVar.r(false);
            } else {
                fetVar.e0(1820215979);
                xczVarB = bdzVar.b("KEY_LAZY_LIST_TEAM_BET_STATISTICS", fetVar);
                fetVar.r(false);
            }
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(xczVarB) | ((i3 & 896) == 256);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                objP = new qzo0(xczVarB, e2dVar, b2);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            boolean zG2 = ((57344 & i3) == 16384) | fetVar.g(l7m0VarY);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == obj) {
                objP2 = new bkw((byte) 3, l7m0VarY, z);
                fetVar.o0(objP2);
            }
            azl azlVarB = e2d.b(e2dVar, (Function0) objP2);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarV = cjx.V(jm40Var, azlVarB, null);
            wom womVarF = mom.f(fetVar);
            n0q n0qVar = o7k0.c;
            b2 = (3670016 & i3) != 1048576 ? (byte) 0 : (byte) 1;
            Object objP3 = fetVar.P();
            if (b2 != 0 || objP3 == obj) {
                objP3 = new gno0(function1, (byte) 27);
                fetVar.o0(objP3);
            }
            int i4 = ((i3 >> 12) & 112) | 100663296;
            mm40Var2 = jm40Var;
            mom.c(n0qVar, z2, womVarF, null, false, null, (Function0) objP3, null, u1c.M(-1503670091, new rzo0(mm40VarV, z, xczVarB, a4xVar, function1, (byte) 1), fetVar), fetVar, i4, 184);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ozo0(mm40Var2, bdzVar, e2dVar, a4xVar, z, z2, function1, i2, (byte) 1);
        }
    }

    public static final void s(int i2, fet fetVar) {
        fetVar.g0(-233024966);
        if (fetVar.U(i2 & 1, i2 != 0)) {
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, xbc.c0(o7k0.e(mm40VarD, 256.0f), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ksc0(i2, (byte) 22);
        }
    }

    public static final void t(int i2, fet fetVar, mv00 mv00Var, Function1 function1) {
        fetVar.g0(469651310);
        int i3 = (fetVar.i(function1) ? 4 : 2) | i2 | (fetVar.g(mv00Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            q8x.r(function1, mv00Var, H(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), false, mv00Var.f22436a), fetVar, i3 & 126);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mb(function1, mv00Var, i2);
        }
    }

    public static final void u(l7m0 l7m0Var, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        Function1 function2 = function1;
        l7m0Var.getClass();
        qdzVar.getClass();
        function2.getClass();
        fetVar.g0(-990036876);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jgk0.b(new x000(l7m0Var, (byte) 26));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var2 = (l7m0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = jgk0.b(new x000(l7m0Var, (byte) 27));
                fetVar.o0(objP2);
            }
            l7m0 l7m0Var3 = (l7m0) objP2;
            Context context = (Context) fetVar.k(dy2.b);
            context.getClass();
            boolean z = context.getResources().getBoolean(org.xbet.client1.R.bool.isTablet);
            xcz xczVarB = qdzVar.b(((py80) l7m0Var3.getValue()).getClass().getSimpleName(), new ht80((byte) 5), fetVar, (i3 << 3) & 896);
            mm40 mm40VarQ = i120.Q(yyw.X(o2e.e0(o7k0.c, "PARTNERS_TEAMS_COLUMN_TAG"), null, fetVar, 1), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
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
            k(null, (bz80) l7m0Var2.getValue(), function2, fetVar, i3 & 896);
            py80 py80Var = (py80) l7m0Var3.getValue();
            if (Intrinsics.d(py80Var, ny80.f24318a)) {
                fetVar.e0(1846899725);
                Object objP3 = fetVar.P();
                if (objP3 == cl5Var) {
                    objP3 = jgk0.b(new x000(l7m0Var, (byte) 28));
                    fetVar.o0(objP3);
                }
                int i4 = i3 << 6;
                x((l7m0) objP3, xczVarB, z, qdzVar, function2, fetVar, (i4 & 57344) | (i4 & 7168) | 6);
                function2 = function2;
                fetVar.r(false);
            } else {
                if (!(py80Var instanceof oy80)) {
                    throw b1j.f(-1464445526, fetVar, false);
                }
                fetVar.e0(1847340855);
                Object objP4 = fetVar.P();
                if (objP4 == cl5Var) {
                    objP4 = jgk0.b(new pl70((oy80) py80Var, (byte) 12));
                    fetVar.o0(objP4);
                }
                j((l7m0) objP4, function2, fetVar, ((i3 >> 3) & 112) | 6);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn(l7m0Var, qdzVar, function2, i2, (byte) 5);
        }
    }

    public static final void v(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        Function1 function2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(977590362);
        int i3 = i2 | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            String strW = rsm0.w(org.xbet.client1.R.string.rating_selectors_title, 0, fetVar);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            boolean zG = fetVar.g(((r4e0) l7m0Var.getValue()).a());
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                pz40 pz40Var = s6t0.f31722a;
                imm immVar = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(strW, s6t0.b().f33626a.getSecondary(), fa50.f9191a), ((r4e0) l7m0Var.getValue()).a(), backgroundContent, true, null);
                fetVar.o0(immVar);
                objP = immVar;
            }
            imm immVar2 = (imm) objP;
            pz40 pz40Var2 = s6t0.f31722a;
            mm40 mm40VarR = knm0.r(yyw.X(i120.Q(jm40.b, s6t0.b().f33626a.getBackground(), jd8.n), null, fetVar, 1));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new evd0(function1, (byte) 7);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z2 = i4 == 32;
            Object objP3 = fetVar.P();
            byte b2 = 9;
            if (z2 || objP3 == cl5Var) {
                objP3 = new dvd0(function1, b2);
                fetVar.o0(objP3);
            }
            hlm.c(null, immVar2, null, function0, null, (Function1) objP3, null, null, null, null, null, null, fetVar, 0, 0, 4053);
            r4e0 r4e0Var = (r4e0) l7m0Var.getValue();
            if (r4e0Var != null) {
                if (r4e0Var instanceof p4e0) {
                    fetVar.e0(1758932638);
                    s(0, fetVar);
                    fetVar.r(false);
                    function2 = function1;
                } else if (r4e0Var instanceof o4e0) {
                    fetVar.e0(1758934661);
                    mdm mdmVar = ((o4e0) r4e0Var).f24630a;
                    boolean z3 = i4 == 32;
                    Object objP4 = fetVar.P();
                    if (z3 || objP4 == cl5Var) {
                        function2 = function1;
                        objP4 = new evd0(function2, (byte) 8);
                        fetVar.o0(objP4);
                    } else {
                        function2 = function1;
                    }
                    o(mdmVar, (Function0) objP4, fetVar, 0);
                    fetVar.r(false);
                } else {
                    function2 = function1;
                    if (r4e0Var instanceof q4e0) {
                        fetVar.e0(-1307381526);
                        a4x a4xVar = ((q4e0) r4e0Var).f28093a;
                        boolean z4 = i4 == 32;
                        Object objP5 = fetVar.P();
                        if (z4 || objP5 == cl5Var) {
                            objP5 = new dvd0(function2, (byte) 10);
                            fetVar.o0(objP5);
                        }
                        Function1 function3 = (Function1) objP5;
                        boolean z5 = i4 == 32;
                        Object objP6 = fetVar.P();
                        if (z5 || objP6 == cl5Var) {
                            objP6 = new evd0(function2, (byte) 9);
                            fetVar.o0(objP6);
                        }
                        w(0, fetVar, a4xVar, (Function0) objP6, function3);
                        fetVar.r(false);
                    }
                }
                fetVar.r(true);
            }
            throw b1j.f(1758930739, fetVar, false);
        }
        function2 = function1;
        fetVar.X();
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zs70(l7m0Var, function2, i2, (byte) 29);
        }
    }

    public static final void w(int i2, fet fetVar, a4x a4xVar, Function0 function0, Function1 function1) {
        fet fetVar2 = fetVar;
        Function0 function2 = function0;
        fetVar2.g0(571911303);
        int i3 = i2 | (fetVar.g(a4xVar) ? 4 : 2) | (fetVar2.i(function1) ? 32 : 16) | (fetVar2.i(function2) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            n0q n0qVar = o7k0.c;
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, n0qVar);
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
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new or0(a4xVar, function1, (byte) 25);
                fetVar2.o0(objP);
            }
            b8k0.e(null, null, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 511);
            fetVar2 = fetVar;
            mm40 mm40VarD = o7k0.d(jr8.f16991a.b(jm40.b, gqw0.h), 1.0f);
            zcl zclVar = qmk.f28987a;
            qzb.n(s5x0.K(mm40VarD, 16.0f, 36.0f), new wul(lul.e, oe9.b, new ue9(rsm0.w(org.xbet.client1.R.string.apply, 0, fetVar2)), true, false, false), function0, fetVar2, i3 & 896, 0);
            function2 = function0;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pbg(a4xVar, function1, function2, i2);
        }
    }

    public static final void x(l7m0 l7m0Var, xcz xczVar, boolean z, qdz qdzVar, Function1 function1, fet fetVar, int i2) {
        int i3;
        Object obj;
        fetVar.g0(-656800066);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(xczVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            obj = qdzVar;
            i3 |= fetVar.g(obj) ? 2048 : 1024;
        } else {
            obj = qdzVar;
        }
        if ((i2 & 24576) == 0) {
            i3 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            mm40 mm40Var = o7k0.c;
            mm40 mm40VarE0 = o2e.e0(mm40Var.e(mm40Var), "LAZY_COLUMN_PARTNER_LIST");
            zcl zclVar = qmk.f28987a;
            ch80 ch80VarF = h97.f(xfn.a(fetVar).c, 8.0f, xfn.a(fetVar).c, 28.0f, fetVar);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                t13 t13Var = new t13((Object) l7m0Var, z, obj, (Object) function1, (byte) 16);
                fetVar.o0(t13Var);
                objP = t13Var;
            }
            b8k0.e(mm40VarE0, xczVar, ch80VarF, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i3 & 112) | 6, Response.NOT_ACCEPTABLE_HERE);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((Object) l7m0Var, (Object) xczVar, z, (Object) qdzVar, (Object) function1, i2, (byte) 28);
        }
    }

    public static final void y(l7m0 l7m0Var, Function1 function1, fet fetVar, int i2) {
        fet fetVar2;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1479327571);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i2 | (fetVar.i(function1) ? 32 : 16);
        byte b2 = 10;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarQ = i120.Q(jm40.b, ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), jd8.n);
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
            zsv zsvVar = ((rfj0) l7m0Var.getValue()).b;
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new w7i0(function1, (byte) 8);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i4 == 32;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new w7i0(function1, b2);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z3 = i4 == 32;
            Object objP3 = fetVar.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new w7i0(function1, (byte) 11);
                fetVar.o0(objP3);
            }
            fetVar2 = fetVar;
            zvw.j(zsvVar, function0, function2, (Function0) objP3, fetVar2, 0);
            a4x a4xVar = ((rfj0) l7m0Var.getValue()).d;
            n0q n0qVar = o7k0.c;
            z(((i3 >> 3) & 14) | 384, fetVar2, a4xVar, o2e.e0(n0qVar, "SettingsListContent"), function1);
            bsr0.H(48, fetVar2, n0qVar, ((rfj0) l7m0Var.getValue()).f30391a);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i2, b2);
        }
    }

    public static final void z(int i2, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        int i3;
        fetVar.g0(1771026631);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.i(function1) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            obc.d(xf80.f40779a.a(null), u1c.M(-948950009, new de9(mm40Var, a4xVar, function1), fetVar), fetVar, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u22(function1, a4xVar, mm40Var, i2);
        }
    }
}
