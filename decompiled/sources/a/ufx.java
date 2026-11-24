package a;

import android.os.Build;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class ufx {
    public static final String A(double d) {
        Double dValueOf = Double.valueOf(d);
        String strC = null;
        if (d == 0.0d) {
            dValueOf = null;
        }
        if (dValueOf != null) {
            double dDoubleValue = dValueOf.doubleValue();
            pn40 pn40Var = pn40.f27267a;
            strC = pn40.c(dDoubleValue, p3u0.c);
        }
        return strC == null ? "" : strC;
    }

    public static final dfa0 B(wmg wmgVar, wmg wmgVar2) {
        return new dfa0(dyb.r0(q3d.j(uvw.F(wmgVar.d, wmgVar2.d), uvw.E(wmgVar.h, wmgVar2.h, ""), uvw.F(wmgVar.f, wmgVar2.f), uvw.F(wmgVar.g, wmgVar2.g))), wmgVar.c);
    }

    public static String C(m7h0 m7h0Var) {
        m7h0Var.getClass();
        return m7h0Var.getClass().getName();
    }

    public static final jj40 D(String str, ArrayList arrayList) {
        Object next;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((jj40) next).f16605a.equals(str));
        jj40 jj40Var = (jj40) next;
        return jj40Var == null ? (jj40) CollectionsKt.U(arrayList) : jj40Var;
    }

    public static final mm40 E(fet fetVar, mm40 mm40Var) {
        pz40 pz40VarF;
        mm40Var.getClass();
        zcl zclVar = qmk.f28987a;
        vfx vfxVarH = tfx.H(fetVar);
        p7m0 p7m0Var = vfxVarH != null ? vfxVarH.f37357a : null;
        if (p7m0Var == null) {
            fetVar.e0(-1020430043);
            fetVar.r(false);
            pz40VarF = null;
        } else {
            fetVar.e0(-1972579748);
            pz40VarF = ydx.F(p7m0Var, fetVar);
            fetVar.r(false);
        }
        cgx cgxVar = pz40VarF != null ? (cgx) pz40VarF.getValue() : null;
        float fE = pkd.e(cgxVar != null ? cgxVar.f4335a : 0, fetVar);
        float fE2 = pkd.e(cgxVar != null ? cgxVar.b : 0, fetVar);
        WeakHashMap weakHashMap = djv0.w;
        if (ycl.b(i120.O(zcm0.i(fetVar).r, fetVar).a(), 0.0f)) {
            fE2 = fE + 56.0f;
        }
        return s5x0.N(mm40Var, 0.0f, 0.0f, 0.0f, fE2, 7);
    }

    public static boolean F() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0078 A[RETURN] */
    public static int G(int i, CharSequence charSequence) {
        char cCharAt;
        if (i >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i) == '<') {
            while (true) {
                i++;
                if (i >= charSequence.length() || (cCharAt = charSequence.charAt(i)) == '\n' || cCharAt == '<') {
                    break;
                }
                if (cCharAt == '>') {
                    return i + 1;
                }
                if (cCharAt == '\\') {
                    int i2 = i + 1;
                    if (x8x.q(i2, charSequence)) {
                        i = i2;
                    }
                }
            }
            return -1;
        }
        int i3 = 0;
        int i4 = i;
        while (i4 < charSequence.length()) {
            char cCharAt2 = charSequence.charAt(i4);
            if (cCharAt2 == 0 || cCharAt2 == ' ') {
                if (i4 != i) {
                    return i4;
                }
                return -1;
            }
            if (cCharAt2 == '\\') {
                int i5 = i4 + 1;
                if (x8x.q(i5, charSequence)) {
                    i4 = i5;
                }
            } else if (cCharAt2 == '(') {
                i3++;
                if (i3 > 32) {
                    return -1;
                }
            } else if (cCharAt2 != ')') {
                if (Character.isISOControl(cCharAt2)) {
                    if (i4 != i) {
                        return i4;
                    }
                    return -1;
                }
            } else {
                if (i3 == 0) {
                    return i4;
                }
                i3--;
            }
            i4++;
        }
        return charSequence.length();
    }

    public static int H(int i, CharSequence charSequence) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case '\\':
                    int i2 = i + 1;
                    if (x8x.q(i2, charSequence)) {
                        i = i2;
                    }
                    break;
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX WARN: Code duplicated, block: B:21:0x001a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0018 A[DONT_INVERT] */
    public static int I(CharSequence charSequence, int i, char c) {
        while (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt == '\\') {
                int i2 = i + 1;
                if (x8x.q(i2, charSequence)) {
                    i = i2;
                } else {
                    if (cCharAt == c) {
                        return i;
                    }
                    if (c == ')' && cCharAt == '(') {
                        return -1;
                    }
                }
            } else {
                if (cCharAt == c) {
                    return i;
                }
                if (c == ')') {
                    continue;
                }
            }
            i++;
        }
        return charSequence.length();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    public static final abm J(Integer num, Integer num2, cdd cddVar) {
        int iOrdinal = cddVar.ordinal();
        boolean z = true;
        if (iOrdinal == 0) {
            if ((num != null ? num.intValue() : 0) <= (num2 != null ? num2.intValue() : 0)) {
                z = false;
            }
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            if ((num != null ? num.intValue() : 0) >= (num2 != null ? num2.intValue() : 0)) {
                z = false;
            }
        }
        return new abm(num != null ? Double.valueOf(num.intValue()) : null, z ? yam.b : yam.f42306a);
    }

    public static final njg0 K(qjg0 qjg0Var, lig0 lig0Var) {
        String str;
        int i = qjg0Var != null ? qjg0Var.f28838a : 0;
        switch (i) {
            case 1:
                str = "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/1/Forearm.png";
                break;
            case 2:
                str = "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/2/Forearm.png";
                break;
            case 3:
                str = "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/3/Forearm.png";
                break;
            case 4:
                str = "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/4/Forearm.png";
                break;
            case 5:
                str = "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/5/Forearm.png";
                break;
            case 6:
                str = "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/6/Forearm.png";
                break;
            case 7:
                str = "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/7/Forearm.png";
                break;
            case 8:
                str = "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/8/Forearm.png";
                break;
            case 9:
                str = "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Hands/9/Forearm.png";
                break;
            default:
                str = "";
                break;
        }
        return new njg0(new n0x(str), new n0x(ydx.M(i, lig0.f20104a)), new n0x(ydx.M(i, lig0Var)));
    }

    public static final pjg0 L(qjg0 qjg0Var) {
        String str;
        int i = qjg0Var != null ? qjg0Var.f28838a : 0;
        switch (i) {
            case 1:
                str = "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Avatars/Metal/1.png";
                break;
            case 2:
                str = "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Avatars/Metal/2.png";
                break;
            case 3:
                str = "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Avatars/Metal/3.png";
                break;
            case 4:
                str = "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Avatars/Metal/4.png";
                break;
            case 5:
                str = "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Avatars/Metal/5.png";
                break;
            case 6:
                str = "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Avatars/Metal/6.png";
                break;
            case 7:
                str = "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Avatars/Metal/7.png";
                break;
            case 8:
                str = "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Avatars/Metal/8.png";
                break;
            case 9:
                str = "https://hfoweytnvkf.com/static/img/ImgDefault/Esports/Virtual/RPS/Avatars/Metal/9.png";
                break;
            default:
                str = "";
                break;
        }
        n0x n0xVar = new n0x(str);
        String str2 = qjg0Var != null ? qjg0Var.b : null;
        return new pjg0(i, n0xVar, str2 != null ? str2 : "");
    }

    public static final lnd0 M(mnd0 mnd0Var, ctf0 ctf0Var, boolean z, String str, boolean z2) {
        String upperCase;
        ctf0Var.getClass();
        if (str == null) {
            str = "";
        }
        boolean z3 = !z;
        String strA = A(mnd0Var.b);
        String strA2 = A(mnd0Var.c);
        String strA3 = A(mnd0Var.d);
        String str2 = mnd0Var.e;
        if (mnd0Var.f) {
            upperCase = ctf0Var.b.a(R.string.maximum, Arrays.copyOf(new Object[0], 0)).toUpperCase(Locale.ROOT);
            upperCase.getClass();
        } else {
            upperCase = null;
        }
        return new lnd0(str, new epd0(strA, strA2, strA3, str2, upperCase, z3), mnd0Var.f22084a && z2);
    }

    public static final t730 N(udl0 udl0Var) {
        int iOrdinal = udl0Var.ordinal();
        if (iOrdinal == 0) {
            return t730.f33447a;
        }
        if (iOrdinal == 1) {
            return t730.b;
        }
        if (iOrdinal == 2) {
            return t730.c;
        }
        if (iOrdinal == 3) {
            return t730.d;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    public static final vqf0 O(grf0 grf0Var, String str, boolean z) {
        String strValueOf;
        csr csrVarA;
        gpf0 gpf0Var;
        boolean z2;
        ArrayList arrayList;
        int i;
        vqf0 vqf0Var;
        lnm0 lnm0Var;
        qrf0 qrf0Var;
        int i2;
        Double d;
        str.getClass();
        zof0 zof0Var = grf0Var.b;
        wrf0 wrf0Var = grf0Var.f11777a;
        wof0 wof0Var = null;
        vqf0 vqf0Var2 = null;
        if (zof0Var != null) {
            double dDoubleValue = (wrf0Var == null || (d = wrf0Var.f39640a) == null) ? 0.0d : d.doubleValue();
            Long l = zof0Var.f44718a;
            List<esf0> list = zof0Var.k;
            Double d2 = zof0Var.d;
            if (l == null) {
                throw new ef5();
            }
            long jLongValue = l.longValue();
            rk10 rk10Var = zof0Var.b;
            if (rk10Var != null) {
                rk10.Companion.getClass();
                csrVarA = qk10.a(rk10Var);
            } else {
                csrVarA = csr.e;
            }
            csr csrVar = csrVarA;
            double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
            bpf0 bpf0Var = zof0Var.e;
            if (bpf0Var == null) {
                throw new ef5();
            }
            int iOrdinal = bpf0Var.ordinal();
            if (iOrdinal == 0) {
                gpf0Var = gpf0.f11681a;
            } else if (iOrdinal == 1) {
                gpf0Var = gpf0.b;
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                gpf0Var = gpf0.c;
            }
            gpf0 gpf0Var2 = gpf0Var;
            Integer num = zof0Var.f;
            if (num == null) {
                throw new ef5();
            }
            int iIntValue = num.intValue();
            if ((d2 != null ? d2.doubleValue() : 0.0d) < dDoubleValue || !Intrinsics.d(zof0Var.g, Boolean.FALSE) || z || list == null) {
                z2 = false;
            } else {
                if (list.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator it = list.iterator();
                    i2 = 0;
                    while (it.hasNext()) {
                        if (((esf0) it.next()).c == orf0.DYNAMITE && (i2 = i2 + 1) < 0) {
                            q3d.o();
                            throw null;
                        }
                    }
                }
                if (i2 == 1 && ((esf0) CollectionsKt.d0(list)).c == orf0.DYNAMITE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            String str2 = zof0Var.h;
            if (str2 == null) {
                throw new ef5();
            }
            if (list != null) {
                ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                for (esf0 esf0Var : list) {
                    esf0Var.getClass();
                    Double d3 = esf0Var.f8325a;
                    double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
                    Integer num2 = esf0Var.b;
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    orf0 orf0Var = esf0Var.c;
                    if (orf0Var != null) {
                        int iOrdinal2 = orf0Var.ordinal();
                        if (iOrdinal2 == 0) {
                            qrf0Var = qrf0.f29208a;
                        } else if (iOrdinal2 == 1) {
                            qrf0Var = qrf0.e;
                        } else if (iOrdinal2 == 2) {
                            qrf0Var = qrf0.b;
                        } else if (iOrdinal2 == 3) {
                            qrf0Var = qrf0.c;
                        } else {
                            if (iOrdinal2 != 4) {
                                t9f.b();
                                return null;
                            }
                            qrf0Var = qrf0.d;
                        }
                    } else {
                        qrf0Var = qrf0.g;
                    }
                    arrayList2.add(new mrf0(dDoubleValue3, str, iIntValue2, qrf0Var));
                }
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = new ArrayList();
            }
            if (arrayList.isEmpty()) {
                i = 0;
            } else {
                Iterator it2 = arrayList.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (((mrf0) it2.next()).d == qrf0.f29208a && (i = i + 1) < 0) {
                        q3d.o();
                        throw null;
                    }
                }
            }
            if (arrayList.isEmpty() || i <= 0) {
                vqf0Var = null;
            } else {
                int size = arrayList.size() - 1;
                Iterator it3 = arrayList.iterator();
                int i3 = 0;
                while (true) {
                    vqf0Var = vqf0Var2;
                    if (!it3.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    if (((mrf0) it3.next()).d == qrf0.f29208a) {
                        break;
                    }
                    i3++;
                    vqf0Var2 = vqf0Var;
                }
                if (i3 != -1 && (i3 != size || z)) {
                    mrf0 mrf0Var = (mrf0) arrayList.get(i3);
                    qrf0 qrf0Var2 = qrf0.f;
                    double d4 = mrf0Var.f22270a;
                    String str3 = mrf0Var.b;
                    int i4 = mrf0Var.c;
                    str3.getClass();
                    arrayList.set(i3, new mrf0(d4, str3, i4, qrf0Var2));
                }
            }
            epf0 epf0Var = zof0Var.l;
            if (epf0Var == null) {
                throw new ef5();
            }
            int iOrdinal3 = epf0Var.ordinal();
            if (iOrdinal3 == 0) {
                lnm0Var = lnm0.c;
            } else if (iOrdinal3 == 1) {
                lnm0Var = lnm0.d;
            } else {
                if (iOrdinal3 != 2) {
                    t9f.b();
                    return vqf0Var;
                }
                lnm0Var = lnm0.e;
            }
            lnm0 lnm0Var2 = lnm0Var;
            Double d5 = zof0Var.m;
            double dDoubleValue4 = d5 != null ? d5.doubleValue() : 0.0d;
            Double d6 = zof0Var.j;
            if (d6 == null) {
                throw new ef5();
            }
            double dDoubleValue5 = d6.doubleValue();
            Boolean bool = zof0Var.i;
            wof0Var = new wof0(jLongValue, csrVar, dDoubleValue2, gpf0Var2, iIntValue, z2, str2, bool != null ? bool.booleanValue() : false, dDoubleValue5, arrayList, lnm0Var2, dDoubleValue4);
        }
        if (wrf0Var == null) {
            throw new ef5();
        }
        Double d7 = wrf0Var.f39640a;
        boolean z3 = d7 != null && d7.doubleValue() <= (wof0Var != null ? wof0Var.c : 0.0d);
        if (d7 == null || (strValueOf = String.valueOf((int) d7.doubleValue())) == null) {
            strValueOf = "";
        }
        return new vqf0(new trf0(z3, strValueOf, str), wof0Var);
    }

    public static final dxh0 P(sff0 sff0Var) {
        int iOrdinal = sff0Var.g.x.ordinal();
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

    public static final Class Q(ClassLoader classLoader, String str) {
        classLoader.getClass();
        str.getClass();
        try {
            return Class.forName(str, false, classLoader);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static final void a(mm40 mm40Var, m2h m2hVar, Function0 function0, fet fetVar, int i) {
        fetVar.g0(-790638016);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(m2hVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarM = s5x0.M(i120.Q(mm40Var, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 16.0f, 12.0f, 16.0f, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarM);
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
            i2h i2hVar = m2hVar.f21059a;
            l2h l2hVar = i2hVar.d;
            g2h g2hVar = i2hVar.c;
            xvw.c(i2hVar.f14047a, fetVar, 0);
            a4x a4xVar = i2hVar.b;
            jm40 jm40Var = jm40.b;
            uvw.b(0, fetVar, a4xVar, o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), 6.0f));
            tfx.b(g2hVar, l2hVar, fetVar, 0);
            vvw.b(o7k0.w(o7k0.d(s5x0.N(jm40Var, 0.0f, 20.0f, 0.0f, 0.0f, 13), 1.0f), null, false, 3), l2hVar, g2hVar.d, function0, fetVar, (i2 << 3) & 7168);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hpr(mm40Var, m2hVar, function0, i, (byte) 27);
        }
    }

    public static final void b(int i, fet fetVar) {
        fetVar.g0(414142564);
        byte b = 0;
        byte b2 = 1;
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 188.0f);
            lh80 lh80VarT = s5x0.t(qmk.a(fetVar).c, 0.0f, 2);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean zG = fetVar.g(fqj0VarD0);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new yq5(fqj0VarD0, b2);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hvy(i, b);
        }
    }

    public static final void c(final g610 g610Var, mm40 mm40Var, fet fetVar, int i) {
        g610Var.getClass();
        fetVar.g0(-756311160);
        final byte b = 2;
        int i2 = i | (fetVar.g(g610Var) ? 4 : 2) | (fetVar.g(mm40Var) ? 32 : 16);
        final byte b2 = 0;
        final byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            final byte b4 = 3;
            final mm40 mm40VarA = o7k0.A(o7k0.s(s5x0.N(jm40.b, 0.0f, 6.0f, 8.0f, 6.0f, 1), 46.0f), null, 3);
            mbc.f(mm40Var, 0.0f, 0.55f, u1c.M(1666502851, new xdr() { // from class: a.h610
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b5 = b2;
                    jm40 jm40Var = jm40.b;
                    g610 g610Var2 = g610Var;
                    switch (b5) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 6.0f, 8.0f, 6.0f, 1), 24.0f), g610Var2.b);
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
                                mm40 mm40VarN = o7k0.n(jm40Var, 28.0f);
                                zcl zclVar4 = qmk.e;
                                ugg0 ugg0Var = vgg0.f37379a;
                                k7x.b(g610Var2.c, null, h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarN), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                mm40 mm40VarK = s5x0.K(jm40Var, 12.0f, 6.0f);
                                String str = g610Var2.d;
                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarK, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar4, 0, 24960, 109560);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                pm80 pm80VarF2 = a8k0.F(R.drawable.icon_globe_attr_new, 0, fetVar5);
                                zcl zclVar6 = qmk.f28987a;
                                k7x.b(g610Var2.e, null, o7k0.e(o7k0.s(s5x0.L(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 0.0f, 2.0f, 1), 46.0f), 24.0f), pm80VarF2, pm80VarF2, null, null, null, null, null, null, null, fetVar5, 36912, 0, 32736);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-1373682428, new xdr() { // from class: a.h610
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b5 = b3;
                    jm40 jm40Var = jm40.b;
                    g610 g610Var2 = g610Var;
                    switch (b5) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 6.0f, 8.0f, 6.0f, 1), 24.0f), g610Var2.b);
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
                                mm40 mm40VarN = o7k0.n(jm40Var, 28.0f);
                                zcl zclVar4 = qmk.e;
                                ugg0 ugg0Var = vgg0.f37379a;
                                k7x.b(g610Var2.c, null, h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarN), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                mm40 mm40VarK = s5x0.K(jm40Var, 12.0f, 6.0f);
                                String str = g610Var2.d;
                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarK, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar4, 0, 24960, 109560);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                pm80 pm80VarF2 = a8k0.F(R.drawable.icon_globe_attr_new, 0, fetVar5);
                                zcl zclVar6 = qmk.f28987a;
                                k7x.b(g610Var2.e, null, o7k0.e(o7k0.s(s5x0.L(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 0.0f, 2.0f, 1), 46.0f), 24.0f), pm80VarF2, pm80VarF2, null, null, null, null, null, null, null, fetVar5, 36912, 0, 32736);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-118900411, new xdr() { // from class: a.h610
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b5 = b;
                    jm40 jm40Var = jm40.b;
                    g610 g610Var2 = g610Var;
                    switch (b5) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 6.0f, 8.0f, 6.0f, 1), 24.0f), g610Var2.b);
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
                                mm40 mm40VarN = o7k0.n(jm40Var, 28.0f);
                                zcl zclVar4 = qmk.e;
                                ugg0 ugg0Var = vgg0.f37379a;
                                k7x.b(g610Var2.c, null, h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarN), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                mm40 mm40VarK = s5x0.K(jm40Var, 12.0f, 6.0f);
                                String str = g610Var2.d;
                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarK, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar4, 0, 24960, 109560);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                pm80 pm80VarF2 = a8k0.F(R.drawable.icon_globe_attr_new, 0, fetVar5);
                                zcl zclVar6 = qmk.f28987a;
                                k7x.b(g610Var2.e, null, o7k0.e(o7k0.s(s5x0.L(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 0.0f, 2.0f, 1), 46.0f), 24.0f), pm80VarF2, pm80VarF2, null, null, null, null, null, null, null, fetVar5, 36912, 0, 32736);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), null, null, u1c.M(-2047789243, new xdr() { // from class: a.h610
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b5 = b4;
                    jm40 jm40Var = jm40.b;
                    g610 g610Var2 = g610Var;
                    switch (b5) {
                        case 0:
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                zcl zclVar2 = qmk.f28987a;
                                x2x.u(0, 0, fetVar2, o7k0.s(s5x0.N(jm40.b, 0.0f, 6.0f, 8.0f, 6.0f, 1), 24.0f), g610Var2.b);
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
                                mm40 mm40VarN = o7k0.n(jm40Var, 28.0f);
                                zcl zclVar4 = qmk.e;
                                ugg0 ugg0Var = vgg0.f37379a;
                                k7x.b(g610Var2.c, null, h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarN), pm80VarF, pm80VarF, null, null, null, null, null, null, null, fetVar3, 36912, 0, 32736);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 2:
                            fet fetVar4 = (fet) obj2;
                            int iIntValue3 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar4.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                zcl zclVar5 = qmk.f28987a;
                                mm40 mm40VarK = s5x0.K(jm40Var, 12.0f, 6.0f);
                                String str = g610Var2.d;
                                ((g1t0) fetVar4.k(j1t0.e)).getClass();
                                v8q0.a(str, mm40VarK, ((ThemeColors) fetVar4.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar4, 0, 24960, 109560);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj2;
                            int iIntValue4 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar5.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                pm80 pm80VarF2 = a8k0.F(R.drawable.icon_globe_attr_new, 0, fetVar5);
                                zcl zclVar6 = qmk.f28987a;
                                k7x.b(g610Var2.e, null, o7k0.e(o7k0.s(s5x0.L(s5x0.N(jm40.b, 0.0f, 0.0f, 8.0f, 0.0f, 11), 0.0f, 2.0f, 1), 46.0f), 24.0f), pm80VarF2, pm80VarF2, null, null, null, null, null, null, null, fetVar5, 36912, 0, 32736);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-793007226, new xdr() { // from class: a.i610
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b5 = b2;
                    g610 g610Var2 = g610Var;
                    mm40 mm40Var2 = mm40VarA;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b5) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x2x.u(0, 0, fetVar2, mm40Var2, g610Var2.f);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x2x.u(0, 0, fetVar2, mm40Var2, g610Var2.g);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(461774791, new xdr() { // from class: a.i610
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b5 = b3;
                    g610 g610Var2 = g610Var;
                    mm40 mm40Var2 = mm40VarA;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b5) {
                        case 0:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x2x.u(0, 0, fetVar2, mm40Var2, g610Var2.f);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            yhg0Var.getClass();
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                                x2x.u(0, 0, fetVar2, mm40Var2, g610Var2.g);
                            } else {
                                fetVar2.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, ((i2 >> 3) & 14) | 14355456, 438, 790);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k110((Object) g610Var, (Object) mm40Var, i, (byte) 2);
        }
    }

    public static final void d(mm40 mm40Var, pz40 pz40Var, boolean z, Function1 function1, Function1 function2, fet fetVar, int i) {
        boolean z2;
        Function1 function3;
        Function1 function4;
        function1.getClass();
        function2.getClass();
        fetVar.g0(4237667);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pz40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= fetVar.h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            function3 = function1;
            i2 |= fetVar.i(function3) ? 2048 : 1024;
        } else {
            function3 = function1;
        }
        if ((i & 24576) == 0) {
            function4 = function2;
            i2 |= fetVar.i(function4) ? 16384 : 8192;
        } else {
            function4 = function2;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            mm40 mm40VarA = o7k0.A(mm40Var, null, 3);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(2129309261);
            int i4 = 0;
            for (Object obj : ((ifm) pz40Var.getValue()).c()) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                fetVar.b0(-863290813, Integer.valueOf(i4));
                agc.t(null, (k4n) obj, z2, function3, function4, fetVar, i3 & 65408, 1);
                fetVar.r(false);
                z2 = z;
                function3 = function1;
                function4 = function2;
                i4 = i5;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((Object) mm40Var, (Object) pz40Var, z, function1, (wdr) function2, i, (byte) 25);
        }
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        int i2;
        mm40 mm40Var2;
        function0.getClass();
        fetVar.g0(593030669);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40Var2 = mm40Var;
            dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_more_vertically, 6, fetVar), fetVar), null, y860.W(epv0.N(mm40Var2, z ? 1.0f : 0.5f), null, null, z, null, function0, 24), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar, 56, 0);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ed(mm40Var2, z, function0, i, (byte) 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:152:0x029d  */
    /* JADX WARN: Code duplicated, block: B:158:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:164:0x0300  */
    /* JADX WARN: Code duplicated, block: B:167:0x032b A[LOOP:3: B:165:0x0325->B:167:0x032b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:171:0x0345  */
    /* JADX WARN: Code duplicated, block: B:176:0x0367  */
    /* JADX WARN: Code duplicated, block: B:179:0x0377  */
    /* JADX WARN: Code duplicated, block: B:181:0x03a9 A[LOOP:6: B:180:0x03a7->B:181:0x03a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:186:0x03de  */
    /* JADX WARN: Code duplicated, block: B:187:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:194:0x0417  */
    /* JADX WARN: Code duplicated, block: B:196:0x043d  */
    /* JADX WARN: Code duplicated, block: B:201:0x0468  */
    /* JADX WARN: Code duplicated, block: B:213:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:216:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:219:0x04d1 A[PHI: r6
  0x04d1: PHI (r6v42 kotlin.jvm.functions.Function1) = (r6v16 kotlin.jvm.functions.Function1), (r6v43 kotlin.jvm.functions.Function1) binds: [B:218:0x04cf, B:214:0x04c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:220:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:223:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:225:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:231:0x04f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:234:0x0500  */
    /* JADX WARN: Code duplicated, block: B:237:0x0533 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:238:0x0535  */
    /* JADX WARN: Code duplicated, block: B:241:0x0546  */
    /* JADX WARN: Code duplicated, block: B:244:0x0599 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x059e  */
    /* JADX WARN: Code duplicated, block: B:250:0x05c0 A[LOOP:1: B:250:0x05c0->B:270:0x0684, LOOP_START, PHI: r4
  0x05c0: PHI (r4v24 int) = (r4v23 int), (r4v28 int) binds: [B:249:0x05be, B:270:0x0684] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:252:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:254:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:257:0x0604  */
    /* JADX WARN: Code duplicated, block: B:259:0x0633 A[LOOP:2: B:258:0x0631->B:259:0x0633, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:262:0x064d  */
    /* JADX WARN: Code duplicated, block: B:264:0x0661 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:265:0x0663  */
    /* JADX WARN: Code duplicated, block: B:267:0x0677  */
    /* JADX WARN: Code duplicated, block: B:270:0x0684 A[LOOP:1: B:250:0x05c0->B:270:0x0684, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:283:0x0687 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:284:0x0699 A[EDGE_INSN: B:284:0x0699->B:278:0x0699 BREAK  A[LOOP:1: B:250:0x05c0->B:270:0x0684], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0351 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x033f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22, types: [a.yje, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r3v11, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r3v12, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r3v32, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r9v23, types: [a.qy40, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v37, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v54 */
    public static final void f(h2h0 h2h0Var, gf50 gf50Var, mm40 mm40Var, u12 u12Var, final Function1 function1, Function1 function2, final Function2 function3, fet fetVar, int i) {
        ?? r3;
        float f;
        int i2;
        Object next;
        boolean z;
        float f2;
        float fC;
        float f3;
        yfk0 yfk0Var;
        ArrayList arrayList;
        Object objP;
        Object obj;
        SnapshotStateList snapshotStateList;
        boolean zI;
        Object obj2;
        boolean zG;
        jo20 jo20Var;
        ArrayList arrayList2;
        ArrayList<y1h0> arrayList3;
        Iterator it;
        boolean zD;
        List listQ0;
        LinkedHashSet linkedHashSet;
        int size;
        int i3;
        ?? r9;
        SnapshotStateList snapshotStateList2;
        ?? r34;
        List entries;
        ArrayList arrayList4;
        int size2;
        int i4;
        Object obj3;
        Map map;
        y1h0 y1h0Var;
        int i5;
        yje yjeVar;
        boolean zI2;
        Object objP2;
        oms0 oms0Var;
        y1h0 y1h0Var2;
        yje yjeVar2;
        boolean z2;
        Function1 function4;
        boolean z3;
        boolean z4;
        Object objP3;
        int i6;
        Function1 function5;
        byte b;
        mie0 mie0Var;
        float f4;
        boolean zG2;
        Object obj4;
        Object objP4;
        Object obj5;
        SnapshotStateList snapshotStateList3;
        oms0 oms0Var2;
        boolean zG3;
        Object objP5;
        ?? r10;
        j4 j4Var;
        int size3;
        int i7;
        pf80 pf80Var;
        lkz lkzVar;
        l5d0 l5d0VarA;
        l5d0 l5d0VarA2;
        l5d0 l5d0VarA3;
        zfn zfnVar;
        Object obj6;
        ArrayList arrayList5;
        int size4;
        int i8;
        boolean zG4;
        Object obj7;
        boolean zI3;
        Object objP6;
        yje yjeVar3;
        fetVar.g0(-303833701);
        int i9 = (i & 6) == 0 ? (fetVar.g(h2h0Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i9 |= fetVar.g(gf50Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i9 |= fetVar.g(mm40Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i9 |= fetVar.g(u12Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i9 |= fetVar.i(null) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i9 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i9 |= fetVar.i(function2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i9 |= fetVar.i(function3) ? 8388608 : 4194304;
        }
        boolean z5 = true;
        if (fetVar.U(i9 & 1, (i9 & 4793491) != 4793490)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            y1h0 y1h0Var3 = h2h0Var.c;
            ArrayList arrayList6 = h2h0Var.f12334a;
            Object objP7 = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            Object obj8 = objP7;
            if (objP7 == cl5Var) {
                pvh0 pvh0Var = new pvh0(y1h0Var3);
                fetVar.o0(pvh0Var);
                obj8 = pvh0Var;
            }
            pvh0 pvh0Var2 = (pvh0) obj8;
            oms0 oms0VarV = phu0.V(pvh0Var2, "scene", fetVar, 56, 0);
            y1h0 y1h0Var4 = (y1h0) CollectionsKt.f0(h2h0Var.d);
            jf50 jf50Var = (jf50) ((hgk0) gf50Var.f11192a).getValue();
            boolean z6 = jf50Var instanceof if50;
            boolean z7 = z6 && y1h0Var4 != null;
            int i10 = i9;
            boolean z8 = jf50Var instanceof hf50;
            if (z8) {
                f = 0.0f;
            } else {
                if (z6 == 0) {
                    t9f.b();
                    return;
                }
                f = ((if50) jf50Var).f14671a.b;
            }
            if (z8) {
                i2 = 2;
            } else {
                if (!z6) {
                    t9f.b();
                    return;
                }
                i2 = ((if50) jf50Var).f14671a.f40728a;
            }
            Object objP8 = fetVar.P();
            Object obj9 = objP8;
            if (objP8 == cl5Var) {
                ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                Iterator it2 = arrayList6.iterator();
                while (it2.hasNext()) {
                    arrayList7.add(((ob50) it2.next()).b);
                }
                pz40 pz40VarE = androidx.compose.runtime.e.e(arrayList7);
                fetVar.o0(pz40VarE);
                obj9 = pz40VarE;
            }
            pz40 pz40Var = (pz40) obj9;
            boolean zG5 = fetVar.g(arrayList6);
            Object objP9 = fetVar.P();
            Object obj10 = objP9;
            if (zG5 || objP9 == cl5Var) {
                List list = (List) pz40Var.getValue();
                ArrayList arrayList8 = new ArrayList(r3d.q(arrayList6, 10));
                Iterator it3 = arrayList6.iterator();
                while (it3.hasNext()) {
                    arrayList8.add(((ob50) it3.next()).b);
                }
                if (Intrinsics.d(CollectionsKt.U(list), CollectionsKt.U(arrayList8)) && arrayList8.size() <= list.size()) {
                    Iterator it4 = q3d.h(arrayList8).iterator();
                    while (true) {
                        if (!((kkx) it4).c) {
                            next = null;
                            break;
                        }
                        next = ((bkx) it4).next();
                        int iIntValue = ((Number) next).intValue();
                        Iterator it5 = it4;
                        if (!Intrinsics.d(arrayList8.get(iIntValue), list.get(iIntValue))) {
                            break;
                        } else {
                            it4 = it5;
                        }
                    }
                    if (((Integer) next) != null || arrayList8.size() == list.size()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                pz40Var.setValue(arrayList8);
                Boolean boolValueOf = Boolean.valueOf(z);
                fetVar.o0(boolValueOf);
                obj10 = boolValueOf;
            }
            final boolean zBooleanValue = ((Boolean) obj10).booleanValue();
            Object objP10 = fetVar.P();
            Object obj11 = objP10;
            if (objP10 == cl5Var) {
                ngk0 ngk0Var = new ngk0();
                fetVar.o0(ngk0Var);
                obj11 = ngk0Var;
            }
            ngk0 ngk0Var2 = (ngk0) obj11;
            Object objP11 = fetVar.P();
            Object obj12 = objP11;
            if (objP11 == cl5Var) {
                int i11 = u960.f35269a;
                qy40 qy40Var = new qy40(6);
                fetVar.o0(qy40Var);
                obj12 = qy40Var;
            }
            ?? r11 = (qy40) obj12;
            p4 p4Var = oms0VarV.f25519a;
            pz40 pz40Var2 = oms0VarV.d;
            h63 h63Var = new h63((y1h0) p4Var.y0());
            hgk0 hgk0Var = (hgk0) pz40Var2;
            h63 h63Var2 = new h63((y1h0) hgk0Var.getValue());
            int iB = r11.b(h63Var);
            if (iB >= 0) {
                f2 = r11.c[iB];
            } else {
                f2 = 0.0f;
                r11.e(h63Var, 0.0f);
            }
            float f5 = f2;
            if (z7 || Intrinsics.d(hgk0Var.getValue(), y1h0Var3) || r11.b(h63Var2) < 0) {
                if (h63Var.equals(h63Var2)) {
                    f3 = f5;
                } else {
                    fC = (zBooleanValue || z7) ? f5 - 1.0f : f5 + 1.0f;
                }
                ngk0Var2.put(h63Var2, hgk0Var.getValue());
                yfk0Var = ngk0Var2.b;
                r11.e(h63Var2, f3);
                arrayList = h2h0Var.b;
                objP = fetVar.P();
                obj = objP;
                if (objP == cl5Var) {
                    SnapshotStateList snapshotStateList4 = new SnapshotStateList();
                    fetVar.o0(snapshotStateList4);
                    obj = snapshotStateList4;
                }
                snapshotStateList = (SnapshotStateList) obj;
                zI = fetVar.i(arrayList);
                Object objP12 = fetVar.P();
                if (!zI || objP12 == cl5Var) {
                    xr10 xr10Var = new xr10(arrayList, snapshotStateList, null, (byte) 22);
                    fetVar.o0(xr10Var);
                    obj2 = xr10Var;
                } else {
                    obj2 = objP12;
                }
                m0x0.t(fetVar, arrayList, (Function2) obj2);
                List listL0 = CollectionsKt.L0(yfk0Var);
                snapshotStateList.getClass();
                zG = fetVar.g(r11.toString()) | fetVar.g(listL0) | fetVar.g(p8a.V(snapshotStateList).c);
                Object objP13 = fetVar.P();
                if (!zG || objP13 == cl5Var) {
                    jo20Var = new jo20();
                    arrayList2 = new ArrayList();
                    List listA0 = CollectionsKt.A0(yfk0Var, new mto(r11, (byte) 4));
                    arrayList3 = new ArrayList(r3d.q(listA0, 10));
                    it = listA0.iterator();
                    while (it.hasNext()) {
                        arrayList3.add((y1h0) ((Map.Entry) it.next()).getValue());
                    }
                    for (y1h0 y1h0Var5 : arrayList3) {
                        if (!arrayList2.contains(y1h0Var5)) {
                            arrayList2.add(y1h0Var5);
                        }
                    }
                    zD = Intrinsics.d(hgk0Var.getValue(), CollectionsKt.U(arrayList2));
                    listQ0 = CollectionsKt.q0(snapshotStateList, arrayList2);
                    if (!zD) {
                        listQ0 = CollectionsKt.t0(listQ0);
                    }
                    linkedHashSet = new LinkedHashSet();
                    size = listQ0.size();
                    i3 = 0;
                    r9 = r11;
                    while (i3 < size) {
                        SnapshotStateList snapshotStateList5 = snapshotStateList;
                        y1h0 y1h0Var6 = (y1h0) listQ0.get(i3);
                        ?? r35 = r9;
                        jo20Var.put(new h63(y1h0Var6), CollectionsKt.O0(linkedHashSet));
                        entries = y1h0Var6.getEntries();
                        jo20 jo20Var2 = jo20Var;
                        arrayList4 = new ArrayList(entries.size());
                        size2 = entries.size();
                        List list2 = listQ0;
                        i4 = 0;
                        while (i4 < size2) {
                            arrayList4.add(((ob50) entries.get(i4)).b);
                            i4++;
                            entries = entries;
                        }
                        linkedHashSet.addAll(arrayList4);
                        i3++;
                        jo20Var = jo20Var2;
                        listQ0 = list2;
                        snapshotStateList = snapshotStateList5;
                        r9 = r35;
                    }
                    snapshotStateList2 = snapshotStateList;
                    r34 = r9;
                    jo20 jo20VarB = jo20Var.b();
                    fetVar.o0(jo20VarB);
                    obj3 = jo20VarB;
                } else {
                    snapshotStateList2 = snapshotStateList;
                    r34 = r11;
                    obj3 = objP13;
                }
                map = (Map) obj3;
                if (f5 >= f3) {
                    y1h0Var = (y1h0) oms0VarV.f25519a.y0();
                } else {
                    y1h0Var = (y1h0) hgk0Var.getValue();
                }
                if (z7) {
                    fetVar.e0(-2006502809);
                    Float fValueOf = Float.valueOf(f);
                    zI3 = fetVar.i(pvh0Var2) | fetVar.d(f) | fetVar.g(y1h0Var4);
                    objP6 = fetVar.P();
                    if (!zI3 || objP6 == cl5Var) {
                        float f6 = f;
                        i5 = 131072;
                        yjeVar3 = null;
                        ep8 ep8Var = new ep8((byte) 3, f6, yjeVar3, pvh0Var2, y1h0Var4);
                        fetVar.o0(ep8Var);
                        objP6 = ep8Var;
                    } else {
                        i5 = 131072;
                        yjeVar3 = null;
                    }
                    m0x0.v(y1h0Var4, fValueOf, (Function2) objP6, fetVar);
                    fetVar.r(false);
                    z2 = false;
                    yjeVar2 = yjeVar3;
                    oms0Var = oms0VarV;
                } else {
                    arrayList = arrayList;
                    i5 = 131072;
                    yjeVar = null;
                    fetVar.e0(-2006246408);
                    zI2 = fetVar.i(pvh0Var2) | fetVar.g(y1h0Var3) | fetVar.g(oms0VarV);
                    objP2 = fetVar.P();
                    if (!zI2 || objP2 == cl5Var) {
                        oms0Var = oms0VarV;
                        o3s o3sVar = new o3s(pvh0Var2, y1h0Var3, oms0Var, yjeVar, (byte) 23);
                        y1h0Var2 = y1h0Var3;
                        yjeVar2 = null;
                        fetVar.o0(o3sVar);
                        objP2 = o3sVar;
                    } else {
                        oms0Var = oms0VarV;
                        y1h0Var2 = y1h0Var3;
                        yjeVar2 = null;
                    }
                    m0x0.t(fetVar, y1h0Var2, (Function2) objP2);
                    z2 = false;
                    fetVar.r(false);
                }
                boolean zH = fetVar.h(z7) | fetVar.g(y1h0Var) | fetVar.e(i2) | (((((i10 & 29360128) ^ 12582912) > 8388608 || !fetVar.g(function3)) && (i10 & 12582912) != 8388608) ? z2 : true) | fetVar.h(zBooleanValue);
                if (((i10 & 3670016) ^ 1572864) > 1048576) {
                    function4 = function2;
                    if (!fetVar.g(function4)) {
                        z3 = true;
                    }
                    boolean z9 = zH | z3;
                    if ((((i10 & 458752) ^ 196608) > i5 || !fetVar.g(function1)) && (i10 & 196608) != i5) {
                    }
                    z4 = z9 | z5;
                    objP3 = fetVar.P();
                    if (!z4 || objP3 == cl5Var) {
                        final boolean z10 = z7;
                        final Function1 function6 = function4;
                        final int i12 = i2;
                        i6 = 56;
                        final y1h0 y1h0Var7 = y1h0Var;
                        Function1 function7 = new Function1() { // from class: a.jb50
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj13) {
                                Map map2;
                                lie lieVar;
                                Map map3;
                                lie lieVar2;
                                Map map4;
                                lie lieVar3;
                                c53 c53Var = (c53) obj13;
                                boolean z11 = z10;
                                y1h0 y1h0Var8 = y1h0Var7;
                                if (z11) {
                                    ob50 ob50Var = (ob50) CollectionsKt.f0(y1h0Var8.getEntries());
                                    if (ob50Var == null || (map4 = ob50Var.c) == null) {
                                        map4 = lun.f20680a;
                                        map4.getClass();
                                    }
                                    Object obj14 = map4.get(lwf.u.toString());
                                    if (obj14 == null) {
                                        obj14 = null;
                                    }
                                    Function2 function8 = zys0.f(2, obj14) ? (Function2) obj14 : null;
                                    int i13 = i12;
                                    return (function8 == null || (lieVar3 = (lie) function8.invoke(c53Var, Integer.valueOf(i13))) == null) ? (lie) function3.invoke(c53Var, Integer.valueOf(i13)) : lieVar3;
                                }
                                if (zBooleanValue) {
                                    m2a m2aVar = m2a.u;
                                    ob50 ob50Var2 = (ob50) CollectionsKt.f0(y1h0Var8.getEntries());
                                    if (ob50Var2 == null || (map3 = ob50Var2.c) == null) {
                                        map3 = lun.f20680a;
                                        map3.getClass();
                                    }
                                    Object obj15 = map3.get(m2aVar.toString());
                                    if (obj15 == null) {
                                        obj15 = null;
                                    }
                                    Function1 function9 = zys0.f(1, obj15) ? (Function1) obj15 : null;
                                    return (function9 == null || (lieVar2 = (lie) function9.invoke(c53Var)) == null) ? (lie) function6.invoke(c53Var) : lieVar2;
                                }
                                ujn ujnVar = ujn.v;
                                ob50 ob50Var3 = (ob50) CollectionsKt.f0(y1h0Var8.getEntries());
                                if (ob50Var3 == null || (map2 = ob50Var3.c) == null) {
                                    map2 = lun.f20680a;
                                    map2.getClass();
                                }
                                Object obj16 = map2.get(ujnVar.toString());
                                if (obj16 == null) {
                                    obj16 = null;
                                }
                                Function1 function10 = zys0.f(1, obj16) ? (Function1) obj16 : null;
                                return (function10 == null || (lieVar = (lie) function10.invoke(c53Var)) == null) ? (lie) function1.invoke(c53Var) : lieVar;
                            }
                        };
                        fetVar.o0(function7);
                        objP3 = function7;
                    } else {
                        i6 = 56;
                    }
                    function5 = (Function1) objP3;
                    b = 6;
                    mie0Var = new mie0();
                    f4 = f3;
                    zG2 = fetVar.g(function5) | fetVar.d(f4) | fetVar.i(yjeVar2);
                    Object objP14 = fetVar.P();
                    obj4 = objP14;
                    if (zG2 || objP14 == cl5Var) {
                        cel celVar = new cel(function5, f4, b);
                        fetVar.o0(celVar);
                        obj4 = celVar;
                    }
                    Function1 function8 = (Function1) obj4;
                    objP4 = fetVar.P();
                    obj5 = objP4;
                    if (objP4 == cl5Var) {
                        da40 da40Var = new da40((byte) 28);
                        fetVar.o0(da40Var);
                        obj5 = da40Var;
                    }
                    snapshotStateList3 = snapshotStateList2;
                    oms0Var2 = oms0Var;
                    ay3.e(oms0Var2, mm40Var, function8, u12Var, (Function1) obj5, u1c.M(-1167420988, new g54((Object) oms0Var, (Object) snapshotStateList3, (Object) mie0Var, (Object) map, (byte) 12), fetVar), fetVar, ((i10 >> 3) & 112) | 221184 | (i10 & 7168), 0);
                    r3 = fetVar;
                    zG3 = r3.g(oms0Var2) | r3.i(r34);
                    objP5 = r3.P();
                    if (!zG3 || objP5 == cl5Var) {
                        r10 = 0;
                        hk40 hk40Var = new hk40((Object) oms0Var2, (Object) ngk0Var2, (Object) r34, (yje) (false ? 1 : 0), (byte) 8);
                        r3.o0(hk40Var);
                        objP5 = hk40Var;
                    } else {
                        r10 = 0;
                    }
                    m0x0.t(r3, oms0Var2, (Function2) objP5);
                    j4Var = p8a.V(snapshotStateList3).c;
                    size3 = j4Var.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            i7 = size3 - 1;
                            pf80Var = (pf80) j4Var.get(size3);
                            r3.b0(43486632, pf80Var);
                            if (Intrinsics.d(CollectionsKt.firstOrNull(arrayList), pf80Var)) {
                                lkzVar = lkz.e;
                            } else {
                                lkzVar = lkz.d;
                            }
                            l5d0VarA = or00.f25714a.a(r8x.V(lkzVar, r3, 2));
                            l5d0VarA2 = g2h0.f10557a.a(xp20.d(map, new h63(pf80Var)));
                            l5d0VarA3 = loj0.f20394a.a(pf80Var);
                            zfnVar = pr00.f27441a;
                            obj6 = mie0Var.f21842a;
                            if (obj6 != null) {
                                Intrinsics.h("animatedContentScope");
                                throw r10;
                            }
                            obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, l5d0VarA3, zfnVar.a((b53) obj6)}, u1c.M(-1656080439, new pi40(pf80Var, (byte) 12), r3), r3, i6);
                            r3.r(false);
                            arrayList5 = new ArrayList(arrayList.size());
                            size4 = arrayList.size();
                            for (i8 = 0; i8 < size4; i8++) {
                                arrayList5.add(((pf80) arrayList.get(i8)).getKey());
                            }
                            if (arrayList5.contains(pf80Var.getKey())) {
                                r3.e0(1349212134);
                                r3.r(false);
                            } else {
                                r3.e0(1349048764);
                                Object key = pf80Var.getKey();
                                zG4 = r3.g(pf80Var);
                                Object objP15 = r3.P();
                                obj7 = objP15;
                                if (zG4 || objP15 == cl5Var) {
                                    j940 j940Var = new j940(pf80Var, snapshotStateList3, r10, (byte) 11);
                                    r3.o0(j940Var);
                                    obj7 = j940Var;
                                }
                                m0x0.t(r3, key, (Function2) obj7);
                                r3.r(false);
                            }
                            if (i7 < 0) {
                                break;
                            } else {
                                size3 = i7;
                            }
                        }
                    }
                } else {
                    function4 = function2;
                }
                if ((i10 & 1572864) == 1048576) {
                    z3 = true;
                } else {
                    z3 = z2;
                }
                boolean z11 = zH | z3;
                z5 = ((i10 & 458752) ^ 196608) > i5 ? z2 : z2;
                z4 = z11 | z5;
                objP3 = fetVar.P();
                if (z4) {
                    final boolean z12 = z7;
                    final Function1 function9 = function4;
                    final int i13 = i2;
                    i6 = 56;
                    final y1h0 y1h0Var8 = y1h0Var;
                    Function1 function10 = new Function1() { // from class: a.jb50
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj13) {
                            Map map2;
                            lie lieVar;
                            Map map3;
                            lie lieVar2;
                            Map map4;
                            lie lieVar3;
                            c53 c53Var = (c53) obj13;
                            boolean z13 = z12;
                            y1h0 y1h0Var9 = y1h0Var8;
                            if (z13) {
                                ob50 ob50Var = (ob50) CollectionsKt.f0(y1h0Var9.getEntries());
                                if (ob50Var == null || (map4 = ob50Var.c) == null) {
                                    map4 = lun.f20680a;
                                    map4.getClass();
                                }
                                Object obj14 = map4.get(lwf.u.toString());
                                if (obj14 == null) {
                                    obj14 = null;
                                }
                                Function2 function11 = zys0.f(2, obj14) ? (Function2) obj14 : null;
                                int i14 = i13;
                                return (function11 == null || (lieVar3 = (lie) function11.invoke(c53Var, Integer.valueOf(i14))) == null) ? (lie) function3.invoke(c53Var, Integer.valueOf(i14)) : lieVar3;
                            }
                            if (zBooleanValue) {
                                m2a m2aVar = m2a.u;
                                ob50 ob50Var2 = (ob50) CollectionsKt.f0(y1h0Var9.getEntries());
                                if (ob50Var2 == null || (map3 = ob50Var2.c) == null) {
                                    map3 = lun.f20680a;
                                    map3.getClass();
                                }
                                Object obj15 = map3.get(m2aVar.toString());
                                if (obj15 == null) {
                                    obj15 = null;
                                }
                                Function1 function12 = zys0.f(1, obj15) ? (Function1) obj15 : null;
                                return (function12 == null || (lieVar2 = (lie) function12.invoke(c53Var)) == null) ? (lie) function9.invoke(c53Var) : lieVar2;
                            }
                            ujn ujnVar = ujn.v;
                            ob50 ob50Var3 = (ob50) CollectionsKt.f0(y1h0Var9.getEntries());
                            if (ob50Var3 == null || (map2 = ob50Var3.c) == null) {
                                map2 = lun.f20680a;
                                map2.getClass();
                            }
                            Object obj16 = map2.get(ujnVar.toString());
                            if (obj16 == null) {
                                obj16 = null;
                            }
                            Function1 function13 = zys0.f(1, obj16) ? (Function1) obj16 : null;
                            return (function13 == null || (lieVar = (lie) function13.invoke(c53Var)) == null) ? (lie) function1.invoke(c53Var) : lieVar;
                        }
                    };
                    fetVar.o0(function10);
                    objP3 = function10;
                } else {
                    final boolean z13 = z7;
                    final Function1 function11 = function4;
                    final int i14 = i2;
                    i6 = 56;
                    final y1h0 y1h0Var9 = y1h0Var;
                    Function1 function12 = new Function1() { // from class: a.jb50
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj13) {
                            Map map2;
                            lie lieVar;
                            Map map3;
                            lie lieVar2;
                            Map map4;
                            lie lieVar3;
                            c53 c53Var = (c53) obj13;
                            boolean z14 = z13;
                            y1h0 y1h0Var10 = y1h0Var9;
                            if (z14) {
                                ob50 ob50Var = (ob50) CollectionsKt.f0(y1h0Var10.getEntries());
                                if (ob50Var == null || (map4 = ob50Var.c) == null) {
                                    map4 = lun.f20680a;
                                    map4.getClass();
                                }
                                Object obj14 = map4.get(lwf.u.toString());
                                if (obj14 == null) {
                                    obj14 = null;
                                }
                                Function2 function13 = zys0.f(2, obj14) ? (Function2) obj14 : null;
                                int i15 = i14;
                                return (function13 == null || (lieVar3 = (lie) function13.invoke(c53Var, Integer.valueOf(i15))) == null) ? (lie) function3.invoke(c53Var, Integer.valueOf(i15)) : lieVar3;
                            }
                            if (zBooleanValue) {
                                m2a m2aVar = m2a.u;
                                ob50 ob50Var2 = (ob50) CollectionsKt.f0(y1h0Var10.getEntries());
                                if (ob50Var2 == null || (map3 = ob50Var2.c) == null) {
                                    map3 = lun.f20680a;
                                    map3.getClass();
                                }
                                Object obj15 = map3.get(m2aVar.toString());
                                if (obj15 == null) {
                                    obj15 = null;
                                }
                                Function1 function14 = zys0.f(1, obj15) ? (Function1) obj15 : null;
                                return (function14 == null || (lieVar2 = (lie) function14.invoke(c53Var)) == null) ? (lie) function11.invoke(c53Var) : lieVar2;
                            }
                            ujn ujnVar = ujn.v;
                            ob50 ob50Var3 = (ob50) CollectionsKt.f0(y1h0Var10.getEntries());
                            if (ob50Var3 == null || (map2 = ob50Var3.c) == null) {
                                map2 = lun.f20680a;
                                map2.getClass();
                            }
                            Object obj16 = map2.get(ujnVar.toString());
                            if (obj16 == null) {
                                obj16 = null;
                            }
                            Function1 function15 = zys0.f(1, obj16) ? (Function1) obj16 : null;
                            return (function15 == null || (lieVar = (lie) function15.invoke(c53Var)) == null) ? (lie) function1.invoke(c53Var) : lieVar;
                        }
                    };
                    fetVar.o0(function12);
                    objP3 = function12;
                }
                function5 = (Function1) objP3;
                b = 6;
                mie0Var = new mie0();
                f4 = f3;
                zG2 = fetVar.g(function5) | fetVar.d(f4) | fetVar.i(yjeVar2);
                Object objP16 = fetVar.P();
                obj4 = objP16;
                if (zG2) {
                    cel celVar2 = new cel(function5, f4, b);
                    fetVar.o0(celVar2);
                    obj4 = celVar2;
                } else {
                    cel celVar3 = new cel(function5, f4, b);
                    fetVar.o0(celVar3);
                    obj4 = celVar3;
                }
                Function1 function13 = (Function1) obj4;
                objP4 = fetVar.P();
                obj5 = objP4;
                if (objP4 == cl5Var) {
                    da40 da40Var2 = new da40((byte) 28);
                    fetVar.o0(da40Var2);
                    obj5 = da40Var2;
                }
                snapshotStateList3 = snapshotStateList2;
                oms0Var2 = oms0Var;
                ay3.e(oms0Var2, mm40Var, function13, u12Var, (Function1) obj5, u1c.M(-1167420988, new g54((Object) oms0Var, (Object) snapshotStateList3, (Object) mie0Var, (Object) map, (byte) 12), fetVar), fetVar, ((i10 >> 3) & 112) | 221184 | (i10 & 7168), 0);
                r3 = fetVar;
                zG3 = r3.g(oms0Var2) | r3.i(r34);
                objP5 = r3.P();
                if (zG3) {
                    r10 = 0;
                    hk40 hk40Var2 = new hk40((Object) oms0Var2, (Object) ngk0Var2, (Object) r34, (yje) (false ? 1 : 0), (byte) 8);
                    r3.o0(hk40Var2);
                    objP5 = hk40Var2;
                } else {
                    r10 = 0;
                    hk40 hk40Var3 = new hk40((Object) oms0Var2, (Object) ngk0Var2, (Object) r34, (yje) (false ? 1 : 0), (byte) 8);
                    r3.o0(hk40Var3);
                    objP5 = hk40Var3;
                }
                m0x0.t(r3, oms0Var2, (Function2) objP5);
                j4Var = p8a.V(snapshotStateList3).c;
                size3 = j4Var.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        i7 = size3 - 1;
                        pf80Var = (pf80) j4Var.get(size3);
                        r3.b0(43486632, pf80Var);
                        if (Intrinsics.d(CollectionsKt.firstOrNull(arrayList), pf80Var)) {
                            lkzVar = lkz.e;
                        } else {
                            lkzVar = lkz.d;
                        }
                        l5d0VarA = or00.f25714a.a(r8x.V(lkzVar, r3, 2));
                        l5d0VarA2 = g2h0.f10557a.a(xp20.d(map, new h63(pf80Var)));
                        l5d0VarA3 = loj0.f20394a.a(pf80Var);
                        zfnVar = pr00.f27441a;
                        obj6 = mie0Var.f21842a;
                        if (obj6 != null) {
                            Intrinsics.h("animatedContentScope");
                            throw r10;
                        }
                        obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, l5d0VarA3, zfnVar.a((b53) obj6)}, u1c.M(-1656080439, new pi40(pf80Var, (byte) 12), r3), r3, i6);
                        r3.r(false);
                        arrayList5 = new ArrayList(arrayList.size());
                        size4 = arrayList.size();
                        while (i8 < size4) {
                            arrayList5.add(((pf80) arrayList.get(i8)).getKey());
                        }
                        if (arrayList5.contains(pf80Var.getKey())) {
                            r3.e0(1349048764);
                            Object key2 = pf80Var.getKey();
                            zG4 = r3.g(pf80Var);
                            Object objP17 = r3.P();
                            obj7 = objP17;
                            if (zG4) {
                                j940 j940Var2 = new j940(pf80Var, snapshotStateList3, r10, (byte) 11);
                                r3.o0(j940Var2);
                                obj7 = j940Var2;
                            } else {
                                j940 j940Var3 = new j940(pf80Var, snapshotStateList3, r10, (byte) 11);
                                r3.o0(j940Var3);
                                obj7 = j940Var3;
                            }
                            m0x0.t(r3, key2, (Function2) obj7);
                            r3.r(false);
                        } else {
                            r3.e0(1349212134);
                            r3.r(false);
                        }
                        if (i7 < 0) {
                            break;
                            break;
                        }
                        size3 = i7;
                    }
                }
            } else {
                fC = r11.c(h63Var2);
            }
            f3 = fC;
            ngk0Var2.put(h63Var2, hgk0Var.getValue());
            yfk0Var = ngk0Var2.b;
            r11.e(h63Var2, f3);
            arrayList = h2h0Var.b;
            objP = fetVar.P();
            obj = objP;
            if (objP == cl5Var) {
                SnapshotStateList snapshotStateList6 = new SnapshotStateList();
                fetVar.o0(snapshotStateList6);
                obj = snapshotStateList6;
            }
            snapshotStateList = (SnapshotStateList) obj;
            zI = fetVar.i(arrayList);
            Object objP18 = fetVar.P();
            if (zI) {
                xr10 xr10Var2 = new xr10(arrayList, snapshotStateList, null, (byte) 22);
                fetVar.o0(xr10Var2);
                obj2 = xr10Var2;
            } else {
                xr10 xr10Var3 = new xr10(arrayList, snapshotStateList, null, (byte) 22);
                fetVar.o0(xr10Var3);
                obj2 = xr10Var3;
            }
            m0x0.t(fetVar, arrayList, (Function2) obj2);
            List listL1 = CollectionsKt.L0(yfk0Var);
            snapshotStateList.getClass();
            zG = fetVar.g(r11.toString()) | fetVar.g(listL1) | fetVar.g(p8a.V(snapshotStateList).c);
            Object objP19 = fetVar.P();
            if (zG) {
                jo20Var = new jo20();
                arrayList2 = new ArrayList();
                List listA1 = CollectionsKt.A0(yfk0Var, new mto(r11, (byte) 4));
                arrayList3 = new ArrayList(r3d.q(listA1, 10));
                it = listA1.iterator();
                while (it.hasNext()) {
                    arrayList3.add((y1h0) ((Map.Entry) it.next()).getValue());
                }
                while (r10.hasNext()) {
                    if (!arrayList2.contains(y1h0Var5)) {
                        arrayList2.add(y1h0Var5);
                    }
                }
                zD = Intrinsics.d(hgk0Var.getValue(), CollectionsKt.U(arrayList2));
                listQ0 = CollectionsKt.q0(snapshotStateList, arrayList2);
                if (!zD) {
                    listQ0 = CollectionsKt.t0(listQ0);
                }
                linkedHashSet = new LinkedHashSet();
                size = listQ0.size();
                i3 = 0;
                r9 = r11;
                while (i3 < size) {
                    SnapshotStateList snapshotStateList7 = snapshotStateList;
                    y1h0 y1h0Var10 = (y1h0) listQ0.get(i3);
                    ?? r36 = r9;
                    jo20Var.put(new h63(y1h0Var10), CollectionsKt.O0(linkedHashSet));
                    entries = y1h0Var10.getEntries();
                    jo20 jo20Var3 = jo20Var;
                    arrayList4 = new ArrayList(entries.size());
                    size2 = entries.size();
                    List list3 = listQ0;
                    i4 = 0;
                    while (i4 < size2) {
                        arrayList4.add(((ob50) entries.get(i4)).b);
                        i4++;
                        entries = entries;
                    }
                    linkedHashSet.addAll(arrayList4);
                    i3++;
                    jo20Var = jo20Var3;
                    listQ0 = list3;
                    snapshotStateList = snapshotStateList7;
                    r9 = r36;
                }
                snapshotStateList2 = snapshotStateList;
                r34 = r9;
                jo20 jo20VarB2 = jo20Var.b();
                fetVar.o0(jo20VarB2);
                obj3 = jo20VarB2;
            } else {
                jo20Var = new jo20();
                arrayList2 = new ArrayList();
                List listA2 = CollectionsKt.A0(yfk0Var, new mto(r11, (byte) 4));
                arrayList3 = new ArrayList(r3d.q(listA2, 10));
                it = listA2.iterator();
                while (it.hasNext()) {
                    arrayList3.add((y1h0) ((Map.Entry) it.next()).getValue());
                }
                while (r10.hasNext()) {
                    if (!arrayList2.contains(y1h0Var5)) {
                        arrayList2.add(y1h0Var5);
                    }
                }
                zD = Intrinsics.d(hgk0Var.getValue(), CollectionsKt.U(arrayList2));
                listQ0 = CollectionsKt.q0(snapshotStateList, arrayList2);
                if (!zD) {
                    listQ0 = CollectionsKt.t0(listQ0);
                }
                linkedHashSet = new LinkedHashSet();
                size = listQ0.size();
                i3 = 0;
                r9 = r11;
                while (i3 < size) {
                    SnapshotStateList snapshotStateList8 = snapshotStateList;
                    y1h0 y1h0Var11 = (y1h0) listQ0.get(i3);
                    ?? r37 = r9;
                    jo20Var.put(new h63(y1h0Var11), CollectionsKt.O0(linkedHashSet));
                    entries = y1h0Var11.getEntries();
                    jo20 jo20Var4 = jo20Var;
                    arrayList4 = new ArrayList(entries.size());
                    size2 = entries.size();
                    List list4 = listQ0;
                    i4 = 0;
                    while (i4 < size2) {
                        arrayList4.add(((ob50) entries.get(i4)).b);
                        i4++;
                        entries = entries;
                    }
                    linkedHashSet.addAll(arrayList4);
                    i3++;
                    jo20Var = jo20Var4;
                    listQ0 = list4;
                    snapshotStateList = snapshotStateList8;
                    r9 = r37;
                }
                snapshotStateList2 = snapshotStateList;
                r34 = r9;
                jo20 jo20VarB3 = jo20Var.b();
                fetVar.o0(jo20VarB3);
                obj3 = jo20VarB3;
            }
            map = (Map) obj3;
            if (f5 >= f3) {
                y1h0Var = (y1h0) oms0VarV.f25519a.y0();
            } else {
                y1h0Var = (y1h0) hgk0Var.getValue();
            }
            if (z7) {
                fetVar.e0(-2006502809);
                Float fValueOf2 = Float.valueOf(f);
                zI3 = fetVar.i(pvh0Var2) | fetVar.d(f) | fetVar.g(y1h0Var4);
                objP6 = fetVar.P();
                if (zI3) {
                    float f7 = f;
                    i5 = 131072;
                    yjeVar3 = null;
                    ep8 ep8Var2 = new ep8((byte) 3, f7, yjeVar3, pvh0Var2, y1h0Var4);
                    fetVar.o0(ep8Var2);
                    objP6 = ep8Var2;
                } else {
                    float f8 = f;
                    i5 = 131072;
                    yjeVar3 = null;
                    ep8 ep8Var3 = new ep8((byte) 3, f8, yjeVar3, pvh0Var2, y1h0Var4);
                    fetVar.o0(ep8Var3);
                    objP6 = ep8Var3;
                }
                m0x0.v(y1h0Var4, fValueOf2, (Function2) objP6, fetVar);
                fetVar.r(false);
                z2 = false;
                yjeVar2 = yjeVar3;
                oms0Var = oms0VarV;
            } else {
                arrayList = arrayList;
                i5 = 131072;
                yjeVar = null;
                fetVar.e0(-2006246408);
                zI2 = fetVar.i(pvh0Var2) | fetVar.g(y1h0Var3) | fetVar.g(oms0VarV);
                objP2 = fetVar.P();
                if (zI2) {
                    oms0Var = oms0VarV;
                    o3s o3sVar2 = new o3s(pvh0Var2, y1h0Var3, oms0Var, yjeVar, (byte) 23);
                    y1h0Var2 = y1h0Var3;
                    yjeVar2 = null;
                    fetVar.o0(o3sVar2);
                    objP2 = o3sVar2;
                } else {
                    oms0Var = oms0VarV;
                    o3s o3sVar3 = new o3s(pvh0Var2, y1h0Var3, oms0Var, yjeVar, (byte) 23);
                    y1h0Var2 = y1h0Var3;
                    yjeVar2 = null;
                    fetVar.o0(o3sVar3);
                    objP2 = o3sVar3;
                }
                m0x0.t(fetVar, y1h0Var2, (Function2) objP2);
                z2 = false;
                fetVar.r(false);
            }
            boolean zH2 = fetVar.h(z7) | fetVar.g(y1h0Var) | fetVar.e(i2) | (((((i10 & 29360128) ^ 12582912) > 8388608 || !fetVar.g(function3)) && (i10 & 12582912) != 8388608) ? z2 : true) | fetVar.h(zBooleanValue);
            if (((i10 & 3670016) ^ 1572864) > 1048576) {
                function4 = function2;
                if (!fetVar.g(function4)) {
                    z3 = true;
                }
                boolean z14 = zH2 | z3;
                if (((i10 & 458752) ^ 196608) > i5) {
                }
                z4 = z14 | z5;
                objP3 = fetVar.P();
                if (z4) {
                    final boolean z15 = z7;
                    final Function1 function14 = function4;
                    final int i15 = i2;
                    i6 = 56;
                    final y1h0 y1h0Var12 = y1h0Var;
                    Function1 function15 = new Function1() { // from class: a.jb50
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj13) {
                            Map map2;
                            lie lieVar;
                            Map map3;
                            lie lieVar2;
                            Map map4;
                            lie lieVar3;
                            c53 c53Var = (c53) obj13;
                            boolean z16 = z15;
                            y1h0 y1h0Var13 = y1h0Var12;
                            if (z16) {
                                ob50 ob50Var = (ob50) CollectionsKt.f0(y1h0Var13.getEntries());
                                if (ob50Var == null || (map4 = ob50Var.c) == null) {
                                    map4 = lun.f20680a;
                                    map4.getClass();
                                }
                                Object obj14 = map4.get(lwf.u.toString());
                                if (obj14 == null) {
                                    obj14 = null;
                                }
                                Function2 function16 = zys0.f(2, obj14) ? (Function2) obj14 : null;
                                int i16 = i15;
                                return (function16 == null || (lieVar3 = (lie) function16.invoke(c53Var, Integer.valueOf(i16))) == null) ? (lie) function3.invoke(c53Var, Integer.valueOf(i16)) : lieVar3;
                            }
                            if (zBooleanValue) {
                                m2a m2aVar = m2a.u;
                                ob50 ob50Var2 = (ob50) CollectionsKt.f0(y1h0Var13.getEntries());
                                if (ob50Var2 == null || (map3 = ob50Var2.c) == null) {
                                    map3 = lun.f20680a;
                                    map3.getClass();
                                }
                                Object obj15 = map3.get(m2aVar.toString());
                                if (obj15 == null) {
                                    obj15 = null;
                                }
                                Function1 function17 = zys0.f(1, obj15) ? (Function1) obj15 : null;
                                return (function17 == null || (lieVar2 = (lie) function17.invoke(c53Var)) == null) ? (lie) function14.invoke(c53Var) : lieVar2;
                            }
                            ujn ujnVar = ujn.v;
                            ob50 ob50Var3 = (ob50) CollectionsKt.f0(y1h0Var13.getEntries());
                            if (ob50Var3 == null || (map2 = ob50Var3.c) == null) {
                                map2 = lun.f20680a;
                                map2.getClass();
                            }
                            Object obj16 = map2.get(ujnVar.toString());
                            if (obj16 == null) {
                                obj16 = null;
                            }
                            Function1 function18 = zys0.f(1, obj16) ? (Function1) obj16 : null;
                            return (function18 == null || (lieVar = (lie) function18.invoke(c53Var)) == null) ? (lie) function1.invoke(c53Var) : lieVar;
                        }
                    };
                    fetVar.o0(function15);
                    objP3 = function15;
                } else {
                    final boolean z16 = z7;
                    final Function1 function16 = function4;
                    final int i16 = i2;
                    i6 = 56;
                    final y1h0 y1h0Var13 = y1h0Var;
                    Function1 function17 = new Function1() { // from class: a.jb50
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj13) {
                            Map map2;
                            lie lieVar;
                            Map map3;
                            lie lieVar2;
                            Map map4;
                            lie lieVar3;
                            c53 c53Var = (c53) obj13;
                            boolean z17 = z16;
                            y1h0 y1h0Var14 = y1h0Var13;
                            if (z17) {
                                ob50 ob50Var = (ob50) CollectionsKt.f0(y1h0Var14.getEntries());
                                if (ob50Var == null || (map4 = ob50Var.c) == null) {
                                    map4 = lun.f20680a;
                                    map4.getClass();
                                }
                                Object obj14 = map4.get(lwf.u.toString());
                                if (obj14 == null) {
                                    obj14 = null;
                                }
                                Function2 function18 = zys0.f(2, obj14) ? (Function2) obj14 : null;
                                int i17 = i16;
                                return (function18 == null || (lieVar3 = (lie) function18.invoke(c53Var, Integer.valueOf(i17))) == null) ? (lie) function3.invoke(c53Var, Integer.valueOf(i17)) : lieVar3;
                            }
                            if (zBooleanValue) {
                                m2a m2aVar = m2a.u;
                                ob50 ob50Var2 = (ob50) CollectionsKt.f0(y1h0Var14.getEntries());
                                if (ob50Var2 == null || (map3 = ob50Var2.c) == null) {
                                    map3 = lun.f20680a;
                                    map3.getClass();
                                }
                                Object obj15 = map3.get(m2aVar.toString());
                                if (obj15 == null) {
                                    obj15 = null;
                                }
                                Function1 function19 = zys0.f(1, obj15) ? (Function1) obj15 : null;
                                return (function19 == null || (lieVar2 = (lie) function19.invoke(c53Var)) == null) ? (lie) function16.invoke(c53Var) : lieVar2;
                            }
                            ujn ujnVar = ujn.v;
                            ob50 ob50Var3 = (ob50) CollectionsKt.f0(y1h0Var14.getEntries());
                            if (ob50Var3 == null || (map2 = ob50Var3.c) == null) {
                                map2 = lun.f20680a;
                                map2.getClass();
                            }
                            Object obj16 = map2.get(ujnVar.toString());
                            if (obj16 == null) {
                                obj16 = null;
                            }
                            Function1 function110 = zys0.f(1, obj16) ? (Function1) obj16 : null;
                            return (function110 == null || (lieVar = (lie) function110.invoke(c53Var)) == null) ? (lie) function1.invoke(c53Var) : lieVar;
                        }
                    };
                    fetVar.o0(function17);
                    objP3 = function17;
                }
                function5 = (Function1) objP3;
                b = 6;
                mie0Var = new mie0();
                f4 = f3;
                zG2 = fetVar.g(function5) | fetVar.d(f4) | fetVar.i(yjeVar2);
                Object objP110 = fetVar.P();
                obj4 = objP110;
                if (zG2) {
                    cel celVar4 = new cel(function5, f4, b);
                    fetVar.o0(celVar4);
                    obj4 = celVar4;
                } else {
                    cel celVar5 = new cel(function5, f4, b);
                    fetVar.o0(celVar5);
                    obj4 = celVar5;
                }
                Function1 function18 = (Function1) obj4;
                objP4 = fetVar.P();
                obj5 = objP4;
                if (objP4 == cl5Var) {
                    da40 da40Var3 = new da40((byte) 28);
                    fetVar.o0(da40Var3);
                    obj5 = da40Var3;
                }
                snapshotStateList3 = snapshotStateList2;
                oms0Var2 = oms0Var;
                ay3.e(oms0Var2, mm40Var, function18, u12Var, (Function1) obj5, u1c.M(-1167420988, new g54((Object) oms0Var, (Object) snapshotStateList3, (Object) mie0Var, (Object) map, (byte) 12), fetVar), fetVar, ((i10 >> 3) & 112) | 221184 | (i10 & 7168), 0);
                r3 = fetVar;
                zG3 = r3.g(oms0Var2) | r3.i(r34);
                objP5 = r3.P();
                if (zG3) {
                    r10 = 0;
                    hk40 hk40Var4 = new hk40((Object) oms0Var2, (Object) ngk0Var2, (Object) r34, (yje) (false ? 1 : 0), (byte) 8);
                    r3.o0(hk40Var4);
                    objP5 = hk40Var4;
                } else {
                    r10 = 0;
                    hk40 hk40Var5 = new hk40((Object) oms0Var2, (Object) ngk0Var2, (Object) r34, (yje) (false ? 1 : 0), (byte) 8);
                    r3.o0(hk40Var5);
                    objP5 = hk40Var5;
                }
                m0x0.t(r3, oms0Var2, (Function2) objP5);
                j4Var = p8a.V(snapshotStateList3).c;
                size3 = j4Var.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        i7 = size3 - 1;
                        pf80Var = (pf80) j4Var.get(size3);
                        r3.b0(43486632, pf80Var);
                        if (Intrinsics.d(CollectionsKt.firstOrNull(arrayList), pf80Var)) {
                            lkzVar = lkz.e;
                        } else {
                            lkzVar = lkz.d;
                        }
                        l5d0VarA = or00.f25714a.a(r8x.V(lkzVar, r3, 2));
                        l5d0VarA2 = g2h0.f10557a.a(xp20.d(map, new h63(pf80Var)));
                        l5d0VarA3 = loj0.f20394a.a(pf80Var);
                        zfnVar = pr00.f27441a;
                        obj6 = mie0Var.f21842a;
                        if (obj6 != null) {
                            Intrinsics.h("animatedContentScope");
                            throw r10;
                        }
                        obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, l5d0VarA3, zfnVar.a((b53) obj6)}, u1c.M(-1656080439, new pi40(pf80Var, (byte) 12), r3), r3, i6);
                        r3.r(false);
                        arrayList5 = new ArrayList(arrayList.size());
                        size4 = arrayList.size();
                        while (i8 < size4) {
                            arrayList5.add(((pf80) arrayList.get(i8)).getKey());
                        }
                        if (arrayList5.contains(pf80Var.getKey())) {
                            r3.e0(1349048764);
                            Object key3 = pf80Var.getKey();
                            zG4 = r3.g(pf80Var);
                            Object objP111 = r3.P();
                            obj7 = objP111;
                            if (zG4) {
                                j940 j940Var4 = new j940(pf80Var, snapshotStateList3, r10, (byte) 11);
                                r3.o0(j940Var4);
                                obj7 = j940Var4;
                            } else {
                                j940 j940Var5 = new j940(pf80Var, snapshotStateList3, r10, (byte) 11);
                                r3.o0(j940Var5);
                                obj7 = j940Var5;
                            }
                            m0x0.t(r3, key3, (Function2) obj7);
                            r3.r(false);
                        } else {
                            r3.e0(1349212134);
                            r3.r(false);
                        }
                        if (i7 < 0) {
                            break;
                            break;
                        }
                        size3 = i7;
                    }
                }
            } else {
                function4 = function2;
            }
            if ((i10 & 1572864) == 1048576) {
                z3 = true;
            } else {
                z3 = z2;
            }
            boolean z17 = zH2 | z3;
            if (((i10 & 458752) ^ 196608) > i5) {
            }
            z4 = z17 | z5;
            objP3 = fetVar.P();
            if (z4) {
                final boolean z18 = z7;
                final Function1 function19 = function4;
                final int i17 = i2;
                i6 = 56;
                final y1h0 y1h0Var14 = y1h0Var;
                Function1 function110 = new Function1() { // from class: a.jb50
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj13) {
                        Map map2;
                        lie lieVar;
                        Map map3;
                        lie lieVar2;
                        Map map4;
                        lie lieVar3;
                        c53 c53Var = (c53) obj13;
                        boolean z19 = z18;
                        y1h0 y1h0Var15 = y1h0Var14;
                        if (z19) {
                            ob50 ob50Var = (ob50) CollectionsKt.f0(y1h0Var15.getEntries());
                            if (ob50Var == null || (map4 = ob50Var.c) == null) {
                                map4 = lun.f20680a;
                                map4.getClass();
                            }
                            Object obj14 = map4.get(lwf.u.toString());
                            if (obj14 == null) {
                                obj14 = null;
                            }
                            Function2 function111 = zys0.f(2, obj14) ? (Function2) obj14 : null;
                            int i18 = i17;
                            return (function111 == null || (lieVar3 = (lie) function111.invoke(c53Var, Integer.valueOf(i18))) == null) ? (lie) function3.invoke(c53Var, Integer.valueOf(i18)) : lieVar3;
                        }
                        if (zBooleanValue) {
                            m2a m2aVar = m2a.u;
                            ob50 ob50Var2 = (ob50) CollectionsKt.f0(y1h0Var15.getEntries());
                            if (ob50Var2 == null || (map3 = ob50Var2.c) == null) {
                                map3 = lun.f20680a;
                                map3.getClass();
                            }
                            Object obj15 = map3.get(m2aVar.toString());
                            if (obj15 == null) {
                                obj15 = null;
                            }
                            Function1 function112 = zys0.f(1, obj15) ? (Function1) obj15 : null;
                            return (function112 == null || (lieVar2 = (lie) function112.invoke(c53Var)) == null) ? (lie) function19.invoke(c53Var) : lieVar2;
                        }
                        ujn ujnVar = ujn.v;
                        ob50 ob50Var3 = (ob50) CollectionsKt.f0(y1h0Var15.getEntries());
                        if (ob50Var3 == null || (map2 = ob50Var3.c) == null) {
                            map2 = lun.f20680a;
                            map2.getClass();
                        }
                        Object obj16 = map2.get(ujnVar.toString());
                        if (obj16 == null) {
                            obj16 = null;
                        }
                        Function1 function113 = zys0.f(1, obj16) ? (Function1) obj16 : null;
                        return (function113 == null || (lieVar = (lie) function113.invoke(c53Var)) == null) ? (lie) function1.invoke(c53Var) : lieVar;
                    }
                };
                fetVar.o0(function110);
                objP3 = function110;
            } else {
                final boolean z19 = z7;
                final Function1 function111 = function4;
                final int i18 = i2;
                i6 = 56;
                final y1h0 y1h0Var15 = y1h0Var;
                Function1 function112 = new Function1() { // from class: a.jb50
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj13) {
                        Map map2;
                        lie lieVar;
                        Map map3;
                        lie lieVar2;
                        Map map4;
                        lie lieVar3;
                        c53 c53Var = (c53) obj13;
                        boolean z110 = z19;
                        y1h0 y1h0Var16 = y1h0Var15;
                        if (z110) {
                            ob50 ob50Var = (ob50) CollectionsKt.f0(y1h0Var16.getEntries());
                            if (ob50Var == null || (map4 = ob50Var.c) == null) {
                                map4 = lun.f20680a;
                                map4.getClass();
                            }
                            Object obj14 = map4.get(lwf.u.toString());
                            if (obj14 == null) {
                                obj14 = null;
                            }
                            Function2 function113 = zys0.f(2, obj14) ? (Function2) obj14 : null;
                            int i19 = i18;
                            return (function113 == null || (lieVar3 = (lie) function113.invoke(c53Var, Integer.valueOf(i19))) == null) ? (lie) function3.invoke(c53Var, Integer.valueOf(i19)) : lieVar3;
                        }
                        if (zBooleanValue) {
                            m2a m2aVar = m2a.u;
                            ob50 ob50Var2 = (ob50) CollectionsKt.f0(y1h0Var16.getEntries());
                            if (ob50Var2 == null || (map3 = ob50Var2.c) == null) {
                                map3 = lun.f20680a;
                                map3.getClass();
                            }
                            Object obj15 = map3.get(m2aVar.toString());
                            if (obj15 == null) {
                                obj15 = null;
                            }
                            Function1 function114 = zys0.f(1, obj15) ? (Function1) obj15 : null;
                            return (function114 == null || (lieVar2 = (lie) function114.invoke(c53Var)) == null) ? (lie) function111.invoke(c53Var) : lieVar2;
                        }
                        ujn ujnVar = ujn.v;
                        ob50 ob50Var3 = (ob50) CollectionsKt.f0(y1h0Var16.getEntries());
                        if (ob50Var3 == null || (map2 = ob50Var3.c) == null) {
                            map2 = lun.f20680a;
                            map2.getClass();
                        }
                        Object obj16 = map2.get(ujnVar.toString());
                        if (obj16 == null) {
                            obj16 = null;
                        }
                        Function1 function115 = zys0.f(1, obj16) ? (Function1) obj16 : null;
                        return (function115 == null || (lieVar = (lie) function115.invoke(c53Var)) == null) ? (lie) function1.invoke(c53Var) : lieVar;
                    }
                };
                fetVar.o0(function112);
                objP3 = function112;
            }
            function5 = (Function1) objP3;
            b = 6;
            mie0Var = new mie0();
            f4 = f3;
            zG2 = fetVar.g(function5) | fetVar.d(f4) | fetVar.i(yjeVar2);
            Object objP112 = fetVar.P();
            obj4 = objP112;
            if (zG2) {
                cel celVar6 = new cel(function5, f4, b);
                fetVar.o0(celVar6);
                obj4 = celVar6;
            } else {
                cel celVar7 = new cel(function5, f4, b);
                fetVar.o0(celVar7);
                obj4 = celVar7;
            }
            Function1 function113 = (Function1) obj4;
            objP4 = fetVar.P();
            obj5 = objP4;
            if (objP4 == cl5Var) {
                da40 da40Var4 = new da40((byte) 28);
                fetVar.o0(da40Var4);
                obj5 = da40Var4;
            }
            snapshotStateList3 = snapshotStateList2;
            oms0Var2 = oms0Var;
            ay3.e(oms0Var2, mm40Var, function113, u12Var, (Function1) obj5, u1c.M(-1167420988, new g54((Object) oms0Var, (Object) snapshotStateList3, (Object) mie0Var, (Object) map, (byte) 12), fetVar), fetVar, ((i10 >> 3) & 112) | 221184 | (i10 & 7168), 0);
            r3 = fetVar;
            zG3 = r3.g(oms0Var2) | r3.i(r34);
            objP5 = r3.P();
            if (zG3) {
                r10 = 0;
                hk40 hk40Var6 = new hk40((Object) oms0Var2, (Object) ngk0Var2, (Object) r34, (yje) (false ? 1 : 0), (byte) 8);
                r3.o0(hk40Var6);
                objP5 = hk40Var6;
            } else {
                r10 = 0;
                hk40 hk40Var7 = new hk40((Object) oms0Var2, (Object) ngk0Var2, (Object) r34, (yje) (false ? 1 : 0), (byte) 8);
                r3.o0(hk40Var7);
                objP5 = hk40Var7;
            }
            m0x0.t(r3, oms0Var2, (Function2) objP5);
            j4Var = p8a.V(snapshotStateList3).c;
            size3 = j4Var.size() - 1;
            if (size3 >= 0) {
                while (true) {
                    i7 = size3 - 1;
                    pf80Var = (pf80) j4Var.get(size3);
                    r3.b0(43486632, pf80Var);
                    if (Intrinsics.d(CollectionsKt.firstOrNull(arrayList), pf80Var)) {
                        lkzVar = lkz.e;
                    } else {
                        lkzVar = lkz.d;
                    }
                    l5d0VarA = or00.f25714a.a(r8x.V(lkzVar, r3, 2));
                    l5d0VarA2 = g2h0.f10557a.a(xp20.d(map, new h63(pf80Var)));
                    l5d0VarA3 = loj0.f20394a.a(pf80Var);
                    zfnVar = pr00.f27441a;
                    obj6 = mie0Var.f21842a;
                    if (obj6 != null) {
                        Intrinsics.h("animatedContentScope");
                        throw r10;
                    }
                    obc.e(new l5d0[]{l5d0VarA, l5d0VarA2, l5d0VarA3, zfnVar.a((b53) obj6)}, u1c.M(-1656080439, new pi40(pf80Var, (byte) 12), r3), r3, i6);
                    r3.r(false);
                    arrayList5 = new ArrayList(arrayList.size());
                    size4 = arrayList.size();
                    while (i8 < size4) {
                        arrayList5.add(((pf80) arrayList.get(i8)).getKey());
                    }
                    if (arrayList5.contains(pf80Var.getKey())) {
                        r3.e0(1349048764);
                        Object key4 = pf80Var.getKey();
                        zG4 = r3.g(pf80Var);
                        Object objP113 = r3.P();
                        obj7 = objP113;
                        if (zG4) {
                            j940 j940Var6 = new j940(pf80Var, snapshotStateList3, r10, (byte) 11);
                            r3.o0(j940Var6);
                            obj7 = j940Var6;
                        } else {
                            j940 j940Var7 = new j940(pf80Var, snapshotStateList3, r10, (byte) 11);
                            r3.o0(j940Var7);
                            obj7 = j940Var7;
                        }
                        m0x0.t(r3, key4, (Function2) obj7);
                        r3.r(false);
                    } else {
                        r3.e0(1349212134);
                        r3.r(false);
                    }
                    if (i7 < 0) {
                        break;
                        break;
                    }
                    size3 = i7;
                }
            }
        } else {
            r3 = fetVar;
            r3.X();
        }
        yfe0 yfe0VarU = r3.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t49(h2h0Var, gf50Var, mm40Var, u12Var, function1, function2, function3, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0104  */
    /* JADX WARN: Code duplicated, block: B:102:0x010c  */
    /* JADX WARN: Code duplicated, block: B:103:0x010f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0116  */
    /* JADX WARN: Code duplicated, block: B:109:0x0120  */
    /* JADX WARN: Code duplicated, block: B:111:0x0126  */
    /* JADX WARN: Code duplicated, block: B:112:0x0129  */
    /* JADX WARN: Code duplicated, block: B:114:0x012e  */
    /* JADX WARN: Code duplicated, block: B:117:0x013b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0143  */
    /* JADX WARN: Code duplicated, block: B:124:0x014c  */
    /* JADX WARN: Code duplicated, block: B:126:0x015c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x0185  */
    /* JADX WARN: Code duplicated, block: B:146:0x018a  */
    /* JADX WARN: Code duplicated, block: B:149:0x0191  */
    /* JADX WARN: Code duplicated, block: B:151:0x019f  */
    /* JADX WARN: Code duplicated, block: B:154:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:157:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:158:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:161:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:162:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:165:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:167:0x020c  */
    /* JADX WARN: Code duplicated, block: B:168:0x0237  */
    /* JADX WARN: Code duplicated, block: B:171:0x0286 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:174:0x028c  */
    /* JADX WARN: Code duplicated, block: B:177:0x02af  */
    /* JADX WARN: Code duplicated, block: B:178:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:180:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:181:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:183:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:185:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:191:0x02ec A[LOOP:2: B:190:0x02ea->B:191:0x02ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:195:0x031a  */
    /* JADX WARN: Code duplicated, block: B:196:0x031f  */
    /* JADX WARN: Code duplicated, block: B:198:0x0323  */
    /* JADX WARN: Code duplicated, block: B:200:0x0329  */
    /* JADX WARN: Code duplicated, block: B:203:0x0335  */
    /* JADX WARN: Code duplicated, block: B:208:0x0362 A[LOOP:0: B:207:0x0360->B:208:0x0362, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:211:0x037b  */
    /* JADX WARN: Code duplicated, block: B:214:0x0399 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:217:0x039e  */
    /* JADX WARN: Code duplicated, block: B:219:0x03fa A[LOOP:1: B:175:0x02a7->B:219:0x03fa, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:220:0x0402  */
    /* JADX WARN: Code duplicated, block: B:222:0x0408  */
    /* JADX WARN: Code duplicated, block: B:225:0x0419  */
    /* JADX WARN: Code duplicated, block: B:228:0x02cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x033b A[EDGE_INSN: B:231:0x033b->B:205:0x033b BREAK  A[LOOP:3: B:193:0x0312->B:233:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0042  */
    /* JADX WARN: Code duplicated, block: B:27:0x0046  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0078  */
    /* JADX WARN: Code duplicated, block: B:49:0x007c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:56:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:89:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:98:0x00fe  */
    /* JADX WARN: Failed to calculate best type for var: r6v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v10 ??, new type: a.pb50[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v10 ??, new type: a.pb50[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v10 ??, new type: a.pb50[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v10 ??, new type: a.pb50[]
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v14 ??, new type: a.pf80
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v14 ??, new type: a.pf80
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v14 ??, new type: a.pf80
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v14 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v14 ??, new type: a.pf80
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v15 ??, new type: a.pf80
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v15 ??, new type: a.pf80
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v15 ??, new type: a.pf80
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v15 ??, new type: a.pf80
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v25 ??, new type: a.pf80
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v25 ??, new type: a.pf80
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v25 ??, new type: a.pf80
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v25 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v25 ??, new type: a.pf80
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v37 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v37 ??, new type: a.pf80
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v37 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v37 ??, new type: a.pf80
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v16 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v16 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v16 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v16 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v17 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v17 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v17 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v17 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v20 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v20 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v20 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v20 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v31 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r7v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v31 ??, new type: java.util.List
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: TypeSearchVarInfo not found in map for var: r15v0 ??
    	at jadx.core.dex.visitors.typeinference.TypeSearchState.getVarInfo(TypeSearchState.java:34)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.lambda$resolveIndependentVariables$1(TypeSearch.java:173)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.test(ReferencePipeline.java:306)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1693)
    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:147)
    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:588)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:574)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
    	at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:673)
    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.accept(ReferencePipeline.java:291)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1693)
    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:147)
    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:588)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:574)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
    	at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:673)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.resolveIndependentVariables(TypeSearch.java:173)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:63)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Type inference failed for: r6v10, types: [a.pb50[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [a.pf80, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v31 */
    public static final void g(List list, mm40 mm40Var, u12 u12Var, List list2, List list3, Function1 function1, Function1 function2, Function2 function3, Function0 function0, fet fetVar, int i, int i2, int i3) {
        mm40 mm40Var2;
        int i4;
        u12 u12Var2;
        int i5;
        List listC;
        int i6;
        List list4;
        int i7;
        int i8;
        int i9;
        Function1 da40Var;
        Function2 function4;
        int i10;
        byte b;
        boolean z;
        Function1 function5;
        mm40 mm40Var3;
        u12 u12Var3;
        List list5;
        Function2 o240Var;
        List list6;
        Function1 function6;
        yfe0 yfe0VarU;
        Function1 mb50Var;
        Function1 function7;
        u12 u12Var4;
        List list7;
        pz40 pz40VarF;
        Object objP;
        cl5 cl5Var;
        byte b2;
        ArrayList arrayListV;
        boolean zG;
        Object objP2;
        o470 o470Var;
        ArrayList arrayListL;
        Object objD0;
        ?? r6;
        ?? B;
        List listP;
        ArrayList arrayList;
        int size;
        int i11;
        ArrayList arrayListL2;
        y1h0 y1h0Var;
        List listA;
        int i12;
        c2h0 c2h0Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int size2;
        iun iunVar;
        Object objP3;
        gf50 gf50Var;
        boolean zI;
        Object objP4;
        gf50 gf50Var2;
        int i13;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1914095277);
        int i14 = (i & 6) == 0 ? (fetVar2.i(list) ? 4 : 2) | i : i;
        int i15 = i3 & 2;
        if (i15 == 0) {
            if ((i & 48) == 0) {
                mm40Var2 = mm40Var;
                i14 |= fetVar2.g(mm40Var2) ? 32 : 16;
            }
            i4 = i3 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    u12Var2 = u12Var;
                    if (fetVar2.g(u12Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i14 |= i5;
                }
                if ((i & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        listC = list2;
                        int i16 = fetVar2.i(listC) ? 2048 : 1024;
                        i14 |= i16;
                    } else {
                        listC = list2;
                    }
                    i14 |= i16;
                } else {
                    listC = list2;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        list4 = list3;
                        if (fetVar2.i(list4)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i14 |= i7;
                    }
                    if ((i3 & 32) != 0) {
                        i14 |= 196608;
                    } else if ((i & 196608) == 0) {
                        if (fetVar2.g(null)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i14 |= i8;
                    }
                    if ((i3 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        if (fetVar2.i(null)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i14 |= i9;
                    }
                    if ((12582912 & i) == 0) {
                        if ((i3 & 128) == 0) {
                            da40Var = function1;
                            int i17 = fetVar2.i(da40Var) ? 8388608 : 4194304;
                            i14 |= i17;
                        } else {
                            da40Var = function1;
                        }
                        i14 |= i17;
                    } else {
                        da40Var = function1;
                    }
                    if ((i & 100663296) != 0) {
                        i14 |= ((i3 & 256) == 0 || !fetVar2.i(function2)) ? 33554432 : 67108864;
                    }
                    if ((i & 805306368) == 0) {
                        if ((i3 & 512) == 0) {
                            function4 = function3;
                            int i18 = fetVar2.i(function4) ? 536870912 : 268435456;
                            i14 |= i18;
                        } else {
                            function4 = function3;
                        }
                        i14 |= i18;
                    } else {
                        function4 = function3;
                    }
                    if ((i2 & 6) == 0) {
                        if (fetVar2.i(function0)) {
                            i13 = 4;
                        } else {
                            i13 = 2;
                        }
                        i10 = i2 | i13;
                    } else {
                        i10 = i2;
                    }
                    b = 1;
                    if ((i14 & 306783379) == 306783378 || (i10 & 3) != 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar2.U(i14 & 1, z)) {
                        fetVar2.Z();
                        if ((i & 1) != 0 || fetVar2.B()) {
                            if (i15 != 0) {
                                mm40Var2 = jm40.b;
                            }
                            if (i4 != 0) {
                                u12Var2 = gqw0.f11754a;
                            }
                            if ((i3 & 8) != 0) {
                                i14 &= -7169;
                                listC = kotlin.collections.a.c(new mjk(b));
                            }
                            if (i6 != 0) {
                                list4 = iun.f15405a;
                            }
                            if ((i3 & 128) != 0) {
                                i14 &= -29360129;
                                da40Var = new da40((byte) 29);
                            }
                            if ((i3 & 256) != 0) {
                                mb50Var = new mb50((byte) 0);
                                i14 &= -234881025;
                            } else {
                                mb50Var = function2;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                                u12 u12Var5 = u12Var2;
                                o240Var = new o240((byte) 27);
                                u12Var4 = u12Var5;
                                function7 = mb50Var;
                                list7 = listC;
                            } else {
                                function7 = mb50Var;
                            }
                            fetVar2.s();
                            if (list.isEmpty()) {
                                jf4.o("NavDisplay entries cannot be empty");
                                return;
                            }
                            int i19 = i14 >> 6;
                            int i20 = (i14 & 14) | (i19 & 112) | (i19 & 896) | (i19 & 7168) | ((i10 << 12) & 57344);
                            pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
                            fetVar2.e0(-984503628);
                            fetVar2.r(false);
                            zfn zfnVar = g2h0.f10557a;
                            objP = fetVar2.P();
                            cl5Var = ukd.f35823a;
                            int i21 = i14;
                            if (objP == cl5Var) {
                                ngk0 ngk0Var = new ngk0();
                                b2 = 1;
                                objP = new f2h0(new gwg0((Object) ngk0Var, (byte) 3), new ugd(-1714993007, true, new rqc0(ngk0Var, (byte) 5)));
                                fetVar2.o0(objP);
                            } else {
                                b2 = 1;
                            }
                            pb50 pb50Var = new pb50(new mb50(b2), u1c.M(1077673004, new q42(androidx.compose.runtime.e.f(list, fetVar2), b2), fetVar2));
                            ?? r7 = new pb50[3];
                            r7[0] = r15;
                            r7[b2] = (f2h0) objP;
                            r7[2] = pb50Var;
                            arrayListV = v3c.V(list, tx3.z(r7), fetVar2, i20 & 14);
                            zG = fetVar2.g(CollectionsKt.L0(list7)) | fetVar2.g(arrayListV);
                            objP2 = fetVar2.P();
                            if (!zG || objP2 == cl5Var) {
                                o470Var = new o470(new rip(pz40VarF, (byte) 24));
                                arrayListL = q3d.l(x8x.v(o470Var, arrayListV, list7, list4));
                                while (true) {
                                    objD0 = CollectionsKt.d0(arrayListL);
                                    if (objD0 instanceof pf80) {
                                        r6 = (pf80) objD0;
                                    } else {
                                        r6 = r15;
                                    }
                                    if (r6 != 0) {
                                        B = r6.b();
                                    } else {
                                        B = r15;
                                    }
                                    if (B != 0) {
                                        if (B.isEmpty()) {
                                            e9d0.u(r6, " must not be empty", "Overlaid entries from ");
                                            return;
                                        }
                                        arrayListL.add(x8x.v(o470Var, B, list7, list4));
                                    }
                                    if (B == 0) {
                                        listP = CollectionsKt.P(1, arrayListL);
                                        arrayList = new ArrayList(listP.size());
                                        size = listP.size();
                                        for (i11 = 0; i11 < size; i11++) {
                                            y1h0 y1h0Var2 = (y1h0) listP.get(i11);
                                            y1h0Var2.getClass();
                                            arrayList.add((pf80) y1h0Var2);
                                        }
                                        y1h0 y1h0Var3 = (y1h0) CollectionsKt.d0(arrayListL);
                                        arrayListL2 = q3d.l(y1h0Var3);
                                        do {
                                            y1h0Var = (y1h0) CollectionsKt.firstOrNull(arrayListL2);
                                            if (y1h0Var != null) {
                                                listA = y1h0Var.a();
                                            } else {
                                                listA = null;
                                            }
                                            if (listA != null || listA.isEmpty()) {
                                                i12 = 0;
                                            } else {
                                                i12 = 0;
                                                arrayListL2.add(0, x8x.v(o470Var, listA, list7, list4));
                                            }
                                            if (listA == null) {
                                                break;
                                            }
                                        } while (!listA.isEmpty());
                                        arrayListL2.remove(y1h0Var3);
                                        h2h0 h2h0Var = new h2h0(arrayListV, arrayList, y1h0Var3, arrayListL2);
                                        fetVar2.o0(h2h0Var);
                                        objP2 = h2h0Var;
                                        break;
                                    }
                                    fetVar2 = fetVar;
                                }
                            } else {
                                i12 = 0;
                            }
                            h2h0 h2h0Var2 = (h2h0) objP2;
                            c2h0Var = new c2h0(h2h0Var2.c);
                            arrayList2 = h2h0Var2.d;
                            arrayList3 = new ArrayList(arrayList2.size());
                            size2 = arrayList2.size();
                            while (i12 < size2) {
                                arrayList3.add(new c2h0((y1h0) arrayList2.get(i12)));
                                i12++;
                            }
                            iunVar = iun.f15405a;
                            objP3 = fetVar2.P();
                            if (objP3 == cl5Var) {
                                objP3 = new gf50(c2h0Var, arrayList3, iunVar);
                                fetVar2.o0(objP3);
                            }
                            gf50Var = (gf50) objP3;
                            zI = fetVar2.i(c2h0Var) | fetVar2.i(arrayList3) | fetVar2.i(iunVar);
                            objP4 = fetVar2.P();
                            if (!zI || objP4 == cl5Var) {
                                objP4 = new mr0(gf50Var, c2h0Var, arrayList3, iunVar, (byte) 28);
                                gf50Var2 = gf50Var;
                                fetVar2.o0(objP4);
                            } else {
                                gf50Var2 = gf50Var;
                            }
                            m0x0.D((Function0) objP4, fetVar2);
                            fww.g(h2h0Var2, gf50Var2, null, function0, fetVar2, (i10 << 9) & 7168);
                            function6 = da40Var;
                            function5 = function7;
                            f(h2h0Var2, gf50Var2, mm40Var2, u12Var4, function6, function5, o240Var, fetVar, ((i21 << 3) & 8064) | (i19 & 57344) | (458752 & i19) | (3670016 & i19) | (29360128 & i19));
                            list5 = list7;
                            u12Var3 = u12Var4;
                            mm40Var3 = mm40Var2;
                            list6 = list4;
                        } else {
                            fetVar2.X();
                            if ((i3 & 8) != 0) {
                                i14 &= -7169;
                            }
                            if ((i3 & 128) != 0) {
                                i14 &= -29360129;
                            }
                            if ((i3 & 256) != 0) {
                                i14 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i14 &= -1879048193;
                            }
                            function7 = function2;
                        }
                        u12Var4 = u12Var2;
                        list7 = listC;
                        o240Var = function4;
                        fetVar2.s();
                        if (list.isEmpty()) {
                            jf4.o("NavDisplay entries cannot be empty");
                            return;
                        }
                        int i110 = i14 >> 6;
                        int i22 = (i14 & 14) | (i110 & 112) | (i110 & 896) | (i110 & 7168) | ((i10 << 12) & 57344);
                        pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
                        fetVar2.e0(-984503628);
                        fetVar2.r(false);
                        zfn zfnVar2 = g2h0.f10557a;
                        objP = fetVar2.P();
                        cl5Var = ukd.f35823a;
                        int i23 = i14;
                        if (objP == cl5Var) {
                            ngk0 ngk0Var2 = new ngk0();
                            b2 = 1;
                            objP = new f2h0(new gwg0((Object) ngk0Var2, (byte) 3), new ugd(-1714993007, true, new rqc0(ngk0Var2, (byte) 5)));
                            fetVar2.o0(objP);
                        } else {
                            b2 = 1;
                        }
                        pb50 pb50Var2 = new pb50(new mb50(b2), u1c.M(1077673004, new q42(androidx.compose.runtime.e.f(list, fetVar2), b2), fetVar2));
                        ?? r8 = new pb50[3];
                        r8[0] = r15;
                        r8[b2] = (f2h0) objP;
                        r8[2] = pb50Var2;
                        arrayListV = v3c.V(list, tx3.z(r8), fetVar2, i22 & 14);
                        zG = fetVar2.g(CollectionsKt.L0(list7)) | fetVar2.g(arrayListV);
                        objP2 = fetVar2.P();
                        if (zG) {
                            o470Var = new o470(new rip(pz40VarF, (byte) 24));
                            arrayListL = q3d.l(x8x.v(o470Var, arrayListV, list7, list4));
                            while (true) {
                                objD0 = CollectionsKt.d0(arrayListL);
                                if (objD0 instanceof pf80) {
                                    r6 = (pf80) objD0;
                                } else {
                                    r6 = r15;
                                }
                                if (r6 != 0) {
                                    B = r6.b();
                                } else {
                                    B = r15;
                                }
                                if (B != 0) {
                                    if (B.isEmpty()) {
                                        e9d0.u(r6, " must not be empty", "Overlaid entries from ");
                                        return;
                                    }
                                    arrayListL.add(x8x.v(o470Var, B, list7, list4));
                                }
                                if (B == 0) {
                                    listP = CollectionsKt.P(1, arrayListL);
                                    arrayList = new ArrayList(listP.size());
                                    size = listP.size();
                                    while (i11 < size) {
                                        y1h0 y1h0Var4 = (y1h0) listP.get(i11);
                                        y1h0Var4.getClass();
                                        arrayList.add((pf80) y1h0Var4);
                                    }
                                    y1h0 y1h0Var5 = (y1h0) CollectionsKt.d0(arrayListL);
                                    arrayListL2 = q3d.l(y1h0Var5);
                                    do {
                                        y1h0Var = (y1h0) CollectionsKt.firstOrNull(arrayListL2);
                                        if (y1h0Var != null) {
                                            listA = y1h0Var.a();
                                        } else {
                                            listA = null;
                                        }
                                        if (listA != null) {
                                            i12 = 0;
                                        } else {
                                            i12 = 0;
                                        }
                                        if (listA == null) {
                                            break;
                                            break;
                                        }
                                    } while (!listA.isEmpty());
                                    arrayListL2.remove(y1h0Var5);
                                    h2h0 h2h0Var3 = new h2h0(arrayListV, arrayList, y1h0Var5, arrayListL2);
                                    fetVar2.o0(h2h0Var3);
                                    objP2 = h2h0Var3;
                                    break;
                                }
                                fetVar2 = fetVar;
                            }
                        } else {
                            o470Var = new o470(new rip(pz40VarF, (byte) 24));
                            arrayListL = q3d.l(x8x.v(o470Var, arrayListV, list7, list4));
                            while (true) {
                                objD0 = CollectionsKt.d0(arrayListL);
                                if (objD0 instanceof pf80) {
                                    r6 = (pf80) objD0;
                                } else {
                                    r6 = r15;
                                }
                                if (r6 != 0) {
                                    B = r6.b();
                                } else {
                                    B = r15;
                                }
                                if (B != 0) {
                                    if (B.isEmpty()) {
                                        e9d0.u(r6, " must not be empty", "Overlaid entries from ");
                                        return;
                                    }
                                    arrayListL.add(x8x.v(o470Var, B, list7, list4));
                                }
                                if (B == 0) {
                                    listP = CollectionsKt.P(1, arrayListL);
                                    arrayList = new ArrayList(listP.size());
                                    size = listP.size();
                                    while (i11 < size) {
                                        y1h0 y1h0Var6 = (y1h0) listP.get(i11);
                                        y1h0Var6.getClass();
                                        arrayList.add((pf80) y1h0Var6);
                                    }
                                    y1h0 y1h0Var7 = (y1h0) CollectionsKt.d0(arrayListL);
                                    arrayListL2 = q3d.l(y1h0Var7);
                                    do {
                                        y1h0Var = (y1h0) CollectionsKt.firstOrNull(arrayListL2);
                                        if (y1h0Var != null) {
                                            listA = y1h0Var.a();
                                        } else {
                                            listA = null;
                                        }
                                        if (listA != null) {
                                            i12 = 0;
                                        } else {
                                            i12 = 0;
                                        }
                                        if (listA == null) {
                                            break;
                                            break;
                                        }
                                    } while (!listA.isEmpty());
                                    arrayListL2.remove(y1h0Var7);
                                    h2h0 h2h0Var4 = new h2h0(arrayListV, arrayList, y1h0Var7, arrayListL2);
                                    fetVar2.o0(h2h0Var4);
                                    objP2 = h2h0Var4;
                                    break;
                                }
                                fetVar2 = fetVar;
                            }
                        }
                        h2h0 h2h0Var5 = (h2h0) objP2;
                        c2h0Var = new c2h0(h2h0Var5.c);
                        arrayList2 = h2h0Var5.d;
                        arrayList3 = new ArrayList(arrayList2.size());
                        size2 = arrayList2.size();
                        while (i12 < size2) {
                            arrayList3.add(new c2h0((y1h0) arrayList2.get(i12)));
                            i12++;
                        }
                        iunVar = iun.f15405a;
                        objP3 = fetVar2.P();
                        if (objP3 == cl5Var) {
                            objP3 = new gf50(c2h0Var, arrayList3, iunVar);
                            fetVar2.o0(objP3);
                        }
                        gf50Var = (gf50) objP3;
                        zI = fetVar2.i(c2h0Var) | fetVar2.i(arrayList3) | fetVar2.i(iunVar);
                        objP4 = fetVar2.P();
                        if (zI) {
                            objP4 = new mr0(gf50Var, c2h0Var, arrayList3, iunVar, (byte) 28);
                            gf50Var2 = gf50Var;
                            fetVar2.o0(objP4);
                        } else {
                            objP4 = new mr0(gf50Var, c2h0Var, arrayList3, iunVar, (byte) 28);
                            gf50Var2 = gf50Var;
                            fetVar2.o0(objP4);
                        }
                        m0x0.D((Function0) objP4, fetVar2);
                        fww.g(h2h0Var5, gf50Var2, null, function0, fetVar2, (i10 << 9) & 7168);
                        function6 = da40Var;
                        function5 = function7;
                        f(h2h0Var5, gf50Var2, mm40Var2, u12Var4, function6, function5, o240Var, fetVar, ((i23 << 3) & 8064) | (i110 & 57344) | (458752 & i110) | (3670016 & i110) | (29360128 & i110));
                        list5 = list7;
                        u12Var3 = u12Var4;
                        mm40Var3 = mm40Var2;
                        list6 = list4;
                    } else {
                        fetVar.X();
                        function5 = function2;
                        mm40Var3 = mm40Var2;
                        u12Var3 = u12Var2;
                        list5 = listC;
                        o240Var = function4;
                        list6 = list4;
                        function6 = da40Var;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new dz3(list, mm40Var3, u12Var3, list5, list6, function6, function5, o240Var, function0, i, i2, i3);
                    }
                }
                i14 |= 24576;
                list4 = list3;
                if ((i3 & 32) != 0) {
                    i14 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (fetVar2.g(null)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i14 |= i8;
                }
                if ((i3 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (fetVar2.i(null)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i14 |= i9;
                }
                if ((12582912 & i) == 0) {
                    if ((i3 & 128) == 0) {
                        da40Var = function1;
                        if (fetVar2.i(da40Var)) {
                        }
                        i14 |= i17;
                    } else {
                        da40Var = function1;
                    }
                    i14 |= i17;
                } else {
                    da40Var = function1;
                }
                if ((i & 100663296) != 0) {
                    i14 |= ((i3 & 256) == 0 || !fetVar2.i(function2)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & 512) == 0) {
                        function4 = function3;
                        if (fetVar2.i(function4)) {
                        }
                        i14 |= i18;
                    } else {
                        function4 = function3;
                    }
                    i14 |= i18;
                } else {
                    function4 = function3;
                }
                if ((i2 & 6) == 0) {
                    if (fetVar2.i(function0)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    i10 = i2 | i13;
                } else {
                    i10 = i2;
                }
                b = 1;
                if ((i14 & 306783379) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (fetVar2.U(i14 & 1, z)) {
                    fetVar2.Z();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if (i4 != 0) {
                            u12Var2 = gqw0.f11754a;
                        }
                        if ((i3 & 8) != 0) {
                            i14 &= -7169;
                            listC = kotlin.collections.a.c(new mjk(b));
                        }
                        if (i6 != 0) {
                            list4 = iun.f15405a;
                        }
                        if ((i3 & 128) != 0) {
                            i14 &= -29360129;
                            da40Var = new da40((byte) 29);
                        }
                        if ((i3 & 256) != 0) {
                            mb50Var = new mb50((byte) 0);
                            i14 &= -234881025;
                        } else {
                            mb50Var = function2;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            u12 u12Var6 = u12Var2;
                            o240Var = new o240((byte) 27);
                            u12Var4 = u12Var6;
                            function7 = mb50Var;
                            list7 = listC;
                        } else {
                            function7 = mb50Var;
                            u12Var4 = u12Var2;
                            list7 = listC;
                            o240Var = function4;
                        }
                    } else {
                        if (i15 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if (i4 != 0) {
                            u12Var2 = gqw0.f11754a;
                        }
                        if ((i3 & 8) != 0) {
                            i14 &= -7169;
                            listC = kotlin.collections.a.c(new mjk(b));
                        }
                        if (i6 != 0) {
                            list4 = iun.f15405a;
                        }
                        if ((i3 & 128) != 0) {
                            i14 &= -29360129;
                            da40Var = new da40((byte) 29);
                        }
                        if ((i3 & 256) != 0) {
                            mb50Var = new mb50((byte) 0);
                            i14 &= -234881025;
                        } else {
                            mb50Var = function2;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            u12 u12Var7 = u12Var2;
                            o240Var = new o240((byte) 27);
                            u12Var4 = u12Var7;
                            function7 = mb50Var;
                            list7 = listC;
                        } else {
                            function7 = mb50Var;
                            u12Var4 = u12Var2;
                            list7 = listC;
                            o240Var = function4;
                        }
                    }
                    fetVar2.s();
                    if (list.isEmpty()) {
                        jf4.o("NavDisplay entries cannot be empty");
                        return;
                    }
                    int i111 = i14 >> 6;
                    int i24 = (i14 & 14) | (i111 & 112) | (i111 & 896) | (i111 & 7168) | ((i10 << 12) & 57344);
                    pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
                    fetVar2.e0(-984503628);
                    fetVar2.r(false);
                    zfn zfnVar3 = g2h0.f10557a;
                    objP = fetVar2.P();
                    cl5Var = ukd.f35823a;
                    int i25 = i14;
                    if (objP == cl5Var) {
                        ngk0 ngk0Var3 = new ngk0();
                        b2 = 1;
                        objP = new f2h0(new gwg0((Object) ngk0Var3, (byte) 3), new ugd(-1714993007, true, new rqc0(ngk0Var3, (byte) 5)));
                        fetVar2.o0(objP);
                    } else {
                        b2 = 1;
                    }
                    pb50 pb50Var3 = new pb50(new mb50(b2), u1c.M(1077673004, new q42(androidx.compose.runtime.e.f(list, fetVar2), b2), fetVar2));
                    ?? r9 = new pb50[3];
                    r9[0] = r15;
                    r9[b2] = (f2h0) objP;
                    r9[2] = pb50Var3;
                    arrayListV = v3c.V(list, tx3.z(r9), fetVar2, i24 & 14);
                    zG = fetVar2.g(CollectionsKt.L0(list7)) | fetVar2.g(arrayListV);
                    objP2 = fetVar2.P();
                    if (zG) {
                        o470Var = new o470(new rip(pz40VarF, (byte) 24));
                        arrayListL = q3d.l(x8x.v(o470Var, arrayListV, list7, list4));
                        while (true) {
                            objD0 = CollectionsKt.d0(arrayListL);
                            if (objD0 instanceof pf80) {
                                r6 = (pf80) objD0;
                            } else {
                                r6 = r15;
                            }
                            if (r6 != 0) {
                                B = r6.b();
                            } else {
                                B = r15;
                            }
                            if (B != 0) {
                                if (B.isEmpty()) {
                                    e9d0.u(r6, " must not be empty", "Overlaid entries from ");
                                    return;
                                }
                                arrayListL.add(x8x.v(o470Var, B, list7, list4));
                            }
                            if (B == 0) {
                                listP = CollectionsKt.P(1, arrayListL);
                                arrayList = new ArrayList(listP.size());
                                size = listP.size();
                                while (i11 < size) {
                                    y1h0 y1h0Var8 = (y1h0) listP.get(i11);
                                    y1h0Var8.getClass();
                                    arrayList.add((pf80) y1h0Var8);
                                }
                                y1h0 y1h0Var9 = (y1h0) CollectionsKt.d0(arrayListL);
                                arrayListL2 = q3d.l(y1h0Var9);
                                do {
                                    y1h0Var = (y1h0) CollectionsKt.firstOrNull(arrayListL2);
                                    if (y1h0Var != null) {
                                        listA = y1h0Var.a();
                                    } else {
                                        listA = null;
                                    }
                                    if (listA != null) {
                                        i12 = 0;
                                    } else {
                                        i12 = 0;
                                    }
                                    if (listA == null) {
                                        break;
                                        break;
                                    }
                                } while (!listA.isEmpty());
                                arrayListL2.remove(y1h0Var9);
                                h2h0 h2h0Var6 = new h2h0(arrayListV, arrayList, y1h0Var9, arrayListL2);
                                fetVar2.o0(h2h0Var6);
                                objP2 = h2h0Var6;
                                break;
                            }
                            fetVar2 = fetVar;
                        }
                    } else {
                        o470Var = new o470(new rip(pz40VarF, (byte) 24));
                        arrayListL = q3d.l(x8x.v(o470Var, arrayListV, list7, list4));
                        while (true) {
                            objD0 = CollectionsKt.d0(arrayListL);
                            if (objD0 instanceof pf80) {
                                r6 = (pf80) objD0;
                            } else {
                                r6 = r15;
                            }
                            if (r6 != 0) {
                                B = r6.b();
                            } else {
                                B = r15;
                            }
                            if (B != 0) {
                                if (B.isEmpty()) {
                                    e9d0.u(r6, " must not be empty", "Overlaid entries from ");
                                    return;
                                }
                                arrayListL.add(x8x.v(o470Var, B, list7, list4));
                            }
                            if (B == 0) {
                                listP = CollectionsKt.P(1, arrayListL);
                                arrayList = new ArrayList(listP.size());
                                size = listP.size();
                                while (i11 < size) {
                                    y1h0 y1h0Var10 = (y1h0) listP.get(i11);
                                    y1h0Var10.getClass();
                                    arrayList.add((pf80) y1h0Var10);
                                }
                                y1h0 y1h0Var11 = (y1h0) CollectionsKt.d0(arrayListL);
                                arrayListL2 = q3d.l(y1h0Var11);
                                do {
                                    y1h0Var = (y1h0) CollectionsKt.firstOrNull(arrayListL2);
                                    if (y1h0Var != null) {
                                        listA = y1h0Var.a();
                                    } else {
                                        listA = null;
                                    }
                                    if (listA != null) {
                                        i12 = 0;
                                    } else {
                                        i12 = 0;
                                    }
                                    if (listA == null) {
                                        break;
                                        break;
                                    }
                                } while (!listA.isEmpty());
                                arrayListL2.remove(y1h0Var11);
                                h2h0 h2h0Var7 = new h2h0(arrayListV, arrayList, y1h0Var11, arrayListL2);
                                fetVar2.o0(h2h0Var7);
                                objP2 = h2h0Var7;
                                break;
                            }
                            fetVar2 = fetVar;
                        }
                    }
                    h2h0 h2h0Var8 = (h2h0) objP2;
                    c2h0Var = new c2h0(h2h0Var8.c);
                    arrayList2 = h2h0Var8.d;
                    arrayList3 = new ArrayList(arrayList2.size());
                    size2 = arrayList2.size();
                    while (i12 < size2) {
                        arrayList3.add(new c2h0((y1h0) arrayList2.get(i12)));
                        i12++;
                    }
                    iunVar = iun.f15405a;
                    objP3 = fetVar2.P();
                    if (objP3 == cl5Var) {
                        objP3 = new gf50(c2h0Var, arrayList3, iunVar);
                        fetVar2.o0(objP3);
                    }
                    gf50Var = (gf50) objP3;
                    zI = fetVar2.i(c2h0Var) | fetVar2.i(arrayList3) | fetVar2.i(iunVar);
                    objP4 = fetVar2.P();
                    if (zI) {
                        objP4 = new mr0(gf50Var, c2h0Var, arrayList3, iunVar, (byte) 28);
                        gf50Var2 = gf50Var;
                        fetVar2.o0(objP4);
                    } else {
                        objP4 = new mr0(gf50Var, c2h0Var, arrayList3, iunVar, (byte) 28);
                        gf50Var2 = gf50Var;
                        fetVar2.o0(objP4);
                    }
                    m0x0.D((Function0) objP4, fetVar2);
                    fww.g(h2h0Var8, gf50Var2, null, function0, fetVar2, (i10 << 9) & 7168);
                    function6 = da40Var;
                    function5 = function7;
                    f(h2h0Var8, gf50Var2, mm40Var2, u12Var4, function6, function5, o240Var, fetVar, ((i25 << 3) & 8064) | (i111 & 57344) | (458752 & i111) | (3670016 & i111) | (29360128 & i111));
                    list5 = list7;
                    u12Var3 = u12Var4;
                    mm40Var3 = mm40Var2;
                    list6 = list4;
                } else {
                    fetVar.X();
                    function5 = function2;
                    mm40Var3 = mm40Var2;
                    u12Var3 = u12Var2;
                    list5 = listC;
                    o240Var = function4;
                    list6 = list4;
                    function6 = da40Var;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new dz3(list, mm40Var3, u12Var3, list5, list6, function6, function5, o240Var, function0, i, i2, i3);
                }
            }
            i14 |= 384;
            u12Var2 = u12Var;
            if ((i & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    listC = list2;
                    if (fetVar2.i(listC)) {
                    }
                    i14 |= i16;
                } else {
                    listC = list2;
                }
                i14 |= i16;
            } else {
                listC = list2;
            }
            i6 = i3 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    list4 = list3;
                    if (fetVar2.i(list4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i14 |= i7;
                }
                if ((i3 & 32) != 0) {
                    i14 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (fetVar2.g(null)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i14 |= i8;
                }
                if ((i3 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (fetVar2.i(null)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i14 |= i9;
                }
                if ((12582912 & i) == 0) {
                    if ((i3 & 128) == 0) {
                        da40Var = function1;
                        if (fetVar2.i(da40Var)) {
                        }
                        i14 |= i17;
                    } else {
                        da40Var = function1;
                    }
                    i14 |= i17;
                } else {
                    da40Var = function1;
                }
                if ((i & 100663296) != 0) {
                    i14 |= ((i3 & 256) == 0 || !fetVar2.i(function2)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & 512) == 0) {
                        function4 = function3;
                        if (fetVar2.i(function4)) {
                        }
                        i14 |= i18;
                    } else {
                        function4 = function3;
                    }
                    i14 |= i18;
                } else {
                    function4 = function3;
                }
                if ((i2 & 6) == 0) {
                    if (fetVar2.i(function0)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    i10 = i2 | i13;
                } else {
                    i10 = i2;
                }
                b = 1;
                if ((i14 & 306783379) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (fetVar2.U(i14 & 1, z)) {
                    fetVar2.Z();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if (i4 != 0) {
                            u12Var2 = gqw0.f11754a;
                        }
                        if ((i3 & 8) != 0) {
                            i14 &= -7169;
                            listC = kotlin.collections.a.c(new mjk(b));
                        }
                        if (i6 != 0) {
                            list4 = iun.f15405a;
                        }
                        if ((i3 & 128) != 0) {
                            i14 &= -29360129;
                            da40Var = new da40((byte) 29);
                        }
                        if ((i3 & 256) != 0) {
                            mb50Var = new mb50((byte) 0);
                            i14 &= -234881025;
                        } else {
                            mb50Var = function2;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            u12 u12Var8 = u12Var2;
                            o240Var = new o240((byte) 27);
                            u12Var4 = u12Var8;
                            function7 = mb50Var;
                            list7 = listC;
                        } else {
                            function7 = mb50Var;
                            u12Var4 = u12Var2;
                            list7 = listC;
                            o240Var = function4;
                        }
                    } else {
                        if (i15 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if (i4 != 0) {
                            u12Var2 = gqw0.f11754a;
                        }
                        if ((i3 & 8) != 0) {
                            i14 &= -7169;
                            listC = kotlin.collections.a.c(new mjk(b));
                        }
                        if (i6 != 0) {
                            list4 = iun.f15405a;
                        }
                        if ((i3 & 128) != 0) {
                            i14 &= -29360129;
                            da40Var = new da40((byte) 29);
                        }
                        if ((i3 & 256) != 0) {
                            mb50Var = new mb50((byte) 0);
                            i14 &= -234881025;
                        } else {
                            mb50Var = function2;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            u12 u12Var9 = u12Var2;
                            o240Var = new o240((byte) 27);
                            u12Var4 = u12Var9;
                            function7 = mb50Var;
                            list7 = listC;
                        } else {
                            function7 = mb50Var;
                            u12Var4 = u12Var2;
                            list7 = listC;
                            o240Var = function4;
                        }
                    }
                    fetVar2.s();
                    if (list.isEmpty()) {
                        jf4.o("NavDisplay entries cannot be empty");
                        return;
                    }
                    int i112 = i14 >> 6;
                    int i26 = (i14 & 14) | (i112 & 112) | (i112 & 896) | (i112 & 7168) | ((i10 << 12) & 57344);
                    pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
                    fetVar2.e0(-984503628);
                    fetVar2.r(false);
                    zfn zfnVar4 = g2h0.f10557a;
                    objP = fetVar2.P();
                    cl5Var = ukd.f35823a;
                    int i27 = i14;
                    if (objP == cl5Var) {
                        ngk0 ngk0Var4 = new ngk0();
                        b2 = 1;
                        objP = new f2h0(new gwg0((Object) ngk0Var4, (byte) 3), new ugd(-1714993007, true, new rqc0(ngk0Var4, (byte) 5)));
                        fetVar2.o0(objP);
                    } else {
                        b2 = 1;
                    }
                    pb50 pb50Var4 = new pb50(new mb50(b2), u1c.M(1077673004, new q42(androidx.compose.runtime.e.f(list, fetVar2), b2), fetVar2));
                    ?? r10 = new pb50[3];
                    r10[0] = r15;
                    r10[b2] = (f2h0) objP;
                    r10[2] = pb50Var4;
                    arrayListV = v3c.V(list, tx3.z(r10), fetVar2, i26 & 14);
                    zG = fetVar2.g(CollectionsKt.L0(list7)) | fetVar2.g(arrayListV);
                    objP2 = fetVar2.P();
                    if (zG) {
                        o470Var = new o470(new rip(pz40VarF, (byte) 24));
                        arrayListL = q3d.l(x8x.v(o470Var, arrayListV, list7, list4));
                        while (true) {
                            objD0 = CollectionsKt.d0(arrayListL);
                            if (objD0 instanceof pf80) {
                                r6 = (pf80) objD0;
                            } else {
                                r6 = r15;
                            }
                            if (r6 != 0) {
                                B = r6.b();
                            } else {
                                B = r15;
                            }
                            if (B != 0) {
                                if (B.isEmpty()) {
                                    e9d0.u(r6, " must not be empty", "Overlaid entries from ");
                                    return;
                                }
                                arrayListL.add(x8x.v(o470Var, B, list7, list4));
                            }
                            if (B == 0) {
                                listP = CollectionsKt.P(1, arrayListL);
                                arrayList = new ArrayList(listP.size());
                                size = listP.size();
                                while (i11 < size) {
                                    y1h0 y1h0Var12 = (y1h0) listP.get(i11);
                                    y1h0Var12.getClass();
                                    arrayList.add((pf80) y1h0Var12);
                                }
                                y1h0 y1h0Var13 = (y1h0) CollectionsKt.d0(arrayListL);
                                arrayListL2 = q3d.l(y1h0Var13);
                                do {
                                    y1h0Var = (y1h0) CollectionsKt.firstOrNull(arrayListL2);
                                    if (y1h0Var != null) {
                                        listA = y1h0Var.a();
                                    } else {
                                        listA = null;
                                    }
                                    if (listA != null) {
                                        i12 = 0;
                                    } else {
                                        i12 = 0;
                                    }
                                    if (listA == null) {
                                        break;
                                        break;
                                    }
                                } while (!listA.isEmpty());
                                arrayListL2.remove(y1h0Var13);
                                h2h0 h2h0Var9 = new h2h0(arrayListV, arrayList, y1h0Var13, arrayListL2);
                                fetVar2.o0(h2h0Var9);
                                objP2 = h2h0Var9;
                                break;
                            }
                            fetVar2 = fetVar;
                        }
                    } else {
                        o470Var = new o470(new rip(pz40VarF, (byte) 24));
                        arrayListL = q3d.l(x8x.v(o470Var, arrayListV, list7, list4));
                        while (true) {
                            objD0 = CollectionsKt.d0(arrayListL);
                            if (objD0 instanceof pf80) {
                                r6 = (pf80) objD0;
                            } else {
                                r6 = r15;
                            }
                            if (r6 != 0) {
                                B = r6.b();
                            } else {
                                B = r15;
                            }
                            if (B != 0) {
                                if (B.isEmpty()) {
                                    e9d0.u(r6, " must not be empty", "Overlaid entries from ");
                                    return;
                                }
                                arrayListL.add(x8x.v(o470Var, B, list7, list4));
                            }
                            if (B == 0) {
                                listP = CollectionsKt.P(1, arrayListL);
                                arrayList = new ArrayList(listP.size());
                                size = listP.size();
                                while (i11 < size) {
                                    y1h0 y1h0Var14 = (y1h0) listP.get(i11);
                                    y1h0Var14.getClass();
                                    arrayList.add((pf80) y1h0Var14);
                                }
                                y1h0 y1h0Var15 = (y1h0) CollectionsKt.d0(arrayListL);
                                arrayListL2 = q3d.l(y1h0Var15);
                                do {
                                    y1h0Var = (y1h0) CollectionsKt.firstOrNull(arrayListL2);
                                    if (y1h0Var != null) {
                                        listA = y1h0Var.a();
                                    } else {
                                        listA = null;
                                    }
                                    if (listA != null) {
                                        i12 = 0;
                                    } else {
                                        i12 = 0;
                                    }
                                    if (listA == null) {
                                        break;
                                        break;
                                    }
                                } while (!listA.isEmpty());
                                arrayListL2.remove(y1h0Var15);
                                h2h0 h2h0Var10 = new h2h0(arrayListV, arrayList, y1h0Var15, arrayListL2);
                                fetVar2.o0(h2h0Var10);
                                objP2 = h2h0Var10;
                                break;
                            }
                            fetVar2 = fetVar;
                        }
                    }
                    h2h0 h2h0Var11 = (h2h0) objP2;
                    c2h0Var = new c2h0(h2h0Var11.c);
                    arrayList2 = h2h0Var11.d;
                    arrayList3 = new ArrayList(arrayList2.size());
                    size2 = arrayList2.size();
                    while (i12 < size2) {
                        arrayList3.add(new c2h0((y1h0) arrayList2.get(i12)));
                        i12++;
                    }
                    iunVar = iun.f15405a;
                    objP3 = fetVar2.P();
                    if (objP3 == cl5Var) {
                        objP3 = new gf50(c2h0Var, arrayList3, iunVar);
                        fetVar2.o0(objP3);
                    }
                    gf50Var = (gf50) objP3;
                    zI = fetVar2.i(c2h0Var) | fetVar2.i(arrayList3) | fetVar2.i(iunVar);
                    objP4 = fetVar2.P();
                    if (zI) {
                        objP4 = new mr0(gf50Var, c2h0Var, arrayList3, iunVar, (byte) 28);
                        gf50Var2 = gf50Var;
                        fetVar2.o0(objP4);
                    } else {
                        objP4 = new mr0(gf50Var, c2h0Var, arrayList3, iunVar, (byte) 28);
                        gf50Var2 = gf50Var;
                        fetVar2.o0(objP4);
                    }
                    m0x0.D((Function0) objP4, fetVar2);
                    fww.g(h2h0Var11, gf50Var2, null, function0, fetVar2, (i10 << 9) & 7168);
                    function6 = da40Var;
                    function5 = function7;
                    f(h2h0Var11, gf50Var2, mm40Var2, u12Var4, function6, function5, o240Var, fetVar, ((i27 << 3) & 8064) | (i112 & 57344) | (458752 & i112) | (3670016 & i112) | (29360128 & i112));
                    list5 = list7;
                    u12Var3 = u12Var4;
                    mm40Var3 = mm40Var2;
                    list6 = list4;
                } else {
                    fetVar.X();
                    function5 = function2;
                    mm40Var3 = mm40Var2;
                    u12Var3 = u12Var2;
                    list5 = listC;
                    o240Var = function4;
                    list6 = list4;
                    function6 = da40Var;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new dz3(list, mm40Var3, u12Var3, list5, list6, function6, function5, o240Var, function0, i, i2, i3);
                }
            }
            i14 |= 24576;
            list4 = list3;
            if ((i3 & 32) != 0) {
                i14 |= 196608;
            } else if ((i & 196608) == 0) {
                if (fetVar2.g(null)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i14 |= i8;
            }
            if ((i3 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (fetVar2.i(null)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i14 |= i9;
            }
            if ((12582912 & i) == 0) {
                if ((i3 & 128) == 0) {
                    da40Var = function1;
                    if (fetVar2.i(da40Var)) {
                    }
                    i14 |= i17;
                } else {
                    da40Var = function1;
                }
                i14 |= i17;
            } else {
                da40Var = function1;
            }
            if ((i & 100663296) != 0) {
                i14 |= ((i3 & 256) == 0 || !fetVar2.i(function2)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                if ((i3 & 512) == 0) {
                    function4 = function3;
                    if (fetVar2.i(function4)) {
                    }
                    i14 |= i18;
                } else {
                    function4 = function3;
                }
                i14 |= i18;
            } else {
                function4 = function3;
            }
            if ((i2 & 6) == 0) {
                if (fetVar2.i(function0)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                i10 = i2 | i13;
            } else {
                i10 = i2;
            }
            b = 1;
            if ((i14 & 306783379) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (fetVar2.U(i14 & 1, z)) {
                fetVar2.Z();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if (i4 != 0) {
                        u12Var2 = gqw0.f11754a;
                    }
                    if ((i3 & 8) != 0) {
                        i14 &= -7169;
                        listC = kotlin.collections.a.c(new mjk(b));
                    }
                    if (i6 != 0) {
                        list4 = iun.f15405a;
                    }
                    if ((i3 & 128) != 0) {
                        i14 &= -29360129;
                        da40Var = new da40((byte) 29);
                    }
                    if ((i3 & 256) != 0) {
                        mb50Var = new mb50((byte) 0);
                        i14 &= -234881025;
                    } else {
                        mb50Var = function2;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        u12 u12Var10 = u12Var2;
                        o240Var = new o240((byte) 27);
                        u12Var4 = u12Var10;
                        function7 = mb50Var;
                        list7 = listC;
                    } else {
                        function7 = mb50Var;
                        u12Var4 = u12Var2;
                        list7 = listC;
                        o240Var = function4;
                    }
                } else {
                    if (i15 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if (i4 != 0) {
                        u12Var2 = gqw0.f11754a;
                    }
                    if ((i3 & 8) != 0) {
                        i14 &= -7169;
                        listC = kotlin.collections.a.c(new mjk(b));
                    }
                    if (i6 != 0) {
                        list4 = iun.f15405a;
                    }
                    if ((i3 & 128) != 0) {
                        i14 &= -29360129;
                        da40Var = new da40((byte) 29);
                    }
                    if ((i3 & 256) != 0) {
                        mb50Var = new mb50((byte) 0);
                        i14 &= -234881025;
                    } else {
                        mb50Var = function2;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        u12 u12Var11 = u12Var2;
                        o240Var = new o240((byte) 27);
                        u12Var4 = u12Var11;
                        function7 = mb50Var;
                        list7 = listC;
                    } else {
                        function7 = mb50Var;
                        u12Var4 = u12Var2;
                        list7 = listC;
                        o240Var = function4;
                    }
                }
                fetVar2.s();
                if (list.isEmpty()) {
                    jf4.o("NavDisplay entries cannot be empty");
                    return;
                }
                int i113 = i14 >> 6;
                int i28 = (i14 & 14) | (i113 & 112) | (i113 & 896) | (i113 & 7168) | ((i10 << 12) & 57344);
                pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
                fetVar2.e0(-984503628);
                fetVar2.r(false);
                zfn zfnVar5 = g2h0.f10557a;
                objP = fetVar2.P();
                cl5Var = ukd.f35823a;
                int i29 = i14;
                if (objP == cl5Var) {
                    ngk0 ngk0Var5 = new ngk0();
                    b2 = 1;
                    objP = new f2h0(new gwg0((Object) ngk0Var5, (byte) 3), new ugd(-1714993007, true, new rqc0(ngk0Var5, (byte) 5)));
                    fetVar2.o0(objP);
                } else {
                    b2 = 1;
                }
                pb50 pb50Var5 = new pb50(new mb50(b2), u1c.M(1077673004, new q42(androidx.compose.runtime.e.f(list, fetVar2), b2), fetVar2));
                ?? r11 = new pb50[3];
                r11[0] = r15;
                r11[b2] = (f2h0) objP;
                r11[2] = pb50Var5;
                arrayListV = v3c.V(list, tx3.z(r11), fetVar2, i28 & 14);
                zG = fetVar2.g(CollectionsKt.L0(list7)) | fetVar2.g(arrayListV);
                objP2 = fetVar2.P();
                if (zG) {
                    o470Var = new o470(new rip(pz40VarF, (byte) 24));
                    arrayListL = q3d.l(x8x.v(o470Var, arrayListV, list7, list4));
                    while (true) {
                        objD0 = CollectionsKt.d0(arrayListL);
                        if (objD0 instanceof pf80) {
                            r6 = (pf80) objD0;
                        } else {
                            r6 = r15;
                        }
                        if (r6 != 0) {
                            B = r6.b();
                        } else {
                            B = r15;
                        }
                        if (B != 0) {
                            if (B.isEmpty()) {
                                e9d0.u(r6, " must not be empty", "Overlaid entries from ");
                                return;
                            }
                            arrayListL.add(x8x.v(o470Var, B, list7, list4));
                        }
                        if (B == 0) {
                            listP = CollectionsKt.P(1, arrayListL);
                            arrayList = new ArrayList(listP.size());
                            size = listP.size();
                            while (i11 < size) {
                                y1h0 y1h0Var16 = (y1h0) listP.get(i11);
                                y1h0Var16.getClass();
                                arrayList.add((pf80) y1h0Var16);
                            }
                            y1h0 y1h0Var17 = (y1h0) CollectionsKt.d0(arrayListL);
                            arrayListL2 = q3d.l(y1h0Var17);
                            do {
                                y1h0Var = (y1h0) CollectionsKt.firstOrNull(arrayListL2);
                                if (y1h0Var != null) {
                                    listA = y1h0Var.a();
                                } else {
                                    listA = null;
                                }
                                if (listA != null) {
                                    i12 = 0;
                                } else {
                                    i12 = 0;
                                }
                                if (listA == null) {
                                    break;
                                    break;
                                }
                            } while (!listA.isEmpty());
                            arrayListL2.remove(y1h0Var17);
                            h2h0 h2h0Var12 = new h2h0(arrayListV, arrayList, y1h0Var17, arrayListL2);
                            fetVar2.o0(h2h0Var12);
                            objP2 = h2h0Var12;
                            break;
                        }
                        fetVar2 = fetVar;
                    }
                } else {
                    o470Var = new o470(new rip(pz40VarF, (byte) 24));
                    arrayListL = q3d.l(x8x.v(o470Var, arrayListV, list7, list4));
                    while (true) {
                        objD0 = CollectionsKt.d0(arrayListL);
                        if (objD0 instanceof pf80) {
                            r6 = (pf80) objD0;
                        } else {
                            r6 = r15;
                        }
                        if (r6 != 0) {
                            B = r6.b();
                        } else {
                            B = r15;
                        }
                        if (B != 0) {
                            if (B.isEmpty()) {
                                e9d0.u(r6, " must not be empty", "Overlaid entries from ");
                                return;
                            }
                            arrayListL.add(x8x.v(o470Var, B, list7, list4));
                        }
                        if (B == 0) {
                            listP = CollectionsKt.P(1, arrayListL);
                            arrayList = new ArrayList(listP.size());
                            size = listP.size();
                            while (i11 < size) {
                                y1h0 y1h0Var18 = (y1h0) listP.get(i11);
                                y1h0Var18.getClass();
                                arrayList.add((pf80) y1h0Var18);
                            }
                            y1h0 y1h0Var19 = (y1h0) CollectionsKt.d0(arrayListL);
                            arrayListL2 = q3d.l(y1h0Var19);
                            do {
                                y1h0Var = (y1h0) CollectionsKt.firstOrNull(arrayListL2);
                                if (y1h0Var != null) {
                                    listA = y1h0Var.a();
                                } else {
                                    listA = null;
                                }
                                if (listA != null) {
                                    i12 = 0;
                                } else {
                                    i12 = 0;
                                }
                                if (listA == null) {
                                    break;
                                    break;
                                }
                            } while (!listA.isEmpty());
                            arrayListL2.remove(y1h0Var19);
                            h2h0 h2h0Var13 = new h2h0(arrayListV, arrayList, y1h0Var19, arrayListL2);
                            fetVar2.o0(h2h0Var13);
                            objP2 = h2h0Var13;
                            break;
                        }
                        fetVar2 = fetVar;
                    }
                }
                h2h0 h2h0Var14 = (h2h0) objP2;
                c2h0Var = new c2h0(h2h0Var14.c);
                arrayList2 = h2h0Var14.d;
                arrayList3 = new ArrayList(arrayList2.size());
                size2 = arrayList2.size();
                while (i12 < size2) {
                    arrayList3.add(new c2h0((y1h0) arrayList2.get(i12)));
                    i12++;
                }
                iunVar = iun.f15405a;
                objP3 = fetVar2.P();
                if (objP3 == cl5Var) {
                    objP3 = new gf50(c2h0Var, arrayList3, iunVar);
                    fetVar2.o0(objP3);
                }
                gf50Var = (gf50) objP3;
                zI = fetVar2.i(c2h0Var) | fetVar2.i(arrayList3) | fetVar2.i(iunVar);
                objP4 = fetVar2.P();
                if (zI) {
                    objP4 = new mr0(gf50Var, c2h0Var, arrayList3, iunVar, (byte) 28);
                    gf50Var2 = gf50Var;
                    fetVar2.o0(objP4);
                } else {
                    objP4 = new mr0(gf50Var, c2h0Var, arrayList3, iunVar, (byte) 28);
                    gf50Var2 = gf50Var;
                    fetVar2.o0(objP4);
                }
                m0x0.D((Function0) objP4, fetVar2);
                fww.g(h2h0Var14, gf50Var2, null, function0, fetVar2, (i10 << 9) & 7168);
                function6 = da40Var;
                function5 = function7;
                f(h2h0Var14, gf50Var2, mm40Var2, u12Var4, function6, function5, o240Var, fetVar, ((i29 << 3) & 8064) | (i113 & 57344) | (458752 & i113) | (3670016 & i113) | (29360128 & i113));
                list5 = list7;
                u12Var3 = u12Var4;
                mm40Var3 = mm40Var2;
                list6 = list4;
            } else {
                fetVar.X();
                function5 = function2;
                mm40Var3 = mm40Var2;
                u12Var3 = u12Var2;
                list5 = listC;
                o240Var = function4;
                list6 = list4;
                function6 = da40Var;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new dz3(list, mm40Var3, u12Var3, list5, list6, function6, function5, o240Var, function0, i, i2, i3);
            }
        }
        i14 |= 48;
        mm40Var2 = mm40Var;
        i4 = i3 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                u12Var2 = u12Var;
                if (fetVar2.g(u12Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i14 |= i5;
            }
            if ((i & 3072) == 0) {
                if ((i3 & 8) == 0) {
                    listC = list2;
                    if (fetVar2.i(listC)) {
                    }
                    i14 |= i16;
                } else {
                    listC = list2;
                }
                i14 |= i16;
            } else {
                listC = list2;
            }
            i6 = i3 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    list4 = list3;
                    if (fetVar2.i(list4)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i14 |= i7;
                }
                if ((i3 & 32) != 0) {
                    i14 |= 196608;
                } else if ((i & 196608) == 0) {
                    if (fetVar2.g(null)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i14 |= i8;
                }
                if ((i3 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    if (fetVar2.i(null)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i14 |= i9;
                }
                if ((12582912 & i) == 0) {
                    if ((i3 & 128) == 0) {
                        da40Var = function1;
                        if (fetVar2.i(da40Var)) {
                        }
                        i14 |= i17;
                    } else {
                        da40Var = function1;
                    }
                    i14 |= i17;
                } else {
                    da40Var = function1;
                }
                if ((i & 100663296) != 0) {
                    i14 |= ((i3 & 256) == 0 || !fetVar2.i(function2)) ? 33554432 : 67108864;
                }
                if ((i & 805306368) == 0) {
                    if ((i3 & 512) == 0) {
                        function4 = function3;
                        if (fetVar2.i(function4)) {
                        }
                        i14 |= i18;
                    } else {
                        function4 = function3;
                    }
                    i14 |= i18;
                } else {
                    function4 = function3;
                }
                if ((i2 & 6) == 0) {
                    if (fetVar2.i(function0)) {
                        i13 = 4;
                    } else {
                        i13 = 2;
                    }
                    i10 = i2 | i13;
                } else {
                    i10 = i2;
                }
                b = 1;
                if ((i14 & 306783379) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (fetVar2.U(i14 & 1, z)) {
                    fetVar2.Z();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if (i4 != 0) {
                            u12Var2 = gqw0.f11754a;
                        }
                        if ((i3 & 8) != 0) {
                            i14 &= -7169;
                            listC = kotlin.collections.a.c(new mjk(b));
                        }
                        if (i6 != 0) {
                            list4 = iun.f15405a;
                        }
                        if ((i3 & 128) != 0) {
                            i14 &= -29360129;
                            da40Var = new da40((byte) 29);
                        }
                        if ((i3 & 256) != 0) {
                            mb50Var = new mb50((byte) 0);
                            i14 &= -234881025;
                        } else {
                            mb50Var = function2;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            u12 u12Var12 = u12Var2;
                            o240Var = new o240((byte) 27);
                            u12Var4 = u12Var12;
                            function7 = mb50Var;
                            list7 = listC;
                        } else {
                            function7 = mb50Var;
                            u12Var4 = u12Var2;
                            list7 = listC;
                            o240Var = function4;
                        }
                    } else {
                        if (i15 != 0) {
                            mm40Var2 = jm40.b;
                        }
                        if (i4 != 0) {
                            u12Var2 = gqw0.f11754a;
                        }
                        if ((i3 & 8) != 0) {
                            i14 &= -7169;
                            listC = kotlin.collections.a.c(new mjk(b));
                        }
                        if (i6 != 0) {
                            list4 = iun.f15405a;
                        }
                        if ((i3 & 128) != 0) {
                            i14 &= -29360129;
                            da40Var = new da40((byte) 29);
                        }
                        if ((i3 & 256) != 0) {
                            mb50Var = new mb50((byte) 0);
                            i14 &= -234881025;
                        } else {
                            mb50Var = function2;
                        }
                        if ((i3 & 512) != 0) {
                            i14 &= -1879048193;
                            u12 u12Var13 = u12Var2;
                            o240Var = new o240((byte) 27);
                            u12Var4 = u12Var13;
                            function7 = mb50Var;
                            list7 = listC;
                        } else {
                            function7 = mb50Var;
                            u12Var4 = u12Var2;
                            list7 = listC;
                            o240Var = function4;
                        }
                    }
                    fetVar2.s();
                    if (list.isEmpty()) {
                        jf4.o("NavDisplay entries cannot be empty");
                        return;
                    }
                    int i114 = i14 >> 6;
                    int i210 = (i14 & 14) | (i114 & 112) | (i114 & 896) | (i114 & 7168) | ((i10 << 12) & 57344);
                    pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
                    fetVar2.e0(-984503628);
                    fetVar2.r(false);
                    zfn zfnVar6 = g2h0.f10557a;
                    objP = fetVar2.P();
                    cl5Var = ukd.f35823a;
                    int i211 = i14;
                    if (objP == cl5Var) {
                        ngk0 ngk0Var6 = new ngk0();
                        b2 = 1;
                        objP = new f2h0(new gwg0((Object) ngk0Var6, (byte) 3), new ugd(-1714993007, true, new rqc0(ngk0Var6, (byte) 5)));
                        fetVar2.o0(objP);
                    } else {
                        b2 = 1;
                    }
                    pb50 pb50Var6 = new pb50(new mb50(b2), u1c.M(1077673004, new q42(androidx.compose.runtime.e.f(list, fetVar2), b2), fetVar2));
                    ?? r12 = new pb50[3];
                    r12[0] = r15;
                    r12[b2] = (f2h0) objP;
                    r12[2] = pb50Var6;
                    arrayListV = v3c.V(list, tx3.z(r12), fetVar2, i210 & 14);
                    zG = fetVar2.g(CollectionsKt.L0(list7)) | fetVar2.g(arrayListV);
                    objP2 = fetVar2.P();
                    if (zG) {
                        o470Var = new o470(new rip(pz40VarF, (byte) 24));
                        arrayListL = q3d.l(x8x.v(o470Var, arrayListV, list7, list4));
                        while (true) {
                            objD0 = CollectionsKt.d0(arrayListL);
                            if (objD0 instanceof pf80) {
                                r6 = (pf80) objD0;
                            } else {
                                r6 = r15;
                            }
                            if (r6 != 0) {
                                B = r6.b();
                            } else {
                                B = r15;
                            }
                            if (B != 0) {
                                if (B.isEmpty()) {
                                    e9d0.u(r6, " must not be empty", "Overlaid entries from ");
                                    return;
                                }
                                arrayListL.add(x8x.v(o470Var, B, list7, list4));
                            }
                            if (B == 0) {
                                listP = CollectionsKt.P(1, arrayListL);
                                arrayList = new ArrayList(listP.size());
                                size = listP.size();
                                while (i11 < size) {
                                    y1h0 y1h0Var110 = (y1h0) listP.get(i11);
                                    y1h0Var110.getClass();
                                    arrayList.add((pf80) y1h0Var110);
                                }
                                y1h0 y1h0Var111 = (y1h0) CollectionsKt.d0(arrayListL);
                                arrayListL2 = q3d.l(y1h0Var111);
                                do {
                                    y1h0Var = (y1h0) CollectionsKt.firstOrNull(arrayListL2);
                                    if (y1h0Var != null) {
                                        listA = y1h0Var.a();
                                    } else {
                                        listA = null;
                                    }
                                    if (listA != null) {
                                        i12 = 0;
                                    } else {
                                        i12 = 0;
                                    }
                                    if (listA == null) {
                                        break;
                                        break;
                                    }
                                } while (!listA.isEmpty());
                                arrayListL2.remove(y1h0Var111);
                                h2h0 h2h0Var15 = new h2h0(arrayListV, arrayList, y1h0Var111, arrayListL2);
                                fetVar2.o0(h2h0Var15);
                                objP2 = h2h0Var15;
                                break;
                            }
                            fetVar2 = fetVar;
                        }
                    } else {
                        o470Var = new o470(new rip(pz40VarF, (byte) 24));
                        arrayListL = q3d.l(x8x.v(o470Var, arrayListV, list7, list4));
                        while (true) {
                            objD0 = CollectionsKt.d0(arrayListL);
                            if (objD0 instanceof pf80) {
                                r6 = (pf80) objD0;
                            } else {
                                r6 = r15;
                            }
                            if (r6 != 0) {
                                B = r6.b();
                            } else {
                                B = r15;
                            }
                            if (B != 0) {
                                if (B.isEmpty()) {
                                    e9d0.u(r6, " must not be empty", "Overlaid entries from ");
                                    return;
                                }
                                arrayListL.add(x8x.v(o470Var, B, list7, list4));
                            }
                            if (B == 0) {
                                listP = CollectionsKt.P(1, arrayListL);
                                arrayList = new ArrayList(listP.size());
                                size = listP.size();
                                while (i11 < size) {
                                    y1h0 y1h0Var112 = (y1h0) listP.get(i11);
                                    y1h0Var112.getClass();
                                    arrayList.add((pf80) y1h0Var112);
                                }
                                y1h0 y1h0Var113 = (y1h0) CollectionsKt.d0(arrayListL);
                                arrayListL2 = q3d.l(y1h0Var113);
                                do {
                                    y1h0Var = (y1h0) CollectionsKt.firstOrNull(arrayListL2);
                                    if (y1h0Var != null) {
                                        listA = y1h0Var.a();
                                    } else {
                                        listA = null;
                                    }
                                    if (listA != null) {
                                        i12 = 0;
                                    } else {
                                        i12 = 0;
                                    }
                                    if (listA == null) {
                                        break;
                                        break;
                                    }
                                } while (!listA.isEmpty());
                                arrayListL2.remove(y1h0Var113);
                                h2h0 h2h0Var16 = new h2h0(arrayListV, arrayList, y1h0Var113, arrayListL2);
                                fetVar2.o0(h2h0Var16);
                                objP2 = h2h0Var16;
                                break;
                            }
                            fetVar2 = fetVar;
                        }
                    }
                    h2h0 h2h0Var17 = (h2h0) objP2;
                    c2h0Var = new c2h0(h2h0Var17.c);
                    arrayList2 = h2h0Var17.d;
                    arrayList3 = new ArrayList(arrayList2.size());
                    size2 = arrayList2.size();
                    while (i12 < size2) {
                        arrayList3.add(new c2h0((y1h0) arrayList2.get(i12)));
                        i12++;
                    }
                    iunVar = iun.f15405a;
                    objP3 = fetVar2.P();
                    if (objP3 == cl5Var) {
                        objP3 = new gf50(c2h0Var, arrayList3, iunVar);
                        fetVar2.o0(objP3);
                    }
                    gf50Var = (gf50) objP3;
                    zI = fetVar2.i(c2h0Var) | fetVar2.i(arrayList3) | fetVar2.i(iunVar);
                    objP4 = fetVar2.P();
                    if (zI) {
                        objP4 = new mr0(gf50Var, c2h0Var, arrayList3, iunVar, (byte) 28);
                        gf50Var2 = gf50Var;
                        fetVar2.o0(objP4);
                    } else {
                        objP4 = new mr0(gf50Var, c2h0Var, arrayList3, iunVar, (byte) 28);
                        gf50Var2 = gf50Var;
                        fetVar2.o0(objP4);
                    }
                    m0x0.D((Function0) objP4, fetVar2);
                    fww.g(h2h0Var17, gf50Var2, null, function0, fetVar2, (i10 << 9) & 7168);
                    function6 = da40Var;
                    function5 = function7;
                    f(h2h0Var17, gf50Var2, mm40Var2, u12Var4, function6, function5, o240Var, fetVar, ((i211 << 3) & 8064) | (i114 & 57344) | (458752 & i114) | (3670016 & i114) | (29360128 & i114));
                    list5 = list7;
                    u12Var3 = u12Var4;
                    mm40Var3 = mm40Var2;
                    list6 = list4;
                } else {
                    fetVar.X();
                    function5 = function2;
                    mm40Var3 = mm40Var2;
                    u12Var3 = u12Var2;
                    list5 = listC;
                    o240Var = function4;
                    list6 = list4;
                    function6 = da40Var;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new dz3(list, mm40Var3, u12Var3, list5, list6, function6, function5, o240Var, function0, i, i2, i3);
                }
            }
            i14 |= 24576;
            list4 = list3;
            if ((i3 & 32) != 0) {
                i14 |= 196608;
            } else if ((i & 196608) == 0) {
                if (fetVar2.g(null)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i14 |= i8;
            }
            if ((i3 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (fetVar2.i(null)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i14 |= i9;
            }
            if ((12582912 & i) == 0) {
                if ((i3 & 128) == 0) {
                    da40Var = function1;
                    if (fetVar2.i(da40Var)) {
                    }
                    i14 |= i17;
                } else {
                    da40Var = function1;
                }
                i14 |= i17;
            } else {
                da40Var = function1;
            }
            if ((i & 100663296) != 0) {
                i14 |= ((i3 & 256) == 0 || !fetVar2.i(function2)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                if ((i3 & 512) == 0) {
                    function4 = function3;
                    if (fetVar2.i(function4)) {
                    }
                    i14 |= i18;
                } else {
                    function4 = function3;
                }
                i14 |= i18;
            } else {
                function4 = function3;
            }
            if ((i2 & 6) == 0) {
                if (fetVar2.i(function0)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                i10 = i2 | i13;
            } else {
                i10 = i2;
            }
            b = 1;
            if ((i14 & 306783379) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (fetVar2.U(i14 & 1, z)) {
                fetVar2.Z();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if (i4 != 0) {
                        u12Var2 = gqw0.f11754a;
                    }
                    if ((i3 & 8) != 0) {
                        i14 &= -7169;
                        listC = kotlin.collections.a.c(new mjk(b));
                    }
                    if (i6 != 0) {
                        list4 = iun.f15405a;
                    }
                    if ((i3 & 128) != 0) {
                        i14 &= -29360129;
                        da40Var = new da40((byte) 29);
                    }
                    if ((i3 & 256) != 0) {
                        mb50Var = new mb50((byte) 0);
                        i14 &= -234881025;
                    } else {
                        mb50Var = function2;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        u12 u12Var14 = u12Var2;
                        o240Var = new o240((byte) 27);
                        u12Var4 = u12Var14;
                        function7 = mb50Var;
                        list7 = listC;
                    } else {
                        function7 = mb50Var;
                        u12Var4 = u12Var2;
                        list7 = listC;
                        o240Var = function4;
                    }
                } else {
                    if (i15 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if (i4 != 0) {
                        u12Var2 = gqw0.f11754a;
                    }
                    if ((i3 & 8) != 0) {
                        i14 &= -7169;
                        listC = kotlin.collections.a.c(new mjk(b));
                    }
                    if (i6 != 0) {
                        list4 = iun.f15405a;
                    }
                    if ((i3 & 128) != 0) {
                        i14 &= -29360129;
                        da40Var = new da40((byte) 29);
                    }
                    if ((i3 & 256) != 0) {
                        mb50Var = new mb50((byte) 0);
                        i14 &= -234881025;
                    } else {
                        mb50Var = function2;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        u12 u12Var15 = u12Var2;
                        o240Var = new o240((byte) 27);
                        u12Var4 = u12Var15;
                        function7 = mb50Var;
                        list7 = listC;
                    } else {
                        function7 = mb50Var;
                        u12Var4 = u12Var2;
                        list7 = listC;
                        o240Var = function4;
                    }
                }
                fetVar2.s();
                if (list.isEmpty()) {
                    jf4.o("NavDisplay entries cannot be empty");
                    return;
                }
                int i115 = i14 >> 6;
                int i212 = (i14 & 14) | (i115 & 112) | (i115 & 896) | (i115 & 7168) | ((i10 << 12) & 57344);
                pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
                fetVar2.e0(-984503628);
                fetVar2.r(false);
                zfn zfnVar7 = g2h0.f10557a;
                objP = fetVar2.P();
                cl5Var = ukd.f35823a;
                int i213 = i14;
                if (objP == cl5Var) {
                    ngk0 ngk0Var7 = new ngk0();
                    b2 = 1;
                    objP = new f2h0(new gwg0((Object) ngk0Var7, (byte) 3), new ugd(-1714993007, true, new rqc0(ngk0Var7, (byte) 5)));
                    fetVar2.o0(objP);
                } else {
                    b2 = 1;
                }
                pb50 pb50Var7 = new pb50(new mb50(b2), u1c.M(1077673004, new q42(androidx.compose.runtime.e.f(list, fetVar2), b2), fetVar2));
                ?? r13 = new pb50[3];
                r13[0] = r15;
                r13[b2] = (f2h0) objP;
                r13[2] = pb50Var7;
                arrayListV = v3c.V(list, tx3.z(r13), fetVar2, i212 & 14);
                zG = fetVar2.g(CollectionsKt.L0(list7)) | fetVar2.g(arrayListV);
                objP2 = fetVar2.P();
                if (zG) {
                    o470Var = new o470(new rip(pz40VarF, (byte) 24));
                    arrayListL = q3d.l(x8x.v(o470Var, arrayListV, list7, list4));
                    while (true) {
                        objD0 = CollectionsKt.d0(arrayListL);
                        if (objD0 instanceof pf80) {
                            r6 = (pf80) objD0;
                        } else {
                            r6 = r15;
                        }
                        if (r6 != 0) {
                            B = r6.b();
                        } else {
                            B = r15;
                        }
                        if (B != 0) {
                            if (B.isEmpty()) {
                                e9d0.u(r6, " must not be empty", "Overlaid entries from ");
                                return;
                            }
                            arrayListL.add(x8x.v(o470Var, B, list7, list4));
                        }
                        if (B == 0) {
                            listP = CollectionsKt.P(1, arrayListL);
                            arrayList = new ArrayList(listP.size());
                            size = listP.size();
                            while (i11 < size) {
                                y1h0 y1h0Var114 = (y1h0) listP.get(i11);
                                y1h0Var114.getClass();
                                arrayList.add((pf80) y1h0Var114);
                            }
                            y1h0 y1h0Var115 = (y1h0) CollectionsKt.d0(arrayListL);
                            arrayListL2 = q3d.l(y1h0Var115);
                            do {
                                y1h0Var = (y1h0) CollectionsKt.firstOrNull(arrayListL2);
                                if (y1h0Var != null) {
                                    listA = y1h0Var.a();
                                } else {
                                    listA = null;
                                }
                                if (listA != null) {
                                    i12 = 0;
                                } else {
                                    i12 = 0;
                                }
                                if (listA == null) {
                                    break;
                                    break;
                                }
                            } while (!listA.isEmpty());
                            arrayListL2.remove(y1h0Var115);
                            h2h0 h2h0Var18 = new h2h0(arrayListV, arrayList, y1h0Var115, arrayListL2);
                            fetVar2.o0(h2h0Var18);
                            objP2 = h2h0Var18;
                            break;
                        }
                        fetVar2 = fetVar;
                    }
                } else {
                    o470Var = new o470(new rip(pz40VarF, (byte) 24));
                    arrayListL = q3d.l(x8x.v(o470Var, arrayListV, list7, list4));
                    while (true) {
                        objD0 = CollectionsKt.d0(arrayListL);
                        if (objD0 instanceof pf80) {
                            r6 = (pf80) objD0;
                        } else {
                            r6 = r15;
                        }
                        if (r6 != 0) {
                            B = r6.b();
                        } else {
                            B = r15;
                        }
                        if (B != 0) {
                            if (B.isEmpty()) {
                                e9d0.u(r6, " must not be empty", "Overlaid entries from ");
                                return;
                            }
                            arrayListL.add(x8x.v(o470Var, B, list7, list4));
                        }
                        if (B == 0) {
                            listP = CollectionsKt.P(1, arrayListL);
                            arrayList = new ArrayList(listP.size());
                            size = listP.size();
                            while (i11 < size) {
                                y1h0 y1h0Var116 = (y1h0) listP.get(i11);
                                y1h0Var116.getClass();
                                arrayList.add((pf80) y1h0Var116);
                            }
                            y1h0 y1h0Var117 = (y1h0) CollectionsKt.d0(arrayListL);
                            arrayListL2 = q3d.l(y1h0Var117);
                            do {
                                y1h0Var = (y1h0) CollectionsKt.firstOrNull(arrayListL2);
                                if (y1h0Var != null) {
                                    listA = y1h0Var.a();
                                } else {
                                    listA = null;
                                }
                                if (listA != null) {
                                    i12 = 0;
                                } else {
                                    i12 = 0;
                                }
                                if (listA == null) {
                                    break;
                                    break;
                                }
                            } while (!listA.isEmpty());
                            arrayListL2.remove(y1h0Var117);
                            h2h0 h2h0Var19 = new h2h0(arrayListV, arrayList, y1h0Var117, arrayListL2);
                            fetVar2.o0(h2h0Var19);
                            objP2 = h2h0Var19;
                            break;
                        }
                        fetVar2 = fetVar;
                    }
                }
                h2h0 h2h0Var110 = (h2h0) objP2;
                c2h0Var = new c2h0(h2h0Var110.c);
                arrayList2 = h2h0Var110.d;
                arrayList3 = new ArrayList(arrayList2.size());
                size2 = arrayList2.size();
                while (i12 < size2) {
                    arrayList3.add(new c2h0((y1h0) arrayList2.get(i12)));
                    i12++;
                }
                iunVar = iun.f15405a;
                objP3 = fetVar2.P();
                if (objP3 == cl5Var) {
                    objP3 = new gf50(c2h0Var, arrayList3, iunVar);
                    fetVar2.o0(objP3);
                }
                gf50Var = (gf50) objP3;
                zI = fetVar2.i(c2h0Var) | fetVar2.i(arrayList3) | fetVar2.i(iunVar);
                objP4 = fetVar2.P();
                if (zI) {
                    objP4 = new mr0(gf50Var, c2h0Var, arrayList3, iunVar, (byte) 28);
                    gf50Var2 = gf50Var;
                    fetVar2.o0(objP4);
                } else {
                    objP4 = new mr0(gf50Var, c2h0Var, arrayList3, iunVar, (byte) 28);
                    gf50Var2 = gf50Var;
                    fetVar2.o0(objP4);
                }
                m0x0.D((Function0) objP4, fetVar2);
                fww.g(h2h0Var110, gf50Var2, null, function0, fetVar2, (i10 << 9) & 7168);
                function6 = da40Var;
                function5 = function7;
                f(h2h0Var110, gf50Var2, mm40Var2, u12Var4, function6, function5, o240Var, fetVar, ((i213 << 3) & 8064) | (i115 & 57344) | (458752 & i115) | (3670016 & i115) | (29360128 & i115));
                list5 = list7;
                u12Var3 = u12Var4;
                mm40Var3 = mm40Var2;
                list6 = list4;
            } else {
                fetVar.X();
                function5 = function2;
                mm40Var3 = mm40Var2;
                u12Var3 = u12Var2;
                list5 = listC;
                o240Var = function4;
                list6 = list4;
                function6 = da40Var;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new dz3(list, mm40Var3, u12Var3, list5, list6, function6, function5, o240Var, function0, i, i2, i3);
            }
        }
        i14 |= 384;
        u12Var2 = u12Var;
        if ((i & 3072) == 0) {
            if ((i3 & 8) == 0) {
                listC = list2;
                if (fetVar2.i(listC)) {
                }
                i14 |= i16;
            } else {
                listC = list2;
            }
            i14 |= i16;
        } else {
            listC = list2;
        }
        i6 = i3 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                list4 = list3;
                if (fetVar2.i(list4)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i14 |= i7;
            }
            if ((i3 & 32) != 0) {
                i14 |= 196608;
            } else if ((i & 196608) == 0) {
                if (fetVar2.g(null)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i14 |= i8;
            }
            if ((i3 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (fetVar2.i(null)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i14 |= i9;
            }
            if ((12582912 & i) == 0) {
                if ((i3 & 128) == 0) {
                    da40Var = function1;
                    if (fetVar2.i(da40Var)) {
                    }
                    i14 |= i17;
                } else {
                    da40Var = function1;
                }
                i14 |= i17;
            } else {
                da40Var = function1;
            }
            if ((i & 100663296) != 0) {
                i14 |= ((i3 & 256) == 0 || !fetVar2.i(function2)) ? 33554432 : 67108864;
            }
            if ((i & 805306368) == 0) {
                if ((i3 & 512) == 0) {
                    function4 = function3;
                    if (fetVar2.i(function4)) {
                    }
                    i14 |= i18;
                } else {
                    function4 = function3;
                }
                i14 |= i18;
            } else {
                function4 = function3;
            }
            if ((i2 & 6) == 0) {
                if (fetVar2.i(function0)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                i10 = i2 | i13;
            } else {
                i10 = i2;
            }
            b = 1;
            if ((i14 & 306783379) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (fetVar2.U(i14 & 1, z)) {
                fetVar2.Z();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if (i4 != 0) {
                        u12Var2 = gqw0.f11754a;
                    }
                    if ((i3 & 8) != 0) {
                        i14 &= -7169;
                        listC = kotlin.collections.a.c(new mjk(b));
                    }
                    if (i6 != 0) {
                        list4 = iun.f15405a;
                    }
                    if ((i3 & 128) != 0) {
                        i14 &= -29360129;
                        da40Var = new da40((byte) 29);
                    }
                    if ((i3 & 256) != 0) {
                        mb50Var = new mb50((byte) 0);
                        i14 &= -234881025;
                    } else {
                        mb50Var = function2;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        u12 u12Var16 = u12Var2;
                        o240Var = new o240((byte) 27);
                        u12Var4 = u12Var16;
                        function7 = mb50Var;
                        list7 = listC;
                    } else {
                        function7 = mb50Var;
                        u12Var4 = u12Var2;
                        list7 = listC;
                        o240Var = function4;
                    }
                } else {
                    if (i15 != 0) {
                        mm40Var2 = jm40.b;
                    }
                    if (i4 != 0) {
                        u12Var2 = gqw0.f11754a;
                    }
                    if ((i3 & 8) != 0) {
                        i14 &= -7169;
                        listC = kotlin.collections.a.c(new mjk(b));
                    }
                    if (i6 != 0) {
                        list4 = iun.f15405a;
                    }
                    if ((i3 & 128) != 0) {
                        i14 &= -29360129;
                        da40Var = new da40((byte) 29);
                    }
                    if ((i3 & 256) != 0) {
                        mb50Var = new mb50((byte) 0);
                        i14 &= -234881025;
                    } else {
                        mb50Var = function2;
                    }
                    if ((i3 & 512) != 0) {
                        i14 &= -1879048193;
                        u12 u12Var17 = u12Var2;
                        o240Var = new o240((byte) 27);
                        u12Var4 = u12Var17;
                        function7 = mb50Var;
                        list7 = listC;
                    } else {
                        function7 = mb50Var;
                        u12Var4 = u12Var2;
                        list7 = listC;
                        o240Var = function4;
                    }
                }
                fetVar2.s();
                if (list.isEmpty()) {
                    jf4.o("NavDisplay entries cannot be empty");
                    return;
                }
                int i116 = i14 >> 6;
                int i214 = (i14 & 14) | (i116 & 112) | (i116 & 896) | (i116 & 7168) | ((i10 << 12) & 57344);
                pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
                fetVar2.e0(-984503628);
                fetVar2.r(false);
                zfn zfnVar8 = g2h0.f10557a;
                objP = fetVar2.P();
                cl5Var = ukd.f35823a;
                int i215 = i14;
                if (objP == cl5Var) {
                    ngk0 ngk0Var8 = new ngk0();
                    b2 = 1;
                    objP = new f2h0(new gwg0((Object) ngk0Var8, (byte) 3), new ugd(-1714993007, true, new rqc0(ngk0Var8, (byte) 5)));
                    fetVar2.o0(objP);
                } else {
                    b2 = 1;
                }
                pb50 pb50Var8 = new pb50(new mb50(b2), u1c.M(1077673004, new q42(androidx.compose.runtime.e.f(list, fetVar2), b2), fetVar2));
                ?? r14 = new pb50[3];
                r14[0] = r15;
                r14[b2] = (f2h0) objP;
                r14[2] = pb50Var8;
                arrayListV = v3c.V(list, tx3.z(r14), fetVar2, i214 & 14);
                zG = fetVar2.g(CollectionsKt.L0(list7)) | fetVar2.g(arrayListV);
                objP2 = fetVar2.P();
                if (zG) {
                    o470Var = new o470(new rip(pz40VarF, (byte) 24));
                    arrayListL = q3d.l(x8x.v(o470Var, arrayListV, list7, list4));
                    while (true) {
                        objD0 = CollectionsKt.d0(arrayListL);
                        if (objD0 instanceof pf80) {
                            r6 = (pf80) objD0;
                        } else {
                            r6 = r15;
                        }
                        if (r6 != 0) {
                            B = r6.b();
                        } else {
                            B = r15;
                        }
                        if (B != 0) {
                            if (B.isEmpty()) {
                                e9d0.u(r6, " must not be empty", "Overlaid entries from ");
                                return;
                            }
                            arrayListL.add(x8x.v(o470Var, B, list7, list4));
                        }
                        if (B == 0) {
                            listP = CollectionsKt.P(1, arrayListL);
                            arrayList = new ArrayList(listP.size());
                            size = listP.size();
                            while (i11 < size) {
                                y1h0 y1h0Var118 = (y1h0) listP.get(i11);
                                y1h0Var118.getClass();
                                arrayList.add((pf80) y1h0Var118);
                            }
                            y1h0 y1h0Var119 = (y1h0) CollectionsKt.d0(arrayListL);
                            arrayListL2 = q3d.l(y1h0Var119);
                            do {
                                y1h0Var = (y1h0) CollectionsKt.firstOrNull(arrayListL2);
                                if (y1h0Var != null) {
                                    listA = y1h0Var.a();
                                } else {
                                    listA = null;
                                }
                                if (listA != null) {
                                    i12 = 0;
                                } else {
                                    i12 = 0;
                                }
                                if (listA == null) {
                                    break;
                                    break;
                                }
                            } while (!listA.isEmpty());
                            arrayListL2.remove(y1h0Var119);
                            h2h0 h2h0Var111 = new h2h0(arrayListV, arrayList, y1h0Var119, arrayListL2);
                            fetVar2.o0(h2h0Var111);
                            objP2 = h2h0Var111;
                            break;
                        }
                        fetVar2 = fetVar;
                    }
                } else {
                    o470Var = new o470(new rip(pz40VarF, (byte) 24));
                    arrayListL = q3d.l(x8x.v(o470Var, arrayListV, list7, list4));
                    while (true) {
                        objD0 = CollectionsKt.d0(arrayListL);
                        if (objD0 instanceof pf80) {
                            r6 = (pf80) objD0;
                        } else {
                            r6 = r15;
                        }
                        if (r6 != 0) {
                            B = r6.b();
                        } else {
                            B = r15;
                        }
                        if (B != 0) {
                            if (B.isEmpty()) {
                                e9d0.u(r6, " must not be empty", "Overlaid entries from ");
                                return;
                            }
                            arrayListL.add(x8x.v(o470Var, B, list7, list4));
                        }
                        if (B == 0) {
                            listP = CollectionsKt.P(1, arrayListL);
                            arrayList = new ArrayList(listP.size());
                            size = listP.size();
                            while (i11 < size) {
                                y1h0 y1h0Var1110 = (y1h0) listP.get(i11);
                                y1h0Var1110.getClass();
                                arrayList.add((pf80) y1h0Var1110);
                            }
                            y1h0 y1h0Var1111 = (y1h0) CollectionsKt.d0(arrayListL);
                            arrayListL2 = q3d.l(y1h0Var1111);
                            do {
                                y1h0Var = (y1h0) CollectionsKt.firstOrNull(arrayListL2);
                                if (y1h0Var != null) {
                                    listA = y1h0Var.a();
                                } else {
                                    listA = null;
                                }
                                if (listA != null) {
                                    i12 = 0;
                                } else {
                                    i12 = 0;
                                }
                                if (listA == null) {
                                    break;
                                    break;
                                }
                            } while (!listA.isEmpty());
                            arrayListL2.remove(y1h0Var1111);
                            h2h0 h2h0Var112 = new h2h0(arrayListV, arrayList, y1h0Var1111, arrayListL2);
                            fetVar2.o0(h2h0Var112);
                            objP2 = h2h0Var112;
                            break;
                        }
                        fetVar2 = fetVar;
                    }
                }
                h2h0 h2h0Var113 = (h2h0) objP2;
                c2h0Var = new c2h0(h2h0Var113.c);
                arrayList2 = h2h0Var113.d;
                arrayList3 = new ArrayList(arrayList2.size());
                size2 = arrayList2.size();
                while (i12 < size2) {
                    arrayList3.add(new c2h0((y1h0) arrayList2.get(i12)));
                    i12++;
                }
                iunVar = iun.f15405a;
                objP3 = fetVar2.P();
                if (objP3 == cl5Var) {
                    objP3 = new gf50(c2h0Var, arrayList3, iunVar);
                    fetVar2.o0(objP3);
                }
                gf50Var = (gf50) objP3;
                zI = fetVar2.i(c2h0Var) | fetVar2.i(arrayList3) | fetVar2.i(iunVar);
                objP4 = fetVar2.P();
                if (zI) {
                    objP4 = new mr0(gf50Var, c2h0Var, arrayList3, iunVar, (byte) 28);
                    gf50Var2 = gf50Var;
                    fetVar2.o0(objP4);
                } else {
                    objP4 = new mr0(gf50Var, c2h0Var, arrayList3, iunVar, (byte) 28);
                    gf50Var2 = gf50Var;
                    fetVar2.o0(objP4);
                }
                m0x0.D((Function0) objP4, fetVar2);
                fww.g(h2h0Var113, gf50Var2, null, function0, fetVar2, (i10 << 9) & 7168);
                function6 = da40Var;
                function5 = function7;
                f(h2h0Var113, gf50Var2, mm40Var2, u12Var4, function6, function5, o240Var, fetVar, ((i215 << 3) & 8064) | (i116 & 57344) | (458752 & i116) | (3670016 & i116) | (29360128 & i116));
                list5 = list7;
                u12Var3 = u12Var4;
                mm40Var3 = mm40Var2;
                list6 = list4;
            } else {
                fetVar.X();
                function5 = function2;
                mm40Var3 = mm40Var2;
                u12Var3 = u12Var2;
                list5 = listC;
                o240Var = function4;
                list6 = list4;
                function6 = da40Var;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new dz3(list, mm40Var3, u12Var3, list5, list6, function6, function5, o240Var, function0, i, i2, i3);
            }
        }
        i14 |= 24576;
        list4 = list3;
        if ((i3 & 32) != 0) {
            i14 |= 196608;
        } else if ((i & 196608) == 0) {
            if (fetVar2.g(null)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i14 |= i8;
        }
        if ((i3 & 64) != 0) {
            i14 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (fetVar2.i(null)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i14 |= i9;
        }
        if ((12582912 & i) == 0) {
            if ((i3 & 128) == 0) {
                da40Var = function1;
                if (fetVar2.i(da40Var)) {
                }
                i14 |= i17;
            } else {
                da40Var = function1;
            }
            i14 |= i17;
        } else {
            da40Var = function1;
        }
        if ((i & 100663296) != 0) {
            i14 |= ((i3 & 256) == 0 || !fetVar2.i(function2)) ? 33554432 : 67108864;
        }
        if ((i & 805306368) == 0) {
            if ((i3 & 512) == 0) {
                function4 = function3;
                if (fetVar2.i(function4)) {
                }
                i14 |= i18;
            } else {
                function4 = function3;
            }
            i14 |= i18;
        } else {
            function4 = function3;
        }
        if ((i2 & 6) == 0) {
            if (fetVar2.i(function0)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i2 | i13;
        } else {
            i10 = i2;
        }
        b = 1;
        if ((i14 & 306783379) == 306783378) {
            z = true;
        } else {
            z = true;
        }
        if (fetVar2.U(i14 & 1, z)) {
            fetVar2.Z();
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    mm40Var2 = jm40.b;
                }
                if (i4 != 0) {
                    u12Var2 = gqw0.f11754a;
                }
                if ((i3 & 8) != 0) {
                    i14 &= -7169;
                    listC = kotlin.collections.a.c(new mjk(b));
                }
                if (i6 != 0) {
                    list4 = iun.f15405a;
                }
                if ((i3 & 128) != 0) {
                    i14 &= -29360129;
                    da40Var = new da40((byte) 29);
                }
                if ((i3 & 256) != 0) {
                    mb50Var = new mb50((byte) 0);
                    i14 &= -234881025;
                } else {
                    mb50Var = function2;
                }
                if ((i3 & 512) != 0) {
                    i14 &= -1879048193;
                    u12 u12Var18 = u12Var2;
                    o240Var = new o240((byte) 27);
                    u12Var4 = u12Var18;
                    function7 = mb50Var;
                    list7 = listC;
                } else {
                    function7 = mb50Var;
                    u12Var4 = u12Var2;
                    list7 = listC;
                    o240Var = function4;
                }
            } else {
                if (i15 != 0) {
                    mm40Var2 = jm40.b;
                }
                if (i4 != 0) {
                    u12Var2 = gqw0.f11754a;
                }
                if ((i3 & 8) != 0) {
                    i14 &= -7169;
                    listC = kotlin.collections.a.c(new mjk(b));
                }
                if (i6 != 0) {
                    list4 = iun.f15405a;
                }
                if ((i3 & 128) != 0) {
                    i14 &= -29360129;
                    da40Var = new da40((byte) 29);
                }
                if ((i3 & 256) != 0) {
                    mb50Var = new mb50((byte) 0);
                    i14 &= -234881025;
                } else {
                    mb50Var = function2;
                }
                if ((i3 & 512) != 0) {
                    i14 &= -1879048193;
                    u12 u12Var19 = u12Var2;
                    o240Var = new o240((byte) 27);
                    u12Var4 = u12Var19;
                    function7 = mb50Var;
                    list7 = listC;
                } else {
                    function7 = mb50Var;
                    u12Var4 = u12Var2;
                    list7 = listC;
                    o240Var = function4;
                }
            }
            fetVar2.s();
            if (list.isEmpty()) {
                jf4.o("NavDisplay entries cannot be empty");
                return;
            }
            int i117 = i14 >> 6;
            int i216 = (i14 & 14) | (i117 & 112) | (i117 & 896) | (i117 & 7168) | ((i10 << 12) & 57344);
            pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
            fetVar2.e0(-984503628);
            fetVar2.r(false);
            zfn zfnVar9 = g2h0.f10557a;
            objP = fetVar2.P();
            cl5Var = ukd.f35823a;
            int i217 = i14;
            if (objP == cl5Var) {
                ngk0 ngk0Var9 = new ngk0();
                b2 = 1;
                objP = new f2h0(new gwg0((Object) ngk0Var9, (byte) 3), new ugd(-1714993007, true, new rqc0(ngk0Var9, (byte) 5)));
                fetVar2.o0(objP);
            } else {
                b2 = 1;
            }
            pb50 pb50Var9 = new pb50(new mb50(b2), u1c.M(1077673004, new q42(androidx.compose.runtime.e.f(list, fetVar2), b2), fetVar2));
            ?? r15 = new pb50[3];
            r15[0] = r15;
            r15[b2] = (f2h0) objP;
            r15[2] = pb50Var9;
            arrayListV = v3c.V(list, tx3.z(r15), fetVar2, i216 & 14);
            zG = fetVar2.g(CollectionsKt.L0(list7)) | fetVar2.g(arrayListV);
            objP2 = fetVar2.P();
            if (zG) {
                o470Var = new o470(new rip(pz40VarF, (byte) 24));
                arrayListL = q3d.l(x8x.v(o470Var, arrayListV, list7, list4));
                while (true) {
                    objD0 = CollectionsKt.d0(arrayListL);
                    if (objD0 instanceof pf80) {
                        r6 = (pf80) objD0;
                    } else {
                        r6 = r15;
                    }
                    if (r6 != 0) {
                        B = r6.b();
                    } else {
                        B = r15;
                    }
                    if (B != 0) {
                        if (B.isEmpty()) {
                            e9d0.u(r6, " must not be empty", "Overlaid entries from ");
                            return;
                        }
                        arrayListL.add(x8x.v(o470Var, B, list7, list4));
                    }
                    if (B == 0) {
                        listP = CollectionsKt.P(1, arrayListL);
                        arrayList = new ArrayList(listP.size());
                        size = listP.size();
                        while (i11 < size) {
                            y1h0 y1h0Var1112 = (y1h0) listP.get(i11);
                            y1h0Var1112.getClass();
                            arrayList.add((pf80) y1h0Var1112);
                        }
                        y1h0 y1h0Var1113 = (y1h0) CollectionsKt.d0(arrayListL);
                        arrayListL2 = q3d.l(y1h0Var1113);
                        do {
                            y1h0Var = (y1h0) CollectionsKt.firstOrNull(arrayListL2);
                            if (y1h0Var != null) {
                                listA = y1h0Var.a();
                            } else {
                                listA = null;
                            }
                            if (listA != null) {
                                i12 = 0;
                            } else {
                                i12 = 0;
                            }
                            if (listA == null) {
                                break;
                                break;
                            }
                        } while (!listA.isEmpty());
                        arrayListL2.remove(y1h0Var1113);
                        h2h0 h2h0Var114 = new h2h0(arrayListV, arrayList, y1h0Var1113, arrayListL2);
                        fetVar2.o0(h2h0Var114);
                        objP2 = h2h0Var114;
                        break;
                    }
                    fetVar2 = fetVar;
                }
            } else {
                o470Var = new o470(new rip(pz40VarF, (byte) 24));
                arrayListL = q3d.l(x8x.v(o470Var, arrayListV, list7, list4));
                while (true) {
                    objD0 = CollectionsKt.d0(arrayListL);
                    if (objD0 instanceof pf80) {
                        r6 = (pf80) objD0;
                    } else {
                        r6 = r15;
                    }
                    if (r6 != 0) {
                        B = r6.b();
                    } else {
                        B = r15;
                    }
                    if (B != 0) {
                        if (B.isEmpty()) {
                            e9d0.u(r6, " must not be empty", "Overlaid entries from ");
                            return;
                        }
                        arrayListL.add(x8x.v(o470Var, B, list7, list4));
                    }
                    if (B == 0) {
                        listP = CollectionsKt.P(1, arrayListL);
                        arrayList = new ArrayList(listP.size());
                        size = listP.size();
                        while (i11 < size) {
                            y1h0 y1h0Var1114 = (y1h0) listP.get(i11);
                            y1h0Var1114.getClass();
                            arrayList.add((pf80) y1h0Var1114);
                        }
                        y1h0 y1h0Var1115 = (y1h0) CollectionsKt.d0(arrayListL);
                        arrayListL2 = q3d.l(y1h0Var1115);
                        do {
                            y1h0Var = (y1h0) CollectionsKt.firstOrNull(arrayListL2);
                            if (y1h0Var != null) {
                                listA = y1h0Var.a();
                            } else {
                                listA = null;
                            }
                            if (listA != null) {
                                i12 = 0;
                            } else {
                                i12 = 0;
                            }
                            if (listA == null) {
                                break;
                                break;
                            }
                        } while (!listA.isEmpty());
                        arrayListL2.remove(y1h0Var1115);
                        h2h0 h2h0Var115 = new h2h0(arrayListV, arrayList, y1h0Var1115, arrayListL2);
                        fetVar2.o0(h2h0Var115);
                        objP2 = h2h0Var115;
                        break;
                    }
                    fetVar2 = fetVar;
                }
            }
            h2h0 h2h0Var116 = (h2h0) objP2;
            c2h0Var = new c2h0(h2h0Var116.c);
            arrayList2 = h2h0Var116.d;
            arrayList3 = new ArrayList(arrayList2.size());
            size2 = arrayList2.size();
            while (i12 < size2) {
                arrayList3.add(new c2h0((y1h0) arrayList2.get(i12)));
                i12++;
            }
            iunVar = iun.f15405a;
            objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = new gf50(c2h0Var, arrayList3, iunVar);
                fetVar2.o0(objP3);
            }
            gf50Var = (gf50) objP3;
            zI = fetVar2.i(c2h0Var) | fetVar2.i(arrayList3) | fetVar2.i(iunVar);
            objP4 = fetVar2.P();
            if (zI) {
                objP4 = new mr0(gf50Var, c2h0Var, arrayList3, iunVar, (byte) 28);
                gf50Var2 = gf50Var;
                fetVar2.o0(objP4);
            } else {
                objP4 = new mr0(gf50Var, c2h0Var, arrayList3, iunVar, (byte) 28);
                gf50Var2 = gf50Var;
                fetVar2.o0(objP4);
            }
            m0x0.D((Function0) objP4, fetVar2);
            fww.g(h2h0Var116, gf50Var2, null, function0, fetVar2, (i10 << 9) & 7168);
            function6 = da40Var;
            function5 = function7;
            f(h2h0Var116, gf50Var2, mm40Var2, u12Var4, function6, function5, o240Var, fetVar, ((i217 << 3) & 8064) | (i117 & 57344) | (458752 & i117) | (3670016 & i117) | (29360128 & i117));
            list5 = list7;
            u12Var3 = u12Var4;
            mm40Var3 = mm40Var2;
            list6 = list4;
        } else {
            fetVar.X();
            function5 = function2;
            mm40Var3 = mm40Var2;
            u12Var3 = u12Var2;
            list5 = listC;
            o240Var = function4;
            list6 = list4;
            function6 = da40Var;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dz3(list, mm40Var3, u12Var3, list5, list6, function6, function5, o240Var, function0, i, i2, i3);
        }
    }

    public static final void h(List list, mm40 mm40Var, u12 u12Var, Function0 function0, List list2, List list3, List list4, Function1 function1, Function1 function2, Function2 function3, Function1 function4, fet fetVar, int i) {
        mm40 mm40Var2;
        u12 u12Var2;
        List list5;
        Function1 function5;
        Function1 function6;
        Function2 function7;
        int i2;
        int i3;
        mm40 mm40Var3;
        u12 u12Var3;
        Function1 function8;
        Function2 function9;
        List list6;
        Function1 function10;
        fetVar.g0(1398581072);
        int i4 = i | (fetVar.i(list) ? 4 : 2) | 432 | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(list2) ? 16384 : 8192) | (fetVar.i(list3) ? 131072 : 65536) | 383254528;
        int i5 = (fetVar.i(function4) ? 256 : 128) | 18;
        byte b = 0;
        if (fetVar.U(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 147) == 146) ? false : true)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                zx7 zx7Var = gqw0.f11754a;
                iun iunVar = iun.f15405a;
                da40 da40Var = new da40((byte) 29);
                i2 = i4 & (-1879048193);
                mb50 mb50Var = new mb50(b);
                o240 o240Var = new o240((byte) 27);
                i3 = i5 & (-127);
                mm40Var3 = jm40.b;
                u12Var3 = zx7Var;
                function8 = mb50Var;
                function9 = o240Var;
                list6 = iunVar;
                function10 = da40Var;
            } else {
                fetVar.X();
                i2 = i4 & (-1879048193);
                i3 = i5 & (-127);
                mm40Var3 = mm40Var;
                u12Var3 = u12Var;
                list6 = list4;
                function10 = function1;
                function8 = function2;
                function9 = function3;
            }
            fetVar.s();
            if (list.isEmpty()) {
                jf4.o("NavDisplay backstack cannot be empty");
                return;
            }
            int i6 = i2 >> 9;
            g(v3c.W(list, list2, function4, fetVar, (i3 & 896) | (i2 & 14) | (i6 & 112)), mm40Var3, u12Var3, list3, list6, function10, function8, function9, function0, fetVar, ((i2 >> 6) & 7168) | 1794480, i6 & 14, 0);
            mm40Var2 = mm40Var3;
            u12Var2 = u12Var3;
            list5 = list6;
            function5 = function10;
            function6 = function8;
            function7 = function9;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            u12Var2 = u12Var;
            list5 = list4;
            function5 = function1;
            function6 = function2;
            function7 = function3;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ey7(list, mm40Var2, u12Var2, function0, list2, list3, list5, function5, function6, function7, function4, i);
        }
    }

    public static final void i(mm40 mm40Var, ql60 ql60Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1749184785);
        int i2 = i | 6 | (fetVar2.g(ql60Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD, 8.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            r(0, fetVar2, ohs0.i(fetVar2, mm40VarC0, gqw0.v, 1.0f, true), ql60Var.f28918a);
            v8q0.a(ql60Var.b, o7k0.u(jm40Var, 0.0f, 128.0f, 1), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar2), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jt50(mm40Var2, ql60Var, i, (byte) 8);
        }
    }

    public static final void j(String str, j43 j43Var, fet fetVar, int i) {
        boolean z;
        j43 j43Var2 = j43Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1982202784);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(j43Var2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            long jT = idm0.t(8);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, x7zVar, s6t0.b().f33626a.getTextPrimary(), new n05(jT, g1t0.g().f42262a.b, idm0.t(1)), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, i2 & 14, 24960, 110576);
            j43Var2 = j43Var;
            fetVar2 = fetVar;
            if (j43Var2.d) {
                fetVar2.e0(-1553022440);
                mm40 mm40VarP = o7k0.p(jm40Var, 72.0f, 18.0f);
                zcl zclVar2 = qmk.m;
                ugg0 ugg0Var = vgg0.f37379a;
                z = true;
                dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), vbc.d0(null, fetVar2, 0, 1), fetVar2, 0, false);
            } else {
                z = true;
                fetVar2.e0(-1552744153);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                x7z x7zVar2 = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                kkb.q(x7zVar2, j43Var2, new by6(g1t0.d(), 1019), fetVar2, i2 & 112);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m680(str, j43Var2, i, (byte) 3);
        }
    }

    public static final void k(mm40 mm40Var, i680 i680Var, fet fetVar, int i) {
        fet fetVar2;
        i680Var.getClass();
        fetVar.g0(1485777001);
        int i2 = i | 6 | (fetVar.g(i680Var) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ugd ugdVarM = u1c.M(1835205400, new p0z((Object) i680Var, (byte) 22), fetVar);
            jm40 jm40Var = jm40.b;
            fetVar2 = fetVar;
            z1x.d(jm40Var, true, ugdVarM, fetVar2, 438, 0);
            mm40Var = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l680(mm40Var, i680Var, i, b);
        }
    }

    public static final void l(mm40 mm40Var, kb90 kb90Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(53184301);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(kb90Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            long backgroundLight60 = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundLight60();
            boolean zF = fetVar2.f(backgroundLight60);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zF || objP == cl5Var) {
                objP = new dls((byte) 29, backgroundLight60);
                fetVar2.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40Var, (Function1) objP);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK2 = s5x0.K(mm40VarK, 12.0f, 14.0f);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = r71.E;
                fetVar2.o0(objP2);
            }
            tj30 tj30Var = (tj30) objP2;
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK2);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30Var, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(kb90Var.f18003a, mrv.k0(jm40.b, "TITLE_TEXT"), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), fetVar2), fetVar, 48, 24960, 110588);
            fetVar2 = fetVar;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1175712796, new ds60(kb90Var, (byte) 25), fetVar2), fetVar2, 56);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(mm40Var, kb90Var, i, (byte) 11);
        }
    }

    public static final void m(mm40 mm40Var, pfc0 pfc0Var, cqq cqqVar, Function1 function1, fet fetVar, int i) {
        pfc0Var.getClass();
        function1.getClass();
        fetVar.g0(2038391817);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(pfc0Var) ? 32 : 16) | (fetVar.g(cqqVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = Boolean.valueOf(pfc0Var.b);
                fetVar.o0(objP);
            }
            obc.d(h36.f12370a.a(cqqVar), u1c.M(-1213671223, new p2n((Object) pfc0Var, (Object) function1, (Object) mm40Var, ((Boolean) objP).booleanValue(), (byte) 29), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0(mm40Var, (Object) pfc0Var, (Object) cqqVar, function1, i, (byte) 1);
        }
    }

    public static final void n(mm40 mm40Var, izj0 izj0Var, cqq cqqVar, Function1 function1, fet fetVar, int i) {
        izj0Var.getClass();
        function1.getClass();
        fetVar.g0(1822983580);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(izj0Var) ? 32 : 16) | (fetVar.g(cqqVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            obc.d(h36.f12370a.a(cqqVar), u1c.M(759847516, new fzi0((byte) 17, mm40Var, (p6t0) izj0Var, function1), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0(mm40Var, (Object) izj0Var, (Object) cqqVar, function1, i, (byte) 20);
        }
    }

    public static final void o(mm40 mm40Var, fjk0 fjk0Var, Function1 function1, fet fetVar, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        fjk0 fjk0Var2 = fjk0Var;
        Object obj = function1;
        fet fetVar2 = fetVar;
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fjk0Var2.getClass();
        obj.getClass();
        fetVar2.g0(-1688467176);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(fjk0Var2) ? 32 : 16) | (fetVar2.i(obj) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z4 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z4) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar4);
            jpm0.o(fetVar2, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar2, shdVar2, fetVar2);
            jpm0.o(fetVar2, mm40VarC0, shdVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.d(jm40Var, 1.0f), null, false, 3);
            zcl zclVar = qmk.f28987a;
            float f = 8.0f;
            x5d x5dVarA2 = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarW);
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
            List list = fjk0Var2.f9645a;
            int i3 = fjk0Var2.c;
            ArrayList arrayListK = CollectionsKt.K(list, i3);
            fetVar2.e0(-1255011633);
            Iterator it = arrayListK.iterator();
            while (it.hasNext()) {
                List list2 = (List) it.next();
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                Iterator it2 = it;
                thg0 thg0VarA = shg0.a(new qw3(f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
                int iHashCode3 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM3 = fetVar2.m();
                mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarD2);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA, shdVar4);
                jpm0.o(fetVar2, bh90VarM3, shdVar3);
                vqd.u(iHashCode3, fetVar2, shdVar2, fetVar2);
                Iterator itV = kng0.v(fetVar2, mm40VarC2, shdVar, 1528436096, list2);
                while (itV.hasNext()) {
                    p6t0 p6t0Var = (p6t0) itV.next();
                    fetVar2.b0(-104499974, p6t0Var.getKey());
                    List list3 = list2;
                    if (1.0f <= 0.0d) {
                        vcx.a("invalid weight; must be greater than zero");
                    }
                    x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                    int iHashCode4 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM4 = fetVar2.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar2, x7zVar);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(pcyVar);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC, shdVar4);
                    jpm0.o(fetVar2, bh90VarM4, shdVar3);
                    vqd.u(iHashCode4, fetVar2, shdVar2, fetVar2);
                    jpm0.o(fetVar2, mm40VarC3, shdVar);
                    if (p6t0Var instanceof ahk0) {
                        fetVar2.e0(1568017771);
                        zdx.r(o7k0.d(jm40Var, 1.0f), (ahk0) p6t0Var, function1, fetVar2, (i2 & 896) | 6);
                        z3 = false;
                        fetVar2.r(false);
                    } else if (p6t0Var instanceof sgk0) {
                        fetVar2.e0(1568419624);
                        ntr.a(o7k0.d(jm40Var, 1.0f), (sgk0) p6t0Var, function1, fetVar2, (i2 & 896) | 6);
                        z3 = false;
                        fetVar2.r(false);
                    } else {
                        z3 = false;
                        fetVar2.e0(1568782014);
                        fetVar2.r(false);
                    }
                    fetVar2.r(true);
                    fetVar2.r(z3);
                    list2 = list3;
                }
                List list4 = list2;
                fetVar2.r(false);
                if (list4.size() < i3) {
                    fetVar2.e0(137989328);
                    int size = i3 - list4.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        if (1.0f <= 0.0d) {
                            vcx.a("invalid weight; must be greater than zero");
                        }
                        qxw.o(fetVar2, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    }
                    z2 = true;
                    fetVar2.r(false);
                } else {
                    z2 = true;
                    fetVar2.e0(138163269);
                    fetVar2.r(false);
                }
                fetVar2.r(z2);
                obj = function1;
                it = it2;
                f = 8.0f;
            }
            fetVar2.r(false);
            fetVar2.r(true);
            fjk0Var2 = fjk0Var;
            if (fjk0Var2.b) {
                fetVar2.e0(-409834402);
                mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarN = s5x0.N(mm40VarD3, 0.0f, 10.0f, 0.0f, 0.0f, 13);
                thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 54);
                int iHashCode5 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM5 = fetVar2.m();
                mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarN);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA2, shdVar4);
                jpm0.o(fetVar2, bh90VarM5, shdVar3);
                vqd.u(iHashCode5, fetVar2, shdVar2, fetVar2);
                jpm0.o(fetVar2, mm40VarC4, shdVar);
                mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11);
                String strS = xsm0.s(R.string.choose_social_network, fetVar2);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                y9q0 y9q0VarG = g1t0.g();
                zfn zfnVar = zaq0.b;
                v8q0.a(strS, mm40VarN2, ((ThemeColors) fetVar2.k(zfnVar)).getWarning(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarG, fetVar, 0, 0, 131064);
                fetVar2 = fetVar;
                dww.c(a8k0.F(R.drawable.ic_glyph_circle_warning, 0, fetVar2), null, o7k0.n(jm40Var, 16.0f), ((ThemeColors) fetVar2.k(zfnVar)).getWarning(), fetVar2, 56, 0);
                z = true;
                fetVar2.r(true);
                fetVar2.r(false);
            } else {
                z = true;
                fetVar2.e0(-408952204);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var, fjk0Var2, function1, i, (byte) 4);
        }
    }

    public static final void p(mm40 mm40Var, mer0 mer0Var, Function1 function1, fet fetVar, int i) {
        mer0Var.getClass();
        function1.getClass();
        fetVar.g0(1408988847);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(mer0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = false;
            tsm tsmVar = mer0Var.f21661a;
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new elk0(function1, (byte) 12);
                fetVar.o0(objP);
            }
            Function1 function2 = (Function1) objP;
            boolean z3 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new uck0(function1, (byte) 18);
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            if (i3 == 256) {
                z = true;
            }
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new uck0(function1, (byte) 19);
                fetVar.o0(objP3);
            }
            hic.m(mm40Var, tsmVar, function2, function0, (Function0) objP3, null, fetVar, i2 & 14, 68);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var, mer0Var, function1, i, (byte) 15);
        }
    }

    public static final void q(y5d y5dVar, mm40 mm40Var, j83 j83Var, j83 j83Var2, y9q0 y9q0Var, ugd ugdVar, fet fetVar, int i) {
        fetVar.e0(1026169175);
        ugdVar.F(y5dVar, fetVar, Integer.valueOf((i & 14) | ((i >> 12) & 112)));
        fetVar.r(false);
        zcl zclVar = qmk.f28987a;
        int i2 = (i >> 3) & 112;
        int i3 = i >> 6;
        t9x.u(o7k0.e(s5x0.L(mm40Var, 0.0f, 8.0f, 1), 32.0f), j83Var, y9q0Var, fetVar, i2 | (i3 & 896));
        t9x.u(o7k0.e(s5x0.N(mm40Var, 0.0f, 9.0f, 0.0f, 0.0f, 13), 32.0f), j83Var2, y9q0Var, fetVar, i3 & 1008);
    }

    public static final void r(int i, fet fetVar, mm40 mm40Var, String str) {
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-1995786273);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar2.g(null) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            brm0.x(fetVar2, mm40VarC0, gqw0.v, 1314593671, false);
            v8q0.a(str, new x7z(1.0f, true), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2, (i2 >> 6) & 14, 24960, 110584);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var, str2, i, (byte) 8);
        }
    }

    public static final void s(cp cpVar) {
        kxx kxxVar = (kxx) cpVar.u;
        kxxVar.e.setAllowClickWhenDisabled(((fij0) cpVar.u()).k());
        kxxVar.e.setEnabled(((fij0) cpVar.u()).G());
    }

    public static final void t(cp cpVar) {
        kxx kxxVar = (kxx) cpVar.u;
        if (((fij0) cpVar.u()).r0().length() <= 0) {
            kxxVar.d.setVisibility(8);
        } else {
            kxxVar.d.setText(((fij0) cpVar.u()).r0());
            kxxVar.d.setVisibility(0);
        }
    }

    public static final void u(cp cpVar) {
        kxx kxxVar = (kxx) cpVar.u;
        kxxVar.c.setSubtitleVisible(((fij0) cpVar.u()).l0().length() > 0);
        kxxVar.c.setSubtitle(((fij0) cpVar.u()).l0());
    }

    public static final qgm0 v(ctf0 ctf0Var, String str, p0u0 p0u0Var, boolean z) {
        ctf0Var.getClass();
        String upperCase = p0u0Var.k.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        ogm0 ogm0Var = new ogm0(str, upperCase, lmc.E(p0u0Var.l), z ? ctf0Var.b.a(R.string.valorant_mvp, Arrays.copyOf(new Object[0], 0)) : "");
        String strValueOf = String.valueOf(p0u0Var.g);
        qek0 qek0Var = qek0.c;
        return new qgm0(ogm0Var, dyb.g0(new vem0(strValueOf, qek0Var), new vem0(String.valueOf(p0u0Var.h), qek0Var), new vem0(String.valueOf(p0u0Var.e), qek0Var)));
    }

    public static final jbm w(String str, String str2, String str3, String str4, ArrayList arrayList) {
        i4 i4VarG0 = dyb.g0(new s2m(new u6n(d4d.STATIC_WHITE60, w6n.k, new c280(str3, R.drawable.ic_glyph_placeholder_player)), str2));
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jj40 jj40Var = (jj40) it.next();
            String str5 = jj40Var.f16605a;
            n0x n0xVar = new n0x(jj40Var.c);
            String str6 = jj40Var.d;
            arrayList2.add(new ibm(str5, n0xVar, str6.length() > 0 ? new fbm(new n0x(str6)) : gbm.f11020a, jj40Var.b, jj40Var.f16605a.equals(str4)));
        }
        return new jbm(str, i4VarG0, dyb.r0(arrayList2));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    public static final lc00 x(i9y i9yVar) {
        boolean z;
        ArrayList arrayList;
        String strM;
        i9y i9yVar2 = i9yVar;
        lc00 lc00VarB = kotlin.collections.a.b();
        Member member = i9yVar2.d;
        rgy rgyVar = i9yVar2.f8277a;
        if (member instanceof Constructor) {
            Class declaringClass = ((Constructor) member).getDeclaringClass();
            declaringClass.getClass();
            if (declaringClass.getDeclaringClass() == null || Modifier.isStatic(declaringClass.getModifiers())) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        Map mapM = xp20.m(tx3.m0(i9yVar2.u(), i9yVar2.getTypeParameters()));
        boolean zC = rgyVar.c();
        List list = rgyVar.f;
        if (zC && list.size() == 1) {
            List parameters = ((dre0) CollectionsKt.v0(list)).getParameters();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : parameters) {
                if (((hre0) obj).n() == aiy.d) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(r3d.q(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((hre0) it.next()).p());
            }
        } else {
            Type[] typeArrP = i9yVar2.p();
            ArrayList arrayList3 = new ArrayList(typeArrP.length);
            for (Type type : typeArrP) {
                arrayList3.add(tke.j0(type, mapM, tke.W(member) ? gzs0.f12197a : gzs0.c, false, false, null, 28));
            }
            arrayList = arrayList3;
        }
        ArrayList<kiy> arrayList4 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(fre0.c0(i9yVar2, (kiy) it2.next()));
        }
        if (z) {
            Class<?> declaringClass2 = ((Constructor) member).getDeclaringClass().getDeclaringClass();
            declaringClass2.getClass();
            lc00VarB.add(new ajx(i9yVar2, sre0.f32672a.b(declaringClass2)));
        } else if ((member instanceof Method) && !Modifier.isStatic(((Method) member).getModifiers())) {
            ihy ihyVar = i9yVar2.c;
            ihyVar.getClass();
            lc00VarB.add(new ajx(i9yVar2, (xgy) ihyVar));
        }
        ArrayList arrayListJ = ujn.o.j(member);
        int size = arrayListJ != null ? arrayListJ.size() - arrayList4.size() : 0;
        int i = 0;
        for (kiy kiyVar : arrayList4) {
            int i2 = i + 1;
            if ((i != 0 || !z || arrayList4.size() != i9yVar2.z().length) && (i >= 2 || !member.getDeclaringClass().isEnum() || !(member instanceof Constructor) || arrayList4.size() != i9yVar2.z().length)) {
                if (arrayListJ != null) {
                    strM = (String) CollectionsKt.W(i + size, arrayListJ);
                    if (strM == null) {
                        ohq.c(i, size, i9yVar2.getName(), kiyVar, member);
                        return null;
                    }
                } else {
                    strM = twn.m(i, "arg");
                }
                lc00VarB.add(new o9y(i9yVar2, strM, kiyVar, lc00VarB.b(), aiy.d, i == arrayList4.size() - 1 && i9yVar2.A()));
            }
            i9yVar2 = i9yVar;
            i = i2;
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final ArrayList y(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((jj40) obj).b.length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final String z(String str, ArrayList arrayList) {
        Object next;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((jj40) next).f16605a.equals(str));
        jj40 jj40Var = (jj40) next;
        String str2 = jj40Var != null ? jj40Var.f16605a : null;
        jj40 jj40Var2 = (jj40) CollectionsKt.firstOrNull(arrayList);
        String str3 = jj40Var2 != null ? jj40Var2.f16605a : null;
        if (str3 == null) {
            str3 = "";
        }
        return sj3.j0(str2, str3);
    }
}
