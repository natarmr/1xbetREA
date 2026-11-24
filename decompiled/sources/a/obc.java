package a;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.game.GameStatistic;
import org.xplatform.betting.core.zip.model.zip.game.StatInfo;
import org.xplatform.consultantchat.presentation.workers.DownloadWorker;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class obc {
    public static final void A(mm40 mm40Var, fpw fpwVar, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        mm40Var.getClass();
        fpwVar.getClass();
        function1.getClass();
        fetVar.g0(-1254573535);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(fpwVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            l7m0 l7m0VarB = d43.b(fpwVar.c ? 180.0f : 0.0f, null, "Rotate animation", null, fetVar, 3072, 22);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            lca lcaVarO = jar0.O(fetVar);
            lca lcaVarA = lcaVarO.a(((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), lcaVarO.b, lcaVarO.c, lcaVarO.d);
            zcl zclVar = qmk.f28987a;
            hew0.e(mm40VarD, vgg0.a(8.0f), lcaVarA, jar0.Q(62), u1c.M(1602399471, new x2g((Object) function1, (Object) fpwVar, (Object) l7m0VarB, (Object) ugdVar, (byte) 21), fetVar), fetVar, 196608, 16);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cbr((Object) mm40Var, (Object) fpwVar, function1, (wdr) ugdVar, i, (byte) 8);
        }
    }

    public static final void B(mm40 mm40Var, zyp zypVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-701503183);
        byte b = 2;
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(zypVar) ? 32 : 16);
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
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new xwm(zypVar, b);
                fetVar2.o0(objP);
            }
            kkb.p(0, fetVar2, mm40VarN, (Function0) objP);
            String str = zypVar.f45216a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarD = g1t0.d();
            long j = qmk.p;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            kc5.N(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, null, 0L, j, g1t0.d().f42262a.b, null, null, 0L, null, 2, false, 2, 0, false, null, y9q0VarD, 0.0f, fetVar, 0, 1597440, 0, 3063610);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywm(mm40Var, zypVar, i, (byte) 3);
        }
    }

    public static final void C(mm40 mm40Var, l2n l2nVar, fet fetVar, int i) {
        l2n l2nVar2;
        byte b;
        mm40 mm40Var2;
        yx7 yx7Var;
        fet fetVar2 = fetVar;
        yx7 yx7Var2 = gqw0.l;
        fetVar2.g0(653891234);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(l2nVar) ? 32 : 16;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 40.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            qw3 qw3Var = new qw3(2.0f, true, new jf4((byte) 14));
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarE2 = mm40VarD2.e(new x7z(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
            x5d x5dVarA = w5d.a(qw3Var, gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE2);
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
            String str = l2nVar.f19318a;
            zfn zfnVar = zaq0.b;
            mm40Var2 = jm40Var;
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar, 0, 24960, 110586);
            fetVar2 = fetVar;
            mm40 mm40VarU = o7k0.u(s5x0.L(i120.S(o7k0.e(mm40Var2, 20.0f), 1.0f, ((ThemeColors) fetVar2.k(zfnVar)).getSeparator(), vgg0.a(6.0f)), 4.0f, 0.0f, 2), 80.0f, 0.0f, 2);
            b = 0;
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarU);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            l2nVar2 = l2nVar;
            d(bmd.n.a(k6z.f17794a), u1c.M(-2017555902, new mxm(l2nVar2, (byte) 13), fetVar2), fetVar2, 56);
            fetVar2.r(true);
            fetVar2.r(true);
            if (l2nVar2.c.isEmpty()) {
                yx7Var = yx7Var2;
                fetVar2.e0(-832704388);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-832873834);
                yx7Var = yx7Var2;
                E(new ecu0(yx7Var), l2nVar2, fetVar2, i3 & 112);
                fetVar2.r(false);
            }
            if (l2nVar2.e.length() > 0) {
                fetVar2.e0(-832627911);
                H(new ecu0(yx7Var), l2nVar2, fetVar2, i3 & 112);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-832461348);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            l2nVar2 = l2nVar;
            b = 0;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2n(mm40Var2, l2nVar2, i, b);
        }
    }

    public static final void D(mm40 mm40Var, j2n j2nVar, fet fetVar, int i) {
        mm40 mm40Var2;
        String str;
        String str2;
        j2n j2nVar2 = j2nVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(525792776);
        int i2 = i | 6 | (fetVar2.g(j2nVar2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            xx7 xx7Var = gqw0.n;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            String str3 = "";
            if (j2nVar2 == null || (str = j2nVar2.f15788a) == null) {
                str = "";
            }
            zfn zfnVar = zaq0.b;
            v8q0.a(str, o7k0.u(jm40Var, 0.0f, 20.0f, 1), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary80(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 110584);
            mm40 mm40VarS = i120.S(o7k0.n(jm40Var, 20.0f), 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator(), vgg0.a(6.0f));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
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
            j2nVar2 = j2nVar;
            if (j2nVar != null && (str2 = j2nVar2.b) != null) {
                str3 = str2;
            }
            v8q0.a(str3, null, ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b2n(mm40Var2, j2nVar2, i, (byte) 2);
        }
    }

    public static final void E(mm40 mm40Var, l2n l2nVar, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2;
        fetVar.g0(784268572);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l2nVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = mm40Var;
            mm40 mm40VarN = s5x0.N(mm40Var2, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            a4x a4xVar = l2nVar.c;
            D(null, (j2n) CollectionsKt.W(0, a4xVar), fetVar, 0);
            D(null, (j2n) CollectionsKt.W(1, a4xVar), fetVar, 0);
            D(null, (j2n) CollectionsKt.W(2, a4xVar), fetVar, 0);
            fetVar.r(true);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2n(mm40Var2, l2nVar, i, b);
        }
    }

    public static final void F(final mm40 mm40Var, final gav gavVar, l7m0 l7m0Var, final String str, final int i, final lh80 lh80Var, final k6z k6zVar, fet fetVar, final int i2) {
        l7m0 l7m0Var2;
        Object objValueOf;
        String strValueOf;
        fet fetVar2 = fetVar;
        fetVar2.g0(-268469060);
        int i3 = (fetVar2.g(mm40Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? fetVar2.g(gavVar) : fetVar2.i(gavVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            l7m0Var2 = l7m0Var;
            i3 |= fetVar2.g(l7m0Var2) ? 256 : 128;
        } else {
            l7m0Var2 = l7m0Var;
        }
        int i4 = i3 | (fetVar2.e(i) ? 16384 : 8192) | (fetVar2.g(lh80Var) ? 131072 : 65536) | (fetVar2.e(k6zVar.ordinal()) ? 1048576 : 524288);
        if (fetVar2.U(i4 & 1, (599187 & i4) != 599186)) {
            boolean z = (3670016 & i4) == 1048576;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objValueOf = Float.valueOf(k6zVar == k6z.b ? -1.0f : 1.0f);
                fetVar2.o0(objValueOf);
            } else {
                objValueOf = objP;
            }
            float fFloatValue = ((Number) objValueOf).floatValue();
            zx7 zx7Var = gqw0.e;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            jm40 jm40Var = jm40.b;
            k7x.a(gavVar.f10988a, null, i4w0.U(jm40Var, fFloatValue, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0L, 0L, 0, null, 1048574), gqw0.B, null, fetVar2, 1572912, 1976);
            mm40 mm40VarB = jr8.f16991a.b(o2e.e0(s5x0.I(jm40Var, lh80Var), str), zx7Var);
            Integer num = (Integer) l7m0Var2.getValue();
            if (num == null || (strValueOf = String.valueOf(num.intValue() + 1)) == null) {
                strValueOf = gavVar.b;
            }
            v8q0.a(strValueOf, mm40VarB, y3d.c, null, 0L, null, null, null, 0L, new f2q0(i), 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.z, psq.g, j1t0.d, 0L, null, 0, 0, qmk.K, 16646105), fetVar, 384, (i4 >> 12) & 14, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final l7m0 l7m0Var3 = l7m0Var2;
            yfe0VarU.d = new Function2() { // from class: a.kav
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    obc.F(mm40Var, gavVar, l7m0Var3, str, i, lh80Var, k6zVar, (fet) obj, x8x.L(i2 | 1));
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void G(gav gavVar, gav gavVar2, l7m0 l7m0Var, l7m0 l7m0Var2, v9v v9vVar, float f, k6z k6zVar, Function0 function0, fet fetVar, int i) {
        l7m0Var.getClass();
        l7m0Var2.getClass();
        k6zVar.getClass();
        function0.getClass();
        fetVar.g0(-1492049927);
        int i2 = i | (fetVar.g(gavVar) ? 4 : 2) | (fetVar.g(gavVar2) ? 32 : 16) | (fetVar.g(v9vVar) ? 16384 : 8192) | (fetVar.d(f) ? 131072 : 65536) | (fetVar.e(k6zVar.ordinal()) ? 1048576 : 524288);
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.N(jm40Var, f, 8.0f, f, 0.0f, 8), 1.0f);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            zhg0 zhg0Var = zhg0.f44392a;
            int i3 = i2 & 3670016;
            F(o2e.e0(o7k0.d(zhg0Var.a(1.0f, jm40Var, true), 1.0f), "GOLD_RUSH_FIRST_PLAYER_BOARD"), gavVar, l7m0Var, "GOLD_RUSH_FIRST_PLAYER_SCORE_TEXT", 6, s5x0.u(40.0f, 0.0f, 0.0f, 0.0f, 14), k6zVar, fetVar, ((i2 << 3) & 112) | 3456 | i3);
            sac.w(function0, o2e.e0(zhg0Var.a(1.2f, s5x0.L(jm40Var, 20.0f, 0.0f, 2), true), "GOLD_RUSH_CUBE_BOX"), v9vVar, fetVar, ((i2 >> 6) & 896) | 6);
            F(o2e.e0(o7k0.d(zhg0Var.a(1.0f, jm40Var, true), 1.0f), "GOLD_RUSH_SECOND_PLAYER_BOARD"), gavVar2, l7m0Var2, "GOLD_RUSH_SECOND_PLAYER_SCORE_TEXT", 5, s5x0.u(0.0f, 0.0f, 40.0f, 0.0f, 11), k6zVar, fetVar, (i2 & 112) | 3456 | i3);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z9v(gavVar, gavVar2, l7m0Var, l7m0Var2, v9vVar, f, k6zVar, function0, i);
        }
    }

    public static final void H(mm40 mm40Var, l2n l2nVar, fet fetVar, int i) {
        int i2;
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(327415436);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(l2nVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            long jD = l2nVar.f ? cs0.D(fetVar2, 162721481, fetVar2, false) : rz4.c(fetVar2, 162772073, fetVar2, false);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(s5x0.N(mm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 28.0f);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
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
            v8q0.a(l2nVar.d, null, afn0.m(fetVar).getSecondary80(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, 0, 24960, 110586);
            mm40 mm40VarQ = i120.Q(o7k0.e(o7k0.d(jm40.b, 1.0f), 20.0f), afn0.m(fetVar).getBackgroundLight60(), vgg0.a(6.0f));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            v8q0.a(l2nVar.e, null, jD, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.a(), fetVar, 0, 0, 130042);
            fetVar2 = fetVar;
            b = 1;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2n(mm40Var, l2nVar, i, b);
        }
    }

    public static void I(cpv0 cpv0Var, String str, String str2, String str3, long j) {
        str.getClass();
        str3.getClass();
        sl50 sl50Var = sl50.f32381a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        o4e o4eVar = new o4e(new hl50(null), sl50.b, false, false, false, false, -1L, -1L, CollectionsKt.P0(linkedHashSet));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("BUNDLE_MEDIA_ID", str);
        linkedHashMap.put("BUNDLE_IMAGE_DIMENSION", str2);
        linkedHashMap.put("BUNDLE_IMAGE_FILENAME", str3);
        linkedHashMap.put("BUNDLE_EXPECTED_FILE_SIZE", Long.valueOf(j));
        maj majVar = new maj(linkedHashMap);
        nkb.I(majVar);
        zko zkoVar = zko.b;
        xl60 xl60Var = (xl60) new xl60(DownloadWorker.class).g(str);
        ((ppv0) xl60Var.c).j = o4eVar;
        ((ppv0) xl60Var.c).e = majVar;
        cpv0Var.c(str, zkoVar, (yl60) xl60Var.k());
    }

    public static final bet J(bet betVar) {
        if (betVar == null) {
            betVar = null;
        }
        if (betVar != null) {
            return betVar;
        }
        ykd.b("Inconsistent composition");
        csj.b();
        return null;
    }

    public static final void K(cp cpVar) {
        Object objU = cpVar.u();
        yfu0 yfu0Var = cpVar.u;
        String str = ((ra8) objU).h;
        if (str.length() > 0) {
            ((rcu0) yfu0Var).b.setBlockErrorText(str);
        }
        ((rcu0) yfu0Var).b.setBlockErrorVisibility(str.length() > 0);
    }

    public static final void L(cp cpVar, ase aseVar, zre zreVar) {
        while (true) {
            yfu0 yfu0Var = cpVar.u;
            if (((rcu0) yfu0Var).b.getItemDecorationsCount() <= 0) {
                rcu0 rcu0Var = (rcu0) yfu0Var;
                ((RecyclerView) rcu0Var.b.q.g).m(new qse(false, true, cpVar.w));
                aseVar.A(((ra8) cpVar.u()).i);
                rcu0Var.b.setEventItemsVisibility(!((ra8) cpVar.u()).i.isEmpty());
                rcu0Var.b.post(zreVar);
                return;
            }
            tbc tbcVar = ((rcu0) yfu0Var).b.q;
            if (((RecyclerView) tbcVar.g).getItemDecorationCount() > 0) {
                ((RecyclerView) tbcVar.g).t0();
            }
        }
    }

    public static String M(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static void N(String str, boolean z) throws kq80 {
        if (!z) {
            throw kq80.a(str, null);
        }
    }

    public static final long O(int i, fet fetVar) {
        Context context = (Context) fetVar.k(dy2.b);
        Resources resources = (Resources) fetVar.k(dy2.c);
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = itf0.f15351a;
        return fbc.d(resources.getColor(i, theme));
    }

    /* JADX WARN: Code duplicated, block: B:105:0x013b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:145:0x01a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:149:0x01b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:239:0x0294 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:257:0x02bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:261:0x02c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0078 A[RETURN] */
    public static final int P(boolean z, String str, long j, long j2) {
        if (j == 257) {
            switch (str.hashCode()) {
                case -1217677022:
                    return !str.equals("Prematch") ? R.string.empty_str : R.string.bet_before_game_start;
                case -1028033110:
                    return !str.equals("DealerMove") ? R.string.empty_str : R.string.issuing_third_card;
                case -205861262:
                    return !str.equals("PlayerMove") ? R.string.empty_str : R.string.issuing_second_card;
                case 48:
                    return !str.equals("0") ? R.string.empty_str : R.string.bet_before_game_start;
                case 49:
                    return !str.equals("1") ? R.string.empty_str : R.string.issuing_second_card;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    return !str.equals("2") ? R.string.empty_str : R.string.issuing_third_card;
                case 52:
                    if (str.equals("4")) {
                        return R.string.first_player_wins;
                    }
                    return R.string.empty_str;
                case 53:
                    if (str.equals("5")) {
                        return R.string.second_player_wins;
                    }
                    return R.string.empty_str;
                case 54:
                    return !str.equals("6") ? R.string.empty_str : R.string.draw;
                case 2138468:
                    if (str.equals("Draw")) {
                        return R.string.second_player_wins;
                    }
                    return R.string.empty_str;
                case 2696182:
                    if (str.equals("Win2")) {
                        return R.string.first_player_wins;
                    }
                    return R.string.empty_str;
                case 1998453714:
                    return !str.equals("RoundDraw") ? R.string.empty_str : R.string.draw;
                case 1999011427:
                    return !str.equals("RoundWin1") ? R.string.empty_str : R.string.player_round_win;
                case 1999011428:
                    return !str.equals("RoundWin2") ? R.string.empty_str : R.string.dealer_round_win;
                default:
                    return R.string.empty_str;
            }
        }
        if (j == 236) {
            switch (str.hashCode()) {
                case -1217677022:
                    return !str.equals("Prematch") ? R.string.empty_str : R.string.bet_before_game_start;
                case -1028033110:
                    return !str.equals("DealerMove") ? R.string.empty_str : R.string.banker_turn;
                case -205861262:
                    if (str.equals("PlayerMove")) {
                        return R.string.player_turn;
                    }
                    return R.string.empty_str;
                case 48:
                    return !str.equals("0") ? R.string.empty_str : R.string.bet_before_game_start;
                case 49:
                    if (str.equals("1")) {
                        return R.string.player_turn;
                    }
                    return R.string.empty_str;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    return !str.equals("2") ? R.string.empty_str : R.string.banker_turn;
                case 51:
                    return !str.equals("3") ? R.string.empty_str : R.string.player_win;
                case 52:
                    return !str.equals("4") ? R.string.empty_str : R.string.banker_win;
                case 53:
                    return !str.equals("5") ? R.string.empty_str : R.string.draw_game;
                case 2138468:
                    return !str.equals("Draw") ? R.string.empty_str : R.string.draw_game;
                case 2696181:
                    return !str.equals("Win1") ? R.string.empty_str : R.string.player_win;
                case 2696182:
                    return !str.equals("Win2") ? R.string.empty_str : R.string.banker_win;
                case 1998453714:
                    return !str.equals("RoundDraw") ? R.string.empty_str : R.string.draw_round;
                case 1999011427:
                    return !str.equals("RoundWin1") ? R.string.empty_str : R.string.player_round_win;
                case 1999011428:
                    return !str.equals("RoundWin2") ? R.string.empty_str : R.string.banker_round_win;
                default:
                    return R.string.empty_str;
            }
        }
        if (j == 167 && j2 == 2566618) {
            switch (str.hashCode()) {
                case -1217677022:
                    return !str.equals("Prematch") ? R.string.empty_str : R.string.first_round;
                case -1028033110:
                    return !str.equals("DealerMove") ? R.string.empty_str : R.string.third_round;
                case -205861262:
                    return !str.equals("PlayerMove") ? R.string.empty_str : R.string.second_round;
                case 48:
                    return !str.equals("0") ? R.string.empty_str : R.string.first_round;
                case 49:
                    return !str.equals("1") ? R.string.empty_str : R.string.second_round;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    return !str.equals("2") ? R.string.empty_str : R.string.third_round;
                case 51:
                    return !str.equals("3") ? R.string.empty_str : R.string.player_win;
                case 52:
                    if (str.equals("4")) {
                        return R.string.first_player_wins;
                    }
                    return R.string.empty_str;
                case 53:
                    if (str.equals("5")) {
                        return R.string.second_player_wins;
                    }
                    return R.string.empty_str;
                case 54:
                    return !str.equals("6") ? R.string.empty_str : R.string.draw_game;
                case 2138468:
                    if (str.equals("Draw")) {
                        return R.string.second_player_wins;
                    }
                    return R.string.empty_str;
                case 2696181:
                    return !str.equals("Win1") ? R.string.empty_str : R.string.player_win;
                case 2696182:
                    if (str.equals("Win2")) {
                        return R.string.first_player_wins;
                    }
                    return R.string.empty_str;
                case 1998453714:
                    return !str.equals("RoundDraw") ? R.string.empty_str : R.string.draw_round;
                case 1999011427:
                    return !str.equals("RoundWin1") ? R.string.empty_str : R.string.player_round_win;
                case 1999011428:
                    return !str.equals("RoundWin2") ? R.string.empty_str : R.string.dealer_round_win;
                default:
                    return R.string.empty_str;
            }
        }
        if (j == 284 && z) {
            switch (str.hashCode()) {
                case 48:
                    return !str.equals("0") ? R.string.empty_str : R.string.bet_before_game_start;
                case 49:
                    return !str.equals("1") ? R.string.empty_str : R.string.player_turn;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    return !str.equals("2") ? R.string.empty_str : R.string.dealer_turn;
                case 51:
                    return !str.equals("3") ? R.string.empty_str : R.string.player_win;
                case 52:
                    return !str.equals("4") ? R.string.empty_str : R.string.draw_game;
                case 53:
                    return !str.equals("5") ? R.string.empty_str : R.string.dealer_win;
                default:
                    return R.string.empty_str;
            }
        }
        switch (str.hashCode()) {
            case -1217677022:
                return !str.equals("Prematch") ? R.string.empty_str : R.string.bet_before_game_start;
            case -1028033110:
                if (str.equals("DealerMove")) {
                    return R.string.dealer_turn;
                }
                return R.string.empty_str;
            case -205861262:
                if (str.equals("PlayerMove")) {
                    return R.string.player_turn;
                }
                return R.string.empty_str;
            case 48:
                return !str.equals("0") ? R.string.empty_str : R.string.bet_before_game_start;
            case 49:
                if (str.equals("1")) {
                    return R.string.player_turn;
                }
                return R.string.empty_str;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                if (str.equals("2")) {
                    return R.string.dealer_turn;
                }
                return R.string.empty_str;
            case 51:
                return !str.equals("3") ? R.string.empty_str : R.string.player_win;
            case 52:
                if (str.equals("4")) {
                    return R.string.dealer_win;
                }
                return R.string.empty_str;
            case 53:
                return !str.equals("5") ? R.string.empty_str : R.string.draw_game;
            case 2138468:
                return !str.equals("Draw") ? R.string.empty_str : R.string.draw_game;
            case 2696181:
                return !str.equals("Win1") ? R.string.empty_str : R.string.player_win;
            case 2696182:
                if (str.equals("Win2")) {
                    return R.string.dealer_win;
                }
                return R.string.empty_str;
            case 1998453714:
                return !str.equals("RoundDraw") ? R.string.empty_str : R.string.draw_round;
            case 1999011427:
                return !str.equals("RoundWin1") ? R.string.empty_str : R.string.player_round_win;
            case 1999011428:
                return !str.equals("RoundWin2") ? R.string.empty_str : R.string.dealer_round_win;
            default:
                return R.string.empty_str;
        }
    }

    public static int Q(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return JosStatusCodes.RTN_CODE_COMMON_ERROR;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static byte[] R(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            String upperCase = str.toUpperCase(Locale.ENGLISH);
            int length = upperCase.length() / 2;
            byte[] bArr = new byte[length];
            try {
                byte[] bytes = upperCase.getBytes("UTF-8");
                for (int i = 0; i < length; i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("0x");
                    int i2 = i * 2;
                    sb.append(new String(new byte[]{bytes[i2]}, "UTF-8"));
                    bArr[i] = (byte) (((byte) (Byte.decode(sb.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i2 + 1]}, "UTF-8")).byteValue());
                }
                return bArr;
            } catch (UnsupportedEncodingException | NumberFormatException e) {
                afn0.j("HexUtil", "hex string 2 byte array exception : " + e.getMessage());
                return new byte[0];
            }
        } catch (Throwable th) {
            afn0.j("HexUtil", "hex string toUpperCase exception : " + th.getMessage());
            return new byte[0];
        }
    }

    public static final swq S(swq swqVar, swq swqVar2) {
        swqVar.getClass();
        swqVar2.getClass();
        twq twqVar = swqVar.f32934a;
        twq twqVar2 = swqVar2.f32934a;
        if (!swqVar.equals(swqVar2) && !twqVar2.c()) {
            String str = twqVar.f34663a;
            String str2 = twqVar2.f34663a;
            if (!kotlin.text.c.x(str, str2, false) || str.charAt(str2.length()) != '.') {
                return swqVar;
            }
        }
        if (twqVar2.c()) {
            return swqVar;
        }
        return swqVar.equals(swqVar2) ? swq.c : new swq(twqVar.f34663a.substring(twqVar2.f34663a.length() + 1));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0024  */
    /* JADX WARN: Code duplicated, block: B:9:0x0012  */
    public static final zrk T(kuk kukVar) {
        List list;
        List list2;
        j0g0 j0g0Var = kukVar.f18914a;
        if (j0g0Var != null) {
            Object obj = j0g0Var.f15681a;
            if (obj instanceof g0g0) {
                obj = null;
            }
            list = (List) obj;
            if (list == null) {
                list = iun.f15405a;
            }
        } else {
            list = iun.f15405a;
        }
        j0g0 j0g0Var2 = kukVar.b;
        if (j0g0Var2 != null) {
            Object obj2 = j0g0Var2.f15681a;
            list2 = (List) (obj2 instanceof g0g0 ? null : obj2);
            if (list2 == null) {
                list2 = iun.f15405a;
            }
        } else {
            list2 = iun.f15405a;
        }
        return new zrk(list, list2);
    }

    public static final cjn U(fjn fjnVar) {
        lnm0 lnm0Var;
        lab labVar;
        Long l = fjnVar.f9650a;
        Integer num = fjnVar.g;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        Integer num2 = fjnVar.b;
        if (num2 == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num2.intValue();
        Double d = fjnVar.c;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Double d2 = fjnVar.f;
        if (d2 == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue2 = d2.doubleValue();
        if (num != null) {
            kj5 kj5Var = lab.f19698a;
            int iIntValue2 = num.intValue();
            kj5Var.getClass();
            if (iIntValue2 == 1) {
                labVar = lab.b;
            } else if (iIntValue2 != 2) {
                labVar = iIntValue2 != 3 ? lab.e : lab.d;
            } else {
                labVar = lab.c;
            }
            int iOrdinal = labVar.ordinal();
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
        Double d3 = fjnVar.h;
        double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
        List list = fjnVar.k;
        if (list == null) {
            jf4.k(null);
            return null;
        }
        List list2 = fjnVar.j;
        if (list2 == null) {
            jf4.k(null);
            return null;
        }
        List list3 = fjnVar.e;
        if (list3 == null) {
            jf4.k(null);
            return null;
        }
        rk10 rk10Var = fjnVar.i;
        csr csrVarA0 = rk10Var != null ? d5c.a0(rk10Var) : csr.e;
        List list4 = fjnVar.d;
        if (list4 != null) {
            return new cjn(jLongValue, iIntValue, dDoubleValue, dDoubleValue2, lnm0Var, dDoubleValue3, list, list2, list3, csrVarA0, list4);
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:247:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:248:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:253:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:261:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:263:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:264:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:274:0x0409  */
    /* JADX WARN: Code duplicated, block: B:277:0x0410  */
    /* JADX WARN: Code duplicated, block: B:278:0x0417  */
    /* JADX WARN: Code duplicated, block: B:281:0x041f  */
    /* JADX WARN: Code duplicated, block: B:283:0x0425  */
    /* JADX WARN: Code duplicated, block: B:284:0x042a  */
    /* JADX WARN: Code duplicated, block: B:287:0x042f  */
    /* JADX WARN: Code duplicated, block: B:288:0x0434  */
    /* JADX WARN: Code duplicated, block: B:291:0x043b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0097  */
    /* JADX WARN: Code duplicated, block: B:71:0x00de  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v21, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r60v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v25, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v26, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public static final ygs V(zps zpsVar, long j, boolean z, long j2, String str, String str2, long j3, long j4) {
        String str3;
        String str4;
        String str5;
        String str6;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        ?? arrayList4;
        ArrayList arrayList5;
        ehs ehsVar;
        ArrayList arrayList6;
        ArrayList arrayList7;
        vas vasVar;
        Integer num;
        int iIntValue;
        long jLongValue;
        boolean z2;
        boolean zD;
        k5h0 k5h0Var;
        ?? arrayList8;
        Integer num2;
        int iIntValue2;
        q3h0 q3h0Var;
        ubr ubrVar;
        Integer num3;
        int iIntValue3;
        Integer num4;
        int iIntValue4;
        Map map;
        Integer num5;
        Long l;
        Integer num6;
        Integer num7;
        StatInfo statInfo;
        List list;
        List list2;
        List list3;
        List list4;
        k5h0 k5h0Var2;
        Map map2;
        String str7;
        List listSplit$default;
        k5h0 k5h0Var3;
        Map map3;
        String str8;
        List listSplit$default2;
        List list5;
        j180 j180Var;
        Long l2;
        List list6;
        j180 j180Var2;
        Long l3;
        Long l4 = zpsVar.d;
        f6h0 f6h0Var = zpsVar.g;
        Boolean bool = zpsVar.C;
        f380 f380Var = zpsVar.A;
        f380 f380Var2 = zpsVar.z;
        long jLongValue2 = l4 != null ? l4.longValue() : 0L;
        Boolean bool2 = zpsVar.y;
        Boolean bool3 = Boolean.TRUE;
        boolean zD2 = Intrinsics.d(bool2, bool3);
        long jLongValue3 = (f380Var2 == null || (list6 = f380Var2.c) == null || (j180Var2 = (j180) CollectionsKt.firstOrNull(list6)) == null || (l3 = j180Var2.f15721a) == null) ? 0L : l3.longValue();
        long jLongValue4 = (f380Var == null || (list5 = f380Var.c) == null || (j180Var = (j180) CollectionsKt.firstOrNull(list5)) == null || (l2 = j180Var.f15721a) == null) ? 0L : l2.longValue();
        int i = 0;
        vas vasVarZ = null;
        if (Intrinsics.d(bool, bool3) && z) {
            if (f6h0Var == null || (k5h0Var3 = f6h0Var.q) == null || (map3 = k5h0Var3.f17720a) == null || (str8 = (String) map3.get("AltOpp")) == null || (listSplit$default2 = StringsKt__StringsKt.split$default(str8, new String[]{Separators.SLASH}, false, 0, 6, null)) == null || (str3 = (String) CollectionsKt.firstOrNull(listSplit$default2)) == null) {
                str3 = f380Var2 != null ? f380Var2.b : null;
                if (str3 == null) {
                    str4 = "";
                }
            }
            str4 = str3;
        } else {
            str3 = f380Var2 != null ? f380Var2.b : null;
            if (str3 == null) {
                str4 = "";
            } else {
                str4 = str3;
            }
        }
        if (Intrinsics.d(bool, bool3) && z) {
            if (f6h0Var == null || (k5h0Var2 = f6h0Var.q) == null || (map2 = k5h0Var2.f17720a) == null || (str7 = (String) map2.get("AltOpp")) == null || (listSplit$default = StringsKt__StringsKt.split$default(str7, new String[]{Separators.SLASH}, false, 0, 6, null)) == null || (str5 = (String) CollectionsKt.W(1, listSplit$default)) == null) {
                str5 = f380Var != null ? f380Var.b : null;
                if (str5 == null) {
                    str6 = "";
                }
            }
            str6 = str5;
        } else {
            str5 = f380Var != null ? f380Var.b : null;
            if (str5 == null) {
                str6 = "";
            } else {
                str6 = str5;
            }
        }
        p480 p480Var = zpsVar.B;
        String str9 = p480Var != null ? p480Var.f26340a : null;
        String str10 = str9 == null ? "" : str9;
        int i2 = 10;
        if (f380Var2 == null || (list4 = f380Var2.c) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList(r3d.q(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                Long l5 = ((j180) it.next()).f15721a;
                arrayList.add(Long.valueOf(l5 != null ? l5.longValue() : 0L));
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        ?? r28 = arrayList;
        if (f380Var == null || (list3 = f380Var.c) == null) {
            arrayList2 = 0;
        } else {
            arrayList2 = new ArrayList(r3d.q(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                Long l6 = ((j180) it2.next()).f15721a;
                arrayList2.add(Long.valueOf(l6 != null ? l6.longValue() : 0L));
            }
        }
        if (arrayList2 == 0) {
            arrayList2 = iun.f15405a;
        }
        ?? r29 = arrayList2;
        if (f380Var2 == null || (list2 = f380Var2.c) == null) {
            arrayList3 = 0;
        } else {
            arrayList3 = new ArrayList(r3d.q(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                String str11 = ((j180) it3.next()).b;
                arrayList3.add(str11 != null ? StringsKt.p0(str11, Separators.SLASH, str11) : "");
            }
        }
        if (arrayList3 == 0) {
            arrayList3 = iun.f15405a;
        }
        ?? r33 = arrayList3;
        if (f380Var == null || (list = f380Var.c) == null) {
            arrayList4 = 0;
        } else {
            arrayList4 = new ArrayList(r3d.q(list, 10));
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                String str12 = ((j180) it4.next()).b;
                arrayList4.add(str12 != null ? StringsKt.p0(str12, Separators.SLASH, str12) : "");
            }
        }
        if (arrayList4 == 0) {
            arrayList4 = iun.f15405a;
        }
        ?? r34 = arrayList4;
        String str13 = zpsVar.k;
        String str14 = str13 == null ? "" : str13;
        Long l7 = zpsVar.f;
        long jLongValue5 = l7 != null ? l7.longValue() : 0L;
        String str15 = zpsVar.n;
        String str16 = str15 == null ? "" : str15;
        Boolean bool4 = zpsVar.s;
        Boolean bool5 = Boolean.TRUE;
        boolean zD3 = Intrinsics.d(bool4, bool5);
        boolean zD4 = Intrinsics.d(zpsVar.r, bool5);
        boolean zD5 = Intrinsics.d(bool, bool5);
        List list7 = zpsVar.E;
        if (list7 != null) {
            ArrayList arrayList9 = new ArrayList(r3d.q(list7, 10));
            Iterator it5 = list7.iterator();
            while (it5.hasNext()) {
                arrayList9.add(e3c.K((tdo) it5.next(), z ? sip.c : sip.b));
            }
            arrayList5 = arrayList9;
        } else {
            arrayList5 = null;
        }
        if (f6h0Var != null) {
            String str17 = f6h0Var.e;
            rnq0 rnq0Var = f6h0Var.m;
            Integer num8 = f6h0Var.d;
            String str18 = f6h0Var.f9010a;
            String str19 = str18 == null ? "" : str18;
            List<af90> list8 = f6h0Var.b;
            if (list8 != null) {
                ArrayList arrayList10 = new ArrayList(r3d.q(list8, 10));
                for (af90 af90Var : list8) {
                    Integer num9 = af90Var.f768a;
                    int iIntValue5 = num9 != null ? num9.intValue() : i;
                    String str20 = af90Var.d;
                    if (str20 == null) {
                        str20 = "";
                    }
                    Integer num10 = af90Var.b;
                    int iIntValue6 = num10 != null ? num10.intValue() : 0;
                    Integer num11 = af90Var.c;
                    arrayList10.add(new df90(iIntValue5, new tf90(str20, iIntValue6, num11 != null ? num11.intValue() : 0)));
                    i = 0;
                }
                arrayList6 = arrayList10;
            } else {
                arrayList6 = null;
            }
            Integer num12 = f6h0Var.f;
            Integer num13 = f6h0Var.i;
            String str21 = f6h0Var.j;
            String str22 = f6h0Var.k;
            Map map4 = f6h0Var.o;
            if (map4 != null) {
                ArrayList arrayList11 = new ArrayList();
                for (Map.Entry entry : map4.entrySet()) {
                    String str23 = (String) entry.getKey();
                    List list9 = (List) entry.getValue();
                    if (list9.isEmpty()) {
                        num6 = num12;
                        num7 = num13;
                        statInfo = null;
                    } else {
                        Integer intOrNull = StringsKt.toIntOrNull(str23);
                        Integer numValueOf = Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 0);
                        ArrayList arrayList12 = new ArrayList(r3d.q(list9, i2));
                        Iterator it6 = list9.iterator();
                        while (it6.hasNext()) {
                            zmo0 zmo0Var = (zmo0) it6.next();
                            Iterator it7 = it6;
                            b7m0 b7m0Var = zmo0Var.f44636a;
                            z6m0 z6m0VarP0 = b7m0Var != null ? ucx.p0(b7m0Var) : z6m0.c;
                            Integer num14 = num12;
                            String str24 = zmo0Var.b;
                            if (str24 == null) {
                                str24 = "";
                            }
                            Integer num15 = num13;
                            String str25 = zmo0Var.c;
                            if (str25 == null) {
                                str25 = "";
                            }
                            String str26 = zmo0Var.d;
                            if (str26 == null) {
                                str26 = "";
                            }
                            arrayList12.add(new GameStatistic(z6m0VarP0, str24, str25, str26));
                            it6 = it7;
                            num12 = num14;
                            num13 = num15;
                        }
                        num6 = num12;
                        num7 = num13;
                        statInfo = new StatInfo(numValueOf, arrayList12);
                    }
                    if (statInfo != null) {
                        arrayList11.add(statInfo);
                    }
                    str17 = str17;
                    num8 = num8;
                    num12 = num6;
                    num13 = num7;
                    i2 = 10;
                }
                arrayList7 = arrayList11;
            } else {
                arrayList7 = null;
            }
            String str27 = str17;
            Integer num16 = num8;
            Integer num17 = num12;
            Integer num18 = num13;
            Boolean bool6 = f6h0Var.l;
            Boolean bool7 = Boolean.TRUE;
            boolean zD6 = Intrinsics.d(bool6, bool7);
            if (j2 == 66 || j2 == 99) {
                iso isoVar = f6h0Var.c;
                if (isoVar != null) {
                    vasVarZ = qbc.Z(isoVar);
                }
            } else {
                rzm0 rzm0Var = f6h0Var.h;
                if (rzm0Var != null) {
                    vasVar = new vas(rzm0Var.f31369a, rzm0Var.b);
                }
                num = f6h0Var.g;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                if (rnq0Var != null || (l = rnq0Var.f30801a) == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = l.longValue();
                }
                if (rnq0Var == null && (num5 = rnq0Var.b) != null && num5.intValue() == -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rnq0Var != null) {
                    zD = Intrinsics.d(rnq0Var.c, bool7);
                } else {
                    zD = false;
                }
                k5h0Var = f6h0Var.q;
                if (k5h0Var != null || (map = k5h0Var.f17720a) == null) {
                    arrayList8 = iun.f15405a;
                } else {
                    arrayList8 = new ArrayList(map.size());
                    Iterator it8 = map.entrySet().iterator();
                    while (it8.hasNext()) {
                        arrayList8.add(nkb.x((Map.Entry) it8.next()));
                    }
                }
                ?? r60 = arrayList8;
                num2 = f6h0Var.r;
                if (num2 != null) {
                    iIntValue2 = num2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                String str28 = f6h0Var.s;
                q3h0Var = f6h0Var.p;
                if (q3h0Var != null) {
                    num3 = q3h0Var.f28053a;
                    if (num3 != null) {
                        iIntValue3 = num3.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    num4 = q3h0Var.b;
                    if (num4 != null) {
                        iIntValue4 = num4.intValue();
                    } else {
                        iIntValue4 = 0;
                    }
                    ubrVar = new ubr(iIntValue3, iIntValue4);
                } else {
                    ubrVar = new ubr(0, 0);
                }
                ehsVar = new ehs(str27, num16, iIntValue, str19, arrayList6, num17, num18, vasVar, str21, str22, arrayList7, zD6, iIntValue2, jLongValue, r60, z2, false, false, false, false, false, false, false, false, false, false, zD, str28, ubrVar);
            }
            vasVar = vasVarZ;
            num = f6h0Var.g;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            if (rnq0Var != null) {
                jLongValue = 0;
            } else {
                jLongValue = 0;
            }
            if (rnq0Var == null) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (rnq0Var != null) {
                zD = Intrinsics.d(rnq0Var.c, bool7);
            } else {
                zD = false;
            }
            k5h0Var = f6h0Var.q;
            if (k5h0Var != null) {
                arrayList8 = iun.f15405a;
            } else {
                arrayList8 = iun.f15405a;
            }
            ?? r61 = arrayList8;
            num2 = f6h0Var.r;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            String str29 = f6h0Var.s;
            q3h0Var = f6h0Var.p;
            if (q3h0Var != null) {
                num3 = q3h0Var.f28053a;
                if (num3 != null) {
                    iIntValue3 = num3.intValue();
                } else {
                    iIntValue3 = 0;
                }
                num4 = q3h0Var.b;
                if (num4 != null) {
                    iIntValue4 = num4.intValue();
                } else {
                    iIntValue4 = 0;
                }
                ubrVar = new ubr(iIntValue3, iIntValue4);
            } else {
                ubrVar = new ubr(0, 0);
            }
            ehsVar = new ehs(str27, num16, iIntValue, str19, arrayList6, num17, num18, vasVar, str21, str22, arrayList7, zD6, iIntValue2, jLongValue, r61, z2, false, false, false, false, false, false, false, false, false, false, zD, str29, ubrVar);
        } else {
            ehsVar = null;
        }
        return new ygs(j, jLongValue2, z, j2, str2, j3, zD4, str16, ehsVar, jLongValue3, jLongValue4, r28, r29, str4, str6, str10, r33, r34, str14, zD5, zD2, false, zD3, null, arrayList5, jLongValue5, str, j4);
    }

    public static final void a(zrm zrmVar, g3l0 g3l0Var, Function0 function0, Function0 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        fetVar.g0(413034460);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(zrmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(g3l0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 6.0f, 7);
            f2l0 f2l0Var = zrmVar.f44861a;
            u1l0 u1l0Var = zrmVar.b;
            d4d d4dVar = zrmVar.d;
            n3l0 n3l0Var = zrmVar.e;
            boolean z = zrmVar.f;
            f2l0Var.getClass();
            d4dVar.getClass();
            n3l0Var.getClass();
            agc.r(mm40VarN, new zrm(f2l0Var, u1l0Var, g3l0Var, d4dVar, n3l0Var, z), function0, function1, null, function2, null, fetVar, (i2 & 458752) | ((i2 >> 3) & 8064), 80);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(zrmVar, g3l0Var, function0, function1, function2, i);
        }
    }

    public static final void b(int i, fet fetVar) {
        int i2;
        fetVar.g0(603436210);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 6.0f, 7);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(o7k0.e(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), 48.0f), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u49(i, (byte) 8);
        }
    }

    public static final void c(final String str, final o0x o0xVar, final float f, final long j, final boolean z, final long j2, final long j3, final Integer num, final Boolean bool, final boolean z2, final Function0 function0, xdr xdrVar, xdr xdrVar2, fet fetVar, final int i) {
        fet fetVar2;
        xdr xdrVar3;
        xdr xdrVar4;
        boolean z3;
        Integer num2;
        xdr xdrVar5 = xdrVar;
        xdr xdrVar6 = xdrVar2;
        fet fetVar3 = fetVar;
        str.getClass();
        o0xVar.getClass();
        function0.getClass();
        fetVar3.g0(76841305);
        int i2 = (fetVar3.g(num) ? 8388608 : 4194304) | i | (fetVar3.g(str) ? 4 : 2) | (fetVar3.g(o0xVar) ? 32 : 16) | (fetVar3.d(f) ? 256 : 128) | (fetVar3.f(j) ? 2048 : 1024) | (fetVar3.h(z) ? 16384 : 8192) | (fetVar3.f(j2) ? 131072 : 65536) | (fetVar3.f(j3) ? 1048576 : 524288) | (fetVar3.g(bool) ? 67108864 : 33554432) | (fetVar3.h(z2) ? 536870912 : 268435456);
        int i3 = (fetVar3.i(function0) ? (char) 4 : (char) 2) | (fetVar3.i(xdrVar5) ? ' ' : (char) 16) | (fetVar3.i(xdrVar6) ? (char) 256 : (char) 128);
        if (fetVar3.U(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 147) == 146) ? false : true)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(jm40Var, "DS_CHIP");
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarE0, 48.0f, 0.0f, 2);
            boolean z4 = ((i2 & 57344) == 16384) | ((i3 & 14) == 4);
            Object objP = fetVar3.P();
            cl5 cl5Var = ukd.f35823a;
            if (z4 || objP == cl5Var) {
                objP = new jw7(z, function0, (byte) 4);
                fetVar3.o0(objP);
            }
            mm40 mm40VarF = phu0.F(mm40VarG, null, null, false, null, (Function0) objP, fetVar, 0, 15);
            boolean z5 = (1879048192 & i2) == 536870912;
            Object objP2 = fetVar.P();
            if (z5 || objP2 == cl5Var) {
                objP2 = new z((byte) 6, z2);
                fetVar.o0(objP2);
            }
            mm40 mm40VarL = s5x0.L(pai0.a(mm40VarF, true, (Function1) objP2), 0.0f, 8.0f, 1);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z6 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z6) {
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
            mm40 mm40VarQ = i120.Q(o7k0.g(epv0.N(jm40Var, z ? 0.5f : 1.0f), 32.0f, 0.0f, 2), j2, vgg0.a(14.0f));
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarQ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            int i4 = i2 >> 6;
            ebc.b(s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), j, f, z, o0xVar, num, null, null, null, null, bool, null, null, null, fetVar, (i4 & 112) | (i2 & 896) | ((i2 >> 3) & 7168) | ((i2 << 9) & 57344) | (i4 & 458752), (i2 >> 24) & 14, 15296);
            mm40 mm40VarN = s5x0.N(jm40Var, 4.0f, 0.0f, 16.0f, 0.0f, 10);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarN, j3, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.n(), fetVar, (i2 & 14) | ((i2 >> 12) & 896), 24960, 110584);
            fet fetVar4 = fetVar;
            fetVar4.r(true);
            jr8 jr8Var = jr8.f16991a;
            xdr xdrVar7 = xdrVar;
            if (xdrVar7 == null) {
                fetVar4.e0(-1812743591);
                z3 = false;
                fetVar4.r(false);
                num2 = 6;
            } else {
                z3 = false;
                fetVar4.e0(-1812743590);
                num2 = 6;
                xdrVar7.F(jr8Var, fetVar4, 6);
                fetVar4.r(false);
            }
            xdr xdrVar8 = xdrVar2;
            if (xdrVar8 == null) {
                fetVar4.e0(-1812672167);
                fetVar4.r(z3);
            } else {
                fetVar4.e0(-1812672166);
                xdrVar8.F(jr8Var, fetVar4, num2);
                fetVar4.r(z3);
            }
            fetVar4.r(true);
            xdrVar4 = xdrVar7;
            xdrVar3 = xdrVar8;
            fetVar2 = fetVar4;
        } else {
            fetVar3.X();
            xdrVar4 = xdrVar5;
            xdrVar3 = xdrVar6;
            fetVar2 = fetVar3;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final xdr xdrVar9 = xdrVar4;
            final xdr xdrVar10 = xdrVar3;
            yfe0VarU.d = new Function2(str, o0xVar, f, j, z, j2, j3, num, bool, z2, function0, xdrVar9, xdrVar10, i) { // from class: a.nbc

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ String f23233a;
                public final /* synthetic */ o0x b;
                public final /* synthetic */ float c;
                public final /* synthetic */ long d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ long f;
                public final /* synthetic */ long g;
                public final /* synthetic */ Integer h;
                public final /* synthetic */ Boolean i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ Function0 k;
                public final /* synthetic */ xdr l;
                public final /* synthetic */ xdr m;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    obc.c(this.f23233a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void d(l5d0 l5d0Var, Function2 function2, fet fetVar, int i) {
        fetVar.g0(-149765515);
        fetVar.c0(l5d0Var);
        function2.invoke(fetVar, Integer.valueOf((i >> 3) & 14));
        fetVar.r(false);
        fetVar.r(false);
        fetVar.w = fetVar.x.b() != 0;
        fetVar.K = null;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(l5d0Var, function2, i, (byte) 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void e(l5d0[] l5d0VarArr, Function2 function2, fet fetVar, int i) {
        bh90 bh90VarE;
        boolean z;
        yfe0 yfe0VarU;
        fetVar.g0(415205898);
        skx skxVar = fetVar.x;
        bh90 bh90VarM = fetVar.m();
        fetVar.a0(201, ykd.b);
        boolean z2 = fetVar.S;
        ev70 ev70Var = ykd.d;
        if (z2) {
            bh90 bh90VarB0 = qbc.b0(l5d0VarArr, bh90VarM, bh90.g);
            bh90VarM.getClass();
            ah90 ah90Var = new ah90(bh90VarM);
            ah90Var.g = bh90VarM;
            ah90Var.putAll(bh90VarB0);
            bh90VarE = ah90Var.e();
            fetVar.a0(204, ev70Var);
            fetVar.H();
            fetVar.p0(bh90VarE);
            fetVar.H();
            fetVar.p0(bh90VarB0);
            fetVar.r(false);
            fetVar.J = true;
        } else {
            p9k0 p9k0Var = fetVar.G;
            Object objH = p9k0Var.h(p9k0Var.g, 0);
            objH.getClass();
            bh90 bh90Var = (bh90) objH;
            p9k0 p9k0Var2 = fetVar.G;
            Object objH2 = p9k0Var2.h(p9k0Var2.g, 1);
            objH2.getClass();
            bh90 bh90Var2 = (bh90) objH2;
            bh90 bh90VarB1 = qbc.b0(l5d0VarArr, bh90VarM, bh90Var2);
            if (!fetVar.D() || fetVar.y || !bh90Var2.equals(bh90VarB1)) {
                bh90VarM.getClass();
                ah90 ah90Var2 = new ah90(bh90VarM);
                ah90Var2.g = bh90VarM;
                ah90Var2.putAll(bh90VarB1);
                bh90VarE = ah90Var2.e();
                fetVar.a0(204, ev70Var);
                fetVar.H();
                fetVar.p0(bh90VarE);
                fetVar.H();
                fetVar.p0(bh90VarB1);
                fetVar.r(false);
                if (fetVar.y || !bh90VarE.equals(bh90Var)) {
                    z = true;
                }
                if (z && !fetVar.S) {
                    fetVar.N(bh90VarE);
                }
                skxVar.c(fetVar.w ? 1 : 0);
                fetVar.w = z;
                fetVar.K = bh90VarE;
                fetVar.Y(ykd.c, Response.ACCEPTED, 0, bh90VarE);
                function2.invoke(fetVar, Integer.valueOf((i >> 3) & 14));
                fetVar.r(false);
                fetVar.r(false);
                fetVar.w = skxVar.b() != 0;
                fetVar.K = null;
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new zma(l5d0VarArr, function2, i, (byte) 9);
                }
            }
            fetVar.l = fetVar.G.s() + fetVar.l;
            bh90VarE = bh90Var;
        }
        z = false;
        if (z) {
            fetVar.N(bh90VarE);
        }
        skxVar.c(fetVar.w ? 1 : 0);
        fetVar.w = z;
        fetVar.K = bh90VarE;
        fetVar.Y(ykd.c, Response.ACCEPTED, 0, bh90VarE);
        function2.invoke(fetVar, Integer.valueOf((i >> 3) & 14));
        fetVar.r(false);
        fetVar.r(false);
        fetVar.w = skxVar.b() != 0;
        fetVar.K = null;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zma(l5d0VarArr, function2, i, (byte) 9);
        }
    }

    public static final void f(hnf hnfVar, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-535211091);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(hnfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 23;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = jnf.f16808a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean z = (i2 & 14) == 4;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new ejd(hnfVar, b);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, null, (Function1) objP2, fetVar2, 6, 2);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(hnfVar, i, b);
        }
    }

    public static final void g(mm40 mm40Var, final bcg bcgVar, final Function1 function1, final Function1 function2, Function2 function3, fet fetVar, int i) {
        mm40 mm40Var2;
        function1.getClass();
        function2.getClass();
        function3.getClass();
        fetVar.g0(-1861066226);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(bcgVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function3) ? 16384 : 8192;
        }
        final byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            if (bcgVar instanceof zbg) {
                fetVar.e0(709218550);
                zbg zbgVar = (zbg) bcgVar;
                zrm zrmVar = zbgVar.c;
                g3l0 g3l0Var = zbgVar.d;
                int i3 = i2 & 112;
                boolean z = ((i2 & 896) == 256) | (i3 == 32);
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                if (z || objP == cl5Var) {
                    objP = new Function0() { // from class: a.ybg
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b2 = b;
                            bcg bcgVar2 = bcgVar;
                            Function1 function4 = function1;
                            switch (b2) {
                                case 0:
                                    function4.invoke(Long.valueOf(((zbg) bcgVar2).b));
                                    break;
                                default:
                                    function4.invoke(Long.valueOf(((zbg) bcgVar2).b));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                boolean z2 = ((i2 & 7168) == 2048) | (i3 == 32);
                Object objP2 = fetVar.P();
                if (z2 || objP2 == cl5Var) {
                    final byte b2 = 1;
                    objP2 = new Function0() { // from class: a.ybg
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b3 = b2;
                            bcg bcgVar2 = bcgVar;
                            Function1 function4 = function2;
                            switch (b3) {
                                case 0:
                                    function4.invoke(Long.valueOf(((zbg) bcgVar2).b));
                                    break;
                                default:
                                    function4.invoke(Long.valueOf(((zbg) bcgVar2).b));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar.o0(objP2);
                }
                Function0 function4 = (Function0) objP2;
                boolean z3 = ((i2 & 57344) == 16384) | (i3 == 32);
                Object objP3 = fetVar.P();
                if (z3 || objP3 == cl5Var) {
                    objP3 = new v4f(function3, bcgVar, (byte) 16);
                    fetVar.o0(objP3);
                }
                a(zrmVar, g3l0Var, function0, function4, (Function1) objP3, fetVar, i2 & 14);
                fetVar.r(false);
            } else {
                if (!(bcgVar instanceof acg)) {
                    throw b1j.f(-1778239180, fetVar, false);
                }
                fetVar.e0(-1778223965);
                b(i2 & 14, fetVar);
                fetVar.r(false);
            }
            mm40Var2 = jm40.b;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zf(mm40Var2, (Object) bcgVar, (Object) function1, (Object) function2, (Object) function3, i, (byte) 11);
        }
    }

    public static final void h(mm40 mm40Var, ugd ugdVar, fet fetVar, int i, int i2) {
        zx7 zx7Var = gqw0.d;
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        if ((i2 & 2) != 0) {
            zx7Var = gqw0.e;
        }
        tj30 tj30VarC = zq8.c(zx7Var, false);
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
        jpm0.o(fetVar, tj30VarC, gqw0.x);
        jpm0.o(fetVar, bh90VarM, gqw0.w);
        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
        jpm0.n(fetVar);
        jpm0.o(fetVar, mm40VarC0, gqw0.v);
        ugdVar.F(jr8.f16991a, fetVar, 54);
        fetVar.r(true);
    }

    public static final void i(mm40 mm40Var, pqh pqhVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-484854913);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(pqhVar) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
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
            oqh oqhVar = pqhVar.f27416a;
            if (oqhVar == null) {
                fetVar.e0(-307185583);
                fetVar.r(false);
            } else {
                fetVar.e0(-307185582);
                jcb.d(null, oqhVar, fetVar, 0);
                fetVar.r(false);
            }
            xph xphVar = pqhVar.b;
            if (xphVar == null) {
                fetVar.e0(-307090072);
                fetVar.r(false);
            } else {
                fetVar.e0(-307090071);
                vcc.b(null, xphVar, fetVar, 0);
                fetVar.r(false);
            }
            eph ephVar = pqhVar.c;
            if (ephVar == null) {
                fetVar.e0(-306985912);
                fetVar.r(false);
            } else {
                fetVar.e0(-306985911);
                d5c.b(null, ephVar, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qph(mm40Var, pqhVar, i, b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r11v2, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static final void j(int i, u3i u3iVar, u3i u3iVar2, u3i u3iVar3, b4i b4iVar, fet fetVar, mm40 mm40Var, String str, Function1 function1) {
        ?? r11;
        boolean z;
        ?? r2;
        ?? r12;
        char c;
        int i2;
        int i3;
        fet fetVar2 = fetVar;
        str.getClass();
        function1.getClass();
        fetVar2.g0(2087864654);
        int i4 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(b4iVar) ? 256 : 128) | (fetVar2.g(u3iVar) ? 2048 : 1024) | (fetVar2.g(u3iVar2) ? 16384 : 8192) | (fetVar2.g(u3iVar3) ? 131072 : 65536);
        if ((i & 1572864) == 0) {
            i4 |= fetVar2.i(function1) ? 1048576 : 524288;
        }
        if (fetVar2.U(i4 & 1, (599187 & i4) != 599186)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(o7k0.d(o7k0.e(mm40Var, 40.0f), 1.0f), 12.0f, 0.0f, 4.0f, 0.0f, 10);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            int length = str.length();
            jm40 jm40Var = jm40.b;
            if (length > 0) {
                fetVar2.e0(453559957);
                int i5 = ((i4 >> 3) & 14) | 48;
                z = true;
                r2 = 0;
                j6n.h(str, oro0.f25744a, s5x0.N(jm40Var, 0.0f, 0.0f, 6.0f, 0.0f, 11), 0, 0, fetVar, i5, 24);
                fet fetVar3 = fetVar;
                fetVar3.r(false);
                r12 = fetVar3;
            } else {
                z = true;
                r2 = 0;
                fetVar2.e0(453770416);
                fetVar2.r(false);
                r12 = fetVar2;
            }
            mm40 mm40VarA = o7k0.A(new x7z(1.0f, z), gqw0.m, 2);
            String str2 = b4iVar.f1959a;
            ((g1t0) r12.k(j1t0.e)).getClass();
            plc.n(mm40VarA, str2, ibm0.n(g1t0.g(), r12), u1c.M(365755446, new i3i(u3iVar, r2), r12), r12, 24576);
            qxw.o(r12, o7k0.s(jm40Var, 8.0f));
            boolean z2 = u3iVar2 instanceof z3i;
            Object obj = ukd.f35823a;
            if (z2) {
                r12.e0(454499908);
                int iOrdinal = ((z3i) u3iVar2).f43719a.ordinal();
                if (iOrdinal == 0) {
                    i3 = R.drawable.ic_glyph_notification_active;
                } else {
                    if (iOrdinal != z) {
                        t9f.b();
                        return;
                    }
                    i3 = R.drawable.ic_glyph_notification_inactive;
                }
                c = 0;
                int i6 = ((i4 & 57344) == 16384 ? z : r2) | ((i4 & 3670016) == 1048576 ? z : r2);
                Object objP = r12.P();
                if (i6 != 0 || objP == obj) {
                    objP = new brh(function1, u3iVar2, (byte) 3);
                    r12.o0(objP);
                }
                k(i3, r2, r12, null, (Function0) objP);
                r12.r(r2);
            } else {
                c = 0;
                r12.e0(454880464);
                r12.r(r2);
            }
            if (u3iVar3 instanceof x3i) {
                r12.e0(454973650);
                int iOrdinal2 = ((x3i) u3iVar3).f40219a.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = R.drawable.ic_glyph_favourite_active;
                } else {
                    if (iOrdinal2 != z) {
                        t9f.b();
                        return;
                    }
                    i2 = R.drawable.ic_glyph_favourite_inactive;
                }
                int i7 = ((i4 & 458752) == 131072 ? z : r2) | ((i4 & 3670016) == c ? z : r2);
                Object objP2 = r12.P();
                if (i7 != 0 || objP2 == obj) {
                    objP2 = new arh(function1, u3iVar3, (byte) 3);
                    r12.o0(objP2);
                }
                k(i2, r2, r12, null, (Function0) objP2);
                r12.r(r2);
            } else {
                r12.e0(455340752);
                r12.r(r2);
            }
            r12.r(z);
            r11 = r12;
        } else {
            fetVar2.X();
            r11 = fetVar2;
        }
        yfe0 yfe0VarU = r11.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new j3i(mm40Var, str, b4iVar, u3iVar, u3iVar2, u3iVar3, function1, i);
        }
    }

    public static final void k(int i, int i2, fet fetVar, mm40 mm40Var, Function0 function0) {
        mm40 mm40Var2;
        fetVar.g0(2116444930);
        int i3 = i2 | 6 | (fetVar.e(i) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(o7k0.s(o7k0.e(jm40Var, 32.0f), 40.0f), 4.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarW = y860.W(i120.Q(mm40VarJ, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), vgg0.f37379a), null, null, false, null, function0, 28);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            Object objF = a8k0.F(i, (i3 >> 3) & 14, fetVar);
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                fetVar.o0(objF);
            } else {
                objF = objP;
            }
            mm40Var2 = jm40Var;
            dww.c((pm80) objF, null, s5x0.J(jm40Var, 4.0f), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wb5(mm40Var2, i, function0, i2, (byte) 4);
        }
    }

    public static final void l(mm40 mm40Var, brl brlVar, fet fetVar, int i) {
        fetVar.g0(-1442417525);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(brlVar) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = brlVar instanceof zql;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(87524192);
                m((zql) brlVar, fetVar, i2 & 126);
                fetVar.r(false);
            } else {
                if (!brlVar.equals(arl.f1351a)) {
                    throw b1j.f(1111199773, fetVar, false);
                }
                fetVar.e0(87667753);
                n(i2 & 14, fetVar, jm40Var);
                fetVar.r(false);
            }
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new oql(mm40Var, brlVar, i, b);
        }
    }

    public static final void m(zql zqlVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1225941420);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(zqlVar) ? 32 : 16;
        }
        byte b = 0;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.X();
        } else if (zqlVar instanceof wql) {
            fetVar.e0(-1308657902);
            ahy.p(jm40Var, (wql) zqlVar, fetVar, i2 & 126);
            fetVar.r(false);
        } else if (zqlVar instanceof xql) {
            fetVar.e0(-1308653577);
            ahy.q(jm40Var, (xql) zqlVar, fetVar, i2 & 126);
            fetVar.r(false);
        } else {
            if (!(zqlVar instanceof yql)) {
                throw b1j.f(-1308660084, fetVar, false);
            }
            fetVar.e0(-1308649196);
            mbc.m(jm40Var, (yql) zqlVar, fetVar, i2 & 126);
            fetVar.r(false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pql(zqlVar, i, b);
        }
    }

    public static final void n(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(1484693993);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(10.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 20.0f), 172.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), fqj0VarD0));
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 172.0f), 1.0f);
            zcl zclVar3 = qmk.i;
            dw9.x(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarD), fqj0VarD0, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 17);
        }
    }

    public static final void o(mm40 mm40Var, String str, gzl gzlVar, xx7 xx7Var, Function0 function0, fet fetVar, int i) {
        Object obj;
        str.getClass();
        gzlVar.getClass();
        fetVar.g0(1281260594);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.e(gzlVar.ordinal()) ? 256 : 128) | (fetVar.i(function0) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(jm40.b, 36.0f), 0.0f, 8.0f, 1);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarE0 = o2e.e0(y860.W(o7k0.A(mm40Var, xx7Var, 2), null, null, false, null, function0, 28), "DS_TAG_COMMAND_BUTTON");
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                int iOrdinal = gzlVar.ordinal();
                if (iOrdinal == 0) {
                    obj = woo0.f39508a;
                } else if (iOrdinal == 1) {
                    obj = zqo0.f44815a;
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return;
                    }
                    obj = uro0.f36175a;
                }
                objP = obj;
                fetVar.o0(objP);
            }
            j6n.h(str, (sso0) objP, mm40VarE0, 0, 0, fetVar, (i2 >> 3) & 14, 24);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var, (Object) str, (Object) gzlVar, (Object) xx7Var, function0, i, (byte) 9);
        }
    }

    public static final void p(jbm jbmVar, boolean z, long j, Function2 function2, Function2 function3, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        function2.getClass();
        function3.getClass();
        fetVar.g0(1403353229);
        int i3 = i & 6;
        jm40 jm40Var = jm40.b;
        if (i3 == 0) {
            i2 = (fetVar.g(jm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(jbmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function3) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (i2 & 74899) != 74898)) {
            pz40 pz40Var = s6t0.f31722a;
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, s5x0.L(i120.Q(jm40Var, jM73getBlack400d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 0.0f, 8.0f, 1));
            byte b = 14;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4(b)), gqw0.m, fetVar, 0);
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
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            qw3 qw3Var = new qw3(4.0f, true, new jf4(b));
            lh80 lh80VarT = s5x0.t(8.0f, 0.0f, 2);
            int i4 = i2 & 112;
            boolean z2 = (i4 == 32) | ((i2 & 57344) == 16384);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new dpl((Object) jbmVar, (Object) function2, (byte) 8);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarW, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 6, 490);
            mm40 mm40VarW2 = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            qw3 qw3Var2 = new qw3(8.0f, true, new jf4((byte) 14));
            lh80 lh80VarT2 = s5x0.t(8.0f, 0.0f, 2);
            boolean z3 = ((458752 & i2) == 131072) | (i4 == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                q71 q71Var = new q71(jbmVar, z, j, function3);
                fetVar.o0(q71Var);
                objP2 = q71Var;
            }
            b8k0.f(mm40VarW2, null, lh80VarT2, false, qw3Var2, null, null, false, null, (Function1) objP2, fetVar, 6, 490);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u5h(jbmVar, z, j, function2, function3, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0116  */
    /* JADX WARN: Code duplicated, block: B:102:0x0119  */
    /* JADX WARN: Code duplicated, block: B:104:0x011c  */
    /* JADX WARN: Code duplicated, block: B:105:0x011e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0121  */
    /* JADX WARN: Code duplicated, block: B:108:0x0123  */
    /* JADX WARN: Code duplicated, block: B:111:0x0150 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x015a  */
    /* JADX WARN: Code duplicated, block: B:117:0x015e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0161  */
    /* JADX WARN: Code duplicated, block: B:121:0x0168  */
    /* JADX WARN: Code duplicated, block: B:123:0x016c  */
    /* JADX WARN: Code duplicated, block: B:127:0x018a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x018c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x018e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0191  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:143:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d2 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:152:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:154:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:157:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:158:0x0201  */
    /* JADX WARN: Code duplicated, block: B:160:0x0209  */
    /* JADX WARN: Code duplicated, block: B:161:0x020c  */
    /* JADX WARN: Code duplicated, block: B:163:0x0214  */
    /* JADX WARN: Code duplicated, block: B:166:0x021c  */
    /* JADX WARN: Code duplicated, block: B:168:0x021f  */
    /* JADX WARN: Code duplicated, block: B:170:0x0222  */
    /* JADX WARN: Code duplicated, block: B:172:0x0225  */
    /* JADX WARN: Code duplicated, block: B:173:0x022b  */
    /* JADX WARN: Code duplicated, block: B:175:0x022f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0233  */
    /* JADX WARN: Code duplicated, block: B:177:0x023b  */
    /* JADX WARN: Code duplicated, block: B:180:0x026e  */
    /* JADX WARN: Code duplicated, block: B:181:0x0272  */
    /* JADX WARN: Code duplicated, block: B:184:0x0296 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:187:0x029c  */
    /* JADX WARN: Code duplicated, block: B:190:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:191:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:194:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:195:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:198:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:199:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:202:0x02ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:206:0x032b  */
    /* JADX WARN: Code duplicated, block: B:207:0x032f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0340  */
    /* JADX WARN: Code duplicated, block: B:212:0x0350 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:213:0x0352  */
    /* JADX WARN: Code duplicated, block: B:216:0x0376  */
    /* JADX WARN: Code duplicated, block: B:217:0x0387  */
    /* JADX WARN: Code duplicated, block: B:219:0x038c  */
    /* JADX WARN: Code duplicated, block: B:221:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:223:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:227:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:230:0x03cd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:231:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:234:0x0407  */
    /* JADX WARN: Code duplicated, block: B:236:0x041e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:237:0x0420  */
    /* JADX WARN: Code duplicated, block: B:240:0x0442  */
    /* JADX WARN: Code duplicated, block: B:241:0x0445  */
    /* JADX WARN: Code duplicated, block: B:244:0x0454  */
    /* JADX WARN: Code duplicated, block: B:246:0x0466  */
    /* JADX WARN: Code duplicated, block: B:248:0x046b  */
    /* JADX WARN: Code duplicated, block: B:249:0x047a  */
    /* JADX WARN: Code duplicated, block: B:251:0x047e  */
    /* JADX WARN: Code duplicated, block: B:252:0x048d  */
    /* JADX WARN: Code duplicated, block: B:254:0x0491  */
    /* JADX WARN: Code duplicated, block: B:255:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:257:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:258:0x04be  */
    /* JADX WARN: Code duplicated, block: B:260:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:261:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:263:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:264:0x0504  */
    /* JADX WARN: Code duplicated, block: B:266:0x0508  */
    /* JADX WARN: Code duplicated, block: B:267:0x0526  */
    /* JADX WARN: Code duplicated, block: B:269:0x052a  */
    /* JADX WARN: Code duplicated, block: B:270:0x0548  */
    /* JADX WARN: Code duplicated, block: B:272:0x054c  */
    /* JADX WARN: Code duplicated, block: B:273:0x056d  */
    /* JADX WARN: Code duplicated, block: B:275:0x0571  */
    /* JADX WARN: Code duplicated, block: B:276:0x0581  */
    /* JADX WARN: Code duplicated, block: B:278:0x0585  */
    /* JADX WARN: Code duplicated, block: B:279:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:281:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:284:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:286:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:289:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:290:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:293:0x05fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:294:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:296:0x060c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:298:0x0610  */
    /* JADX WARN: Code duplicated, block: B:302:0x0620  */
    /* JADX WARN: Code duplicated, block: B:304:0x0632  */
    /* JADX WARN: Code duplicated, block: B:305:0x0635  */
    /* JADX WARN: Code duplicated, block: B:308:0x063a  */
    /* JADX WARN: Code duplicated, block: B:310:0x063e  */
    /* JADX WARN: Code duplicated, block: B:313:0x0671  */
    /* JADX WARN: Code duplicated, block: B:315:0x0675  */
    /* JADX WARN: Code duplicated, block: B:317:0x0692  */
    /* JADX WARN: Code duplicated, block: B:319:0x0696  */
    /* JADX WARN: Code duplicated, block: B:322:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:324:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:91:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:95:0x010e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0111  */
    /* JADX WARN: Code duplicated, block: B:98:0x0113  */
    public static final void q(mm40 mm40Var, rqm rqmVar, boolean z, gy40 gy40Var, Function0 function0, Function0 function1, Function0 function2, Function1 function3, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        boolean z2;
        int i4;
        gy40 gy40Var2;
        int i5;
        int i6;
        Function0 function4;
        int i7;
        int i8;
        Function0 function5;
        int i9;
        int i10;
        Function0 function6;
        int i11;
        int i12;
        int i13;
        boolean z3;
        Function1 function7;
        mm40 mm40Var3;
        boolean z4;
        Function0 function8;
        gy40 gy40Var3;
        Function0 function9;
        yfe0 yfe0VarU;
        jm40 jm40Var;
        mm40 mm40Var4;
        boolean z5;
        gy40 gy40Var4;
        Function0 function10;
        Function1 function11;
        boolean z6;
        int i14;
        long jY;
        t89 t89Var;
        pvi0 pvi0Var;
        pui0 pui0Var;
        vui0 vui0Var;
        Function0 function12;
        wui0 wui0Var;
        tvi0 tvi0Var;
        boolean zG;
        gy40 gy40Var5;
        Object objP;
        Function1 function13;
        nvi0 nvi0Var;
        int i15;
        boolean zH;
        Object objP2;
        float f;
        float fFloatValue;
        float f2;
        float f3;
        t89 skk0Var;
        float f4;
        int iOrdinal;
        yjj0 yjj0VarA;
        boolean z7;
        pcy pcyVar;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        Object objP3;
        Function0 function14;
        jr8 jr8Var;
        pui0 pui0Var2;
        boolean zD;
        Object objP4;
        jm40 jm40Var2;
        int i16;
        boolean z13;
        boolean z14;
        Object objP5;
        boolean z15;
        boolean zG2;
        Object objP6;
        mm40 mm40VarE0;
        boolean z16;
        Function0 function15;
        int i17;
        boolean z17;
        boolean zD2;
        Object objP7;
        mm40 mm40VarN;
        boolean z18;
        rqm rqmVar2 = rqmVar;
        rqmVar2.getClass();
        fetVar.g0(-284740273);
        int i18 = i2 & 1;
        if (i18 != 0) {
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
            i3 |= fetVar.g(rqmVar2) ? 32 : 16;
        }
        int i19 = i2 & 4;
        if (i19 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i3 |= fetVar.h(z2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    gy40Var2 = gy40Var;
                    if (fetVar.g(gy40Var2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        function4 = function0;
                        if (fetVar.i(function4)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        i3 |= 196608;
                        function5 = function1;
                    } else {
                        function5 = function1;
                        if ((i & 196608) == 0) {
                            if (fetVar.i(function5)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                    }
                    i10 = i2 & 64;
                    if (i10 != 0) {
                        i3 |= 1572864;
                        function6 = function2;
                    } else {
                        function6 = function2;
                        if ((i & 1572864) == 0) {
                            if (fetVar.i(function6)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                    }
                    i12 = i2 & 128;
                    if (i12 != 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if (fetVar.i(function3)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i3 |= i13;
                    }
                    if ((i3 & 4793491) != 4793490) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (fetVar.U(i3 & 1, z3)) {
                        jm40Var = jm40.b;
                        if (i18 != 0) {
                            mm40Var4 = jm40Var;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if (i19 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i4 != 0) {
                            gy40Var4 = null;
                        } else {
                            gy40Var4 = gy40Var2;
                        }
                        if (i6 != 0) {
                            function4 = null;
                        }
                        if (i8 != 0) {
                            function5 = null;
                        }
                        if (i10 != 0) {
                            function10 = null;
                        } else {
                            function10 = function6;
                        }
                        if (i12 != 0) {
                            function11 = null;
                        } else {
                            function11 = function3;
                        }
                        d4d d4dVar = rqmVar2.e;
                        z6 = rqmVar2.h;
                        i14 = i3;
                        jY = ibc.Y(d4dVar, fetVar);
                        t89Var = rqmVar2.i;
                        pvi0Var = rqmVar2.c;
                        pui0Var = rqmVar2.b;
                        boolean z19 = z5;
                        vui0Var = rqmVar2.f30938a;
                        function12 = function10;
                        wui0Var = rqmVar2.g;
                        tvi0Var = rqmVar2.f;
                        zG = fetVar.g(pvi0Var);
                        gy40Var5 = gy40Var4;
                        objP = fetVar.P();
                        function13 = function11;
                        cl5 cl5Var = ukd.f35823a;
                        if (!zG || objP == cl5Var) {
                            if (pvi0Var instanceof nvi0) {
                                nvi0Var = (nvi0) pvi0Var;
                            } else {
                                nvi0Var = null;
                            }
                            if (nvi0Var != null) {
                                i15 = i14;
                                boolean z20 = nvi0Var.f24188a;
                                objP = Boolean.valueOf(z20);
                                fetVar.o0(objP);
                            } else {
                                i15 = i14;
                            }
                            objP = Boolean.valueOf(z20);
                            fetVar.o0(objP);
                        } else {
                            i15 = i14;
                        }
                        boolean zBooleanValue = ((Boolean) objP).booleanValue();
                        zH = fetVar.h(z6);
                        objP2 = fetVar.P();
                        if (zH || objP2 == cl5Var) {
                            if (z6) {
                                f = 1.0f;
                            } else {
                                f = 0.5f;
                            }
                            objP2 = Float.valueOf(f);
                            fetVar.o0(objP2);
                        }
                        fFloatValue = ((Number) objP2).floatValue();
                        f2 = 60.0f;
                        if (vui0Var != null) {
                            zcl zclVar = qmk.f28987a;
                            f3 = 60.0f;
                        } else if (!(vui0Var instanceof tui0)) {
                            if (pui0Var instanceof nui0) {
                                zcl zclVar2 = qmk.f28987a;
                                f3 = 60.0f;
                            } else {
                                zcl zclVar3 = qmk.f28987a;
                                f3 = 48.0f;
                            }
                        } else if ((vui0Var instanceof sui0) || ((sui0) vui0Var).c.length() == 0) {
                            zcl zclVar4 = qmk.f28987a;
                            f3 = 60.0f;
                        } else {
                            zcl zclVar5 = qmk.f28987a;
                            f3 = 80.0f;
                        }
                        float fMax = Math.max(f3, rqmVar2.d);
                        if (t89Var == null) {
                            skk0Var = new skk0(jY);
                        } else {
                            skk0Var = t89Var;
                        }
                        mm40 mm40VarD = o7k0.d(o7k0.g(mm40Var4, fMax, 0.0f, 2), 1.0f);
                        if (Intrinsics.d(tvi0Var, qvi0.f29388a)) {
                            f4 = 16.0f;
                        } else if (Intrinsics.d(tvi0Var, rvi0.f31169a)) {
                            f4 = 360.0f;
                        } else {
                            if (Intrinsics.d(tvi0Var, svi0.f32868a)) {
                                t9f.b();
                                return;
                            }
                            f4 = 8.0f;
                        }
                        iOrdinal = wui0Var.ordinal();
                        if (iOrdinal != 0) {
                            yjj0VarA = vgg0.a(f4);
                        } else if (iOrdinal != 1) {
                            yjj0VarA = vgg0.c(f4, f4, 0.0f, 0.0f, 12);
                        } else if (iOrdinal != 2) {
                            yjj0VarA = jd8.n;
                        } else {
                            if (iOrdinal == 3) {
                                t9f.b();
                                return;
                            }
                            yjj0VarA = vgg0.c(0.0f, 0.0f, f4, f4, 3);
                        }
                        mm40 mm40VarP = i120.P(lgb.J(mm40VarD, yjj0VarA), skk0Var, null, 6);
                        tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                        int iHashCode = Long.hashCode(fetVar.T);
                        bh90 bh90VarM = fetVar.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarP);
                        mkd.c0.getClass();
                        fetVar.i0();
                        z7 = fetVar.S;
                        pcyVar = e7z.u1;
                        if (z7) {
                            fetVar.l(pcyVar);
                        } else {
                            fetVar.r0();
                        }
                        shd shdVar = gqw0.x;
                        mm40 mm40Var5 = mm40Var4;
                        jpm0.o(fetVar, tj30VarC, shdVar);
                        shd shdVar2 = gqw0.w;
                        jpm0.o(fetVar, bh90VarM, shdVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        shd shdVar3 = gqw0.y;
                        jpm0.o(fetVar, numValueOf, shdVar3);
                        jpm0.n(fetVar);
                        shd shdVar4 = gqw0.v;
                        jpm0.o(fetVar, mm40VarC0, shdVar4);
                        if (function4 == null || function5 != null) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if ((i15 & 112) == 32) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        boolean z21 = z9;
                        if ((i15 & 57344) == 16384) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        boolean z22 = z21 | z10;
                        if ((i15 & 458752) == 131072) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        z12 = z22 | z11;
                        objP3 = fetVar.P();
                        if (z12 || objP3 == cl5Var) {
                            objP3 = new g8l(rqmVar2, function4, function5, (byte) 6);
                            fetVar.o0(objP3);
                        }
                        function14 = function4;
                        Function0 function16 = function5;
                        mm40 mm40VarL = s5x0.L(y860.W(jm40Var, null, null, z8, null, (Function0) objP3, 24), 4.0f, 0.0f, 2);
                        zx7 zx7Var = gqw0.e;
                        jr8Var = jr8.f16991a;
                        mm40 mm40VarE1 = o2e.e0(jr8Var.b(mm40VarL, zx7Var), "SETTING_CELL_ROW");
                        thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                        int iHashCode2 = Long.hashCode(fetVar.T);
                        bh90 bh90VarM2 = fetVar.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE1);
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(pcyVar);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, thg0VarA, shdVar);
                        jpm0.o(fetVar, bh90VarM2, shdVar2);
                        vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                        jpm0.o(fetVar, mm40VarC1, shdVar4);
                        if (pui0Var != null) {
                            fetVar.e0(-1508458548);
                            zD2 = fetVar.d(fFloatValue);
                            objP7 = fetVar.P();
                            if (zD2 || objP7 == cl5Var) {
                                objP7 = new f54(fFloatValue, (byte) 17);
                                fetVar.o0(objP7);
                            }
                            mm40VarN = s5x0.N(i4w0.T(jm40Var, (Function1) objP7), 8.0f, 0.0f, 0.0f, 0.0f, 14);
                            pui0Var2 = pui0Var;
                            if (pui0Var2 instanceof oui0) {
                                fetVar.e0(-271930382);
                                z18 = false;
                                vbw0.u(mm40VarN, (oui0) pui0Var2, fetVar, 0);
                                fetVar.r(false);
                            } else {
                                z18 = false;
                                if (pui0Var2 instanceof nui0) {
                                    throw b1j.f(-147321061, fetVar, false);
                                }
                                fetVar.e0(-271563900);
                                vbw0.f(mm40VarN, (nui0) pui0Var2, jY, fetVar, 0);
                                fetVar.r(false);
                            }
                            fetVar.r(z18);
                        } else {
                            pui0Var2 = pui0Var;
                            fetVar.e0(-1508140023);
                            fetVar.r(false);
                        }
                        float f5 = pvi0Var == null ? 12.0f : 16.0f;
                        zD = fetVar.d(fFloatValue);
                        objP4 = fetVar.P();
                        if (zD || objP4 == cl5Var) {
                            objP4 = new f54(fFloatValue, (byte) 18);
                            fetVar.o0(objP4);
                        }
                        k7x.s(dw9.h(1.0f, o2e.e0(s5x0.N(i4w0.T(jm40Var, (Function1) objP4), 0.0f, 0.0f, f5, 0.0f, 11), "SETTING_CELL_MIDDLE"), true), vui0Var, zBooleanValue, fetVar, 0);
                        if (pvi0Var != null) {
                            fetVar.e0(-1507519434);
                            zG2 = fetVar.g(pvi0Var) | fetVar.d(fFloatValue);
                            objP6 = fetVar.P();
                            if (zG2 || objP6 == cl5Var) {
                                objP6 = new cel((Object) pvi0Var, fFloatValue, (byte) 3);
                                fetVar.o0(objP6);
                            }
                            mm40VarE0 = o2e.e0(yyw.U(i4w0.T(jm40Var, (Function1) objP6), 0.4f), "SWITCH");
                            rqmVar2 = rqmVar;
                            z16 = rqmVar2.h;
                            if (function12 == null) {
                                function15 = function14;
                            } else {
                                function15 = function12;
                            }
                            i16 = i15;
                            i17 = (i16 & 7168) | ((i16 >> 6) & 458752);
                            if (pvi0Var instanceof kvi0) {
                                fetVar.e0(-316943940);
                                z17 = false;
                                l7x.l(mm40VarE0, (kvi0) pvi0Var, fetVar, 0);
                                fetVar.r(false);
                            } else {
                                z17 = false;
                                if (pvi0Var instanceof jvi0) {
                                    fetVar.e0(-316758653);
                                    l7x.m(mm40VarE0, (jvi0) pvi0Var, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof fvi0) {
                                    fetVar.e0(-316578047);
                                    l7x.f(mm40VarE0, (fvi0) pvi0Var, fetVar, 0);
                                    fetVar.r(false);
                                } else {
                                    if (pvi0Var instanceof mvi0) {
                                        fetVar.e0(-316391427);
                                        l7x.r(mm40VarE0, (mvi0) pvi0Var, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof ovi0) {
                                        fetVar.e0(-316188532);
                                        jm40Var2 = jm40Var;
                                        l7x.C(mm40VarE0, (ovi0) pvi0Var, z16, gy40Var5, function15, fetVar, 65534 & i17);
                                        fetVar.r(false);
                                    } else {
                                        jm40Var2 = jm40Var;
                                        if (pvi0Var instanceof nvi0) {
                                            fetVar.e0(-315877075);
                                            l7x.v(mm40VarE0, (nvi0) pvi0Var, z16, function15, fetVar, 0);
                                            fetVar.r(false);
                                        } else if (pvi0Var instanceof lvi0) {
                                            fetVar.e0(-315606228);
                                            l7x.n(mm40VarE0, (lvi0) pvi0Var, z16, function15, fetVar, 0);
                                            fetVar.r(false);
                                        } else if (pvi0Var instanceof dvi0) {
                                            fetVar.e0(-315335443);
                                            l7x.d(mm40VarE0, (dvi0) pvi0Var, z16, function15, fetVar, 0);
                                            fetVar.r(false);
                                        } else if (pvi0Var instanceof evi0) {
                                            fetVar.e0(-315065619);
                                            l7x.e(mm40VarE0, (evi0) pvi0Var, z16, function15, fetVar, 0);
                                            fetVar.r(false);
                                        } else if (pvi0Var instanceof ivi0) {
                                            fetVar.e0(-314796229);
                                            l7x.i(mm40VarE0, (ivi0) pvi0Var, z16, function13, fetVar, (i17 >> 6) & 7168);
                                            fetVar.r(false);
                                        } else if (pvi0Var instanceof gvi0) {
                                            fetVar.e0(-314030343);
                                            l7x.g(mm40VarE0, (gvi0) pvi0Var, fetVar, 0);
                                            fetVar.r(false);
                                        } else if (pvi0Var instanceof hvi0) {
                                            fetVar.e0(-313825433);
                                            l7x.h(mm40VarE0, (hvi0) pvi0Var, z16, function15, fetVar, 0);
                                            fetVar.r(false);
                                        } else {
                                            if (pvi0Var instanceof cvi0) {
                                                throw b1j.f(128324354, fetVar, false);
                                            }
                                            fetVar.e0(-313551889);
                                            l7x.b(mm40VarE0, (cvi0) pvi0Var, z16, function15, fetVar, 0);
                                            fetVar.r(false);
                                        }
                                    }
                                    fetVar.r(z17);
                                }
                            }
                            jm40Var2 = jm40Var;
                            fetVar.r(z17);
                        } else {
                            rqmVar2 = rqmVar;
                            jm40Var2 = jm40Var;
                            i16 = i15;
                            fetVar.e0(-1506902999);
                            fetVar.r(false);
                        }
                        fetVar.r(true);
                        boolean zE = fetVar.e(wui0Var.ordinal());
                        if ((i16 & 896) == 256) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        z14 = zE | z13;
                        objP5 = fetVar.P();
                        if (z14 || objP5 == cl5Var) {
                            if (tx3.u(wui0Var, new wui0[]{wui0.c, wui0.b}) || !z19) {
                                z15 = false;
                            } else {
                                z15 = true;
                            }
                            objP5 = Boolean.valueOf(z15);
                            fetVar.o0(objP5);
                        }
                        if (((Boolean) objP5).booleanValue()) {
                            fetVar.e0(405481332);
                            mm40 mm40VarB = jr8Var.b(jm40Var2, gqw0.h);
                            zcl zclVar6 = qmk.f28987a;
                            if (pui0Var2 == null) {
                                f2 = 12.0f;
                            } else if (!(pui0Var2 instanceof nui0)) {
                                if (pui0Var2 instanceof oui0) {
                                    t9f.b();
                                    return;
                                }
                                f2 = 44.0f;
                            }
                            mbc.o(agi0.f827a, s5x0.N(mm40VarB, f2 + 4.0f, 0.0f, 0.0f, 0.0f, 14), false, fetVar, 6, 4);
                            fetVar.r(false);
                        } else {
                            fetVar.e0(405751373);
                            fetVar.r(false);
                        }
                        fetVar.r(true);
                        function8 = function14;
                        z4 = z19;
                        function9 = function16;
                        function6 = function12;
                        gy40Var3 = gy40Var5;
                        function7 = function13;
                        mm40Var3 = mm40Var5;
                    } else {
                        fetVar.X();
                        function7 = function3;
                        mm40Var3 = mm40Var2;
                        z4 = z2;
                        function8 = function4;
                        gy40Var3 = gy40Var2;
                        function9 = function5;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new le9(mm40Var3, rqmVar2, z4, gy40Var3, function8, function9, function6, function7, i, i2);
                    }
                }
                i3 |= 24576;
                function4 = function0;
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                    function5 = function1;
                } else {
                    function5 = function1;
                    if ((i & 196608) == 0) {
                        if (fetVar.i(function5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    function6 = function2;
                } else {
                    function6 = function2;
                    if ((i & 1572864) == 0) {
                        if (fetVar.i(function6)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (fetVar.i(function3)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar.U(i3 & 1, z3)) {
                    jm40Var = jm40.b;
                    if (i18 != 0) {
                        mm40Var4 = jm40Var;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i19 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i4 != 0) {
                        gy40Var4 = null;
                    } else {
                        gy40Var4 = gy40Var2;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    }
                    if (i10 != 0) {
                        function10 = null;
                    } else {
                        function10 = function6;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    d4d d4dVar2 = rqmVar2.e;
                    z6 = rqmVar2.h;
                    i14 = i3;
                    jY = ibc.Y(d4dVar2, fetVar);
                    t89Var = rqmVar2.i;
                    pvi0Var = rqmVar2.c;
                    pui0Var = rqmVar2.b;
                    boolean z110 = z5;
                    vui0Var = rqmVar2.f30938a;
                    function12 = function10;
                    wui0Var = rqmVar2.g;
                    tvi0Var = rqmVar2.f;
                    zG = fetVar.g(pvi0Var);
                    gy40Var5 = gy40Var4;
                    objP = fetVar.P();
                    function13 = function11;
                    cl5 cl5Var2 = ukd.f35823a;
                    if (zG) {
                        if (pvi0Var instanceof nvi0) {
                            nvi0Var = (nvi0) pvi0Var;
                        } else {
                            nvi0Var = null;
                        }
                        if (nvi0Var != null) {
                            i15 = i14;
                            if (nvi0Var.f24188a) {
                            }
                            objP = Boolean.valueOf(z20);
                            fetVar.o0(objP);
                        } else {
                            i15 = i14;
                        }
                        objP = Boolean.valueOf(z20);
                        fetVar.o0(objP);
                    } else {
                        if (pvi0Var instanceof nvi0) {
                            nvi0Var = (nvi0) pvi0Var;
                        } else {
                            nvi0Var = null;
                        }
                        if (nvi0Var != null) {
                            i15 = i14;
                            if (nvi0Var.f24188a) {
                            }
                            objP = Boolean.valueOf(z20);
                            fetVar.o0(objP);
                        } else {
                            i15 = i14;
                        }
                        objP = Boolean.valueOf(z20);
                        fetVar.o0(objP);
                    }
                    boolean zBooleanValue2 = ((Boolean) objP).booleanValue();
                    zH = fetVar.h(z6);
                    objP2 = fetVar.P();
                    if (zH) {
                        if (z6) {
                            f = 1.0f;
                        } else {
                            f = 0.5f;
                        }
                        objP2 = Float.valueOf(f);
                        fetVar.o0(objP2);
                    } else {
                        if (z6) {
                            f = 1.0f;
                        } else {
                            f = 0.5f;
                        }
                        objP2 = Float.valueOf(f);
                        fetVar.o0(objP2);
                    }
                    fFloatValue = ((Number) objP2).floatValue();
                    f2 = 60.0f;
                    if (vui0Var != null) {
                        zcl zclVar7 = qmk.f28987a;
                        f3 = 60.0f;
                    } else if (!(vui0Var instanceof tui0)) {
                        if (vui0Var instanceof sui0) {
                            zcl zclVar8 = qmk.f28987a;
                        } else {
                            zcl zclVar9 = qmk.f28987a;
                        }
                        f3 = 60.0f;
                    } else if (pui0Var instanceof nui0) {
                        zcl zclVar10 = qmk.f28987a;
                        f3 = 60.0f;
                    } else {
                        zcl zclVar11 = qmk.f28987a;
                        f3 = 48.0f;
                    }
                    float fMax2 = Math.max(f3, rqmVar2.d);
                    if (t89Var == null) {
                        skk0Var = new skk0(jY);
                    } else {
                        skk0Var = t89Var;
                    }
                    mm40 mm40VarD2 = o7k0.d(o7k0.g(mm40Var4, fMax2, 0.0f, 2), 1.0f);
                    if (Intrinsics.d(tvi0Var, qvi0.f29388a)) {
                        f4 = 16.0f;
                    } else if (Intrinsics.d(tvi0Var, rvi0.f31169a)) {
                        f4 = 360.0f;
                    } else {
                        if (Intrinsics.d(tvi0Var, svi0.f32868a)) {
                            t9f.b();
                            return;
                        }
                        f4 = 8.0f;
                    }
                    iOrdinal = wui0Var.ordinal();
                    if (iOrdinal != 0) {
                        yjj0VarA = vgg0.a(f4);
                    } else if (iOrdinal != 1) {
                        yjj0VarA = vgg0.c(f4, f4, 0.0f, 0.0f, 12);
                    } else if (iOrdinal != 2) {
                        yjj0VarA = jd8.n;
                    } else {
                        if (iOrdinal == 3) {
                            t9f.b();
                            return;
                        }
                        yjj0VarA = vgg0.c(0.0f, 0.0f, f4, f4, 3);
                    }
                    mm40 mm40VarP2 = i120.P(lgb.J(mm40VarD2, yjj0VarA), skk0Var, null, 6);
                    tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                    int iHashCode3 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM3 = fetVar.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarP2);
                    mkd.c0.getClass();
                    fetVar.i0();
                    z7 = fetVar.S;
                    pcyVar = e7z.u1;
                    if (z7) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar5 = gqw0.x;
                    mm40 mm40Var6 = mm40Var4;
                    jpm0.o(fetVar, tj30VarC2, shdVar5);
                    shd shdVar6 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM3, shdVar6);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    shd shdVar7 = gqw0.y;
                    jpm0.o(fetVar, numValueOf2, shdVar7);
                    jpm0.n(fetVar);
                    shd shdVar8 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC2, shdVar8);
                    if (function4 == null) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if ((i15 & 112) == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z23 = z9;
                    if ((i15 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z24 = z23 | z10;
                    if ((i15 & 458752) == 131072) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z24 | z11;
                    objP3 = fetVar.P();
                    if (z12) {
                        objP3 = new g8l(rqmVar2, function4, function5, (byte) 6);
                        fetVar.o0(objP3);
                    } else {
                        objP3 = new g8l(rqmVar2, function4, function5, (byte) 6);
                        fetVar.o0(objP3);
                    }
                    function14 = function4;
                    Function0 function17 = function5;
                    mm40 mm40VarL2 = s5x0.L(y860.W(jm40Var, null, null, z8, null, (Function0) objP3, 24), 4.0f, 0.0f, 2);
                    zx7 zx7Var2 = gqw0.e;
                    jr8Var = jr8.f16991a;
                    mm40 mm40VarE2 = o2e.e0(jr8Var.b(mm40VarL2, zx7Var2), "SETTING_CELL_ROW");
                    thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                    int iHashCode4 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM4 = fetVar.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarE2);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA2, shdVar5);
                    jpm0.o(fetVar, bh90VarM4, shdVar6);
                    vqd.u(iHashCode4, fetVar, shdVar7, fetVar);
                    jpm0.o(fetVar, mm40VarC3, shdVar8);
                    if (pui0Var != null) {
                        fetVar.e0(-1508458548);
                        zD2 = fetVar.d(fFloatValue);
                        objP7 = fetVar.P();
                        if (zD2) {
                            objP7 = new f54(fFloatValue, (byte) 17);
                            fetVar.o0(objP7);
                        } else {
                            objP7 = new f54(fFloatValue, (byte) 17);
                            fetVar.o0(objP7);
                        }
                        mm40VarN = s5x0.N(i4w0.T(jm40Var, (Function1) objP7), 8.0f, 0.0f, 0.0f, 0.0f, 14);
                        pui0Var2 = pui0Var;
                        if (pui0Var2 instanceof oui0) {
                            fetVar.e0(-271930382);
                            z18 = false;
                            vbw0.u(mm40VarN, (oui0) pui0Var2, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            z18 = false;
                            if (pui0Var2 instanceof nui0) {
                                throw b1j.f(-147321061, fetVar, false);
                            }
                            fetVar.e0(-271563900);
                            vbw0.f(mm40VarN, (nui0) pui0Var2, jY, fetVar, 0);
                            fetVar.r(false);
                        }
                        fetVar.r(z18);
                    } else {
                        pui0Var2 = pui0Var;
                        fetVar.e0(-1508140023);
                        fetVar.r(false);
                    }
                    if (pvi0Var == null) {
                    }
                    zD = fetVar.d(fFloatValue);
                    objP4 = fetVar.P();
                    if (zD) {
                        objP4 = new f54(fFloatValue, (byte) 18);
                        fetVar.o0(objP4);
                    } else {
                        objP4 = new f54(fFloatValue, (byte) 18);
                        fetVar.o0(objP4);
                    }
                    k7x.s(dw9.h(1.0f, o2e.e0(s5x0.N(i4w0.T(jm40Var, (Function1) objP4), 0.0f, 0.0f, f5, 0.0f, 11), "SETTING_CELL_MIDDLE"), true), vui0Var, zBooleanValue2, fetVar, 0);
                    if (pvi0Var != null) {
                        fetVar.e0(-1507519434);
                        zG2 = fetVar.g(pvi0Var) | fetVar.d(fFloatValue);
                        objP6 = fetVar.P();
                        if (zG2) {
                            objP6 = new cel((Object) pvi0Var, fFloatValue, (byte) 3);
                            fetVar.o0(objP6);
                        } else {
                            objP6 = new cel((Object) pvi0Var, fFloatValue, (byte) 3);
                            fetVar.o0(objP6);
                        }
                        mm40VarE0 = o2e.e0(yyw.U(i4w0.T(jm40Var, (Function1) objP6), 0.4f), "SWITCH");
                        rqmVar2 = rqmVar;
                        z16 = rqmVar2.h;
                        if (function12 == null) {
                            function15 = function14;
                        } else {
                            function15 = function12;
                        }
                        i16 = i15;
                        i17 = (i16 & 7168) | ((i16 >> 6) & 458752);
                        if (pvi0Var instanceof kvi0) {
                            fetVar.e0(-316943940);
                            z17 = false;
                            l7x.l(mm40VarE0, (kvi0) pvi0Var, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            z17 = false;
                            if (pvi0Var instanceof jvi0) {
                                fetVar.e0(-316758653);
                                l7x.m(mm40VarE0, (jvi0) pvi0Var, fetVar, 0);
                                fetVar.r(false);
                            } else if (pvi0Var instanceof fvi0) {
                                fetVar.e0(-316578047);
                                l7x.f(mm40VarE0, (fvi0) pvi0Var, fetVar, 0);
                                fetVar.r(false);
                            } else {
                                if (pvi0Var instanceof mvi0) {
                                    fetVar.e0(-316391427);
                                    l7x.r(mm40VarE0, (mvi0) pvi0Var, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof ovi0) {
                                    fetVar.e0(-316188532);
                                    jm40Var2 = jm40Var;
                                    l7x.C(mm40VarE0, (ovi0) pvi0Var, z16, gy40Var5, function15, fetVar, 65534 & i17);
                                    fetVar.r(false);
                                } else {
                                    jm40Var2 = jm40Var;
                                    if (pvi0Var instanceof nvi0) {
                                        fetVar.e0(-315877075);
                                        l7x.v(mm40VarE0, (nvi0) pvi0Var, z16, function15, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof lvi0) {
                                        fetVar.e0(-315606228);
                                        l7x.n(mm40VarE0, (lvi0) pvi0Var, z16, function15, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof dvi0) {
                                        fetVar.e0(-315335443);
                                        l7x.d(mm40VarE0, (dvi0) pvi0Var, z16, function15, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof evi0) {
                                        fetVar.e0(-315065619);
                                        l7x.e(mm40VarE0, (evi0) pvi0Var, z16, function15, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof ivi0) {
                                        fetVar.e0(-314796229);
                                        l7x.i(mm40VarE0, (ivi0) pvi0Var, z16, function13, fetVar, (i17 >> 6) & 7168);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof gvi0) {
                                        fetVar.e0(-314030343);
                                        l7x.g(mm40VarE0, (gvi0) pvi0Var, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof hvi0) {
                                        fetVar.e0(-313825433);
                                        l7x.h(mm40VarE0, (hvi0) pvi0Var, z16, function15, fetVar, 0);
                                        fetVar.r(false);
                                    } else {
                                        if (pvi0Var instanceof cvi0) {
                                            throw b1j.f(128324354, fetVar, false);
                                        }
                                        fetVar.e0(-313551889);
                                        l7x.b(mm40VarE0, (cvi0) pvi0Var, z16, function15, fetVar, 0);
                                        fetVar.r(false);
                                    }
                                }
                                fetVar.r(z17);
                            }
                        }
                        jm40Var2 = jm40Var;
                        fetVar.r(z17);
                    } else {
                        rqmVar2 = rqmVar;
                        jm40Var2 = jm40Var;
                        i16 = i15;
                        fetVar.e0(-1506902999);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                    boolean zE2 = fetVar.e(wui0Var.ordinal());
                    if ((i16 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zE2 | z13;
                    objP5 = fetVar.P();
                    if (z14) {
                        if (tx3.u(wui0Var, new wui0[]{wui0.c, wui0.b})) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        objP5 = Boolean.valueOf(z15);
                        fetVar.o0(objP5);
                    } else {
                        if (tx3.u(wui0Var, new wui0[]{wui0.c, wui0.b})) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        objP5 = Boolean.valueOf(z15);
                        fetVar.o0(objP5);
                    }
                    if (((Boolean) objP5).booleanValue()) {
                        fetVar.e0(405481332);
                        mm40 mm40VarB2 = jr8Var.b(jm40Var2, gqw0.h);
                        zcl zclVar12 = qmk.f28987a;
                        if (pui0Var2 == null) {
                            f2 = 12.0f;
                        } else if (!(pui0Var2 instanceof nui0)) {
                            if (pui0Var2 instanceof oui0) {
                                t9f.b();
                                return;
                            }
                            f2 = 44.0f;
                        }
                        mbc.o(agi0.f827a, s5x0.N(mm40VarB2, f2 + 4.0f, 0.0f, 0.0f, 0.0f, 14), false, fetVar, 6, 4);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(405751373);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                    function8 = function14;
                    z4 = z110;
                    function9 = function17;
                    function6 = function12;
                    gy40Var3 = gy40Var5;
                    function7 = function13;
                    mm40Var3 = mm40Var6;
                } else {
                    fetVar.X();
                    function7 = function3;
                    mm40Var3 = mm40Var2;
                    z4 = z2;
                    function8 = function4;
                    gy40Var3 = gy40Var2;
                    function9 = function5;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new le9(mm40Var3, rqmVar2, z4, gy40Var3, function8, function9, function6, function7, i, i2);
                }
            }
            i3 |= 3072;
            gy40Var2 = gy40Var;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function4 = function0;
                    if (fetVar.i(function4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                    function5 = function1;
                } else {
                    function5 = function1;
                    if ((i & 196608) == 0) {
                        if (fetVar.i(function5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    function6 = function2;
                } else {
                    function6 = function2;
                    if ((i & 1572864) == 0) {
                        if (fetVar.i(function6)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (fetVar.i(function3)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar.U(i3 & 1, z3)) {
                    jm40Var = jm40.b;
                    if (i18 != 0) {
                        mm40Var4 = jm40Var;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i19 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i4 != 0) {
                        gy40Var4 = null;
                    } else {
                        gy40Var4 = gy40Var2;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    }
                    if (i10 != 0) {
                        function10 = null;
                    } else {
                        function10 = function6;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    d4d d4dVar3 = rqmVar2.e;
                    z6 = rqmVar2.h;
                    i14 = i3;
                    jY = ibc.Y(d4dVar3, fetVar);
                    t89Var = rqmVar2.i;
                    pvi0Var = rqmVar2.c;
                    pui0Var = rqmVar2.b;
                    boolean z111 = z5;
                    vui0Var = rqmVar2.f30938a;
                    function12 = function10;
                    wui0Var = rqmVar2.g;
                    tvi0Var = rqmVar2.f;
                    zG = fetVar.g(pvi0Var);
                    gy40Var5 = gy40Var4;
                    objP = fetVar.P();
                    function13 = function11;
                    cl5 cl5Var3 = ukd.f35823a;
                    if (zG) {
                        if (pvi0Var instanceof nvi0) {
                            nvi0Var = (nvi0) pvi0Var;
                        } else {
                            nvi0Var = null;
                        }
                        if (nvi0Var != null) {
                            i15 = i14;
                            if (nvi0Var.f24188a) {
                            }
                            objP = Boolean.valueOf(z20);
                            fetVar.o0(objP);
                        } else {
                            i15 = i14;
                        }
                        objP = Boolean.valueOf(z20);
                        fetVar.o0(objP);
                    } else {
                        if (pvi0Var instanceof nvi0) {
                            nvi0Var = (nvi0) pvi0Var;
                        } else {
                            nvi0Var = null;
                        }
                        if (nvi0Var != null) {
                            i15 = i14;
                            if (nvi0Var.f24188a) {
                            }
                            objP = Boolean.valueOf(z20);
                            fetVar.o0(objP);
                        } else {
                            i15 = i14;
                        }
                        objP = Boolean.valueOf(z20);
                        fetVar.o0(objP);
                    }
                    boolean zBooleanValue3 = ((Boolean) objP).booleanValue();
                    zH = fetVar.h(z6);
                    objP2 = fetVar.P();
                    if (zH) {
                        if (z6) {
                            f = 1.0f;
                        } else {
                            f = 0.5f;
                        }
                        objP2 = Float.valueOf(f);
                        fetVar.o0(objP2);
                    } else {
                        if (z6) {
                            f = 1.0f;
                        } else {
                            f = 0.5f;
                        }
                        objP2 = Float.valueOf(f);
                        fetVar.o0(objP2);
                    }
                    fFloatValue = ((Number) objP2).floatValue();
                    f2 = 60.0f;
                    if (vui0Var != null) {
                        zcl zclVar13 = qmk.f28987a;
                        f3 = 60.0f;
                    } else if (!(vui0Var instanceof tui0)) {
                        if (vui0Var instanceof sui0) {
                            zcl zclVar14 = qmk.f28987a;
                        } else {
                            zcl zclVar15 = qmk.f28987a;
                        }
                        f3 = 60.0f;
                    } else if (pui0Var instanceof nui0) {
                        zcl zclVar16 = qmk.f28987a;
                        f3 = 60.0f;
                    } else {
                        zcl zclVar17 = qmk.f28987a;
                        f3 = 48.0f;
                    }
                    float fMax3 = Math.max(f3, rqmVar2.d);
                    if (t89Var == null) {
                        skk0Var = new skk0(jY);
                    } else {
                        skk0Var = t89Var;
                    }
                    mm40 mm40VarD3 = o7k0.d(o7k0.g(mm40Var4, fMax3, 0.0f, 2), 1.0f);
                    if (Intrinsics.d(tvi0Var, qvi0.f29388a)) {
                        f4 = 16.0f;
                    } else if (Intrinsics.d(tvi0Var, rvi0.f31169a)) {
                        f4 = 360.0f;
                    } else {
                        if (Intrinsics.d(tvi0Var, svi0.f32868a)) {
                            t9f.b();
                            return;
                        }
                        f4 = 8.0f;
                    }
                    iOrdinal = wui0Var.ordinal();
                    if (iOrdinal != 0) {
                        yjj0VarA = vgg0.a(f4);
                    } else if (iOrdinal != 1) {
                        yjj0VarA = vgg0.c(f4, f4, 0.0f, 0.0f, 12);
                    } else if (iOrdinal != 2) {
                        yjj0VarA = jd8.n;
                    } else {
                        if (iOrdinal == 3) {
                            t9f.b();
                            return;
                        }
                        yjj0VarA = vgg0.c(0.0f, 0.0f, f4, f4, 3);
                    }
                    mm40 mm40VarP3 = i120.P(lgb.J(mm40VarD3, yjj0VarA), skk0Var, null, 6);
                    tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
                    int iHashCode5 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM5 = fetVar.m();
                    mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarP3);
                    mkd.c0.getClass();
                    fetVar.i0();
                    z7 = fetVar.S;
                    pcyVar = e7z.u1;
                    if (z7) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar9 = gqw0.x;
                    mm40 mm40Var7 = mm40Var4;
                    jpm0.o(fetVar, tj30VarC3, shdVar9);
                    shd shdVar10 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM5, shdVar10);
                    Integer numValueOf3 = Integer.valueOf(iHashCode5);
                    shd shdVar11 = gqw0.y;
                    jpm0.o(fetVar, numValueOf3, shdVar11);
                    jpm0.n(fetVar);
                    shd shdVar12 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC4, shdVar12);
                    if (function4 == null) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if ((i15 & 112) == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z25 = z9;
                    if ((i15 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z26 = z25 | z10;
                    if ((i15 & 458752) == 131072) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z26 | z11;
                    objP3 = fetVar.P();
                    if (z12) {
                        objP3 = new g8l(rqmVar2, function4, function5, (byte) 6);
                        fetVar.o0(objP3);
                    } else {
                        objP3 = new g8l(rqmVar2, function4, function5, (byte) 6);
                        fetVar.o0(objP3);
                    }
                    function14 = function4;
                    Function0 function18 = function5;
                    mm40 mm40VarL3 = s5x0.L(y860.W(jm40Var, null, null, z8, null, (Function0) objP3, 24), 4.0f, 0.0f, 2);
                    zx7 zx7Var3 = gqw0.e;
                    jr8Var = jr8.f16991a;
                    mm40 mm40VarE3 = o2e.e0(jr8Var.b(mm40VarL3, zx7Var3), "SETTING_CELL_ROW");
                    thg0 thg0VarA3 = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                    int iHashCode6 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM6 = fetVar.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar, mm40VarE3);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA3, shdVar9);
                    jpm0.o(fetVar, bh90VarM6, shdVar10);
                    vqd.u(iHashCode6, fetVar, shdVar11, fetVar);
                    jpm0.o(fetVar, mm40VarC5, shdVar12);
                    if (pui0Var != null) {
                        fetVar.e0(-1508458548);
                        zD2 = fetVar.d(fFloatValue);
                        objP7 = fetVar.P();
                        if (zD2) {
                            objP7 = new f54(fFloatValue, (byte) 17);
                            fetVar.o0(objP7);
                        } else {
                            objP7 = new f54(fFloatValue, (byte) 17);
                            fetVar.o0(objP7);
                        }
                        mm40VarN = s5x0.N(i4w0.T(jm40Var, (Function1) objP7), 8.0f, 0.0f, 0.0f, 0.0f, 14);
                        pui0Var2 = pui0Var;
                        if (pui0Var2 instanceof oui0) {
                            fetVar.e0(-271930382);
                            z18 = false;
                            vbw0.u(mm40VarN, (oui0) pui0Var2, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            z18 = false;
                            if (pui0Var2 instanceof nui0) {
                                throw b1j.f(-147321061, fetVar, false);
                            }
                            fetVar.e0(-271563900);
                            vbw0.f(mm40VarN, (nui0) pui0Var2, jY, fetVar, 0);
                            fetVar.r(false);
                        }
                        fetVar.r(z18);
                    } else {
                        pui0Var2 = pui0Var;
                        fetVar.e0(-1508140023);
                        fetVar.r(false);
                    }
                    if (pvi0Var == null) {
                    }
                    zD = fetVar.d(fFloatValue);
                    objP4 = fetVar.P();
                    if (zD) {
                        objP4 = new f54(fFloatValue, (byte) 18);
                        fetVar.o0(objP4);
                    } else {
                        objP4 = new f54(fFloatValue, (byte) 18);
                        fetVar.o0(objP4);
                    }
                    k7x.s(dw9.h(1.0f, o2e.e0(s5x0.N(i4w0.T(jm40Var, (Function1) objP4), 0.0f, 0.0f, f5, 0.0f, 11), "SETTING_CELL_MIDDLE"), true), vui0Var, zBooleanValue3, fetVar, 0);
                    if (pvi0Var != null) {
                        fetVar.e0(-1507519434);
                        zG2 = fetVar.g(pvi0Var) | fetVar.d(fFloatValue);
                        objP6 = fetVar.P();
                        if (zG2) {
                            objP6 = new cel((Object) pvi0Var, fFloatValue, (byte) 3);
                            fetVar.o0(objP6);
                        } else {
                            objP6 = new cel((Object) pvi0Var, fFloatValue, (byte) 3);
                            fetVar.o0(objP6);
                        }
                        mm40VarE0 = o2e.e0(yyw.U(i4w0.T(jm40Var, (Function1) objP6), 0.4f), "SWITCH");
                        rqmVar2 = rqmVar;
                        z16 = rqmVar2.h;
                        if (function12 == null) {
                            function15 = function14;
                        } else {
                            function15 = function12;
                        }
                        i16 = i15;
                        i17 = (i16 & 7168) | ((i16 >> 6) & 458752);
                        if (pvi0Var instanceof kvi0) {
                            fetVar.e0(-316943940);
                            z17 = false;
                            l7x.l(mm40VarE0, (kvi0) pvi0Var, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            z17 = false;
                            if (pvi0Var instanceof jvi0) {
                                fetVar.e0(-316758653);
                                l7x.m(mm40VarE0, (jvi0) pvi0Var, fetVar, 0);
                                fetVar.r(false);
                            } else if (pvi0Var instanceof fvi0) {
                                fetVar.e0(-316578047);
                                l7x.f(mm40VarE0, (fvi0) pvi0Var, fetVar, 0);
                                fetVar.r(false);
                            } else {
                                if (pvi0Var instanceof mvi0) {
                                    fetVar.e0(-316391427);
                                    l7x.r(mm40VarE0, (mvi0) pvi0Var, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof ovi0) {
                                    fetVar.e0(-316188532);
                                    jm40Var2 = jm40Var;
                                    l7x.C(mm40VarE0, (ovi0) pvi0Var, z16, gy40Var5, function15, fetVar, 65534 & i17);
                                    fetVar.r(false);
                                } else {
                                    jm40Var2 = jm40Var;
                                    if (pvi0Var instanceof nvi0) {
                                        fetVar.e0(-315877075);
                                        l7x.v(mm40VarE0, (nvi0) pvi0Var, z16, function15, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof lvi0) {
                                        fetVar.e0(-315606228);
                                        l7x.n(mm40VarE0, (lvi0) pvi0Var, z16, function15, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof dvi0) {
                                        fetVar.e0(-315335443);
                                        l7x.d(mm40VarE0, (dvi0) pvi0Var, z16, function15, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof evi0) {
                                        fetVar.e0(-315065619);
                                        l7x.e(mm40VarE0, (evi0) pvi0Var, z16, function15, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof ivi0) {
                                        fetVar.e0(-314796229);
                                        l7x.i(mm40VarE0, (ivi0) pvi0Var, z16, function13, fetVar, (i17 >> 6) & 7168);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof gvi0) {
                                        fetVar.e0(-314030343);
                                        l7x.g(mm40VarE0, (gvi0) pvi0Var, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof hvi0) {
                                        fetVar.e0(-313825433);
                                        l7x.h(mm40VarE0, (hvi0) pvi0Var, z16, function15, fetVar, 0);
                                        fetVar.r(false);
                                    } else {
                                        if (pvi0Var instanceof cvi0) {
                                            throw b1j.f(128324354, fetVar, false);
                                        }
                                        fetVar.e0(-313551889);
                                        l7x.b(mm40VarE0, (cvi0) pvi0Var, z16, function15, fetVar, 0);
                                        fetVar.r(false);
                                    }
                                }
                                fetVar.r(z17);
                            }
                        }
                        jm40Var2 = jm40Var;
                        fetVar.r(z17);
                    } else {
                        rqmVar2 = rqmVar;
                        jm40Var2 = jm40Var;
                        i16 = i15;
                        fetVar.e0(-1506902999);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                    boolean zE3 = fetVar.e(wui0Var.ordinal());
                    if ((i16 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zE3 | z13;
                    objP5 = fetVar.P();
                    if (z14) {
                        if (tx3.u(wui0Var, new wui0[]{wui0.c, wui0.b})) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        objP5 = Boolean.valueOf(z15);
                        fetVar.o0(objP5);
                    } else {
                        if (tx3.u(wui0Var, new wui0[]{wui0.c, wui0.b})) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        objP5 = Boolean.valueOf(z15);
                        fetVar.o0(objP5);
                    }
                    if (((Boolean) objP5).booleanValue()) {
                        fetVar.e0(405481332);
                        mm40 mm40VarB3 = jr8Var.b(jm40Var2, gqw0.h);
                        zcl zclVar18 = qmk.f28987a;
                        if (pui0Var2 == null) {
                            f2 = 12.0f;
                        } else if (!(pui0Var2 instanceof nui0)) {
                            if (pui0Var2 instanceof oui0) {
                                t9f.b();
                                return;
                            }
                            f2 = 44.0f;
                        }
                        mbc.o(agi0.f827a, s5x0.N(mm40VarB3, f2 + 4.0f, 0.0f, 0.0f, 0.0f, 14), false, fetVar, 6, 4);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(405751373);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                    function8 = function14;
                    z4 = z111;
                    function9 = function18;
                    function6 = function12;
                    gy40Var3 = gy40Var5;
                    function7 = function13;
                    mm40Var3 = mm40Var7;
                } else {
                    fetVar.X();
                    function7 = function3;
                    mm40Var3 = mm40Var2;
                    z4 = z2;
                    function8 = function4;
                    gy40Var3 = gy40Var2;
                    function9 = function5;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new le9(mm40Var3, rqmVar2, z4, gy40Var3, function8, function9, function6, function7, i, i2);
                }
            }
            i3 |= 24576;
            function4 = function0;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
                function5 = function1;
            } else {
                function5 = function1;
                if ((i & 196608) == 0) {
                    if (fetVar.i(function5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                function6 = function2;
            } else {
                function6 = function2;
                if ((i & 1572864) == 0) {
                    if (fetVar.i(function6)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (fetVar.i(function3)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i3 & 1, z3)) {
                jm40Var = jm40.b;
                if (i18 != 0) {
                    mm40Var4 = jm40Var;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i19 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i4 != 0) {
                    gy40Var4 = null;
                } else {
                    gy40Var4 = gy40Var2;
                }
                if (i6 != 0) {
                    function4 = null;
                }
                if (i8 != 0) {
                    function5 = null;
                }
                if (i10 != 0) {
                    function10 = null;
                } else {
                    function10 = function6;
                }
                if (i12 != 0) {
                    function11 = null;
                } else {
                    function11 = function3;
                }
                d4d d4dVar4 = rqmVar2.e;
                z6 = rqmVar2.h;
                i14 = i3;
                jY = ibc.Y(d4dVar4, fetVar);
                t89Var = rqmVar2.i;
                pvi0Var = rqmVar2.c;
                pui0Var = rqmVar2.b;
                boolean z112 = z5;
                vui0Var = rqmVar2.f30938a;
                function12 = function10;
                wui0Var = rqmVar2.g;
                tvi0Var = rqmVar2.f;
                zG = fetVar.g(pvi0Var);
                gy40Var5 = gy40Var4;
                objP = fetVar.P();
                function13 = function11;
                cl5 cl5Var4 = ukd.f35823a;
                if (zG) {
                    if (pvi0Var instanceof nvi0) {
                        nvi0Var = (nvi0) pvi0Var;
                    } else {
                        nvi0Var = null;
                    }
                    if (nvi0Var != null) {
                        i15 = i14;
                        if (nvi0Var.f24188a) {
                        }
                        objP = Boolean.valueOf(z20);
                        fetVar.o0(objP);
                    } else {
                        i15 = i14;
                    }
                    objP = Boolean.valueOf(z20);
                    fetVar.o0(objP);
                } else {
                    if (pvi0Var instanceof nvi0) {
                        nvi0Var = (nvi0) pvi0Var;
                    } else {
                        nvi0Var = null;
                    }
                    if (nvi0Var != null) {
                        i15 = i14;
                        if (nvi0Var.f24188a) {
                        }
                        objP = Boolean.valueOf(z20);
                        fetVar.o0(objP);
                    } else {
                        i15 = i14;
                    }
                    objP = Boolean.valueOf(z20);
                    fetVar.o0(objP);
                }
                boolean zBooleanValue4 = ((Boolean) objP).booleanValue();
                zH = fetVar.h(z6);
                objP2 = fetVar.P();
                if (zH) {
                    if (z6) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    objP2 = Float.valueOf(f);
                    fetVar.o0(objP2);
                } else {
                    if (z6) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    objP2 = Float.valueOf(f);
                    fetVar.o0(objP2);
                }
                fFloatValue = ((Number) objP2).floatValue();
                f2 = 60.0f;
                if (vui0Var != null) {
                    zcl zclVar19 = qmk.f28987a;
                    f3 = 60.0f;
                } else if (!(vui0Var instanceof tui0)) {
                    if (vui0Var instanceof sui0) {
                        zcl zclVar110 = qmk.f28987a;
                    } else {
                        zcl zclVar111 = qmk.f28987a;
                    }
                    f3 = 60.0f;
                } else if (pui0Var instanceof nui0) {
                    zcl zclVar112 = qmk.f28987a;
                    f3 = 60.0f;
                } else {
                    zcl zclVar113 = qmk.f28987a;
                    f3 = 48.0f;
                }
                float fMax4 = Math.max(f3, rqmVar2.d);
                if (t89Var == null) {
                    skk0Var = new skk0(jY);
                } else {
                    skk0Var = t89Var;
                }
                mm40 mm40VarD4 = o7k0.d(o7k0.g(mm40Var4, fMax4, 0.0f, 2), 1.0f);
                if (Intrinsics.d(tvi0Var, qvi0.f29388a)) {
                    f4 = 16.0f;
                } else if (Intrinsics.d(tvi0Var, rvi0.f31169a)) {
                    f4 = 360.0f;
                } else {
                    if (Intrinsics.d(tvi0Var, svi0.f32868a)) {
                        t9f.b();
                        return;
                    }
                    f4 = 8.0f;
                }
                iOrdinal = wui0Var.ordinal();
                if (iOrdinal != 0) {
                    yjj0VarA = vgg0.a(f4);
                } else if (iOrdinal != 1) {
                    yjj0VarA = vgg0.c(f4, f4, 0.0f, 0.0f, 12);
                } else if (iOrdinal != 2) {
                    yjj0VarA = jd8.n;
                } else {
                    if (iOrdinal == 3) {
                        t9f.b();
                        return;
                    }
                    yjj0VarA = vgg0.c(0.0f, 0.0f, f4, f4, 3);
                }
                mm40 mm40VarP4 = i120.P(lgb.J(mm40VarD4, yjj0VarA), skk0Var, null, 6);
                tj30 tj30VarC4 = zq8.c(gqw0.f11754a, false);
                int iHashCode7 = Long.hashCode(fetVar.T);
                bh90 bh90VarM7 = fetVar.m();
                mm40 mm40VarC6 = kbc.c0(fetVar, mm40VarP4);
                mkd.c0.getClass();
                fetVar.i0();
                z7 = fetVar.S;
                pcyVar = e7z.u1;
                if (z7) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                shd shdVar13 = gqw0.x;
                mm40 mm40Var8 = mm40Var4;
                jpm0.o(fetVar, tj30VarC4, shdVar13);
                shd shdVar14 = gqw0.w;
                jpm0.o(fetVar, bh90VarM7, shdVar14);
                Integer numValueOf4 = Integer.valueOf(iHashCode7);
                shd shdVar15 = gqw0.y;
                jpm0.o(fetVar, numValueOf4, shdVar15);
                jpm0.n(fetVar);
                shd shdVar16 = gqw0.v;
                jpm0.o(fetVar, mm40VarC6, shdVar16);
                if (function4 == null) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                if ((i15 & 112) == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z27 = z9;
                if ((i15 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z28 = z27 | z10;
                if ((i15 & 458752) == 131072) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z28 | z11;
                objP3 = fetVar.P();
                if (z12) {
                    objP3 = new g8l(rqmVar2, function4, function5, (byte) 6);
                    fetVar.o0(objP3);
                } else {
                    objP3 = new g8l(rqmVar2, function4, function5, (byte) 6);
                    fetVar.o0(objP3);
                }
                function14 = function4;
                Function0 function19 = function5;
                mm40 mm40VarL4 = s5x0.L(y860.W(jm40Var, null, null, z8, null, (Function0) objP3, 24), 4.0f, 0.0f, 2);
                zx7 zx7Var4 = gqw0.e;
                jr8Var = jr8.f16991a;
                mm40 mm40VarE4 = o2e.e0(jr8Var.b(mm40VarL4, zx7Var4), "SETTING_CELL_ROW");
                thg0 thg0VarA4 = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                int iHashCode8 = Long.hashCode(fetVar.T);
                bh90 bh90VarM8 = fetVar.m();
                mm40 mm40VarC7 = kbc.c0(fetVar, mm40VarE4);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA4, shdVar13);
                jpm0.o(fetVar, bh90VarM8, shdVar14);
                vqd.u(iHashCode8, fetVar, shdVar15, fetVar);
                jpm0.o(fetVar, mm40VarC7, shdVar16);
                if (pui0Var != null) {
                    fetVar.e0(-1508458548);
                    zD2 = fetVar.d(fFloatValue);
                    objP7 = fetVar.P();
                    if (zD2) {
                        objP7 = new f54(fFloatValue, (byte) 17);
                        fetVar.o0(objP7);
                    } else {
                        objP7 = new f54(fFloatValue, (byte) 17);
                        fetVar.o0(objP7);
                    }
                    mm40VarN = s5x0.N(i4w0.T(jm40Var, (Function1) objP7), 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    pui0Var2 = pui0Var;
                    if (pui0Var2 instanceof oui0) {
                        fetVar.e0(-271930382);
                        z18 = false;
                        vbw0.u(mm40VarN, (oui0) pui0Var2, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        z18 = false;
                        if (pui0Var2 instanceof nui0) {
                            throw b1j.f(-147321061, fetVar, false);
                        }
                        fetVar.e0(-271563900);
                        vbw0.f(mm40VarN, (nui0) pui0Var2, jY, fetVar, 0);
                        fetVar.r(false);
                    }
                    fetVar.r(z18);
                } else {
                    pui0Var2 = pui0Var;
                    fetVar.e0(-1508140023);
                    fetVar.r(false);
                }
                if (pvi0Var == null) {
                }
                zD = fetVar.d(fFloatValue);
                objP4 = fetVar.P();
                if (zD) {
                    objP4 = new f54(fFloatValue, (byte) 18);
                    fetVar.o0(objP4);
                } else {
                    objP4 = new f54(fFloatValue, (byte) 18);
                    fetVar.o0(objP4);
                }
                k7x.s(dw9.h(1.0f, o2e.e0(s5x0.N(i4w0.T(jm40Var, (Function1) objP4), 0.0f, 0.0f, f5, 0.0f, 11), "SETTING_CELL_MIDDLE"), true), vui0Var, zBooleanValue4, fetVar, 0);
                if (pvi0Var != null) {
                    fetVar.e0(-1507519434);
                    zG2 = fetVar.g(pvi0Var) | fetVar.d(fFloatValue);
                    objP6 = fetVar.P();
                    if (zG2) {
                        objP6 = new cel((Object) pvi0Var, fFloatValue, (byte) 3);
                        fetVar.o0(objP6);
                    } else {
                        objP6 = new cel((Object) pvi0Var, fFloatValue, (byte) 3);
                        fetVar.o0(objP6);
                    }
                    mm40VarE0 = o2e.e0(yyw.U(i4w0.T(jm40Var, (Function1) objP6), 0.4f), "SWITCH");
                    rqmVar2 = rqmVar;
                    z16 = rqmVar2.h;
                    if (function12 == null) {
                        function15 = function14;
                    } else {
                        function15 = function12;
                    }
                    i16 = i15;
                    i17 = (i16 & 7168) | ((i16 >> 6) & 458752);
                    if (pvi0Var instanceof kvi0) {
                        fetVar.e0(-316943940);
                        z17 = false;
                        l7x.l(mm40VarE0, (kvi0) pvi0Var, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        z17 = false;
                        if (pvi0Var instanceof jvi0) {
                            fetVar.e0(-316758653);
                            l7x.m(mm40VarE0, (jvi0) pvi0Var, fetVar, 0);
                            fetVar.r(false);
                        } else if (pvi0Var instanceof fvi0) {
                            fetVar.e0(-316578047);
                            l7x.f(mm40VarE0, (fvi0) pvi0Var, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            if (pvi0Var instanceof mvi0) {
                                fetVar.e0(-316391427);
                                l7x.r(mm40VarE0, (mvi0) pvi0Var, fetVar, 0);
                                fetVar.r(false);
                            } else if (pvi0Var instanceof ovi0) {
                                fetVar.e0(-316188532);
                                jm40Var2 = jm40Var;
                                l7x.C(mm40VarE0, (ovi0) pvi0Var, z16, gy40Var5, function15, fetVar, 65534 & i17);
                                fetVar.r(false);
                            } else {
                                jm40Var2 = jm40Var;
                                if (pvi0Var instanceof nvi0) {
                                    fetVar.e0(-315877075);
                                    l7x.v(mm40VarE0, (nvi0) pvi0Var, z16, function15, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof lvi0) {
                                    fetVar.e0(-315606228);
                                    l7x.n(mm40VarE0, (lvi0) pvi0Var, z16, function15, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof dvi0) {
                                    fetVar.e0(-315335443);
                                    l7x.d(mm40VarE0, (dvi0) pvi0Var, z16, function15, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof evi0) {
                                    fetVar.e0(-315065619);
                                    l7x.e(mm40VarE0, (evi0) pvi0Var, z16, function15, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof ivi0) {
                                    fetVar.e0(-314796229);
                                    l7x.i(mm40VarE0, (ivi0) pvi0Var, z16, function13, fetVar, (i17 >> 6) & 7168);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof gvi0) {
                                    fetVar.e0(-314030343);
                                    l7x.g(mm40VarE0, (gvi0) pvi0Var, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof hvi0) {
                                    fetVar.e0(-313825433);
                                    l7x.h(mm40VarE0, (hvi0) pvi0Var, z16, function15, fetVar, 0);
                                    fetVar.r(false);
                                } else {
                                    if (pvi0Var instanceof cvi0) {
                                        throw b1j.f(128324354, fetVar, false);
                                    }
                                    fetVar.e0(-313551889);
                                    l7x.b(mm40VarE0, (cvi0) pvi0Var, z16, function15, fetVar, 0);
                                    fetVar.r(false);
                                }
                            }
                            fetVar.r(z17);
                        }
                    }
                    jm40Var2 = jm40Var;
                    fetVar.r(z17);
                } else {
                    rqmVar2 = rqmVar;
                    jm40Var2 = jm40Var;
                    i16 = i15;
                    fetVar.e0(-1506902999);
                    fetVar.r(false);
                }
                fetVar.r(true);
                boolean zE4 = fetVar.e(wui0Var.ordinal());
                if ((i16 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zE4 | z13;
                objP5 = fetVar.P();
                if (z14) {
                    if (tx3.u(wui0Var, new wui0[]{wui0.c, wui0.b})) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    objP5 = Boolean.valueOf(z15);
                    fetVar.o0(objP5);
                } else {
                    if (tx3.u(wui0Var, new wui0[]{wui0.c, wui0.b})) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    objP5 = Boolean.valueOf(z15);
                    fetVar.o0(objP5);
                }
                if (((Boolean) objP5).booleanValue()) {
                    fetVar.e0(405481332);
                    mm40 mm40VarB4 = jr8Var.b(jm40Var2, gqw0.h);
                    zcl zclVar114 = qmk.f28987a;
                    if (pui0Var2 == null) {
                        f2 = 12.0f;
                    } else if (!(pui0Var2 instanceof nui0)) {
                        if (pui0Var2 instanceof oui0) {
                            t9f.b();
                            return;
                        }
                        f2 = 44.0f;
                    }
                    mbc.o(agi0.f827a, s5x0.N(mm40VarB4, f2 + 4.0f, 0.0f, 0.0f, 0.0f, 14), false, fetVar, 6, 4);
                    fetVar.r(false);
                } else {
                    fetVar.e0(405751373);
                    fetVar.r(false);
                }
                fetVar.r(true);
                function8 = function14;
                z4 = z112;
                function9 = function19;
                function6 = function12;
                gy40Var3 = gy40Var5;
                function7 = function13;
                mm40Var3 = mm40Var8;
            } else {
                fetVar.X();
                function7 = function3;
                mm40Var3 = mm40Var2;
                z4 = z2;
                function8 = function4;
                gy40Var3 = gy40Var2;
                function9 = function5;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new le9(mm40Var3, rqmVar2, z4, gy40Var3, function8, function9, function6, function7, i, i2);
            }
        }
        i3 |= 384;
        z2 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                gy40Var2 = gy40Var;
                if (fetVar.g(gy40Var2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    function4 = function0;
                    if (fetVar.i(function4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    i3 |= 196608;
                    function5 = function1;
                } else {
                    function5 = function1;
                    if ((i & 196608) == 0) {
                        if (fetVar.i(function5)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                }
                i10 = i2 & 64;
                if (i10 != 0) {
                    i3 |= 1572864;
                    function6 = function2;
                } else {
                    function6 = function2;
                    if ((i & 1572864) == 0) {
                        if (fetVar.i(function6)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                }
                i12 = i2 & 128;
                if (i12 != 0) {
                    i3 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if (fetVar.i(function3)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i3 |= i13;
                }
                if ((i3 & 4793491) != 4793490) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar.U(i3 & 1, z3)) {
                    jm40Var = jm40.b;
                    if (i18 != 0) {
                        mm40Var4 = jm40Var;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if (i19 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i4 != 0) {
                        gy40Var4 = null;
                    } else {
                        gy40Var4 = gy40Var2;
                    }
                    if (i6 != 0) {
                        function4 = null;
                    }
                    if (i8 != 0) {
                        function5 = null;
                    }
                    if (i10 != 0) {
                        function10 = null;
                    } else {
                        function10 = function6;
                    }
                    if (i12 != 0) {
                        function11 = null;
                    } else {
                        function11 = function3;
                    }
                    d4d d4dVar5 = rqmVar2.e;
                    z6 = rqmVar2.h;
                    i14 = i3;
                    jY = ibc.Y(d4dVar5, fetVar);
                    t89Var = rqmVar2.i;
                    pvi0Var = rqmVar2.c;
                    pui0Var = rqmVar2.b;
                    boolean z113 = z5;
                    vui0Var = rqmVar2.f30938a;
                    function12 = function10;
                    wui0Var = rqmVar2.g;
                    tvi0Var = rqmVar2.f;
                    zG = fetVar.g(pvi0Var);
                    gy40Var5 = gy40Var4;
                    objP = fetVar.P();
                    function13 = function11;
                    cl5 cl5Var5 = ukd.f35823a;
                    if (zG) {
                        if (pvi0Var instanceof nvi0) {
                            nvi0Var = (nvi0) pvi0Var;
                        } else {
                            nvi0Var = null;
                        }
                        if (nvi0Var != null) {
                            i15 = i14;
                            if (nvi0Var.f24188a) {
                            }
                            objP = Boolean.valueOf(z20);
                            fetVar.o0(objP);
                        } else {
                            i15 = i14;
                        }
                        objP = Boolean.valueOf(z20);
                        fetVar.o0(objP);
                    } else {
                        if (pvi0Var instanceof nvi0) {
                            nvi0Var = (nvi0) pvi0Var;
                        } else {
                            nvi0Var = null;
                        }
                        if (nvi0Var != null) {
                            i15 = i14;
                            if (nvi0Var.f24188a) {
                            }
                            objP = Boolean.valueOf(z20);
                            fetVar.o0(objP);
                        } else {
                            i15 = i14;
                        }
                        objP = Boolean.valueOf(z20);
                        fetVar.o0(objP);
                    }
                    boolean zBooleanValue5 = ((Boolean) objP).booleanValue();
                    zH = fetVar.h(z6);
                    objP2 = fetVar.P();
                    if (zH) {
                        if (z6) {
                            f = 1.0f;
                        } else {
                            f = 0.5f;
                        }
                        objP2 = Float.valueOf(f);
                        fetVar.o0(objP2);
                    } else {
                        if (z6) {
                            f = 1.0f;
                        } else {
                            f = 0.5f;
                        }
                        objP2 = Float.valueOf(f);
                        fetVar.o0(objP2);
                    }
                    fFloatValue = ((Number) objP2).floatValue();
                    f2 = 60.0f;
                    if (vui0Var != null) {
                        zcl zclVar115 = qmk.f28987a;
                        f3 = 60.0f;
                    } else if (!(vui0Var instanceof tui0)) {
                        if (vui0Var instanceof sui0) {
                            zcl zclVar116 = qmk.f28987a;
                        } else {
                            zcl zclVar117 = qmk.f28987a;
                        }
                        f3 = 60.0f;
                    } else if (pui0Var instanceof nui0) {
                        zcl zclVar118 = qmk.f28987a;
                        f3 = 60.0f;
                    } else {
                        zcl zclVar119 = qmk.f28987a;
                        f3 = 48.0f;
                    }
                    float fMax5 = Math.max(f3, rqmVar2.d);
                    if (t89Var == null) {
                        skk0Var = new skk0(jY);
                    } else {
                        skk0Var = t89Var;
                    }
                    mm40 mm40VarD5 = o7k0.d(o7k0.g(mm40Var4, fMax5, 0.0f, 2), 1.0f);
                    if (Intrinsics.d(tvi0Var, qvi0.f29388a)) {
                        f4 = 16.0f;
                    } else if (Intrinsics.d(tvi0Var, rvi0.f31169a)) {
                        f4 = 360.0f;
                    } else {
                        if (Intrinsics.d(tvi0Var, svi0.f32868a)) {
                            t9f.b();
                            return;
                        }
                        f4 = 8.0f;
                    }
                    iOrdinal = wui0Var.ordinal();
                    if (iOrdinal != 0) {
                        yjj0VarA = vgg0.a(f4);
                    } else if (iOrdinal != 1) {
                        yjj0VarA = vgg0.c(f4, f4, 0.0f, 0.0f, 12);
                    } else if (iOrdinal != 2) {
                        yjj0VarA = jd8.n;
                    } else {
                        if (iOrdinal == 3) {
                            t9f.b();
                            return;
                        }
                        yjj0VarA = vgg0.c(0.0f, 0.0f, f4, f4, 3);
                    }
                    mm40 mm40VarP5 = i120.P(lgb.J(mm40VarD5, yjj0VarA), skk0Var, null, 6);
                    tj30 tj30VarC5 = zq8.c(gqw0.f11754a, false);
                    int iHashCode9 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM9 = fetVar.m();
                    mm40 mm40VarC8 = kbc.c0(fetVar, mm40VarP5);
                    mkd.c0.getClass();
                    fetVar.i0();
                    z7 = fetVar.S;
                    pcyVar = e7z.u1;
                    if (z7) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    shd shdVar17 = gqw0.x;
                    mm40 mm40Var9 = mm40Var4;
                    jpm0.o(fetVar, tj30VarC5, shdVar17);
                    shd shdVar18 = gqw0.w;
                    jpm0.o(fetVar, bh90VarM9, shdVar18);
                    Integer numValueOf5 = Integer.valueOf(iHashCode9);
                    shd shdVar19 = gqw0.y;
                    jpm0.o(fetVar, numValueOf5, shdVar19);
                    jpm0.n(fetVar);
                    shd shdVar110 = gqw0.v;
                    jpm0.o(fetVar, mm40VarC8, shdVar110);
                    if (function4 == null) {
                        z8 = true;
                    } else {
                        z8 = true;
                    }
                    if ((i15 & 112) == 32) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z29 = z9;
                    if ((i15 & 57344) == 16384) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z210 = z29 | z10;
                    if ((i15 & 458752) == 131072) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = z210 | z11;
                    objP3 = fetVar.P();
                    if (z12) {
                        objP3 = new g8l(rqmVar2, function4, function5, (byte) 6);
                        fetVar.o0(objP3);
                    } else {
                        objP3 = new g8l(rqmVar2, function4, function5, (byte) 6);
                        fetVar.o0(objP3);
                    }
                    function14 = function4;
                    Function0 function110 = function5;
                    mm40 mm40VarL5 = s5x0.L(y860.W(jm40Var, null, null, z8, null, (Function0) objP3, 24), 4.0f, 0.0f, 2);
                    zx7 zx7Var5 = gqw0.e;
                    jr8Var = jr8.f16991a;
                    mm40 mm40VarE5 = o2e.e0(jr8Var.b(mm40VarL5, zx7Var5), "SETTING_CELL_ROW");
                    thg0 thg0VarA5 = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                    int iHashCode10 = Long.hashCode(fetVar.T);
                    bh90 bh90VarM10 = fetVar.m();
                    mm40 mm40VarC9 = kbc.c0(fetVar, mm40VarE5);
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA5, shdVar17);
                    jpm0.o(fetVar, bh90VarM10, shdVar18);
                    vqd.u(iHashCode10, fetVar, shdVar19, fetVar);
                    jpm0.o(fetVar, mm40VarC9, shdVar110);
                    if (pui0Var != null) {
                        fetVar.e0(-1508458548);
                        zD2 = fetVar.d(fFloatValue);
                        objP7 = fetVar.P();
                        if (zD2) {
                            objP7 = new f54(fFloatValue, (byte) 17);
                            fetVar.o0(objP7);
                        } else {
                            objP7 = new f54(fFloatValue, (byte) 17);
                            fetVar.o0(objP7);
                        }
                        mm40VarN = s5x0.N(i4w0.T(jm40Var, (Function1) objP7), 8.0f, 0.0f, 0.0f, 0.0f, 14);
                        pui0Var2 = pui0Var;
                        if (pui0Var2 instanceof oui0) {
                            fetVar.e0(-271930382);
                            z18 = false;
                            vbw0.u(mm40VarN, (oui0) pui0Var2, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            z18 = false;
                            if (pui0Var2 instanceof nui0) {
                                throw b1j.f(-147321061, fetVar, false);
                            }
                            fetVar.e0(-271563900);
                            vbw0.f(mm40VarN, (nui0) pui0Var2, jY, fetVar, 0);
                            fetVar.r(false);
                        }
                        fetVar.r(z18);
                    } else {
                        pui0Var2 = pui0Var;
                        fetVar.e0(-1508140023);
                        fetVar.r(false);
                    }
                    if (pvi0Var == null) {
                    }
                    zD = fetVar.d(fFloatValue);
                    objP4 = fetVar.P();
                    if (zD) {
                        objP4 = new f54(fFloatValue, (byte) 18);
                        fetVar.o0(objP4);
                    } else {
                        objP4 = new f54(fFloatValue, (byte) 18);
                        fetVar.o0(objP4);
                    }
                    k7x.s(dw9.h(1.0f, o2e.e0(s5x0.N(i4w0.T(jm40Var, (Function1) objP4), 0.0f, 0.0f, f5, 0.0f, 11), "SETTING_CELL_MIDDLE"), true), vui0Var, zBooleanValue5, fetVar, 0);
                    if (pvi0Var != null) {
                        fetVar.e0(-1507519434);
                        zG2 = fetVar.g(pvi0Var) | fetVar.d(fFloatValue);
                        objP6 = fetVar.P();
                        if (zG2) {
                            objP6 = new cel((Object) pvi0Var, fFloatValue, (byte) 3);
                            fetVar.o0(objP6);
                        } else {
                            objP6 = new cel((Object) pvi0Var, fFloatValue, (byte) 3);
                            fetVar.o0(objP6);
                        }
                        mm40VarE0 = o2e.e0(yyw.U(i4w0.T(jm40Var, (Function1) objP6), 0.4f), "SWITCH");
                        rqmVar2 = rqmVar;
                        z16 = rqmVar2.h;
                        if (function12 == null) {
                            function15 = function14;
                        } else {
                            function15 = function12;
                        }
                        i16 = i15;
                        i17 = (i16 & 7168) | ((i16 >> 6) & 458752);
                        if (pvi0Var instanceof kvi0) {
                            fetVar.e0(-316943940);
                            z17 = false;
                            l7x.l(mm40VarE0, (kvi0) pvi0Var, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            z17 = false;
                            if (pvi0Var instanceof jvi0) {
                                fetVar.e0(-316758653);
                                l7x.m(mm40VarE0, (jvi0) pvi0Var, fetVar, 0);
                                fetVar.r(false);
                            } else if (pvi0Var instanceof fvi0) {
                                fetVar.e0(-316578047);
                                l7x.f(mm40VarE0, (fvi0) pvi0Var, fetVar, 0);
                                fetVar.r(false);
                            } else {
                                if (pvi0Var instanceof mvi0) {
                                    fetVar.e0(-316391427);
                                    l7x.r(mm40VarE0, (mvi0) pvi0Var, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof ovi0) {
                                    fetVar.e0(-316188532);
                                    jm40Var2 = jm40Var;
                                    l7x.C(mm40VarE0, (ovi0) pvi0Var, z16, gy40Var5, function15, fetVar, 65534 & i17);
                                    fetVar.r(false);
                                } else {
                                    jm40Var2 = jm40Var;
                                    if (pvi0Var instanceof nvi0) {
                                        fetVar.e0(-315877075);
                                        l7x.v(mm40VarE0, (nvi0) pvi0Var, z16, function15, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof lvi0) {
                                        fetVar.e0(-315606228);
                                        l7x.n(mm40VarE0, (lvi0) pvi0Var, z16, function15, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof dvi0) {
                                        fetVar.e0(-315335443);
                                        l7x.d(mm40VarE0, (dvi0) pvi0Var, z16, function15, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof evi0) {
                                        fetVar.e0(-315065619);
                                        l7x.e(mm40VarE0, (evi0) pvi0Var, z16, function15, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof ivi0) {
                                        fetVar.e0(-314796229);
                                        l7x.i(mm40VarE0, (ivi0) pvi0Var, z16, function13, fetVar, (i17 >> 6) & 7168);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof gvi0) {
                                        fetVar.e0(-314030343);
                                        l7x.g(mm40VarE0, (gvi0) pvi0Var, fetVar, 0);
                                        fetVar.r(false);
                                    } else if (pvi0Var instanceof hvi0) {
                                        fetVar.e0(-313825433);
                                        l7x.h(mm40VarE0, (hvi0) pvi0Var, z16, function15, fetVar, 0);
                                        fetVar.r(false);
                                    } else {
                                        if (pvi0Var instanceof cvi0) {
                                            throw b1j.f(128324354, fetVar, false);
                                        }
                                        fetVar.e0(-313551889);
                                        l7x.b(mm40VarE0, (cvi0) pvi0Var, z16, function15, fetVar, 0);
                                        fetVar.r(false);
                                    }
                                }
                                fetVar.r(z17);
                            }
                        }
                        jm40Var2 = jm40Var;
                        fetVar.r(z17);
                    } else {
                        rqmVar2 = rqmVar;
                        jm40Var2 = jm40Var;
                        i16 = i15;
                        fetVar.e0(-1506902999);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                    boolean zE5 = fetVar.e(wui0Var.ordinal());
                    if ((i16 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    z14 = zE5 | z13;
                    objP5 = fetVar.P();
                    if (z14) {
                        if (tx3.u(wui0Var, new wui0[]{wui0.c, wui0.b})) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        objP5 = Boolean.valueOf(z15);
                        fetVar.o0(objP5);
                    } else {
                        if (tx3.u(wui0Var, new wui0[]{wui0.c, wui0.b})) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        objP5 = Boolean.valueOf(z15);
                        fetVar.o0(objP5);
                    }
                    if (((Boolean) objP5).booleanValue()) {
                        fetVar.e0(405481332);
                        mm40 mm40VarB5 = jr8Var.b(jm40Var2, gqw0.h);
                        zcl zclVar1110 = qmk.f28987a;
                        if (pui0Var2 == null) {
                            f2 = 12.0f;
                        } else if (!(pui0Var2 instanceof nui0)) {
                            if (pui0Var2 instanceof oui0) {
                                t9f.b();
                                return;
                            }
                            f2 = 44.0f;
                        }
                        mbc.o(agi0.f827a, s5x0.N(mm40VarB5, f2 + 4.0f, 0.0f, 0.0f, 0.0f, 14), false, fetVar, 6, 4);
                        fetVar.r(false);
                    } else {
                        fetVar.e0(405751373);
                        fetVar.r(false);
                    }
                    fetVar.r(true);
                    function8 = function14;
                    z4 = z113;
                    function9 = function110;
                    function6 = function12;
                    gy40Var3 = gy40Var5;
                    function7 = function13;
                    mm40Var3 = mm40Var9;
                } else {
                    fetVar.X();
                    function7 = function3;
                    mm40Var3 = mm40Var2;
                    z4 = z2;
                    function8 = function4;
                    gy40Var3 = gy40Var2;
                    function9 = function5;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new le9(mm40Var3, rqmVar2, z4, gy40Var3, function8, function9, function6, function7, i, i2);
                }
            }
            i3 |= 24576;
            function4 = function0;
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
                function5 = function1;
            } else {
                function5 = function1;
                if ((i & 196608) == 0) {
                    if (fetVar.i(function5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                function6 = function2;
            } else {
                function6 = function2;
                if ((i & 1572864) == 0) {
                    if (fetVar.i(function6)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (fetVar.i(function3)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i3 & 1, z3)) {
                jm40Var = jm40.b;
                if (i18 != 0) {
                    mm40Var4 = jm40Var;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i19 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i4 != 0) {
                    gy40Var4 = null;
                } else {
                    gy40Var4 = gy40Var2;
                }
                if (i6 != 0) {
                    function4 = null;
                }
                if (i8 != 0) {
                    function5 = null;
                }
                if (i10 != 0) {
                    function10 = null;
                } else {
                    function10 = function6;
                }
                if (i12 != 0) {
                    function11 = null;
                } else {
                    function11 = function3;
                }
                d4d d4dVar6 = rqmVar2.e;
                z6 = rqmVar2.h;
                i14 = i3;
                jY = ibc.Y(d4dVar6, fetVar);
                t89Var = rqmVar2.i;
                pvi0Var = rqmVar2.c;
                pui0Var = rqmVar2.b;
                boolean z114 = z5;
                vui0Var = rqmVar2.f30938a;
                function12 = function10;
                wui0Var = rqmVar2.g;
                tvi0Var = rqmVar2.f;
                zG = fetVar.g(pvi0Var);
                gy40Var5 = gy40Var4;
                objP = fetVar.P();
                function13 = function11;
                cl5 cl5Var6 = ukd.f35823a;
                if (zG) {
                    if (pvi0Var instanceof nvi0) {
                        nvi0Var = (nvi0) pvi0Var;
                    } else {
                        nvi0Var = null;
                    }
                    if (nvi0Var != null) {
                        i15 = i14;
                        if (nvi0Var.f24188a) {
                        }
                        objP = Boolean.valueOf(z20);
                        fetVar.o0(objP);
                    } else {
                        i15 = i14;
                    }
                    objP = Boolean.valueOf(z20);
                    fetVar.o0(objP);
                } else {
                    if (pvi0Var instanceof nvi0) {
                        nvi0Var = (nvi0) pvi0Var;
                    } else {
                        nvi0Var = null;
                    }
                    if (nvi0Var != null) {
                        i15 = i14;
                        if (nvi0Var.f24188a) {
                        }
                        objP = Boolean.valueOf(z20);
                        fetVar.o0(objP);
                    } else {
                        i15 = i14;
                    }
                    objP = Boolean.valueOf(z20);
                    fetVar.o0(objP);
                }
                boolean zBooleanValue6 = ((Boolean) objP).booleanValue();
                zH = fetVar.h(z6);
                objP2 = fetVar.P();
                if (zH) {
                    if (z6) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    objP2 = Float.valueOf(f);
                    fetVar.o0(objP2);
                } else {
                    if (z6) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    objP2 = Float.valueOf(f);
                    fetVar.o0(objP2);
                }
                fFloatValue = ((Number) objP2).floatValue();
                f2 = 60.0f;
                if (vui0Var != null) {
                    zcl zclVar1111 = qmk.f28987a;
                    f3 = 60.0f;
                } else if (!(vui0Var instanceof tui0)) {
                    if (vui0Var instanceof sui0) {
                        zcl zclVar1112 = qmk.f28987a;
                    } else {
                        zcl zclVar1113 = qmk.f28987a;
                    }
                    f3 = 60.0f;
                } else if (pui0Var instanceof nui0) {
                    zcl zclVar1114 = qmk.f28987a;
                    f3 = 60.0f;
                } else {
                    zcl zclVar1115 = qmk.f28987a;
                    f3 = 48.0f;
                }
                float fMax6 = Math.max(f3, rqmVar2.d);
                if (t89Var == null) {
                    skk0Var = new skk0(jY);
                } else {
                    skk0Var = t89Var;
                }
                mm40 mm40VarD6 = o7k0.d(o7k0.g(mm40Var4, fMax6, 0.0f, 2), 1.0f);
                if (Intrinsics.d(tvi0Var, qvi0.f29388a)) {
                    f4 = 16.0f;
                } else if (Intrinsics.d(tvi0Var, rvi0.f31169a)) {
                    f4 = 360.0f;
                } else {
                    if (Intrinsics.d(tvi0Var, svi0.f32868a)) {
                        t9f.b();
                        return;
                    }
                    f4 = 8.0f;
                }
                iOrdinal = wui0Var.ordinal();
                if (iOrdinal != 0) {
                    yjj0VarA = vgg0.a(f4);
                } else if (iOrdinal != 1) {
                    yjj0VarA = vgg0.c(f4, f4, 0.0f, 0.0f, 12);
                } else if (iOrdinal != 2) {
                    yjj0VarA = jd8.n;
                } else {
                    if (iOrdinal == 3) {
                        t9f.b();
                        return;
                    }
                    yjj0VarA = vgg0.c(0.0f, 0.0f, f4, f4, 3);
                }
                mm40 mm40VarP6 = i120.P(lgb.J(mm40VarD6, yjj0VarA), skk0Var, null, 6);
                tj30 tj30VarC6 = zq8.c(gqw0.f11754a, false);
                int iHashCode11 = Long.hashCode(fetVar.T);
                bh90 bh90VarM11 = fetVar.m();
                mm40 mm40VarC10 = kbc.c0(fetVar, mm40VarP6);
                mkd.c0.getClass();
                fetVar.i0();
                z7 = fetVar.S;
                pcyVar = e7z.u1;
                if (z7) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                shd shdVar111 = gqw0.x;
                mm40 mm40Var10 = mm40Var4;
                jpm0.o(fetVar, tj30VarC6, shdVar111);
                shd shdVar112 = gqw0.w;
                jpm0.o(fetVar, bh90VarM11, shdVar112);
                Integer numValueOf6 = Integer.valueOf(iHashCode11);
                shd shdVar113 = gqw0.y;
                jpm0.o(fetVar, numValueOf6, shdVar113);
                jpm0.n(fetVar);
                shd shdVar114 = gqw0.v;
                jpm0.o(fetVar, mm40VarC10, shdVar114);
                if (function4 == null) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                if ((i15 & 112) == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z211 = z9;
                if ((i15 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z212 = z211 | z10;
                if ((i15 & 458752) == 131072) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z212 | z11;
                objP3 = fetVar.P();
                if (z12) {
                    objP3 = new g8l(rqmVar2, function4, function5, (byte) 6);
                    fetVar.o0(objP3);
                } else {
                    objP3 = new g8l(rqmVar2, function4, function5, (byte) 6);
                    fetVar.o0(objP3);
                }
                function14 = function4;
                Function0 function111 = function5;
                mm40 mm40VarL6 = s5x0.L(y860.W(jm40Var, null, null, z8, null, (Function0) objP3, 24), 4.0f, 0.0f, 2);
                zx7 zx7Var6 = gqw0.e;
                jr8Var = jr8.f16991a;
                mm40 mm40VarE6 = o2e.e0(jr8Var.b(mm40VarL6, zx7Var6), "SETTING_CELL_ROW");
                thg0 thg0VarA6 = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                int iHashCode12 = Long.hashCode(fetVar.T);
                bh90 bh90VarM12 = fetVar.m();
                mm40 mm40VarC11 = kbc.c0(fetVar, mm40VarE6);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA6, shdVar111);
                jpm0.o(fetVar, bh90VarM12, shdVar112);
                vqd.u(iHashCode12, fetVar, shdVar113, fetVar);
                jpm0.o(fetVar, mm40VarC11, shdVar114);
                if (pui0Var != null) {
                    fetVar.e0(-1508458548);
                    zD2 = fetVar.d(fFloatValue);
                    objP7 = fetVar.P();
                    if (zD2) {
                        objP7 = new f54(fFloatValue, (byte) 17);
                        fetVar.o0(objP7);
                    } else {
                        objP7 = new f54(fFloatValue, (byte) 17);
                        fetVar.o0(objP7);
                    }
                    mm40VarN = s5x0.N(i4w0.T(jm40Var, (Function1) objP7), 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    pui0Var2 = pui0Var;
                    if (pui0Var2 instanceof oui0) {
                        fetVar.e0(-271930382);
                        z18 = false;
                        vbw0.u(mm40VarN, (oui0) pui0Var2, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        z18 = false;
                        if (pui0Var2 instanceof nui0) {
                            throw b1j.f(-147321061, fetVar, false);
                        }
                        fetVar.e0(-271563900);
                        vbw0.f(mm40VarN, (nui0) pui0Var2, jY, fetVar, 0);
                        fetVar.r(false);
                    }
                    fetVar.r(z18);
                } else {
                    pui0Var2 = pui0Var;
                    fetVar.e0(-1508140023);
                    fetVar.r(false);
                }
                if (pvi0Var == null) {
                }
                zD = fetVar.d(fFloatValue);
                objP4 = fetVar.P();
                if (zD) {
                    objP4 = new f54(fFloatValue, (byte) 18);
                    fetVar.o0(objP4);
                } else {
                    objP4 = new f54(fFloatValue, (byte) 18);
                    fetVar.o0(objP4);
                }
                k7x.s(dw9.h(1.0f, o2e.e0(s5x0.N(i4w0.T(jm40Var, (Function1) objP4), 0.0f, 0.0f, f5, 0.0f, 11), "SETTING_CELL_MIDDLE"), true), vui0Var, zBooleanValue6, fetVar, 0);
                if (pvi0Var != null) {
                    fetVar.e0(-1507519434);
                    zG2 = fetVar.g(pvi0Var) | fetVar.d(fFloatValue);
                    objP6 = fetVar.P();
                    if (zG2) {
                        objP6 = new cel((Object) pvi0Var, fFloatValue, (byte) 3);
                        fetVar.o0(objP6);
                    } else {
                        objP6 = new cel((Object) pvi0Var, fFloatValue, (byte) 3);
                        fetVar.o0(objP6);
                    }
                    mm40VarE0 = o2e.e0(yyw.U(i4w0.T(jm40Var, (Function1) objP6), 0.4f), "SWITCH");
                    rqmVar2 = rqmVar;
                    z16 = rqmVar2.h;
                    if (function12 == null) {
                        function15 = function14;
                    } else {
                        function15 = function12;
                    }
                    i16 = i15;
                    i17 = (i16 & 7168) | ((i16 >> 6) & 458752);
                    if (pvi0Var instanceof kvi0) {
                        fetVar.e0(-316943940);
                        z17 = false;
                        l7x.l(mm40VarE0, (kvi0) pvi0Var, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        z17 = false;
                        if (pvi0Var instanceof jvi0) {
                            fetVar.e0(-316758653);
                            l7x.m(mm40VarE0, (jvi0) pvi0Var, fetVar, 0);
                            fetVar.r(false);
                        } else if (pvi0Var instanceof fvi0) {
                            fetVar.e0(-316578047);
                            l7x.f(mm40VarE0, (fvi0) pvi0Var, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            if (pvi0Var instanceof mvi0) {
                                fetVar.e0(-316391427);
                                l7x.r(mm40VarE0, (mvi0) pvi0Var, fetVar, 0);
                                fetVar.r(false);
                            } else if (pvi0Var instanceof ovi0) {
                                fetVar.e0(-316188532);
                                jm40Var2 = jm40Var;
                                l7x.C(mm40VarE0, (ovi0) pvi0Var, z16, gy40Var5, function15, fetVar, 65534 & i17);
                                fetVar.r(false);
                            } else {
                                jm40Var2 = jm40Var;
                                if (pvi0Var instanceof nvi0) {
                                    fetVar.e0(-315877075);
                                    l7x.v(mm40VarE0, (nvi0) pvi0Var, z16, function15, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof lvi0) {
                                    fetVar.e0(-315606228);
                                    l7x.n(mm40VarE0, (lvi0) pvi0Var, z16, function15, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof dvi0) {
                                    fetVar.e0(-315335443);
                                    l7x.d(mm40VarE0, (dvi0) pvi0Var, z16, function15, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof evi0) {
                                    fetVar.e0(-315065619);
                                    l7x.e(mm40VarE0, (evi0) pvi0Var, z16, function15, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof ivi0) {
                                    fetVar.e0(-314796229);
                                    l7x.i(mm40VarE0, (ivi0) pvi0Var, z16, function13, fetVar, (i17 >> 6) & 7168);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof gvi0) {
                                    fetVar.e0(-314030343);
                                    l7x.g(mm40VarE0, (gvi0) pvi0Var, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof hvi0) {
                                    fetVar.e0(-313825433);
                                    l7x.h(mm40VarE0, (hvi0) pvi0Var, z16, function15, fetVar, 0);
                                    fetVar.r(false);
                                } else {
                                    if (pvi0Var instanceof cvi0) {
                                        throw b1j.f(128324354, fetVar, false);
                                    }
                                    fetVar.e0(-313551889);
                                    l7x.b(mm40VarE0, (cvi0) pvi0Var, z16, function15, fetVar, 0);
                                    fetVar.r(false);
                                }
                            }
                            fetVar.r(z17);
                        }
                    }
                    jm40Var2 = jm40Var;
                    fetVar.r(z17);
                } else {
                    rqmVar2 = rqmVar;
                    jm40Var2 = jm40Var;
                    i16 = i15;
                    fetVar.e0(-1506902999);
                    fetVar.r(false);
                }
                fetVar.r(true);
                boolean zE6 = fetVar.e(wui0Var.ordinal());
                if ((i16 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zE6 | z13;
                objP5 = fetVar.P();
                if (z14) {
                    if (tx3.u(wui0Var, new wui0[]{wui0.c, wui0.b})) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    objP5 = Boolean.valueOf(z15);
                    fetVar.o0(objP5);
                } else {
                    if (tx3.u(wui0Var, new wui0[]{wui0.c, wui0.b})) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    objP5 = Boolean.valueOf(z15);
                    fetVar.o0(objP5);
                }
                if (((Boolean) objP5).booleanValue()) {
                    fetVar.e0(405481332);
                    mm40 mm40VarB6 = jr8Var.b(jm40Var2, gqw0.h);
                    zcl zclVar1116 = qmk.f28987a;
                    if (pui0Var2 == null) {
                        f2 = 12.0f;
                    } else if (!(pui0Var2 instanceof nui0)) {
                        if (pui0Var2 instanceof oui0) {
                            t9f.b();
                            return;
                        }
                        f2 = 44.0f;
                    }
                    mbc.o(agi0.f827a, s5x0.N(mm40VarB6, f2 + 4.0f, 0.0f, 0.0f, 0.0f, 14), false, fetVar, 6, 4);
                    fetVar.r(false);
                } else {
                    fetVar.e0(405751373);
                    fetVar.r(false);
                }
                fetVar.r(true);
                function8 = function14;
                z4 = z114;
                function9 = function111;
                function6 = function12;
                gy40Var3 = gy40Var5;
                function7 = function13;
                mm40Var3 = mm40Var10;
            } else {
                fetVar.X();
                function7 = function3;
                mm40Var3 = mm40Var2;
                z4 = z2;
                function8 = function4;
                gy40Var3 = gy40Var2;
                function9 = function5;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new le9(mm40Var3, rqmVar2, z4, gy40Var3, function8, function9, function6, function7, i, i2);
            }
        }
        i3 |= 3072;
        gy40Var2 = gy40Var;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                function4 = function0;
                if (fetVar.i(function4)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                i3 |= 196608;
                function5 = function1;
            } else {
                function5 = function1;
                if ((i & 196608) == 0) {
                    if (fetVar.i(function5)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
            }
            i10 = i2 & 64;
            if (i10 != 0) {
                i3 |= 1572864;
                function6 = function2;
            } else {
                function6 = function2;
                if ((i & 1572864) == 0) {
                    if (fetVar.i(function6)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
            }
            i12 = i2 & 128;
            if (i12 != 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (fetVar.i(function3)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i3 |= i13;
            }
            if ((i3 & 4793491) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (fetVar.U(i3 & 1, z3)) {
                jm40Var = jm40.b;
                if (i18 != 0) {
                    mm40Var4 = jm40Var;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i19 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i4 != 0) {
                    gy40Var4 = null;
                } else {
                    gy40Var4 = gy40Var2;
                }
                if (i6 != 0) {
                    function4 = null;
                }
                if (i8 != 0) {
                    function5 = null;
                }
                if (i10 != 0) {
                    function10 = null;
                } else {
                    function10 = function6;
                }
                if (i12 != 0) {
                    function11 = null;
                } else {
                    function11 = function3;
                }
                d4d d4dVar7 = rqmVar2.e;
                z6 = rqmVar2.h;
                i14 = i3;
                jY = ibc.Y(d4dVar7, fetVar);
                t89Var = rqmVar2.i;
                pvi0Var = rqmVar2.c;
                pui0Var = rqmVar2.b;
                boolean z115 = z5;
                vui0Var = rqmVar2.f30938a;
                function12 = function10;
                wui0Var = rqmVar2.g;
                tvi0Var = rqmVar2.f;
                zG = fetVar.g(pvi0Var);
                gy40Var5 = gy40Var4;
                objP = fetVar.P();
                function13 = function11;
                cl5 cl5Var7 = ukd.f35823a;
                if (zG) {
                    if (pvi0Var instanceof nvi0) {
                        nvi0Var = (nvi0) pvi0Var;
                    } else {
                        nvi0Var = null;
                    }
                    if (nvi0Var != null) {
                        i15 = i14;
                        if (nvi0Var.f24188a) {
                        }
                        objP = Boolean.valueOf(z20);
                        fetVar.o0(objP);
                    } else {
                        i15 = i14;
                    }
                    objP = Boolean.valueOf(z20);
                    fetVar.o0(objP);
                } else {
                    if (pvi0Var instanceof nvi0) {
                        nvi0Var = (nvi0) pvi0Var;
                    } else {
                        nvi0Var = null;
                    }
                    if (nvi0Var != null) {
                        i15 = i14;
                        if (nvi0Var.f24188a) {
                        }
                        objP = Boolean.valueOf(z20);
                        fetVar.o0(objP);
                    } else {
                        i15 = i14;
                    }
                    objP = Boolean.valueOf(z20);
                    fetVar.o0(objP);
                }
                boolean zBooleanValue7 = ((Boolean) objP).booleanValue();
                zH = fetVar.h(z6);
                objP2 = fetVar.P();
                if (zH) {
                    if (z6) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    objP2 = Float.valueOf(f);
                    fetVar.o0(objP2);
                } else {
                    if (z6) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    objP2 = Float.valueOf(f);
                    fetVar.o0(objP2);
                }
                fFloatValue = ((Number) objP2).floatValue();
                f2 = 60.0f;
                if (vui0Var != null) {
                    zcl zclVar1117 = qmk.f28987a;
                    f3 = 60.0f;
                } else if (!(vui0Var instanceof tui0)) {
                    if (vui0Var instanceof sui0) {
                        zcl zclVar1118 = qmk.f28987a;
                    } else {
                        zcl zclVar1119 = qmk.f28987a;
                    }
                    f3 = 60.0f;
                } else if (pui0Var instanceof nui0) {
                    zcl zclVar11110 = qmk.f28987a;
                    f3 = 60.0f;
                } else {
                    zcl zclVar11111 = qmk.f28987a;
                    f3 = 48.0f;
                }
                float fMax7 = Math.max(f3, rqmVar2.d);
                if (t89Var == null) {
                    skk0Var = new skk0(jY);
                } else {
                    skk0Var = t89Var;
                }
                mm40 mm40VarD7 = o7k0.d(o7k0.g(mm40Var4, fMax7, 0.0f, 2), 1.0f);
                if (Intrinsics.d(tvi0Var, qvi0.f29388a)) {
                    f4 = 16.0f;
                } else if (Intrinsics.d(tvi0Var, rvi0.f31169a)) {
                    f4 = 360.0f;
                } else {
                    if (Intrinsics.d(tvi0Var, svi0.f32868a)) {
                        t9f.b();
                        return;
                    }
                    f4 = 8.0f;
                }
                iOrdinal = wui0Var.ordinal();
                if (iOrdinal != 0) {
                    yjj0VarA = vgg0.a(f4);
                } else if (iOrdinal != 1) {
                    yjj0VarA = vgg0.c(f4, f4, 0.0f, 0.0f, 12);
                } else if (iOrdinal != 2) {
                    yjj0VarA = jd8.n;
                } else {
                    if (iOrdinal == 3) {
                        t9f.b();
                        return;
                    }
                    yjj0VarA = vgg0.c(0.0f, 0.0f, f4, f4, 3);
                }
                mm40 mm40VarP7 = i120.P(lgb.J(mm40VarD7, yjj0VarA), skk0Var, null, 6);
                tj30 tj30VarC7 = zq8.c(gqw0.f11754a, false);
                int iHashCode13 = Long.hashCode(fetVar.T);
                bh90 bh90VarM13 = fetVar.m();
                mm40 mm40VarC12 = kbc.c0(fetVar, mm40VarP7);
                mkd.c0.getClass();
                fetVar.i0();
                z7 = fetVar.S;
                pcyVar = e7z.u1;
                if (z7) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                shd shdVar115 = gqw0.x;
                mm40 mm40Var11 = mm40Var4;
                jpm0.o(fetVar, tj30VarC7, shdVar115);
                shd shdVar116 = gqw0.w;
                jpm0.o(fetVar, bh90VarM13, shdVar116);
                Integer numValueOf7 = Integer.valueOf(iHashCode13);
                shd shdVar117 = gqw0.y;
                jpm0.o(fetVar, numValueOf7, shdVar117);
                jpm0.n(fetVar);
                shd shdVar118 = gqw0.v;
                jpm0.o(fetVar, mm40VarC12, shdVar118);
                if (function4 == null) {
                    z8 = true;
                } else {
                    z8 = true;
                }
                if ((i15 & 112) == 32) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z213 = z9;
                if ((i15 & 57344) == 16384) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean z214 = z213 | z10;
                if ((i15 & 458752) == 131072) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                z12 = z214 | z11;
                objP3 = fetVar.P();
                if (z12) {
                    objP3 = new g8l(rqmVar2, function4, function5, (byte) 6);
                    fetVar.o0(objP3);
                } else {
                    objP3 = new g8l(rqmVar2, function4, function5, (byte) 6);
                    fetVar.o0(objP3);
                }
                function14 = function4;
                Function0 function112 = function5;
                mm40 mm40VarL7 = s5x0.L(y860.W(jm40Var, null, null, z8, null, (Function0) objP3, 24), 4.0f, 0.0f, 2);
                zx7 zx7Var7 = gqw0.e;
                jr8Var = jr8.f16991a;
                mm40 mm40VarE7 = o2e.e0(jr8Var.b(mm40VarL7, zx7Var7), "SETTING_CELL_ROW");
                thg0 thg0VarA7 = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
                int iHashCode14 = Long.hashCode(fetVar.T);
                bh90 bh90VarM14 = fetVar.m();
                mm40 mm40VarC13 = kbc.c0(fetVar, mm40VarE7);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA7, shdVar115);
                jpm0.o(fetVar, bh90VarM14, shdVar116);
                vqd.u(iHashCode14, fetVar, shdVar117, fetVar);
                jpm0.o(fetVar, mm40VarC13, shdVar118);
                if (pui0Var != null) {
                    fetVar.e0(-1508458548);
                    zD2 = fetVar.d(fFloatValue);
                    objP7 = fetVar.P();
                    if (zD2) {
                        objP7 = new f54(fFloatValue, (byte) 17);
                        fetVar.o0(objP7);
                    } else {
                        objP7 = new f54(fFloatValue, (byte) 17);
                        fetVar.o0(objP7);
                    }
                    mm40VarN = s5x0.N(i4w0.T(jm40Var, (Function1) objP7), 8.0f, 0.0f, 0.0f, 0.0f, 14);
                    pui0Var2 = pui0Var;
                    if (pui0Var2 instanceof oui0) {
                        fetVar.e0(-271930382);
                        z18 = false;
                        vbw0.u(mm40VarN, (oui0) pui0Var2, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        z18 = false;
                        if (pui0Var2 instanceof nui0) {
                            throw b1j.f(-147321061, fetVar, false);
                        }
                        fetVar.e0(-271563900);
                        vbw0.f(mm40VarN, (nui0) pui0Var2, jY, fetVar, 0);
                        fetVar.r(false);
                    }
                    fetVar.r(z18);
                } else {
                    pui0Var2 = pui0Var;
                    fetVar.e0(-1508140023);
                    fetVar.r(false);
                }
                if (pvi0Var == null) {
                }
                zD = fetVar.d(fFloatValue);
                objP4 = fetVar.P();
                if (zD) {
                    objP4 = new f54(fFloatValue, (byte) 18);
                    fetVar.o0(objP4);
                } else {
                    objP4 = new f54(fFloatValue, (byte) 18);
                    fetVar.o0(objP4);
                }
                k7x.s(dw9.h(1.0f, o2e.e0(s5x0.N(i4w0.T(jm40Var, (Function1) objP4), 0.0f, 0.0f, f5, 0.0f, 11), "SETTING_CELL_MIDDLE"), true), vui0Var, zBooleanValue7, fetVar, 0);
                if (pvi0Var != null) {
                    fetVar.e0(-1507519434);
                    zG2 = fetVar.g(pvi0Var) | fetVar.d(fFloatValue);
                    objP6 = fetVar.P();
                    if (zG2) {
                        objP6 = new cel((Object) pvi0Var, fFloatValue, (byte) 3);
                        fetVar.o0(objP6);
                    } else {
                        objP6 = new cel((Object) pvi0Var, fFloatValue, (byte) 3);
                        fetVar.o0(objP6);
                    }
                    mm40VarE0 = o2e.e0(yyw.U(i4w0.T(jm40Var, (Function1) objP6), 0.4f), "SWITCH");
                    rqmVar2 = rqmVar;
                    z16 = rqmVar2.h;
                    if (function12 == null) {
                        function15 = function14;
                    } else {
                        function15 = function12;
                    }
                    i16 = i15;
                    i17 = (i16 & 7168) | ((i16 >> 6) & 458752);
                    if (pvi0Var instanceof kvi0) {
                        fetVar.e0(-316943940);
                        z17 = false;
                        l7x.l(mm40VarE0, (kvi0) pvi0Var, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        z17 = false;
                        if (pvi0Var instanceof jvi0) {
                            fetVar.e0(-316758653);
                            l7x.m(mm40VarE0, (jvi0) pvi0Var, fetVar, 0);
                            fetVar.r(false);
                        } else if (pvi0Var instanceof fvi0) {
                            fetVar.e0(-316578047);
                            l7x.f(mm40VarE0, (fvi0) pvi0Var, fetVar, 0);
                            fetVar.r(false);
                        } else {
                            if (pvi0Var instanceof mvi0) {
                                fetVar.e0(-316391427);
                                l7x.r(mm40VarE0, (mvi0) pvi0Var, fetVar, 0);
                                fetVar.r(false);
                            } else if (pvi0Var instanceof ovi0) {
                                fetVar.e0(-316188532);
                                jm40Var2 = jm40Var;
                                l7x.C(mm40VarE0, (ovi0) pvi0Var, z16, gy40Var5, function15, fetVar, 65534 & i17);
                                fetVar.r(false);
                            } else {
                                jm40Var2 = jm40Var;
                                if (pvi0Var instanceof nvi0) {
                                    fetVar.e0(-315877075);
                                    l7x.v(mm40VarE0, (nvi0) pvi0Var, z16, function15, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof lvi0) {
                                    fetVar.e0(-315606228);
                                    l7x.n(mm40VarE0, (lvi0) pvi0Var, z16, function15, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof dvi0) {
                                    fetVar.e0(-315335443);
                                    l7x.d(mm40VarE0, (dvi0) pvi0Var, z16, function15, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof evi0) {
                                    fetVar.e0(-315065619);
                                    l7x.e(mm40VarE0, (evi0) pvi0Var, z16, function15, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof ivi0) {
                                    fetVar.e0(-314796229);
                                    l7x.i(mm40VarE0, (ivi0) pvi0Var, z16, function13, fetVar, (i17 >> 6) & 7168);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof gvi0) {
                                    fetVar.e0(-314030343);
                                    l7x.g(mm40VarE0, (gvi0) pvi0Var, fetVar, 0);
                                    fetVar.r(false);
                                } else if (pvi0Var instanceof hvi0) {
                                    fetVar.e0(-313825433);
                                    l7x.h(mm40VarE0, (hvi0) pvi0Var, z16, function15, fetVar, 0);
                                    fetVar.r(false);
                                } else {
                                    if (pvi0Var instanceof cvi0) {
                                        throw b1j.f(128324354, fetVar, false);
                                    }
                                    fetVar.e0(-313551889);
                                    l7x.b(mm40VarE0, (cvi0) pvi0Var, z16, function15, fetVar, 0);
                                    fetVar.r(false);
                                }
                            }
                            fetVar.r(z17);
                        }
                    }
                    jm40Var2 = jm40Var;
                    fetVar.r(z17);
                } else {
                    rqmVar2 = rqmVar;
                    jm40Var2 = jm40Var;
                    i16 = i15;
                    fetVar.e0(-1506902999);
                    fetVar.r(false);
                }
                fetVar.r(true);
                boolean zE7 = fetVar.e(wui0Var.ordinal());
                if ((i16 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                z14 = zE7 | z13;
                objP5 = fetVar.P();
                if (z14) {
                    if (tx3.u(wui0Var, new wui0[]{wui0.c, wui0.b})) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    objP5 = Boolean.valueOf(z15);
                    fetVar.o0(objP5);
                } else {
                    if (tx3.u(wui0Var, new wui0[]{wui0.c, wui0.b})) {
                        z15 = false;
                    } else {
                        z15 = false;
                    }
                    objP5 = Boolean.valueOf(z15);
                    fetVar.o0(objP5);
                }
                if (((Boolean) objP5).booleanValue()) {
                    fetVar.e0(405481332);
                    mm40 mm40VarB7 = jr8Var.b(jm40Var2, gqw0.h);
                    zcl zclVar11112 = qmk.f28987a;
                    if (pui0Var2 == null) {
                        f2 = 12.0f;
                    } else if (!(pui0Var2 instanceof nui0)) {
                        if (pui0Var2 instanceof oui0) {
                            t9f.b();
                            return;
                        }
                        f2 = 44.0f;
                    }
                    mbc.o(agi0.f827a, s5x0.N(mm40VarB7, f2 + 4.0f, 0.0f, 0.0f, 0.0f, 14), false, fetVar, 6, 4);
                    fetVar.r(false);
                } else {
                    fetVar.e0(405751373);
                    fetVar.r(false);
                }
                fetVar.r(true);
                function8 = function14;
                z4 = z115;
                function9 = function112;
                function6 = function12;
                gy40Var3 = gy40Var5;
                function7 = function13;
                mm40Var3 = mm40Var11;
            } else {
                fetVar.X();
                function7 = function3;
                mm40Var3 = mm40Var2;
                z4 = z2;
                function8 = function4;
                gy40Var3 = gy40Var2;
                function9 = function5;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new le9(mm40Var3, rqmVar2, z4, gy40Var3, function8, function9, function6, function7, i, i2);
            }
        }
        i3 |= 24576;
        function4 = function0;
        i8 = i2 & 32;
        if (i8 != 0) {
            i3 |= 196608;
            function5 = function1;
        } else {
            function5 = function1;
            if ((i & 196608) == 0) {
                if (fetVar.i(function5)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
        }
        i10 = i2 & 64;
        if (i10 != 0) {
            i3 |= 1572864;
            function6 = function2;
        } else {
            function6 = function2;
            if ((i & 1572864) == 0) {
                if (fetVar.i(function6)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
        }
        i12 = i2 & 128;
        if (i12 != 0) {
            i3 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (fetVar.i(function3)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i3 |= i13;
        }
        if ((i3 & 4793491) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (fetVar.U(i3 & 1, z3)) {
            jm40Var = jm40.b;
            if (i18 != 0) {
                mm40Var4 = jm40Var;
            } else {
                mm40Var4 = mm40Var2;
            }
            if (i19 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i4 != 0) {
                gy40Var4 = null;
            } else {
                gy40Var4 = gy40Var2;
            }
            if (i6 != 0) {
                function4 = null;
            }
            if (i8 != 0) {
                function5 = null;
            }
            if (i10 != 0) {
                function10 = null;
            } else {
                function10 = function6;
            }
            if (i12 != 0) {
                function11 = null;
            } else {
                function11 = function3;
            }
            d4d d4dVar8 = rqmVar2.e;
            z6 = rqmVar2.h;
            i14 = i3;
            jY = ibc.Y(d4dVar8, fetVar);
            t89Var = rqmVar2.i;
            pvi0Var = rqmVar2.c;
            pui0Var = rqmVar2.b;
            boolean z116 = z5;
            vui0Var = rqmVar2.f30938a;
            function12 = function10;
            wui0Var = rqmVar2.g;
            tvi0Var = rqmVar2.f;
            zG = fetVar.g(pvi0Var);
            gy40Var5 = gy40Var4;
            objP = fetVar.P();
            function13 = function11;
            cl5 cl5Var8 = ukd.f35823a;
            if (zG) {
                if (pvi0Var instanceof nvi0) {
                    nvi0Var = (nvi0) pvi0Var;
                } else {
                    nvi0Var = null;
                }
                if (nvi0Var != null) {
                    i15 = i14;
                    if (nvi0Var.f24188a) {
                    }
                    objP = Boolean.valueOf(z20);
                    fetVar.o0(objP);
                } else {
                    i15 = i14;
                }
                objP = Boolean.valueOf(z20);
                fetVar.o0(objP);
            } else {
                if (pvi0Var instanceof nvi0) {
                    nvi0Var = (nvi0) pvi0Var;
                } else {
                    nvi0Var = null;
                }
                if (nvi0Var != null) {
                    i15 = i14;
                    if (nvi0Var.f24188a) {
                    }
                    objP = Boolean.valueOf(z20);
                    fetVar.o0(objP);
                } else {
                    i15 = i14;
                }
                objP = Boolean.valueOf(z20);
                fetVar.o0(objP);
            }
            boolean zBooleanValue8 = ((Boolean) objP).booleanValue();
            zH = fetVar.h(z6);
            objP2 = fetVar.P();
            if (zH) {
                if (z6) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                objP2 = Float.valueOf(f);
                fetVar.o0(objP2);
            } else {
                if (z6) {
                    f = 1.0f;
                } else {
                    f = 0.5f;
                }
                objP2 = Float.valueOf(f);
                fetVar.o0(objP2);
            }
            fFloatValue = ((Number) objP2).floatValue();
            f2 = 60.0f;
            if (vui0Var != null) {
                zcl zclVar11113 = qmk.f28987a;
                f3 = 60.0f;
            } else if (!(vui0Var instanceof tui0)) {
                if (vui0Var instanceof sui0) {
                    zcl zclVar11114 = qmk.f28987a;
                } else {
                    zcl zclVar11115 = qmk.f28987a;
                }
                f3 = 60.0f;
            } else if (pui0Var instanceof nui0) {
                zcl zclVar11116 = qmk.f28987a;
                f3 = 60.0f;
            } else {
                zcl zclVar11117 = qmk.f28987a;
                f3 = 48.0f;
            }
            float fMax8 = Math.max(f3, rqmVar2.d);
            if (t89Var == null) {
                skk0Var = new skk0(jY);
            } else {
                skk0Var = t89Var;
            }
            mm40 mm40VarD8 = o7k0.d(o7k0.g(mm40Var4, fMax8, 0.0f, 2), 1.0f);
            if (Intrinsics.d(tvi0Var, qvi0.f29388a)) {
                f4 = 16.0f;
            } else if (Intrinsics.d(tvi0Var, rvi0.f31169a)) {
                f4 = 360.0f;
            } else {
                if (Intrinsics.d(tvi0Var, svi0.f32868a)) {
                    t9f.b();
                    return;
                }
                f4 = 8.0f;
            }
            iOrdinal = wui0Var.ordinal();
            if (iOrdinal != 0) {
                yjj0VarA = vgg0.a(f4);
            } else if (iOrdinal != 1) {
                yjj0VarA = vgg0.c(f4, f4, 0.0f, 0.0f, 12);
            } else if (iOrdinal != 2) {
                yjj0VarA = jd8.n;
            } else {
                if (iOrdinal == 3) {
                    t9f.b();
                    return;
                }
                yjj0VarA = vgg0.c(0.0f, 0.0f, f4, f4, 3);
            }
            mm40 mm40VarP8 = i120.P(lgb.J(mm40VarD8, yjj0VarA), skk0Var, null, 6);
            tj30 tj30VarC8 = zq8.c(gqw0.f11754a, false);
            int iHashCode15 = Long.hashCode(fetVar.T);
            bh90 bh90VarM15 = fetVar.m();
            mm40 mm40VarC14 = kbc.c0(fetVar, mm40VarP8);
            mkd.c0.getClass();
            fetVar.i0();
            z7 = fetVar.S;
            pcyVar = e7z.u1;
            if (z7) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar119 = gqw0.x;
            mm40 mm40Var12 = mm40Var4;
            jpm0.o(fetVar, tj30VarC8, shdVar119);
            shd shdVar1110 = gqw0.w;
            jpm0.o(fetVar, bh90VarM15, shdVar1110);
            Integer numValueOf8 = Integer.valueOf(iHashCode15);
            shd shdVar1111 = gqw0.y;
            jpm0.o(fetVar, numValueOf8, shdVar1111);
            jpm0.n(fetVar);
            shd shdVar1112 = gqw0.v;
            jpm0.o(fetVar, mm40VarC14, shdVar1112);
            if (function4 == null) {
                z8 = true;
            } else {
                z8 = true;
            }
            if ((i15 & 112) == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z215 = z9;
            if ((i15 & 57344) == 16384) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z216 = z215 | z10;
            if ((i15 & 458752) == 131072) {
                z11 = true;
            } else {
                z11 = false;
            }
            z12 = z216 | z11;
            objP3 = fetVar.P();
            if (z12) {
                objP3 = new g8l(rqmVar2, function4, function5, (byte) 6);
                fetVar.o0(objP3);
            } else {
                objP3 = new g8l(rqmVar2, function4, function5, (byte) 6);
                fetVar.o0(objP3);
            }
            function14 = function4;
            Function0 function113 = function5;
            mm40 mm40VarL8 = s5x0.L(y860.W(jm40Var, null, null, z8, null, (Function0) objP3, 24), 4.0f, 0.0f, 2);
            zx7 zx7Var8 = gqw0.e;
            jr8Var = jr8.f16991a;
            mm40 mm40VarE8 = o2e.e0(jr8Var.b(mm40VarL8, zx7Var8), "SETTING_CELL_ROW");
            thg0 thg0VarA8 = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode16 = Long.hashCode(fetVar.T);
            bh90 bh90VarM16 = fetVar.m();
            mm40 mm40VarC15 = kbc.c0(fetVar, mm40VarE8);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA8, shdVar119);
            jpm0.o(fetVar, bh90VarM16, shdVar1110);
            vqd.u(iHashCode16, fetVar, shdVar1111, fetVar);
            jpm0.o(fetVar, mm40VarC15, shdVar1112);
            if (pui0Var != null) {
                fetVar.e0(-1508458548);
                zD2 = fetVar.d(fFloatValue);
                objP7 = fetVar.P();
                if (zD2) {
                    objP7 = new f54(fFloatValue, (byte) 17);
                    fetVar.o0(objP7);
                } else {
                    objP7 = new f54(fFloatValue, (byte) 17);
                    fetVar.o0(objP7);
                }
                mm40VarN = s5x0.N(i4w0.T(jm40Var, (Function1) objP7), 8.0f, 0.0f, 0.0f, 0.0f, 14);
                pui0Var2 = pui0Var;
                if (pui0Var2 instanceof oui0) {
                    fetVar.e0(-271930382);
                    z18 = false;
                    vbw0.u(mm40VarN, (oui0) pui0Var2, fetVar, 0);
                    fetVar.r(false);
                } else {
                    z18 = false;
                    if (pui0Var2 instanceof nui0) {
                        throw b1j.f(-147321061, fetVar, false);
                    }
                    fetVar.e0(-271563900);
                    vbw0.f(mm40VarN, (nui0) pui0Var2, jY, fetVar, 0);
                    fetVar.r(false);
                }
                fetVar.r(z18);
            } else {
                pui0Var2 = pui0Var;
                fetVar.e0(-1508140023);
                fetVar.r(false);
            }
            if (pvi0Var == null) {
            }
            zD = fetVar.d(fFloatValue);
            objP4 = fetVar.P();
            if (zD) {
                objP4 = new f54(fFloatValue, (byte) 18);
                fetVar.o0(objP4);
            } else {
                objP4 = new f54(fFloatValue, (byte) 18);
                fetVar.o0(objP4);
            }
            k7x.s(dw9.h(1.0f, o2e.e0(s5x0.N(i4w0.T(jm40Var, (Function1) objP4), 0.0f, 0.0f, f5, 0.0f, 11), "SETTING_CELL_MIDDLE"), true), vui0Var, zBooleanValue8, fetVar, 0);
            if (pvi0Var != null) {
                fetVar.e0(-1507519434);
                zG2 = fetVar.g(pvi0Var) | fetVar.d(fFloatValue);
                objP6 = fetVar.P();
                if (zG2) {
                    objP6 = new cel((Object) pvi0Var, fFloatValue, (byte) 3);
                    fetVar.o0(objP6);
                } else {
                    objP6 = new cel((Object) pvi0Var, fFloatValue, (byte) 3);
                    fetVar.o0(objP6);
                }
                mm40VarE0 = o2e.e0(yyw.U(i4w0.T(jm40Var, (Function1) objP6), 0.4f), "SWITCH");
                rqmVar2 = rqmVar;
                z16 = rqmVar2.h;
                if (function12 == null) {
                    function15 = function14;
                } else {
                    function15 = function12;
                }
                i16 = i15;
                i17 = (i16 & 7168) | ((i16 >> 6) & 458752);
                if (pvi0Var instanceof kvi0) {
                    fetVar.e0(-316943940);
                    z17 = false;
                    l7x.l(mm40VarE0, (kvi0) pvi0Var, fetVar, 0);
                    fetVar.r(false);
                } else {
                    z17 = false;
                    if (pvi0Var instanceof jvi0) {
                        fetVar.e0(-316758653);
                        l7x.m(mm40VarE0, (jvi0) pvi0Var, fetVar, 0);
                        fetVar.r(false);
                    } else if (pvi0Var instanceof fvi0) {
                        fetVar.e0(-316578047);
                        l7x.f(mm40VarE0, (fvi0) pvi0Var, fetVar, 0);
                        fetVar.r(false);
                    } else {
                        if (pvi0Var instanceof mvi0) {
                            fetVar.e0(-316391427);
                            l7x.r(mm40VarE0, (mvi0) pvi0Var, fetVar, 0);
                            fetVar.r(false);
                        } else if (pvi0Var instanceof ovi0) {
                            fetVar.e0(-316188532);
                            jm40Var2 = jm40Var;
                            l7x.C(mm40VarE0, (ovi0) pvi0Var, z16, gy40Var5, function15, fetVar, 65534 & i17);
                            fetVar.r(false);
                        } else {
                            jm40Var2 = jm40Var;
                            if (pvi0Var instanceof nvi0) {
                                fetVar.e0(-315877075);
                                l7x.v(mm40VarE0, (nvi0) pvi0Var, z16, function15, fetVar, 0);
                                fetVar.r(false);
                            } else if (pvi0Var instanceof lvi0) {
                                fetVar.e0(-315606228);
                                l7x.n(mm40VarE0, (lvi0) pvi0Var, z16, function15, fetVar, 0);
                                fetVar.r(false);
                            } else if (pvi0Var instanceof dvi0) {
                                fetVar.e0(-315335443);
                                l7x.d(mm40VarE0, (dvi0) pvi0Var, z16, function15, fetVar, 0);
                                fetVar.r(false);
                            } else if (pvi0Var instanceof evi0) {
                                fetVar.e0(-315065619);
                                l7x.e(mm40VarE0, (evi0) pvi0Var, z16, function15, fetVar, 0);
                                fetVar.r(false);
                            } else if (pvi0Var instanceof ivi0) {
                                fetVar.e0(-314796229);
                                l7x.i(mm40VarE0, (ivi0) pvi0Var, z16, function13, fetVar, (i17 >> 6) & 7168);
                                fetVar.r(false);
                            } else if (pvi0Var instanceof gvi0) {
                                fetVar.e0(-314030343);
                                l7x.g(mm40VarE0, (gvi0) pvi0Var, fetVar, 0);
                                fetVar.r(false);
                            } else if (pvi0Var instanceof hvi0) {
                                fetVar.e0(-313825433);
                                l7x.h(mm40VarE0, (hvi0) pvi0Var, z16, function15, fetVar, 0);
                                fetVar.r(false);
                            } else {
                                if (pvi0Var instanceof cvi0) {
                                    throw b1j.f(128324354, fetVar, false);
                                }
                                fetVar.e0(-313551889);
                                l7x.b(mm40VarE0, (cvi0) pvi0Var, z16, function15, fetVar, 0);
                                fetVar.r(false);
                            }
                        }
                        fetVar.r(z17);
                    }
                }
                jm40Var2 = jm40Var;
                fetVar.r(z17);
            } else {
                rqmVar2 = rqmVar;
                jm40Var2 = jm40Var;
                i16 = i15;
                fetVar.e0(-1506902999);
                fetVar.r(false);
            }
            fetVar.r(true);
            boolean zE8 = fetVar.e(wui0Var.ordinal());
            if ((i16 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            z14 = zE8 | z13;
            objP5 = fetVar.P();
            if (z14) {
                if (tx3.u(wui0Var, new wui0[]{wui0.c, wui0.b})) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                objP5 = Boolean.valueOf(z15);
                fetVar.o0(objP5);
            } else {
                if (tx3.u(wui0Var, new wui0[]{wui0.c, wui0.b})) {
                    z15 = false;
                } else {
                    z15 = false;
                }
                objP5 = Boolean.valueOf(z15);
                fetVar.o0(objP5);
            }
            if (((Boolean) objP5).booleanValue()) {
                fetVar.e0(405481332);
                mm40 mm40VarB8 = jr8Var.b(jm40Var2, gqw0.h);
                zcl zclVar11118 = qmk.f28987a;
                if (pui0Var2 == null) {
                    f2 = 12.0f;
                } else if (!(pui0Var2 instanceof nui0)) {
                    if (pui0Var2 instanceof oui0) {
                        t9f.b();
                        return;
                    }
                    f2 = 44.0f;
                }
                mbc.o(agi0.f827a, s5x0.N(mm40VarB8, f2 + 4.0f, 0.0f, 0.0f, 0.0f, 14), false, fetVar, 6, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(405751373);
                fetVar.r(false);
            }
            fetVar.r(true);
            function8 = function14;
            z4 = z116;
            function9 = function113;
            function6 = function12;
            gy40Var3 = gy40Var5;
            function7 = function13;
            mm40Var3 = mm40Var12;
        } else {
            fetVar.X();
            function7 = function3;
            mm40Var3 = mm40Var2;
            z4 = z2;
            function8 = function4;
            gy40Var3 = gy40Var2;
            function9 = function5;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new le9(mm40Var3, rqmVar2, z4, gy40Var3, function8, function9, function6, function7, i, i2);
        }
    }

    public static final void r(mm40 mm40Var, dxm dxmVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(532974891);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(dxmVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40Var, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarN2 = s5x0.N(new x7z(1.0f, true), 0.0f, 0.0f, 8.0f, 0.0f, 11);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
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
            jm40 jm40Var = jm40.b;
            B(o7k0.e(s5x0.N(jm40Var, 0.0f, 16.0f, 0.0f, 4.0f, 5), 24.0f), dxmVar.f6853a, fetVar, 0);
            B(o7k0.e(jm40Var, 24.0f), dxmVar.b, fetVar, 0);
            fetVar.r(true);
            v(jm40Var, dxmVar.c, dxmVar.d, fetVar, 6);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 13, i, mm40Var, dxmVar);
        }
    }

    public static final void s(mm40 mm40Var, l2n l2nVar, l2n l2nVar2, String str, String str2, String str3, fet fetVar, int i) {
        int i2;
        String str4;
        mm40 mm40Var2;
        boolean z;
        boolean z2;
        str.getClass();
        str3.getClass();
        fetVar.g0(1434432358);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l2nVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(l2nVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            str4 = str3;
            i2 |= fetVar.g(str4) ? 131072 : 65536;
        } else {
            str4 = str3;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            if (str4.length() <= 0 && str2.length() <= 0 && str.length() <= 0) {
                z2 = true;
                mm40Var2 = null;
                fetVar.e0(-1054536174);
                fetVar.r(false);
            } else {
                fetVar.e0(-1055206952);
                mm40 mm40VarE = o7k0.e(o7k0.d(jm40.b, 1.0f), 16.0f);
                thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar);
                jpm0.o(fetVar, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar4);
                if (str3.length() > 0) {
                    fetVar.e0(1989412912);
                    int i4 = ((i3 >> 15) & 14) | 48;
                    mm40Var2 = null;
                    z2 = true;
                    j6n.h(str3, oro0.f25744a, null, 0, 0, fetVar, i4, 28);
                    z = false;
                    fetVar.r(false);
                } else {
                    mm40Var2 = null;
                    z = false;
                    z2 = true;
                    fetVar.e0(1989598385);
                    fetVar.r(false);
                }
                x((i3 >> 6) & 1008, fetVar, mm40Var2, str, str2);
                fetVar.r(z2);
                fetVar.r(z);
            }
            C(mm40Var2, l2nVar, fetVar, i3 & 112);
            C(mm40Var2, l2nVar2, fetVar, (i3 >> 3) & 112);
            fetVar.r(z2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cg0((Object) mm40Var, (Object) l2nVar, (Object) l2nVar2, (Object) str, (Object) str2, (Object) str3, i, (byte) 20);
        }
    }

    public static final void t(l6o0 l6o0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-59411818);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(l6o0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 12;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = twn.s(fetVar);
            }
            List list = (List) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = t5o.f33377a;
                fetVar.o0(objP2);
            }
            xdr xdrVar = (xdr) ((jhy) objP2);
            boolean zI = fetVar.i(context) | ((i2 & 14) == 4) | fetVar.i(list);
            Object objP3 = fetVar.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new f8m(context, l6o0Var, list, b);
                fetVar.o0(objP3);
            }
            y860.f(xdrVar, null, (Function1) objP3, fetVar, 6, 2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(l6o0Var, i, b);
        }
    }

    public static final void u(mm40 mm40Var, nfo nfoVar, rim rimVar, v3n v3nVar, Function1 function1, fet fetVar, int i) {
        int i2;
        boolean z;
        lnm lnmVar = rimVar.c;
        function1.getClass();
        fetVar.g0(-24006670);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.e(nfoVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(rimVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(v3nVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            String str = lnmVar.b;
            if (str.length() == 0) {
                x6n x6nVar = rimVar.f;
                str = x6nVar != null ? x6nVar.b : null;
                if (str == null) {
                    str = "";
                }
            }
            String str2 = lnmVar.f;
            int i3 = 57344 & i2;
            boolean z2 = ((i2 & 896) == 256) | (i3 == 16384);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z2 || objP == obj) {
                objP = new gnm(function1, rimVar, (byte) 27);
                fetVar.o0(objP);
            }
            int i4 = i2 << 6;
            kbc.q(null, str, str2, nfoVar, true, v3nVar, (Function0) objP, fetVar, (458752 & i4) | (i4 & 7168) | 24576);
            lnm lnmVar2 = rimVar.d;
            if (lnmVar2 == null) {
                fetVar.e0(599632134);
                fetVar.r(false);
                z = true;
            } else {
                fetVar.e0(599632135);
                String str3 = lnmVar2.b;
                String str4 = lnmVar2.f;
                boolean z3 = !rimVar.i;
                boolean zI = fetVar.i(lnmVar2) | (i3 == 16384);
                Object objP2 = fetVar.P();
                if (zI || objP2 == obj) {
                    objP2 = new gnm(function1, lnmVar2, (byte) 28);
                    fetVar.o0(objP2);
                }
                z = true;
                kbc.q(null, str3, str4, nfoVar, z3, v3nVar, (Function0) objP2, fetVar, i4 & 465920);
                fetVar.r(false);
            }
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rfo(mm40Var, nfoVar, rimVar, v3nVar, function1, i, (byte) 3);
        }
    }

    public static final void v(mm40 mm40Var, a4x a4xVar, azp azpVar, fet fetVar, int i) {
        jm40 jm40Var;
        boolean z;
        azp azpVar2 = azpVar;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        mw3 mw3Var = uc9.c;
        xx7 xx7Var = gqw0.n;
        fetVar2.g0(1270010669);
        int i2 = i | (fetVar2.g(a4xVar) ? 32 : 16) | (fetVar2.g(azpVar2) ? 256 : 128);
        boolean z2 = true;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
            Iterator itO = h97.o(fetVar2, mm40VarC0, shdVar, -1748916360, a4xVar);
            while (true) {
                boolean zHasNext = itO.hasNext();
                jm40Var = jm40.b;
                if (!zHasNext) {
                    break;
                }
                bzp bzpVar = (bzp) itO.next();
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarS = o7k0.s(jm40Var, 32.0f);
                x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 48);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarS);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA, shdVar4);
                jpm0.o(fetVar2, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar);
                String str = bzpVar.f3481a;
                tip0 tip0Var = bzpVar.c;
                tip0 tip0Var2 = bzpVar.b;
                boolean zG = fetVar2.g(str);
                Object objP = fetVar2.P();
                if (zG || objP == ukd.f35823a) {
                    String str2 = bzpVar.f3481a;
                    z = true;
                    objP = ttm0.L(1, str2);
                    fetVar2.o0(objP);
                } else {
                    z = true;
                }
                shd shdVar5 = shdVar3;
                v8q0.a((String) objP, o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), 1.0f), 12.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                tip0 tip0VarY0 = ibc.y0(tip0Var2, tip0Var, fetVar2);
                tip0 tip0VarY1 = ibc.y0(tip0Var, tip0Var2, fetVar2);
                sac.p(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), fbc.Y(tip0VarY0, fetVar2), fetVar2, 0, 0);
                sac.p(jm40Var, fbc.Y(tip0VarY1, fetVar2), fetVar2, 6, 0);
                fetVar2.r(true);
                xx7Var = xx7Var;
                z2 = true;
                shdVar = shdVar;
                shdVar2 = shdVar2;
                shdVar4 = shdVar4;
                mw3Var = mw3Var;
                shdVar3 = shdVar5;
                pcyVar = pcyVar;
            }
            shd shdVar6 = shdVar;
            shd shdVar7 = shdVar2;
            shd shdVar8 = shdVar3;
            shd shdVar9 = shdVar4;
            pcy pcyVar2 = pcyVar;
            boolean z4 = z2;
            fetVar2.r(false);
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarS2 = o7k0.s(jm40Var, 32.0f);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 48);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarS2);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar9);
            jpm0.o(fetVar2, bh90VarM3, shdVar8);
            vqd.u(iHashCode3, fetVar2, shdVar7, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar6);
            azpVar2 = azpVar;
            String str3 = azpVar2.f1729a;
            oip0 oip0Var = azpVar2.c;
            oip0 oip0Var2 = azpVar2.b;
            v8q0.a(str3, o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), 1.0f), 12.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            pzb.n(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7), ttm0.L(z4 ? 1 : 0, oip0Var2.f25323a), new y3d(ibc.f0(oip0Var2.b, fetVar2)), fetVar2, 0, 0);
            pzb.n(jm40Var, ttm0.L(z4 ? 1 : 0, oip0Var.f25323a), new y3d(ibc.f0(oip0Var.b, fetVar2)), fetVar2, 6, 0);
            fetVar2.r(z4);
            fetVar2.r(z4);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zwm(mm40Var, a4xVar, azpVar2, i, (byte) 3);
        }
    }

    public static final void w(mm40 mm40Var, long j, long j2, Function0 function0, fet fetVar, int i) {
        function0.getClass();
        fetVar.g0(1825732449);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.f(j) ? 32 : 16) | (fetVar.f(j2) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(o7k0.n(mm40Var, 32.0f), j2, vgg0.a(14.0f));
            boolean z = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dbn(function0, (byte) 9);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarQ, null, null, true, null, (Function0) objP, 8);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            dww.c(a8k0.F(R.drawable.ic_glyph_filter_line_inactive, 0, fetVar), null, o7k0.n(jr8.f16991a.b(jm40.b, gqw0.e), 20.0f), j, fetVar, 56 | ((i2 << 6) & 7168), 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new c3q(mm40Var, j, j2, function0, i, (byte) 0);
        }
    }

    public static final void x(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        mm40 mm40Var2;
        fetVar.g0(-482547321);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            StringBuilder sb = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            sb.append(str2);
            if (str.length() > 0 && str2.length() > 0) {
                sb.append(", ");
            }
            sb.append(str);
            String string = sb.toString();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(((g83) arrayList.get(i3)).a(sb.length()));
            }
            j83 j83Var = new j83(string, arrayList2);
            int length = str.length();
            jm40 jm40Var = jm40.b;
            if (length <= 0 && str2.length() <= 0) {
                fetVar.e0(-311083173);
                fetVar.r(false);
            } else {
                fetVar.e0(-311331297);
                v8q0.b(j83Var, jm40Var, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar, (i2 << 3) & 112, 24960, 241656);
                fetVar.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nd8(mm40Var2, str, str2, i, (byte) 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0256  */
    public static final void y(xk80 xk80Var, final l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        boolean z;
        a4x a4xVarR0;
        a4x a4xVar;
        a4x a4xVar2;
        fet fetVar2 = fetVar;
        xk80Var.getClass();
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(424818534);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(xk80Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            final long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
            final long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP);
            }
            vne vneVar = (vne) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = jgk0.b(new Function0() { // from class: a.byj
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        l7m0 l7m0Var2 = l7m0Var;
                        gkw gkwVar = (gkw) l7m0Var2.getValue();
                        long j = secondary;
                        sa50 pa50Var = ra50.f30118a;
                        wkm wkmVar = null;
                        wkm wkmVar2 = (gkwVar == null || !gkwVar.f) ? null : new wkm(1, R.drawable.ic_glyph_calendar_inactive, true, pa50Var, j);
                        gkw gkwVar2 = (gkw) l7m0Var2.getValue();
                        if (gkwVar2 != null && gkwVar2.d) {
                            gkw gkwVar3 = (gkw) l7m0Var2.getValue();
                            if (gkwVar3 != null && gkwVar3.e) {
                                pa50Var = new pa50(new pf5(2, new y3d(backgroundContent)));
                            }
                            wkmVar = new wkm(2, R.drawable.ic_glyph_gift, true, pa50Var, j);
                        }
                        if (wkmVar2 != null && wkmVar != null) {
                            return new dmm(new va50(wkmVar2, wkmVar));
                        }
                        if (wkmVar2 != null) {
                            return new dmm(new ta50(wkmVar2));
                        }
                        return wkmVar != null ? new dmm(new ta50(wkmVar)) : fmm.f9790a;
                    }
                });
                fetVar2.o0(objP2);
                zfnVar = zfnVar;
            }
            l7m0 l7m0Var2 = (l7m0) objP2;
            Unit unit = Unit.f46060a;
            int i4 = i3 & 112;
            int i5 = i3 & 14;
            boolean zI = (i4 == 32) | (i5 == 4) | fetVar2.i(vneVar);
            Object objP3 = fetVar2.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new fyj(r3, xk80Var, vneVar, null);
                fetVar2.o0(objP3);
            }
            m0x0.t(fetVar2, unit, (Function2) objP3);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o050.W(i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            imm immVar = new imm(new ilm(((ThemeColors) fetVar2.k(zfnVar)).getSecondary()), new plm(rsm0.w(R.string.cyber_sport, 0, fetVar2), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fa50.f9191a), (gmm) l7m0Var2.getValue(), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), false, null);
            int i6 = i3 & 896;
            boolean z2 = i6 == 256;
            Object objP4 = fetVar2.P();
            if (z2 || objP4 == cl5Var) {
                objP4 = new ouh(function1, (byte) 15);
                fetVar2.o0(objP4);
            }
            Function0 function0 = (Function0) objP4;
            boolean z3 = i6 == 256;
            Object objP5 = fetVar2.P();
            if (z3 || objP5 == cl5Var) {
                objP5 = new olh(function1, (byte) 25);
                fetVar2.o0(objP5);
            }
            hlm.c(mm40VarD, immVar, null, function0, null, (Function1) objP5, null, null, null, null, null, null, fetVar2, 6, 0, 4052);
            gkw gkwVar = (gkw) r3.getValue();
            if (((gkwVar == null || (a4xVar2 = gkwVar.b) == null) ? 0 : a4xVar2.size()) > 1) {
                fetVar2.e0(996376492);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarJ = s5x0.J(mm40VarD2, 8.0f);
                gkw gkwVar2 = (gkw) r3.getValue();
                if (gkwVar2 == null || (a4xVar = gkwVar2.b) == null) {
                    a4xVarR0 = lak0.c;
                } else {
                    ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
                    Iterator<E> it = a4xVar.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new yvh0(((ekw) it.next()).b, bwh0.f3325a));
                    }
                    a4xVarR0 = dyb.r0(arrayList);
                    if (a4xVarR0 == null) {
                        a4xVarR0 = lak0.c;
                    }
                }
                a4x a4xVar3 = a4xVarR0;
                gkw gkwVar3 = (gkw) l7m0Var.getValue();
                dxh0 dxh0Var = gkwVar3 != null ? gkwVar3.g : axh0.f1625a;
                a6g a6gVar = new a6g(xk80Var, xk80.class, "currentPage", "getCurrentPage()I", 0, (byte) 4);
                boolean zI2 = (i5 == 4) | fetVar2.i(vneVar) | (i4 == 32) | (i6 == 256);
                Object objP6 = fetVar2.P();
                if (zI2 || objP6 == cl5Var) {
                    cyj cyjVar = new cyj(xk80Var, vneVar, l7m0Var, function1, (byte) 0);
                    fetVar2.o0(cyjVar);
                    objP6 = cyjVar;
                }
                z = true;
                ibc.n(mm40VarJ, a4xVar3, gxh0.f12078a, dxh0Var, false, a6gVar, (Function1) objP6, fetVar, 384, 16);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z = true;
                fetVar2 = fetVar2;
                fetVar2.e0(997733734);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dyj(xk80Var, l7m0Var, function1, i, (byte) 0);
        }
    }

    public static final void z(mm40 mm40Var, String str, Function1 function1, fet fetVar, int i) {
        fetVar.g0(-503346360);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 40.0f);
            nul nulVar = nul.e;
            oe9 oe9Var = oe9.c;
            String upperCase = rsm0.w(R.string.participant_card, 0, fetVar).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            wul wulVar = new wul(nulVar, oe9Var, new ue9(upperCase), true, false, false);
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new cpw(b, str, function1);
                fetVar.o0(objP);
            }
            qzb.n(mm40VarE, wulVar, (Function0) objP, fetVar, 0, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(mm40Var, str, function1, i, (byte) 14);
        }
    }
}
