package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.gov.nist.core.Separators;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleTwoTeams;

/* JADX INFO: loaded from: classes4.dex */
public abstract class plc {
    public static Drawable A(Drawable drawable, Drawable drawable2, int i, int i2) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i == -1 && (i = drawable2.getIntrinsicWidth()) == -1) {
            i = drawable.getIntrinsicWidth();
        }
        if (i2 == -1 && (i2 = drawable2.getIntrinsicHeight()) == -1) {
            i2 = drawable.getIntrinsicHeight();
        }
        if (i > drawable.getIntrinsicWidth() || i2 > drawable.getIntrinsicHeight()) {
            float f = i / i2;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i2 = (int) (intrinsicWidth / f);
                i = intrinsicWidth;
            } else {
                i2 = drawable.getIntrinsicHeight();
                i = (int) (f * i2);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i, i2);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static final i4 B(e2p e2pVar, ctf0 ctf0Var, mdm mdmVar) {
        Object next;
        String strA;
        e2p e2pVar2 = e2pVar;
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(new jun(mdmVar));
        List<j8b> list = e2pVar2.i;
        ot0 ot0Var = e2pVar2.k;
        for (j8b j8bVar : list) {
            c0o c0oVar = s0s.h;
            y2 y2VarH = ohs0.h(c0oVar, c0oVar);
            do {
                if (!y2VarH.hasNext()) {
                    next = null;
                    break;
                }
                next = y2VarH.next();
            } while (((s0s) next).f31424a != j8bVar.f16074a);
            s0s s0sVar = (s0s) next;
            if (s0sVar == null) {
                s0sVar = s0s.UNKNOWN;
            }
            s0s s0sVar2 = s0sVar;
            int iOrdinal = s0sVar2.ordinal();
            if (iOrdinal == 0) {
                strA = ctf0Var.b.a(R.string.aggregator_one_x_live, Arrays.copyOf(new Object[0], 0));
            } else if (iOrdinal == 1) {
                strA = ctf0Var.b.a(R.string.slots_popular, Arrays.copyOf(new Object[0], 0));
            } else if (iOrdinal != 2) {
                strA = iOrdinal != 3 ? j8bVar.b : ctf0Var.b.a(R.string.live_casino_popular, Arrays.copyOf(new Object[0], 0));
            } else {
                strA = ctf0Var.b.a(R.string.recommendation, Arrays.copyOf(new Object[0], 0));
            }
            if (strA.length() > 0) {
                lc00VarB.add(new uh0(strA));
                pt0 pt0VarG0 = x4d0.g0(ot0Var);
                wll wllVar = new wll(o0s.f24443a);
                List list2 = j8bVar.c;
                ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(unh0.l0((mlr) it.next(), ctf0Var, e2pVar2.e, e2pVar2.h, false, x4d0.g0(ot0Var), Integer.valueOf((int) s0sVar2.f31424a)));
                    e2pVar2 = e2pVar;
                    ctf0Var = ctf0Var;
                }
                lc00VarB.add(new th0(new zll(pt0VarG0, wllVar, arrayList)));
            }
            e2pVar2 = e2pVar;
        }
        return dyb.r0(kotlin.collections.a.a(lc00VarB));
    }

    public static Drawable C(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    public static qlc D(String str, boolean z) {
        String strR;
        str.getClass();
        int iU = StringsKt.U('`', 0, 6, str);
        if (iU == -1) {
            iU = str.length();
        }
        int iY = StringsKt.Y(iU, str, 4, Separators.SLASH);
        String str2 = "";
        if (iY == -1) {
            strR = kotlin.text.c.r(str, "`", "", false);
        } else {
            String strReplace = str.substring(0, iY).replace('/', '.');
            strReplace.getClass();
            strR = kotlin.text.c.r(str.substring(iY + 1), "`", "", false);
            str2 = strReplace;
        }
        return new qlc(new swq(str2), new swq(strR), z);
    }

    public static int[] E(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    public static ColorStateList F(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !y5a.u(drawable)) {
            return null;
        }
        return y5a.h(drawable).getColorStateList();
    }

    public static final dfa0 G(nrf nrfVar, nrf nrfVar2) {
        String str = nrfVar.b;
        ffa0 ffa0VarE = uvw.E(nrfVar.c, nrfVar2.c, "");
        ffa0 ffa0VarE2 = uvw.E(nrfVar.d, nrfVar2.d, "");
        ffa0 ffa0VarG = uvw.G(nrfVar.e, nrfVar2.e);
        Float f = nrfVar.f;
        return new dfa0(dyb.g0(ffa0VarE, ffa0VarE2, ffa0VarG, uvw.E(f, nrfVar2.f, f != null ? Separators.PERCENT : ""), uvw.E(nrfVar.g, nrfVar2.g, ""), uvw.E(nrfVar.h, nrfVar2.h, "")), str);
    }

    public static final boolean H(i0w i0wVar) {
        i0wVar.getClass();
        return i0wVar == i0w.f13966a || i0wVar == i0w.b;
    }

    public static final int I(i0w i0wVar, boolean z) {
        i0wVar.getClass();
        if (z && i0wVar != i0w.i) {
            return R.string.history_bet_rate_partially_sold_no_colon;
        }
        i0wVar.getClass();
        return j0w.f15701a[i0wVar.ordinal()] == 1 ? R.string.credited_to_account_no_colon : R.string.pf_bet;
    }

    public static final y3d J(i0w i0wVar) {
        int iOrdinal = i0wVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            pz40 pz40Var = s6t0.f31722a;
            return new y3d(s6t0.b().f33626a.getTextPrimary());
        }
        if (iOrdinal != 3 && iOrdinal != 4) {
            return null;
        }
        pz40 pz40Var2 = s6t0.f31722a;
        return new y3d(StaticColors.INSTANCE.m98getGreen0d7_KjU());
    }

    public static final void K(n5a n5aVar, yje yjeVar, boolean z) {
        Object objF;
        Object objQ = n5aVar.q();
        Throwable thE = n5aVar.e(objQ);
        if (thE != null) {
            e0g0 e0g0Var = j0g0.b;
            objF = new g0g0(thE);
        } else {
            e0g0 e0g0Var2 = j0g0.b;
            objF = n5aVar.f(objQ);
        }
        if (!z) {
            yjeVar.resumeWith(objF);
            return;
        }
        yjeVar.getClass();
        nvk nvkVar = (nvk) yjeVar;
        zje zjeVar = nvkVar.e;
        Object obj = nvkVar.g;
        CoroutineContext context = zjeVar.getContext();
        Object objC = ecq0.c(context, obj);
        o7t0 o7t0VarC = objC != ecq0.f7579a ? jne.c(zjeVar, context, objC) : null;
        try {
            zjeVar.resumeWith(objF);
        } finally {
            if (o7t0VarC == null || o7t0VarC.f0()) {
                ecq0.a(context, objC);
            }
        }
    }

    public static void L(Outline outline, Path path) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            phl.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                ohl.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            ohl.a(outline, path);
        }
    }

    public static final qgg M(fmb fmbVar) {
        tzw tzwVar;
        tzw tzwVar2;
        tzw tzwVar3;
        tzw tzwVar4;
        Long l;
        long jLongValue = (fmbVar == null || (l = fmbVar.f9771a) == null) ? 0L : l.longValue();
        String str = null;
        String str2 = (fmbVar == null || (tzwVar4 = fmbVar.b) == null) ? null : tzwVar4.f34824a;
        String str3 = (fmbVar == null || (tzwVar3 = fmbVar.b) == null) ? null : tzwVar3.b;
        String str4 = (fmbVar == null || (tzwVar2 = fmbVar.b) == null) ? null : tzwVar2.c;
        if (fmbVar != null && (tzwVar = fmbVar.b) != null) {
            str = tzwVar.d;
        }
        return new qgg(str2, str3, str4, str, jLongValue);
    }

    public static final String N(m9s m9sVar, boolean z, String str) {
        int i = 0;
        if (z) {
            long j = m9sVar.o;
            String str2 = m9sVar.h.f29180a;
            if (j != zwg.d.b || str.length() <= 0) {
                if (msm0.j(str)) {
                    while (i < str.length()) {
                        if (Intrinsics.d(String.valueOf(str.charAt(i)), "№")) {
                            return kng0.l("\u2066", str, "\u2069");
                        }
                        i++;
                    }
                    str = "№".concat(str);
                    return kng0.l("\u2066", str, "\u2069");
                }
                if (str.length() <= 0) {
                    return (str2.length() <= 0 || dyb.e0(m9sVar.v) || m9sVar.o != kvg.d.b) ? "" : str2;
                }
            }
        } else {
            if (msm0.j(str)) {
                while (true) {
                    if (i >= str.length()) {
                        if (m9sVar.p != 1) {
                            break;
                        }
                        return cy7.c() ? "№".concat(str) : str.concat("№");
                    }
                    if (Intrinsics.d(String.valueOf(str.charAt(i)), "№")) {
                        break;
                    }
                    i++;
                }
            }
            long j2 = m9sVar.p;
            cqg cqgVar = m9sVar.I;
            if (j2 == 46 && (cqgVar instanceof fof)) {
                irf irfVar = ((fof) cqgVar).f9878a;
                if (irfVar.c.length() > 0) {
                    return irfVar.c;
                }
            }
        }
        return str;
    }

    public static final gcq O(jcq jcqVar) {
        fcq fcqVar;
        jcqVar.getClass();
        Integer num = jcqVar.f16289a;
        if (num == null) {
            jf4.k(null);
            return null;
        }
        int iIntValue = num.intValue();
        String str = jcqVar.b;
        if (str == null) {
            str = "";
        }
        Integer num2 = jcqVar.c;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        xak xakVar = fcq.f9322a;
        int iIntValue3 = num.intValue();
        xakVar.getClass();
        switch (iIntValue3) {
            case 1502:
                fcqVar = fcq.e;
                break;
            case 1503:
                fcqVar = fcq.d;
                break;
            case 1504:
                fcqVar = fcq.c;
                break;
            default:
                fcqVar = fcq.b;
                break;
        }
        return new gcq(iIntValue, str, iIntValue2, fcqVar);
    }

    public static final gcq P(jcq jcqVar) {
        fcq fcqVar;
        Integer num;
        Integer num2;
        int iIntValue = 0;
        int iIntValue2 = (jcqVar == null || (num2 = jcqVar.f16289a) == null) ? 0 : num2.intValue();
        String str = jcqVar != null ? jcqVar.b : null;
        if (str == null) {
            str = "";
        }
        if (jcqVar != null && (num = jcqVar.c) != null) {
            iIntValue = num.intValue();
        }
        fcq.f9322a.getClass();
        switch (iIntValue2) {
            case 1502:
                fcqVar = fcq.e;
                break;
            case 1503:
                fcqVar = fcq.d;
                break;
            case 1504:
                fcqVar = fcq.c;
                break;
            default:
                fcqVar = fcq.b;
                break;
        }
        return new gcq(iIntValue2, str, iIntValue, fcqVar);
    }

    public static final h8r Q(r8r r8rVar) {
        r8rVar.getClass();
        Double d = r8rVar.f30041a;
        if (d == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue = d.doubleValue();
        String str = r8rVar.b;
        if (str != null) {
            return new h8r(str, dDoubleValue);
        }
        jf4.k(null);
        return null;
    }

    public static final String R(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    public static qlc S(swq swqVar) {
        swqVar.getClass();
        return new qlc(swqVar.b(), swqVar.f32934a.g());
    }

    public static final void a(mm40 mm40Var, a4x a4xVar, y9q0 y9q0Var, long j, int i, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        xx7 xx7Var = gqw0.m;
        fetVar2.g0(408145543);
        y9q0 y9q0Var2 = y9q0Var;
        int i3 = i2 | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(a4xVar) ? 32 : 16) | (fetVar2.g(y9q0Var2) ? 256 : 128) | (fetVar2.f(j) ? 2048 : 1024) | (fetVar2.e(i) ? 16384 : 8192);
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 248.0f);
            x5d x5dVarA = w5d.a(uc9.c, xx7Var, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
            Iterator itO = h97.o(fetVar2, mm40VarC0, shdVar, -1220019674, a4xVar);
            while (itO.hasNext()) {
                String str = (String) itO.next();
                x7z x7zVar = new x7z(1.0f, true);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(x7zVar, 0.0f, 8.0f, 1);
                x5d x5dVarA2 = w5d.a(new qw3(16.0f, false, new gne(gqw0.k, (byte) 11)), xx7Var, fetVar2, 0);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA2, shdVar4);
                jpm0.o(fetVar2, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar);
                jm40 jm40Var = jm40.b;
                mm40 mm40VarE2 = o7k0.e(o7k0.d(jm40Var, 1.0f), 30.0f);
                tj30 tj30VarC = zq8.c(gqw0.e, false);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE2);
                fetVar2.i0();
                xx7 xx7Var2 = xx7Var;
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC, shdVar4);
                jpm0.o(fetVar2, bh90VarM3, shdVar3);
                vqd.u(iHashCode3, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC2, shdVar);
                fet fetVar3 = fetVar2;
                v8q0.a(str, o7k0.d(jm40Var, 1.0f), j, null, 0L, null, null, null, 0L, new f2q0(i), 0L, 2, false, 2, 0, null, y9q0Var2, fetVar3, ((i3 >> 3) & 896) | 48, ((i3 >> 12) & 14) | 24960 | ((i3 << 15) & 29360128), 109560);
                fetVar2 = fetVar3;
                fetVar2.r(true);
                mbc.o(wfi0.f39073a, null, false, fetVar2, 6, 6);
                fetVar2.r(true);
                y9q0Var2 = y9q0Var;
                xx7Var = xx7Var2;
                i3 = i3;
                pcyVar = pcyVar;
                shdVar = shdVar;
            }
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fqh(mm40Var, a4xVar, y9q0Var, j, i, i2);
        }
    }

    public static final CancellationException b(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final void c(mm40 mm40Var, fdm fdmVar, Function0 function0, fet fetVar, int i) {
        fetVar.g0(-1272633288);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(fdmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarC = o7k0.c(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(mm40VarC, vgg0.a(16.0f));
            ((ijg) fetVar.k(jjg.f16616a)).getClass();
            mm40 mm40VarW = y860.W(phu0.H(i120.Q(mm40VarJ, ijg.m, jd8.n), null, 1), null, null, false, null, function0, 28);
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
            wx7 wx7Var = aad.c;
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            t(jr8Var.b(jm40Var, wx7Var), fdmVar, fetVar, i2 & 112);
            r(0, fetVar, jr8Var.b(jm40Var, gqw0.g), fdmVar.b);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(mm40Var, fdmVar, function0, i, (byte) 2);
        }
    }

    public static final void d(mm40 mm40Var, j43 j43Var, k43 k43Var, fet fetVar, int i, int i2) {
        int i3;
        mm40 mm40Var2;
        fetVar.g0(-581106647);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (fetVar.g(j43Var) ? 32 : 16) | (fetVar.g(k43Var) ? 256 : 128);
        if (fetVar.U(i5 & 1, (i5 & 147) != 146)) {
            mm40Var2 = i4 != 0 ? jm40.b : mm40Var;
            if (k43Var instanceof fxe) {
                fetVar.e0(1265382682);
                w9x.z(mm40Var2, j43Var, k43Var, fetVar, i5 & 1022);
                fetVar.r(false);
            } else if (k43Var instanceof exe) {
                fetVar.e0(1265713948);
                kkb.q(mm40Var2, j43Var, k43Var, fetVar, i5 & 1022);
                fetVar.r(false);
            } else {
                fetVar.e0(1265963033);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dxe(mm40Var2, (Object) j43Var, (Object) k43Var, i, i2, (byte) 0);
        }
    }

    public static final void e(mm40 mm40Var, final l9d l9dVar, fet fetVar, int i) {
        l9dVar.getClass();
        fetVar.g0(-1767598993);
        final byte b = 2;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(l9dVar) ? 32 : 16);
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            final mm40 mm40VarW = o7k0.w(o7k0.e(s5x0.N(jm40.b, 4.0f, 0.0f, 0.0f, 0.0f, 14), 40.0f), null, false, 3);
            mbc.f(mm40Var, 0.0f, 0.0f, u1c.M(1741249620, new xdr() { // from class: a.f9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b4 = b2;
                    jm40 jm40Var = jm40.b;
                    l9d l9dVar2 = l9dVar;
                    switch (b4) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 6.0f, 4.0f, 6.0f, 1), 24.0f), l9dVar2.b);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_placeholder_player_secondary60, 0, fetVar3);
                                zcl zclVar3 = qmk.f28987a;
                                mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
                                zcl zclVar4 = qmk.e;
                                ugg0 ugg0Var = vgg0.f37379a;
                                k7x.b(l9dVar2.c, null, h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarN), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                mm40 mm40VarA = o7k0.A(s5x0.K(jm40Var, 12.0f, 6.0f), null, 3);
                                String str = l9dVar2.d;
                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarA, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, g1t0.n(), fetVar4, 0, 0, 130040);
                            } else {
                                fetVar4.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-842439309, new xdr() { // from class: a.f9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b4 = b3;
                    jm40 jm40Var = jm40.b;
                    l9d l9dVar2 = l9dVar;
                    switch (b4) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 6.0f, 4.0f, 6.0f, 1), 24.0f), l9dVar2.b);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_placeholder_player_secondary60, 0, fetVar3);
                                zcl zclVar3 = qmk.f28987a;
                                mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
                                zcl zclVar4 = qmk.e;
                                ugg0 ugg0Var = vgg0.f37379a;
                                k7x.b(l9dVar2.c, null, h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarN), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                mm40 mm40VarA = o7k0.A(s5x0.K(jm40Var, 12.0f, 6.0f), null, 3);
                                String str = l9dVar2.d;
                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarA, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, g1t0.n(), fetVar4, 0, 0, 130040);
                            } else {
                                fetVar4.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(868839058, new xdr() { // from class: a.f9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b4 = b;
                    jm40 jm40Var = jm40.b;
                    l9d l9dVar2 = l9dVar;
                    switch (b4) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 6.0f, 4.0f, 6.0f, 1), 24.0f), l9dVar2.b);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        case 1:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_placeholder_player_secondary60, 0, fetVar3);
                                zcl zclVar3 = qmk.f28987a;
                                mm40 mm40VarN = o7k0.n(jm40Var, 40.0f);
                                zcl zclVar4 = qmk.e;
                                ugg0 ugg0Var = vgg0.f37379a;
                                k7x.b(l9dVar2.c, null, h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarN), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        default:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                mm40 mm40VarA = o7k0.A(s5x0.K(jm40Var, 12.0f, 6.0f), null, 3);
                                String str = l9dVar2.d;
                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarA, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, g1t0.n(), fetVar4, 0, 0, 130040);
                            } else {
                                fetVar4.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), null, null, null, u1c.M(-507037263, new xdr() { // from class: a.g9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b4 = b2;
                    l9d l9dVar2 = l9dVar;
                    mm40 mm40Var2 = mm40VarW;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b4) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, l9dVar2.e.f17910a), l9dVar2.e.b);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, l9dVar2.f.f17910a), l9dVar2.f.a());
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(1204241104, new xdr() { // from class: a.g9d
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b4 = b3;
                    l9d l9dVar2 = l9dVar;
                    mm40 mm40Var2 = mm40VarW;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b4) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, l9dVar2.e.f17910a), l9dVar2.e.b);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x2x.u(0, 0, fetVar2, o7k0.s(mm40Var2, l9dVar2.f.f17910a), l9dVar2.f.a());
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, (i2 & 14) | 14352384, 432, 1822);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kea(mm40Var, l9dVar, i, (byte) 24);
        }
    }

    public static final void f(final mm40 mm40Var, final kqh kqhVar, fet fetVar, final int i) {
        int i2;
        yfe0 yfe0VarU;
        Function2 function2;
        kqhVar.getClass();
        fetVar.g0(-840956164);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(kqhVar) ? 32 : 16;
        }
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            a4x a4xVarO0 = dyb.o0(CollectionsKt.D0(kqhVar.f18723a, 3));
            if (a4xVarO0.isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: a.eqh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b3 = b;
                            int i3 = i;
                            kqh kqhVar2 = kqhVar;
                            mm40 mm40Var2 = mm40Var;
                            fet fetVar2 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b3) {
                                case 0:
                                    plc.f(mm40Var2, kqhVar2, fetVar2, x8x.L(i3 | 1));
                                    break;
                                default:
                                    plc.f(mm40Var2, kqhVar2, fetVar2, x8x.L(i3 | 1));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                }
            } else {
                mm40 mm40VarV = vic.v(mm40Var);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarJ = s5x0.J(mm40VarV, 8.0f);
                thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar, 54);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
                ArrayList arrayList = new ArrayList(r3d.q(a4xVarO0, 10));
                Iterator<E> it = a4xVarO0.iterator();
                while (it.hasNext()) {
                    arrayList.add(((xoh) it.next()).b);
                }
                a4x a4xVarO1 = dyb.o0(arrayList);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                a(x7zVar, a4xVarO1, g1t0.g(), iph.f, 5, fetVar, 0);
                v3c.d(0, fetVar, a4xVarO0, null);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                ArrayList arrayList2 = new ArrayList(r3d.q(a4xVarO0, 10));
                Iterator<E> it2 = a4xVarO0.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((xoh) it2.next()).c);
                }
                a4x a4xVarO2 = dyb.o0(arrayList2);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                a(x7zVar2, a4xVarO2, g1t0.d(), iph.g, 6, fetVar, 0);
                fetVar.r(true);
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            function2 = new Function2() { // from class: a.eqh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    int i3 = i;
                    kqh kqhVar2 = kqhVar;
                    mm40 mm40Var2 = mm40Var;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b3) {
                        case 0:
                            plc.f(mm40Var2, kqhVar2, fetVar2, x8x.L(i3 | 1));
                            break;
                        default:
                            plc.f(mm40Var2, kqhVar2, fetVar2, x8x.L(i3 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void g(mm40 mm40Var, krl krlVar, fet fetVar, int i) {
        fetVar.g0(-463743833);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(krlVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = krlVar instanceof irl;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(1018781858);
                h(jm40Var, (irl) krlVar, fetVar, i2 & 126);
                fetVar.r(false);
            } else {
                if (!krlVar.equals(jrl.f17007a)) {
                    throw b1j.f(1018779675, fetVar, false);
                }
                fetVar.e0(1018785497);
                i(i2 & 14, fetVar, jm40Var);
                fetVar.r(false);
            }
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new crl(mm40Var, krlVar, i, (byte) 2);
        }
    }

    public static final void h(mm40 mm40Var, irl irlVar, fet fetVar, int i) {
        int i2;
        shd shdVar;
        shd shdVar2;
        jm40 jm40Var;
        irl irlVar2 = irlVar;
        fet fetVar2 = fetVar;
        fetVar2.g0(-883196594);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(irlVar2) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar3 = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar3);
            shd shdVar4 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar4);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar5 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar5);
            jpm0.n(fetVar2);
            shd shdVar6 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar6);
            int length = irlVar2.f15262a.length();
            jm40 jm40Var2 = jm40.b;
            if (length > 0) {
                fetVar2.e0(-273207755);
                zcl zclVar = qmk.f28987a;
                shdVar = shdVar4;
                jm40Var = jm40Var2;
                shdVar2 = shdVar5;
                nkb.h(s5x0.L(jm40Var2, 8.0f, 0.0f, 2), new hjm(irlVar2.f15262a, null, null, null, null, null, false, null, null, false, null, null, 8190), kjm.f18392a, null, null, null, fetVar2, 384, 56);
                fetVar2.r(false);
            } else {
                shdVar = shdVar4;
                shdVar2 = shdVar5;
                jm40Var = jm40Var2;
                fetVar2.e0(-272983842);
                fetVar2.r(false);
            }
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarE0 = o2e.e0(s5x0.J(i120.Q(mm40VarE, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n), 12.0f), "DS_AGGREGATOR_TOURNAMENT_RULES_STATIC_CONTENT_BOX");
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE0);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar3);
            jpm0.o(fetVar2, bh90VarM2, shdVar);
            vqd.u(iHashCode2, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar6);
            irlVar2 = irlVar;
            String str = irlVar2.b;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new erl(mm40Var, irlVar2, i, (byte) 2);
        }
    }

    public static final void i(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(311283289);
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
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 20.0f), 128.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), fqj0VarD0));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.d(o7k0.e(jm40Var, 256.0f), 1.0f)), fqj0VarD0, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:0x015a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0167  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void j(mm40 mm40Var, l7m0 l7m0Var, long j, String str, fet fetVar, int i, int i2) {
        String str2;
        boolean z;
        fet fetVar2;
        mm40 mm40Var2;
        String str3;
        yfe0 yfe0VarU;
        String str4;
        boolean z2;
        Object objP;
        l7m0Var.getClass();
        fetVar.g0(-1610267343);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.f(j) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                str2 = str;
                i3 |= fetVar.g(str2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                if (i4 != 0) {
                    str4 = "%02d";
                } else {
                    str4 = str2;
                }
                if ((i3 & 7168) == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = fetVar.P();
                if (z2 || objP == ukd.f35823a) {
                    objP = jgk0.b(new lrk(str4, l7m0Var, (byte) 14));
                    fetVar.o0(objP);
                }
                l7m0 l7m0Var2 = (l7m0) objP;
                zcl zclVar = qmk.f28987a;
                jm40 jm40Var = jm40.b;
                mm40 mm40VarE = s5x0.L(i120.S(o7k0.r(jm40Var, 18.0f, 16.0f, 0.0f, 4), 1.0f, ((ThemeColors) fetVar.k(zaq0.b)).getSeparator(), vgg0.a(4.0f)), 2.0f, 0.0f, 2).e(jm40Var);
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
                String str5 = (String) l7m0Var2.getValue();
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                mm40Var2 = jm40Var;
                v8q0.a(str5, null, j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.b(), fetVar, i3 & 896, 24576, 114682);
                fetVar2 = fetVar;
                fetVar2.r(true);
                str3 = str4;
            } else {
                fetVar2 = fetVar;
                fetVar2.X();
                mm40Var2 = mm40Var;
                str3 = str2;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new v1m(mm40Var2, l7m0Var, j, str3, i, i2);
            }
        }
        i3 |= 3072;
        str2 = str;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i3 & 1, z)) {
            if (i4 != 0) {
                str4 = "%02d";
            } else {
                str4 = str2;
            }
            if ((i3 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP = fetVar.P();
            if (z2) {
                objP = jgk0.b(new lrk(str4, l7m0Var, (byte) 14));
                fetVar.o0(objP);
            } else {
                objP = jgk0.b(new lrk(str4, l7m0Var, (byte) 14));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var3 = (l7m0) objP;
            zcl zclVar2 = qmk.f28987a;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarE2 = s5x0.L(i120.S(o7k0.r(jm40Var2, 18.0f, 16.0f, 0.0f, 4), 1.0f, ((ThemeColors) fetVar.k(zaq0.b)).getSeparator(), vgg0.a(4.0f)), 2.0f, 0.0f, 2).e(jm40Var2);
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE2);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            String str6 = (String) l7m0Var3.getValue();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            mm40Var2 = jm40Var2;
            v8q0.a(str6, null, j, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, g1t0.b(), fetVar, i3 & 896, 24576, 114682);
            fetVar2 = fetVar;
            fetVar2.r(true);
            str3 = str4;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
            str3 = str2;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v1m(mm40Var2, l7m0Var, j, str3, i, i2);
        }
    }

    public static final void k(mm40 mm40Var, d6l0 d6l0Var, boolean z, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(730093563);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(d6l0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new gnm(function1, d6l0Var, (byte) 5);
                fetVar.o0(objP);
            }
            a8k0.n(y860.W(mm40Var, null, null, false, null, (Function0) objP, 28), 16.0f, background, null, dwi0.f, u1c.M(826661691, new i3l(d6l0Var, (byte) 17), fetVar), u1c.M(-210348710, new igm((Object) d6l0Var, z, (Object) function1, (byte) 20), fetVar), fetVar, 1797120, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i4a0(mm40Var, (Object) d6l0Var, z, function1, i, (byte) 17);
        }
    }

    public static final void l(mm40 mm40Var, qxm qxmVar, boolean z, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1677884829);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(qxmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = bmd.n;
            k6z k6zVar = (k6z) fetVar.k(zfnVar);
            if (!z) {
                k6zVar = k6z.f17794a;
            }
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD, 12.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
            s(0, fetVar, null, qxmVar.f29491a);
            obc.d(zfnVar.a(k6zVar), u1c.M(942279405, new mxm(qxmVar, b), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02((byte) 21, i, mm40Var, (Object) qxmVar, z);
        }
    }

    public static final void m(mm40 mm40Var, x0g0 x0g0Var, boolean z, Function1 function1, fet fetVar, int i, int i2) {
        x0g0Var.getClass();
        function1.getClass();
        if ((i2 & 1) != 0) {
            mm40Var = jm40.b;
        }
        if (x0g0Var instanceof v0g0) {
            fetVar.e0(1954616110);
            obb.u(mm40Var, (v0g0) x0g0Var, z, function1, fetVar, i & 8190);
            fetVar.r(false);
            return;
        }
        mm40 mm40Var2 = mm40Var;
        if (!(x0g0Var instanceof w0g0)) {
            throw b1j.f(-491138723, fetVar, false);
        }
        fetVar.e0(1954792500);
        lmc.q(mm40Var2, ((w0g0) x0g0Var).b, fetVar, i & 14);
        fetVar.r(false);
    }

    public static final void n(mm40 mm40Var, String str, y9q0 y9q0Var, ugd ugdVar, fet fetVar, int i) {
        ugd ugdVar2;
        fet fetVar2;
        str.getClass();
        fetVar.g0(1283394691);
        byte b = 16;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(y9q0Var) ? 256 : 128) | (fetVar.d(4.0f) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = (i2 & 7168) == 2048;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new mu90(b);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.a(str, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0Var, fetVar, (i2 >> 3) & 14, ((i2 << 15) & 29360128) | 24960, 110590);
            fetVar2 = fetVar;
            ugdVar2 = ugdVar;
            twn.v(6, ugdVar2, fetVar2, true);
        } else {
            ugdVar2 = ugdVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 22, i, (Object) mm40Var, (Object) str, (Object) y9q0Var, (Object) ugdVar2);
        }
    }

    public static final void o(b8o0 b8o0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-801791267);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(b8o0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
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
                objP2 = e6o.f7294a;
                fetVar.o0(objP2);
            }
            xdr xdrVar = (xdr) ((jhy) objP2);
            byte b = 14;
            boolean zI = fetVar.i(context) | ((i2 & 14) == 4) | fetVar.i(list);
            Object objP3 = fetVar.P();
            if (zI || objP3 == cl5Var) {
                objP3 = new f8m(b8o0Var, context, list, b);
                fetVar.o0(objP3);
            }
            y860.f(xdrVar, null, (Function1) objP3, fetVar, 6, 2);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(b8o0Var, i, (byte) 23);
        }
    }

    public static final void p(uls ulsVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        ulsVar.getClass();
        tls tlsVar = ulsVar.f35889a;
        fetVar2.g0(-154835333);
        int i2 = i | (fetVar2.g(ulsVar) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.L(jm40Var, 8.0f, 0.0f, 2), 1.0f), 32.0f);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
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
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11);
            zhg0 zhg0Var = zhg0.f44392a;
            mm40 mm40VarA = zhg0Var.a(1.0f, mm40VarN, true);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar2, 54);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarA);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            tls tlsVar2 = ulsVar.b;
            String str = tlsVar.b;
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
            pge pgeVar = gqw0.f1;
            lgb.v(o7k0.n(jm40Var, 24.0f), o7k0.n(jm40Var, 24.0f), str, R.drawable.icon_globe_empty, jM123getWhite0d7_KjU, pgeVar, fetVar2, 196608, 0);
            v8q0.a(tlsVar.b, s5x0.N(zhg0Var.a(1.0f, jm40Var, true), 8.0f, 0.0f, 0.0f, 0.0f, 14), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.e(), fetVar, 0, 24960, 110584);
            u(kkg.k, fetVar, 0);
            fetVar.r(true);
            mm40 mm40VarA2 = zhg0Var.a(1.0f, s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), true);
            thg0 thg0VarA3 = shg0.a(uc9.b, yx7Var, fetVar, 54);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarA2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA3, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            u(kkg.l, fetVar, 0);
            v8q0.a(tlsVar2.b, s5x0.N(zhg0Var.a(1.0f, jm40Var, true), 0.0f, 0.0f, 8.0f, 0.0f, 11), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, g1t0.e(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            lgb.v(o7k0.n(jm40Var, 24.0f), o7k0.n(jm40Var, 24.0f), tlsVar2.f34162a, R.drawable.icon_globe_empty, staticColors.m123getWhite0d7_KjU(), pgeVar, fetVar2, 196608, 0);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jar(ulsVar, i, (byte) 16);
        }
    }

    public static final void q(final mm40 mm40Var, final aiv aivVar, final Function1 function1, final ugd ugdVar, fet fetVar, final int i) {
        yfe0 yfe0VarU;
        Function2 function2;
        fet fetVar2;
        kwj kwjVar;
        Function1 function3;
        boolean z;
        fet fetVar3;
        boolean z2;
        jm40 jm40Var;
        pcy pcyVar;
        fet fetVar4;
        fet fetVar5 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        xx7 xx7Var = gqw0.m;
        mw3 mw3Var = uc9.c;
        aivVar.getClass();
        function1.getClass();
        fetVar5.g0(1273770958);
        int i2 = i | (fetVar5.g(aivVar) ? 32 : 16) | (fetVar5.i(function1) ? 256 : 128);
        if (fetVar5.U(i2 & 1, (i2 & 1171) != 1170)) {
            a4x a4xVar = aivVar.c;
            hyl hylVar = aivVar.f944a;
            if (a4xVar.isEmpty()) {
                yfe0VarU = fetVar5.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b = 0;
                function2 = new Function2(mm40Var, aivVar, function1, ugdVar, i, b) { // from class: a.yhv

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ byte f42656a;
                    public final /* synthetic */ mm40 b;
                    public final /* synthetic */ aiv c;
                    public final /* synthetic */ Function1 d;
                    public final /* synthetic */ ugd e;

                    {
                        this.f42656a = b;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f42656a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iL = x8x.L(3079);
                                plc.q(this.b, this.c, this.d, this.e, (fet) obj, iL);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iL2 = x8x.L(3079);
                                plc.q(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                int size = a4xVar.size();
                jm40 jm40Var2 = jm40.b;
                pcy pcyVar2 = e7z.u1;
                cl5 cl5Var = ukd.f35823a;
                if (size == 1) {
                    fetVar5.e0(874882095);
                    x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar5, 0);
                    int iHashCode = Long.hashCode(fetVar5.T);
                    bh90 bh90VarM = fetVar5.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar5, mm40Var);
                    mkd.c0.getClass();
                    fetVar5.i0();
                    if (fetVar5.S) {
                        pcyVar = pcyVar2;
                        fetVar5.l(pcyVar);
                    } else {
                        pcyVar = pcyVar2;
                        fetVar5.r0();
                    }
                    jpm0.o(fetVar5, x5dVarA, shdVar4);
                    jpm0.o(fetVar5, bh90VarM, shdVar3);
                    vqd.u(iHashCode, fetVar5, shdVar2, fetVar5);
                    jpm0.o(fetVar5, mm40VarC0, shdVar);
                    if (hylVar == null) {
                        fetVar5.e0(1054345986);
                        fetVar5.r(false);
                        fetVar4 = fetVar5;
                    } else {
                        fetVar5.e0(1054345987);
                        mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
                        hyl hylVar2 = aivVar.f944a;
                        vxl vxlVar = vxl.f38204a;
                        boolean z3 = (i2 & 896) == 256;
                        Object objP = fetVar5.P();
                        if (z3 || objP == cl5Var) {
                            objP = new dht(function1, (byte) 9);
                            fetVar5.o0(objP);
                        }
                        ebc.r(mm40VarD, hylVar2, vxlVar, (Function1) objP, null, fetVar5, 390, 40);
                        fetVar4 = fetVar5;
                        fetVar4.r(false);
                    }
                    pcy pcyVar3 = pcyVar;
                    x7z x7zVar = new x7z(1.0f, true);
                    mm40 mm40VarN = jm40Var2;
                    if (hylVar == null) {
                        zcl zclVar = qmk.f28987a;
                        mm40VarN = s5x0.N(jm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    }
                    mm40 mm40VarE = x7zVar.e(mm40VarN);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode2 = Long.hashCode(fetVar4.T);
                    bh90 bh90VarM2 = fetVar4.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar4, mm40VarE);
                    fetVar4.i0();
                    if (fetVar4.S) {
                        fetVar4.l(pcyVar3);
                    } else {
                        fetVar4.r0();
                    }
                    jpm0.o(fetVar4, tj30VarC, shdVar4);
                    jpm0.o(fetVar4, bh90VarM2, shdVar3);
                    vqd.u(iHashCode2, fetVar4, shdVar2, fetVar4);
                    jpm0.o(fetVar4, mm40VarC1, shdVar);
                    ugdVar.F(CollectionsKt.U(a4xVar), fetVar4, 48);
                    fetVar4.r(true);
                    fetVar4.r(true);
                    fetVar4.r(false);
                    fetVar5 = fetVar4;
                } else {
                    fetVar5.e0(875686793);
                    int iIndexOf = a4xVar.indexOf(aivVar.b);
                    if (iIndexOf < 0) {
                        iIndexOf = 0;
                    }
                    pz40 pz40VarF = androidx.compose.runtime.e.f(Integer.valueOf(iIndexOf), fetVar5);
                    int iIntValue = ((Number) pz40VarF.getValue()).intValue();
                    boolean zG = fetVar5.g(a4xVar);
                    Object objP2 = fetVar5.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new ife(a4xVar, (byte) 4);
                        fetVar5.o0(objP2);
                    }
                    kwj kwjVarB = zk80.b(iIntValue, (Function0) objP2, fetVar5, 0, 2);
                    Unit unit = Unit.f46060a;
                    int i3 = i2 & 896;
                    boolean zG2 = (i3 == 256) | fetVar5.g(kwjVarB) | fetVar5.g(pz40VarF);
                    Object objP3 = fetVar5.P();
                    if (zG2 || objP3 == cl5Var) {
                        fetVar2 = fetVar;
                        atj atjVar = new atj(kwjVarB, pz40VarF, function1, null, (byte) 25);
                        kwjVar = kwjVarB;
                        function3 = function1;
                        fetVar2.o0(atjVar);
                        objP3 = atjVar;
                    } else {
                        fetVar2 = fetVar5;
                        kwjVar = kwjVarB;
                        function3 = function1;
                    }
                    m0x0.t(fetVar2, unit, (Function2) objP3);
                    Object objP4 = fetVar2.P();
                    if (objP4 == cl5Var) {
                        objP4 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                        fetVar2.o0(objP4);
                    }
                    vne vneVar = (vne) objP4;
                    x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar2, mm40Var);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar2);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, x5dVarA2, shdVar4);
                    jpm0.o(fetVar2, bh90VarM3, shdVar3);
                    vqd.u(iHashCode3, fetVar2, shdVar2, fetVar2);
                    jpm0.o(fetVar2, mm40VarC2, shdVar);
                    if (hylVar == null) {
                        fetVar2.e0(-1406757697);
                        fetVar2.r(false);
                        z2 = false;
                        fetVar3 = fetVar2;
                        jm40Var = jm40Var2;
                        z = true;
                    } else {
                        fetVar2.e0(-1406757696);
                        jm40 jm40Var3 = jm40Var2;
                        mm40 mm40VarD2 = o7k0.d(jm40Var3, 1.0f);
                        hyl hylVar3 = aivVar.f944a;
                        vxl vxlVar2 = vxl.f38204a;
                        boolean zI = fetVar2.i(vneVar) | (i3 == 256) | fetVar2.g(kwjVar);
                        Object objP5 = fetVar2.P();
                        if (zI || objP5 == cl5Var) {
                            z = true;
                            objP5 = new bwh(function3, vneVar, kwjVar, (byte) (true ? 1 : 0));
                            fetVar2.o0(objP5);
                        } else {
                            z = true;
                        }
                        fetVar3 = fetVar2;
                        ebc.r(mm40VarD2, hylVar3, vxlVar2, (Function1) objP5, null, fetVar3, 390, 40);
                        z2 = false;
                        fetVar3.r(false);
                        jm40Var = jm40Var3;
                    }
                    x7z x7zVar2 = new x7z(1.0f, z);
                    mm40 mm40VarN2 = jm40Var;
                    if (hylVar == null) {
                        zcl zclVar2 = qmk.f28987a;
                        mm40VarN2 = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    }
                    mm40 mm40VarE2 = x7zVar2.e(mm40VarN2);
                    boolean zG3 = fetVar3.g(a4xVar);
                    Object objP6 = fetVar3.P();
                    if (zG3 || objP6 == cl5Var) {
                        objP6 = new oea(a4xVar, (byte) 12);
                        fetVar3.o0(objP6);
                    }
                    q5x.e(kwjVar, mm40VarE2, null, null, 0, 0.0f, null, null, false, (Function1) objP6, null, null, null, u1c.M(1983326844, new fpg(ugdVar, a4xVar, (byte) 1), fetVar3), fetVar, 0, 24576, 15356);
                    fetVar5 = fetVar;
                    fetVar5.r(true);
                    fetVar5.r(false);
                }
            }
            yfe0VarU.d = function2;
        }
        fetVar5.X();
        yfe0VarU = fetVar5.u();
        if (yfe0VarU != null) {
            final byte b2 = 1;
            function2 = new Function2(mm40Var, aivVar, function1, ugdVar, i, b2) { // from class: a.yhv

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f42656a;
                public final /* synthetic */ mm40 b;
                public final /* synthetic */ aiv c;
                public final /* synthetic */ Function1 d;
                public final /* synthetic */ ugd e;

                {
                    this.f42656a = b2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f42656a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iL = x8x.L(3079);
                            plc.q(this.b, this.c, this.d, this.e, (fet) obj, iL);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iL2 = x8x.L(3079);
                            plc.q(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void r(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        fetVar.g0(1233155659);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            str2 = str;
            v8q0.a(str2, s5x0.J(mm40Var, 12.0f), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, (i2 >> 3) & 14, 24960, 109560);
        } else {
            str2 = str;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var, str2, i, (byte) 0);
        }
    }

    public static final void s(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-1495728897);
        int i2 = i | 6 | (fetVar2.g(str2) ? 32 : 16) | (fetVar2.g(null) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
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
            brm0.x(fetVar2, mm40VarC0, gqw0.v, -1432298292, false);
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.d(), fetVar2, (i2 >> 3) & 14, 24960, 109562);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var2, str2, i, (byte) 24);
        }
    }

    public static final void t(mm40 mm40Var, fdm fdmVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1671035942);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(fdmVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            uc9.c(o7k0.u(o7k0.e(mm40Var, 114.0f), 0.0f, 124.0f, 1), o7k0.u(o7k0.e(mm40Var, 114.0f), 0.0f, 124.0f, 1), fdmVar.c, Integer.valueOf(R.drawable.cybergames_ufc_fighter_placeholder), new y3d(y3d.f), null, aad.d, gqw0.f1, null, fetVar, 14376960, 256);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) mm40Var, (Object) fdmVar, i, (byte) 25);
        }
    }

    public static final void u(long j, fet fetVar, int i) {
        fetVar.g0(88330611);
        byte b = 2;
        int i2 = (fetVar.f(j) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.L(jm40.b, 8.0f, 0.0f, 2), 8.0f), 8.0f);
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dls(b, j);
                fetVar.o0(objP);
            }
            zq8.a(0, fetVar, rq8.K(mm40VarE, (Function1) objP));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a21(j, i, (byte) 16);
        }
    }

    public static final void v(EventCardMiddleTwoTeams eventCardMiddleTwoTeams, vzr vzrVar) {
        if (vzrVar.d) {
            eventCardMiddleTwoTeams.setFirstTeamLogo(R.drawable.ic_home);
        } else {
            Context context = eventCardMiddleTwoTeams.getContext();
            context.getClass();
            eventCardMiddleTwoTeams.u(vzrVar.c, context.getDrawable(R.drawable.no_photo_new));
        }
        eventCardMiddleTwoTeams.setFirstTeamName(vzrVar.b);
    }

    public static final void w(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((tfh) yfu0Var).b.setImageDrawable(sj3.U(((yfh) cpVar.u()).c.f37331a, cpVar.w));
        ((tfh) yfu0Var).b.setBackgroundColor(((yfh) cpVar.u()).c.b);
    }

    public static final void x(EventCardMiddleTwoTeams eventCardMiddleTwoTeams, wzr wzrVar) {
        if (wzrVar.d) {
            eventCardMiddleTwoTeams.setSecondTeamLogo(R.drawable.ic_away);
        } else {
            Context context = eventCardMiddleTwoTeams.getContext();
            context.getClass();
            eventCardMiddleTwoTeams.v(wzrVar.c, context.getDrawable(R.drawable.no_photo_new));
        }
        eventCardMiddleTwoTeams.setSecondTeamName(wzrVar.b);
    }

    public static void y(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        int i4;
        int i5;
        int i6;
        int[] iArr3 = new int[i3];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        int i7 = 0;
        for (int i8 = 0; i8 < i3; i8++) {
            int i9 = iArr2[i8];
            iArr4[i9] = iArr4[i9] + 1;
        }
        iArr5[1] = 0;
        int i10 = 1;
        while (i10 < 15) {
            int i11 = i10 + 1;
            iArr5[i11] = iArr5[i10] + iArr4[i10];
            i10 = i11;
        }
        for (int i12 = 0; i12 < i3; i12++) {
            int i13 = iArr2[i12];
            if (i13 != 0) {
                int i14 = iArr5[i13];
                iArr5[i13] = i14 + 1;
                iArr3[i14] = i12;
            }
        }
        int i15 = 1 << i2;
        if (iArr5[15] == 1) {
            for (int i16 = 0; i16 < i15; i16++) {
                iArr[i + i16] = iArr3[0];
            }
            return;
        }
        int i17 = 2;
        int i18 = 2;
        int i19 = 0;
        int i20 = 1;
        while (i20 <= i2) {
            while (iArr4[i20] > 0) {
                int i21 = i + i19;
                int i22 = i7 + 1;
                int i23 = (i20 << 16) | iArr3[i7];
                int i24 = i15;
                do {
                    i24 -= i18;
                    iArr[i21 + i24] = i23;
                } while (i24 > 0);
                int i25 = 1 << (i20 - 1);
                while ((i19 & i25) != 0) {
                    i25 >>= 1;
                }
                i19 = (i19 & (i25 - 1)) + i25;
                iArr4[i20] = iArr4[i20] - 1;
                i7 = i22;
            }
            i20++;
            i18 <<= 1;
        }
        int i26 = i15 - 1;
        int i27 = i2 + 1;
        int i28 = -1;
        int i29 = i;
        while (i27 <= 15) {
            while (iArr4[i27] > 0) {
                int i30 = i19 & i26;
                if (i30 != i28) {
                    int i31 = i29 + i15;
                    int i32 = 1 << (i27 - i2);
                    int i33 = i27;
                    while (i33 < 15) {
                        int i34 = i32 - iArr4[i33];
                        if (i34 <= 0) {
                            break;
                        }
                        i33++;
                        i32 = i34 << 1;
                    }
                    int i35 = i33 - i2;
                    iArr[i + i30] = ((i35 + i2) << 16) | ((i31 - i) - i30);
                    i4 = i30;
                    i6 = i31;
                    i5 = 1 << i35;
                } else {
                    i4 = i28;
                    i5 = i15;
                    i6 = i29;
                }
                int i36 = i6 + (i19 >> i2);
                int i37 = i7 + 1;
                int i38 = ((i27 - i2) << 16) | iArr3[i7];
                int i39 = i5;
                do {
                    i39 -= i17;
                    iArr[i36 + i39] = i38;
                } while (i39 > 0);
                int i40 = 1 << (i27 - 1);
                while ((i19 & i40) != 0) {
                    i40 >>= 1;
                }
                i19 = ((i40 - 1) & i19) + i40;
                iArr4[i27] = iArr4[i27] - 1;
                i15 = i5;
                i29 = i6;
                i28 = i4;
                i7 = i37;
            }
            i27++;
            i17 <<= 1;
        }
    }

    public static final boolean z(gu1 gu1Var) {
        gu1Var.getClass();
        List listA0 = CollectionsKt.A0(gu1Var.k.b, new vt5((byte) 22));
        int i = 0;
        for (Object obj : listA0) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            jng0 jng0Var = (jng0) obj;
            if (i < listA0.size() - 1 && jng0Var.c.compareTo(((jng0) listA0.get(i2)).d) < 0) {
                return true;
            }
            i = i2;
        }
        return false;
    }
}
