package a;

import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.javax.sip.message.Response;
import com.github.terrakok.cicerone.androidx.FragmentScreen$Companion$invoke$1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ydx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static abu f42460a;

    public static final void A(cp cpVar) {
        kxx kxxVar = (kxx) cpVar.u;
        if (((rhj0) cpVar.u()).u0().length() > 0) {
            kxxVar.c.setStatus(((rhj0) cpVar.u()).v0());
        }
    }

    public static final void B(cp cpVar) {
        DsCellMiddleTitle dsCellMiddleTitle = ((kxx) cpVar.u).c;
        dsCellMiddleTitle.setSubtitleVisible(((rhj0) cpVar.u()).u0().length() > 0);
        dsCellMiddleTitle.setSubtitle(((rhj0) cpVar.u()).u0());
        dsCellMiddleTitle.setStatus(((rhj0) cpVar.u()).v0());
    }

    public static a4x C(ydc0 ydc0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        ydc0.b.getClass();
        List<ydc0> listG0 = tx3.g0(ydc0.values());
        ArrayList arrayList = new ArrayList(r3d.q(listG0, 10));
        for (ydc0 ydc0Var2 : listG0) {
            arrayList.add(new lxl(ydc0Var2.ordinal(), (dyl) new xxl(ctf0Var.b.a(ydc0Var2.f42428a, Arrays.copyOf(new Object[0], 0))), false, ydc0Var2 == ydc0Var ? uxl.b : uxl.f36445a, (cwl) null, 108));
        }
        return dyb.o0(arrayList);
    }

    public static final ank0 D(double d, String str, hxu hxuVar, txu txuVar, ctf0 ctf0Var, boolean z, boolean z2) {
        str.getClass();
        hxuVar.getClass();
        ctf0Var.getClass();
        String strS = efx.s(ctf0Var, z, z2);
        String strG = G(d, str, hxuVar, txuVar);
        ArrayList arrayList = new ArrayList();
        bnk0 bnk0Var = new bnk0();
        pzw.E(bnk0Var, strS.concat(Separators.SP), 0, 0, 0, 0, 62);
        pzw.E(bnk0Var, strG, 0, 0, 1, R.attr.uikitCommerce, 14);
        return w6x.l(arrayList, bnk0Var.f2888a, arrayList);
    }

    public static final pz40 E(gmq gmqVar, Object obj, CoroutineContext coroutineContext, fet fetVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            coroutineContext = kotlin.coroutines.g.f46065a;
        }
        boolean zI = fetVar.i(coroutineContext) | fetVar.i(gmqVar);
        Object objP = fetVar.P();
        yje yjeVar = null;
        Object obj2 = ukd.f35823a;
        if (zI || objP == obj2) {
            objP = new kpb0((Object) coroutineContext, (Object) gmqVar, yjeVar, (byte) 16);
            fetVar.o0(objP);
        }
        Function2 function2 = (Function2) objP;
        Object objP2 = fetVar.P();
        if (objP2 == obj2) {
            objP2 = androidx.compose.runtime.e.e(obj);
            fetVar.o0(objP2);
        }
        pz40 pz40Var = (pz40) objP2;
        boolean zI2 = fetVar.i(function2);
        Object objP3 = fetVar.P();
        if (zI2 || objP3 == obj2) {
            objP3 = new kgk0(function2, pz40Var, yjeVar, (byte) 1);
            fetVar.o0(objP3);
        }
        m0x0.v(gmqVar, coroutineContext, (Function2) objP3, fetVar);
        return pz40Var;
    }

    public static final pz40 F(n7m0 n7m0Var, fet fetVar) {
        return E(n7m0Var, n7m0Var.getValue(), kotlin.coroutines.g.f46065a, fetVar, 0, 0);
    }

    public static final String G(double d, String str, hxu hxuVar, txu txuVar) {
        ivo0 ivo0Var;
        str.getClass();
        hxuVar.getClass();
        int i = cy7.f5159a;
        pn40 pn40Var = pn40.f27267a;
        if (txuVar != null && !hxuVar.equals(hxu.h) && (ivo0Var = txuVar.g) != null && ivo0Var.b > 0.0d) {
            d = txuVar.f.b;
        } else if (!hxuVar.equals(hxu.h)) {
            d = hxuVar.f.b;
        }
        return cy7.e(pn40.p(str, d));
    }

    public static final boolean H(nqq nqqVar, f8m f8mVar) {
        int iOrdinal = nqqVar.e1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                nqq nqqVarC0 = uzb.c0(nqqVar);
                if (nqqVarC0 != null) {
                    return H(nqqVarC0, f8mVar) || J(nqqVar, nqqVarC0, 1, f8mVar);
                }
                jf4.n("ActiveParent must have a focusedChild");
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return nqqVar.b1().f1309a ? ((Boolean) f8mVar.invoke(nqqVar)).booleanValue() : O(nqqVar, f8mVar);
                }
                t9f.b();
                return false;
            }
        }
        return O(nqqVar, f8mVar);
    }

    public static er30 I(s0x s0xVar) {
        if (s0xVar instanceof dfy) {
            dfy dfyVar = (dfy) s0xVar;
            String str = dfyVar.b;
            String str2 = dfyVar.c;
            str.getClass();
            str2.getClass();
            return new er30(str.concat(str2));
        }
        if (!(s0xVar instanceof cfy)) {
            t9f.b();
            return null;
        }
        cfy cfyVar = (cfy) s0xVar;
        String str3 = cfyVar.b;
        String str4 = cfyVar.c;
        str3.getClass();
        str4.getClass();
        return new er30(str3 + '#' + str4);
    }

    public static final boolean J(final nqq nqqVar, final nqq nqqVar2, final int i, final f8m f8mVar) {
        if (T(nqqVar, nqqVar2, i, f8mVar)) {
            return true;
        }
        final nqq nqqVarH = ((ypq) vcc.a0(nqqVar).getFocusOwner()).h();
        Boolean bool = (Boolean) rsr0.f0(nqqVar, i, new Function1() { // from class: a.kl60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                vx7 vx7Var = (vx7) obj;
                nqq nqqVar3 = nqqVar;
                if (nqqVarH != ((ypq) vcc.a0(nqqVar3).getFocusOwner()).h()) {
                    return Boolean.TRUE;
                }
                boolean zT = ydx.T(nqqVar3, nqqVar2, i, f8mVar);
                Boolean boolValueOf = Boolean.valueOf(zT);
                if (zT || !vx7Var.a()) {
                    return boolValueOf;
                }
                return null;
            }
        });
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final qlc K(h950 h950Var, int i) {
        h950Var.getClass();
        return plc.D(h950Var.b(i), h950Var.a(i));
    }

    public static final g950 L(h950 h950Var, int i) {
        h950Var.getClass();
        return g950.d(h950Var.getString(i));
    }

    public static String M(int i, lig0 lig0Var) {
        switch (i) {
            case 1:
                return R(lig0Var, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/1/Stone.png", "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/1/Page.png", "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/1/Scissors.png");
            case 2:
                return R(lig0Var, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/2/Stone.png", "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/2/Page.png", "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/2/Scissors.png");
            case 3:
                return R(lig0Var, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/3/Stone.png", "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/3/Page.png", "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/3/Scissors.png");
            case 4:
                return R(lig0Var, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/4/Stone.png", "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/4/Page.png", "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/4/Scissors.png");
            case 5:
                return R(lig0Var, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/5/Stone.png", "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/5/Page.png", "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/5/Scissors.png");
            case 6:
                return R(lig0Var, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/6/Stone.png", "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/6/Page.png", "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/6/Scissors.png");
            case 7:
                return R(lig0Var, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/7/Stone.png", "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/7/Page.png", "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/7/Scissors.png");
            case 8:
                return R(lig0Var, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/8/Stone.png", "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/8/Page.png", "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/8/Scissors.png");
            case 9:
                return R(lig0Var, "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/9/Stone.png", "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/9/Page.png", "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/9/Scissors.png");
            default:
                return "";
        }
    }

    public static final boolean N(nqq nqqVar, f8m f8mVar) {
        Object[] objArr = new nqq[16];
        if (!nqqVar.f20279a.n) {
            xcx.b("visitChildren called on an unattached node");
        }
        xz40 xz40Var = new xz40(new lm40[16]);
        lm40 lm40Var = nqqVar.f20279a;
        lm40 lm40Var2 = lm40Var.f;
        if (lm40Var2 == null) {
            vcc.v(xz40Var, lm40Var);
        } else {
            xz40Var.b(lm40Var2);
        }
        int i = 0;
        while (true) {
            int i2 = xz40Var.c;
            if (i2 == 0) {
                break;
            }
            lm40 lm40VarV = (lm40) xz40Var.k(i2 - 1);
            if ((lm40VarV.d & 1024) == 0) {
                vcc.v(xz40Var, lm40VarV);
            } else {
                while (lm40VarV != null) {
                    if ((lm40VarV.c & 1024) != 0) {
                        xz40 xz40Var2 = null;
                        while (lm40VarV != null) {
                            if (lm40VarV instanceof nqq) {
                                nqq nqqVar2 = (nqq) lm40VarV;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = nqqVar2;
                                i = i3;
                            } else if ((lm40VarV.c & 1024) != 0 && (lm40VarV instanceof f3k)) {
                                int i4 = 0;
                                for (lm40 lm40Var3 = ((f3k) lm40VarV).p; lm40Var3 != null; lm40Var3 = lm40Var3.f) {
                                    if ((lm40Var3.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            lm40VarV = lm40Var3;
                                        } else {
                                            if (xz40Var2 == null) {
                                                xz40Var2 = new xz40(new lm40[16]);
                                            }
                                            if (lm40VarV != null) {
                                                xz40Var2.b(lm40VarV);
                                                lm40VarV = null;
                                            }
                                            xz40Var2.b(lm40Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            lm40VarV = vcc.V(xz40Var2);
                        }
                        break;
                    }
                    lm40VarV = lm40VarV.f;
                }
            }
        }
        Arrays.sort(objArr, 0, i, s7f.c);
        int i5 = i - 1;
        if (i5 < objArr.length) {
            while (i5 >= 0) {
                nqq nqqVar3 = (nqq) objArr[i5];
                if (uzb.r0(nqqVar3) && v(nqqVar3, f8mVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final boolean O(nqq nqqVar, f8m f8mVar) {
        Object[] objArr = new nqq[16];
        if (!nqqVar.f20279a.n) {
            xcx.b("visitChildren called on an unattached node");
        }
        xz40 xz40Var = new xz40(new lm40[16]);
        lm40 lm40Var = nqqVar.f20279a;
        lm40 lm40Var2 = lm40Var.f;
        if (lm40Var2 == null) {
            vcc.v(xz40Var, lm40Var);
        } else {
            xz40Var.b(lm40Var2);
        }
        int i = 0;
        while (true) {
            int i2 = xz40Var.c;
            if (i2 == 0) {
                break;
            }
            lm40 lm40VarV = (lm40) xz40Var.k(i2 - 1);
            if ((lm40VarV.d & 1024) == 0) {
                vcc.v(xz40Var, lm40VarV);
            } else {
                while (lm40VarV != null) {
                    if ((lm40VarV.c & 1024) != 0) {
                        xz40 xz40Var2 = null;
                        while (lm40VarV != null) {
                            if (lm40VarV instanceof nqq) {
                                nqq nqqVar2 = (nqq) lm40VarV;
                                int i3 = i + 1;
                                if (objArr.length < i3) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i] = nqqVar2;
                                i = i3;
                            } else if ((lm40VarV.c & 1024) != 0 && (lm40VarV instanceof f3k)) {
                                int i4 = 0;
                                for (lm40 lm40Var3 = ((f3k) lm40VarV).p; lm40Var3 != null; lm40Var3 = lm40Var3.f) {
                                    if ((lm40Var3.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            lm40VarV = lm40Var3;
                                        } else {
                                            if (xz40Var2 == null) {
                                                xz40Var2 = new xz40(new lm40[16]);
                                            }
                                            if (lm40VarV != null) {
                                                xz40Var2.b(lm40VarV);
                                                lm40VarV = null;
                                            }
                                            xz40Var2.b(lm40Var3);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            lm40VarV = vcc.V(xz40Var2);
                        }
                        break;
                    }
                    lm40VarV = lm40VarV.f;
                }
            }
        }
        Arrays.sort(objArr, 0, i, s7f.c);
        for (int i5 = 0; i5 < i; i5++) {
            nqq nqqVar3 = (nqq) objArr[i5];
            if (uzb.r0(nqqVar3) && H(nqqVar3, f8mVar)) {
                return true;
            }
        }
        return false;
    }

    public static final ekf0 P(xcz xczVar, ydr ydrVar, fet fetVar) {
        k8e0 k8e0Var;
        xczVar.getClass();
        ydrVar.getClass();
        lh80 lh80Var = new lh80(0.0f, 0.0f, 0.0f, 0.0f);
        boolean zG = fetVar.g(xczVar);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zG || objP == obj) {
            objP = new gg90(xczVar, (byte) 15);
            fetVar.o0(objP);
        }
        Function0 function0 = (Function0) objP;
        function0.getClass();
        Object objP2 = fetVar.P();
        if (objP2 == obj) {
            objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
            fetVar.o0(objP2);
        }
        vne vneVar = (vne) objP2;
        pz40 pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
        pz40 pz40VarF2 = androidx.compose.runtime.e.f(100L, fetVar);
        boolean zF = fetVar.f(100L) | fetVar.g(xczVar) | fetVar.g(vneVar);
        Object objP3 = fetVar.P();
        if (zF || objP3 == obj) {
            objP3 = new jch0(xczVar, vneVar, new ubh0(pz40VarF, pz40VarF2, (byte) 2));
            fetVar.o0(objP3);
        }
        jch0 jch0Var = (jch0) objP3;
        w6k w6kVar = (w6k) fetVar.k(bmd.h);
        float fW0 = w6kVar.w0(48.0f);
        Object objP4 = fetVar.P();
        if (objP4 == obj) {
            objP4 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
            fetVar.o0(objP4);
        }
        vne vneVar2 = (vne) objP4;
        pz40 pz40VarF3 = androidx.compose.runtime.e.f(ydrVar, fetVar);
        k6z k6zVar = (k6z) fetVar.k(bmd.n);
        r0 r0Var = new r0(w6kVar.w0(s5x0.B(lh80Var, k6zVar)), w6kVar.w0(s5x0.A(lh80Var, k6zVar)), w6kVar.w0(0.0f), w6kVar.w0(0.0f));
        Object objP5 = fetVar.P();
        if (objP5 == obj) {
            objP5 = jgk0.b(new gg90(xczVar, (byte) 16));
            fetVar.o0(objP5);
        }
        l7m0 l7m0Var = (l7m0) objP5;
        ma80 ma80Var = (ma80) l7m0Var.getValue();
        boolean zG2 = fetVar.g(lh80Var) | fetVar.d(48.0f) | fetVar.g(vneVar2) | fetVar.g(xczVar) | fetVar.g(jch0Var) | fetVar.e(ma80Var.ordinal());
        Object objP6 = fetVar.P();
        if (zG2 || objP6 == obj) {
            int iOrdinal = ((ma80) l7m0Var.getValue()).ordinal();
            if (iOrdinal == 0) {
                k8e0Var = new k8e0((byte) 25);
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                k8e0Var = new k8e0((byte) 26);
            }
            k8e0 k8e0Var2 = k8e0Var;
            vneVar2.getClass();
            jch0Var.getClass();
            k6zVar.getClass();
            Object ekf0Var = new ekf0(new jw20((Object) xczVar, (byte) 23), vneVar2, pz40VarF3, fW0, r0Var, jch0Var, k6zVar, k8e0Var2);
            fetVar.o0(ekf0Var);
            objP6 = ekf0Var;
        }
        return (ekf0) objP6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final mm40 Q(g9z g9zVar, final ekf0 ekf0Var, Object obj, boolean z, fet fetVar, int i, int i2) {
        g9zVar.getClass();
        ekf0Var.getClass();
        obj.getClass();
        int i3 = i2 & 8;
        final byte b = 1;
        if (i3 != 0) {
            z = true;
        }
        zbk zbkVarB = jgk0.b(new gvb0(obj, ekf0Var, (byte) 23));
        final ma80 ma80VarD = ekf0Var.d();
        Boolean boolValueOf = Boolean.valueOf(z);
        final byte b2 = 0;
        int i4 = (i & 112) ^ 48;
        boolean zI = ((((57344 & i) ^ 24576) > 16384 && fetVar.h(z)) || (i & 24576) == 16384) | ((i4 > 32 && fetVar.g(ekf0Var)) || (i & 48) == 32) | fetVar.i(obj);
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (zI || objP == cl5Var) {
            objP = new lrc0(z, (Object) ekf0Var, obj, (byte) 2);
            fetVar.o0(objP);
        }
        m0x0.m(ekf0Var, obj, boolValueOf, (Function1) objP, fetVar);
        boolean zBooleanValue = ((Boolean) zbkVarB.getValue()).booleanValue();
        jm40 jm40Var = jm40.b;
        if (!zBooleanValue) {
            if (!obj.equals(((hgk0) ekf0Var.q).getValue())) {
                fetVar.e0(-1518171365);
                fetVar.r(false);
                return jm40Var;
            }
            fetVar.e0(-1518513822);
            mm40 mm40VarH = k7n0.H(jm40Var, 8.0f);
            boolean zE = fetVar.e(ma80VarD.ordinal()) | ((i4 > 32 && fetVar.g(ekf0Var)) || (i & 48) == 32);
            Object objP2 = fetVar.P();
            if (zE || objP2 == cl5Var) {
                objP2 = new Function1() { // from class: a.fkf0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b3 = b;
                        ekf0 ekf0Var2 = ekf0Var;
                        ma80 ma80Var = ma80VarD;
                        uag0 uag0Var = (uag0) obj2;
                        uag0Var.getClass();
                        switch (b3) {
                            case 0:
                                int iOrdinal = ma80Var.ordinal();
                                if (iOrdinal == 0) {
                                    uag0Var.I(Float.intBitsToFloat((int) (ekf0Var2.c() & 4294967295L)));
                                } else {
                                    if (iOrdinal != 1) {
                                        t9f.b();
                                        return null;
                                    }
                                    uag0Var.H(Float.intBitsToFloat((int) (ekf0Var2.c() >> 32)));
                                }
                                return Unit.f46060a;
                            default:
                                int iOrdinal2 = ma80Var.ordinal();
                                if (iOrdinal2 == 0) {
                                    uag0Var.I(Float.intBitsToFloat((int) (((ne60) ekf0Var2.r.d()).f23370a & 4294967295L)));
                                } else {
                                    if (iOrdinal2 != 1) {
                                        t9f.b();
                                        return null;
                                    }
                                    uag0Var.H(Float.intBitsToFloat((int) (((ne60) ekf0Var2.r.d()).f23370a >> 32)));
                                }
                                return Unit.f46060a;
                        }
                    }
                };
                fetVar.o0(objP2);
            }
            mm40 mm40VarT = i4w0.T(mm40VarH, (Function1) objP2);
            fetVar.r(false);
            return mm40VarT;
        }
        fetVar.e0(-1518879746);
        mm40 mm40VarH2 = k7n0.H(jm40Var, 8.0f);
        boolean zE2 = fetVar.e(ma80VarD.ordinal());
        if ((i4 <= 32 || !fetVar.g(ekf0Var)) && (i & 48) != 32) {
            b = 0;
        }
        boolean z2 = (zE2 ? 1 : 0) | b;
        Object objP3 = fetVar.P();
        if (z2 != 0 || objP3 == cl5Var) {
            objP3 = new Function1() { // from class: a.fkf0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b3 = b2;
                    ekf0 ekf0Var2 = ekf0Var;
                    ma80 ma80Var = ma80VarD;
                    uag0 uag0Var = (uag0) obj2;
                    uag0Var.getClass();
                    switch (b3) {
                        case 0:
                            int iOrdinal = ma80Var.ordinal();
                            if (iOrdinal == 0) {
                                uag0Var.I(Float.intBitsToFloat((int) (ekf0Var2.c() & 4294967295L)));
                            } else {
                                if (iOrdinal != 1) {
                                    t9f.b();
                                    return null;
                                }
                                uag0Var.H(Float.intBitsToFloat((int) (ekf0Var2.c() >> 32)));
                            }
                            return Unit.f46060a;
                        default:
                            int iOrdinal2 = ma80Var.ordinal();
                            if (iOrdinal2 == 0) {
                                uag0Var.I(Float.intBitsToFloat((int) (((ne60) ekf0Var2.r.d()).f23370a & 4294967295L)));
                            } else {
                                if (iOrdinal2 != 1) {
                                    t9f.b();
                                    return null;
                                }
                                uag0Var.H(Float.intBitsToFloat((int) (((ne60) ekf0Var2.r.d()).f23370a >> 32)));
                            }
                            return Unit.f46060a;
                    }
                }
            };
            fetVar.o0(objP3);
        }
        mm40 mm40VarT2 = i4w0.T(mm40VarH2, (Function1) objP3);
        fetVar.r(false);
        return mm40VarT2;
    }

    public static String R(lig0 lig0Var, String str, String str2, String str3) {
        int i = lig0Var == null ? -1 : kig0.f18337a[lig0Var.ordinal()];
        if (i == -1 || i == 1) {
            return str;
        }
        if (i == 2) {
            return str2;
        }
        if (i == 3) {
            return str3;
        }
        if (i == 4) {
            return "";
        }
        t9f.b();
        return null;
    }

    public static FragmentScreen$Companion$invoke$1 S() {
        return new FragmentScreen$Companion$invoke$1(null, new e9d0((byte) 1), true);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014c  */
    /* JADX WARN: Code duplicated, block: B:129:0x019e  */
    /* JADX WARN: Code duplicated, block: B:158:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code duplicated, block: B:90:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x013a A[ADDED_TO_REGION, LOOP:6: B:92:0x013a->B:120:0x0187, LOOP_START, PHI: r13
  0x013a: PHI (r13v13 a.lm40) = (r13v7 a.lm40), (r13v14 a.lm40) binds: [B:91:0x0138, B:120:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x013c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0142  */
    /* JADX WARN: Code duplicated, block: B:97:0x0146  */
    public static final boolean T(nqq nqqVar, nqq nqqVar2, int i, f8m f8mVar) {
        lm40 lm40Var;
        lm40 lm40Var2;
        e7z e7zVarZ;
        tzi tziVar;
        lm40 lm40VarV;
        xz40 xz40Var;
        if (nqqVar.e1() != iqq.b) {
            jf4.n("This function should only be used within a parent that has focus.");
            return false;
        }
        Object[] objArr = new nqq[16];
        if (!nqqVar.f20279a.n) {
            xcx.b("visitChildren called on an unattached node");
        }
        xz40 xz40Var2 = new xz40(new lm40[16]);
        lm40 lm40Var3 = nqqVar.f20279a;
        lm40 lm40Var4 = lm40Var3.f;
        if (lm40Var4 == null) {
            vcc.v(xz40Var2, lm40Var3);
        } else {
            xz40Var2.b(lm40Var4);
        }
        int i2 = 0;
        while (true) {
            int i3 = xz40Var2.c;
            lm40Var = null;
            if (i3 == 0) {
                break;
            }
            lm40 lm40VarV2 = (lm40) xz40Var2.k(i3 - 1);
            if ((lm40VarV2.d & 1024) == 0) {
                vcc.v(xz40Var2, lm40VarV2);
            } else {
                while (lm40VarV2 != null) {
                    if ((lm40VarV2.c & 1024) != 0) {
                        xz40 xz40Var3 = null;
                        while (lm40VarV2 != null) {
                            if (lm40VarV2 instanceof nqq) {
                                nqq nqqVar3 = (nqq) lm40VarV2;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    int length = objArr.length;
                                    Object[] objArr2 = new Object[Math.max(i4, length * 2)];
                                    System.arraycopy(objArr, 0, objArr2, 0, length);
                                    objArr = objArr2;
                                }
                                objArr[i2] = nqqVar3;
                                i2 = i4;
                            } else if ((lm40VarV2.c & 1024) != 0 && (lm40VarV2 instanceof f3k)) {
                                int i5 = 0;
                                for (lm40 lm40Var5 = ((f3k) lm40VarV2).p; lm40Var5 != null; lm40Var5 = lm40Var5.f) {
                                    if ((lm40Var5.c & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            lm40VarV2 = lm40Var5;
                                        } else {
                                            if (xz40Var3 == null) {
                                                xz40Var3 = new xz40(new lm40[16]);
                                            }
                                            if (lm40VarV2 != null) {
                                                xz40Var3.b(lm40VarV2);
                                                lm40VarV2 = null;
                                            }
                                            xz40Var3.b(lm40Var5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            lm40VarV2 = vcc.V(xz40Var3);
                        }
                        break;
                    }
                    lm40VarV2 = lm40VarV2.f;
                }
            }
        }
        Arrays.sort(objArr, 0, i2, s7f.c);
        if (i != 1) {
            if (i != 2) {
                jf4.n("This function should only be used for 1-D focus search");
                return false;
            }
            IntRange intRangeO = l1e0.o(0, i2);
            int i6 = intRangeO.f46068a;
            int i7 = intRangeO.b;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        nqq nqqVar4 = (nqq) objArr[i7];
                        if (uzb.r0(nqqVar4) && v(nqqVar4, f8mVar)) {
                            return true;
                        }
                    }
                    if (Intrinsics.d(objArr[i7], nqqVar2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
            if (i != 1) {
                if (!nqqVar.f20279a.n) {
                    xcx.b("visitAncestors called on an unattached node");
                }
                lm40Var2 = nqqVar.f20279a.e;
                e7zVarZ = vcc.Z(nqqVar);
                loop5: while (e7zVarZ != null) {
                    if ((((lm40) e7zVarZ.h1.g).d & 1024) != 0) {
                        while (lm40Var2 != null) {
                            if ((lm40Var2.c & 1024) != 0) {
                                lm40VarV = lm40Var2;
                                xz40Var = null;
                                while (lm40VarV != null) {
                                    if (lm40VarV instanceof nqq) {
                                        lm40Var = lm40VarV;
                                        break loop5;
                                    }
                                    if ((lm40VarV.c & 1024) == 0) {
                                    }
                                    lm40VarV = vcc.V(xz40Var);
                                }
                            }
                            lm40Var2 = lm40Var2.e;
                        }
                    }
                    e7zVarZ = e7zVarZ.v();
                    if (e7zVarZ != null) {
                    }
                }
                if (lm40Var != null) {
                    return ((Boolean) f8mVar.invoke(nqqVar)).booleanValue();
                }
            }
            return false;
        }
        IntRange intRangeO2 = l1e0.o(0, i2);
        int i8 = intRangeO2.f46068a;
        int i9 = intRangeO2.b;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    nqq nqqVar5 = (nqq) objArr[i8];
                    if (uzb.r0(nqqVar5) && H(nqqVar5, f8mVar)) {
                        return true;
                    }
                }
                if (Intrinsics.d(objArr[i8], nqqVar2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
        }
        if (i != 1 && nqqVar.b1().f1309a) {
            if (!nqqVar.f20279a.n) {
                xcx.b("visitAncestors called on an unattached node");
            }
            lm40Var2 = nqqVar.f20279a.e;
            e7zVarZ = vcc.Z(nqqVar);
            loop5: while (e7zVarZ != null) {
                if ((((lm40) e7zVarZ.h1.g).d & 1024) != 0) {
                    while (lm40Var2 != null) {
                        if ((lm40Var2.c & 1024) != 0) {
                            lm40VarV = lm40Var2;
                            xz40Var = null;
                            while (lm40VarV != null) {
                                if (lm40VarV instanceof nqq) {
                                    lm40Var = lm40VarV;
                                    break loop5;
                                }
                                if ((lm40VarV.c & 1024) == 0 && (lm40VarV instanceof f3k)) {
                                    int i10 = 0;
                                    for (lm40 lm40Var6 = ((f3k) lm40VarV).p; lm40Var6 != null; lm40Var6 = lm40Var6.f) {
                                        if ((lm40Var6.c & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                lm40VarV = lm40Var6;
                                            } else {
                                                if (xz40Var == null) {
                                                    xz40Var = new xz40(new lm40[16]);
                                                }
                                                if (lm40VarV != null) {
                                                    xz40Var.b(lm40VarV);
                                                    lm40VarV = null;
                                                }
                                                xz40Var.b(lm40Var6);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                lm40VarV = vcc.V(xz40Var);
                            }
                        }
                        lm40Var2 = lm40Var2.e;
                    }
                }
                e7zVarZ = e7zVarZ.v();
                lm40Var2 = (e7zVarZ != null || (tziVar = e7zVarZ.h1) == null) ? null : (wso0) tziVar.f;
            }
            if (lm40Var != null) {
                return ((Boolean) f8mVar.invoke(nqqVar)).booleanValue();
            }
        }
        return false;
    }

    public static final int U(pz10 pz10Var) {
        if (pz10Var instanceof kz10) {
            return ((kz10) pz10Var).g;
        }
        if (pz10Var instanceof lz10) {
            return ((lz10) pz10Var).i;
        }
        if (pz10Var instanceof mz10) {
            return ((mz10) pz10Var).g;
        }
        if (pz10Var instanceof oz10) {
            return ((oz10) pz10Var).o;
        }
        t9f.b();
        return 0;
    }

    public static final vsg0 V(ufk0 ufk0Var, Function0 function0) {
        return new vsg0(new uu3(ufk0Var, function0, null, (byte) 9));
    }

    public static final ArrayList W(l800 l800Var) {
        Object next;
        List list;
        List<ufp0> list2 = l800Var.f19585a;
        ArrayList arrayList = new ArrayList();
        for (ufp0 ufp0Var : list2) {
            Iterator it = l800Var.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                d800 d800Var = (d800) next;
                if (d800Var.f5620a.equals(ufp0Var.f35586a) && ((list = d800Var.b) == null || !list.isEmpty())) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (!((u800) it2.next()).b.isEmpty()) {
                            break;
                        }
                    }
                }
            }
            d800 d800Var2 = (d800) next;
            Pair pair = d800Var2 != null ? new Pair(ufp0Var.b, d800Var2) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return arrayList;
    }

    public static final mpm X(d3h0 d3h0Var, boolean z) {
        opm opmVar = opm.f25648a;
        return (!z || d3h0Var == null) ? new lpm(opmVar, new gpm()) : new kpm(opmVar, new gpm(), d5c.O(d3h0Var.a(), d3h0Var.b(), d3h0Var.j(), d3h0Var.i(), new gpm()));
    }

    public static final List Y(c510 c510Var) {
        c510Var.getClass();
        List<y410> list = c510Var.c;
        if (list == null) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (y410 y410Var : list) {
            String str = y410Var.f41979a;
            if (str == null) {
                str = "";
            }
            String str2 = y410Var.b;
            String str3 = str2 != null ? str2 : "";
            Boolean bool = y410Var.c;
            arrayList.add(new z410(str, str3, bool != null ? bool.booleanValue() : false));
        }
        return arrayList;
    }

    public static final l8m Z(xi40 xi40Var) {
        return new l8m(new l9m(new n0x(xi40Var.c), new y3d(StaticColors.INSTANCE.m126getWhite200d7_KjU())), xi40Var.e, xi40Var.b, xi40Var.a());
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-2108437242);
        int i2 = i | 6;
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 36.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            mm40 mm40VarD2 = o7k0.d(o7k0.s(o7k0.e(s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 14.0f), 160.0f), 1.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD2), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i, b);
        }
    }

    public static final dxh0 a0(zvh0 zvh0Var) {
        int iOrdinal = zvh0Var.ordinal();
        if (iOrdinal == 0) {
            return axh0.f1625a;
        }
        if (iOrdinal == 1) {
            return zwh0.f45106a;
        }
        if (iOrdinal == 2) {
            return cxh0.f5122a;
        }
        if (iOrdinal == 3) {
            return bxh0.f3376a;
        }
        t9f.b();
        return null;
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(461640102);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            fetVar2 = fetVar;
            dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_info_circle, 6, fetVar), fetVar), null, o7k0.n(jm40Var, 12.0f), ((ThemeColors) fetVar.k(zaq0.b)).getPrimary(), fetVar2, 56, 0);
            mm40Var = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 11);
        }
    }

    public static final y5l0 b0(d0t d0tVar, ctf0 ctf0Var, y78 y78Var, boolean z, boolean z2, String str, int i, boolean z3, boolean z4, v5l0 v5l0Var, vvs vvsVar, String str2, i9h0 i9h0Var, v12 v12Var, boolean z5) {
        d0tVar.getClass();
        ctf0Var.getClass();
        v5l0Var.getClass();
        str2.getClass();
        return new y5l0(wwb.V(d0tVar, ctf0Var, y78Var, z, z2, str, false, kotlin.collections.a.c(Integer.valueOf(i)), z3, z4, false, v5l0Var, d0tVar.K.isEmpty() ? i5l0.f14197a : l5l0.f19463a, str2, z5), vvsVar, i9h0Var, v12Var);
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var) {
        int i2;
        l7m0Var.getClass();
        fetVar.g0(-1569858761);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(l7m0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ufp(l7m0Var, (byte) 11);
                fetVar.o0(objP);
            }
            p8a.k(mm40Var, (Function1) objP, fetVar, i3 & 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new udx(mm40Var, l7m0Var, i, b);
        }
    }

    public static final j9m0 c0(nc5 nc5Var) {
        nc5Var.getClass();
        if (!(nc5Var instanceof lc5)) {
            if (!(nc5Var instanceof mc5)) {
                t9f.b();
                return null;
            }
            mc5 mc5Var = (mc5) nc5Var;
            return new j9m0(R.drawable.default_background, p7x.z(mc5Var.b, mc5Var.f21535a), "");
        }
        lc5 lc5Var = (lc5) nc5Var;
        int i = lc5Var.f19784a;
        String strValueOf = lc5Var.b;
        strValueOf.getClass();
        bzu bzuVar = new bzu((byte) 23);
        bzuVar.g("static");
        bzuVar.g("img");
        bzuVar.g("android");
        bzuVar.g("TopChamps");
        if (strValueOf.length() == 0) {
            strValueOf = String.valueOf(i);
        }
        axq.u(bzuVar, strValueOf, "backgrounds", "Game_Screen.png");
        return new j9m0(R.drawable.default_background, p7x.z(lc5Var.d, lc5Var.c), ((StringBuilder) bzuVar.b).toString());
    }

    public static final void d(mm40 mm40Var, final duy duyVar, fet fetVar, int i) {
        duyVar.getClass();
        fetVar.g0(873622080);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(duyVar) ? 32 : 16);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            boolean zG = fetVar.g(duyVar.f6718a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new ugd(11810736, true, new Function2() { // from class: a.cuy
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = b;
                        jm40 jm40Var = jm40.b;
                        duy duyVar2 = duyVar;
                        switch (b3) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    v8q0.a(duyVar2.f6718a, mrv.k0(jm40Var, "TITLE_TEXT"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar2, 48, 24960, 110588);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            default:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    v8q0.a(duyVar2.b, mrv.k0(jm40Var, "DESCRIPTION_TEXT"), duyVar2.c, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar3, 48, 24960, 110584);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                fetVar.o0(objP);
            }
            Function2 function2 = (Function2) objP;
            boolean zG2 = fetVar.g(duyVar.b);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new ugd(-422152945, true, new Function2() { // from class: a.cuy
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b3 = b2;
                        jm40 jm40Var = jm40.b;
                        duy duyVar2 = duyVar;
                        switch (b3) {
                            case 0:
                                fet fetVar2 = (fet) obj;
                                int iIntValue = ((Integer) obj2).intValue();
                                if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    v8q0.a(duyVar2.f6718a, mrv.k0(jm40Var, "TITLE_TEXT"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar2), fetVar2, 48, 24960, 110588);
                                } else {
                                    fetVar2.X();
                                }
                                break;
                            default:
                                fet fetVar3 = (fet) obj;
                                int iIntValue2 = ((Integer) obj2).intValue();
                                if (fetVar3.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    v8q0.a(duyVar2.b, mrv.k0(jm40Var, "DESCRIPTION_TEXT"), duyVar2.c, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar3, 48, 24960, 110584);
                                } else {
                                    fetVar3.X();
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                fetVar.o0(objP2);
            }
            hmw0.j(mm40VarD, function2, (Function2) objP2, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(mm40Var, duyVar, i, (byte) 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    public static final g7m d0(xj40 xj40Var) {
        String str = xj40Var.f40975a;
        String str2 = xj40Var.b;
        str.getClass();
        d4d d4dVar = d4d.STATIC_WHITE60;
        w6n w6nVar = w6n.k;
        if (!kotlin.text.c.x(str2, ujn.h, false)) {
            if (str2.length() == 0) {
                str2 = "";
            } else {
                List list = u0d.f34849a;
                if (u0d.c(str2)) {
                    str2 = "";
                } else {
                    str2 = String.format(Locale.ENGLISH, StringsKt.O(str2, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str2}, 2));
                }
            }
        }
        i4 i4VarG0 = dyb.g0(new s2m(new u6n(d4dVar, w6nVar, new c280(str2, R.drawable.ic_glyph_circle_globe)), str));
        cl40 cl40Var = xj40Var.c.b;
        return new g7m(i4VarG0, new o2m(new m0x(gfx.W(cl40Var), null, 6), gfx.W(cl40Var), StaticColors.INSTANCE.m130getWhite600d7_KjU()));
    }

    public static final void e(y3m0 y3m0Var, mm40 mm40Var, mez mezVar, lh80 lh80Var, sw3 sw3Var, float f, qkq qkqVar, boolean z, vf80 vf80Var, Function1 function1, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2;
        qkq qkqVar2;
        boolean z2;
        vf80 vf80VarB;
        qkq qkqVar3;
        int i3;
        boolean z3;
        fetVar.g0(-670735644);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(y3m0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            mm40Var2 = mm40Var;
            i2 |= fetVar.g(mm40Var2) ? 32 : 16;
        } else {
            mm40Var2 = mm40Var;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(mezVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(lh80Var) ? 2048 : 1024;
        }
        int i4 = i2 | 24576;
        if ((196608 & i) == 0) {
            i4 |= fetVar.g(sw3Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= fetVar.d(f) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        int i5 = 100663296 | i4;
        if ((805306368 & i) == 0) {
            i5 = 369098752 | i4;
        }
        int i6 = fetVar.i(function1) ? 4 : 2;
        boolean z4 = true;
        if (fetVar.U(i5 & 1, ((306783379 & i5) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            fetVar.Z();
            int i7 = i & 1;
            Object obj = ukd.f35823a;
            if (i7 == 0 || fetVar.B()) {
                sjj sjjVarA = wzk0.a(fetVar);
                boolean zG = fetVar.g(sjjVarA);
                Object objP = fetVar.P();
                if (zG || objP == obj) {
                    objP = new iuj(sjjVarA);
                    fetVar.o0(objP);
                }
                qkqVar3 = (iuj) objP;
                vf80VarB = xf80.b(fetVar);
                i3 = i5 & (-1908408321);
                z3 = true;
            } else {
                fetVar.X();
                int i8 = i5 & (-1908408321);
                z3 = z;
                vf80VarB = vf80Var;
                i3 = i8;
                qkqVar3 = qkqVar;
            }
            fetVar.s();
            ma80 ma80Var = ma80.b;
            float fA = sw3Var.a();
            int i9 = i3 >> 3;
            int i10 = (i3 & 14) | ((i3 >> 12) & 112) | (i9 & 896);
            boolean z5 = ((((i10 & 14) ^ 6) > 4 && fetVar.g(y3m0Var)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && fetVar.g(sw3Var)) || (i10 & 48) == 32);
            if ((((i10 & 896) ^ 384) <= 256 || !fetVar.g(lh80Var)) && (i10 & 384) != 256) {
                z4 = false;
            }
            boolean z6 = z5 | z4;
            Object objP2 = fetVar.P();
            if (z6 || objP2 == obj) {
                objP2 = new jez(new hpr(lh80Var, y3m0Var, sw3Var, (byte) 26));
                fetVar.o0(objP2);
            }
            int i11 = i3 << 3;
            mm40 mm40Var3 = mm40Var2;
            qkqVar2 = qkqVar3;
            z2 = z3;
            zdx.e(mezVar, ma80Var, (jez) objP2, mm40Var3, lh80Var, qkqVar2, z2, vf80VarB, f, fA, function1, fetVar, ((i3 >> 6) & 14) | 48 | ((i3 << 6) & 7168) | (57344 & i11) | (i11 & 458752) | (29360128 & i9) | ((i3 << 9) & 1879048192), (i6 << 3) & 112);
        } else {
            fetVar.X();
            qkqVar2 = qkqVar;
            z2 = z;
            vf80VarB = vf80Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vdz(y3m0Var, mm40Var, mezVar, lh80Var, sw3Var, f, qkqVar2, z2, vf80VarB, function1, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017a  */
    /* JADX WARN: Code duplicated, block: B:107:0x018f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0195  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:79:0x0100  */
    /* JADX WARN: Code duplicated, block: B:82:0x0111 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x0113  */
    /* JADX WARN: Code duplicated, block: B:86:0x0124  */
    /* JADX WARN: Code duplicated, block: B:88:0x0131  */
    /* JADX WARN: Code duplicated, block: B:91:0x015b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0161  */
    /* JADX WARN: Code duplicated, block: B:99:0x0174  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(final y3m0 y3m0Var, mm40 mm40Var, mez mezVar, final lh80 lh80Var, final float f, final ow3 ow3Var, qkq qkqVar, boolean z, vf80 vf80Var, final Function1 function1, fet fetVar, final int i, final int i2) {
        mm40 mm40Var2;
        mez mezVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        vf80 vf80Var2;
        int i7;
        boolean z2;
        boolean z3;
        final qkq qkqVar2;
        final boolean z4;
        final mm40 mm40Var3;
        final mez mezVar3;
        final vf80 vf80VarB;
        yfe0 yfe0VarU;
        int i8;
        mm40 mm40Var4;
        mez mezVarQ;
        sjj sjjVarA;
        boolean zG;
        Object objP;
        int i9;
        boolean z5;
        iuj iujVar;
        int i10;
        boolean z6;
        Object objP2;
        fetVar.g0(-578931208);
        int i11 = i | (fetVar.g(y3m0Var) ? 4 : 2);
        int i12 = i2 & 2;
        if (i12 == 0) {
            if ((i & 48) == 0) {
                mm40Var2 = mm40Var;
                i11 |= fetVar.g(mm40Var2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                mezVar2 = mezVar;
                int i13 = fetVar.g(mezVar2) ? 256 : 128;
                int i14 = i11 | i13;
                if (fetVar.g(lh80Var)) {
                    i3 = 2048;
                } else {
                    i3 = 1024;
                }
                int i15 = i14 | i3 | 24576;
                if (fetVar.d(f)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                int i16 = i15 | i4;
                if (fetVar.g(ow3Var)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i6 = i16 | i5 | 104857600;
                if ((i & 805306368) == 0) {
                    if ((i2 & 512) == 0) {
                        vf80Var2 = vf80Var;
                        int i17 = fetVar.g(vf80Var2) ? 536870912 : 268435456;
                        i6 |= i17;
                    } else {
                        vf80Var2 = vf80Var;
                    }
                    i6 |= i17;
                } else {
                    vf80Var2 = vf80Var;
                }
                if (fetVar.i(function1)) {
                    i7 = 4;
                } else {
                    i7 = 2;
                }
                z2 = true;
                if ((i6 & 306783379) == 306783378 || (i7 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (fetVar.U(i6 & 1, z3)) {
                    fetVar.Z();
                    i8 = i & 1;
                    Object obj = ukd.f35823a;
                    if (i8 != 0 || fetVar.B()) {
                        if (i12 != 0) {
                            mm40Var4 = jm40.b;
                        } else {
                            mm40Var4 = mm40Var2;
                        }
                        if ((i2 & 4) != 0) {
                            mezVarQ = gfx.Q(fetVar);
                            i6 &= -897;
                        } else {
                            mezVarQ = mezVar2;
                        }
                        sjjVarA = wzk0.a(fetVar);
                        zG = fetVar.g(sjjVarA);
                        objP = fetVar.P();
                        if (zG || objP == obj) {
                            objP = new iuj(sjjVarA);
                            fetVar.o0(objP);
                        }
                        iuj iujVar2 = (iuj) objP;
                        i9 = i6 & (-29360129);
                        if ((i2 & 512) != 0) {
                            vf80VarB = xf80.b(fetVar);
                            i9 = i6 & (-1908408321);
                        } else {
                            vf80VarB = vf80Var2;
                        }
                        z5 = true;
                        iujVar = iujVar2;
                    } else {
                        fetVar.X();
                        if ((i2 & 4) != 0) {
                            i6 &= -897;
                        }
                        int i18 = i6 & (-29360129);
                        if ((i2 & 512) != 0) {
                            i18 = i6 & (-1908408321);
                        }
                        iujVar = qkqVar;
                        z5 = z;
                        mezVarQ = mezVar2;
                        i9 = i18;
                        mm40Var4 = mm40Var2;
                        vf80VarB = vf80Var2;
                    }
                    fetVar.s();
                    boolean z7 = z5;
                    ma80 ma80Var = ma80.f21447a;
                    float fA = ow3Var.a();
                    int i19 = i9 >> 3;
                    mez mezVar4 = mezVarQ;
                    i10 = (i9 & 14) | ((i9 >> 15) & 112) | (i19 & 896);
                    mm40 mm40Var5 = mm40Var4;
                    boolean z8 = ((((i10 & 14) ^ 6) <= 4 && fetVar.g(y3m0Var)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) <= 32 && fetVar.g(ow3Var)) || (i10 & 48) == 32);
                    if ((((i10 & 896) ^ 384) > 256 || !fetVar.g(lh80Var)) && (i10 & 384) != 256) {
                    }
                    z6 = z8 | z2;
                    objP2 = fetVar.P();
                    if (z6 || objP2 == obj) {
                        objP2 = new jez(new hpr(lh80Var, y3m0Var, ow3Var, (byte) 25));
                        fetVar.o0(objP2);
                    }
                    z4 = z7;
                    zdx.e(mezVar4, ma80Var, (jez) objP2, mm40Var5, lh80Var, iujVar, z4, vf80VarB, f, fA, function1, fetVar, ((i9 >> 6) & 14) | 48 | ((i9 << 6) & 7168) | ((i9 << 3) & 57344) | 12779520 | (234881024 & i19) | ((i9 << 12) & 1879048192), (i7 << 3) & 112);
                    mezVar3 = mezVar4;
                    mm40Var3 = mm40Var5;
                    qkqVar2 = iujVar;
                } else {
                    fetVar.X();
                    qkqVar2 = qkqVar;
                    z4 = z;
                    mm40Var3 = mm40Var2;
                    mezVar3 = mezVar2;
                    vf80VarB = vf80Var2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.udz
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            ydx.f(y3m0Var, mm40Var3, mezVar3, lh80Var, f, ow3Var, qkqVar2, z4, vf80VarB, function1, (fet) obj2, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            mezVar2 = mezVar;
            int i110 = i11 | i13;
            if (fetVar.g(lh80Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            int i111 = i110 | i3 | 24576;
            if (fetVar.d(f)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            int i112 = i111 | i4;
            if (fetVar.g(ow3Var)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i6 = i112 | i5 | 104857600;
            if ((i & 805306368) == 0) {
                if ((i2 & 512) == 0) {
                    vf80Var2 = vf80Var;
                    if (fetVar.g(vf80Var2)) {
                    }
                    i6 |= i17;
                } else {
                    vf80Var2 = vf80Var;
                }
                i6 |= i17;
            } else {
                vf80Var2 = vf80Var;
            }
            if (fetVar.i(function1)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            z2 = true;
            if ((i6 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (fetVar.U(i6 & 1, z3)) {
                fetVar.Z();
                i8 = i & 1;
                Object obj2 = ukd.f35823a;
                if (i8 != 0) {
                    if (i12 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if ((i2 & 4) != 0) {
                        mezVarQ = gfx.Q(fetVar);
                        i6 &= -897;
                    } else {
                        mezVarQ = mezVar2;
                    }
                    sjjVarA = wzk0.a(fetVar);
                    zG = fetVar.g(sjjVarA);
                    objP = fetVar.P();
                    if (zG) {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    } else {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    }
                    iuj iujVar3 = (iuj) objP;
                    i9 = i6 & (-29360129);
                    if ((i2 & 512) != 0) {
                        vf80VarB = xf80.b(fetVar);
                        i9 = i6 & (-1908408321);
                    } else {
                        vf80VarB = vf80Var2;
                    }
                    z5 = true;
                    iujVar = iujVar3;
                } else {
                    if (i12 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if ((i2 & 4) != 0) {
                        mezVarQ = gfx.Q(fetVar);
                        i6 &= -897;
                    } else {
                        mezVarQ = mezVar2;
                    }
                    sjjVarA = wzk0.a(fetVar);
                    zG = fetVar.g(sjjVarA);
                    objP = fetVar.P();
                    if (zG) {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    } else {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    }
                    iuj iujVar4 = (iuj) objP;
                    i9 = i6 & (-29360129);
                    if ((i2 & 512) != 0) {
                        vf80VarB = xf80.b(fetVar);
                        i9 = i6 & (-1908408321);
                    } else {
                        vf80VarB = vf80Var2;
                    }
                    z5 = true;
                    iujVar = iujVar4;
                }
                fetVar.s();
                boolean z9 = z5;
                ma80 ma80Var2 = ma80.f21447a;
                float fA2 = ow3Var.a();
                int i113 = i9 >> 3;
                mez mezVar5 = mezVarQ;
                i10 = (i9 & 14) | ((i9 >> 15) & 112) | (i113 & 896);
                mm40 mm40Var6 = mm40Var4;
                boolean z10 = ((((i10 & 14) ^ 6) <= 4 && fetVar.g(y3m0Var)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) <= 32 && fetVar.g(ow3Var)) || (i10 & 48) == 32);
                z2 = ((i10 & 896) ^ 384) > 256 ? false : false;
                z6 = z10 | z2;
                objP2 = fetVar.P();
                if (z6) {
                    objP2 = new jez(new hpr(lh80Var, y3m0Var, ow3Var, (byte) 25));
                    fetVar.o0(objP2);
                } else {
                    objP2 = new jez(new hpr(lh80Var, y3m0Var, ow3Var, (byte) 25));
                    fetVar.o0(objP2);
                }
                z4 = z9;
                zdx.e(mezVar5, ma80Var2, (jez) objP2, mm40Var6, lh80Var, iujVar, z4, vf80VarB, f, fA2, function1, fetVar, ((i9 >> 6) & 14) | 48 | ((i9 << 6) & 7168) | ((i9 << 3) & 57344) | 12779520 | (234881024 & i113) | ((i9 << 12) & 1879048192), (i7 << 3) & 112);
                mezVar3 = mezVar5;
                mm40Var3 = mm40Var6;
                qkqVar2 = iujVar;
            } else {
                fetVar.X();
                qkqVar2 = qkqVar;
                z4 = z;
                mm40Var3 = mm40Var2;
                mezVar3 = mezVar2;
                vf80VarB = vf80Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.udz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        ydx.f(y3m0Var, mm40Var3, mezVar3, lh80Var, f, ow3Var, qkqVar2, z4, vf80VarB, function1, (fet) obj3, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i11 |= 48;
        mm40Var2 = mm40Var;
        if ((i2 & 4) == 0) {
            mezVar2 = mezVar;
            if (fetVar.g(mezVar2)) {
            }
            int i114 = i11 | i13;
            if (fetVar.g(lh80Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            int i115 = i114 | i3 | 24576;
            if (fetVar.d(f)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            int i116 = i115 | i4;
            if (fetVar.g(ow3Var)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i6 = i116 | i5 | 104857600;
            if ((i & 805306368) == 0) {
                if ((i2 & 512) == 0) {
                    vf80Var2 = vf80Var;
                    if (fetVar.g(vf80Var2)) {
                    }
                    i6 |= i17;
                } else {
                    vf80Var2 = vf80Var;
                }
                i6 |= i17;
            } else {
                vf80Var2 = vf80Var;
            }
            if (fetVar.i(function1)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            z2 = true;
            if ((i6 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (fetVar.U(i6 & 1, z3)) {
                fetVar.Z();
                i8 = i & 1;
                Object obj3 = ukd.f35823a;
                if (i8 != 0) {
                    if (i12 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if ((i2 & 4) != 0) {
                        mezVarQ = gfx.Q(fetVar);
                        i6 &= -897;
                    } else {
                        mezVarQ = mezVar2;
                    }
                    sjjVarA = wzk0.a(fetVar);
                    zG = fetVar.g(sjjVarA);
                    objP = fetVar.P();
                    if (zG) {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    } else {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    }
                    iuj iujVar5 = (iuj) objP;
                    i9 = i6 & (-29360129);
                    if ((i2 & 512) != 0) {
                        vf80VarB = xf80.b(fetVar);
                        i9 = i6 & (-1908408321);
                    } else {
                        vf80VarB = vf80Var2;
                    }
                    z5 = true;
                    iujVar = iujVar5;
                } else {
                    if (i12 != 0) {
                        mm40Var4 = jm40.b;
                    } else {
                        mm40Var4 = mm40Var2;
                    }
                    if ((i2 & 4) != 0) {
                        mezVarQ = gfx.Q(fetVar);
                        i6 &= -897;
                    } else {
                        mezVarQ = mezVar2;
                    }
                    sjjVarA = wzk0.a(fetVar);
                    zG = fetVar.g(sjjVarA);
                    objP = fetVar.P();
                    if (zG) {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    } else {
                        objP = new iuj(sjjVarA);
                        fetVar.o0(objP);
                    }
                    iuj iujVar6 = (iuj) objP;
                    i9 = i6 & (-29360129);
                    if ((i2 & 512) != 0) {
                        vf80VarB = xf80.b(fetVar);
                        i9 = i6 & (-1908408321);
                    } else {
                        vf80VarB = vf80Var2;
                    }
                    z5 = true;
                    iujVar = iujVar6;
                }
                fetVar.s();
                boolean z11 = z5;
                ma80 ma80Var3 = ma80.f21447a;
                float fA3 = ow3Var.a();
                int i117 = i9 >> 3;
                mez mezVar6 = mezVarQ;
                i10 = (i9 & 14) | ((i9 >> 15) & 112) | (i117 & 896);
                mm40 mm40Var7 = mm40Var4;
                boolean z12 = ((((i10 & 14) ^ 6) <= 4 && fetVar.g(y3m0Var)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) <= 32 && fetVar.g(ow3Var)) || (i10 & 48) == 32);
                if (((i10 & 896) ^ 384) > 256) {
                }
                z6 = z12 | z2;
                objP2 = fetVar.P();
                if (z6) {
                    objP2 = new jez(new hpr(lh80Var, y3m0Var, ow3Var, (byte) 25));
                    fetVar.o0(objP2);
                } else {
                    objP2 = new jez(new hpr(lh80Var, y3m0Var, ow3Var, (byte) 25));
                    fetVar.o0(objP2);
                }
                z4 = z11;
                zdx.e(mezVar6, ma80Var3, (jez) objP2, mm40Var7, lh80Var, iujVar, z4, vf80VarB, f, fA3, function1, fetVar, ((i9 >> 6) & 14) | 48 | ((i9 << 6) & 7168) | ((i9 << 3) & 57344) | 12779520 | (234881024 & i117) | ((i9 << 12) & 1879048192), (i7 << 3) & 112);
                mezVar3 = mezVar6;
                mm40Var3 = mm40Var7;
                qkqVar2 = iujVar;
            } else {
                fetVar.X();
                qkqVar2 = qkqVar;
                z4 = z;
                mm40Var3 = mm40Var2;
                mezVar3 = mezVar2;
                vf80VarB = vf80Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.udz
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        ((Integer) obj5).getClass();
                        ydx.f(y3m0Var, mm40Var3, mezVar3, lh80Var, f, ow3Var, qkqVar2, z4, vf80VarB, function1, (fet) obj4, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        mezVar2 = mezVar;
        int i118 = i11 | i13;
        if (fetVar.g(lh80Var)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i119 = i118 | i3 | 24576;
        if (fetVar.d(f)) {
            i4 = 131072;
        } else {
            i4 = 65536;
        }
        int i1110 = i119 | i4;
        if (fetVar.g(ow3Var)) {
            i5 = 1048576;
        } else {
            i5 = 524288;
        }
        i6 = i1110 | i5 | 104857600;
        if ((i & 805306368) == 0) {
            if ((i2 & 512) == 0) {
                vf80Var2 = vf80Var;
                if (fetVar.g(vf80Var2)) {
                }
                i6 |= i17;
            } else {
                vf80Var2 = vf80Var;
            }
            i6 |= i17;
        } else {
            vf80Var2 = vf80Var;
        }
        if (fetVar.i(function1)) {
            i7 = 4;
        } else {
            i7 = 2;
        }
        z2 = true;
        if ((i6 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (fetVar.U(i6 & 1, z3)) {
            fetVar.Z();
            i8 = i & 1;
            Object obj4 = ukd.f35823a;
            if (i8 != 0) {
                if (i12 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if ((i2 & 4) != 0) {
                    mezVarQ = gfx.Q(fetVar);
                    i6 &= -897;
                } else {
                    mezVarQ = mezVar2;
                }
                sjjVarA = wzk0.a(fetVar);
                zG = fetVar.g(sjjVarA);
                objP = fetVar.P();
                if (zG) {
                    objP = new iuj(sjjVarA);
                    fetVar.o0(objP);
                } else {
                    objP = new iuj(sjjVarA);
                    fetVar.o0(objP);
                }
                iuj iujVar7 = (iuj) objP;
                i9 = i6 & (-29360129);
                if ((i2 & 512) != 0) {
                    vf80VarB = xf80.b(fetVar);
                    i9 = i6 & (-1908408321);
                } else {
                    vf80VarB = vf80Var2;
                }
                z5 = true;
                iujVar = iujVar7;
            } else {
                if (i12 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if ((i2 & 4) != 0) {
                    mezVarQ = gfx.Q(fetVar);
                    i6 &= -897;
                } else {
                    mezVarQ = mezVar2;
                }
                sjjVarA = wzk0.a(fetVar);
                zG = fetVar.g(sjjVarA);
                objP = fetVar.P();
                if (zG) {
                    objP = new iuj(sjjVarA);
                    fetVar.o0(objP);
                } else {
                    objP = new iuj(sjjVarA);
                    fetVar.o0(objP);
                }
                iuj iujVar8 = (iuj) objP;
                i9 = i6 & (-29360129);
                if ((i2 & 512) != 0) {
                    vf80VarB = xf80.b(fetVar);
                    i9 = i6 & (-1908408321);
                } else {
                    vf80VarB = vf80Var2;
                }
                z5 = true;
                iujVar = iujVar8;
            }
            fetVar.s();
            boolean z13 = z5;
            ma80 ma80Var4 = ma80.f21447a;
            float fA4 = ow3Var.a();
            int i1111 = i9 >> 3;
            mez mezVar7 = mezVarQ;
            i10 = (i9 & 14) | ((i9 >> 15) & 112) | (i1111 & 896);
            mm40 mm40Var8 = mm40Var4;
            boolean z14 = ((((i10 & 14) ^ 6) <= 4 && fetVar.g(y3m0Var)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) <= 32 && fetVar.g(ow3Var)) || (i10 & 48) == 32);
            if (((i10 & 896) ^ 384) > 256) {
            }
            z6 = z14 | z2;
            objP2 = fetVar.P();
            if (z6) {
                objP2 = new jez(new hpr(lh80Var, y3m0Var, ow3Var, (byte) 25));
                fetVar.o0(objP2);
            } else {
                objP2 = new jez(new hpr(lh80Var, y3m0Var, ow3Var, (byte) 25));
                fetVar.o0(objP2);
            }
            z4 = z13;
            zdx.e(mezVar7, ma80Var4, (jez) objP2, mm40Var8, lh80Var, iujVar, z4, vf80VarB, f, fA4, function1, fetVar, ((i9 >> 6) & 14) | 48 | ((i9 << 6) & 7168) | ((i9 << 3) & 57344) | 12779520 | (234881024 & i1111) | ((i9 << 12) & 1879048192), (i7 << 3) & 112);
            mezVar3 = mezVar7;
            mm40Var3 = mm40Var8;
            qkqVar2 = iujVar;
        } else {
            fetVar.X();
            qkqVar2 = qkqVar;
            z4 = z;
            mm40Var3 = mm40Var2;
            mezVar3 = mezVar2;
            vf80VarB = vf80Var2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.udz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    ydx.f(y3m0Var, mm40Var3, mezVar3, lh80Var, f, ow3Var, qkqVar2, z4, vf80VarB, function1, (fet) obj5, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void g(mm40 mm40Var, xdr xdrVar, ugd ugdVar, xdr xdrVar2, fet fetVar, int i) {
        int i2;
        fetVar.g0(1458853190);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(xdrVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(xdrVar2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = r71.z;
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
            jm40 jm40Var = jm40.b;
            if (xdrVar2 == null) {
                fetVar.e0(-1129098898);
                fetVar.r(false);
            } else {
                fetVar.e0(102124787);
                w6x.v(((i2 >> 6) & 112) | 6, xdrVar2, mrv.k0(jm40Var, "MarketCategoriesSubGamesContainerSEPARATOR"), fetVar, false);
            }
            if (xdrVar == null) {
                fetVar.e0(-1129042447);
                fetVar.r(false);
            } else {
                fetVar.e0(102126608);
                w6x.v((i2 & 112) | 6, xdrVar, mrv.k0(jm40Var, "MarketCategoriesSubGamesContainerHEADER"), fetVar, false);
            }
            ugdVar.F(mrv.k0(jm40Var, "MarketCategoriesSubGamesContainerITEMS"), fetVar, Integer.valueOf(((i2 >> 3) & 112) | 6));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 12, i, (Object) mm40Var, (Object) xdrVar, (Object) ugdVar, (Object) xdrVar2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static final void h(mm40 mm40Var, eje0 eje0Var, fet fetVar, int i) {
        fet fetVar2;
        shd shdVar;
        shd shdVar2;
        pge pgeVar;
        shd shdVar3;
        shd shdVar4;
        Function0 function0;
        jm40 jm40Var;
        mw3 mw3Var;
        xx7 xx7Var;
        boolean z;
        int i2;
        fet fetVar3;
        shd shdVar5;
        Function0 function1;
        mw3 mw3Var2;
        xx7 xx7Var2;
        shd shdVar6;
        jm40 jm40Var2;
        fet fetVar4;
        ?? r1;
        fet fetVar5;
        Function0 function2;
        fet fetVar6 = fetVar;
        pge pgeVar2 = gqw0.f1;
        mw3 mw3Var3 = uc9.c;
        xx7 xx7Var3 = gqw0.n;
        fetVar6.g0(813418969);
        int i3 = i | (fetVar6.g(mm40Var) ? 4 : 2) | (fetVar6.g(eje0Var) ? 32 : 16);
        if (fetVar6.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = o7k0.m(mm40Var, 1);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.j, fetVar6, 6);
            int iHashCode = Long.hashCode(fetVar6.T);
            bh90 bh90VarM = fetVar6.m();
            mm40 mm40VarC0 = kbc.c0(fetVar6, mm40VarM);
            mkd.c0.getClass();
            fetVar6.i0();
            boolean z2 = fetVar6.S;
            Function0 function3 = e7z.u1;
            if (z2) {
                fetVar6.l(function3);
            } else {
                fetVar6.r0();
            }
            shd shdVar7 = gqw0.x;
            jpm0.o(fetVar6, thg0VarA, shdVar7);
            shd shdVar8 = gqw0.w;
            jpm0.o(fetVar6, bh90VarM, shdVar8);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar9 = gqw0.y;
            jpm0.o(fetVar6, numValueOf, shdVar9);
            jpm0.n(fetVar6);
            shd shdVar10 = gqw0.v;
            jpm0.o(fetVar6, mm40VarC0, shdVar10);
            int length = eje0Var.i.length();
            jm40 jm40Var3 = jm40.b;
            if (length > 0) {
                fetVar6.e0(-1031349818);
                x5d x5dVarA = w5d.a(mw3Var3, xx7Var3, fetVar6, 48);
                int iHashCode2 = Long.hashCode(fetVar6.T);
                bh90 bh90VarM2 = fetVar6.m();
                mm40 mm40VarC1 = kbc.c0(fetVar6, jm40Var3);
                fetVar6.i0();
                if (fetVar6.S) {
                    fetVar6.l(function3);
                } else {
                    fetVar6.r0();
                }
                jpm0.o(fetVar6, x5dVarA, shdVar7);
                jpm0.o(fetVar6, bh90VarM2, shdVar8);
                vqd.u(iHashCode2, fetVar6, shdVar9, fetVar6);
                jpm0.o(fetVar6, mm40VarC1, shdVar10);
                shdVar2 = shdVar10;
                function0 = function3;
                shdVar = shdVar8;
                shdVar3 = shdVar9;
                j0x.b(a8k0.F(R.drawable.ic_red_card, 0, fetVar6), null, o7k0.n(jm40Var3, 16.0f), null, pgeVar2, 0.0f, null, fetVar6, 24632, 104);
                pgeVar = pgeVar2;
                mm40 mm40VarN = s5x0.N(jm40Var3, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                String str = eje0Var.i;
                pz40 pz40Var = s6t0.f31722a;
                mw3Var = mw3Var3;
                jm40Var = jm40Var3;
                xx7Var = xx7Var3;
                shdVar4 = shdVar7;
                z = true;
                v8q0.a(str, mm40VarN, s6t0.b().f33626a.getSecondary(), null, g1t0.n().f42262a.b, null, null, g1t0.n().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                fet fetVar7 = fetVar;
                fetVar7.r(true);
                i2 = 0;
                fetVar7.r(false);
                fetVar3 = fetVar7;
            } else {
                shdVar = shdVar8;
                shdVar2 = shdVar10;
                pgeVar = pgeVar2;
                shdVar3 = shdVar9;
                shdVar4 = shdVar7;
                function0 = function3;
                jm40Var = jm40Var3;
                mw3Var = mw3Var3;
                xx7Var = xx7Var3;
                z = true;
                i2 = 0;
                fetVar6.e0(-1030574291);
                fetVar6.r(false);
                fetVar3 = fetVar6;
            }
            if (eje0Var.j.length() > 0) {
                fetVar3.e0(-1030500480);
                mw3 mw3Var4 = mw3Var;
                xx7 xx7Var4 = xx7Var;
                x5d x5dVarA2 = w5d.a(mw3Var4, xx7Var4, fetVar3, 48);
                int iHashCode3 = Long.hashCode(fetVar3.T);
                bh90 bh90VarM3 = fetVar3.m();
                jm40 jm40Var4 = jm40Var;
                mm40 mm40VarC2 = kbc.c0(fetVar3, jm40Var4);
                fetVar3.i0();
                if (fetVar3.S) {
                    function2 = function0;
                    fetVar3.l(function2);
                } else {
                    function2 = function0;
                    fetVar3.r0();
                }
                shd shdVar11 = shdVar4;
                jpm0.o(fetVar3, x5dVarA2, shdVar11);
                shd shdVar12 = shdVar;
                jpm0.o(fetVar3, bh90VarM3, shdVar12);
                vqd.u(iHashCode3, fetVar3, shdVar3, fetVar3);
                jpm0.o(fetVar3, mm40VarC2, shdVar2);
                shdVar5 = shdVar12;
                shdVar6 = shdVar11;
                function1 = function2;
                j0x.b(a8k0.F(R.drawable.ic_yellow_card, i2, fetVar3), null, o7k0.n(jm40Var4, 16.0f), null, pgeVar, 0.0f, null, fetVar3, 24632, 104);
                mm40 mm40VarN2 = s5x0.N(jm40Var4, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                String str2 = eje0Var.j;
                pz40 pz40Var2 = s6t0.f31722a;
                boolean z3 = i2;
                mw3Var2 = mw3Var4;
                xx7Var2 = xx7Var4;
                jm40Var2 = jm40Var4;
                v8q0.a(str2, mm40VarN2, s6t0.b().f33626a.getSecondary(), null, g1t0.n().f42262a.b, null, null, g1t0.n().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                fet fetVar8 = fetVar;
                fetVar8.r(z);
                fetVar8.r(z3);
                r1 = z3;
                fetVar4 = fetVar8;
            } else {
                boolean z4 = i2;
                shdVar5 = shdVar;
                function1 = function0;
                mw3Var2 = mw3Var;
                xx7Var2 = xx7Var;
                shdVar6 = shdVar4;
                jm40Var2 = jm40Var;
                fetVar3.e0(-1029719187);
                fetVar3.r(z4);
                r1 = z4;
                fetVar4 = fetVar3;
            }
            if (eje0Var.k.length() > 0) {
                fetVar4.e0(-1029638680);
                x5d x5dVarA3 = w5d.a(mw3Var2, xx7Var2, fetVar4, 48);
                int iHashCode4 = Long.hashCode(fetVar4.T);
                bh90 bh90VarM4 = fetVar4.m();
                jm40 jm40Var5 = jm40Var2;
                mm40 mm40VarC3 = kbc.c0(fetVar4, jm40Var5);
                fetVar4.i0();
                if (fetVar4.S) {
                    fetVar4.l(function1);
                } else {
                    fetVar4.r0();
                }
                jpm0.o(fetVar4, x5dVarA3, shdVar6);
                jpm0.o(fetVar4, bh90VarM4, shdVar5);
                vqd.u(iHashCode4, fetVar4, shdVar3, fetVar4);
                jpm0.o(fetVar4, mm40VarC3, shdVar2);
                j0x.b(a8k0.F(R.drawable.ic_penalty_referee_last_game, r1, fetVar4), null, o7k0.n(jm40Var5, 16.0f), null, gqw0.h1, 0.0f, null, fetVar4, 24632, 104);
                mm40 mm40VarN3 = s5x0.N(jm40Var5, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                String str3 = eje0Var.k;
                pz40 pz40Var3 = s6t0.f31722a;
                v8q0.a(str3, mm40VarN3, s6t0.b().f33626a.getSecondary(), null, g1t0.n().f42262a.b, null, null, g1t0.n().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                fet fetVar9 = fetVar;
                fetVar9.r(z);
                fetVar9.r(r1);
                fetVar5 = fetVar9;
            } else {
                fetVar4.e0(-1028834323);
                fetVar4.r(r1);
                fetVar5 = fetVar4;
            }
            fetVar5.r(z);
            fetVar2 = fetVar5;
        } else {
            fetVar6.X();
            fetVar2 = fetVar6;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xie0(mm40Var, eje0Var, i, (byte) 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    public static final void i(mm40 mm40Var, eje0 eje0Var, fet fetVar, int i) {
        byte b;
        fet fetVar2;
        shd shdVar;
        shd shdVar2;
        shd shdVar3;
        shd shdVar4;
        Function0 function0;
        jm40 jm40Var;
        mw3 mw3Var;
        xx7 xx7Var;
        boolean z;
        ?? r1;
        fet fetVar3;
        shd shdVar5;
        Function0 function1;
        mw3 mw3Var2;
        xx7 xx7Var2;
        shd shdVar6;
        jm40 jm40Var2;
        fet fetVar4;
        fet fetVar5;
        Function0 function2;
        fet fetVar6 = fetVar;
        pge pgeVar = gqw0.f1;
        mw3 mw3Var3 = uc9.c;
        xx7 xx7Var3 = gqw0.n;
        fetVar6.g0(1466954478);
        int i2 = i | (fetVar6.g(mm40Var) ? 4 : 2) | (fetVar6.g(eje0Var) ? 32 : 16);
        if (fetVar6.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = o7k0.m(mm40Var, 1);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.j, fetVar6, 6);
            int iHashCode = Long.hashCode(fetVar6.T);
            bh90 bh90VarM = fetVar6.m();
            mm40 mm40VarC0 = kbc.c0(fetVar6, mm40VarM);
            mkd.c0.getClass();
            fetVar6.i0();
            boolean z2 = fetVar6.S;
            Function0 function3 = e7z.u1;
            if (z2) {
                fetVar6.l(function3);
            } else {
                fetVar6.r0();
            }
            shd shdVar7 = gqw0.x;
            jpm0.o(fetVar6, thg0VarA, shdVar7);
            shd shdVar8 = gqw0.w;
            jpm0.o(fetVar6, bh90VarM, shdVar8);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar9 = gqw0.y;
            jpm0.o(fetVar6, numValueOf, shdVar9);
            jpm0.n(fetVar6);
            shd shdVar10 = gqw0.v;
            jpm0.o(fetVar6, mm40VarC0, shdVar10);
            int length = eje0Var.n.length();
            jm40 jm40Var3 = jm40.b;
            if (length > 0) {
                fetVar6.e0(594641611);
                x5d x5dVarA = w5d.a(mw3Var3, xx7Var3, fetVar6, 48);
                int iHashCode2 = Long.hashCode(fetVar6.T);
                bh90 bh90VarM2 = fetVar6.m();
                mm40 mm40VarC1 = kbc.c0(fetVar6, jm40Var3);
                fetVar6.i0();
                if (fetVar6.S) {
                    fetVar6.l(function3);
                } else {
                    fetVar6.r0();
                }
                jpm0.o(fetVar6, x5dVarA, shdVar7);
                jpm0.o(fetVar6, bh90VarM2, shdVar8);
                vqd.u(iHashCode2, fetVar6, shdVar9, fetVar6);
                jpm0.o(fetVar6, mm40VarC1, shdVar10);
                shdVar2 = shdVar10;
                shdVar = shdVar8;
                shdVar3 = shdVar9;
                function0 = function3;
                j0x.b(a8k0.F(R.drawable.ic_penalty_referee_last_game, 0, fetVar6), null, o7k0.n(jm40Var3, 16.0f), null, gqw0.h1, 0.0f, null, fetVar6, 24632, 104);
                mm40 mm40VarN = s5x0.N(jm40Var3, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                String str = eje0Var.n;
                pz40 pz40Var = s6t0.f31722a;
                xx7Var = xx7Var3;
                shdVar4 = shdVar7;
                r1 = 0;
                z = true;
                jm40Var = jm40Var3;
                mw3Var = mw3Var3;
                v8q0.a(str, mm40VarN, s6t0.b().f33626a.getSecondary(), null, g1t0.n().f42262a.b, null, null, g1t0.n().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                fet fetVar7 = fetVar;
                fetVar7.r(true);
                fetVar7.r(false);
                fetVar3 = fetVar7;
            } else {
                shdVar = shdVar8;
                shdVar2 = shdVar10;
                shdVar3 = shdVar9;
                shdVar4 = shdVar7;
                function0 = function3;
                jm40Var = jm40Var3;
                mw3Var = mw3Var3;
                xx7Var = xx7Var3;
                z = true;
                r1 = 0;
                fetVar6.e0(595445968);
                fetVar6.r(false);
                fetVar3 = fetVar6;
            }
            if (eje0Var.m.length() > 0) {
                fetVar3.e0(595519779);
                mw3 mw3Var4 = mw3Var;
                xx7 xx7Var4 = xx7Var;
                x5d x5dVarA2 = w5d.a(mw3Var4, xx7Var4, fetVar3, 48);
                int iHashCode3 = Long.hashCode(fetVar3.T);
                bh90 bh90VarM3 = fetVar3.m();
                jm40 jm40Var4 = jm40Var;
                mm40 mm40VarC2 = kbc.c0(fetVar3, jm40Var4);
                fetVar3.i0();
                if (fetVar3.S) {
                    function2 = function0;
                    fetVar3.l(function2);
                } else {
                    function2 = function0;
                    fetVar3.r0();
                }
                shd shdVar11 = shdVar4;
                jpm0.o(fetVar3, x5dVarA2, shdVar11);
                shd shdVar12 = shdVar;
                jpm0.o(fetVar3, bh90VarM3, shdVar12);
                vqd.u(iHashCode3, fetVar3, shdVar3, fetVar3);
                jpm0.o(fetVar3, mm40VarC2, shdVar2);
                shdVar5 = shdVar12;
                shdVar6 = shdVar11;
                function1 = function2;
                j0x.b(a8k0.F(R.drawable.ic_yellow_card, r1, fetVar3), null, o7k0.n(jm40Var4, 16.0f), null, pgeVar, 0.0f, null, fetVar3, 24632, 104);
                mm40 mm40VarN2 = s5x0.N(jm40Var4, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                String str2 = eje0Var.m;
                pz40 pz40Var2 = s6t0.f31722a;
                mw3Var2 = mw3Var4;
                jm40Var2 = jm40Var4;
                xx7Var2 = xx7Var4;
                v8q0.a(str2, mm40VarN2, s6t0.b().f33626a.getSecondary(), null, g1t0.n().f42262a.b, null, null, g1t0.n().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                fet fetVar8 = fetVar;
                fetVar8.r(z);
                fetVar8.r(r1);
                fetVar4 = fetVar8;
            } else {
                shdVar5 = shdVar;
                function1 = function0;
                mw3Var2 = mw3Var;
                xx7Var2 = xx7Var;
                shdVar6 = shdVar4;
                jm40Var2 = jm40Var;
                fetVar3.e0(596301072);
                fetVar3.r(r1);
                fetVar4 = fetVar3;
            }
            if (eje0Var.l.length() > 0) {
                fetVar4.e0(596371721);
                x5d x5dVarA3 = w5d.a(mw3Var2, xx7Var2, fetVar4, 48);
                int iHashCode4 = Long.hashCode(fetVar4.T);
                bh90 bh90VarM4 = fetVar4.m();
                jm40 jm40Var5 = jm40Var2;
                mm40 mm40VarC3 = kbc.c0(fetVar4, jm40Var5);
                fetVar4.i0();
                if (fetVar4.S) {
                    fetVar4.l(function1);
                } else {
                    fetVar4.r0();
                }
                jpm0.o(fetVar4, x5dVarA3, shdVar6);
                jpm0.o(fetVar4, bh90VarM4, shdVar5);
                vqd.u(iHashCode4, fetVar4, shdVar3, fetVar4);
                jpm0.o(fetVar4, mm40VarC3, shdVar2);
                j0x.b(a8k0.F(R.drawable.ic_red_card, r1, fetVar4), null, o7k0.n(jm40Var5, 16.0f), null, pgeVar, 0.0f, null, fetVar4, 24632, 104);
                mm40 mm40VarN3 = s5x0.N(jm40Var5, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                String str3 = eje0Var.l;
                pz40 pz40Var3 = s6t0.f31722a;
                v8q0.a(str3, mm40VarN3, s6t0.b().f33626a.getSecondary(), null, g1t0.n().f42262a.b, null, null, g1t0.n().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                fet fetVar9 = fetVar;
                fetVar9.r(z);
                fetVar9.r(r1);
                fetVar5 = fetVar9;
            } else {
                fetVar4.e0(597147248);
                fetVar4.r(r1);
                fetVar5 = fetVar4;
            }
            fetVar5.r(z);
            b = z;
            fetVar2 = fetVar5;
        } else {
            b = 1;
            fetVar6.X();
            fetVar2 = fetVar6;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xie0(mm40Var, eje0Var, i, b);
        }
    }

    public static final void j(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(-1593687596);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            fetVar2 = fetVar;
            j0x.b(iom0.r(jpm0.t(R.drawable.ic_glyph_color_optionbet, 6, fetVar), fetVar), null, o7k0.n(jm40Var, 16.0f), null, null, 0.0f, null, fetVar2, 56, 120);
            mm40Var = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 9);
        }
    }

    public static final void k(mm40 mm40Var, String str, Function0 function0, fet fetVar, int i) {
        str.getClass();
        function0.getClass();
        fetVar.g0(1019892722);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = dw9.j(fetVar);
            }
            mm40 mm40VarW = y860.W(mm40Var, (gy40) objP, null, false, null, function0, 28);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            j(0, fetVar, null);
            l(6, fetVar, null, str);
            b(0, fetVar, null);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f49(mm40Var, str, function0, i, (byte) 5);
        }
    }

    public static final void l(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fetVar.g0(1831696349);
        int i2 = i | 48 | (fetVar.g(str) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, x7zVar, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.g(), fetVar), fetVar, (i2 >> 6) & 14, 24960, 110588);
            mm40Var2 = jm40.b;
        } else {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var2, str2, i, (byte) 12);
        }
    }

    public static final void m(mm40 mm40Var, q090 q090Var, Function1 function1, fet fetVar, int i) {
        q090Var.getClass();
        function1.getClass();
        fetVar.g0(-1531041219);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(q090Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            String str = q090Var.f27886a;
            a4x a4xVar = q090Var.b;
            wmm wmmVar = new wmm();
            pz40 pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(q090Var.c), fetVar);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new qu80(function1, (byte) 8);
                fetVar.o0(objP);
            }
            vmm.b(mm40Var, str, a4xVar, wmmVar, pz40VarF, (Function0) objP, null, fetVar, i2 & 14);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(mm40Var, q090Var, function1, i, (byte) 1);
        }
    }

    public static final void n(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1702990687);
        byte b = 4;
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = q3d.j(gq80.c, gq80.d, gq80.e);
                fetVar.o0(objP);
            }
            List list = (List) objP;
            boolean zI = fetVar.i(list);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                objP2 = new kv80(list, b);
                fetVar.o0(objP2);
            }
            x4n0.a(mm40Var, (Function2) objP2, fetVar, i2 & 14, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 18);
        }
    }

    public static final void o(vea0 vea0Var, x6f x6fVar, fet fetVar, int i) {
        x6f x6fVar2;
        fet fetVar2 = fetVar;
        vea0Var.getClass();
        fetVar2.g0(-728753292);
        int i2 = (fetVar2.g(vea0Var) ? 4 : 2) | i | (fetVar2.i(x6fVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            xcz xczVarA = ddz.a(0, 0, fetVar2, 0, 3);
            xcz xczVarA2 = ddz.a(0, 0, fetVar2, 0, 3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            ozb.z(new psv("", R.string.player_abilities), null, fetVar2, 0);
            cem0.g(null, vea0Var.f37275a, x6fVar, fetVar2, (i2 << 3) & 896, 1);
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(s5x0.J(i120.Q(mm40VarW, jM73getBlack400d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f), "PLAYERS_ABILITIES_ROW");
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
            xdx.j(vea0Var.c, fetVar2, 0);
            mm40 mm40VarW2 = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            xcz xczVar = vea0Var.b ? xczVarA : xczVarA2;
            lh80 lh80VarU = s5x0.u(6.0f, 0.0f, 0.0f, 0.0f, 14);
            qw3 qw3Var = new qw3(6.0f, true, new jf4((byte) 14));
            boolean z2 = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new yr80(vea0Var, (byte) 9);
                fetVar2.o0(objP);
            }
            x6fVar2 = x6fVar;
            b8k0.f(mm40VarW2, xczVar, lh80VarU, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 6, Response.NOT_ACCEPTABLE_HERE);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            x6fVar2 = x6fVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(vea0Var, x6fVar2, i, (byte) 2);
        }
    }

    public static final void p(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(956960561);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), 286.0f), 1.0f), vgg0.a(16.0f)), vbc.d0(null, fetVar, 0, 1)));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 21);
        }
    }

    public static final void q(mm40 mm40Var, eje0 eje0Var, boolean z, fet fetVar, int i) {
        k6z k6zVar;
        mm40Var.getClass();
        eje0Var.getClass();
        fetVar.g0(-845978231);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(eje0Var) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                fetVar.e0(-1236255472);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1236254548);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(196926025, new xie0(mm40Var, eje0Var), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) mm40Var, (Object) eje0Var, z, i, (byte) 19);
        }
    }

    public static final void r(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(569374615);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            a(0, fetVar, null);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), 132.0f), 1.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarD), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 25);
        }
    }

    public static final void s(int i, int i2, fet fetVar, mm40 mm40Var) {
        wui0 wui0Var;
        fetVar.g0(-1723074764);
        int i3 = (fetVar.e(i) ? 32 : 16) | i2;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            fetVar.e0(927098851);
            int i4 = 0;
            while (i4 < i) {
                mm40 mm40VarD2 = o7k0.d(jm40.b, 1.0f);
                if (i4 == 0 && i == 1) {
                    wui0Var = wui0.f39793a;
                } else if (i4 == 0) {
                    wui0Var = wui0.b;
                } else {
                    wui0Var = i4 == i + (-1) ? wui0.d : wui0.c;
                }
                g7x.n(mm40VarD2, wui0Var, fetVar, 6);
                i4++;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, i2, (byte) 12);
        }
    }

    public static final void t(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(-1854833411);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = mu90.g;
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
            twn.v(6, ugdVar, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fb8(mm40Var, ugdVar, i, (byte) 8);
        }
    }

    public static final void u(mm40 mm40Var, kfl0 kfl0Var, zcz zczVar, j700 j700Var, lh80 lh80Var, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        Boolean bool;
        zczVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(635064347);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(kfl0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(zczVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(j700Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(lh80Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function2) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 599187) != 599186)) {
            xcz xczVarA = zczVar.a("SPORT_SCREEN_STATE" + j700Var.name(), fetVar);
            wom womVarF = mom.f(fetVar);
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            Object[] objArr = new Object[0];
            boolean zG = fetVar.g(xczVarA);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new gg90(xczVarA, (byte) 18);
                fetVar.o0(objP);
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) objP, fetVar);
            Boolean boolValueOf = Boolean.valueOf(kfl0Var.f);
            boolean zG2 = ((i3 & 112) == 32) | fetVar.g(xczVarA) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zG2 || objP2 == cl5Var) {
                bool = boolValueOf;
                myj0 myj0Var = new myj0((Object) kfl0Var, (Object) xczVarA, (Object) pz40VarF, (yje) null, (byte) 29);
                fetVar.o0(myj0Var);
                objP2 = myj0Var;
            } else {
                bool = boolValueOf;
            }
            m0x0.t(fetVar, bool, (Function2) objP2);
            boolean z = kfl0Var.d;
            boolean z2 = (i3 & 458752) == 131072;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new yhl0(function1, (byte) 3);
                fetVar.o0(objP3);
            }
            mom.c(mm40Var, z, womVarF, null, false, null, (Function0) objP3, null, u1c.M(-684850448, new x2g((Object) l7m0VarY, (Object) xczVarA, (Object) lh80Var, (Object) function2, (byte) 7), fetVar), fetVar, (i3 & 14) | 100663296, 184);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49((Object) mm40Var, (Object) kfl0Var, (Object) zczVar, (Object) j700Var, (Object) lh80Var, (Object) function1, (Object) function2, i, (byte) 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[RETURN] */
    public static final boolean v(nqq nqqVar, f8m f8mVar) {
        int iOrdinal = nqqVar.e1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                nqq nqqVarC0 = uzb.c0(nqqVar);
                if (nqqVarC0 == null) {
                    jf4.n("ActiveParent must have a focusedChild");
                    return false;
                }
                int iOrdinal2 = nqqVarC0.e1().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        if (v(nqqVarC0, f8mVar) || J(nqqVar, nqqVarC0, 2, f8mVar) || (nqqVarC0.b1().f1309a && ((Boolean) f8mVar.invoke(nqqVarC0)).booleanValue())) {
                            return true;
                        }
                        return false;
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            t9f.b();
                            return false;
                        }
                        jf4.n("ActiveParent must have a focusedChild");
                        return false;
                    }
                }
                return J(nqqVar, nqqVarC0, 2, f8mVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    t9f.b();
                    return false;
                }
                if (!N(nqqVar, f8mVar)) {
                    if (!(nqqVar.b1().f1309a ? ((Boolean) f8mVar.invoke(nqqVar)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return N(nqqVar, f8mVar);
    }

    public static final void w(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        Drawable background = ((ex20) yfu0Var).d.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable == null) {
            return;
        }
        if (((dx20) cpVar.u()).d) {
            gradientDrawable.setColorFilter(dwi0.J(((dx20) cpVar.u()).g, n78.SRC_ATOP));
        } else {
            ((ex20) yfu0Var).d.setBackground(epv0.U(R.drawable.market_statistic_chip_background, cpVar.f40887a.getContext()));
        }
    }

    public static final void x(cp cpVar) {
        kxx kxxVar = (kxx) cpVar.u;
        kxxVar.e.setAllowClickWhenDisabled(((rhj0) cpVar.u()).k());
        kxxVar.e.setEnabled(((rhj0) cpVar.u()).q0());
    }

    public static final void y(cp cpVar) {
        kxx kxxVar = (kxx) cpVar.u;
        if (((rhj0) cpVar.u()).d0().length() <= 0) {
            kxxVar.d.setVisibility(8);
        } else {
            kxxVar.d.setText(((rhj0) cpVar.u()).d0());
            kxxVar.d.setVisibility(0);
        }
    }

    public static final void z(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((ex20) yfu0Var).c.setTextColor(((dx20) cpVar.u()).e);
        ((ex20) yfu0Var).b.setTextColor(((dx20) cpVar.u()).f);
    }
}
