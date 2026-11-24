package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import android.window.BackEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;
import org.xplatform.ui_core.viewcomponents.imageview.MeasuredImageView;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xww {
    public static final String A(String str, ArrayList arrayList) {
        Object next;
        Object next2;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((wmg) next).f39405a, str));
        wmg wmgVar = (wmg) next;
        String str2 = wmgVar != null ? wmgVar.f39405a : null;
        Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (Intrinsics.d((wmg) next2, new wmg("", "", "", null, null, null, null, null, false, 0, iun.f15405a, "")));
        wmg wmgVar2 = (wmg) next2;
        String str3 = wmgVar2 != null ? wmgVar2.f39405a : null;
        if (str3 == null) {
            str3 = "";
        }
        return sj3.j0(str2, str3);
    }

    public static final String B(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        if (i >= 0) {
            sb.append("Unexpected JSON token at offset " + i + ": ");
        }
        sb.append(str);
        if (str2 != null && !StringsKt.W(str2)) {
            sb.append(" at path: ");
            sb.append(str2);
        }
        if (str3 != null && !StringsKt.W(str3)) {
            sb.append(Separators.RETURN + str3);
        }
        if (str4 != null) {
            sb.append("\nJSON input: ");
            sb.append(str4);
        }
        return sb.toString();
    }

    public static final long D(pi9 pi9Var, float f) {
        zcl zclVar = qmk.f28987a;
        if (ycl.b(f, 0.0f)) {
            return 0L;
        }
        float density = pi9Var.getDensity() * f;
        return (((long) Float.floatToRawIntBits(pi9Var.getDensity() * f)) & 4294967295L) | (Float.floatToRawIntBits(density) << 32);
    }

    public static final Type[] E(Constructor constructor) {
        Class declaringClass = constructor.getDeclaringClass();
        Class<?> declaringClass2 = declaringClass.getDeclaringClass();
        if (declaringClass2 == null || Modifier.isStatic(declaringClass.getModifiers())) {
            declaringClass2 = null;
        }
        if (declaringClass2 == null) {
            return F(constructor);
        }
        jdg0 jdg0Var = new jdg0(2);
        jdg0Var.a(declaringClass2);
        jdg0Var.b(F(constructor));
        ArrayList arrayList = jdg0Var.b;
        return (Type[]) arrayList.toArray(new Type[arrayList.size()]);
    }

    public static final Type[] F(Constructor constructor) {
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        if (genericParameterTypes.length == constructor.getParameterTypes().length) {
            Class declaringClass = constructor.getDeclaringClass();
            if (!Modifier.isStatic(declaringClass.getModifiers()) && declaringClass.getDeclaringClass() != null) {
                return (Type[]) tx3.y(1, genericParameterTypes).toArray(new Type[0]);
            }
        }
        return genericParameterTypes;
    }

    public static final jwm H(icg icgVar, q0s q0sVar, ctf0 ctf0Var) {
        icgVar.getClass();
        ctf0Var.getClass();
        rdj rdjVar = rdj.f30294a;
        boolean zH = ctf0Var.h();
        return new jwm(c0(rdj.g(new znq0(icgVar.f), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56), q0sVar), q0sVar == q0s.b ? 1 : Integer.MAX_VALUE);
    }

    public static final jwm I(k9p0 k9p0Var, q0s q0sVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        rdj rdjVar = rdj.f30294a;
        boolean zH = ctf0Var.h();
        return new jwm(c0(rdj.g(new znq0(k9p0Var.k), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56), q0sVar), q0sVar == q0s.b ? 1 : Integer.MAX_VALUE);
    }

    public static final jwm J(icg icgVar, q0s q0sVar) {
        icgVar.getClass();
        String str = icgVar.k;
        if (q0sVar != q0s.f27918a || str.length() <= 0) {
            return null;
        }
        return new jwm(str, Integer.MAX_VALUE);
    }

    public static final jwm K(icg icgVar, q0s q0sVar, ctf0 ctf0Var) {
        String strI;
        String strA;
        icgVar.getClass();
        ctf0Var.getClass();
        switch (icgVar.o.ordinal()) {
            case 0:
                String str = icgVar.e;
                String str2 = icgVar.d;
                if (str.length() <= 0 || str2.length() <= 0) {
                    String str3 = str.length() > 0 ? str : null;
                    strI = str3 == null ? icgVar.c : str3;
                } else {
                    strI = ua80.i(str2, " (", str, Separators.RPAREN);
                }
                strA = strI.length() <= 0 ? "" : ctf0Var.b.a(R.string.game_series_info_v2, Arrays.copyOf(new Object[]{strI}, 1));
                break;
            case 1:
                strA = ctf0Var.b.a(R.string.match_interrupted_title, Arrays.copyOf(new Object[0], 0));
                break;
            case 2:
                strA = ctf0Var.b.a(R.string.match_postponed_title, Arrays.copyOf(new Object[0], 0));
                break;
            case 3:
                strA = ctf0Var.b.a(R.string.match_detail_being_confirmed_title, Arrays.copyOf(new Object[0], 0));
                break;
            case 4:
                strA = ctf0Var.b.a(R.string.match_canceled_with_rules_title, Arrays.copyOf(new Object[0], 0));
                break;
            case 5:
                strA = ctf0Var.b.a(R.string.opponents_withdrawal_title, Arrays.copyOf(new Object[0], 0));
                break;
            case 6:
                strA = ctf0Var.b.a(R.string.match_canceled_title, Arrays.copyOf(new Object[0], 0));
                break;
            case 7:
                strA = ctf0Var.b.a(R.string.match_interrupted_information_clarified_title, Arrays.copyOf(new Object[0], 0));
                break;
            default:
                t9f.b();
                return null;
        }
        return new jwm(c0(strA, q0sVar), q0sVar != q0s.b ? Integer.MAX_VALUE : 1);
    }

    public static final jwm L(k9p0 k9p0Var, q0s q0sVar, ctf0 ctf0Var) {
        ctf0Var.getClass();
        String str = k9p0Var.i;
        return new jwm(c0(str.length() > 0 ? ctf0Var.b.a(R.string.game_series_info_v2, Arrays.copyOf(new Object[]{str}, 1)) : "", q0sVar), q0sVar != q0s.b ? Integer.MAX_VALUE : 1);
    }

    public static int M(int[] iArr, int i, boolean z) {
        boolean z2;
        int[] iArr2 = iArr;
        int i2 = 0;
        for (int i3 : iArr2) {
            i2 += i3;
        }
        int length = iArr2.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int i7 = length - 1;
            if (i4 >= i7) {
                return i5;
            }
            int i8 = 1 << i4;
            i6 |= i8;
            int i9 = 1;
            while (i9 < iArr2[i4]) {
                int i10 = i2 - i9;
                int i11 = length - i4;
                int i12 = i11 - 2;
                int iY = y(i10 - 1, i12);
                if (z && i6 == 0) {
                    int i13 = i11 - 1;
                    if (i10 - i13 >= i13) {
                        iY -= y(i10 - i11, i12);
                    }
                }
                boolean z3 = true;
                if (i11 - 1 > 1) {
                    int i14 = i10 - i12;
                    int iY2 = 0;
                    while (i14 > i) {
                        iY2 += y((i10 - i14) - 1, i11 - 3);
                        i14--;
                        z3 = z3;
                    }
                    z2 = z3;
                    iY -= (i7 - i4) * iY2;
                } else {
                    z2 = true;
                    if (i10 > i) {
                        iY--;
                    }
                }
                i5 += iY;
                i9++;
                i6 &= ~i8;
                iArr2 = iArr;
            }
            i2 -= i9;
            i4++;
            iArr2 = iArr;
        }
    }

    public static final a4x N(dd80 dd80Var, List list, mdm mdmVar, ctf0 ctf0Var) {
        Object next;
        ed80 ed80Var = dd80Var.i;
        if (ed80Var == null) {
            return lak0.c;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(new bc80(mdmVar));
        lc00VarB.add(new rc80(new hjm(ctf0Var.b.a(R.string.recommend, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, false, null, null, false, null, null, 8190), nc80.f23280a));
        wcb wcbVar = ed80Var.k;
        boolean z = ed80Var.i;
        boolean z2 = ed80Var.b;
        v5l0 v5l0Var = ed80Var.f7604a;
        y78 y78Var = ed80Var.j;
        List list2 = ed80Var.l;
        boolean z3 = ed80Var.o;
        int i = 10;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d0t d0tVar = (d0t) it.next();
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((lok0) next).f20396a != d0tVar.O);
            lok0 lok0Var = (lok0) next;
            y78 y78Var2 = y78Var;
            boolean z4 = z;
            String strA = wcbVar.a(d0tVar.v, d0tVar.u);
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, i));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Integer.valueOf(((lok0) it3.next()).f20396a));
            }
            boolean z5 = lok0Var != null ? lok0Var.n : false;
            boolean z6 = lok0Var != null ? lok0Var.p : false;
            m5l0 m5l0Var = d0tVar.K.isEmpty() ? i5l0.f14197a : l5l0.f19463a;
            String str = lok0Var != null ? lok0Var.u : null;
            if (str == null) {
                str = "";
            }
            z = z4;
            y78Var = y78Var2;
            boolean z7 = z3;
            v5l0 v5l0Var2 = v5l0Var;
            arrayList.add(new dee0(wwb.V(d0tVar, ctf0Var, y78Var, z, z2, strA, false, arrayList2, z5, z6, false, v5l0Var2, m5l0Var, str, z7)));
            i = 10;
            v5l0Var = v5l0Var2;
            z3 = z7;
        }
        return cs0.f(lc00VarB, lc00VarB, arrayList);
    }

    public static final void O(fp fpVar, String str) {
        fpVar.s(fpVar.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final ArrayList P(List list) {
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wmg wmgVar = (wmg) it.next();
            if (wmgVar.b.length() == 0) {
                wmgVar = new wmg("", "", "", null, null, null, null, null, false, 0, iun.f15405a, "");
            }
            arrayList.add(wmgVar);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final float Q(ou90 ou90Var, boolean z, xlw[] xlwVarArr, float f) {
        float f2 = Float.NaN;
        for (xlw xlwVar : xlwVarArr) {
            float fA = ou90Var.a(xlwVar);
            if (Float.isNaN(f2)) {
                f2 = fA;
            } else if (z == (fA > f2)) {
                f2 = fA;
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static final CharSequence R(int i, CharSequence charSequence) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder sb = new StringBuilder(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                sb.append(charSequence.subSequence(i2, i3).toString());
                sb.append(str2);
                return sb.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final String S(Number number, String str) {
        StringBuilder sb = new StringBuilder("Unexpected special floating-point value ");
        sb.append(number);
        return axq.n(sb, str != null ? kng0.l(" with key ", str, ". ") : ". ", "By default, non-finite floating point values are prohibited because they do not conform JSON specification.");
    }

    public static final List T(ArrayList arrayList) {
        Object next;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((my30) next).m() != iz30.y);
        my30 my30Var = (my30) next;
        if (my30Var == null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((my30) obj).m() != iz30.y) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            if (!(((my30) it2.next()).o0() instanceof sy30)) {
                break;
            }
            i++;
        }
        int i2 = i != -1 ? i : 0;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList3.add(i2, my30Var);
        return arrayList3;
    }

    public static final u910 U(fet fetVar) {
        fetVar.f0(2024497114);
        fetVar.f0(-610207850);
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            objP = new u910();
            fetVar.o0(objP);
        }
        u910 u910Var = (u910) objP;
        fetVar.r(false);
        fetVar.r(false);
        return u910Var;
    }

    public static final hy30 V(kw30 kw30Var, boolean z) {
        return new hy30(kw30Var.b, kw30Var.c, new cll(kw30Var.d, new n0x(kw30Var.f), kw30Var.g, kw30Var.h), z, yyw.g0(kw30Var), yyw.h0(kw30Var));
    }

    public static final j83 W(uf50 uf50Var, ctf0 ctf0Var) {
        uf50Var.getClass();
        ctf0Var.getClass();
        h83 h83Var = new h83();
        rdj rdjVar = rdj.f30294a;
        boolean zH = ctf0Var.h();
        long jC = uf50Var.c();
        String strG = rdj.g(new znq0(jC), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56);
        if (strG.length() > 0) {
            h83 h83Var2 = new h83();
            long j = y3d.g;
            long j2 = daq0.c;
            pz40 pz40Var = s6t0.f31722a;
            smk0 smk0Var = new smk0(StaticColors.INSTANCE.m123getWhite0d7_KjU(), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
            h83Var2.c(strG);
            StringBuilder sb = h83Var2.f12607a;
            h83Var2.a(smk0Var, 0, sb.length());
            sb.length();
            h83Var.b(h83Var2.h());
        }
        return h83Var.h();
    }

    public static final j83 X(uf50 uf50Var, ctf0 ctf0Var) {
        uf50Var.getClass();
        ctf0Var.getClass();
        dpi0 dpi0Var = new dpi0((byte) 15);
        pz40 pz40Var = s6t0.f31722a;
        long jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
        int i = 0;
        if (uf50Var.a()) {
            z(dpi0Var, ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)), jM123getWhite0d7_KjU);
        } else {
            aj50 aj50VarE = uf50Var.e();
            if (aj50VarE == null || !aj50VarE.h) {
                aj50 aj50VarE2 = uf50Var.e();
                String str = aj50VarE2 != null ? aj50VarE2.i : null;
                if (str == null) {
                    str = "";
                }
                if (uf50Var.h().length() > 0 && !kotlin.text.c.l(StringsKt.u0(str).toString(), StringsKt.u0(uf50Var.h()).toString())) {
                    if (dpi0Var.k()) {
                        z(dpi0Var, Separators.SP, jM123getWhite0d7_KjU);
                    }
                    z(dpi0Var, uf50Var.h(), jM123getWhite0d7_KjU);
                }
                if (str.length() > 0) {
                    if (dpi0Var.k()) {
                        z(dpi0Var, ", ", jM123getWhite0d7_KjU);
                    }
                    z(dpi0Var, str, jM123getWhite0d7_KjU);
                }
                aj50 aj50VarE3 = uf50Var.e();
                List list = aj50VarE3 != null ? aj50VarE3.c : null;
                if (list == null) {
                    list = iun.f15405a;
                }
                if (!list.isEmpty()) {
                    if (dpi0Var.k()) {
                        z(dpi0Var, ", ", jM123getWhite0d7_KjU);
                    }
                    z(dpi0Var, Separators.LPAREN, jM123getWhite0d7_KjU);
                    for (Object obj : list) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        ih50 ih50Var = (ih50) obj;
                        z(dpi0Var, ih50Var.b + "-" + ih50Var.c, jM123getWhite0d7_KjU);
                        if (i != list.size() - 1) {
                            z(dpi0Var, ", ", jM123getWhite0d7_KjU);
                        }
                        i = i2;
                    }
                    z(dpi0Var, Separators.RPAREN, jM123getWhite0d7_KjU);
                }
                if (uf50Var.f().length() > 0) {
                    if (dpi0Var.k()) {
                        z(dpi0Var, ", ", jM123getWhite0d7_KjU);
                    }
                    z(dpi0Var, uf50Var.f(), jM123getWhite0d7_KjU);
                }
                aj50 aj50VarE4 = uf50Var.e();
                String str2 = aj50VarE4 != null ? aj50VarE4.g : null;
                if (str2 != null && str2.length() != 0) {
                    if (dpi0Var.k()) {
                        z(dpi0Var, ", ", jM123getWhite0d7_KjU);
                    }
                    z(dpi0Var, str2, jM123getWhite0d7_KjU);
                }
            } else {
                z(dpi0Var, ctf0Var.b.a(R.string.card_cricket_break, Arrays.copyOf(new Object[0], 0)), jM123getWhite0d7_KjU);
            }
        }
        return ((h83) dpi0Var.f6468a).h();
    }

    public static final iy30 Y(kw30 kw30Var) {
        return new iy30(kw30Var.b, kw30Var.c, new fc0(kw30Var.d, kw30Var.g, new n0x(kw30Var.f)), yyw.g0(kw30Var), yyw.h0(kw30Var));
    }

    public static final la30 Z(m9s m9sVar) {
        m9sVar.getClass();
        yk5 yk5Var = mc6.b;
        qqs qqsVar = m9sVar.h;
        Integer numValueOf = Integer.valueOf(qqsVar.n);
        yk5Var.getClass();
        byte b = yk5.d(numValueOf).f21536a;
        List listL = qem0.l(b, qqsVar.d);
        List listL2 = qem0.l(b, qqsVar.e);
        cqg cqgVar = m9sVar.I;
        el40 el40Var = cqgVar instanceof el40 ? (el40) cqgVar : null;
        return new la30(b, el40Var != null ? znq0.f(el40Var.j) : 0L, "", listL, listL2);
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        fetVar.g0(-932007878);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarD, backgroundContent, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12)), 16.0f);
            long textPrimary = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            str2 = str;
            v8q0.a(str2, mm40VarJ, textPrimary, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, g1t0.q(), fetVar, (i2 >> 3) & 14, 0, 130040);
            mm40Var2 = jm40Var;
        } else {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n040(mm40Var2, str2, i, (byte) 15);
        }
    }

    public static final ArrayList a0(List list, List list2, r040 r040Var, ctf0 ctf0Var, qho qhoVar, String str, Function1 function1) {
        int iB;
        list2.getClass();
        r040Var.getClass();
        ctf0Var.getClass();
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (!list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (r040Var == ((r040) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((my30) obj).y0()) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add((my30) it2.next());
        }
        int iOrdinal = r040Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 2 || iOrdinal == 4 || iOrdinal == 6 || iOrdinal == 8 || iOrdinal == 10) {
            switch (r040Var) {
                case SPORTS:
                case SINGLE_SPORTS:
                    iB = qhoVar.b(R.drawable.ic_glyph_sport);
                    break;
                case AGGREGATOR:
                case SINGLE_AGGREGATOR:
                    iB = qhoVar.b(R.drawable.ic_glyph_cards);
                    break;
                case GAMES:
                case SINGLE_GAMES:
                    iB = qhoVar.b(R.drawable.ic_glyph_games);
                    break;
                case OTHER:
                case SINGLE_OTHER:
                    iB = qhoVar.b(R.drawable.ic_glyph_other);
                    break;
                case TOP:
                case SINGLE_TOP:
                    iB = qhoVar.b(R.drawable.ic_glyph_top);
                    break;
                case VIRTUAL:
                case SINGLE_VIRTUAL:
                    iB = qhoVar.b(R.drawable.ic_glyph_virtual);
                    break;
                default:
                    iB = qhoVar.b(R.drawable.ic_glyph_other);
                    break;
            }
            int i = iB;
            arrayList.add(new nqv(r040Var, z, new gy30(new ux30(14, 0L, f0(r040Var, ctf0Var, str), (String) null), new rx30(new m0x(i, null, 6), 0L, null, i, 0L, null, Response.BAD_GATEWAY), new yx30(z), 0L, null, z ? xx30.b : xx30.f41640a, 184)));
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!((my30) obj2).y0()) {
                    arrayList3.add(obj2);
                }
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList.add((my30) it3.next());
            }
            arrayList.addAll((Collection) function1.invoke(Integer.valueOf(arrayList3.size())));
        }
        return arrayList;
    }

    public static final void b(mm40 mm40Var, pz40 pz40Var, xcz xczVar, hh80 hh80Var, Function1 function1, Function1 function2, xdr xdrVar, fet fetVar, int i) {
        int i2;
        function1.getClass();
        function2.getClass();
        xdrVar.getClass();
        fetVar.g0(1861258192);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pz40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(hh80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(xdrVar) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            bww.d(mm40Var, pz40Var, true, hh80Var, xczVar, u1c.M(789794977, new hgx(xdrVar, (byte) 3), fetVar), u1c.M(-2072145420, new igx(backgroundContent, qmk.a(fetVar).c, function1, function2, (byte) 1), fetVar), jiq0.d, fetVar, (i2 & 14) | 14352768 | (i2 & 112) | (i2 & 7168) | ((i2 << 6) & 57344));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jgx(mm40Var, pz40Var, xczVar, hh80Var, function1, function2, xdrVar, i, (byte) 4);
        }
    }

    public static final xe50 b0(BackEvent backEvent) {
        backEvent.getClass();
        return new xe50(backEvent.getProgress(), backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static final tcy c(Number number, String str) {
        return new tcy(S(number, str), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
    }

    public static final String c0(String str, q0s q0sVar) {
        return (str.length() == 0 && q0sVar == q0s.b) ? Separators.SP : str;
    }

    public static final tcy d(ugi0 ugi0Var) {
        ugi0Var.getClass();
        String str = "Value of type '" + ugi0Var.h() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + ugi0Var.l() + '\'';
        ugi0Var.h();
        return new tcy(str, "Use 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final String d0(o7f0 o7f0Var, ctf0 ctf0Var) {
        o7f0Var.getClass();
        ctf0Var.getClass();
        return kng0.l(kng0.l(ctf0Var.f(R.string.login_, new Object[0]), ": ", o7f0Var.f24784a), Separators.RETURN, kng0.l(ctf0Var.f(R.string.reg_password, new Object[0]), ": ", o7f0Var.b));
    }

    public static final void e(mm40 mm40Var, ezy ezyVar, Function1 function1, fet fetVar, int i) {
        ezyVar.getClass();
        function1.getClass();
        fetVar.g0(-1020673244);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(ezyVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            kr00.a(u1c.M(1562680263, new zyy(mm40Var, function1, ezyVar), fetVar), fetVar, 6);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zyy(mm40Var, ezyVar, function1, i);
        }
    }

    public static final kc90 e0(sc90 sc90Var, long j, int i) {
        sc90Var.getClass();
        if (sc90Var.equals(rc90.f30227a)) {
            return new fc90(i, bww.H(j));
        }
        if (sc90Var.equals(rc90.b)) {
            return new fc90(i, azw.O(j));
        }
        if (sc90Var instanceof qc90) {
            return new ac90(String.valueOf(i + 1), i, ((qc90) sc90Var).f28475a ? StaticColors.INSTANCE.m123getWhite0d7_KjU() : StaticColors.INSTANCE.m129getWhite400d7_KjU());
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x014b  */
    /* JADX WARN: Code duplicated, block: B:58:0x014d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0156  */
    public static final void f(l7m0 l7m0Var, boolean z, Function1 function1, fet fetVar, int i) {
        l7m0 l7m0Var2;
        int i2;
        cl5 cl5Var;
        boolean z2;
        Object objP;
        fet fetVar2 = fetVar;
        l7m0Var.getClass();
        function1.getClass();
        fetVar2.g0(19226717);
        if ((i & 6) == 0) {
            l7m0Var2 = l7m0Var;
            i2 = (fetVar2.g(l7m0Var2) ? 4 : 2) | i;
        } else {
            l7m0Var2 = l7m0Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            imm immVar = ((shz) l7m0Var2.getValue()).f32238a;
            int i3 = i2 & 896;
            boolean z3 = i3 == 256;
            Object objP2 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z3 || objP2 == cl5Var2) {
                objP2 = new xwy(function1, (byte) 15);
                fetVar2.o0(objP2);
            }
            hlm.c(mm40VarD, immVar, null, (Function0) objP2, null, null, null, null, null, null, null, null, fetVar, 6, 0, 4084);
            fetVar2 = fetVar;
            if (z) {
                fetVar2.e0(-1532500823);
                mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                hyl hylVar = ((shz) l7m0Var.getValue()).b;
                vxl vxlVar = vxl.b;
                boolean z4 = i3 == 256;
                Object objP3 = fetVar2.P();
                if (z4) {
                    cl5Var = cl5Var2;
                } else {
                    cl5Var = cl5Var2;
                    if (objP3 == cl5Var) {
                    }
                    Function1 function2 = (Function1) objP3;
                    if (i3 == 256) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objP = fetVar2.P();
                    if (z2 || objP == cl5Var) {
                        objP = new i1y(function1, (byte) 21);
                        fetVar2.o0(objP);
                    }
                    ebc.r(mm40VarQ, hylVar, vxlVar, function2, (Function1) objP, fetVar, 384, 8);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
                objP3 = new i1y(function1, (byte) 20);
                fetVar2.o0(objP3);
                Function1 function3 = (Function1) objP3;
                if (i3 == 256) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = fetVar2.P();
                if (z2) {
                    objP = new i1y(function1, (byte) 21);
                    fetVar2.o0(objP);
                } else {
                    objP = new i1y(function1, (byte) 21);
                    fetVar2.o0(objP);
                }
                ebc.r(mm40VarQ, hylVar, vxlVar, function3, (Function1) objP, fetVar, 384, 8);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1531960741);
                fetVar2.r(false);
            }
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            jcb.v(mm40VarD2, 1.0f, ((ThemeColors) fetVar2.k(zaq0.b)).getSeparator60(), fetVar2, 6, 0);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yzx((Object) l7m0Var, z, (Object) function1, i, (byte) 2);
        }
    }

    public static final String f0(r040 r040Var, ctf0 ctf0Var, String str) {
        r040Var.getClass();
        ctf0Var.getClass();
        switch (r040Var) {
            case SPORTS:
            case SINGLE_SPORTS:
                return ctf0Var.b.a(R.string.sport, Arrays.copyOf(new Object[0], 0));
            case AGGREGATOR:
            case SINGLE_AGGREGATOR:
                return ctf0Var.b.a(R.string.casino_chip, Arrays.copyOf(new Object[0], 0));
            case GAMES:
            case SINGLE_GAMES:
                return str;
            case OTHER:
            case SINGLE_OTHER:
                return ctf0Var.b.a(R.string.other_menu, Arrays.copyOf(new Object[0], 0));
            case TOP:
            case SINGLE_TOP:
                return ctf0Var.b.a(R.string.top, Arrays.copyOf(new Object[0], 0));
            case VIRTUAL:
            case SINGLE_VIRTUAL:
                return ctf0Var.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0));
            default:
                return "";
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(2059124815);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 48.0f);
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(vqm.c, fetVar, 6, 0)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wqr(mm40Var, i, (byte) 17);
        }
    }

    public static final void h(mm40 mm40Var, eao eaoVar, a4x a4xVar, xdr xdrVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        a4xVar.getClass();
        xdrVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(468133197);
        int i2 = i | 6 | (fetVar.g(eaoVar) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128) | (fetVar.i(xdrVar) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192) | (fetVar.i(function2) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(jm40Var, backgroundContent, ljcVar);
            zcl zclVar = qmk.f28987a;
            int i3 = (i2 & 112) | 12582912 | (i2 & 896);
            int i4 = i2 << 3;
            fww.e(s5x0.N(s5x0.L(mm40VarQ, 8.0f, 0.0f, 2), 0.0f, 12.0f, 0.0f, 0.0f, 5), eaoVar, a4xVar, new qw3(6.0f, true, new jf4((byte) 14)), xdrVar, function1, function2, cy2.s, fetVar, (i4 & 3670016) | i3 | (57344 & i4) | (458752 & i4));
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yt20(mm40Var2, eaoVar, a4xVar, xdrVar, function1, function2, i, (byte) 2);
        }
    }

    public static final void i(mm40 mm40Var, q2a0 q2a0Var, fet fetVar, int i) {
        fetVar.g0(1330718358);
        int i2 = i | 6 | (fetVar.g(q2a0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 210.0f);
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
            j0x.b(a8k0.F(R.drawable.cs2circle, 0, fetVar), null, o7k0.n(jm40Var, 140.0f), null, gqw0.h1, 0.0f, null, fetVar, 24632, 104);
            int i3 = (i2 >> 3) & 14;
            k(q2a0Var, fetVar, i3);
            j(q2a0Var, fetVar, i3);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(mm40Var, q2a0Var, i, (byte) 19);
        }
    }

    public static final void j(q2a0 q2a0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-808580536);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(q2a0Var) : fetVar.i(q2a0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40.b, 294.0f), 180.0f);
            boolean z = (i2 & 14) == 4 || ((i2 & 8) != 0 && fetVar.i(q2a0Var));
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new a2a0(q2a0Var, b);
                fetVar.o0(objP);
            }
            zq8.a(0, fetVar, rq8.L(mm40VarE, (Function1) objP));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b2a0(q2a0Var, i, b);
        }
    }

    public static final void k(q2a0 q2a0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1413071723);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(q2a0Var) : fetVar.i(q2a0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        boolean z = true;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(jm40.b, 140.0f);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !fetVar.i(q2a0Var))) {
                z = false;
            }
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new a2a0(q2a0Var, b);
                fetVar.o0(objP);
            }
            zq8.a(0, fetVar, rq8.L(mm40VarN, (Function1) objP));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new b2a0(q2a0Var, i, b);
        }
    }

    public static final void l(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        mm40 mm40Var2;
        a4xVar.getClass();
        fetVar.g0(2124831664);
        byte b = 16;
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar = qmk.j;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            mm40Var2 = jm40.b;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40Var2, backgroundContent, ugg0Var2), 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 1592079437, a4xVar);
            int i3 = 0;
            while (itO.hasNext()) {
                Object next = itO.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                zcl zclVar2 = qmk.f28987a;
                cww.j(s5x0.N(mm40Var2, 0.0f, 0.0f, 0.0f, 4.0f, 7), (lob0) next, fetVar, 0);
                if (i3 != a4xVar.size() - 1) {
                    fetVar.e0(260900209);
                    mbc.o(zfi0.f44303a, s5x0.L(mm40Var2, 0.0f, 8.0f, 1), false, fetVar, 6, 4);
                    fetVar.r(false);
                } else {
                    fetVar.e0(261014041);
                    fetVar.r(false);
                }
                i3 = i4;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var2, a4xVar, i, b);
        }
    }

    public static final void m(mm40 mm40Var, fic0 fic0Var, fet fetVar, int i) throws Throwable {
        mm40 mm40Var2;
        fetVar.g0(196311716);
        int i2 = i | 6 | (fetVar.g(fic0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var2);
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
            String str = fic0Var.f9581a;
            a4x a4xVar = fic0Var.b;
            Throwable th = null;
            a(0, fetVar, null, str);
            fetVar.e0(-787555651);
            int i3 = 0;
            for (Object obj : a4xVar) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    Throwable th2 = th;
                    q3d.p();
                    throw th2;
                }
                gic0 gic0Var = (gic0) obj;
                obc.q(null, new rqm((vui0) new rui0(gic0Var.b, null, gic0Var.f11339a, null, 58), (pui0) null, (pvi0) null, (d4d) null, (tvi0) null, i3 == a4xVar.size() - 1 ? wui0.d : wui0.c, false, (e900) null, 446), false, null, null, null, null, null, fetVar, 0, 253);
                i3 = i4;
                a4xVar = a4xVar;
                th = th;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(mm40Var2, fic0Var, i, (byte) 21);
        }
    }

    public static final void n(final mm40 mm40Var, final int i, final mbh0 mbh0Var, rah0 rah0Var, boolean z, final ugd ugdVar, final ugd ugdVar2, fet fetVar, final int i2) {
        int i3;
        ugd ugdVar3;
        ugd ugdVar4;
        mm40 mm40Var2;
        mbh0 mbh0Var2;
        final rah0 rah0Var2;
        final boolean z2;
        yfe0 yfe0VarU;
        Function2 function2;
        rah0 rah0VarT;
        int i4;
        pz40 pz40Var;
        fetVar.g0(1705324960);
        if ((i2 & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= fetVar.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= fetVar.g(mbh0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i2) == 0) {
            ugdVar3 = ugdVar;
            i3 |= fetVar.i(ugdVar3) ? 131072 : 65536;
        } else {
            ugdVar3 = ugdVar;
        }
        if ((1572864 & i2) == 0) {
            ugdVar4 = ugdVar2;
            i3 |= fetVar.i(ugdVar4) ? 1048576 : 524288;
        } else {
            ugdVar4 = ugdVar2;
        }
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            fetVar.Z();
            if ((i2 & 1) == 0 || fetVar.B()) {
                rah0VarT = wha0.T(fetVar);
                i4 = i3 & (-64513);
                z2 = fetVar.k(bmd.n) == k6z.b;
            } else {
                fetVar.X();
                i4 = i3 & (-64513);
                rah0VarT = rah0Var;
                z2 = z;
            }
            fetVar.s();
            if (i < 0) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b = 0;
                final ugd ugdVar5 = ugdVar3;
                final ugd ugdVar6 = ugdVar4;
                final rah0 rah0Var3 = rah0VarT;
                function2 = new Function2() { // from class: a.obh0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        byte b2 = b;
                        int i5 = i2;
                        switch (b2) {
                            case 0:
                                ((Integer) obj2).getClass();
                                xww.n(mm40Var, i, mbh0Var, rah0Var3, z2, ugdVar5, ugdVar6, (fet) obj, x8x.L(i5 | 1));
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                xww.n(mm40Var, i, mbh0Var, rah0Var3, z2, ugdVar5, ugdVar6, (fet) obj, x8x.L(i5 | 1));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                mm40Var2 = mm40Var;
                rah0 rah0Var4 = rah0VarT;
                mbh0Var2 = mbh0Var;
                Object objP = fetVar.P();
                Object obj = ukd.f35823a;
                if (objP == obj) {
                    objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                    fetVar.o0(objP);
                }
                vne vneVar = (vne) objP;
                boolean zG = fetVar.g(rah0Var4) | fetVar.g(vneVar);
                Object objP2 = fetVar.P();
                if (zG || objP2 == obj) {
                    objP2 = new yrx(rah0Var4, vneVar, z2);
                    fetVar.o0(objP2);
                }
                Object obj2 = (yrx) objP2;
                w6k w6kVar = (w6k) fetVar.k(bmd.h);
                Object objP3 = fetVar.P();
                if (objP3 == obj) {
                    objP3 = Integer.valueOf(w6kVar.T(mbh0Var2.f21509a));
                    fetVar.o0(objP3);
                }
                final int iIntValue = ((Number) objP3).intValue();
                boolean zD = fetVar.d(mbh0Var2.c) | fetVar.g(w6kVar);
                Object objP4 = fetVar.P();
                if (zD || objP4 == obj) {
                    objP4 = Integer.valueOf(w6kVar.T(mbh0Var2.c));
                    fetVar.o0(objP4);
                }
                final int iIntValue2 = ((Number) objP4).intValue();
                Object objP5 = fetVar.P();
                if (objP5 == obj) {
                    objP5 = Integer.valueOf(w6kVar.T(mbh0Var2.d));
                    fetVar.o0(objP5);
                }
                final int iIntValue3 = ((Number) objP5).intValue();
                pz40 pz40VarZ = v3c.Z(iun.f15405a, new Object[0], fetVar);
                Object objF = androidx.compose.runtime.e.f(Integer.valueOf(i), fetVar);
                Unit unit = Unit.f46060a;
                boolean zG2 = fetVar.g(pz40VarZ) | fetVar.g(objF) | fetVar.i(obj2) | fetVar.g(w6kVar);
                Object objP6 = fetVar.P();
                if (zG2 || objP6 == obj) {
                    objP6 = new wmq((Object) pz40VarZ, objF, obj2, (Object) w6kVar, (yje) null, (byte) 24);
                    pz40Var = pz40VarZ;
                    fetVar.o0(objP6);
                } else {
                    pz40Var = pz40VarZ;
                }
                m0x0.t(fetVar, unit, (Function2) objP6);
                mm40 mm40VarE = pai0.a(wha0.P(jm40.b, rah0Var4, z2, 6), false, new eoh0((byte) 15)).e(mm40Var2);
                boolean z3 = (i4 & 896) == 256;
                Object objP7 = fetVar.P();
                if (z3 || objP7 == obj) {
                    objP7 = new gwg0((Object) mbh0Var2, (byte) 7);
                    fetVar.o0(objP7);
                }
                mm40 mm40VarK = rq8.K(mm40VarE, (Function1) objP7);
                boolean zE = fetVar.e(iIntValue2) | ((3670016 & i4) == 1048576) | fetVar.h(z2) | fetVar.g(pz40Var) | ((458752 & i4) == 131072) | ((i4 & 112) == 32);
                Object objP8 = fetVar.P();
                if (zE || objP8 == obj) {
                    final pz40 pz40Var2 = pz40Var;
                    Object obj3 = new Function2() { // from class: a.qbh0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            int i5;
                            int i6;
                            c5n0 c5n0Var = (c5n0) obj4;
                            p4e p4eVar = (p4e) obj5;
                            c5n0Var.getClass();
                            List listK = c5n0Var.k(vbh0.f37141a, ugdVar2);
                            Iterator it = listK.iterator();
                            if (!it.hasNext()) {
                                itt0.a();
                                return null;
                            }
                            int iB = ((pj30) it.next()).b(Integer.MAX_VALUE);
                            loop0: while (true) {
                                i5 = iB;
                                do {
                                    if (!it.hasNext()) {
                                        break loop0;
                                    }
                                    iB = ((pj30) it.next()).b(Integer.MAX_VALUE);
                                } while (i5 >= iB);
                            }
                            long jB = p4e.b(p4eVar.f26347a, 0, 0, i5, i5, 2);
                            ArrayList arrayList = new ArrayList(listK.size());
                            int size = listK.size();
                            for (int iE = 0; iE < size; iE = w6x.e((pj30) listK.get(iE), jB, arrayList, iE, 1)) {
                            }
                            Iterator it2 = arrayList.iterator();
                            int i7 = 0;
                            while (it2.hasNext()) {
                                i7 += ((pu90) it2.next()).f27604a;
                            }
                            int size2 = arrayList.size() - 1;
                            int i8 = iIntValue;
                            int i9 = (size2 * i8) + i7;
                            int i10 = iIntValue2;
                            int i11 = i9 + i10 + iIntValue3;
                            boolean z4 = z2;
                            if (z4) {
                                i10 = i11 - i10;
                            }
                            ArrayList arrayList2 = new ArrayList(arrayList.size());
                            int size3 = arrayList.size();
                            int iC = 0;
                            while (iC < size3) {
                                pu90 pu90Var = (pu90) arrayList.get(iC);
                                if (z4) {
                                    i10 -= pu90Var.f27604a;
                                    i6 = i10 - i8;
                                } else {
                                    i6 = pu90Var.f27604a + i8 + i10;
                                }
                                iC = w6x.c(i10, iC, 1, arrayList2);
                                i10 = i6;
                            }
                            ArrayList arrayList3 = new ArrayList(arrayList.size());
                            int size4 = arrayList.size();
                            for (int i12 = 0; i12 < size4; i12++) {
                                arrayList3.add(new ovx(c5n0Var.r0(((Number) arrayList2.get(i12)).intValue()), c5n0Var.r0(((pu90) arrayList.get(i12)).f27604a)));
                            }
                            pz40 pz40Var3 = pz40Var2;
                            if (!Intrinsics.d(pz40Var3.getValue(), arrayList3)) {
                                pz40Var3.setValue(arrayList3);
                            }
                            List listK2 = c5n0Var.k(vbh0.b, new ugd(-2060478174, true, new sbh0(ugdVar, i, pz40Var3, (byte) 0)));
                            ArrayList arrayList4 = new ArrayList(listK2.size());
                            int size5 = listK2.size();
                            int iE2 = 0;
                            while (iE2 < size5) {
                                pj30 pj30Var = (pj30) listK2.get(iE2);
                                if (!((i11 >= 0) & (i5 >= 0))) {
                                    zcx.a("width and height must be >= 0");
                                }
                                iE2 = w6x.e(pj30Var, r4e.h(i11, i11, i5, i5), arrayList4, iE2, 1);
                            }
                            return vj30.x(c5n0Var, i11, i5, new t13((Object) arrayList, (Object) arrayList4, z4, (Object) arrayList2, (byte) 20));
                        }
                    };
                    fetVar.o0(obj3);
                    objP8 = obj3;
                }
                x4n0.a(mm40VarK, (Function2) objP8, fetVar, 0, 0);
                rah0Var2 = rah0Var4;
            }
            yfe0VarU.d = function2;
        }
        mm40Var2 = mm40Var;
        mbh0Var2 = mbh0Var;
        fetVar.X();
        rah0Var2 = rah0Var;
        z2 = z;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b2 = 1;
            final mm40 mm40Var3 = mm40Var2;
            final mbh0 mbh0Var3 = mbh0Var2;
            function2 = new Function2() { // from class: a.obh0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    byte b3 = b2;
                    int i5 = i2;
                    switch (b3) {
                        case 0:
                            ((Integer) obj5).getClass();
                            xww.n(mm40Var3, i, mbh0Var3, rah0Var2, z2, ugdVar, ugdVar2, (fet) obj4, x8x.L(i5 | 1));
                            break;
                        default:
                            ((Integer) obj5).getClass();
                            xww.n(mm40Var3, i, mbh0Var3, rah0Var2, z2, ugdVar, ugdVar2, (fet) obj4, x8x.L(i5 | 1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void o(mm40 mm40Var, f0k0 f0k0Var, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(1529230017);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(f0k0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            b34.h(f0k0Var != null, mm40Var, kzn.d(null, 0.0f, 3), kzn.e(null, 3), null, u1c.M(1522868969, new in80(f0k0Var, function1, (byte) 27), fetVar), fetVar, ((i2 << 3) & 112) | 200064, 16);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0(mm40Var, (Object) f0k0Var, function1, i, (byte) 21);
        }
    }

    public static final void p(mm40 mm40Var, boolean z, xdr xdrVar, xdr xdrVar2, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        ugd ugdVar4;
        ugd ugdVar5;
        boolean z2;
        boolean z3;
        int i2;
        Object xtl0Var;
        boolean z4;
        pz40 pz40Var;
        float f;
        float f2;
        pz40 pz40Var2;
        float f3;
        mw3 mw3Var;
        xx7 xx7Var;
        Integer num;
        boolean z5;
        xx7 xx7Var2;
        xdr xdrVar3 = xdrVar;
        xdr xdrVar4 = xdrVar2;
        mw3 mw3Var2 = uc9.c;
        fetVar.g0(314006101);
        int i3 = i | (fetVar.g(mm40Var) ? 4 : 2) | 16 | (fetVar.i(xdrVar3) ? 256 : 128) | (fetVar.i(xdrVar4) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                z3 = fetVar.k(bmd.n) == k6z.b;
                i2 = i3 & (-113);
            } else {
                fetVar.X();
                i2 = i3 & (-113);
                z3 = z;
            }
            fetVar.s();
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                zcl zclVar = qmk.f28987a;
                objP = twn.j(2.0f, fetVar);
            }
            float f4 = ((ycl) objP).f42389a;
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                zcl zclVar2 = qmk.f28987a;
                objP2 = twn.j(8.0f, fetVar);
            }
            float f5 = ((ycl) objP2).f42389a;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                zcl zclVar3 = qmk.f28987a;
                objP3 = twn.j(14.0f, fetVar);
            }
            float f6 = ((ycl) objP3).f42389a;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                zcl zclVar4 = qmk.f28987a;
                objP4 = twn.j(32.0f, fetVar);
            }
            float f7 = ((ycl) objP4).f42389a;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = gqw0.n;
                fetVar.o0(objP5);
            }
            xx7 xx7Var3 = (xx7) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == obj) {
                fetVar.o0(mw3Var2);
                objP6 = mw3Var2;
            }
            sw3 sw3Var = (sw3) objP6;
            long separator60 = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60();
            pz40 pz40VarZ = v3c.Z(null, new Object[0], fetVar);
            zcl zclVar5 = qmk.f28987a;
            pz40 pz40VarZ2 = v3c.Z(new ycl(90.0f), new Object[0], fetVar);
            Object[] objArr = new Object[0];
            boolean zG = ((i2 & 7168) == 2048) | ((i2 & 896) == 256) | fetVar.g(pz40VarZ) | fetVar.h(z3) | fetVar.f(separator60);
            Object objP7 = fetVar.P();
            if (zG || objP7 == obj) {
                z4 = z3;
                pz40Var = pz40VarZ;
                f = f7;
                f2 = f5;
                pz40Var2 = pz40VarZ2;
                xdrVar4 = xdrVar2;
                xtl0Var = new xtl0(xdrVar, xdrVar4, pz40Var, f, z4, separator60, (byte) 0);
                fetVar.o0(xtl0Var);
            } else {
                pz40Var2 = pz40VarZ2;
                xdrVar4 = xdrVar2;
                xtl0Var = objP7;
                z4 = z3;
                pz40Var = pz40VarZ;
                f = f7;
                f2 = f5;
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) xtl0Var, fetVar);
            boolean zG2 = fetVar.g(pz40Var) | fetVar.g(pz40Var2);
            Object objP8 = fetVar.P();
            if (zG2 || objP8 == obj) {
                objP8 = new wtl0(f6, pz40Var, pz40Var2, (byte) 2);
                fetVar.o0(objP8);
            }
            tj30 tj30Var = (tj30) objP8;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z6 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z6) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30Var, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(s5x0.N(mrv.k0(jm40Var, "INNING_CONTENT_ID"), 0.0f, 30.0f, f2, 0.0f, 9), f6);
            x5d x5dVarA = w5d.a(new qw3(17.0f, true, new jf4((byte) 14)), xx7Var3, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
            fetVar.i0();
            z2 = z4;
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            y5d y5dVar = y5d.f42040a;
            ugdVar.F(y5dVar, fetVar, 54);
            fetVar.r(true);
            if (xdrVar4 == null) {
                fetVar.e0(-1411830492);
                z5 = false;
                fetVar.r(false);
                xx7Var = xx7Var3;
                mw3Var = mw3Var2;
                f3 = f4;
                num = 6;
            } else {
                fetVar.e0(-1411830491);
                f3 = r22;
                mm40 mm40VarS2 = o7k0.s(s5x0.N(mrv.k0(jm40Var, "POINTS_CONTENT_ID"), 0.0f, 0.0f, f3, 0.0f, 11), f);
                mw3Var = mw3Var2;
                x5d x5dVarA2 = w5d.a(mw3Var, xx7Var3, fetVar, 48);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarS2);
                fetVar.i0();
                xx7Var = xx7Var3;
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar);
                jpm0.o(fetVar, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar4);
                num = r14;
                xdrVar4.F(y5dVar, fetVar, num);
                fetVar.r(true);
                z5 = false;
                fetVar.r(false);
            }
            if (xdrVar == null) {
                fetVar.e0(-1411423834);
                fetVar.r(z5);
                xdrVar3 = xdrVar;
                xx7Var2 = xx7Var;
            } else {
                fetVar.e0(-1411423833);
                mm40 mm40VarS3 = o7k0.s(s5x0.N(mrv.k0(jm40Var, "GAME_CONTENT_ID"), 0.0f, 0.0f, f3, 0.0f, 11), f);
                xx7Var2 = xx7Var;
                x5d x5dVarA3 = w5d.a(mw3Var, xx7Var2, fetVar, 48);
                int iHashCode4 = Long.hashCode(fetVar.T);
                bh90 bh90VarM4 = fetVar.m();
                mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarS3);
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA3, shdVar);
                jpm0.o(fetVar, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC3, shdVar4);
                xdrVar3 = xdrVar;
                xdrVar3.F(y5dVar, fetVar, num);
                fetVar.r(true);
                fetVar.r(false);
            }
            ugdVar4 = ugdVar2;
            ugdVar4.F(s5x0.N(mrv.k0(jm40Var, "PERIOD_CONTENT_ID"), 0.0f, 0.0f, 4.0f, 0.0f, 11), fetVar, 48);
            mm40 mm40Var2 = (mm40) l7m0VarY.getValue();
            x5d x5dVarA4 = w5d.a(sw3Var, xx7Var2, fetVar, 54);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40Var2);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA4, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            ugdVar5 = ugdVar3;
            ugdVar5.F(y5dVar, fetVar, 54);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            ugdVar4 = ugdVar2;
            ugdVar5 = ugdVar3;
            fetVar.X();
            z2 = z;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aul0(mm40Var, z2, xdrVar3, xdrVar4, ugdVar, ugdVar4, ugdVar5, i, (byte) 0);
        }
    }

    public static void q(Set set, List list, Function2 function2, Function1 function1) {
        set.getClass();
        list.getClass();
        if (set.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            long jLongValue = ((Number) obj).longValue();
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Boolean) function2.invoke(Long.valueOf(jLongValue), it.next())).booleanValue()) {
                        arrayList.add(obj);
                        break;
                    }
                }
            }
        }
        function1.invoke(CollectionsKt.P0(arrayList));
    }

    public static final void r(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((fz60) yfu0Var).b.setEnabled(((i1b) cpVar.u()).b);
        ((fz60) yfu0Var).c.setEnabled(((i1b) cpVar.u()).b);
    }

    public static final void s(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((fz60) yfu0Var).b.setChecked(((i1b) cpVar.u()).c);
        fz60 fz60Var = (fz60) yfu0Var;
        fz60Var.c.setBackground(epv0.U(fz60Var.b.isChecked() ? R.color.static_transparent : R.color.static_black_60, cpVar.f40887a.getContext()));
    }

    public static final void t(cp cpVar) {
        pn40 pn40Var = pn40.f27267a;
        String strQ = w6x.q(cpVar.f40887a.getContext().getString(R.string.win_to), " X", pn40.c(wvb.O(((i1b) cpVar.u()).h), p3u0.c));
        TextView textView = ((fz60) cpVar.u).i;
        textView.setText(strQ);
        textView.setVisibility(wvb.O(((i1b) cpVar.u()).h) > 1.0d ? 0 : 8);
    }

    public static final void u(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        View view = cpVar.f40887a;
        ((fz60) yfu0Var).l.setVisibility(((i1b) cpVar.u()).f ? 0 : 8);
        TextView textView = ((fz60) yfu0Var).l;
        Drawable drawableU = epv0.U(R.drawable.bg_rounded_corners_8dp, view.getContext());
        TypedValue typedValue = j5d.f15927a;
        Context context = view.getContext();
        context.getClass();
        int color = context.getColor(R.color.card_war_bet_control_color);
        b4d b4dVar = b4d.f1952a;
        vcc.b0(drawableU, color);
        textView.setBackground(drawableU);
    }

    public static final void v(cp cpVar) {
        String str = ((i1b) cpVar.u()).e.f5303a;
        String str2 = ((i1b) cpVar.u()).e.b;
        MeasuredImageView measuredImageView = ((fz60) cpVar.u).h;
        str.getClass();
        str2.getClass();
        List list = u0d.f34849a;
        u0d.j(measuredImageView, str, R.drawable.ic_games_placeholder, 0, q3d.j(g2x.f10583a, new j2x(4)), null, new jl40((Object) str2, (Object) str, (Object) measuredImageView, (byte) 16), 236);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00fe  */
    public static final void w(cp cpVar) {
        View view = cpVar.f40887a;
        yfu0 yfu0Var = cpVar.u;
        Drawable drawableU = epv0.U(R.drawable.bg_rounded_corners_8dp, view.getContext());
        int iOrdinal = ((i1b) cpVar.u()).g.ordinal();
        if (iOrdinal == 0) {
            ((fz60) yfu0Var).f.setVisibility(8);
        } else if (iOrdinal == 1) {
            fz60 fz60Var = (fz60) yfu0Var;
            fz60Var.f.setVisibility(0);
            TypedValue typedValue = j5d.f15927a;
            Context context = view.getContext();
            context.getClass();
            int color = context.getColor(R.color.static_green);
            b4d b4dVar = b4d.f1952a;
            vcc.b0(drawableU, color);
            fz60Var.e.setBackground(drawableU);
            fz60Var.k.setText(view.getContext().getString(R.string.new_games_tag));
        } else if (iOrdinal == 2) {
            fz60 fz60Var2 = (fz60) yfu0Var;
            fz60Var2.f.setVisibility(0);
            TypedValue typedValue2 = j5d.f15927a;
            Context context2 = view.getContext();
            context2.getClass();
            int color2 = context2.getColor(R.color.static_violet);
            b4d b4dVar2 = b4d.f1952a;
            vcc.b0(drawableU, color2);
            fz60Var2.e.setBackground(drawableU);
            fz60Var2.k.setText(view.getContext().getString(R.string.free_games_tag));
        } else if (iOrdinal == 3) {
            fz60 fz60Var3 = (fz60) yfu0Var;
            fz60Var3.f.setVisibility(0);
            TypedValue typedValue3 = j5d.f15927a;
            Context context3 = view.getContext();
            context3.getClass();
            int color3 = context3.getColor(R.color.static_yellow);
            b4d b4dVar3 = b4d.f1952a;
            vcc.b0(drawableU, color3);
            fz60Var3.e.setBackground(drawableU);
            fz60Var3.k.setText(view.getContext().getString(R.string.best_games_tag));
        } else if (iOrdinal == 4) {
            ((fz60) yfu0Var).f.setVisibility(8);
        } else {
            if (iOrdinal != 5) {
                t9f.b();
                return;
            }
            fz60 fz60Var4 = (fz60) yfu0Var;
            fz60Var4.f.setVisibility(0);
            TypedValue typedValue4 = j5d.f15927a;
            Context context4 = view.getContext();
            context4.getClass();
            int color4 = context4.getColor(R.color.static_red);
            b4d b4dVar4 = b4d.f1952a;
            vcc.b0(drawableU, color4);
            fz60Var4.e.setBackground(drawableU);
            fz60Var4.k.setText(view.getContext().getString(R.string.special_games_tag));
        }
        ((fz60) yfu0Var).k.setBackground(drawableU);
    }

    public static final w03 x(float f, float f2, float f3, List list, Function1 function1) {
        w03 w03VarA = z03.a();
        int size = list.size();
        if (size < 1) {
            size = 1;
        }
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            o2a0 o2a0Var = (o2a0) obj;
            float fFloatValue = ((Number) function1.invoke(o2a0Var)).floatValue();
            float f4 = o2a0Var.g;
            boolean z = o2a0Var.h;
            float fC = 0.0f;
            if (f4 > 0.0f) {
                fC = l1e0.c(fFloatValue / f4, 0.0f, 1.0f);
                if (z) {
                    fC = 1.0f - fC;
                }
            }
            float f5 = fC * f3;
            double d = (((i / size) * 360.0f) - 90.0f) * 0.017453292f;
            float fCos = (((float) Math.cos(d)) * f5) + f;
            float fSin = (((float) Math.sin(d)) * f5) + f2;
            if (i == 0) {
                w03VarA.f(fCos, fSin);
            } else {
                w03VarA.e(fCos, fSin);
            }
            i = i2;
        }
        w03VarA.c();
        return w03VarA;
    }

    public static int y(int i, int i2) {
        int i3 = i - i2;
        if (i3 <= i2) {
            i3 = i2;
            i2 = i3;
        }
        int i4 = 1;
        int i5 = 1;
        while (i > i3) {
            i4 *= i;
            if (i5 <= i2) {
                i4 /= i5;
                i5++;
            }
            i--;
        }
        while (i5 <= i2) {
            i4 /= i5;
            i5++;
        }
        return i4;
    }

    public static final void z(dpi0 dpi0Var, String str, long j) {
        h83 h83Var = new h83();
        str.getClass();
        long j2 = y3d.g;
        long j3 = daq0.c;
        smk0 smk0Var = new smk0(j, j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0.b, null, null, 17424);
        h83Var.c(str);
        ((h83) dpi0Var.f6468a).b(kng0.c(h83Var.f12607a, h83Var, smk0Var, 0));
    }

    public abstract HistoryMenuItem C();

    public abstract int G();
}
