package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public final class piz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27062a;
    public final SideSheetBehavior b;

    public /* synthetic */ piz(SideSheetBehavior sideSheetBehavior, byte b) {
        this.f27062a = b;
        this.b = sideSheetBehavior;
    }

    public static void A(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static final boolean B(Set set, androidx.fragment.app.e eVar) {
        set.getClass();
        eVar.getClass();
        for (Fragment fragment : eVar.c.p()) {
            if (fragment != null && fragment.Q()) {
                if (fragment instanceof e1j) {
                    List<i0h0> listP = fragment.C().c.p();
                    listP.getClass();
                    if (listP.isEmpty()) {
                        return true;
                    }
                    for (i0h0 i0h0Var : listP) {
                        if ((i0h0Var instanceof d1j) && set.contains(((d1j) i0h0Var).getK1())) {
                            return false;
                        }
                    }
                    return true;
                }
                List listP2 = fragment.C().c.p();
                listP2.getClass();
                if (listP2.isEmpty()) {
                    continue;
                } else {
                    androidx.fragment.app.e eVarC = fragment.C();
                    eVarC.getClass();
                    if (B(set, eVarC)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final yzm E(String str, List list) {
        StringBuilder sb = new StringBuilder(ujn.h);
        String str2 = (String) CollectionsKt.firstOrNull(list);
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            sb.setLength(0);
        } else if (StringsKt.O(str2, ujn.h, false) || kotlin.text.c.x(str2, "https://", false)) {
            sb.setLength(0);
            sb.append(str2);
        } else {
            if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                sb.append('/');
            }
            sb.append(StringsKt.y0(str2, '/'));
        }
        return new yzm(str, new c280(sb.toString(), R.drawable.no_photo_new));
    }

    public static final String H(long j) {
        return String.format(Locale.ENGLISH, "%02d", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
    }

    public static final Map I(edy edyVar, String str) {
        try {
            Object obj = edyVar.get(str);
            edy edyVar2 = obj instanceof edy ? (edy) obj : null;
            if (edyVar2 == null) {
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                return lunVar;
            }
            Map map = edyVar2.f7643a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(wp20.a(map.size()));
            for (Object obj2 : map.entrySet()) {
                Object key = ((Map.Entry) obj2).getKey();
                String str2 = "";
                try {
                    jdy jdyVarJ = ncy.j((mcy) ((Map.Entry) obj2).getValue());
                    String strB = jdyVarJ instanceof bdy ? null : jdyVarJ.b();
                    if (strB != null) {
                        str2 = strB;
                    }
                } catch (Exception unused) {
                }
                linkedHashMap.put(key, str2);
            }
            return linkedHashMap;
        } catch (Exception e) {
            e.printStackTrace();
            lun lunVar2 = lun.f20680a;
            lunVar2.getClass();
            return lunVar2;
        }
    }

    public static boolean J(edy edyVar, String str) {
        edyVar.getClass();
        return ((Boolean) M(str, new String[0], false, new wdy(edyVar, (byte) 2))).booleanValue();
    }

    public static int K(edy edyVar, String str) {
        edyVar.getClass();
        return ((Number) M(str, new String[0], 0, new wdy(edyVar, (byte) 1))).intValue();
    }

    public static String L(edy edyVar, String str) {
        edyVar.getClass();
        return (String) M(str, new String[0], "", new wdy(edyVar, (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006b A[RETURN] */
    public static final Object M(String str, String[] strArr, Object obj, Function1 function1) {
        try {
            if (strArr.length == 0) {
                Object objInvoke = function1.invoke(str);
                if (objInvoke != null) {
                    return objInvoke;
                }
            } else {
                Object[] objArrQ = qx3.q(str, strArr);
                if (objArrQ.length != 0) {
                    Object objNewInstance = Array.newInstance(objArrQ.getClass().getComponentType(), objArrQ.length);
                    objNewInstance.getClass();
                    Object[] objArr = (Object[]) objNewInstance;
                    int length = objArrQ.length - 1;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            objArr[length - i] = objArrQ[i];
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                    objArrQ = objArr;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : objArrQ) {
                    Object objInvoke2 = function1.invoke((String) obj2);
                    if (objInvoke2 != null) {
                        arrayList.add(objInvoke2);
                    }
                }
                for (Object obj3 : arrayList) {
                    if (!Intrinsics.d(obj3, obj)) {
                        if (obj3 == null) {
                            return obj3;
                        }
                    }
                }
                obj3 = null;
                if (obj3 == null) {
                    return obj3;
                }
            }
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return obj;
        }
    }

    public static final ise0 N(gmq gmqVar, sje sjeVar, o6m0 o6m0Var) {
        g090 g090Var = new g090();
        g090Var.f10448a = o6m0Var;
        g090Var.b = roj0.b(0, 2, null, 5);
        return new ise0(vtb.h0(gmqVar, sjeVar, g090Var, null), g090Var);
    }

    public static ise0 O(fnq fnqVar, sje sjeVar) {
        return N(fnqVar, sjeVar, new o6m0(Long.MAX_VALUE));
    }

    public static final bch0 P(Function1 function1, fet fetVar) {
        pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            ywj ywjVar = new ywj(new ryc0(pz40VarF, (byte) 12));
            fetVar.o0(ywjVar);
            objP = ywjVar;
        }
        return (bch0) objP;
    }

    public static final String Q(String str) {
        List listT0;
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{" & "}, false, 0, 6, null);
        if (listSplit$default.size() != 2) {
            listSplit$default = null;
        }
        return (listSplit$default == null || (listT0 = CollectionsKt.t0(listSplit$default)) == null) ? str : CollectionsKt.b0(listT0, " & ", null, null, null, 62);
    }

    public static final mm40 R(mm40 mm40Var, long j, float f) {
        mm40Var.getClass();
        return mm40Var.e(rq8.L(jm40.b, new wwk(f, j, (byte) 3)));
    }

    public static final j83 S(String str, String str2, boolean z, boolean z2) {
        String strI;
        h83 h83Var = new h83();
        boolean z3 = cy7.c() && z2;
        if (str2 == null && z3) {
            strI = Q(str);
        } else if (str2 == null) {
            strI = str;
        } else {
            strI = z3 ? ua80.i("(ov ", str2, Separators.RPAREN, Q(str)) : kng0.m(str, Separators.LPAREN, str2, " ov)");
        }
        long jZ = wzb.Z(z, StaticColors.INSTANCE.m123getWhite0d7_KjU());
        strI.getClass();
        h83 h83Var2 = new h83();
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(jZ, j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var2.c(strI);
        StringBuilder sb = h83Var2.f12607a;
        h83Var2.a(smk0Var, 0, sb.length());
        sb.length();
        h83Var.b(h83Var2.h());
        return h83Var.h();
    }

    public static final j83 T(String str, boolean z) {
        h83 h83Var = new h83();
        long jZ = wzb.Z(z, StaticColors.INSTANCE.m123getWhite0d7_KjU());
        str.getClass();
        h83 h83Var2 = new h83();
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(jZ, j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var2.c(str);
        StringBuilder sb = h83Var2.f12607a;
        h83Var2.a(smk0Var, 0, sb.length());
        sb.length();
        h83Var.b(h83Var2.h());
        return h83Var.h();
    }

    public static final jzy U(llr llrVar, List list, int i) {
        Object next;
        Object next2;
        llrVar.getClass();
        String str = llrVar.g;
        String str2 = llrVar.f;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((ufp0) next).f35586a, str2));
        ufp0 ufp0Var = (ufp0) next;
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!Intrinsics.d(((ufp0) next2).f35586a, str));
        ufp0 ufp0Var2 = (ufp0) next2;
        Integer num = llrVar.f20262a;
        int iIntValue = num != null ? num.intValue() : 0;
        String str3 = llrVar.b;
        String str4 = str3 == null ? "" : str3;
        Object obj = llrVar.c;
        if (obj == null && (obj = llrVar.h) == null) {
            obj = "0";
        }
        String string = obj.toString();
        Object obj2 = llrVar.d;
        String string2 = ((obj2 == null && (obj2 = llrVar.i) == null) ? "0" : obj2).toString();
        String str5 = str2 == null ? "" : str2;
        String str6 = str == null ? "" : str;
        String str7 = ufp0Var != null ? ufp0Var.b : null;
        String str8 = str7 == null ? "" : str7;
        String str9 = ufp0Var2 != null ? ufp0Var2.b : null;
        String str10 = str9 == null ? "" : str9;
        String str11 = ufp0Var != null ? ufp0Var.d : null;
        if (str11 == null) {
            str11 = "";
        }
        String strT = vsm0.t(str11);
        String str12 = ufp0Var2 != null ? ufp0Var2.d : null;
        String strT2 = vsm0.t(str12 != null ? str12 : "");
        Integer num2 = llrVar.j;
        int iIntValue2 = num2 != null ? num2.intValue() : -1;
        Long l = llrVar.k;
        long jLongValue = l != null ? l.longValue() : 0L;
        pek pekVar = lho.b;
        Integer num3 = llrVar.e;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        pekVar.getClass();
        lho lhoVarG = pek.g(iIntValue3);
        cys0 cys0VarV = wvb.V(i, tx3.z(new ufp0[]{ufp0Var, ufp0Var2}));
        List list2 = ufp0Var != null ? ufp0Var.e : null;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        List list3 = list2;
        List list4 = ufp0Var2 != null ? ufp0Var2.e : null;
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        return new jzy(iIntValue, iIntValue2, jLongValue, lhoVarG, cys0VarV, str4, string, string2, str5, str6, str8, str10, strT, strT2, list3, list4);
    }

    public static final cc V(r040 r040Var, ctf0 ctf0Var, String str, boolean z, qho qhoVar) {
        ctf0Var.getClass();
        qhoVar.getClass();
        switch (r040Var) {
            case SPORTS:
            case SINGLE_SPORTS:
                return new cc(r040Var, qhoVar.b(R.drawable.ic_glyph_sport), ctf0Var.f(R.string.sport, new Object[0]), z);
            case AGGREGATOR:
            case SINGLE_AGGREGATOR:
                return new cc(r040Var, qhoVar.b(R.drawable.ic_glyph_cards), ctf0Var.f(R.string.casino_chip, new Object[0]), z);
            case GAMES:
            case SINGLE_GAMES:
                return new cc(r040Var, qhoVar.b(R.drawable.ic_glyph_games), str, z);
            case OTHER:
            case SINGLE_OTHER:
                return new cc(r040Var, qhoVar.b(R.drawable.ic_glyph_other), ctf0Var.f(R.string.other_menu, new Object[0]), z);
            case TOP:
            case SINGLE_TOP:
                return new cc(r040Var, qhoVar.b(R.drawable.ic_glyph_top), ctf0Var.f(R.string.top, new Object[0]), z);
            case VIRTUAL:
            case SINGLE_VIRTUAL:
                return new cc(r040Var, qhoVar.b(R.drawable.ic_glyph_virtual), ctf0Var.f(R.string.virtual, new Object[0]), z);
            default:
                t9f.b();
                return null;
        }
    }

    public static final nc90 W(sc90 sc90Var, long j, int i) {
        sc90Var.getClass();
        if (sc90Var.equals(rc90.f30227a)) {
            return new ic90(bww.H(j));
        }
        if (sc90Var.equals(rc90.b)) {
            return new ic90(azw.O(j));
        }
        if (!(sc90Var instanceof qc90)) {
            t9f.b();
            return null;
        }
        if (((qc90) sc90Var).f28475a) {
            String strValueOf = String.valueOf(i + 1);
            strValueOf.getClass();
            return new wb90(strValueOf);
        }
        String strValueOf2 = String.valueOf(i + 1);
        strValueOf2.getClass();
        return new yb90(strValueOf2);
    }

    public static final uob0 X(n3w n3wVar) {
        n3wVar.getClass();
        int iA = n3wVar.g1.a();
        long j = n3wVar.j;
        String str = n3wVar.m1;
        String str2 = n3wVar.f22868a;
        byte b = n3wVar.c.f31736a;
        long j2 = n3wVar.B1;
        boolean z = n3wVar.t;
        uoy uoyVar = n3wVar.D1;
        int iE0 = ieb.e0(n3wVar.l);
        String str3 = n3wVar.g;
        long j3 = n3wVar.E1;
        vf60 vf60Var = new vf60(n3wVar.u, String.valueOf(n3wVar.e), n3wVar.f, n3wVar.o, n3wVar.v);
        mob0 mob0Var = n3wVar.A1;
        return new uob0(iA, j, str, str2, b, j2, z, uoyVar, iE0, str3, j3, vf60Var, new tob0(mob0Var.b, mob0Var.c, mob0Var.f22128a), mob0Var.d, mob0Var.e);
    }

    public static final void a(mm40 mm40Var, fqj0 fqj0Var, fet fetVar, int i) {
        int i2;
        mm40Var.getClass();
        fqj0Var.getClass();
        fetVar.g0(1194513475);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(fqj0Var) ? 32 : 16);
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(o7k0.s(mm40Var, 114.0f), 32.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xxh(mm40Var, fqj0Var, i, b);
        }
    }

    public static final void b(mm40 mm40Var, mdm mdmVar, Function0 function0, fet fetVar, int i) {
        fetVar.g0(994878932);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(mdmVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jcb.l(s5x0.N(mm40Var, 0.0f, 0.0f, 0.0f, knm0.t(1, fetVar, false), 7), mdmVar, false, function0, fetVar, (i2 & 112) | ((i2 << 3) & 7168), 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gg8(mm40Var, mdmVar, function0, i, (byte) 13);
        }
    }

    public static final void c(mm40 mm40Var, pd5 pd5Var, fet fetVar, int i) {
        int i2;
        pd5Var.getClass();
        fetVar.g0(-1389645010);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(pd5Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            xyw xywVar = pd5Var.f26791a;
            if (xywVar instanceof vyw) {
                fetVar.e0(285981283);
                zq8.a(0, fetVar, i120.Q(mm40Var, fbc.d(((vyw) xywVar).f38269a), jd8.n));
                fetVar.r(false);
            } else {
                if (!(xywVar instanceof wyw)) {
                    throw b1j.f(285978184, fetVar, false);
                }
                fetVar.e0(275647437);
                j0x.b(a8k0.F(((wyw) xywVar).f39993a, 0, fetVar), null, mm40Var, null, gqw0.A, 0.0f, null, fetVar, 24632 | ((i2 << 6) & 896), 104);
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dlw(mm40Var, pd5Var, i, b);
        }
    }

    public static final void d(int i, fet fetVar, mm40 mm40Var, Function0 function0) {
        mm40 mm40Var2;
        fetVar.g0(514859403);
        int i2 = i | 6 | (fetVar.i(function0) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarJ = s5x0.J(y860.W(o7k0.n(mm40Var2, 40.0f), null, null, false, null, function0, 28), 8.0f);
            pz40 pz40Var = s6t0.f31722a;
            dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_info_circle, 6, fetVar), fetVar), null, s5x0.J(i120.Q(mm40VarJ, s6t0.b().f33626a.getBackground(), vgg0.f37379a), 4.0f), s6t0.b().f33626a.getPrimary(), fetVar, 56, 0);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lw0(mm40Var2, function0, i, (byte) 8);
        }
    }

    public static final void e(mm40 mm40Var, ygx ygxVar, xdr xdrVar, fet fetVar, int i) {
        int i2;
        xdrVar.getClass();
        fetVar.g0(-257627907);
        byte b = 2;
        byte b2 = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(ygxVar) : fetVar.i(ygxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarQ = i120.Q(o7k0.d(mm40Var, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarI = s5x0.I(mm40VarQ, new lh80(8.0f, 12.0f, 8.0f, ygxVar.e ? 0.0f : 12.0f));
            int i3 = i2 & 112;
            boolean z = ((i2 & 896) == 256) | (i3 == 32 || ((i2 & 64) != 0 && fetVar.i(ygxVar)));
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new vgx(xdrVar, ygxVar, b);
                fetVar.o0(objP);
            }
            yyw.i(mm40VarI, ygxVar, (Function0) objP, u1c.M(908918953, new wgx(ygxVar, b2), fetVar), u1c.M(1583780802, new wgx(ygxVar, (byte) 5), fetVar), u1c.M(-280436029, new wgx(ygxVar, (byte) 6), fetVar), u1c.M(-2144652860, new wgx(ygxVar, (byte) 7), fetVar), fetVar, i3 | 1797120);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xgx(mm40Var, ygxVar, xdrVar, i, (byte) 1);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r6v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v0 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: a.fet
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v4 ??, new type: a.fet
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
    /* JADX WARN: Failed to calculate best type for var: r9v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v12 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r9v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v12 ??, new type: boolean
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
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v12 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void f(a.mm40 r26, a.pz40 r27, kotlin.jvm.functions.Function0 r28, kotlin.jvm.functions.Function0 r29, a.fet r30, int r31) {
        /*
            Method dump skipped, instruction units count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.piz.f(a.mm40, a.pz40, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, a.fet, int):void");
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var) {
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar.g0(893772625);
        int i2 = (i & 6) == 0 ? (fetVar.g(mm40Var) ? 4 : 2) | i : i;
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, qmk.a(fetVar).c, 0.0f, 2);
            byte b2 = 14;
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4(b2)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar4);
            jpm0.o(fetVar, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar, shdVar2, fetVar);
            jpm0.o(fetVar, mm40VarC0, shdVar);
            fetVar.e0(1315372887);
            int i3 = 0;
            while (i3 < 7) {
                zcl zclVar2 = qmk.f28987a;
                thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b2)), gqw0.j, fetVar, 0);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, jm40.b);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                x7z x7zVarI = ohs0.i(fetVar, mm40VarC1, shdVar, 1.0f, true);
                fetVar.e0(2063125639);
                for (int i4 = 0; i4 < 2; i4++) {
                    xww.g(0, fetVar, x7zVarI);
                }
                fetVar.r(false);
                fetVar.r(true);
                i3++;
                b2 = 14;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i, b);
        }
    }

    public static final void h(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1282629343);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(24.0f, true, new jf4((byte) 14));
            lh80 lh80VarU = s5x0.u(0.0f, 24.0f, 0.0f, 32.0f, 5);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new wtf0((byte) 25);
                fetVar.o0(objP);
            }
            b8k0.e(mm40Var, null, lh80VarU, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i2 & 14) | 805306368, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ev90(mm40Var, i, (byte) 20);
        }
    }

    public static final void i(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-302038625);
        if (fetVar.U(i & 1, i != 0)) {
            fqj0 fqj0VarD0 = vbc.d0(null, fetVar, 0, 1);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(o7k0.y(jm40Var, null, 3), xfn.a(fetVar).d, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarP = o7k0.p(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), 168.0f, 16.0f);
            zcl zclVar2 = qmk.m;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), fqj0VarD0));
            fetVar.e0(1813328745);
            int iB = 0;
            while (iB < 4) {
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), 16.0f);
                zcl zclVar4 = qmk.m;
                iB = h97.b(h97.e(zclVar4, zclVar4, zclVar4, zclVar4, mm40VarE), fqj0VarD0, fetVar, 0, iB, 1);
            }
            fetVar2 = fetVar;
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vtf0(i, (byte) 23);
        }
    }

    public static final void j(fa10 fa10Var, Function0 function0, mm40 mm40Var, qge qgeVar, fet fetVar, int i, int i2, int i3) {
        function0.getClass();
        fetVar.g0(382909894);
        mm40 mm40Var2 = (i3 & 4) != 0 ? jm40.b : mm40Var;
        qge qgeVar2 = (i3 & 2048) != 0 ? gqw0.B : qgeVar;
        fetVar.f0(185152185);
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (objP == cl5Var) {
            objP = new bb10();
            fetVar.o0(objP);
        }
        bb10 bb10Var = (bb10) objP;
        fetVar.r(false);
        fetVar.f0(185152232);
        Object objP2 = fetVar.P();
        if (objP2 == cl5Var) {
            objP2 = new Matrix();
            fetVar.o0(objP2);
        }
        Matrix matrix = (Matrix) objP2;
        fetVar.r(false);
        fetVar.f0(185152312);
        boolean zG = fetVar.g(fa10Var);
        Object objP3 = fetVar.P();
        if (zG || objP3 == cl5Var) {
            objP3 = androidx.compose.runtime.e.e(null);
            fetVar.o0(objP3);
        }
        pz40 pz40Var = (pz40) objP3;
        fetVar.r(false);
        fetVar.f0(185152364);
        if (fa10Var == null || fa10Var.b() == 0.0f) {
            qge qgeVar3 = qgeVar2;
            mm40 mm40Var3 = mm40Var2;
            zq8.a((i >> 6) & 14, fetVar, mm40Var3);
            fetVar.r(false);
            yfe0 yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new v910(fa10Var, function0, mm40Var3, qgeVar3, i, i2, i3, (byte) 0);
                return;
            }
            return;
        }
        fetVar.r(false);
        Rect rect = fa10Var.k;
        Context context = (Context) fetVar.k(dy2.b);
        int iWidth = rect.width();
        int iHeight = rect.height();
        mm40Var2.getClass();
        mm40 mm40VarE = mm40Var2.e(new x910(iWidth, iHeight));
        qge qgeVar4 = qgeVar2;
        p8a.k(mm40VarE, new w910(rect, qgeVar4, matrix, bb10Var, fa10Var, context, function0, pz40Var), fetVar, 0);
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new v910(fa10Var, function0, mm40Var2, qgeVar4, i, i2, i3, (byte) 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r7v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r7v4, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void k(mm40 mm40Var, c530 c530Var, boolean z, Function0 function0, Function1 function1, Function0 function2, fet fetVar, int i) {
        Function0 function3;
        mm40 mm40Var2;
        ?? r7;
        jm40 jm40Var;
        ?? r5;
        ?? r8;
        fet fetVar2 = fetVar;
        gho ghoVar = c530Var.d;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(1908937046);
        int i2 = i | 6 | (fetVar2.g(c530Var) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192) | (fetVar2.i(function2) ? 131072 : 65536);
        if (fetVar2.U(i2 & 1, (i2 & 74899) != 74898)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarW = y860.W(jm40Var2, null, null, false, null, function0, 28);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarW, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(s5x0.N(s5x0.N(mm40VarQ, 12.0f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 0.0f, 4.0f, 0.0f, 11), 0.0f, 4.0f, 1);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            if (ghoVar == gho.b || ghoVar == gho.f11309a) {
                jm40Var = jm40Var2;
                fetVar2.e0(277662248);
                fetVar2.r(false);
            } else {
                fetVar2.e0(277448906);
                jm40Var = jm40Var2;
                b5x.e(s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 0.0f, 11), ghoVar, fetVar2, 0);
                fetVar2.r(false);
            }
            mm40Var2 = jm40Var;
            v8q0.a(c530Var.f3752a, s5x0.N(new x7z(1.0f, true), 0.0f, 0.0f, 12.0f, 0.0f, 11), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(c530Var.f, fetVar2), fetVar, 0, 0, 131068);
            fet fetVar3 = fetVar;
            if (z) {
                r5 = 0;
                fetVar3.e0(278192968);
                fetVar3.r(false);
                r8 = fetVar3;
            } else {
                fetVar3.e0(277970667);
                v8q0.a(c530Var.c, s5x0.L(mm40Var2, 8.0f, 0.0f, 2), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109), fetVar3), fetVar, 0, 0, 131068);
                fet fetVar4 = fetVar;
                r5 = 0;
                fetVar4.r(false);
                r8 = fetVar4;
            }
            if (c530Var.e) {
                r8.e0(278257200);
                int i3 = ((i2 & 112) != 32 ? r5 : 1) | ((i2 & 57344) == 16384 ? 1 : r5);
                Object objP = r8.P();
                if (i3 != 0 || objP == ukd.f35823a) {
                    objP = new mbz(function1, c530Var, (byte) 19);
                    r8.o0(objP);
                }
                d(r5, r8, null, (Function0) objP);
                r8.r(r5);
            } else {
                r8.e0(278434024);
                r8.r(r5);
            }
            function3 = function2;
            o((i2 >> 9) & 896, r8, null, function3, c530Var.b);
            acb.n(new zb(null, null, 7), z, function0, null, r8, (i2 >> 3) & 1008, 8);
            r8.r(true);
            r7 = r8;
        } else {
            function3 = function2;
            fetVar2.X();
            mm40Var2 = mm40Var;
            r7 = fetVar2;
        }
        yfe0 yfe0VarU = r7.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw8(mm40Var2, c530Var, z, function0, function1, function3, i);
        }
    }

    public static final void l(wn5 wn5Var, boolean z, fet fetVar, int i) {
        pcy pcyVar;
        fet fetVar2 = fetVar;
        wn5Var.getClass();
        fetVar2.g0(-1834075863);
        int i2 = i | (fetVar2.g(wn5Var) ? 4 : 2) | (fetVar2.h(z) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar2);
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
            mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD2, 0.0f, 0.0f, 0.0f, z ? 36.0f : 0.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14);
            String str = wn5Var.f39432a;
            idf idfVar = wn5Var.c;
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarN2, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar, 0, 24960, 109560);
            mm40 mm40VarM = s5x0.M(new x7z(1.0f, true), 16.0f, 16.0f, 36.0f, 16.0f);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarM);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            pcy pcyVar3 = pcyVar;
            v8q0.a(wn5Var.b.f4160a, null, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.n(), fetVar, 0, 24960, 109562);
            jwb.p(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), null, null, null, 0, 0, u1c.M(-547728044, new p0z((Object) wn5Var, (byte) 13), fetVar), fetVar, 1572864, 62);
            fetVar.r(true);
            mm40 mm40VarN3 = s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11);
            x5d x5dVarA3 = w5d.a(mw3Var, gqw0.o, fetVar, 48);
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarN3);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar3);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA3, shdVar);
            jpm0.o(fetVar, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC3, shdVar4);
            v8q0.a(idfVar.f14582a, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.l(), fetVar, 0, 24960, 109560);
            v8q0.a(idfVar.b, s5x0.N(jm40Var, 8.0f, 8.0f, 0.0f, 0.0f, 12), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
            if (z) {
                fetVar2.e0(-720350449);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-720557064);
                qxw.o(fetVar2, i120.Q(o7k0.e(o7k0.d(jm40Var, 1.0f), 1.0f), s6t0.b().f33626a.getSeparator(), jd8.n));
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xh20((Object) wn5Var, z, i, (byte) 3);
        }
    }

    public static final void m(mm40 mm40Var, clo cloVar, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(583423092);
        int i2 = i | 6 | (fetVar.g(cloVar) ? 32 : 16);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new ms60(ugdVar, ugdVar2, cloVar, b);
                fetVar.o0(objP);
            }
            jm40 jm40Var = jm40.b;
            x4n0.a(jm40Var, (Function2) objP, fetVar, 6, 0);
            mbc.o(zfi0.f44303a, null, false, fetVar, 6, 6);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nv60(mm40Var2, cloVar, ugdVar, ugdVar2, i, (byte) 0);
        }
    }

    public static final void n(mm40 mm40Var, wd80 wd80Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1213213683);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(wd80Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarY = o7k0.y(jm40Var, null, 3);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarY, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary60(), vgg0.f37379a);
            zcl zclVar = qmk.f28987a;
            v8q0.a(wd80Var.f38961a, s5x0.K(mm40VarQ, 6.0f, 2.0f), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, y9q0.a(g1t0.e(), StaticColors.INSTANCE.m123getWhite0d7_KjU(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24576, 114684);
            v8q0.a(wd80Var.b, o7k0.y(s5x0.N(jm40Var, 8.0f, 0.0f, 4.0f, 0.0f, 10), null, 3), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, y9q0.a(g1t0.g(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 24576, 114684);
            v8q0.a(wd80Var.c, new x7z(1.0f, true), 0L, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, y9q0.a(g1t0.g(), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), 0L, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777214), fetVar, 0, 28032, 101372);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jt50(mm40Var, wd80Var, i, (byte) 27);
        }
    }

    public static final void o(int i, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        mm40 mm40Var2;
        long secondary60;
        fetVar.g0(-275304518);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40Var2 = jm40.b;
            mm40 mm40VarW = y860.W(s5x0.K(o7k0.e(o7k0.s(mm40Var2, 28.0f), 40.0f), 4.0f, 10.0f), null, null, false, null, function0, 28);
            if (z) {
                pz40 pz40Var = s6t0.f31722a;
                secondary60 = s6t0.b().f33626a.getPrimary();
            } else {
                pz40 pz40Var2 = s6t0.f31722a;
                secondary60 = s6t0.b().f33626a.getSecondary60();
            }
            dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_pin, 6, fetVar), fetVar), null, mm40VarW, secondary60, fetVar, 56, 0);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ed(mm40Var2, z, function0, i, (byte) 8);
        }
    }

    public static final void p(mm40 mm40Var, s2a0 s2a0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        s2a0Var.getClass();
        function1.getClass();
        fetVar2.g0(153455417);
        int i2 = i | 6 | (fetVar2.g(s2a0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        byte b = 0;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 40.0f);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            int i3 = i2 & 112;
            boolean z = ((i2 & 896) == 256) | (i3 == 32);
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new qw80(s2a0Var, function1);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarE2, null, null, false, null, (Function0) objP, 28);
            boolean zF = fetVar2.f(backgroundContent);
            Object objP2 = fetVar2.P();
            if (zF || objP2 == cl5Var) {
                objP2 = new r2a0(b, backgroundContent);
                fetVar2.o0(objP2);
            }
            mm40 mm40VarL = s5x0.L(rq8.K(mm40VarW, (Function1) objP2), 6.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            boolean z2 = i3 == 32;
            Object objP3 = fetVar2.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new pl70(s2a0Var, (byte) 27);
                fetVar2.o0(objP3);
            }
            kkb.p(1, fetVar2, null, (Function0) objP3);
            mm40 mm40VarN = s5x0.N(new x7z(1.0f, true), 4.0f, 0.0f, 0.0f, 0.0f, 14);
            String str = s2a0Var.c;
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarN, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, y9q0Var, fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            dww.c(a8k0.F(R.drawable.ic_glyph_move_horizontal_large, 0, fetVar2), null, epv0.N(o7k0.n(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), 16.0f), s2a0Var.d ? 1.0f : 0.5f), s6t0.b().f33626a.getSecondary(), fetVar2, 56, 0);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o090(mm40Var2, s2a0Var, function1, i, (byte) 9);
        }
    }

    public static final void q(hga0 hga0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1429178404);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(hga0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d((mm40) fetVar.k(t0h.f33118a), 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 328.0f);
            long jM73getBlack400d7_KjU = StaticColors.INSTANCE.m73getBlack400d7_KjU();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarN = s5x0.N(i120.Q(mm40VarE, jM73getBlack400d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 8.0f, 8.0f, 0.0f, 8);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar, 48);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            s(hga0Var.f13009a, hga0Var.b, fetVar, 0);
            r(hga0Var, fetVar, i2 & 14);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qfa0(hga0Var, i, b);
        }
    }

    public static final void r(hga0 hga0Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(1576234823);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(hga0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new l3a0(hga0Var, (byte) 12);
                fetVar.o0(objP);
            }
            kwj kwjVarB = zk80.b(0, (Function0) objP, fetVar, 0, 3);
            q5x.e(kwjVarB, o7k0.d(jm40.b, 1.0f), null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(-2018468058, new csw((Object) hga0Var, (byte) 10), fetVar), fetVar, 48, 24576, 16380);
            n1i.a(null, kwjVarB, smm.b, new y3d(StaticColors.INSTANCE.m123getWhite0d7_KjU()), fetVar, 384, 1);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new qfa0(hga0Var, i, (byte) 1);
        }
    }

    public static final void s(f2a0 f2a0Var, f2a0 f2a0Var2, fet fetVar, int i) {
        fetVar.g0(631757593);
        int i2 = (fetVar.g(f2a0Var) ? 4 : 2) | i | (fetVar.g(f2a0Var2) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 4.0f, 8.0f, 3);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            qxw.i(mm40VarN.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), f2a0Var, fetVar, (i2 << 3) & 112);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 8.0f, 6);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            qxw.i(mm40VarN2.e(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), f2a0Var2, fetVar, i2 & 112);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(f2a0Var, f2a0Var2, i, (byte) 5);
        }
    }

    public static final void t(mm40 mm40Var, qza0 qza0Var, Function0 function0, Function1 function1, Function2 function2, fet fetVar, int i) {
        int i2;
        jm40 jm40Var;
        int i3;
        float f;
        fet fetVar2 = fetVar;
        qza0Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar2.g0(-1012956758);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(qza0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function2) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarW = o7k0.w(o7k0.d(mm40Var, 1.0f), null, false, 3);
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
            float f2 = xfn.a(fetVar2).e;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var2, f2, 0.0f, 2);
            int i4 = i2;
            jjm jjmVar = qza0Var.f29570a;
            hkl hklVar = qza0Var.b;
            nkb.h(mm40VarL, jjmVar, kjm.f18392a, null, null, null, fetVar2, 384, 56);
            if (hklVar == null) {
                fetVar2.e0(379119980);
                fetVar2.r(false);
                i3 = i4;
                jm40Var = jm40Var2;
            } else {
                fetVar2.e0(379119981);
                jm40Var = jm40Var2;
                i3 = i4;
                y9a.s(s5x0.L(jm40Var, xfn.a(fetVar2).c, 0.0f, 2), hklVar, qmk.k, function0, fetVar, (i3 << 3) & 7168, 0);
                fetVar2 = fetVar;
                fetVar2.r(false);
            }
            jml jmlVar = qza0Var.c;
            if (jmlVar == null) {
                fetVar2.e0(379540681);
                fetVar2.r(false);
            } else {
                fetVar2.e0(379540682);
                float f3 = xfn.a(fetVar2).c;
                float f4 = xfn.a(fetVar2).c;
                if (hklVar != null) {
                    zcl zclVar = qmk.f28987a;
                    f = 8.0f;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    f = 0.0f;
                }
                fet fetVar3 = fetVar2;
                gkb.h(s5x0.M(jm40Var, f3, f, f4, 0.0f), jmlVar, function1, function1, function2, fetVar3, ((i3 >> 3) & 896) | (i3 & 7168) | (57344 & i3));
                fetVar2 = fetVar3;
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp(mm40Var, qza0Var, function0, function1, function2, i);
        }
    }

    public static final void u(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        a4xVar.getClass();
        fetVar.g0(1588269914);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 16.0f, 0.0f, 2);
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarL);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarK = s5x0.K(i120.Q(i120.S(mm40VarE, 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSecondary10(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n), 12.0f, 10.0f);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, -1735899022, a4xVar);
            while (itO.hasNext()) {
                v((llc0) itO.next(), fetVar, 0);
            }
            fetVar.r(false);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var, a4xVar, i, (byte) 17);
        }
    }

    public static final void v(llc0 llc0Var, fet fetVar, int i) {
        long commerce;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1845600700);
        int i2 = i | (fetVar2.g(llc0Var) ? 4 : 2);
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
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
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 6.0f, 0.0f, 11);
            if (0.6f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(llc0Var.f20240a, mm40VarN.e(new x7z(0.6f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.6f, true)), 0L, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, ibm0.n(g1t0.n(), fetVar2), fetVar, 0, 0, 130044);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14);
            if (0.4f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarE = mm40VarN2.e(new x7z(0.4f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.4f, true));
            String str = llc0Var.b;
            if (llc0Var.c) {
                fetVar.e0(-391582048);
                commerce = ((ThemeColors) fetVar.k(zaq0.b)).getCommerce();
                fetVar.r(false);
            } else {
                fetVar.e0(-391648419);
                commerce = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
                fetVar.r(false);
            }
            v8q0.a(str, mm40VarE, commerce, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 0, false, 0, 0, null, g1t0.m(), fetVar, 0, 0, 130040);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lma0(llc0Var, i, (byte) 23);
        }
    }

    public static final void w(a4x a4xVar, boolean z, Function2 function2, mm40 mm40Var, ch80 ch80Var, fet fetVar, int i) {
        fetVar.g0(1728051245);
        int i2 = i | (fetVar.g(a4xVar) ? 4 : 2) | (fetVar.h(z) ? 32 : 16) | (fetVar.i(function2) ? 256 : 128) | (fetVar.g(mm40Var) ? 2048 : 1024) | (fetVar.g(ch80Var) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            mm40 mm40VarE0 = o2e.e0(mm40Var, "RULES_LAZY_COLUMN");
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new lrc0((Object) a4xVar, z, (Object) function2, (byte) 3);
                fetVar.o0(objP);
            }
            b8k0.e(mm40VarE0, null, ch80Var, null, null, null, false, null, (Function1) objP, fetVar, (i2 >> 6) & 896, 506);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new brc0(a4xVar, z, function2, mm40Var, ch80Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0164  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00da  */
    /* JADX WARN: Code duplicated, block: B:85:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:93:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:95:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:97:0x0158  */
    public static final void x(final mm40 mm40Var, final l7m0 l7m0Var, boolean z, boolean z2, boolean z3, hh80 hh80Var, final Function1 function1, fet fetVar, final int i, final int i2) {
        int i3;
        final boolean z4;
        int i4;
        boolean z5;
        int i5;
        int i6;
        boolean z6;
        int i7;
        int i8;
        hh80 hh80Var2;
        int i9;
        int i10;
        boolean z7;
        final boolean z8;
        final boolean z9;
        final hh80 hh80Var3;
        yfe0 yfe0VarU;
        final boolean z10;
        final boolean z11;
        final boolean z12;
        final hh80 hh80VarT;
        boolean z13;
        Object objP;
        int i11;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1265771355);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        int i12 = i2 & 4;
        if (i12 == 0) {
            if ((i & 384) == 0) {
                z4 = z;
                i3 |= fetVar.h(z4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z5 = z2;
                    if (fetVar.h(z5)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        z6 = z3;
                        if (fetVar.h(z6)) {
                            i7 = 16384;
                        } else {
                            i7 = 8192;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            hh80Var2 = hh80Var;
                            if (fetVar.g(hh80Var2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((1572864 & i) == 0) {
                            if (fetVar.i(function1)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i10 = i3;
                        if ((599187 & i10) != 599186) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (fetVar.U(i10 & 1, z7)) {
                            if (i12 != 0) {
                                z10 = false;
                            } else {
                                z10 = z4;
                            }
                            if (i4 != 0) {
                                z11 = true;
                            } else {
                                z11 = z5;
                            }
                            if (i6 != 0) {
                                z12 = false;
                            } else {
                                z12 = z6;
                            }
                            if (i8 != 0) {
                                hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                            } else {
                                hh80VarT = hh80Var2;
                            }
                            if ((3670016 & i10) == 1048576) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            objP = fetVar.P();
                            if (z13 || objP == ukd.f35823a) {
                                objP = new pme0(function1, (byte) 28);
                                fetVar.o0(objP);
                            }
                            knx.i(false, (Function0) objP, fetVar, 0, 1);
                            hh80 hh80Var4 = hh80VarT;
                            m8x.y(mm40Var, u1c.M(-229790623, new t5e0(function1, l7m0Var), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(711817206, new xdr() { // from class: a.bng0
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r8v13 */
                                /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
                                /* JADX WARN: Type inference failed for: r8v15 */
                                @Override // a.xdr
                                public final Object F(Object obj, Object obj2, Object obj3) {
                                    boolean z14;
                                    boolean z15;
                                    ch80 ch80VarG;
                                    fet fetVar2;
                                    ?? r8;
                                    shd shdVar = gqw0.v;
                                    shd shdVar2 = gqw0.y;
                                    shd shdVar3 = gqw0.w;
                                    shd shdVar4 = gqw0.x;
                                    hh80 hh80Var5 = (hh80) obj;
                                    fet fetVar3 = (fet) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    zx7 zx7Var = gqw0.f11754a;
                                    hh80Var5.getClass();
                                    if ((iIntValue & 6) == 0) {
                                        iIntValue |= fetVar3.g(hh80Var5) ? 4 : 2;
                                    }
                                    if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                        ung0 ung0Var = (ung0) l7m0Var.getValue();
                                        if (ung0Var != null) {
                                            boolean z16 = ung0Var instanceof sng0;
                                            jm40 jm40Var = jm40.b;
                                            if (z16) {
                                                fetVar3.e0(1156538511);
                                                piz.h(0, fetVar3, s5x0.I(jm40Var, hh80Var5).e(o7k0.c));
                                                fetVar3.r(false);
                                            } else {
                                                boolean z17 = ung0Var instanceof rng0;
                                                Function1 function2 = function1;
                                                jr8 jr8Var = jr8.f16991a;
                                                pcy pcyVar = e7z.u1;
                                                Object obj4 = ukd.f35823a;
                                                if (z17) {
                                                    fetVar3.e0(1156544937);
                                                    n0q n0qVar = o7k0.c;
                                                    tj30 tj30VarC = zq8.c(zx7Var, false);
                                                    int iHashCode = Long.hashCode(fetVar3.T);
                                                    bh90 bh90VarM = fetVar3.m();
                                                    mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                                                    mkd.c0.getClass();
                                                    fetVar3.i0();
                                                    if (fetVar3.S) {
                                                        fetVar3.l(pcyVar);
                                                    } else {
                                                        fetVar3.r0();
                                                    }
                                                    jpm0.o(fetVar3, tj30VarC, shdVar4);
                                                    jpm0.o(fetVar3, bh90VarM, shdVar3);
                                                    vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
                                                    jpm0.o(fetVar3, mm40VarC0, shdVar);
                                                    mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                                                    mdm mdmVar = ((rng0) ung0Var).c;
                                                    boolean zG = fetVar3.g(function2);
                                                    Object objP2 = fetVar3.P();
                                                    if (zG || objP2 == obj4) {
                                                        r8 = 0;
                                                        objP2 = new dng0(function2, (byte) 0);
                                                        fetVar3.o0(objP2);
                                                    } else {
                                                        r8 = 0;
                                                    }
                                                    piz.b(mm40VarB, mdmVar, (Function0) objP2, fetVar3, r8);
                                                    fetVar3.r(true);
                                                    fetVar3.r(r8);
                                                } else if (ung0Var instanceof tng0) {
                                                    fetVar3.e0(1156558737);
                                                    n0q n0qVar2 = o7k0.c;
                                                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                                                    int iHashCode2 = Long.hashCode(fetVar3.T);
                                                    bh90 bh90VarM2 = fetVar3.m();
                                                    mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar2);
                                                    mkd.c0.getClass();
                                                    fetVar3.i0();
                                                    if (fetVar3.S) {
                                                        fetVar3.l(pcyVar);
                                                    } else {
                                                        fetVar3.r0();
                                                    }
                                                    jpm0.o(fetVar3, tj30VarC2, shdVar4);
                                                    jpm0.o(fetVar3, bh90VarM2, shdVar3);
                                                    vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
                                                    jpm0.o(fetVar3, mm40VarC1, shdVar);
                                                    mm40 mm40VarE = s5x0.I(jm40Var, hh80Var5).e(n0qVar2);
                                                    boolean z18 = z12;
                                                    hh80 hh80Var6 = hh80VarT;
                                                    if (z18 || (z11 && ((tng0) ung0Var).e != null)) {
                                                        z15 = false;
                                                        fetVar3.e0(1979280365);
                                                        ch80VarG = knm0.g(hh80Var6, fetVar3);
                                                        fetVar3.r(false);
                                                    } else {
                                                        fetVar3.e0(1979374822);
                                                        ch80VarG = knm0.f(hh80Var6, fetVar3);
                                                        z15 = false;
                                                        fetVar3.r(false);
                                                    }
                                                    ch80 ch80Var = ch80VarG;
                                                    tng0 tng0Var = (tng0) ung0Var;
                                                    a4x a4xVar = tng0Var.c;
                                                    boolean z19 = z10;
                                                    boolean z20 = (!z19 || tng0Var.d == null) ? z15 : true;
                                                    boolean zG2 = fetVar3.g(function2);
                                                    Object objP3 = fetVar3.P();
                                                    if (zG2 || objP3 == obj4) {
                                                        objP3 = new ru80(function2, (byte) 11);
                                                        fetVar3.o0(objP3);
                                                    }
                                                    fet fetVar4 = fetVar3;
                                                    piz.w(a4xVar, z20, (Function2) objP3, mm40VarE, ch80Var, fetVar4, 0);
                                                    if (!z19 || tng0Var.e == null) {
                                                        fetVar4.e0(1980588038);
                                                        fetVar4.r(z15);
                                                        fetVar2 = fetVar4;
                                                    } else {
                                                        fetVar4.e0(1980151744);
                                                        mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.h);
                                                        mtl mtlVar = tng0Var.e;
                                                        zcl zclVar = qmk.f28987a;
                                                        lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                        boolean zG3 = fetVar4.g(function2);
                                                        Object objP4 = fetVar4.P();
                                                        if (zG3 || objP4 == obj4) {
                                                            objP4 = new a9g0(function2, (byte) 1);
                                                            fetVar4.o0(objP4);
                                                        }
                                                        bkb.f(mm40VarB2, mtlVar, null, false, lh80VarU, (Function1) objP4, fetVar4, 0, 12);
                                                        fet fetVar5 = fetVar4;
                                                        fetVar5.r(z15);
                                                        fetVar2 = fetVar5;
                                                    }
                                                    fetVar2.r(true);
                                                    fetVar2.r(z15);
                                                } else {
                                                    z14 = false;
                                                }
                                            }
                                        } else {
                                            z14 = false;
                                        }
                                        throw b1j.f(1156538291, fetVar3, z14);
                                    }
                                    fetVar3.X();
                                    return Unit.f46060a;
                                }
                            }, fetVar), fetVar, (i10 & 14) | 805306416, 444);
                            z8 = z11;
                            z9 = z12;
                            z4 = z10;
                            hh80Var3 = hh80Var4;
                        } else {
                            fetVar.X();
                            z8 = z5;
                            z9 = z6;
                            hh80Var3 = hh80Var2;
                        }
                        yfe0VarU = fetVar.u();
                        if (yfe0VarU != null) {
                            yfe0VarU.d = new Function2() { // from class: a.cng0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    piz.x(mm40Var, l7m0Var, z4, z8, z9, hh80Var3, function1, (fet) obj, x8x.L(i | 1), i2);
                                    return Unit.f46060a;
                                }
                            };
                        }
                    }
                    i3 |= 196608;
                    hh80Var2 = hh80Var;
                    if ((1572864 & i) == 0) {
                        if (fetVar.i(function1)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i10 = i3;
                    if ((599187 & i10) != 599186) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (fetVar.U(i10 & 1, z7)) {
                        if (i12 != 0) {
                            z10 = false;
                        } else {
                            z10 = z4;
                        }
                        if (i4 != 0) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                        if (i6 != 0) {
                            z12 = false;
                        } else {
                            z12 = z6;
                        }
                        if (i8 != 0) {
                            hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                        } else {
                            hh80VarT = hh80Var2;
                        }
                        if ((3670016 & i10) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objP = fetVar.P();
                        if (z13) {
                            objP = new pme0(function1, (byte) 28);
                            fetVar.o0(objP);
                        } else {
                            objP = new pme0(function1, (byte) 28);
                            fetVar.o0(objP);
                        }
                        knx.i(false, (Function0) objP, fetVar, 0, 1);
                        hh80 hh80Var5 = hh80VarT;
                        m8x.y(mm40Var, u1c.M(-229790623, new t5e0(function1, l7m0Var), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(711817206, new xdr() { // from class: a.bng0
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r8v13 */
                            /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r8v15 */
                            @Override // a.xdr
                            public final Object F(Object obj, Object obj2, Object obj3) {
                                boolean z14;
                                boolean z15;
                                ch80 ch80VarG;
                                fet fetVar2;
                                ?? r8;
                                shd shdVar = gqw0.v;
                                shd shdVar2 = gqw0.y;
                                shd shdVar3 = gqw0.w;
                                shd shdVar4 = gqw0.x;
                                hh80 hh80Var6 = (hh80) obj;
                                fet fetVar3 = (fet) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                zx7 zx7Var = gqw0.f11754a;
                                hh80Var6.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar3.g(hh80Var6) ? 4 : 2;
                                }
                                if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    ung0 ung0Var = (ung0) l7m0Var.getValue();
                                    if (ung0Var != null) {
                                        boolean z16 = ung0Var instanceof sng0;
                                        jm40 jm40Var = jm40.b;
                                        if (z16) {
                                            fetVar3.e0(1156538511);
                                            piz.h(0, fetVar3, s5x0.I(jm40Var, hh80Var6).e(o7k0.c));
                                            fetVar3.r(false);
                                        } else {
                                            boolean z17 = ung0Var instanceof rng0;
                                            Function1 function2 = function1;
                                            jr8 jr8Var = jr8.f16991a;
                                            pcy pcyVar = e7z.u1;
                                            Object obj4 = ukd.f35823a;
                                            if (z17) {
                                                fetVar3.e0(1156544937);
                                                n0q n0qVar = o7k0.c;
                                                tj30 tj30VarC = zq8.c(zx7Var, false);
                                                int iHashCode = Long.hashCode(fetVar3.T);
                                                bh90 bh90VarM = fetVar3.m();
                                                mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                                                mkd.c0.getClass();
                                                fetVar3.i0();
                                                if (fetVar3.S) {
                                                    fetVar3.l(pcyVar);
                                                } else {
                                                    fetVar3.r0();
                                                }
                                                jpm0.o(fetVar3, tj30VarC, shdVar4);
                                                jpm0.o(fetVar3, bh90VarM, shdVar3);
                                                vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
                                                jpm0.o(fetVar3, mm40VarC0, shdVar);
                                                mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                                                mdm mdmVar = ((rng0) ung0Var).c;
                                                boolean zG = fetVar3.g(function2);
                                                Object objP2 = fetVar3.P();
                                                if (zG || objP2 == obj4) {
                                                    r8 = 0;
                                                    objP2 = new dng0(function2, (byte) 0);
                                                    fetVar3.o0(objP2);
                                                } else {
                                                    r8 = 0;
                                                }
                                                piz.b(mm40VarB, mdmVar, (Function0) objP2, fetVar3, r8);
                                                fetVar3.r(true);
                                                fetVar3.r(r8);
                                            } else if (ung0Var instanceof tng0) {
                                                fetVar3.e0(1156558737);
                                                n0q n0qVar2 = o7k0.c;
                                                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                                                int iHashCode2 = Long.hashCode(fetVar3.T);
                                                bh90 bh90VarM2 = fetVar3.m();
                                                mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar2);
                                                mkd.c0.getClass();
                                                fetVar3.i0();
                                                if (fetVar3.S) {
                                                    fetVar3.l(pcyVar);
                                                } else {
                                                    fetVar3.r0();
                                                }
                                                jpm0.o(fetVar3, tj30VarC2, shdVar4);
                                                jpm0.o(fetVar3, bh90VarM2, shdVar3);
                                                vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
                                                jpm0.o(fetVar3, mm40VarC1, shdVar);
                                                mm40 mm40VarE = s5x0.I(jm40Var, hh80Var6).e(n0qVar2);
                                                boolean z18 = z12;
                                                hh80 hh80Var7 = hh80VarT;
                                                if (z18 || (z11 && ((tng0) ung0Var).e != null)) {
                                                    z15 = false;
                                                    fetVar3.e0(1979280365);
                                                    ch80VarG = knm0.g(hh80Var7, fetVar3);
                                                    fetVar3.r(false);
                                                } else {
                                                    fetVar3.e0(1979374822);
                                                    ch80VarG = knm0.f(hh80Var7, fetVar3);
                                                    z15 = false;
                                                    fetVar3.r(false);
                                                }
                                                ch80 ch80Var = ch80VarG;
                                                tng0 tng0Var = (tng0) ung0Var;
                                                a4x a4xVar = tng0Var.c;
                                                boolean z19 = z10;
                                                boolean z20 = (!z19 || tng0Var.d == null) ? z15 : true;
                                                boolean zG2 = fetVar3.g(function2);
                                                Object objP3 = fetVar3.P();
                                                if (zG2 || objP3 == obj4) {
                                                    objP3 = new ru80(function2, (byte) 11);
                                                    fetVar3.o0(objP3);
                                                }
                                                fet fetVar4 = fetVar3;
                                                piz.w(a4xVar, z20, (Function2) objP3, mm40VarE, ch80Var, fetVar4, 0);
                                                if (!z19 || tng0Var.e == null) {
                                                    fetVar4.e0(1980588038);
                                                    fetVar4.r(z15);
                                                    fetVar2 = fetVar4;
                                                } else {
                                                    fetVar4.e0(1980151744);
                                                    mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.h);
                                                    mtl mtlVar = tng0Var.e;
                                                    zcl zclVar = qmk.f28987a;
                                                    lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                    boolean zG3 = fetVar4.g(function2);
                                                    Object objP4 = fetVar4.P();
                                                    if (zG3 || objP4 == obj4) {
                                                        objP4 = new a9g0(function2, (byte) 1);
                                                        fetVar4.o0(objP4);
                                                    }
                                                    bkb.f(mm40VarB2, mtlVar, null, false, lh80VarU, (Function1) objP4, fetVar4, 0, 12);
                                                    fet fetVar5 = fetVar4;
                                                    fetVar5.r(z15);
                                                    fetVar2 = fetVar5;
                                                }
                                                fetVar2.r(true);
                                                fetVar2.r(z15);
                                            } else {
                                                z14 = false;
                                            }
                                        }
                                    } else {
                                        z14 = false;
                                    }
                                    throw b1j.f(1156538291, fetVar3, z14);
                                }
                                fetVar3.X();
                                return Unit.f46060a;
                            }
                        }, fetVar), fetVar, (i10 & 14) | 805306416, 444);
                        z8 = z11;
                        z9 = z12;
                        z4 = z10;
                        hh80Var3 = hh80Var5;
                    } else {
                        fetVar.X();
                        z8 = z5;
                        z9 = z6;
                        hh80Var3 = hh80Var2;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.cng0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                piz.x(mm40Var, l7m0Var, z4, z8, z9, hh80Var3, function1, (fet) obj, x8x.L(i | 1), i2);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i3 |= 24576;
                z6 = z3;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        hh80Var2 = hh80Var;
                        if (fetVar.g(hh80Var2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if (fetVar.i(function1)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i10 = i3;
                    if ((599187 & i10) != 599186) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (fetVar.U(i10 & 1, z7)) {
                        if (i12 != 0) {
                            z10 = false;
                        } else {
                            z10 = z4;
                        }
                        if (i4 != 0) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                        if (i6 != 0) {
                            z12 = false;
                        } else {
                            z12 = z6;
                        }
                        if (i8 != 0) {
                            hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                        } else {
                            hh80VarT = hh80Var2;
                        }
                        if ((3670016 & i10) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objP = fetVar.P();
                        if (z13) {
                            objP = new pme0(function1, (byte) 28);
                            fetVar.o0(objP);
                        } else {
                            objP = new pme0(function1, (byte) 28);
                            fetVar.o0(objP);
                        }
                        knx.i(false, (Function0) objP, fetVar, 0, 1);
                        hh80 hh80Var6 = hh80VarT;
                        m8x.y(mm40Var, u1c.M(-229790623, new t5e0(function1, l7m0Var), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(711817206, new xdr() { // from class: a.bng0
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r8v13 */
                            /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r8v15 */
                            @Override // a.xdr
                            public final Object F(Object obj, Object obj2, Object obj3) {
                                boolean z14;
                                boolean z15;
                                ch80 ch80VarG;
                                fet fetVar2;
                                ?? r8;
                                shd shdVar = gqw0.v;
                                shd shdVar2 = gqw0.y;
                                shd shdVar3 = gqw0.w;
                                shd shdVar4 = gqw0.x;
                                hh80 hh80Var7 = (hh80) obj;
                                fet fetVar3 = (fet) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                zx7 zx7Var = gqw0.f11754a;
                                hh80Var7.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar3.g(hh80Var7) ? 4 : 2;
                                }
                                if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    ung0 ung0Var = (ung0) l7m0Var.getValue();
                                    if (ung0Var != null) {
                                        boolean z16 = ung0Var instanceof sng0;
                                        jm40 jm40Var = jm40.b;
                                        if (z16) {
                                            fetVar3.e0(1156538511);
                                            piz.h(0, fetVar3, s5x0.I(jm40Var, hh80Var7).e(o7k0.c));
                                            fetVar3.r(false);
                                        } else {
                                            boolean z17 = ung0Var instanceof rng0;
                                            Function1 function2 = function1;
                                            jr8 jr8Var = jr8.f16991a;
                                            pcy pcyVar = e7z.u1;
                                            Object obj4 = ukd.f35823a;
                                            if (z17) {
                                                fetVar3.e0(1156544937);
                                                n0q n0qVar = o7k0.c;
                                                tj30 tj30VarC = zq8.c(zx7Var, false);
                                                int iHashCode = Long.hashCode(fetVar3.T);
                                                bh90 bh90VarM = fetVar3.m();
                                                mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                                                mkd.c0.getClass();
                                                fetVar3.i0();
                                                if (fetVar3.S) {
                                                    fetVar3.l(pcyVar);
                                                } else {
                                                    fetVar3.r0();
                                                }
                                                jpm0.o(fetVar3, tj30VarC, shdVar4);
                                                jpm0.o(fetVar3, bh90VarM, shdVar3);
                                                vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
                                                jpm0.o(fetVar3, mm40VarC0, shdVar);
                                                mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                                                mdm mdmVar = ((rng0) ung0Var).c;
                                                boolean zG = fetVar3.g(function2);
                                                Object objP2 = fetVar3.P();
                                                if (zG || objP2 == obj4) {
                                                    r8 = 0;
                                                    objP2 = new dng0(function2, (byte) 0);
                                                    fetVar3.o0(objP2);
                                                } else {
                                                    r8 = 0;
                                                }
                                                piz.b(mm40VarB, mdmVar, (Function0) objP2, fetVar3, r8);
                                                fetVar3.r(true);
                                                fetVar3.r(r8);
                                            } else if (ung0Var instanceof tng0) {
                                                fetVar3.e0(1156558737);
                                                n0q n0qVar2 = o7k0.c;
                                                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                                                int iHashCode2 = Long.hashCode(fetVar3.T);
                                                bh90 bh90VarM2 = fetVar3.m();
                                                mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar2);
                                                mkd.c0.getClass();
                                                fetVar3.i0();
                                                if (fetVar3.S) {
                                                    fetVar3.l(pcyVar);
                                                } else {
                                                    fetVar3.r0();
                                                }
                                                jpm0.o(fetVar3, tj30VarC2, shdVar4);
                                                jpm0.o(fetVar3, bh90VarM2, shdVar3);
                                                vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
                                                jpm0.o(fetVar3, mm40VarC1, shdVar);
                                                mm40 mm40VarE = s5x0.I(jm40Var, hh80Var7).e(n0qVar2);
                                                boolean z18 = z12;
                                                hh80 hh80Var8 = hh80VarT;
                                                if (z18 || (z11 && ((tng0) ung0Var).e != null)) {
                                                    z15 = false;
                                                    fetVar3.e0(1979280365);
                                                    ch80VarG = knm0.g(hh80Var8, fetVar3);
                                                    fetVar3.r(false);
                                                } else {
                                                    fetVar3.e0(1979374822);
                                                    ch80VarG = knm0.f(hh80Var8, fetVar3);
                                                    z15 = false;
                                                    fetVar3.r(false);
                                                }
                                                ch80 ch80Var = ch80VarG;
                                                tng0 tng0Var = (tng0) ung0Var;
                                                a4x a4xVar = tng0Var.c;
                                                boolean z19 = z10;
                                                boolean z20 = (!z19 || tng0Var.d == null) ? z15 : true;
                                                boolean zG2 = fetVar3.g(function2);
                                                Object objP3 = fetVar3.P();
                                                if (zG2 || objP3 == obj4) {
                                                    objP3 = new ru80(function2, (byte) 11);
                                                    fetVar3.o0(objP3);
                                                }
                                                fet fetVar4 = fetVar3;
                                                piz.w(a4xVar, z20, (Function2) objP3, mm40VarE, ch80Var, fetVar4, 0);
                                                if (!z19 || tng0Var.e == null) {
                                                    fetVar4.e0(1980588038);
                                                    fetVar4.r(z15);
                                                    fetVar2 = fetVar4;
                                                } else {
                                                    fetVar4.e0(1980151744);
                                                    mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.h);
                                                    mtl mtlVar = tng0Var.e;
                                                    zcl zclVar = qmk.f28987a;
                                                    lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                    boolean zG3 = fetVar4.g(function2);
                                                    Object objP4 = fetVar4.P();
                                                    if (zG3 || objP4 == obj4) {
                                                        objP4 = new a9g0(function2, (byte) 1);
                                                        fetVar4.o0(objP4);
                                                    }
                                                    bkb.f(mm40VarB2, mtlVar, null, false, lh80VarU, (Function1) objP4, fetVar4, 0, 12);
                                                    fet fetVar5 = fetVar4;
                                                    fetVar5.r(z15);
                                                    fetVar2 = fetVar5;
                                                }
                                                fetVar2.r(true);
                                                fetVar2.r(z15);
                                            } else {
                                                z14 = false;
                                            }
                                        }
                                    } else {
                                        z14 = false;
                                    }
                                    throw b1j.f(1156538291, fetVar3, z14);
                                }
                                fetVar3.X();
                                return Unit.f46060a;
                            }
                        }, fetVar), fetVar, (i10 & 14) | 805306416, 444);
                        z8 = z11;
                        z9 = z12;
                        z4 = z10;
                        hh80Var3 = hh80Var6;
                    } else {
                        fetVar.X();
                        z8 = z5;
                        z9 = z6;
                        hh80Var3 = hh80Var2;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.cng0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                piz.x(mm40Var, l7m0Var, z4, z8, z9, hh80Var3, function1, (fet) obj, x8x.L(i | 1), i2);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                hh80Var2 = hh80Var;
                if ((1572864 & i) == 0) {
                    if (fetVar.i(function1)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i10 = i3;
                if ((599187 & i10) != 599186) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (fetVar.U(i10 & 1, z7)) {
                    if (i12 != 0) {
                        z10 = false;
                    } else {
                        z10 = z4;
                    }
                    if (i4 != 0) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                    if (i6 != 0) {
                        z12 = false;
                    } else {
                        z12 = z6;
                    }
                    if (i8 != 0) {
                        hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                    } else {
                        hh80VarT = hh80Var2;
                    }
                    if ((3670016 & i10) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objP = fetVar.P();
                    if (z13) {
                        objP = new pme0(function1, (byte) 28);
                        fetVar.o0(objP);
                    } else {
                        objP = new pme0(function1, (byte) 28);
                        fetVar.o0(objP);
                    }
                    knx.i(false, (Function0) objP, fetVar, 0, 1);
                    hh80 hh80Var7 = hh80VarT;
                    m8x.y(mm40Var, u1c.M(-229790623, new t5e0(function1, l7m0Var), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(711817206, new xdr() { // from class: a.bng0
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r8v13 */
                        /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r8v15 */
                        @Override // a.xdr
                        public final Object F(Object obj, Object obj2, Object obj3) {
                            boolean z14;
                            boolean z15;
                            ch80 ch80VarG;
                            fet fetVar2;
                            ?? r8;
                            shd shdVar = gqw0.v;
                            shd shdVar2 = gqw0.y;
                            shd shdVar3 = gqw0.w;
                            shd shdVar4 = gqw0.x;
                            hh80 hh80Var8 = (hh80) obj;
                            fet fetVar3 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            zx7 zx7Var = gqw0.f11754a;
                            hh80Var8.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar3.g(hh80Var8) ? 4 : 2;
                            }
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                ung0 ung0Var = (ung0) l7m0Var.getValue();
                                if (ung0Var != null) {
                                    boolean z16 = ung0Var instanceof sng0;
                                    jm40 jm40Var = jm40.b;
                                    if (z16) {
                                        fetVar3.e0(1156538511);
                                        piz.h(0, fetVar3, s5x0.I(jm40Var, hh80Var8).e(o7k0.c));
                                        fetVar3.r(false);
                                    } else {
                                        boolean z17 = ung0Var instanceof rng0;
                                        Function1 function2 = function1;
                                        jr8 jr8Var = jr8.f16991a;
                                        pcy pcyVar = e7z.u1;
                                        Object obj4 = ukd.f35823a;
                                        if (z17) {
                                            fetVar3.e0(1156544937);
                                            n0q n0qVar = o7k0.c;
                                            tj30 tj30VarC = zq8.c(zx7Var, false);
                                            int iHashCode = Long.hashCode(fetVar3.T);
                                            bh90 bh90VarM = fetVar3.m();
                                            mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                                            mkd.c0.getClass();
                                            fetVar3.i0();
                                            if (fetVar3.S) {
                                                fetVar3.l(pcyVar);
                                            } else {
                                                fetVar3.r0();
                                            }
                                            jpm0.o(fetVar3, tj30VarC, shdVar4);
                                            jpm0.o(fetVar3, bh90VarM, shdVar3);
                                            vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
                                            jpm0.o(fetVar3, mm40VarC0, shdVar);
                                            mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                                            mdm mdmVar = ((rng0) ung0Var).c;
                                            boolean zG = fetVar3.g(function2);
                                            Object objP2 = fetVar3.P();
                                            if (zG || objP2 == obj4) {
                                                r8 = 0;
                                                objP2 = new dng0(function2, (byte) 0);
                                                fetVar3.o0(objP2);
                                            } else {
                                                r8 = 0;
                                            }
                                            piz.b(mm40VarB, mdmVar, (Function0) objP2, fetVar3, r8);
                                            fetVar3.r(true);
                                            fetVar3.r(r8);
                                        } else if (ung0Var instanceof tng0) {
                                            fetVar3.e0(1156558737);
                                            n0q n0qVar2 = o7k0.c;
                                            tj30 tj30VarC2 = zq8.c(zx7Var, false);
                                            int iHashCode2 = Long.hashCode(fetVar3.T);
                                            bh90 bh90VarM2 = fetVar3.m();
                                            mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar2);
                                            mkd.c0.getClass();
                                            fetVar3.i0();
                                            if (fetVar3.S) {
                                                fetVar3.l(pcyVar);
                                            } else {
                                                fetVar3.r0();
                                            }
                                            jpm0.o(fetVar3, tj30VarC2, shdVar4);
                                            jpm0.o(fetVar3, bh90VarM2, shdVar3);
                                            vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
                                            jpm0.o(fetVar3, mm40VarC1, shdVar);
                                            mm40 mm40VarE = s5x0.I(jm40Var, hh80Var8).e(n0qVar2);
                                            boolean z18 = z12;
                                            hh80 hh80Var9 = hh80VarT;
                                            if (z18 || (z11 && ((tng0) ung0Var).e != null)) {
                                                z15 = false;
                                                fetVar3.e0(1979280365);
                                                ch80VarG = knm0.g(hh80Var9, fetVar3);
                                                fetVar3.r(false);
                                            } else {
                                                fetVar3.e0(1979374822);
                                                ch80VarG = knm0.f(hh80Var9, fetVar3);
                                                z15 = false;
                                                fetVar3.r(false);
                                            }
                                            ch80 ch80Var = ch80VarG;
                                            tng0 tng0Var = (tng0) ung0Var;
                                            a4x a4xVar = tng0Var.c;
                                            boolean z19 = z10;
                                            boolean z20 = (!z19 || tng0Var.d == null) ? z15 : true;
                                            boolean zG2 = fetVar3.g(function2);
                                            Object objP3 = fetVar3.P();
                                            if (zG2 || objP3 == obj4) {
                                                objP3 = new ru80(function2, (byte) 11);
                                                fetVar3.o0(objP3);
                                            }
                                            fet fetVar4 = fetVar3;
                                            piz.w(a4xVar, z20, (Function2) objP3, mm40VarE, ch80Var, fetVar4, 0);
                                            if (!z19 || tng0Var.e == null) {
                                                fetVar4.e0(1980588038);
                                                fetVar4.r(z15);
                                                fetVar2 = fetVar4;
                                            } else {
                                                fetVar4.e0(1980151744);
                                                mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.h);
                                                mtl mtlVar = tng0Var.e;
                                                zcl zclVar = qmk.f28987a;
                                                lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                boolean zG3 = fetVar4.g(function2);
                                                Object objP4 = fetVar4.P();
                                                if (zG3 || objP4 == obj4) {
                                                    objP4 = new a9g0(function2, (byte) 1);
                                                    fetVar4.o0(objP4);
                                                }
                                                bkb.f(mm40VarB2, mtlVar, null, false, lh80VarU, (Function1) objP4, fetVar4, 0, 12);
                                                fet fetVar5 = fetVar4;
                                                fetVar5.r(z15);
                                                fetVar2 = fetVar5;
                                            }
                                            fetVar2.r(true);
                                            fetVar2.r(z15);
                                        } else {
                                            z14 = false;
                                        }
                                    }
                                } else {
                                    z14 = false;
                                }
                                throw b1j.f(1156538291, fetVar3, z14);
                            }
                            fetVar3.X();
                            return Unit.f46060a;
                        }
                    }, fetVar), fetVar, (i10 & 14) | 805306416, 444);
                    z8 = z11;
                    z9 = z12;
                    z4 = z10;
                    hh80Var3 = hh80Var7;
                } else {
                    fetVar.X();
                    z8 = z5;
                    z9 = z6;
                    hh80Var3 = hh80Var2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.cng0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            piz.x(mm40Var, l7m0Var, z4, z8, z9, hh80Var3, function1, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 3072;
            z5 = z2;
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    z6 = z3;
                    if (fetVar.h(z6)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        hh80Var2 = hh80Var;
                        if (fetVar.g(hh80Var2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if (fetVar.i(function1)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i10 = i3;
                    if ((599187 & i10) != 599186) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (fetVar.U(i10 & 1, z7)) {
                        if (i12 != 0) {
                            z10 = false;
                        } else {
                            z10 = z4;
                        }
                        if (i4 != 0) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                        if (i6 != 0) {
                            z12 = false;
                        } else {
                            z12 = z6;
                        }
                        if (i8 != 0) {
                            hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                        } else {
                            hh80VarT = hh80Var2;
                        }
                        if ((3670016 & i10) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objP = fetVar.P();
                        if (z13) {
                            objP = new pme0(function1, (byte) 28);
                            fetVar.o0(objP);
                        } else {
                            objP = new pme0(function1, (byte) 28);
                            fetVar.o0(objP);
                        }
                        knx.i(false, (Function0) objP, fetVar, 0, 1);
                        hh80 hh80Var8 = hh80VarT;
                        m8x.y(mm40Var, u1c.M(-229790623, new t5e0(function1, l7m0Var), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(711817206, new xdr() { // from class: a.bng0
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r8v13 */
                            /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r8v15 */
                            @Override // a.xdr
                            public final Object F(Object obj, Object obj2, Object obj3) {
                                boolean z14;
                                boolean z15;
                                ch80 ch80VarG;
                                fet fetVar2;
                                ?? r8;
                                shd shdVar = gqw0.v;
                                shd shdVar2 = gqw0.y;
                                shd shdVar3 = gqw0.w;
                                shd shdVar4 = gqw0.x;
                                hh80 hh80Var9 = (hh80) obj;
                                fet fetVar3 = (fet) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                zx7 zx7Var = gqw0.f11754a;
                                hh80Var9.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar3.g(hh80Var9) ? 4 : 2;
                                }
                                if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    ung0 ung0Var = (ung0) l7m0Var.getValue();
                                    if (ung0Var != null) {
                                        boolean z16 = ung0Var instanceof sng0;
                                        jm40 jm40Var = jm40.b;
                                        if (z16) {
                                            fetVar3.e0(1156538511);
                                            piz.h(0, fetVar3, s5x0.I(jm40Var, hh80Var9).e(o7k0.c));
                                            fetVar3.r(false);
                                        } else {
                                            boolean z17 = ung0Var instanceof rng0;
                                            Function1 function2 = function1;
                                            jr8 jr8Var = jr8.f16991a;
                                            pcy pcyVar = e7z.u1;
                                            Object obj4 = ukd.f35823a;
                                            if (z17) {
                                                fetVar3.e0(1156544937);
                                                n0q n0qVar = o7k0.c;
                                                tj30 tj30VarC = zq8.c(zx7Var, false);
                                                int iHashCode = Long.hashCode(fetVar3.T);
                                                bh90 bh90VarM = fetVar3.m();
                                                mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                                                mkd.c0.getClass();
                                                fetVar3.i0();
                                                if (fetVar3.S) {
                                                    fetVar3.l(pcyVar);
                                                } else {
                                                    fetVar3.r0();
                                                }
                                                jpm0.o(fetVar3, tj30VarC, shdVar4);
                                                jpm0.o(fetVar3, bh90VarM, shdVar3);
                                                vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
                                                jpm0.o(fetVar3, mm40VarC0, shdVar);
                                                mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                                                mdm mdmVar = ((rng0) ung0Var).c;
                                                boolean zG = fetVar3.g(function2);
                                                Object objP2 = fetVar3.P();
                                                if (zG || objP2 == obj4) {
                                                    r8 = 0;
                                                    objP2 = new dng0(function2, (byte) 0);
                                                    fetVar3.o0(objP2);
                                                } else {
                                                    r8 = 0;
                                                }
                                                piz.b(mm40VarB, mdmVar, (Function0) objP2, fetVar3, r8);
                                                fetVar3.r(true);
                                                fetVar3.r(r8);
                                            } else if (ung0Var instanceof tng0) {
                                                fetVar3.e0(1156558737);
                                                n0q n0qVar2 = o7k0.c;
                                                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                                                int iHashCode2 = Long.hashCode(fetVar3.T);
                                                bh90 bh90VarM2 = fetVar3.m();
                                                mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar2);
                                                mkd.c0.getClass();
                                                fetVar3.i0();
                                                if (fetVar3.S) {
                                                    fetVar3.l(pcyVar);
                                                } else {
                                                    fetVar3.r0();
                                                }
                                                jpm0.o(fetVar3, tj30VarC2, shdVar4);
                                                jpm0.o(fetVar3, bh90VarM2, shdVar3);
                                                vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
                                                jpm0.o(fetVar3, mm40VarC1, shdVar);
                                                mm40 mm40VarE = s5x0.I(jm40Var, hh80Var9).e(n0qVar2);
                                                boolean z18 = z12;
                                                hh80 hh80Var10 = hh80VarT;
                                                if (z18 || (z11 && ((tng0) ung0Var).e != null)) {
                                                    z15 = false;
                                                    fetVar3.e0(1979280365);
                                                    ch80VarG = knm0.g(hh80Var10, fetVar3);
                                                    fetVar3.r(false);
                                                } else {
                                                    fetVar3.e0(1979374822);
                                                    ch80VarG = knm0.f(hh80Var10, fetVar3);
                                                    z15 = false;
                                                    fetVar3.r(false);
                                                }
                                                ch80 ch80Var = ch80VarG;
                                                tng0 tng0Var = (tng0) ung0Var;
                                                a4x a4xVar = tng0Var.c;
                                                boolean z19 = z10;
                                                boolean z20 = (!z19 || tng0Var.d == null) ? z15 : true;
                                                boolean zG2 = fetVar3.g(function2);
                                                Object objP3 = fetVar3.P();
                                                if (zG2 || objP3 == obj4) {
                                                    objP3 = new ru80(function2, (byte) 11);
                                                    fetVar3.o0(objP3);
                                                }
                                                fet fetVar4 = fetVar3;
                                                piz.w(a4xVar, z20, (Function2) objP3, mm40VarE, ch80Var, fetVar4, 0);
                                                if (!z19 || tng0Var.e == null) {
                                                    fetVar4.e0(1980588038);
                                                    fetVar4.r(z15);
                                                    fetVar2 = fetVar4;
                                                } else {
                                                    fetVar4.e0(1980151744);
                                                    mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.h);
                                                    mtl mtlVar = tng0Var.e;
                                                    zcl zclVar = qmk.f28987a;
                                                    lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                    boolean zG3 = fetVar4.g(function2);
                                                    Object objP4 = fetVar4.P();
                                                    if (zG3 || objP4 == obj4) {
                                                        objP4 = new a9g0(function2, (byte) 1);
                                                        fetVar4.o0(objP4);
                                                    }
                                                    bkb.f(mm40VarB2, mtlVar, null, false, lh80VarU, (Function1) objP4, fetVar4, 0, 12);
                                                    fet fetVar5 = fetVar4;
                                                    fetVar5.r(z15);
                                                    fetVar2 = fetVar5;
                                                }
                                                fetVar2.r(true);
                                                fetVar2.r(z15);
                                            } else {
                                                z14 = false;
                                            }
                                        }
                                    } else {
                                        z14 = false;
                                    }
                                    throw b1j.f(1156538291, fetVar3, z14);
                                }
                                fetVar3.X();
                                return Unit.f46060a;
                            }
                        }, fetVar), fetVar, (i10 & 14) | 805306416, 444);
                        z8 = z11;
                        z9 = z12;
                        z4 = z10;
                        hh80Var3 = hh80Var8;
                    } else {
                        fetVar.X();
                        z8 = z5;
                        z9 = z6;
                        hh80Var3 = hh80Var2;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.cng0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                piz.x(mm40Var, l7m0Var, z4, z8, z9, hh80Var3, function1, (fet) obj, x8x.L(i | 1), i2);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                hh80Var2 = hh80Var;
                if ((1572864 & i) == 0) {
                    if (fetVar.i(function1)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i10 = i3;
                if ((599187 & i10) != 599186) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (fetVar.U(i10 & 1, z7)) {
                    if (i12 != 0) {
                        z10 = false;
                    } else {
                        z10 = z4;
                    }
                    if (i4 != 0) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                    if (i6 != 0) {
                        z12 = false;
                    } else {
                        z12 = z6;
                    }
                    if (i8 != 0) {
                        hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                    } else {
                        hh80VarT = hh80Var2;
                    }
                    if ((3670016 & i10) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objP = fetVar.P();
                    if (z13) {
                        objP = new pme0(function1, (byte) 28);
                        fetVar.o0(objP);
                    } else {
                        objP = new pme0(function1, (byte) 28);
                        fetVar.o0(objP);
                    }
                    knx.i(false, (Function0) objP, fetVar, 0, 1);
                    hh80 hh80Var9 = hh80VarT;
                    m8x.y(mm40Var, u1c.M(-229790623, new t5e0(function1, l7m0Var), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(711817206, new xdr() { // from class: a.bng0
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r8v13 */
                        /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r8v15 */
                        @Override // a.xdr
                        public final Object F(Object obj, Object obj2, Object obj3) {
                            boolean z14;
                            boolean z15;
                            ch80 ch80VarG;
                            fet fetVar2;
                            ?? r8;
                            shd shdVar = gqw0.v;
                            shd shdVar2 = gqw0.y;
                            shd shdVar3 = gqw0.w;
                            shd shdVar4 = gqw0.x;
                            hh80 hh80Var10 = (hh80) obj;
                            fet fetVar3 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            zx7 zx7Var = gqw0.f11754a;
                            hh80Var10.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar3.g(hh80Var10) ? 4 : 2;
                            }
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                ung0 ung0Var = (ung0) l7m0Var.getValue();
                                if (ung0Var != null) {
                                    boolean z16 = ung0Var instanceof sng0;
                                    jm40 jm40Var = jm40.b;
                                    if (z16) {
                                        fetVar3.e0(1156538511);
                                        piz.h(0, fetVar3, s5x0.I(jm40Var, hh80Var10).e(o7k0.c));
                                        fetVar3.r(false);
                                    } else {
                                        boolean z17 = ung0Var instanceof rng0;
                                        Function1 function2 = function1;
                                        jr8 jr8Var = jr8.f16991a;
                                        pcy pcyVar = e7z.u1;
                                        Object obj4 = ukd.f35823a;
                                        if (z17) {
                                            fetVar3.e0(1156544937);
                                            n0q n0qVar = o7k0.c;
                                            tj30 tj30VarC = zq8.c(zx7Var, false);
                                            int iHashCode = Long.hashCode(fetVar3.T);
                                            bh90 bh90VarM = fetVar3.m();
                                            mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                                            mkd.c0.getClass();
                                            fetVar3.i0();
                                            if (fetVar3.S) {
                                                fetVar3.l(pcyVar);
                                            } else {
                                                fetVar3.r0();
                                            }
                                            jpm0.o(fetVar3, tj30VarC, shdVar4);
                                            jpm0.o(fetVar3, bh90VarM, shdVar3);
                                            vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
                                            jpm0.o(fetVar3, mm40VarC0, shdVar);
                                            mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                                            mdm mdmVar = ((rng0) ung0Var).c;
                                            boolean zG = fetVar3.g(function2);
                                            Object objP2 = fetVar3.P();
                                            if (zG || objP2 == obj4) {
                                                r8 = 0;
                                                objP2 = new dng0(function2, (byte) 0);
                                                fetVar3.o0(objP2);
                                            } else {
                                                r8 = 0;
                                            }
                                            piz.b(mm40VarB, mdmVar, (Function0) objP2, fetVar3, r8);
                                            fetVar3.r(true);
                                            fetVar3.r(r8);
                                        } else if (ung0Var instanceof tng0) {
                                            fetVar3.e0(1156558737);
                                            n0q n0qVar2 = o7k0.c;
                                            tj30 tj30VarC2 = zq8.c(zx7Var, false);
                                            int iHashCode2 = Long.hashCode(fetVar3.T);
                                            bh90 bh90VarM2 = fetVar3.m();
                                            mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar2);
                                            mkd.c0.getClass();
                                            fetVar3.i0();
                                            if (fetVar3.S) {
                                                fetVar3.l(pcyVar);
                                            } else {
                                                fetVar3.r0();
                                            }
                                            jpm0.o(fetVar3, tj30VarC2, shdVar4);
                                            jpm0.o(fetVar3, bh90VarM2, shdVar3);
                                            vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
                                            jpm0.o(fetVar3, mm40VarC1, shdVar);
                                            mm40 mm40VarE = s5x0.I(jm40Var, hh80Var10).e(n0qVar2);
                                            boolean z18 = z12;
                                            hh80 hh80Var11 = hh80VarT;
                                            if (z18 || (z11 && ((tng0) ung0Var).e != null)) {
                                                z15 = false;
                                                fetVar3.e0(1979280365);
                                                ch80VarG = knm0.g(hh80Var11, fetVar3);
                                                fetVar3.r(false);
                                            } else {
                                                fetVar3.e0(1979374822);
                                                ch80VarG = knm0.f(hh80Var11, fetVar3);
                                                z15 = false;
                                                fetVar3.r(false);
                                            }
                                            ch80 ch80Var = ch80VarG;
                                            tng0 tng0Var = (tng0) ung0Var;
                                            a4x a4xVar = tng0Var.c;
                                            boolean z19 = z10;
                                            boolean z20 = (!z19 || tng0Var.d == null) ? z15 : true;
                                            boolean zG2 = fetVar3.g(function2);
                                            Object objP3 = fetVar3.P();
                                            if (zG2 || objP3 == obj4) {
                                                objP3 = new ru80(function2, (byte) 11);
                                                fetVar3.o0(objP3);
                                            }
                                            fet fetVar4 = fetVar3;
                                            piz.w(a4xVar, z20, (Function2) objP3, mm40VarE, ch80Var, fetVar4, 0);
                                            if (!z19 || tng0Var.e == null) {
                                                fetVar4.e0(1980588038);
                                                fetVar4.r(z15);
                                                fetVar2 = fetVar4;
                                            } else {
                                                fetVar4.e0(1980151744);
                                                mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.h);
                                                mtl mtlVar = tng0Var.e;
                                                zcl zclVar = qmk.f28987a;
                                                lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                boolean zG3 = fetVar4.g(function2);
                                                Object objP4 = fetVar4.P();
                                                if (zG3 || objP4 == obj4) {
                                                    objP4 = new a9g0(function2, (byte) 1);
                                                    fetVar4.o0(objP4);
                                                }
                                                bkb.f(mm40VarB2, mtlVar, null, false, lh80VarU, (Function1) objP4, fetVar4, 0, 12);
                                                fet fetVar5 = fetVar4;
                                                fetVar5.r(z15);
                                                fetVar2 = fetVar5;
                                            }
                                            fetVar2.r(true);
                                            fetVar2.r(z15);
                                        } else {
                                            z14 = false;
                                        }
                                    }
                                } else {
                                    z14 = false;
                                }
                                throw b1j.f(1156538291, fetVar3, z14);
                            }
                            fetVar3.X();
                            return Unit.f46060a;
                        }
                    }, fetVar), fetVar, (i10 & 14) | 805306416, 444);
                    z8 = z11;
                    z9 = z12;
                    z4 = z10;
                    hh80Var3 = hh80Var9;
                } else {
                    fetVar.X();
                    z8 = z5;
                    z9 = z6;
                    hh80Var3 = hh80Var2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.cng0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            piz.x(mm40Var, l7m0Var, z4, z8, z9, hh80Var3, function1, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 24576;
            z6 = z3;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    hh80Var2 = hh80Var;
                    if (fetVar.g(hh80Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if (fetVar.i(function1)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i10 = i3;
                if ((599187 & i10) != 599186) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (fetVar.U(i10 & 1, z7)) {
                    if (i12 != 0) {
                        z10 = false;
                    } else {
                        z10 = z4;
                    }
                    if (i4 != 0) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                    if (i6 != 0) {
                        z12 = false;
                    } else {
                        z12 = z6;
                    }
                    if (i8 != 0) {
                        hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                    } else {
                        hh80VarT = hh80Var2;
                    }
                    if ((3670016 & i10) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objP = fetVar.P();
                    if (z13) {
                        objP = new pme0(function1, (byte) 28);
                        fetVar.o0(objP);
                    } else {
                        objP = new pme0(function1, (byte) 28);
                        fetVar.o0(objP);
                    }
                    knx.i(false, (Function0) objP, fetVar, 0, 1);
                    hh80 hh80Var10 = hh80VarT;
                    m8x.y(mm40Var, u1c.M(-229790623, new t5e0(function1, l7m0Var), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(711817206, new xdr() { // from class: a.bng0
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r8v13 */
                        /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r8v15 */
                        @Override // a.xdr
                        public final Object F(Object obj, Object obj2, Object obj3) {
                            boolean z14;
                            boolean z15;
                            ch80 ch80VarG;
                            fet fetVar2;
                            ?? r8;
                            shd shdVar = gqw0.v;
                            shd shdVar2 = gqw0.y;
                            shd shdVar3 = gqw0.w;
                            shd shdVar4 = gqw0.x;
                            hh80 hh80Var11 = (hh80) obj;
                            fet fetVar3 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            zx7 zx7Var = gqw0.f11754a;
                            hh80Var11.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar3.g(hh80Var11) ? 4 : 2;
                            }
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                ung0 ung0Var = (ung0) l7m0Var.getValue();
                                if (ung0Var != null) {
                                    boolean z16 = ung0Var instanceof sng0;
                                    jm40 jm40Var = jm40.b;
                                    if (z16) {
                                        fetVar3.e0(1156538511);
                                        piz.h(0, fetVar3, s5x0.I(jm40Var, hh80Var11).e(o7k0.c));
                                        fetVar3.r(false);
                                    } else {
                                        boolean z17 = ung0Var instanceof rng0;
                                        Function1 function2 = function1;
                                        jr8 jr8Var = jr8.f16991a;
                                        pcy pcyVar = e7z.u1;
                                        Object obj4 = ukd.f35823a;
                                        if (z17) {
                                            fetVar3.e0(1156544937);
                                            n0q n0qVar = o7k0.c;
                                            tj30 tj30VarC = zq8.c(zx7Var, false);
                                            int iHashCode = Long.hashCode(fetVar3.T);
                                            bh90 bh90VarM = fetVar3.m();
                                            mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                                            mkd.c0.getClass();
                                            fetVar3.i0();
                                            if (fetVar3.S) {
                                                fetVar3.l(pcyVar);
                                            } else {
                                                fetVar3.r0();
                                            }
                                            jpm0.o(fetVar3, tj30VarC, shdVar4);
                                            jpm0.o(fetVar3, bh90VarM, shdVar3);
                                            vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
                                            jpm0.o(fetVar3, mm40VarC0, shdVar);
                                            mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                                            mdm mdmVar = ((rng0) ung0Var).c;
                                            boolean zG = fetVar3.g(function2);
                                            Object objP2 = fetVar3.P();
                                            if (zG || objP2 == obj4) {
                                                r8 = 0;
                                                objP2 = new dng0(function2, (byte) 0);
                                                fetVar3.o0(objP2);
                                            } else {
                                                r8 = 0;
                                            }
                                            piz.b(mm40VarB, mdmVar, (Function0) objP2, fetVar3, r8);
                                            fetVar3.r(true);
                                            fetVar3.r(r8);
                                        } else if (ung0Var instanceof tng0) {
                                            fetVar3.e0(1156558737);
                                            n0q n0qVar2 = o7k0.c;
                                            tj30 tj30VarC2 = zq8.c(zx7Var, false);
                                            int iHashCode2 = Long.hashCode(fetVar3.T);
                                            bh90 bh90VarM2 = fetVar3.m();
                                            mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar2);
                                            mkd.c0.getClass();
                                            fetVar3.i0();
                                            if (fetVar3.S) {
                                                fetVar3.l(pcyVar);
                                            } else {
                                                fetVar3.r0();
                                            }
                                            jpm0.o(fetVar3, tj30VarC2, shdVar4);
                                            jpm0.o(fetVar3, bh90VarM2, shdVar3);
                                            vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
                                            jpm0.o(fetVar3, mm40VarC1, shdVar);
                                            mm40 mm40VarE = s5x0.I(jm40Var, hh80Var11).e(n0qVar2);
                                            boolean z18 = z12;
                                            hh80 hh80Var12 = hh80VarT;
                                            if (z18 || (z11 && ((tng0) ung0Var).e != null)) {
                                                z15 = false;
                                                fetVar3.e0(1979280365);
                                                ch80VarG = knm0.g(hh80Var12, fetVar3);
                                                fetVar3.r(false);
                                            } else {
                                                fetVar3.e0(1979374822);
                                                ch80VarG = knm0.f(hh80Var12, fetVar3);
                                                z15 = false;
                                                fetVar3.r(false);
                                            }
                                            ch80 ch80Var = ch80VarG;
                                            tng0 tng0Var = (tng0) ung0Var;
                                            a4x a4xVar = tng0Var.c;
                                            boolean z19 = z10;
                                            boolean z20 = (!z19 || tng0Var.d == null) ? z15 : true;
                                            boolean zG2 = fetVar3.g(function2);
                                            Object objP3 = fetVar3.P();
                                            if (zG2 || objP3 == obj4) {
                                                objP3 = new ru80(function2, (byte) 11);
                                                fetVar3.o0(objP3);
                                            }
                                            fet fetVar4 = fetVar3;
                                            piz.w(a4xVar, z20, (Function2) objP3, mm40VarE, ch80Var, fetVar4, 0);
                                            if (!z19 || tng0Var.e == null) {
                                                fetVar4.e0(1980588038);
                                                fetVar4.r(z15);
                                                fetVar2 = fetVar4;
                                            } else {
                                                fetVar4.e0(1980151744);
                                                mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.h);
                                                mtl mtlVar = tng0Var.e;
                                                zcl zclVar = qmk.f28987a;
                                                lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                boolean zG3 = fetVar4.g(function2);
                                                Object objP4 = fetVar4.P();
                                                if (zG3 || objP4 == obj4) {
                                                    objP4 = new a9g0(function2, (byte) 1);
                                                    fetVar4.o0(objP4);
                                                }
                                                bkb.f(mm40VarB2, mtlVar, null, false, lh80VarU, (Function1) objP4, fetVar4, 0, 12);
                                                fet fetVar5 = fetVar4;
                                                fetVar5.r(z15);
                                                fetVar2 = fetVar5;
                                            }
                                            fetVar2.r(true);
                                            fetVar2.r(z15);
                                        } else {
                                            z14 = false;
                                        }
                                    }
                                } else {
                                    z14 = false;
                                }
                                throw b1j.f(1156538291, fetVar3, z14);
                            }
                            fetVar3.X();
                            return Unit.f46060a;
                        }
                    }, fetVar), fetVar, (i10 & 14) | 805306416, 444);
                    z8 = z11;
                    z9 = z12;
                    z4 = z10;
                    hh80Var3 = hh80Var10;
                } else {
                    fetVar.X();
                    z8 = z5;
                    z9 = z6;
                    hh80Var3 = hh80Var2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.cng0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            piz.x(mm40Var, l7m0Var, z4, z8, z9, hh80Var3, function1, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 196608;
            hh80Var2 = hh80Var;
            if ((1572864 & i) == 0) {
                if (fetVar.i(function1)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i10 = i3;
            if ((599187 & i10) != 599186) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (fetVar.U(i10 & 1, z7)) {
                if (i12 != 0) {
                    z10 = false;
                } else {
                    z10 = z4;
                }
                if (i4 != 0) {
                    z11 = true;
                } else {
                    z11 = z5;
                }
                if (i6 != 0) {
                    z12 = false;
                } else {
                    z12 = z6;
                }
                if (i8 != 0) {
                    hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                } else {
                    hh80VarT = hh80Var2;
                }
                if ((3670016 & i10) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objP = fetVar.P();
                if (z13) {
                    objP = new pme0(function1, (byte) 28);
                    fetVar.o0(objP);
                } else {
                    objP = new pme0(function1, (byte) 28);
                    fetVar.o0(objP);
                }
                knx.i(false, (Function0) objP, fetVar, 0, 1);
                hh80 hh80Var11 = hh80VarT;
                m8x.y(mm40Var, u1c.M(-229790623, new t5e0(function1, l7m0Var), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(711817206, new xdr() { // from class: a.bng0
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r8v13 */
                    /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r8v15 */
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        boolean z14;
                        boolean z15;
                        ch80 ch80VarG;
                        fet fetVar2;
                        ?? r8;
                        shd shdVar = gqw0.v;
                        shd shdVar2 = gqw0.y;
                        shd shdVar3 = gqw0.w;
                        shd shdVar4 = gqw0.x;
                        hh80 hh80Var12 = (hh80) obj;
                        fet fetVar3 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        zx7 zx7Var = gqw0.f11754a;
                        hh80Var12.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar3.g(hh80Var12) ? 4 : 2;
                        }
                        if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                            ung0 ung0Var = (ung0) l7m0Var.getValue();
                            if (ung0Var != null) {
                                boolean z16 = ung0Var instanceof sng0;
                                jm40 jm40Var = jm40.b;
                                if (z16) {
                                    fetVar3.e0(1156538511);
                                    piz.h(0, fetVar3, s5x0.I(jm40Var, hh80Var12).e(o7k0.c));
                                    fetVar3.r(false);
                                } else {
                                    boolean z17 = ung0Var instanceof rng0;
                                    Function1 function2 = function1;
                                    jr8 jr8Var = jr8.f16991a;
                                    pcy pcyVar = e7z.u1;
                                    Object obj4 = ukd.f35823a;
                                    if (z17) {
                                        fetVar3.e0(1156544937);
                                        n0q n0qVar = o7k0.c;
                                        tj30 tj30VarC = zq8.c(zx7Var, false);
                                        int iHashCode = Long.hashCode(fetVar3.T);
                                        bh90 bh90VarM = fetVar3.m();
                                        mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                                        mkd.c0.getClass();
                                        fetVar3.i0();
                                        if (fetVar3.S) {
                                            fetVar3.l(pcyVar);
                                        } else {
                                            fetVar3.r0();
                                        }
                                        jpm0.o(fetVar3, tj30VarC, shdVar4);
                                        jpm0.o(fetVar3, bh90VarM, shdVar3);
                                        vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
                                        jpm0.o(fetVar3, mm40VarC0, shdVar);
                                        mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                                        mdm mdmVar = ((rng0) ung0Var).c;
                                        boolean zG = fetVar3.g(function2);
                                        Object objP2 = fetVar3.P();
                                        if (zG || objP2 == obj4) {
                                            r8 = 0;
                                            objP2 = new dng0(function2, (byte) 0);
                                            fetVar3.o0(objP2);
                                        } else {
                                            r8 = 0;
                                        }
                                        piz.b(mm40VarB, mdmVar, (Function0) objP2, fetVar3, r8);
                                        fetVar3.r(true);
                                        fetVar3.r(r8);
                                    } else if (ung0Var instanceof tng0) {
                                        fetVar3.e0(1156558737);
                                        n0q n0qVar2 = o7k0.c;
                                        tj30 tj30VarC2 = zq8.c(zx7Var, false);
                                        int iHashCode2 = Long.hashCode(fetVar3.T);
                                        bh90 bh90VarM2 = fetVar3.m();
                                        mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar2);
                                        mkd.c0.getClass();
                                        fetVar3.i0();
                                        if (fetVar3.S) {
                                            fetVar3.l(pcyVar);
                                        } else {
                                            fetVar3.r0();
                                        }
                                        jpm0.o(fetVar3, tj30VarC2, shdVar4);
                                        jpm0.o(fetVar3, bh90VarM2, shdVar3);
                                        vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
                                        jpm0.o(fetVar3, mm40VarC1, shdVar);
                                        mm40 mm40VarE = s5x0.I(jm40Var, hh80Var12).e(n0qVar2);
                                        boolean z18 = z12;
                                        hh80 hh80Var13 = hh80VarT;
                                        if (z18 || (z11 && ((tng0) ung0Var).e != null)) {
                                            z15 = false;
                                            fetVar3.e0(1979280365);
                                            ch80VarG = knm0.g(hh80Var13, fetVar3);
                                            fetVar3.r(false);
                                        } else {
                                            fetVar3.e0(1979374822);
                                            ch80VarG = knm0.f(hh80Var13, fetVar3);
                                            z15 = false;
                                            fetVar3.r(false);
                                        }
                                        ch80 ch80Var = ch80VarG;
                                        tng0 tng0Var = (tng0) ung0Var;
                                        a4x a4xVar = tng0Var.c;
                                        boolean z19 = z10;
                                        boolean z20 = (!z19 || tng0Var.d == null) ? z15 : true;
                                        boolean zG2 = fetVar3.g(function2);
                                        Object objP3 = fetVar3.P();
                                        if (zG2 || objP3 == obj4) {
                                            objP3 = new ru80(function2, (byte) 11);
                                            fetVar3.o0(objP3);
                                        }
                                        fet fetVar4 = fetVar3;
                                        piz.w(a4xVar, z20, (Function2) objP3, mm40VarE, ch80Var, fetVar4, 0);
                                        if (!z19 || tng0Var.e == null) {
                                            fetVar4.e0(1980588038);
                                            fetVar4.r(z15);
                                            fetVar2 = fetVar4;
                                        } else {
                                            fetVar4.e0(1980151744);
                                            mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.h);
                                            mtl mtlVar = tng0Var.e;
                                            zcl zclVar = qmk.f28987a;
                                            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                                            boolean zG3 = fetVar4.g(function2);
                                            Object objP4 = fetVar4.P();
                                            if (zG3 || objP4 == obj4) {
                                                objP4 = new a9g0(function2, (byte) 1);
                                                fetVar4.o0(objP4);
                                            }
                                            bkb.f(mm40VarB2, mtlVar, null, false, lh80VarU, (Function1) objP4, fetVar4, 0, 12);
                                            fet fetVar5 = fetVar4;
                                            fetVar5.r(z15);
                                            fetVar2 = fetVar5;
                                        }
                                        fetVar2.r(true);
                                        fetVar2.r(z15);
                                    } else {
                                        z14 = false;
                                    }
                                }
                            } else {
                                z14 = false;
                            }
                            throw b1j.f(1156538291, fetVar3, z14);
                        }
                        fetVar3.X();
                        return Unit.f46060a;
                    }
                }, fetVar), fetVar, (i10 & 14) | 805306416, 444);
                z8 = z11;
                z9 = z12;
                z4 = z10;
                hh80Var3 = hh80Var11;
            } else {
                fetVar.X();
                z8 = z5;
                z9 = z6;
                hh80Var3 = hh80Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.cng0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        piz.x(mm40Var, l7m0Var, z4, z8, z9, hh80Var3, function1, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 384;
        z4 = z;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                z5 = z2;
                if (fetVar.h(z5)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    z6 = z3;
                    if (fetVar.h(z6)) {
                        i7 = 16384;
                    } else {
                        i7 = 8192;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        hh80Var2 = hh80Var;
                        if (fetVar.g(hh80Var2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if (fetVar.i(function1)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i10 = i3;
                    if ((599187 & i10) != 599186) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (fetVar.U(i10 & 1, z7)) {
                        if (i12 != 0) {
                            z10 = false;
                        } else {
                            z10 = z4;
                        }
                        if (i4 != 0) {
                            z11 = true;
                        } else {
                            z11 = z5;
                        }
                        if (i6 != 0) {
                            z12 = false;
                        } else {
                            z12 = z6;
                        }
                        if (i8 != 0) {
                            hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                        } else {
                            hh80VarT = hh80Var2;
                        }
                        if ((3670016 & i10) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        objP = fetVar.P();
                        if (z13) {
                            objP = new pme0(function1, (byte) 28);
                            fetVar.o0(objP);
                        } else {
                            objP = new pme0(function1, (byte) 28);
                            fetVar.o0(objP);
                        }
                        knx.i(false, (Function0) objP, fetVar, 0, 1);
                        hh80 hh80Var12 = hh80VarT;
                        m8x.y(mm40Var, u1c.M(-229790623, new t5e0(function1, l7m0Var), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(711817206, new xdr() { // from class: a.bng0
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r8v13 */
                            /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r8v15 */
                            @Override // a.xdr
                            public final Object F(Object obj, Object obj2, Object obj3) {
                                boolean z14;
                                boolean z15;
                                ch80 ch80VarG;
                                fet fetVar2;
                                ?? r8;
                                shd shdVar = gqw0.v;
                                shd shdVar2 = gqw0.y;
                                shd shdVar3 = gqw0.w;
                                shd shdVar4 = gqw0.x;
                                hh80 hh80Var13 = (hh80) obj;
                                fet fetVar3 = (fet) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                zx7 zx7Var = gqw0.f11754a;
                                hh80Var13.getClass();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= fetVar3.g(hh80Var13) ? 4 : 2;
                                }
                                if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                    ung0 ung0Var = (ung0) l7m0Var.getValue();
                                    if (ung0Var != null) {
                                        boolean z16 = ung0Var instanceof sng0;
                                        jm40 jm40Var = jm40.b;
                                        if (z16) {
                                            fetVar3.e0(1156538511);
                                            piz.h(0, fetVar3, s5x0.I(jm40Var, hh80Var13).e(o7k0.c));
                                            fetVar3.r(false);
                                        } else {
                                            boolean z17 = ung0Var instanceof rng0;
                                            Function1 function2 = function1;
                                            jr8 jr8Var = jr8.f16991a;
                                            pcy pcyVar = e7z.u1;
                                            Object obj4 = ukd.f35823a;
                                            if (z17) {
                                                fetVar3.e0(1156544937);
                                                n0q n0qVar = o7k0.c;
                                                tj30 tj30VarC = zq8.c(zx7Var, false);
                                                int iHashCode = Long.hashCode(fetVar3.T);
                                                bh90 bh90VarM = fetVar3.m();
                                                mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                                                mkd.c0.getClass();
                                                fetVar3.i0();
                                                if (fetVar3.S) {
                                                    fetVar3.l(pcyVar);
                                                } else {
                                                    fetVar3.r0();
                                                }
                                                jpm0.o(fetVar3, tj30VarC, shdVar4);
                                                jpm0.o(fetVar3, bh90VarM, shdVar3);
                                                vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
                                                jpm0.o(fetVar3, mm40VarC0, shdVar);
                                                mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                                                mdm mdmVar = ((rng0) ung0Var).c;
                                                boolean zG = fetVar3.g(function2);
                                                Object objP2 = fetVar3.P();
                                                if (zG || objP2 == obj4) {
                                                    r8 = 0;
                                                    objP2 = new dng0(function2, (byte) 0);
                                                    fetVar3.o0(objP2);
                                                } else {
                                                    r8 = 0;
                                                }
                                                piz.b(mm40VarB, mdmVar, (Function0) objP2, fetVar3, r8);
                                                fetVar3.r(true);
                                                fetVar3.r(r8);
                                            } else if (ung0Var instanceof tng0) {
                                                fetVar3.e0(1156558737);
                                                n0q n0qVar2 = o7k0.c;
                                                tj30 tj30VarC2 = zq8.c(zx7Var, false);
                                                int iHashCode2 = Long.hashCode(fetVar3.T);
                                                bh90 bh90VarM2 = fetVar3.m();
                                                mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar2);
                                                mkd.c0.getClass();
                                                fetVar3.i0();
                                                if (fetVar3.S) {
                                                    fetVar3.l(pcyVar);
                                                } else {
                                                    fetVar3.r0();
                                                }
                                                jpm0.o(fetVar3, tj30VarC2, shdVar4);
                                                jpm0.o(fetVar3, bh90VarM2, shdVar3);
                                                vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
                                                jpm0.o(fetVar3, mm40VarC1, shdVar);
                                                mm40 mm40VarE = s5x0.I(jm40Var, hh80Var13).e(n0qVar2);
                                                boolean z18 = z12;
                                                hh80 hh80Var14 = hh80VarT;
                                                if (z18 || (z11 && ((tng0) ung0Var).e != null)) {
                                                    z15 = false;
                                                    fetVar3.e0(1979280365);
                                                    ch80VarG = knm0.g(hh80Var14, fetVar3);
                                                    fetVar3.r(false);
                                                } else {
                                                    fetVar3.e0(1979374822);
                                                    ch80VarG = knm0.f(hh80Var14, fetVar3);
                                                    z15 = false;
                                                    fetVar3.r(false);
                                                }
                                                ch80 ch80Var = ch80VarG;
                                                tng0 tng0Var = (tng0) ung0Var;
                                                a4x a4xVar = tng0Var.c;
                                                boolean z19 = z10;
                                                boolean z20 = (!z19 || tng0Var.d == null) ? z15 : true;
                                                boolean zG2 = fetVar3.g(function2);
                                                Object objP3 = fetVar3.P();
                                                if (zG2 || objP3 == obj4) {
                                                    objP3 = new ru80(function2, (byte) 11);
                                                    fetVar3.o0(objP3);
                                                }
                                                fet fetVar4 = fetVar3;
                                                piz.w(a4xVar, z20, (Function2) objP3, mm40VarE, ch80Var, fetVar4, 0);
                                                if (!z19 || tng0Var.e == null) {
                                                    fetVar4.e0(1980588038);
                                                    fetVar4.r(z15);
                                                    fetVar2 = fetVar4;
                                                } else {
                                                    fetVar4.e0(1980151744);
                                                    mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.h);
                                                    mtl mtlVar = tng0Var.e;
                                                    zcl zclVar = qmk.f28987a;
                                                    lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                    boolean zG3 = fetVar4.g(function2);
                                                    Object objP4 = fetVar4.P();
                                                    if (zG3 || objP4 == obj4) {
                                                        objP4 = new a9g0(function2, (byte) 1);
                                                        fetVar4.o0(objP4);
                                                    }
                                                    bkb.f(mm40VarB2, mtlVar, null, false, lh80VarU, (Function1) objP4, fetVar4, 0, 12);
                                                    fet fetVar5 = fetVar4;
                                                    fetVar5.r(z15);
                                                    fetVar2 = fetVar5;
                                                }
                                                fetVar2.r(true);
                                                fetVar2.r(z15);
                                            } else {
                                                z14 = false;
                                            }
                                        }
                                    } else {
                                        z14 = false;
                                    }
                                    throw b1j.f(1156538291, fetVar3, z14);
                                }
                                fetVar3.X();
                                return Unit.f46060a;
                            }
                        }, fetVar), fetVar, (i10 & 14) | 805306416, 444);
                        z8 = z11;
                        z9 = z12;
                        z4 = z10;
                        hh80Var3 = hh80Var12;
                    } else {
                        fetVar.X();
                        z8 = z5;
                        z9 = z6;
                        hh80Var3 = hh80Var2;
                    }
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2() { // from class: a.cng0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                piz.x(mm40Var, l7m0Var, z4, z8, z9, hh80Var3, function1, (fet) obj, x8x.L(i | 1), i2);
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                i3 |= 196608;
                hh80Var2 = hh80Var;
                if ((1572864 & i) == 0) {
                    if (fetVar.i(function1)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i10 = i3;
                if ((599187 & i10) != 599186) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (fetVar.U(i10 & 1, z7)) {
                    if (i12 != 0) {
                        z10 = false;
                    } else {
                        z10 = z4;
                    }
                    if (i4 != 0) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                    if (i6 != 0) {
                        z12 = false;
                    } else {
                        z12 = z6;
                    }
                    if (i8 != 0) {
                        hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                    } else {
                        hh80VarT = hh80Var2;
                    }
                    if ((3670016 & i10) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objP = fetVar.P();
                    if (z13) {
                        objP = new pme0(function1, (byte) 28);
                        fetVar.o0(objP);
                    } else {
                        objP = new pme0(function1, (byte) 28);
                        fetVar.o0(objP);
                    }
                    knx.i(false, (Function0) objP, fetVar, 0, 1);
                    hh80 hh80Var13 = hh80VarT;
                    m8x.y(mm40Var, u1c.M(-229790623, new t5e0(function1, l7m0Var), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(711817206, new xdr() { // from class: a.bng0
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r8v13 */
                        /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r8v15 */
                        @Override // a.xdr
                        public final Object F(Object obj, Object obj2, Object obj3) {
                            boolean z14;
                            boolean z15;
                            ch80 ch80VarG;
                            fet fetVar2;
                            ?? r8;
                            shd shdVar = gqw0.v;
                            shd shdVar2 = gqw0.y;
                            shd shdVar3 = gqw0.w;
                            shd shdVar4 = gqw0.x;
                            hh80 hh80Var14 = (hh80) obj;
                            fet fetVar3 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            zx7 zx7Var = gqw0.f11754a;
                            hh80Var14.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar3.g(hh80Var14) ? 4 : 2;
                            }
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                ung0 ung0Var = (ung0) l7m0Var.getValue();
                                if (ung0Var != null) {
                                    boolean z16 = ung0Var instanceof sng0;
                                    jm40 jm40Var = jm40.b;
                                    if (z16) {
                                        fetVar3.e0(1156538511);
                                        piz.h(0, fetVar3, s5x0.I(jm40Var, hh80Var14).e(o7k0.c));
                                        fetVar3.r(false);
                                    } else {
                                        boolean z17 = ung0Var instanceof rng0;
                                        Function1 function2 = function1;
                                        jr8 jr8Var = jr8.f16991a;
                                        pcy pcyVar = e7z.u1;
                                        Object obj4 = ukd.f35823a;
                                        if (z17) {
                                            fetVar3.e0(1156544937);
                                            n0q n0qVar = o7k0.c;
                                            tj30 tj30VarC = zq8.c(zx7Var, false);
                                            int iHashCode = Long.hashCode(fetVar3.T);
                                            bh90 bh90VarM = fetVar3.m();
                                            mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                                            mkd.c0.getClass();
                                            fetVar3.i0();
                                            if (fetVar3.S) {
                                                fetVar3.l(pcyVar);
                                            } else {
                                                fetVar3.r0();
                                            }
                                            jpm0.o(fetVar3, tj30VarC, shdVar4);
                                            jpm0.o(fetVar3, bh90VarM, shdVar3);
                                            vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
                                            jpm0.o(fetVar3, mm40VarC0, shdVar);
                                            mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                                            mdm mdmVar = ((rng0) ung0Var).c;
                                            boolean zG = fetVar3.g(function2);
                                            Object objP2 = fetVar3.P();
                                            if (zG || objP2 == obj4) {
                                                r8 = 0;
                                                objP2 = new dng0(function2, (byte) 0);
                                                fetVar3.o0(objP2);
                                            } else {
                                                r8 = 0;
                                            }
                                            piz.b(mm40VarB, mdmVar, (Function0) objP2, fetVar3, r8);
                                            fetVar3.r(true);
                                            fetVar3.r(r8);
                                        } else if (ung0Var instanceof tng0) {
                                            fetVar3.e0(1156558737);
                                            n0q n0qVar2 = o7k0.c;
                                            tj30 tj30VarC2 = zq8.c(zx7Var, false);
                                            int iHashCode2 = Long.hashCode(fetVar3.T);
                                            bh90 bh90VarM2 = fetVar3.m();
                                            mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar2);
                                            mkd.c0.getClass();
                                            fetVar3.i0();
                                            if (fetVar3.S) {
                                                fetVar3.l(pcyVar);
                                            } else {
                                                fetVar3.r0();
                                            }
                                            jpm0.o(fetVar3, tj30VarC2, shdVar4);
                                            jpm0.o(fetVar3, bh90VarM2, shdVar3);
                                            vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
                                            jpm0.o(fetVar3, mm40VarC1, shdVar);
                                            mm40 mm40VarE = s5x0.I(jm40Var, hh80Var14).e(n0qVar2);
                                            boolean z18 = z12;
                                            hh80 hh80Var15 = hh80VarT;
                                            if (z18 || (z11 && ((tng0) ung0Var).e != null)) {
                                                z15 = false;
                                                fetVar3.e0(1979280365);
                                                ch80VarG = knm0.g(hh80Var15, fetVar3);
                                                fetVar3.r(false);
                                            } else {
                                                fetVar3.e0(1979374822);
                                                ch80VarG = knm0.f(hh80Var15, fetVar3);
                                                z15 = false;
                                                fetVar3.r(false);
                                            }
                                            ch80 ch80Var = ch80VarG;
                                            tng0 tng0Var = (tng0) ung0Var;
                                            a4x a4xVar = tng0Var.c;
                                            boolean z19 = z10;
                                            boolean z20 = (!z19 || tng0Var.d == null) ? z15 : true;
                                            boolean zG2 = fetVar3.g(function2);
                                            Object objP3 = fetVar3.P();
                                            if (zG2 || objP3 == obj4) {
                                                objP3 = new ru80(function2, (byte) 11);
                                                fetVar3.o0(objP3);
                                            }
                                            fet fetVar4 = fetVar3;
                                            piz.w(a4xVar, z20, (Function2) objP3, mm40VarE, ch80Var, fetVar4, 0);
                                            if (!z19 || tng0Var.e == null) {
                                                fetVar4.e0(1980588038);
                                                fetVar4.r(z15);
                                                fetVar2 = fetVar4;
                                            } else {
                                                fetVar4.e0(1980151744);
                                                mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.h);
                                                mtl mtlVar = tng0Var.e;
                                                zcl zclVar = qmk.f28987a;
                                                lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                boolean zG3 = fetVar4.g(function2);
                                                Object objP4 = fetVar4.P();
                                                if (zG3 || objP4 == obj4) {
                                                    objP4 = new a9g0(function2, (byte) 1);
                                                    fetVar4.o0(objP4);
                                                }
                                                bkb.f(mm40VarB2, mtlVar, null, false, lh80VarU, (Function1) objP4, fetVar4, 0, 12);
                                                fet fetVar5 = fetVar4;
                                                fetVar5.r(z15);
                                                fetVar2 = fetVar5;
                                            }
                                            fetVar2.r(true);
                                            fetVar2.r(z15);
                                        } else {
                                            z14 = false;
                                        }
                                    }
                                } else {
                                    z14 = false;
                                }
                                throw b1j.f(1156538291, fetVar3, z14);
                            }
                            fetVar3.X();
                            return Unit.f46060a;
                        }
                    }, fetVar), fetVar, (i10 & 14) | 805306416, 444);
                    z8 = z11;
                    z9 = z12;
                    z4 = z10;
                    hh80Var3 = hh80Var13;
                } else {
                    fetVar.X();
                    z8 = z5;
                    z9 = z6;
                    hh80Var3 = hh80Var2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.cng0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            piz.x(mm40Var, l7m0Var, z4, z8, z9, hh80Var3, function1, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 24576;
            z6 = z3;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    hh80Var2 = hh80Var;
                    if (fetVar.g(hh80Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if (fetVar.i(function1)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i10 = i3;
                if ((599187 & i10) != 599186) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (fetVar.U(i10 & 1, z7)) {
                    if (i12 != 0) {
                        z10 = false;
                    } else {
                        z10 = z4;
                    }
                    if (i4 != 0) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                    if (i6 != 0) {
                        z12 = false;
                    } else {
                        z12 = z6;
                    }
                    if (i8 != 0) {
                        hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                    } else {
                        hh80VarT = hh80Var2;
                    }
                    if ((3670016 & i10) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objP = fetVar.P();
                    if (z13) {
                        objP = new pme0(function1, (byte) 28);
                        fetVar.o0(objP);
                    } else {
                        objP = new pme0(function1, (byte) 28);
                        fetVar.o0(objP);
                    }
                    knx.i(false, (Function0) objP, fetVar, 0, 1);
                    hh80 hh80Var14 = hh80VarT;
                    m8x.y(mm40Var, u1c.M(-229790623, new t5e0(function1, l7m0Var), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(711817206, new xdr() { // from class: a.bng0
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r8v13 */
                        /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r8v15 */
                        @Override // a.xdr
                        public final Object F(Object obj, Object obj2, Object obj3) {
                            boolean z14;
                            boolean z15;
                            ch80 ch80VarG;
                            fet fetVar2;
                            ?? r8;
                            shd shdVar = gqw0.v;
                            shd shdVar2 = gqw0.y;
                            shd shdVar3 = gqw0.w;
                            shd shdVar4 = gqw0.x;
                            hh80 hh80Var15 = (hh80) obj;
                            fet fetVar3 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            zx7 zx7Var = gqw0.f11754a;
                            hh80Var15.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar3.g(hh80Var15) ? 4 : 2;
                            }
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                ung0 ung0Var = (ung0) l7m0Var.getValue();
                                if (ung0Var != null) {
                                    boolean z16 = ung0Var instanceof sng0;
                                    jm40 jm40Var = jm40.b;
                                    if (z16) {
                                        fetVar3.e0(1156538511);
                                        piz.h(0, fetVar3, s5x0.I(jm40Var, hh80Var15).e(o7k0.c));
                                        fetVar3.r(false);
                                    } else {
                                        boolean z17 = ung0Var instanceof rng0;
                                        Function1 function2 = function1;
                                        jr8 jr8Var = jr8.f16991a;
                                        pcy pcyVar = e7z.u1;
                                        Object obj4 = ukd.f35823a;
                                        if (z17) {
                                            fetVar3.e0(1156544937);
                                            n0q n0qVar = o7k0.c;
                                            tj30 tj30VarC = zq8.c(zx7Var, false);
                                            int iHashCode = Long.hashCode(fetVar3.T);
                                            bh90 bh90VarM = fetVar3.m();
                                            mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                                            mkd.c0.getClass();
                                            fetVar3.i0();
                                            if (fetVar3.S) {
                                                fetVar3.l(pcyVar);
                                            } else {
                                                fetVar3.r0();
                                            }
                                            jpm0.o(fetVar3, tj30VarC, shdVar4);
                                            jpm0.o(fetVar3, bh90VarM, shdVar3);
                                            vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
                                            jpm0.o(fetVar3, mm40VarC0, shdVar);
                                            mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                                            mdm mdmVar = ((rng0) ung0Var).c;
                                            boolean zG = fetVar3.g(function2);
                                            Object objP2 = fetVar3.P();
                                            if (zG || objP2 == obj4) {
                                                r8 = 0;
                                                objP2 = new dng0(function2, (byte) 0);
                                                fetVar3.o0(objP2);
                                            } else {
                                                r8 = 0;
                                            }
                                            piz.b(mm40VarB, mdmVar, (Function0) objP2, fetVar3, r8);
                                            fetVar3.r(true);
                                            fetVar3.r(r8);
                                        } else if (ung0Var instanceof tng0) {
                                            fetVar3.e0(1156558737);
                                            n0q n0qVar2 = o7k0.c;
                                            tj30 tj30VarC2 = zq8.c(zx7Var, false);
                                            int iHashCode2 = Long.hashCode(fetVar3.T);
                                            bh90 bh90VarM2 = fetVar3.m();
                                            mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar2);
                                            mkd.c0.getClass();
                                            fetVar3.i0();
                                            if (fetVar3.S) {
                                                fetVar3.l(pcyVar);
                                            } else {
                                                fetVar3.r0();
                                            }
                                            jpm0.o(fetVar3, tj30VarC2, shdVar4);
                                            jpm0.o(fetVar3, bh90VarM2, shdVar3);
                                            vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
                                            jpm0.o(fetVar3, mm40VarC1, shdVar);
                                            mm40 mm40VarE = s5x0.I(jm40Var, hh80Var15).e(n0qVar2);
                                            boolean z18 = z12;
                                            hh80 hh80Var16 = hh80VarT;
                                            if (z18 || (z11 && ((tng0) ung0Var).e != null)) {
                                                z15 = false;
                                                fetVar3.e0(1979280365);
                                                ch80VarG = knm0.g(hh80Var16, fetVar3);
                                                fetVar3.r(false);
                                            } else {
                                                fetVar3.e0(1979374822);
                                                ch80VarG = knm0.f(hh80Var16, fetVar3);
                                                z15 = false;
                                                fetVar3.r(false);
                                            }
                                            ch80 ch80Var = ch80VarG;
                                            tng0 tng0Var = (tng0) ung0Var;
                                            a4x a4xVar = tng0Var.c;
                                            boolean z19 = z10;
                                            boolean z20 = (!z19 || tng0Var.d == null) ? z15 : true;
                                            boolean zG2 = fetVar3.g(function2);
                                            Object objP3 = fetVar3.P();
                                            if (zG2 || objP3 == obj4) {
                                                objP3 = new ru80(function2, (byte) 11);
                                                fetVar3.o0(objP3);
                                            }
                                            fet fetVar4 = fetVar3;
                                            piz.w(a4xVar, z20, (Function2) objP3, mm40VarE, ch80Var, fetVar4, 0);
                                            if (!z19 || tng0Var.e == null) {
                                                fetVar4.e0(1980588038);
                                                fetVar4.r(z15);
                                                fetVar2 = fetVar4;
                                            } else {
                                                fetVar4.e0(1980151744);
                                                mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.h);
                                                mtl mtlVar = tng0Var.e;
                                                zcl zclVar = qmk.f28987a;
                                                lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                boolean zG3 = fetVar4.g(function2);
                                                Object objP4 = fetVar4.P();
                                                if (zG3 || objP4 == obj4) {
                                                    objP4 = new a9g0(function2, (byte) 1);
                                                    fetVar4.o0(objP4);
                                                }
                                                bkb.f(mm40VarB2, mtlVar, null, false, lh80VarU, (Function1) objP4, fetVar4, 0, 12);
                                                fet fetVar5 = fetVar4;
                                                fetVar5.r(z15);
                                                fetVar2 = fetVar5;
                                            }
                                            fetVar2.r(true);
                                            fetVar2.r(z15);
                                        } else {
                                            z14 = false;
                                        }
                                    }
                                } else {
                                    z14 = false;
                                }
                                throw b1j.f(1156538291, fetVar3, z14);
                            }
                            fetVar3.X();
                            return Unit.f46060a;
                        }
                    }, fetVar), fetVar, (i10 & 14) | 805306416, 444);
                    z8 = z11;
                    z9 = z12;
                    z4 = z10;
                    hh80Var3 = hh80Var14;
                } else {
                    fetVar.X();
                    z8 = z5;
                    z9 = z6;
                    hh80Var3 = hh80Var2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.cng0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            piz.x(mm40Var, l7m0Var, z4, z8, z9, hh80Var3, function1, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 196608;
            hh80Var2 = hh80Var;
            if ((1572864 & i) == 0) {
                if (fetVar.i(function1)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i10 = i3;
            if ((599187 & i10) != 599186) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (fetVar.U(i10 & 1, z7)) {
                if (i12 != 0) {
                    z10 = false;
                } else {
                    z10 = z4;
                }
                if (i4 != 0) {
                    z11 = true;
                } else {
                    z11 = z5;
                }
                if (i6 != 0) {
                    z12 = false;
                } else {
                    z12 = z6;
                }
                if (i8 != 0) {
                    hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                } else {
                    hh80VarT = hh80Var2;
                }
                if ((3670016 & i10) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objP = fetVar.P();
                if (z13) {
                    objP = new pme0(function1, (byte) 28);
                    fetVar.o0(objP);
                } else {
                    objP = new pme0(function1, (byte) 28);
                    fetVar.o0(objP);
                }
                knx.i(false, (Function0) objP, fetVar, 0, 1);
                hh80 hh80Var15 = hh80VarT;
                m8x.y(mm40Var, u1c.M(-229790623, new t5e0(function1, l7m0Var), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(711817206, new xdr() { // from class: a.bng0
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r8v13 */
                    /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r8v15 */
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        boolean z14;
                        boolean z15;
                        ch80 ch80VarG;
                        fet fetVar2;
                        ?? r8;
                        shd shdVar = gqw0.v;
                        shd shdVar2 = gqw0.y;
                        shd shdVar3 = gqw0.w;
                        shd shdVar4 = gqw0.x;
                        hh80 hh80Var16 = (hh80) obj;
                        fet fetVar3 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        zx7 zx7Var = gqw0.f11754a;
                        hh80Var16.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar3.g(hh80Var16) ? 4 : 2;
                        }
                        if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                            ung0 ung0Var = (ung0) l7m0Var.getValue();
                            if (ung0Var != null) {
                                boolean z16 = ung0Var instanceof sng0;
                                jm40 jm40Var = jm40.b;
                                if (z16) {
                                    fetVar3.e0(1156538511);
                                    piz.h(0, fetVar3, s5x0.I(jm40Var, hh80Var16).e(o7k0.c));
                                    fetVar3.r(false);
                                } else {
                                    boolean z17 = ung0Var instanceof rng0;
                                    Function1 function2 = function1;
                                    jr8 jr8Var = jr8.f16991a;
                                    pcy pcyVar = e7z.u1;
                                    Object obj4 = ukd.f35823a;
                                    if (z17) {
                                        fetVar3.e0(1156544937);
                                        n0q n0qVar = o7k0.c;
                                        tj30 tj30VarC = zq8.c(zx7Var, false);
                                        int iHashCode = Long.hashCode(fetVar3.T);
                                        bh90 bh90VarM = fetVar3.m();
                                        mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                                        mkd.c0.getClass();
                                        fetVar3.i0();
                                        if (fetVar3.S) {
                                            fetVar3.l(pcyVar);
                                        } else {
                                            fetVar3.r0();
                                        }
                                        jpm0.o(fetVar3, tj30VarC, shdVar4);
                                        jpm0.o(fetVar3, bh90VarM, shdVar3);
                                        vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
                                        jpm0.o(fetVar3, mm40VarC0, shdVar);
                                        mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                                        mdm mdmVar = ((rng0) ung0Var).c;
                                        boolean zG = fetVar3.g(function2);
                                        Object objP2 = fetVar3.P();
                                        if (zG || objP2 == obj4) {
                                            r8 = 0;
                                            objP2 = new dng0(function2, (byte) 0);
                                            fetVar3.o0(objP2);
                                        } else {
                                            r8 = 0;
                                        }
                                        piz.b(mm40VarB, mdmVar, (Function0) objP2, fetVar3, r8);
                                        fetVar3.r(true);
                                        fetVar3.r(r8);
                                    } else if (ung0Var instanceof tng0) {
                                        fetVar3.e0(1156558737);
                                        n0q n0qVar2 = o7k0.c;
                                        tj30 tj30VarC2 = zq8.c(zx7Var, false);
                                        int iHashCode2 = Long.hashCode(fetVar3.T);
                                        bh90 bh90VarM2 = fetVar3.m();
                                        mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar2);
                                        mkd.c0.getClass();
                                        fetVar3.i0();
                                        if (fetVar3.S) {
                                            fetVar3.l(pcyVar);
                                        } else {
                                            fetVar3.r0();
                                        }
                                        jpm0.o(fetVar3, tj30VarC2, shdVar4);
                                        jpm0.o(fetVar3, bh90VarM2, shdVar3);
                                        vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
                                        jpm0.o(fetVar3, mm40VarC1, shdVar);
                                        mm40 mm40VarE = s5x0.I(jm40Var, hh80Var16).e(n0qVar2);
                                        boolean z18 = z12;
                                        hh80 hh80Var17 = hh80VarT;
                                        if (z18 || (z11 && ((tng0) ung0Var).e != null)) {
                                            z15 = false;
                                            fetVar3.e0(1979280365);
                                            ch80VarG = knm0.g(hh80Var17, fetVar3);
                                            fetVar3.r(false);
                                        } else {
                                            fetVar3.e0(1979374822);
                                            ch80VarG = knm0.f(hh80Var17, fetVar3);
                                            z15 = false;
                                            fetVar3.r(false);
                                        }
                                        ch80 ch80Var = ch80VarG;
                                        tng0 tng0Var = (tng0) ung0Var;
                                        a4x a4xVar = tng0Var.c;
                                        boolean z19 = z10;
                                        boolean z20 = (!z19 || tng0Var.d == null) ? z15 : true;
                                        boolean zG2 = fetVar3.g(function2);
                                        Object objP3 = fetVar3.P();
                                        if (zG2 || objP3 == obj4) {
                                            objP3 = new ru80(function2, (byte) 11);
                                            fetVar3.o0(objP3);
                                        }
                                        fet fetVar4 = fetVar3;
                                        piz.w(a4xVar, z20, (Function2) objP3, mm40VarE, ch80Var, fetVar4, 0);
                                        if (!z19 || tng0Var.e == null) {
                                            fetVar4.e0(1980588038);
                                            fetVar4.r(z15);
                                            fetVar2 = fetVar4;
                                        } else {
                                            fetVar4.e0(1980151744);
                                            mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.h);
                                            mtl mtlVar = tng0Var.e;
                                            zcl zclVar = qmk.f28987a;
                                            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                                            boolean zG3 = fetVar4.g(function2);
                                            Object objP4 = fetVar4.P();
                                            if (zG3 || objP4 == obj4) {
                                                objP4 = new a9g0(function2, (byte) 1);
                                                fetVar4.o0(objP4);
                                            }
                                            bkb.f(mm40VarB2, mtlVar, null, false, lh80VarU, (Function1) objP4, fetVar4, 0, 12);
                                            fet fetVar5 = fetVar4;
                                            fetVar5.r(z15);
                                            fetVar2 = fetVar5;
                                        }
                                        fetVar2.r(true);
                                        fetVar2.r(z15);
                                    } else {
                                        z14 = false;
                                    }
                                }
                            } else {
                                z14 = false;
                            }
                            throw b1j.f(1156538291, fetVar3, z14);
                        }
                        fetVar3.X();
                        return Unit.f46060a;
                    }
                }, fetVar), fetVar, (i10 & 14) | 805306416, 444);
                z8 = z11;
                z9 = z12;
                z4 = z10;
                hh80Var3 = hh80Var15;
            } else {
                fetVar.X();
                z8 = z5;
                z9 = z6;
                hh80Var3 = hh80Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.cng0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        piz.x(mm40Var, l7m0Var, z4, z8, z9, hh80Var3, function1, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 3072;
        z5 = z2;
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                z6 = z3;
                if (fetVar.h(z6)) {
                    i7 = 16384;
                } else {
                    i7 = 8192;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    hh80Var2 = hh80Var;
                    if (fetVar.g(hh80Var2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if (fetVar.i(function1)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i10 = i3;
                if ((599187 & i10) != 599186) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (fetVar.U(i10 & 1, z7)) {
                    if (i12 != 0) {
                        z10 = false;
                    } else {
                        z10 = z4;
                    }
                    if (i4 != 0) {
                        z11 = true;
                    } else {
                        z11 = z5;
                    }
                    if (i6 != 0) {
                        z12 = false;
                    } else {
                        z12 = z6;
                    }
                    if (i8 != 0) {
                        hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                    } else {
                        hh80VarT = hh80Var2;
                    }
                    if ((3670016 & i10) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objP = fetVar.P();
                    if (z13) {
                        objP = new pme0(function1, (byte) 28);
                        fetVar.o0(objP);
                    } else {
                        objP = new pme0(function1, (byte) 28);
                        fetVar.o0(objP);
                    }
                    knx.i(false, (Function0) objP, fetVar, 0, 1);
                    hh80 hh80Var16 = hh80VarT;
                    m8x.y(mm40Var, u1c.M(-229790623, new t5e0(function1, l7m0Var), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(711817206, new xdr() { // from class: a.bng0
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r8v13 */
                        /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r8v15 */
                        @Override // a.xdr
                        public final Object F(Object obj, Object obj2, Object obj3) {
                            boolean z14;
                            boolean z15;
                            ch80 ch80VarG;
                            fet fetVar2;
                            ?? r8;
                            shd shdVar = gqw0.v;
                            shd shdVar2 = gqw0.y;
                            shd shdVar3 = gqw0.w;
                            shd shdVar4 = gqw0.x;
                            hh80 hh80Var17 = (hh80) obj;
                            fet fetVar3 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            zx7 zx7Var = gqw0.f11754a;
                            hh80Var17.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar3.g(hh80Var17) ? 4 : 2;
                            }
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                ung0 ung0Var = (ung0) l7m0Var.getValue();
                                if (ung0Var != null) {
                                    boolean z16 = ung0Var instanceof sng0;
                                    jm40 jm40Var = jm40.b;
                                    if (z16) {
                                        fetVar3.e0(1156538511);
                                        piz.h(0, fetVar3, s5x0.I(jm40Var, hh80Var17).e(o7k0.c));
                                        fetVar3.r(false);
                                    } else {
                                        boolean z17 = ung0Var instanceof rng0;
                                        Function1 function2 = function1;
                                        jr8 jr8Var = jr8.f16991a;
                                        pcy pcyVar = e7z.u1;
                                        Object obj4 = ukd.f35823a;
                                        if (z17) {
                                            fetVar3.e0(1156544937);
                                            n0q n0qVar = o7k0.c;
                                            tj30 tj30VarC = zq8.c(zx7Var, false);
                                            int iHashCode = Long.hashCode(fetVar3.T);
                                            bh90 bh90VarM = fetVar3.m();
                                            mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                                            mkd.c0.getClass();
                                            fetVar3.i0();
                                            if (fetVar3.S) {
                                                fetVar3.l(pcyVar);
                                            } else {
                                                fetVar3.r0();
                                            }
                                            jpm0.o(fetVar3, tj30VarC, shdVar4);
                                            jpm0.o(fetVar3, bh90VarM, shdVar3);
                                            vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
                                            jpm0.o(fetVar3, mm40VarC0, shdVar);
                                            mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                                            mdm mdmVar = ((rng0) ung0Var).c;
                                            boolean zG = fetVar3.g(function2);
                                            Object objP2 = fetVar3.P();
                                            if (zG || objP2 == obj4) {
                                                r8 = 0;
                                                objP2 = new dng0(function2, (byte) 0);
                                                fetVar3.o0(objP2);
                                            } else {
                                                r8 = 0;
                                            }
                                            piz.b(mm40VarB, mdmVar, (Function0) objP2, fetVar3, r8);
                                            fetVar3.r(true);
                                            fetVar3.r(r8);
                                        } else if (ung0Var instanceof tng0) {
                                            fetVar3.e0(1156558737);
                                            n0q n0qVar2 = o7k0.c;
                                            tj30 tj30VarC2 = zq8.c(zx7Var, false);
                                            int iHashCode2 = Long.hashCode(fetVar3.T);
                                            bh90 bh90VarM2 = fetVar3.m();
                                            mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar2);
                                            mkd.c0.getClass();
                                            fetVar3.i0();
                                            if (fetVar3.S) {
                                                fetVar3.l(pcyVar);
                                            } else {
                                                fetVar3.r0();
                                            }
                                            jpm0.o(fetVar3, tj30VarC2, shdVar4);
                                            jpm0.o(fetVar3, bh90VarM2, shdVar3);
                                            vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
                                            jpm0.o(fetVar3, mm40VarC1, shdVar);
                                            mm40 mm40VarE = s5x0.I(jm40Var, hh80Var17).e(n0qVar2);
                                            boolean z18 = z12;
                                            hh80 hh80Var18 = hh80VarT;
                                            if (z18 || (z11 && ((tng0) ung0Var).e != null)) {
                                                z15 = false;
                                                fetVar3.e0(1979280365);
                                                ch80VarG = knm0.g(hh80Var18, fetVar3);
                                                fetVar3.r(false);
                                            } else {
                                                fetVar3.e0(1979374822);
                                                ch80VarG = knm0.f(hh80Var18, fetVar3);
                                                z15 = false;
                                                fetVar3.r(false);
                                            }
                                            ch80 ch80Var = ch80VarG;
                                            tng0 tng0Var = (tng0) ung0Var;
                                            a4x a4xVar = tng0Var.c;
                                            boolean z19 = z10;
                                            boolean z20 = (!z19 || tng0Var.d == null) ? z15 : true;
                                            boolean zG2 = fetVar3.g(function2);
                                            Object objP3 = fetVar3.P();
                                            if (zG2 || objP3 == obj4) {
                                                objP3 = new ru80(function2, (byte) 11);
                                                fetVar3.o0(objP3);
                                            }
                                            fet fetVar4 = fetVar3;
                                            piz.w(a4xVar, z20, (Function2) objP3, mm40VarE, ch80Var, fetVar4, 0);
                                            if (!z19 || tng0Var.e == null) {
                                                fetVar4.e0(1980588038);
                                                fetVar4.r(z15);
                                                fetVar2 = fetVar4;
                                            } else {
                                                fetVar4.e0(1980151744);
                                                mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.h);
                                                mtl mtlVar = tng0Var.e;
                                                zcl zclVar = qmk.f28987a;
                                                lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                                                boolean zG3 = fetVar4.g(function2);
                                                Object objP4 = fetVar4.P();
                                                if (zG3 || objP4 == obj4) {
                                                    objP4 = new a9g0(function2, (byte) 1);
                                                    fetVar4.o0(objP4);
                                                }
                                                bkb.f(mm40VarB2, mtlVar, null, false, lh80VarU, (Function1) objP4, fetVar4, 0, 12);
                                                fet fetVar5 = fetVar4;
                                                fetVar5.r(z15);
                                                fetVar2 = fetVar5;
                                            }
                                            fetVar2.r(true);
                                            fetVar2.r(z15);
                                        } else {
                                            z14 = false;
                                        }
                                    }
                                } else {
                                    z14 = false;
                                }
                                throw b1j.f(1156538291, fetVar3, z14);
                            }
                            fetVar3.X();
                            return Unit.f46060a;
                        }
                    }, fetVar), fetVar, (i10 & 14) | 805306416, 444);
                    z8 = z11;
                    z9 = z12;
                    z4 = z10;
                    hh80Var3 = hh80Var16;
                } else {
                    fetVar.X();
                    z8 = z5;
                    z9 = z6;
                    hh80Var3 = hh80Var2;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.cng0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            piz.x(mm40Var, l7m0Var, z4, z8, z9, hh80Var3, function1, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 196608;
            hh80Var2 = hh80Var;
            if ((1572864 & i) == 0) {
                if (fetVar.i(function1)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i10 = i3;
            if ((599187 & i10) != 599186) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (fetVar.U(i10 & 1, z7)) {
                if (i12 != 0) {
                    z10 = false;
                } else {
                    z10 = z4;
                }
                if (i4 != 0) {
                    z11 = true;
                } else {
                    z11 = z5;
                }
                if (i6 != 0) {
                    z12 = false;
                } else {
                    z12 = z6;
                }
                if (i8 != 0) {
                    hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                } else {
                    hh80VarT = hh80Var2;
                }
                if ((3670016 & i10) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objP = fetVar.P();
                if (z13) {
                    objP = new pme0(function1, (byte) 28);
                    fetVar.o0(objP);
                } else {
                    objP = new pme0(function1, (byte) 28);
                    fetVar.o0(objP);
                }
                knx.i(false, (Function0) objP, fetVar, 0, 1);
                hh80 hh80Var17 = hh80VarT;
                m8x.y(mm40Var, u1c.M(-229790623, new t5e0(function1, l7m0Var), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(711817206, new xdr() { // from class: a.bng0
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r8v13 */
                    /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r8v15 */
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        boolean z14;
                        boolean z15;
                        ch80 ch80VarG;
                        fet fetVar2;
                        ?? r8;
                        shd shdVar = gqw0.v;
                        shd shdVar2 = gqw0.y;
                        shd shdVar3 = gqw0.w;
                        shd shdVar4 = gqw0.x;
                        hh80 hh80Var18 = (hh80) obj;
                        fet fetVar3 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        zx7 zx7Var = gqw0.f11754a;
                        hh80Var18.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar3.g(hh80Var18) ? 4 : 2;
                        }
                        if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                            ung0 ung0Var = (ung0) l7m0Var.getValue();
                            if (ung0Var != null) {
                                boolean z16 = ung0Var instanceof sng0;
                                jm40 jm40Var = jm40.b;
                                if (z16) {
                                    fetVar3.e0(1156538511);
                                    piz.h(0, fetVar3, s5x0.I(jm40Var, hh80Var18).e(o7k0.c));
                                    fetVar3.r(false);
                                } else {
                                    boolean z17 = ung0Var instanceof rng0;
                                    Function1 function2 = function1;
                                    jr8 jr8Var = jr8.f16991a;
                                    pcy pcyVar = e7z.u1;
                                    Object obj4 = ukd.f35823a;
                                    if (z17) {
                                        fetVar3.e0(1156544937);
                                        n0q n0qVar = o7k0.c;
                                        tj30 tj30VarC = zq8.c(zx7Var, false);
                                        int iHashCode = Long.hashCode(fetVar3.T);
                                        bh90 bh90VarM = fetVar3.m();
                                        mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                                        mkd.c0.getClass();
                                        fetVar3.i0();
                                        if (fetVar3.S) {
                                            fetVar3.l(pcyVar);
                                        } else {
                                            fetVar3.r0();
                                        }
                                        jpm0.o(fetVar3, tj30VarC, shdVar4);
                                        jpm0.o(fetVar3, bh90VarM, shdVar3);
                                        vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
                                        jpm0.o(fetVar3, mm40VarC0, shdVar);
                                        mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                                        mdm mdmVar = ((rng0) ung0Var).c;
                                        boolean zG = fetVar3.g(function2);
                                        Object objP2 = fetVar3.P();
                                        if (zG || objP2 == obj4) {
                                            r8 = 0;
                                            objP2 = new dng0(function2, (byte) 0);
                                            fetVar3.o0(objP2);
                                        } else {
                                            r8 = 0;
                                        }
                                        piz.b(mm40VarB, mdmVar, (Function0) objP2, fetVar3, r8);
                                        fetVar3.r(true);
                                        fetVar3.r(r8);
                                    } else if (ung0Var instanceof tng0) {
                                        fetVar3.e0(1156558737);
                                        n0q n0qVar2 = o7k0.c;
                                        tj30 tj30VarC2 = zq8.c(zx7Var, false);
                                        int iHashCode2 = Long.hashCode(fetVar3.T);
                                        bh90 bh90VarM2 = fetVar3.m();
                                        mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar2);
                                        mkd.c0.getClass();
                                        fetVar3.i0();
                                        if (fetVar3.S) {
                                            fetVar3.l(pcyVar);
                                        } else {
                                            fetVar3.r0();
                                        }
                                        jpm0.o(fetVar3, tj30VarC2, shdVar4);
                                        jpm0.o(fetVar3, bh90VarM2, shdVar3);
                                        vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
                                        jpm0.o(fetVar3, mm40VarC1, shdVar);
                                        mm40 mm40VarE = s5x0.I(jm40Var, hh80Var18).e(n0qVar2);
                                        boolean z18 = z12;
                                        hh80 hh80Var19 = hh80VarT;
                                        if (z18 || (z11 && ((tng0) ung0Var).e != null)) {
                                            z15 = false;
                                            fetVar3.e0(1979280365);
                                            ch80VarG = knm0.g(hh80Var19, fetVar3);
                                            fetVar3.r(false);
                                        } else {
                                            fetVar3.e0(1979374822);
                                            ch80VarG = knm0.f(hh80Var19, fetVar3);
                                            z15 = false;
                                            fetVar3.r(false);
                                        }
                                        ch80 ch80Var = ch80VarG;
                                        tng0 tng0Var = (tng0) ung0Var;
                                        a4x a4xVar = tng0Var.c;
                                        boolean z19 = z10;
                                        boolean z20 = (!z19 || tng0Var.d == null) ? z15 : true;
                                        boolean zG2 = fetVar3.g(function2);
                                        Object objP3 = fetVar3.P();
                                        if (zG2 || objP3 == obj4) {
                                            objP3 = new ru80(function2, (byte) 11);
                                            fetVar3.o0(objP3);
                                        }
                                        fet fetVar4 = fetVar3;
                                        piz.w(a4xVar, z20, (Function2) objP3, mm40VarE, ch80Var, fetVar4, 0);
                                        if (!z19 || tng0Var.e == null) {
                                            fetVar4.e0(1980588038);
                                            fetVar4.r(z15);
                                            fetVar2 = fetVar4;
                                        } else {
                                            fetVar4.e0(1980151744);
                                            mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.h);
                                            mtl mtlVar = tng0Var.e;
                                            zcl zclVar = qmk.f28987a;
                                            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                                            boolean zG3 = fetVar4.g(function2);
                                            Object objP4 = fetVar4.P();
                                            if (zG3 || objP4 == obj4) {
                                                objP4 = new a9g0(function2, (byte) 1);
                                                fetVar4.o0(objP4);
                                            }
                                            bkb.f(mm40VarB2, mtlVar, null, false, lh80VarU, (Function1) objP4, fetVar4, 0, 12);
                                            fet fetVar5 = fetVar4;
                                            fetVar5.r(z15);
                                            fetVar2 = fetVar5;
                                        }
                                        fetVar2.r(true);
                                        fetVar2.r(z15);
                                    } else {
                                        z14 = false;
                                    }
                                }
                            } else {
                                z14 = false;
                            }
                            throw b1j.f(1156538291, fetVar3, z14);
                        }
                        fetVar3.X();
                        return Unit.f46060a;
                    }
                }, fetVar), fetVar, (i10 & 14) | 805306416, 444);
                z8 = z11;
                z9 = z12;
                z4 = z10;
                hh80Var3 = hh80Var17;
            } else {
                fetVar.X();
                z8 = z5;
                z9 = z6;
                hh80Var3 = hh80Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.cng0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        piz.x(mm40Var, l7m0Var, z4, z8, z9, hh80Var3, function1, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 24576;
        z6 = z3;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                hh80Var2 = hh80Var;
                if (fetVar.g(hh80Var2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((1572864 & i) == 0) {
                if (fetVar.i(function1)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i10 = i3;
            if ((599187 & i10) != 599186) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (fetVar.U(i10 & 1, z7)) {
                if (i12 != 0) {
                    z10 = false;
                } else {
                    z10 = z4;
                }
                if (i4 != 0) {
                    z11 = true;
                } else {
                    z11 = z5;
                }
                if (i6 != 0) {
                    z12 = false;
                } else {
                    z12 = z6;
                }
                if (i8 != 0) {
                    hh80VarT = s5x0.t(0.0f, 0.0f, 3);
                } else {
                    hh80VarT = hh80Var2;
                }
                if ((3670016 & i10) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objP = fetVar.P();
                if (z13) {
                    objP = new pme0(function1, (byte) 28);
                    fetVar.o0(objP);
                } else {
                    objP = new pme0(function1, (byte) 28);
                    fetVar.o0(objP);
                }
                knx.i(false, (Function0) objP, fetVar, 0, 1);
                hh80 hh80Var18 = hh80VarT;
                m8x.y(mm40Var, u1c.M(-229790623, new t5e0(function1, l7m0Var), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(711817206, new xdr() { // from class: a.bng0
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r8v13 */
                    /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
                    /* JADX WARN: Type inference failed for: r8v15 */
                    @Override // a.xdr
                    public final Object F(Object obj, Object obj2, Object obj3) {
                        boolean z14;
                        boolean z15;
                        ch80 ch80VarG;
                        fet fetVar2;
                        ?? r8;
                        shd shdVar = gqw0.v;
                        shd shdVar2 = gqw0.y;
                        shd shdVar3 = gqw0.w;
                        shd shdVar4 = gqw0.x;
                        hh80 hh80Var19 = (hh80) obj;
                        fet fetVar3 = (fet) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        zx7 zx7Var = gqw0.f11754a;
                        hh80Var19.getClass();
                        if ((iIntValue & 6) == 0) {
                            iIntValue |= fetVar3.g(hh80Var19) ? 4 : 2;
                        }
                        if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                            ung0 ung0Var = (ung0) l7m0Var.getValue();
                            if (ung0Var != null) {
                                boolean z16 = ung0Var instanceof sng0;
                                jm40 jm40Var = jm40.b;
                                if (z16) {
                                    fetVar3.e0(1156538511);
                                    piz.h(0, fetVar3, s5x0.I(jm40Var, hh80Var19).e(o7k0.c));
                                    fetVar3.r(false);
                                } else {
                                    boolean z17 = ung0Var instanceof rng0;
                                    Function1 function2 = function1;
                                    jr8 jr8Var = jr8.f16991a;
                                    pcy pcyVar = e7z.u1;
                                    Object obj4 = ukd.f35823a;
                                    if (z17) {
                                        fetVar3.e0(1156544937);
                                        n0q n0qVar = o7k0.c;
                                        tj30 tj30VarC = zq8.c(zx7Var, false);
                                        int iHashCode = Long.hashCode(fetVar3.T);
                                        bh90 bh90VarM = fetVar3.m();
                                        mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                                        mkd.c0.getClass();
                                        fetVar3.i0();
                                        if (fetVar3.S) {
                                            fetVar3.l(pcyVar);
                                        } else {
                                            fetVar3.r0();
                                        }
                                        jpm0.o(fetVar3, tj30VarC, shdVar4);
                                        jpm0.o(fetVar3, bh90VarM, shdVar3);
                                        vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
                                        jpm0.o(fetVar3, mm40VarC0, shdVar);
                                        mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                                        mdm mdmVar = ((rng0) ung0Var).c;
                                        boolean zG = fetVar3.g(function2);
                                        Object objP2 = fetVar3.P();
                                        if (zG || objP2 == obj4) {
                                            r8 = 0;
                                            objP2 = new dng0(function2, (byte) 0);
                                            fetVar3.o0(objP2);
                                        } else {
                                            r8 = 0;
                                        }
                                        piz.b(mm40VarB, mdmVar, (Function0) objP2, fetVar3, r8);
                                        fetVar3.r(true);
                                        fetVar3.r(r8);
                                    } else if (ung0Var instanceof tng0) {
                                        fetVar3.e0(1156558737);
                                        n0q n0qVar2 = o7k0.c;
                                        tj30 tj30VarC2 = zq8.c(zx7Var, false);
                                        int iHashCode2 = Long.hashCode(fetVar3.T);
                                        bh90 bh90VarM2 = fetVar3.m();
                                        mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar2);
                                        mkd.c0.getClass();
                                        fetVar3.i0();
                                        if (fetVar3.S) {
                                            fetVar3.l(pcyVar);
                                        } else {
                                            fetVar3.r0();
                                        }
                                        jpm0.o(fetVar3, tj30VarC2, shdVar4);
                                        jpm0.o(fetVar3, bh90VarM2, shdVar3);
                                        vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
                                        jpm0.o(fetVar3, mm40VarC1, shdVar);
                                        mm40 mm40VarE = s5x0.I(jm40Var, hh80Var19).e(n0qVar2);
                                        boolean z18 = z12;
                                        hh80 hh80Var110 = hh80VarT;
                                        if (z18 || (z11 && ((tng0) ung0Var).e != null)) {
                                            z15 = false;
                                            fetVar3.e0(1979280365);
                                            ch80VarG = knm0.g(hh80Var110, fetVar3);
                                            fetVar3.r(false);
                                        } else {
                                            fetVar3.e0(1979374822);
                                            ch80VarG = knm0.f(hh80Var110, fetVar3);
                                            z15 = false;
                                            fetVar3.r(false);
                                        }
                                        ch80 ch80Var = ch80VarG;
                                        tng0 tng0Var = (tng0) ung0Var;
                                        a4x a4xVar = tng0Var.c;
                                        boolean z19 = z10;
                                        boolean z20 = (!z19 || tng0Var.d == null) ? z15 : true;
                                        boolean zG2 = fetVar3.g(function2);
                                        Object objP3 = fetVar3.P();
                                        if (zG2 || objP3 == obj4) {
                                            objP3 = new ru80(function2, (byte) 11);
                                            fetVar3.o0(objP3);
                                        }
                                        fet fetVar4 = fetVar3;
                                        piz.w(a4xVar, z20, (Function2) objP3, mm40VarE, ch80Var, fetVar4, 0);
                                        if (!z19 || tng0Var.e == null) {
                                            fetVar4.e0(1980588038);
                                            fetVar4.r(z15);
                                            fetVar2 = fetVar4;
                                        } else {
                                            fetVar4.e0(1980151744);
                                            mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.h);
                                            mtl mtlVar = tng0Var.e;
                                            zcl zclVar = qmk.f28987a;
                                            lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                                            boolean zG3 = fetVar4.g(function2);
                                            Object objP4 = fetVar4.P();
                                            if (zG3 || objP4 == obj4) {
                                                objP4 = new a9g0(function2, (byte) 1);
                                                fetVar4.o0(objP4);
                                            }
                                            bkb.f(mm40VarB2, mtlVar, null, false, lh80VarU, (Function1) objP4, fetVar4, 0, 12);
                                            fet fetVar5 = fetVar4;
                                            fetVar5.r(z15);
                                            fetVar2 = fetVar5;
                                        }
                                        fetVar2.r(true);
                                        fetVar2.r(z15);
                                    } else {
                                        z14 = false;
                                    }
                                }
                            } else {
                                z14 = false;
                            }
                            throw b1j.f(1156538291, fetVar3, z14);
                        }
                        fetVar3.X();
                        return Unit.f46060a;
                    }
                }, fetVar), fetVar, (i10 & 14) | 805306416, 444);
                z8 = z11;
                z9 = z12;
                z4 = z10;
                hh80Var3 = hh80Var18;
            } else {
                fetVar.X();
                z8 = z5;
                z9 = z6;
                hh80Var3 = hh80Var2;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.cng0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        piz.x(mm40Var, l7m0Var, z4, z8, z9, hh80Var3, function1, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 196608;
        hh80Var2 = hh80Var;
        if ((1572864 & i) == 0) {
            if (fetVar.i(function1)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        i10 = i3;
        if ((599187 & i10) != 599186) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (fetVar.U(i10 & 1, z7)) {
            if (i12 != 0) {
                z10 = false;
            } else {
                z10 = z4;
            }
            if (i4 != 0) {
                z11 = true;
            } else {
                z11 = z5;
            }
            if (i6 != 0) {
                z12 = false;
            } else {
                z12 = z6;
            }
            if (i8 != 0) {
                hh80VarT = s5x0.t(0.0f, 0.0f, 3);
            } else {
                hh80VarT = hh80Var2;
            }
            if ((3670016 & i10) == 1048576) {
                z13 = true;
            } else {
                z13 = false;
            }
            objP = fetVar.P();
            if (z13) {
                objP = new pme0(function1, (byte) 28);
                fetVar.o0(objP);
            } else {
                objP = new pme0(function1, (byte) 28);
                fetVar.o0(objP);
            }
            knx.i(false, (Function0) objP, fetVar, 0, 1);
            hh80 hh80Var19 = hh80VarT;
            m8x.y(mm40Var, u1c.M(-229790623, new t5e0(function1, l7m0Var), fetVar), null, null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, u1c.M(711817206, new xdr() { // from class: a.bng0
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v13 */
                /* JADX WARN: Type inference failed for: r8v14, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r8v15 */
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    boolean z14;
                    boolean z15;
                    ch80 ch80VarG;
                    fet fetVar2;
                    ?? r8;
                    shd shdVar = gqw0.v;
                    shd shdVar2 = gqw0.y;
                    shd shdVar3 = gqw0.w;
                    shd shdVar4 = gqw0.x;
                    hh80 hh80Var110 = (hh80) obj;
                    fet fetVar3 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    zx7 zx7Var = gqw0.f11754a;
                    hh80Var110.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= fetVar3.g(hh80Var110) ? 4 : 2;
                    }
                    if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                        ung0 ung0Var = (ung0) l7m0Var.getValue();
                        if (ung0Var != null) {
                            boolean z16 = ung0Var instanceof sng0;
                            jm40 jm40Var = jm40.b;
                            if (z16) {
                                fetVar3.e0(1156538511);
                                piz.h(0, fetVar3, s5x0.I(jm40Var, hh80Var110).e(o7k0.c));
                                fetVar3.r(false);
                            } else {
                                boolean z17 = ung0Var instanceof rng0;
                                Function1 function2 = function1;
                                jr8 jr8Var = jr8.f16991a;
                                pcy pcyVar = e7z.u1;
                                Object obj4 = ukd.f35823a;
                                if (z17) {
                                    fetVar3.e0(1156544937);
                                    n0q n0qVar = o7k0.c;
                                    tj30 tj30VarC = zq8.c(zx7Var, false);
                                    int iHashCode = Long.hashCode(fetVar3.T);
                                    bh90 bh90VarM = fetVar3.m();
                                    mm40 mm40VarC0 = kbc.c0(fetVar3, n0qVar);
                                    mkd.c0.getClass();
                                    fetVar3.i0();
                                    if (fetVar3.S) {
                                        fetVar3.l(pcyVar);
                                    } else {
                                        fetVar3.r0();
                                    }
                                    jpm0.o(fetVar3, tj30VarC, shdVar4);
                                    jpm0.o(fetVar3, bh90VarM, shdVar3);
                                    vqd.u(iHashCode, fetVar3, shdVar2, fetVar3);
                                    jpm0.o(fetVar3, mm40VarC0, shdVar);
                                    mm40 mm40VarB = jr8Var.b(jm40Var, gqw0.e);
                                    mdm mdmVar = ((rng0) ung0Var).c;
                                    boolean zG = fetVar3.g(function2);
                                    Object objP2 = fetVar3.P();
                                    if (zG || objP2 == obj4) {
                                        r8 = 0;
                                        objP2 = new dng0(function2, (byte) 0);
                                        fetVar3.o0(objP2);
                                    } else {
                                        r8 = 0;
                                    }
                                    piz.b(mm40VarB, mdmVar, (Function0) objP2, fetVar3, r8);
                                    fetVar3.r(true);
                                    fetVar3.r(r8);
                                } else if (ung0Var instanceof tng0) {
                                    fetVar3.e0(1156558737);
                                    n0q n0qVar2 = o7k0.c;
                                    tj30 tj30VarC2 = zq8.c(zx7Var, false);
                                    int iHashCode2 = Long.hashCode(fetVar3.T);
                                    bh90 bh90VarM2 = fetVar3.m();
                                    mm40 mm40VarC1 = kbc.c0(fetVar3, n0qVar2);
                                    mkd.c0.getClass();
                                    fetVar3.i0();
                                    if (fetVar3.S) {
                                        fetVar3.l(pcyVar);
                                    } else {
                                        fetVar3.r0();
                                    }
                                    jpm0.o(fetVar3, tj30VarC2, shdVar4);
                                    jpm0.o(fetVar3, bh90VarM2, shdVar3);
                                    vqd.u(iHashCode2, fetVar3, shdVar2, fetVar3);
                                    jpm0.o(fetVar3, mm40VarC1, shdVar);
                                    mm40 mm40VarE = s5x0.I(jm40Var, hh80Var110).e(n0qVar2);
                                    boolean z18 = z12;
                                    hh80 hh80Var111 = hh80VarT;
                                    if (z18 || (z11 && ((tng0) ung0Var).e != null)) {
                                        z15 = false;
                                        fetVar3.e0(1979280365);
                                        ch80VarG = knm0.g(hh80Var111, fetVar3);
                                        fetVar3.r(false);
                                    } else {
                                        fetVar3.e0(1979374822);
                                        ch80VarG = knm0.f(hh80Var111, fetVar3);
                                        z15 = false;
                                        fetVar3.r(false);
                                    }
                                    ch80 ch80Var = ch80VarG;
                                    tng0 tng0Var = (tng0) ung0Var;
                                    a4x a4xVar = tng0Var.c;
                                    boolean z19 = z10;
                                    boolean z20 = (!z19 || tng0Var.d == null) ? z15 : true;
                                    boolean zG2 = fetVar3.g(function2);
                                    Object objP3 = fetVar3.P();
                                    if (zG2 || objP3 == obj4) {
                                        objP3 = new ru80(function2, (byte) 11);
                                        fetVar3.o0(objP3);
                                    }
                                    fet fetVar4 = fetVar3;
                                    piz.w(a4xVar, z20, (Function2) objP3, mm40VarE, ch80Var, fetVar4, 0);
                                    if (!z19 || tng0Var.e == null) {
                                        fetVar4.e0(1980588038);
                                        fetVar4.r(z15);
                                        fetVar2 = fetVar4;
                                    } else {
                                        fetVar4.e0(1980151744);
                                        mm40 mm40VarB2 = jr8Var.b(jm40Var, gqw0.h);
                                        mtl mtlVar = tng0Var.e;
                                        zcl zclVar = qmk.f28987a;
                                        lh80 lh80VarU = s5x0.u(0.0f, 0.0f, 0.0f, 12.0f, 7);
                                        boolean zG3 = fetVar4.g(function2);
                                        Object objP4 = fetVar4.P();
                                        if (zG3 || objP4 == obj4) {
                                            objP4 = new a9g0(function2, (byte) 1);
                                            fetVar4.o0(objP4);
                                        }
                                        bkb.f(mm40VarB2, mtlVar, null, false, lh80VarU, (Function1) objP4, fetVar4, 0, 12);
                                        fet fetVar5 = fetVar4;
                                        fetVar5.r(z15);
                                        fetVar2 = fetVar5;
                                    }
                                    fetVar2.r(true);
                                    fetVar2.r(z15);
                                } else {
                                    z14 = false;
                                }
                            }
                        } else {
                            z14 = false;
                        }
                        throw b1j.f(1156538291, fetVar3, z14);
                    }
                    fetVar3.X();
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, (i10 & 14) | 805306416, 444);
            z8 = z11;
            z9 = z12;
            z4 = z10;
            hh80Var3 = hh80Var19;
        } else {
            fetVar.X();
            z8 = z5;
            z9 = z6;
            hh80Var3 = hh80Var2;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.cng0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    piz.x(mm40Var, l7m0Var, z4, z8, z9, hh80Var3, function1, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void y(long j, fqj0 fqj0Var, fet fetVar, int i) {
        fetVar.g0(-437354080);
        int i2 = i | (fetVar.f(j) ? 4 : 2) | (fetVar.g(fqj0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), j, jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarQ, 8.0f, 18.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarK);
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
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.e(o7k0.s(jm40Var, 16.0f), 16.0f), vgg0.f37379a), fqj0Var));
            mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 70.0f), 16.0f);
            zcl zclVar2 = qmk.f;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.e(o7k0.d(s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), 16.0f)), fqj0Var, fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yxh(j, fqj0Var, i, (byte) 5);
        }
    }

    public static final void z(mm40 mm40Var, boolean z, xdr xdrVar, xdr xdrVar2, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        int i2;
        ugd ugdVar4;
        boolean z2;
        int i3;
        pz40 pz40Var;
        Object ytl0Var;
        float f;
        float f2;
        boolean z3;
        float f3;
        xdr xdrVar3;
        pz40 pz40Var2;
        float f4;
        xx7 xx7Var;
        Object obj;
        boolean z4;
        pw3 pw3Var;
        ugd ugdVar5 = ugdVar2;
        ugd ugdVar6 = ugdVar3;
        fetVar.g0(1763368636);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(xdrVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(ugdVar5) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(ugdVar6) ? 1048576 : 524288;
        }
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                z2 = fetVar.k(bmd.n) == k6z.b;
                i3 = i2 & (-113);
            } else {
                fetVar.X();
                i3 = i2 & (-113);
                z2 = z;
            }
            fetVar.s();
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                zcl zclVar = qmk.f28987a;
                objP = twn.j(4.0f, fetVar);
            }
            float f5 = ((ycl) objP).f42389a;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                zcl zclVar2 = qmk.f28987a;
                objP2 = twn.j(8.0f, fetVar);
            }
            float f6 = ((ycl) objP2).f42389a;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                zcl zclVar3 = qmk.f28987a;
                objP3 = twn.j(10.0f, fetVar);
            }
            float f7 = ((ycl) objP3).f42389a;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                zcl zclVar4 = qmk.f28987a;
                objP4 = twn.j(32.0f, fetVar);
            }
            float f8 = ((ycl) objP4).f42389a;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = gqw0.n;
                fetVar.o0(objP5);
            }
            xx7 xx7Var2 = (xx7) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = new qw3(f6, true, new jf4((byte) 14));
                fetVar.o0(objP6);
            }
            pw3 pw3Var2 = (pw3) objP6;
            long separator60 = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator60();
            pz40 pz40VarZ = v3c.Z(null, new Object[0], fetVar);
            zcl zclVar5 = qmk.f28987a;
            pz40 pz40VarZ2 = v3c.Z(new ycl(96.0f), new Object[0], fetVar);
            Object[] objArr = new Object[0];
            int i4 = i3;
            boolean zG = ((i3 & 7168) == 2048) | ((i3 & 896) == 256) | fetVar.g(pz40VarZ) | fetVar.h(z2) | fetVar.g(pz40VarZ2) | fetVar.f(separator60);
            Object objP7 = fetVar.P();
            if (zG || objP7 == cl5Var) {
                pz40Var = pz40VarZ;
                f = f5;
                f2 = f7;
                z3 = z2;
                f3 = f8;
                xdrVar3 = xdrVar2;
                pz40Var2 = pz40VarZ2;
                ytl0Var = new ytl0(xdrVar, xdrVar3, pz40Var, f3, z3, pz40Var2, f6, separator60, (byte) 0);
                f4 = f6;
                fetVar.o0(ytl0Var);
            } else {
                xdrVar3 = xdrVar2;
                pz40Var = pz40VarZ;
                ytl0Var = objP7;
                z3 = z2;
                f = f5;
                f2 = f7;
                f3 = f8;
                f4 = f6;
                pz40Var2 = pz40VarZ2;
            }
            l7m0 l7m0VarY = v3c.Y(objArr, (Function0) ytl0Var, fetVar);
            boolean zG2 = fetVar.g(pz40Var) | fetVar.g(pz40Var2);
            Object objP8 = fetVar.P();
            if (zG2 || objP8 == cl5Var) {
                objP8 = new wtl0(f2, pz40Var, pz40Var2, (byte) 4);
                fetVar.o0(objP8);
            }
            tj30 tj30Var = (tj30) objP8;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z5 = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z5) {
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
            float f9 = f4;
            mm40 mm40VarS = o7k0.s(s5x0.N(mrv.k0(jm40Var, "INNING_CONTENT_ID"), 0.0f, 0.0f, f4, 0.0f, 11), f2);
            z = z3;
            x5d x5dVarA = w5d.a(pw3Var2, xx7Var2, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
            fetVar.i0();
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
            ugdVar4 = ugdVar;
            vqd.t(6 | ((i4 >> 9) & 112), ugdVar4, y5dVar, fetVar, true);
            if (xdrVar3 == null) {
                fetVar.e0(-1198245833);
                z4 = false;
                fetVar.r(false);
                xx7Var = xx7Var2;
                obj = 6;
            } else {
                fetVar.e0(-1198245832);
                mm40 mm40VarS2 = o7k0.s(s5x0.N(mrv.k0(jm40Var, "POINTS_CONTENT_ID"), 0.0f, 0.0f, f, 0.0f, 11), f3);
                x5d x5dVarA2 = w5d.a(pw3Var2, xx7Var2, fetVar, 54);
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarS2);
                fetVar.i0();
                xx7Var = xx7Var2;
                if (fetVar.S) {
                    fetVar.l(function0);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, x5dVarA2, shdVar);
                jpm0.o(fetVar, bh90VarM3, shdVar2);
                vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
                jpm0.o(fetVar, mm40VarC2, shdVar4);
                obj = r21;
                xdrVar3.F(y5dVar, fetVar, obj);
                fetVar.r(true);
                z4 = false;
                fetVar.r(false);
            }
            if (xdrVar == null) {
                fetVar.e0(-1197769735);
                fetVar.r(z4);
                pw3Var = pw3Var2;
            } else {
                fetVar.e0(-1197769734);
                mm40 mm40VarS3 = o7k0.s(s5x0.N(mrv.k0(jm40Var, "GAME_CONTENT_ID"), 0.0f, 0.0f, f9, 0.0f, 11), f3);
                pw3Var = r1;
                x5d x5dVarA3 = w5d.a(pw3Var, xx7Var, fetVar, 54);
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
                xdrVar.F(y5dVar, fetVar, obj);
                fetVar.r(true);
                fetVar.r(false);
            }
            ugdVar5 = ugdVar2;
            ugdVar5.F(s5x0.N(mrv.k0(jm40Var, "PERIOD_CONTENT_ID"), 0.0f, 0.0f, 8.0f, 0.0f, 11), fetVar, Integer.valueOf((i4 >> 12) & 112));
            mm40 mm40Var2 = (mm40) l7m0VarY.getValue();
            x5d x5dVarA4 = w5d.a(pw3Var, xx7Var, fetVar, 54);
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
            ugdVar6 = ugdVar3;
            vqd.t(6 | ((i4 >> 15) & 112), ugdVar6, y5dVar, fetVar, true);
            fetVar.r(true);
        } else {
            ugdVar4 = ugdVar;
            fetVar.X();
        }
        boolean z6 = z;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o84(mm40Var, z6, xdrVar, xdrVar2, ugdVar4, ugdVar5, ugdVar6, i);
        }
    }

    public final int C() {
        byte b = this.f27062a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (b) {
            case 0:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }

    public final int D() {
        byte b = this.f27062a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (b) {
            case 0:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    public final int F(View view) {
        byte b = this.f27062a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (b) {
            case 0:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }

    public final int G() {
        switch (this.f27062a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final void Y(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        switch (this.f27062a) {
            case 0:
                marginLayoutParams.leftMargin = i;
                break;
            default:
                marginLayoutParams.rightMargin = i;
                break;
        }
    }
}
