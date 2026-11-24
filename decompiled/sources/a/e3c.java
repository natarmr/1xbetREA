package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import java.math.BigDecimal;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetPlayerZip;
import org.xplatform.betting.core.zip.model.zip.EventParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class e3c {
    public static final d280 A(xca xcaVar, boolean z) {
        String str;
        if (xcaVar.q) {
            return new b280(z ? R.drawable.ic_glyph_color_logo_home : R.drawable.ic_glyph_color_logo_away);
        }
        String str2 = "";
        if (!z ? (str = (String) CollectionsKt.firstOrNull(xcaVar.i)) != null : (str = (String) CollectionsKt.firstOrNull(xcaVar.h)) != null) {
            str2 = str;
        }
        rpp0 rpp0Var = xcaVar.f40636a;
        return new c280(vsm0.s(z ? rpp0Var.a() : rpp0Var.c(), str2), R.drawable.ic_glyph_placeholder_player);
    }

    public static final uts0 B() {
        return ro4.m0(500, 0, null, 6);
    }

    public static final String C(n3w n3wVar, ctf0 ctf0Var, List list) {
        n3wVar.getClass();
        ctf0Var.getClass();
        List listY0 = sj3.y0(list);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = n3wVar.J1.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            su6 su6Var = (su6) it.next();
            for (Object obj2 : listY0) {
                if (((lok0) obj2).f20396a == su6Var.c) {
                    obj = obj2;
                    break;
                }
            }
            lok0 lok0Var = (lok0) obj;
            if (lok0Var != null) {
                linkedHashSet.add(lok0Var);
            }
        }
        int size = linkedHashSet.size();
        if (size == 0) {
            return "";
        }
        if (size != 1) {
            return ctf0Var.f(R.string.top_events_tag_v2, Integer.valueOf(linkedHashSet.size()));
        }
        lok0 lok0Var2 = (lok0) CollectionsKt.V(linkedHashSet);
        String str = lok0Var2 != null ? lok0Var2.b : null;
        return str == null ? "" : str;
    }

    public static final m3w D(kzv kzvVar, ctf0 ctf0Var, boolean z) {
        ctf0Var.getClass();
        if (!r(kzvVar, z)) {
            return null;
        }
        lsm0 lsm0Var = ctf0Var.b;
        String strR = w6x.r(new Object[0], 0, lsm0Var, R.string.coefficient_type_title, Separators.COLON);
        String strA = lsm0Var.a(R.string.coef_view_ind, Arrays.copyOf(new Object[0], 0));
        pz40 pz40Var = s6t0.f31722a;
        return new m3w(strR, strA, s6t0.b().f33626a.getTextPrimary());
    }

    public static final void E() {
        throw new IllegalStateException("Invalid applier");
    }

    public static float F(float f, float[] fArr, float[] fArr2) {
        float f2;
        float f3;
        float f4;
        float f5;
        float fAbs = Math.abs(f);
        float fSignum = Math.signum(f);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        int i2 = i - 1;
        if (i2 >= fArr.length - 1) {
            float f6 = fArr[fArr.length - 1];
            float f7 = fArr2[fArr.length - 1];
            if (f6 == 0.0f) {
                return 0.0f;
            }
            return (f7 / f6) * f;
        }
        if (i2 == -1) {
            float f8 = fArr[0];
            f4 = fArr2[0];
            f5 = f8;
            f3 = 0.0f;
            f2 = 0.0f;
        } else {
            float f9 = fArr[i2];
            float f10 = fArr[i];
            f2 = fArr2[i2];
            f3 = f9;
            f4 = fArr2[i];
            f5 = f10;
        }
        return (((f4 - f2) * Math.max(0.0f, Math.min(1.0f, f3 == f5 ? 0.0f : (fAbs - f3) / (f5 - f3)))) + f2) * fSignum;
    }

    public static final androidx.compose.runtime.a G(fet fetVar) {
        fet fetVar2;
        fetVar.a0(206, ykd.e);
        if (fetVar.S) {
            t9k0.y(fetVar.I);
        }
        Object objH = fetVar.H();
        jet tag0Var = objH instanceof jet ? (jet) objH : null;
        if (tag0Var == null) {
            fetVar2 = fetVar;
            tag0Var = new tag0(new det(new androidx.compose.runtime.a(fetVar2, fetVar.T, fetVar.q, fetVar.C, fetVar.h.t)), -1);
            fetVar2.p0(tag0Var);
        } else {
            fetVar2 = fetVar;
        }
        androidx.compose.runtime.a aVar = ((det) tag0Var.f16392a).f5966a;
        ((hgk0) aVar.f).setValue(fetVar2.m());
        fetVar2.r(false);
        return aVar;
    }

    public static final int H(s9s0 s9s0Var) {
        int iOrdinal = s9s0Var.ordinal();
        if (iOrdinal == 0) {
            return R.string.casino_tournaments_descriptions;
        }
        if (iOrdinal == 1) {
            return R.string.games;
        }
        if (iOrdinal == 2) {
            return R.string.results;
        }
        if (iOrdinal == 3) {
            return R.string.casino_tournaments_conditions;
        }
        t9f.b();
        return 0;
    }

    public static final s8h I(v8h v8hVar) {
        List<gh30> list;
        Integer num;
        Long l;
        Integer num2;
        int iIntValue = (v8hVar == null || (num2 = v8hVar.f36982a) == null) ? 0 : num2.intValue();
        List list2 = null;
        String str = v8hVar != null ? v8hVar.c : null;
        String str2 = str == null ? "" : str;
        String strE = lmc.E(v8hVar != null ? v8hVar.d : null);
        long jLongValue = (v8hVar == null || (l = v8hVar.b) == null) ? 0L : l.longValue();
        int iIntValue2 = (v8hVar == null || (num = v8hVar.e) == null) ? 0 : num.intValue();
        if (v8hVar != null && (list = v8hVar.f) != null) {
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (gh30 gh30Var : list) {
                Long l2 = gh30Var.f11280a;
                long jLongValue2 = l2 != null ? l2.longValue() : -1L;
                String str3 = gh30Var.b;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = gh30Var.c;
                String str5 = str4 == null ? "" : str4;
                Integer num3 = gh30Var.d;
                int iIntValue3 = num3 != null ? num3.intValue() : 0;
                String strE2 = lmc.E(gh30Var.f);
                String strE3 = lmc.E(gh30Var.g);
                jh30 jh30Var = gh30Var.h;
                arrayList.add(new q8h(jLongValue2, str3, str5, iIntValue3, strE2, strE3, new r8h(jh30Var != null ? jh30Var.f16509a : null, jh30Var != null ? jh30Var.b : null, jh30Var != null ? jh30Var.c : null, jh30Var != null ? jh30Var.d : null, jh30Var != null ? jh30Var.e : null, jh30Var != null ? jh30Var.f : null)));
            }
            list2 = arrayList;
        }
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return new s8h(iIntValue, iIntValue2, jLongValue, str2, strE, list2);
    }

    public static final v1o0 J(d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        d0tVar.getClass();
        rqs rqsVar = d0tVar.p;
        long j = d0tVar.v;
        ctf0Var.getClass();
        str.getClass();
        list.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            long j2 = d0tVar.f5282a;
            i4i i4iVarQ = afn0.q(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
            rip0 rip0Var = czp.f5233a;
            return new q1o0(j2, i4iVarQ, new h2o0(new vyp(czp.a(d0tVar, ctf0Var)), new zyp(kbc.U(d0tVar), qzb.c0(d0tVar)), new zyp(kbc.V(d0tVar), qzb.r0(d0tVar)), dyb.o0(CollectionsKt.E0(5, czp.b(j, d0tVar))), new azp(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), new oip0(kpb.R(d0tVar).f33307a, rqsVar.t ? f3g0.b : f3g0.f8862a), new oip0(kpb.R(d0tVar).b, rqsVar.u ? f3g0.b : f3g0.f8862a))), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal == 1) {
            long j3 = d0tVar.f5282a;
            j4i j4iVarU = afn0.u(new y3d(StaticColors.INSTANCE.m113getRed0d7_KjU()), d0tVar, str, str2, list, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            rip0 rip0Var2 = czp.f5233a;
            return new u1o0(j3, j4iVarU, new n3o0(new wyp(czp.a(d0tVar, ctf0Var)), new zyp(new c280("", R.drawable.ic_glyph_placeholder_player), qzb.c0(d0tVar)), new zyp(new c280("", R.drawable.ic_glyph_placeholder_player), qzb.r0(d0tVar)), dyb.o0(CollectionsKt.E0(5, czp.b(j, d0tVar))), new azp(ctf0Var.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), new oip0(kpb.R(d0tVar).f33307a, rqsVar.t ? f3g0.b : f3g0.f8862a), new oip0(kpb.R(d0tVar).b, rqsVar.u ? f3g0.b : f3g0.f8862a))), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal == 2) {
            long j4 = d0tVar.f5282a;
            k4i k4iVarT = afn0.t(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            rip0 rip0Var3 = czp.f5233a;
            a4x a4xVarO0 = dyb.o0(CollectionsKt.E0(5, czp.b(j, d0tVar)));
            zyp zypVar = new zyp(kbc.U(d0tVar), qzb.c0(d0tVar));
            zyp zypVar2 = new zyp(kbc.V(d0tVar), qzb.r0(d0tVar));
            lsm0 lsm0Var = ctf0Var.b;
            return new t1o0(j4, k4iVarT, new f3o0(new xyp(czp.a(d0tVar, ctf0Var), lsm0Var.a(R.string.live_new, Arrays.copyOf(new Object[0], 0))), zypVar, zypVar2, a4xVarO0, new azp(lsm0Var.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), new oip0(kpb.R(d0tVar).f33307a, rqsVar.t ? f3g0.b : f3g0.f8862a), new oip0(kpb.R(d0tVar).b, rqsVar.u ? f3g0.b : f3g0.f8862a))), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        if (iOrdinal == 3) {
            long j5 = d0tVar.f5282a;
            n0x n0xVar = new n0x(dtb.F(str));
            String strA = czp.a(d0tVar, ctf0Var);
            lsm0 lsm0Var2 = ctf0Var.b;
            return new s1o0(j5, afn0.s(null, d0tVar, str, strA, lsm0Var2.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), str2, list, z3, z4, true, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z)), new x2o0(new zyp(kbc.U(d0tVar), qzb.c0(d0tVar)), new zyp(kbc.V(d0tVar), qzb.r0(d0tVar)), dyb.o0(CollectionsKt.E0(5, czp.b(j, d0tVar))), new azp(lsm0Var2.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), new oip0(kpb.R(d0tVar).f33307a, rqsVar.t ? f3g0.b : f3g0.f8862a), new oip0(kpb.R(d0tVar).b, rqsVar.u ? f3g0.b : f3g0.f8862a))), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
        }
        if (iOrdinal != 4) {
            t9f.b();
            return null;
        }
        long j6 = d0tVar.f5282a;
        k4i k4iVarR = afn0.r(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
        rip0 rip0Var4 = czp.f5233a;
        a4x a4xVarO1 = dyb.o0(CollectionsKt.E0(5, czp.b(j, d0tVar)));
        zyp zypVar3 = new zyp(kbc.U(d0tVar), qzb.c0(d0tVar));
        zyp zypVar4 = new zyp(kbc.V(d0tVar), qzb.r0(d0tVar));
        lsm0 lsm0Var3 = ctf0Var.b;
        return new r1o0(j6, k4iVarR, new p2o0(new yyp(lsm0Var3.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), czp.a(d0tVar, ctf0Var)), zypVar3, zypVar4, a4xVarO1, new azp(lsm0Var3.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)), new oip0(kpb.R(d0tVar).f33307a, rqsVar.t ? f3g0.b : f3g0.f8862a), new oip0(kpb.R(d0tVar).b, rqsVar.u ? f3g0.b : f3g0.f8862a))), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
    }

    public static final u9s K(tdo tdoVar, sip sipVar) {
        ArrayList arrayList;
        BetPlayerZip betPlayerZip;
        int i;
        tdoVar.getClass();
        sipVar.getClass();
        Long l = tdoVar.f33779a;
        List<List> list = tdoVar.c;
        if (list != null) {
            int i2 = 10;
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            for (List<ygo> list2 : list) {
                ArrayList arrayList3 = new ArrayList(r3d.q(list2, i2));
                for (ygo ygoVar : list2) {
                    ygoVar.getClass();
                    Long l2 = ygoVar.f42595a;
                    Double d = ygoVar.d;
                    long jLongValue = l2 != null ? l2.longValue() : 0L;
                    Double d2 = ygoVar.e;
                    double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
                    long jLongValue2 = l != null ? l.longValue() : 0L;
                    double dDoubleValue2 = d != null ? d.doubleValue() : 0.0d;
                    BigDecimal bigDecimalH = kotlin.text.b.h("");
                    if (bigDecimalH == null) {
                        bigDecimalH = kotlin.text.b.h(String.valueOf(d));
                    }
                    if (bigDecimalH == null) {
                        bigDecimalH = new BigDecimal(0);
                    }
                    boolean zD = Intrinsics.d(ygoVar.b, Boolean.TRUE);
                    String str = ygoVar.f;
                    if (str == null) {
                        str = "";
                    }
                    kaa0 kaa0Var = ygoVar.c;
                    if (kaa0Var != null) {
                        Long l3 = kaa0Var.f17954a;
                        long jLongValue3 = l3 != null ? l3.longValue() : 0L;
                        String str2 = kaa0Var.b;
                        betPlayerZip = new BetPlayerZip(jLongValue3, str2 != null ? str2 : "");
                    } else {
                        betPlayerZip = null;
                    }
                    tqt tqtVar = uoy.b;
                    int iOrdinal = sipVar.ordinal();
                    if (iOrdinal != 0) {
                        i = 1;
                        if (iOrdinal != 1) {
                            t9f.b();
                            return null;
                        }
                    } else {
                        i = 3;
                    }
                    tqtVar.getClass();
                    uoy uoyVarJ = tqt.j(i);
                    Boolean bool = Boolean.FALSE;
                    Boolean bool2 = ygoVar.g;
                    Integer numValueOf = bool2 != null ? Integer.valueOf(bool2.booleanValue() ? 1 : 0) : null;
                    sgo sgoVar = ygoVar.h;
                    List list3 = sgoVar != null ? sgoVar.f32171a : null;
                    if (list3 == null) {
                        list3 = iun.f15405a;
                    }
                    List list4 = sgoVar != null ? sgoVar.b : null;
                    if (list4 == null) {
                        list4 = iun.f15405a;
                    }
                    arrayList3.add(new v9s(jLongValue, dDoubleValue, jLongValue2, dDoubleValue2, "", bigDecimalH, zD, str, "", betPlayerZip, 0, 0L, 0, uoyVarJ, 0L, null, 0L, bool, 0L, bool, null, numValueOf, new EventParams(list3, list4)));
                }
                arrayList2.add(arrayList3);
                i2 = 10;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new u9s(arrayList, l, tdoVar.d);
    }

    public static final ArrayList L(List list) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            scs scsVar = (scs) it.next();
            Long l = scsVar.b;
            List<List> list2 = scsVar.f32002a;
            if (list2 != null) {
                arrayList = new ArrayList(r3d.q(list2, 10));
                for (List list3 : list2) {
                    ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(vzb.q0((oq7) it2.next()));
                    }
                    arrayList.add(arrayList3);
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(new u9s(arrayList, l, null));
        }
        return arrayList2;
    }

    public static nas M(i0t i0tVar, sip sipVar) {
        ArrayList arrayList;
        Boolean bool;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Integer num = 0;
        long jJ0 = qzb.j0(i0tVar);
        Boolean bool2 = i0tVar.G;
        Boolean bool3 = i0tVar.I;
        Long l = i0tVar.x;
        vqs vqsVar = i0tVar.r;
        tas tasVarH0 = vqsVar != null ? v3c.h0(vqsVar) : null;
        List list = i0tVar.k;
        int i = 10;
        if (list != null) {
            ArrayList arrayList6 = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList6.add(vzb.q0((oq7) it.next()));
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        List<i0t> list2 = i0tVar.l;
        if (list2 != null) {
            ArrayList arrayList7 = new ArrayList(r3d.q(list2, 10));
            for (i0t i0tVar2 : list2) {
                long jJ1 = qzb.j0(i0tVar2);
                vqs vqsVar2 = i0tVar2.r;
                tas tasVarH1 = vqsVar2 != null ? v3c.h0(vqsVar2) : null;
                List list3 = i0tVar2.k;
                if (list3 != null) {
                    ArrayList arrayList8 = new ArrayList(r3d.q(list3, i));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList8.add(vzb.q0((oq7) it2.next()));
                    }
                    arrayList4 = arrayList8;
                } else {
                    arrayList4 = null;
                }
                List list4 = i0tVar2.C;
                if (list4 != null) {
                    ArrayList arrayList9 = new ArrayList(r3d.q(list4, i));
                    Iterator it3 = list4.iterator();
                    while (it3.hasNext()) {
                        arrayList9.add(xkb.a0((imr) it3.next()));
                    }
                    arrayList5 = arrayList9;
                } else {
                    arrayList5 = null;
                }
                List list5 = i0tVar2.m;
                ArrayList arrayListL = list5 != null ? L(list5) : null;
                bds bdsVar = i0tVar2.f13963a;
                long j = bdsVar != null ? bdsVar.f2414a : 0L;
                Long l2 = i0tVar.D;
                String str = i0tVar2.b;
                Long l3 = l;
                String str2 = i0tVar.c;
                String str3 = i0tVar.d;
                ArrayList arrayList10 = arrayList7;
                String str4 = i0tVar.e;
                Integer num2 = i0tVar.f;
                String str5 = i0tVar2.g;
                long j2 = j;
                Integer num3 = i0tVar2.h;
                Boolean bool4 = i0tVar.i;
                String str6 = i0tVar2.j;
                iun iunVar = iun.f15405a;
                Long l4 = i0tVar.o;
                String str7 = i0tVar.q;
                oas oasVar = new oas(i0tVar.z, i0tVar.B, i0tVar.A, i0tVar.J, num);
                oas oasVar2 = new oas(i0tVar.s, i0tVar.y, i0tVar.t, i0tVar.K, num);
                Long l5 = i0tVar2.u;
                if (l5 == null) {
                    l5 = i0tVar.u;
                }
                Long l6 = i0tVar2.v;
                if (l6 == null) {
                    l6 = i0tVar.v;
                }
                Long l7 = i0tVar.w;
                long jLongValue = l3 != null ? l3.longValue() : 0L;
                ufs ufsVar = i0tVar.E;
                Boolean bool5 = i0tVar.F;
                Boolean bool6 = i0tVar.H;
                Long l8 = i0tVar.L;
                Boolean bool7 = i0tVar.M;
                Integer num4 = i0tVar.N;
                Boolean bool8 = Boolean.TRUE;
                Integer num5 = num;
                num = num5;
                arrayList10.add(new nas(j2, jJ1, l2, str, str2, str3, str4, Boolean.FALSE, num2, str5, num3, bool4, str6, arrayList4, iunVar, arrayListL, l4, sipVar, str7, tasVarH1, l5, l6, l7, jLongValue, oasVar, oasVar2, Intrinsics.d(bool3, bool8), arrayList5, ufsVar, bool5, bool6, l8, bool7, num4, i0tVar.O, null, Intrinsics.d(bool2, bool8) ? boh.OLD_CYBER : boh.UNKNOWN, num5));
                arrayList7 = arrayList10;
                l = l3;
                bool2 = bool2;
                bool3 = bool3;
                i = 10;
            }
            bool = bool2;
            arrayList2 = arrayList7;
        } else {
            bool = bool2;
            arrayList2 = null;
        }
        Boolean bool9 = bool3;
        Long l9 = l;
        List list6 = i0tVar.C;
        if (list6 != null) {
            ArrayList arrayList11 = new ArrayList(r3d.q(list6, 10));
            Iterator it4 = list6.iterator();
            while (it4.hasNext()) {
                arrayList11.add(xkb.a0((imr) it4.next()));
            }
            arrayList3 = arrayList11;
        } else {
            arrayList3 = null;
        }
        List list7 = i0tVar.m;
        ArrayList arrayListL2 = list7 != null ? L(list7) : null;
        bds bdsVar2 = i0tVar.f13963a;
        long j3 = bdsVar2 != null ? bdsVar2.f2414a : 0L;
        Long l10 = i0tVar.D;
        long j4 = j3;
        String str8 = i0tVar.b;
        String str9 = i0tVar.c;
        String str10 = i0tVar.d;
        String str11 = i0tVar.e;
        Integer num6 = i0tVar.f;
        String str12 = i0tVar.g;
        Integer num7 = i0tVar.h;
        Boolean bool10 = i0tVar.i;
        String str13 = i0tVar.j;
        Long l11 = i0tVar.o;
        String str14 = i0tVar.q;
        oas oasVar3 = new oas(i0tVar.z, i0tVar.B, i0tVar.A, i0tVar.J, num);
        oas oasVar4 = new oas(i0tVar.s, i0tVar.y, i0tVar.t, i0tVar.K, num);
        Long l12 = i0tVar.u;
        Long l13 = i0tVar.v;
        Long l14 = i0tVar.w;
        long jLongValue2 = l9 != null ? l9.longValue() : 0L;
        ufs ufsVar2 = i0tVar.E;
        Boolean bool11 = i0tVar.F;
        Boolean bool12 = i0tVar.H;
        Long l15 = i0tVar.L;
        Boolean bool13 = i0tVar.M;
        Boolean bool14 = Boolean.TRUE;
        return new nas(j4, jJ0, l10, str8, str9, str10, str11, Boolean.FALSE, num6, str12, num7, bool10, str13, arrayList, arrayList2, arrayListL2, l11, sipVar, str14, tasVarH0, l12, l13, l14, jLongValue2, oasVar3, oasVar4, Intrinsics.d(bool9, bool14), arrayList3, ufsVar2, bool11, bool12, l15, bool13, i0tVar.N, i0tVar.O, null, Intrinsics.d(bool, bool14) ? boh.OLD_CYBER : boh.UNKNOWN, num);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public static final drk N(kuk kukVar) {
        btk btkVar;
        btk btkVar2;
        j0g0 j0g0Var = kukVar.c;
        if (j0g0Var != null) {
            Object obj = j0g0Var.f15681a;
            if (obj instanceof g0g0) {
                obj = null;
            }
            btkVar = (btk) obj;
            if (btkVar == null) {
                btkVar = new btk(iun.f15405a, "");
            }
        } else {
            btkVar = new btk(iun.f15405a, "");
        }
        j0g0 j0g0Var2 = kukVar.d;
        if (j0g0Var2 != null) {
            Object obj2 = j0g0Var2.f15681a;
            btkVar2 = (btk) (obj2 instanceof g0g0 ? null : obj2);
            if (btkVar2 == null) {
                btkVar2 = new btk(iun.f15405a, "");
            }
        } else {
            btkVar2 = new btk(iun.f15405a, "");
        }
        return new drk(btkVar, btkVar2);
    }

    public static final void O(TreeMap treeMap, long j) {
        treeMap.put("userId", Long.valueOf(j));
    }

    public static final void a(xkf xkfVar, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-1036440635);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(xkfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = okf.f25403a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            mm40 mm40VarE0 = o2e.e0(jm40.b, "CS2_GAME_BAN_PICK");
            boolean zI = fetVar.i(context) | ((i2 & 14) == 4);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new v4f(xkfVar, context, (byte) 3);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, mm40VarE0, (Function1) objP2, fetVar2, 54, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n00(xkfVar, i, (byte) 19);
        }
    }

    public static final void b(mm40 mm40Var, m3g m3gVar, Function0 function0, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        function0.getClass();
        fetVar.g0(372566240);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= fetVar.g(m3gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40Var3 = i4 != 0 ? jm40Var : mm40Var2;
            mm40 mm40VarD = o7k0.d(mm40Var3, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 44.0f), 4.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.d, false);
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
            if (m3gVar instanceof k3g) {
                fetVar.e0(716049966);
                qul qulVar = qul.e;
                oe9 oe9Var = oe9.b;
                String string = ((Context) fetVar.k(dy2.b)).getString(R.string.display_all);
                string.getClass();
                qzb.n(null, new wul(qulVar, oe9Var, new we9(string, R.drawable.ic_glyph_chevron_right_small), true, false, false), function0, fetVar, i3 & 896, 1);
                fetVar.r(false);
            } else {
                fetVar.e0(716674585);
                mm40 mm40VarE = o7k0.e(o7k0.s(s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), 80.0f), 16.0f);
                zcl zclVar2 = qmk.m;
                ugg0 ugg0Var = vgg0.f37379a;
                dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, 0, false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(mm40Var3, (Object) m3gVar, (Object) function0, i, i2, (byte) 8);
        }
    }

    public static final void c(mm40 mm40Var, woh wohVar, fet fetVar, int i) {
        mm40Var.getClass();
        fetVar.g0(-1163681745);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(wohVar) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            fetVar.e0(1733302740);
            jtm0.h(mm40Var, wohVar, fetVar, i2 & 126);
            fetVar.r(false);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uoh(mm40Var, wohVar, i, b);
        }
    }

    public static final void d(mm40 mm40Var, u1i u1iVar, u1i u1iVar2, boolean z, Function0 function0, Function0 function1, fet fetVar, int i) {
        k6z k6zVar;
        function0.getClass();
        function1.getClass();
        fetVar.g0(-1644280791);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(u1iVar) ? 32 : 16) | (fetVar.g(u1iVar2) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            if (z) {
                fetVar.e0(394136880);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(394137804);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(1874478953, new v1i(mm40Var, u1iVar, function0, u1iVar2, function1, (byte) 1), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new w1i(mm40Var, u1iVar, u1iVar2, z, function0, function1, i, (byte) 1);
        }
    }

    public static final void e(mm40 mm40Var, bpl bplVar, Function0 function0, fet fetVar, int i) {
        Object xolVar;
        pz40 pz40Var;
        long jM123getWhite0d7_KjU;
        bpl bplVar2 = bplVar;
        fet fetVar2 = fetVar;
        bplVar2.getClass();
        fetVar2.g0(-1843865639);
        int i2 = i | (fetVar2.g(bplVar2) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new ngk0();
                fetVar2.o0(objP);
            }
            ngk0 ngk0Var = (ngk0) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(new y3d(background));
                fetVar2.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            Context context = (Context) fetVar2.k(dy2.b);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = lgb.J(i120.Q(o7k0.e(o7k0.s(mm40Var, 108.0f), 168.0f), ((y3d) pz40Var2.getValue()).f41946a, vgg0.a(16.0f)), vgg0.a(16.0f));
            zfn zfnVar2 = m8m0.f21378a;
            mm40 mm40VarJ2 = lgb.J(i120.S(mm40VarJ, 1.0f, ((StaticColors) fetVar2.k(zfnVar2)).m126getWhite200d7_KjU(), vgg0.a(16.0f)), vgg0.a(16.0f));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ2);
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
            mm40 mm40VarJ3 = ffb0.J(o7k0.e(o7k0.s(jm40Var, 128.0f), 128.0f), 12.0f, -32.0f);
            zx7 zx7Var = gqw0.b;
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(mm40VarJ3, zx7Var);
            boolean z = (i2 & 896) == 256;
            Object objP3 = fetVar2.P();
            if (z || objP3 == cl5Var) {
                objP3 = new unl(function0, (byte) 5);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarW = y860.W(mm40VarB, null, null, false, null, (Function0) objP3, 28);
            bplVar2 = bplVar;
            String str = bplVar2.c;
            pge pgeVar = gqw0.A;
            boolean zI = ((i2 & 112) == 32) | fetVar2.i(context);
            Object objP4 = fetVar2.P();
            if (zI || objP4 == cl5Var) {
                pz40Var = pz40Var2;
                xolVar = new xol(ngk0Var, bplVar2, context, pz40Var, (byte) 2);
                fetVar2.o0(xolVar);
            } else {
                xolVar = objP4;
                pz40Var = pz40Var2;
            }
            k7x.b(str, null, mm40VarW, null, null, null, null, (Function1) xolVar, null, null, pgeVar, null, fetVar, 48, 6, 31608);
            mm40 mm40VarB2 = jr8Var.b(s5x0.N(jm40Var, 12.0f, 0.0f, 12.0f, 12.0f, 2), gqw0.g);
            String str2 = bplVar2.b;
            if (h2t0.a(((y3d) pz40Var.getValue()).f41946a, ((ThemeColors) fetVar.k(zfnVar)).getBackground())) {
                fetVar.e0(1051748426);
                jM123getWhite0d7_KjU = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
            } else {
                fetVar.e0(1051749732);
                jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(zfnVar2)).m123getWhite0d7_KjU();
            }
            fetVar.r(false);
            long j = jM123getWhite0d7_KjU;
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            v8q0.a(str2, mm40VarB2, j, null, qmk.r, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.m(), fetVar, 0, 24960, 109544);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yol(mm40Var, bplVar2, function0, i, (byte) 2);
        }
    }

    public static final void f(mm40 mm40Var, String str, y9q0 y9q0Var, String str2, boolean z, String str3, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(-1988031026);
        int i2 = i | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(y9q0Var) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.h(z) ? 16384 : 8192) | (fetVar2.g(str3) ? 131072 : 65536);
        if (fetVar2.U(i2 & 1, (74899 & i2) != 74898)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 56.0f), 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar2, 54);
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
            v8q0.a(str, s5x0.N(ohs0.i(fetVar2, mm40VarC1, shdVar4, 1.0f, true), 0.0f, 0.0f, 16.0f, 0.0f, 11), ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, y9q0Var, fetVar, (i2 >> 3) & 14, ((i2 << 15) & 29360128) | 24960, 110584);
            fetVar2 = fetVar;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1171011828, new hw6(str2, str3, (byte) 5), fetVar2), fetVar2, 56);
            fetVar2.r(true);
            if (z) {
                fetVar2.e0(-916791083);
                mbc.o(zfi0.f44303a, s5x0.L(jm40Var, 8.0f, 0.0f, 2), false, fetVar2, 6, 4);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-916607222);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw8(mm40Var, str, y9q0Var, str2, z, str3, i);
        }
    }

    public static final void g(mm40 mm40Var, jpm jpmVar, kpm kpmVar, fet fetVar, int i) {
        mm40 mm40Var2;
        y9q0 y9q0Var = jpmVar.c;
        fetVar.g0(1312916104);
        int i2 = i | 6 | (fetVar.g(jpmVar) ? 32 : 16) | (fetVar.g(kpmVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            aad.d(kpmVar.c, o2e.e0(jm40Var, "BasicScoreTextTag"), y9q0.a(y9q0Var, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447), null, 0, false, 1, 0, null, new n05(jpmVar.b, y9q0Var.f42262a.b, idm0.t(2)), fetVar, 1572864, 0, 952);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dpm(mm40Var2, jpmVar, kpmVar, i);
        }
    }

    public static final void h(mm40 mm40Var, tfa tfaVar, boolean z, Function1 function1, fet fetVar, int i) {
        float f;
        function1.getClass();
        fetVar.g0(142306723);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(tfaVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (tfaVar instanceof ofa) {
                zcl zclVar = qmk.f28987a;
                f = 16.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 20.0f;
            }
            float f2 = f;
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new gnm(function1, tfaVar, (byte) 9);
                fetVar.o0(objP);
            }
            a8k0.n(o2e.e0(y860.W(mm40Var, null, null, false, null, (Function0) objP, 28), "SPORT_FINAL_EVENT_CARD_LINE"), f2, 0L, null, u1c.M(-344461022, new wvm(tfaVar, function1, (byte) 3), fetVar), u1c.M(1802105443, new jv1((Object) tfaVar, z, (byte) 13), fetVar), u1c.M(-346295388, new igm((Object) tfaVar, z, (Object) function1, (byte) 22), fetVar), fetVar, 1797120, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i4a0(mm40Var, (Object) tfaVar, z, function1, i, (byte) 23);
        }
    }

    public static final void i(mm40 mm40Var, x0n x0nVar, fet fetVar, int i) {
        if (x0nVar instanceof s0n) {
            fetVar.e0(100291973);
            s0n s0nVar = (s0n) x0nVar;
            dub.B(mm40Var, s0nVar.f31417a, s0nVar.b, s0nVar.c, s0nVar.d, s0nVar.e, s0nVar.f, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (x0nVar instanceof t0n) {
            fetVar.e0(100748417);
            t0n t0nVar = (t0n) x0nVar;
            ebc.u(mm40Var, t0nVar.f33126a, t0nVar.b, t0nVar.c, t0nVar.h, t0nVar.d, t0nVar.e, t0nVar.f, t0nVar.g, t0nVar.i, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (x0nVar instanceof u0n) {
            fetVar.e0(101428712);
            u0n u0nVar = (u0n) x0nVar;
            jar0.k(mm40Var, u0nVar.f34861a, u0nVar.b, u0nVar.c, u0nVar.d, u0nVar.e, u0nVar.f, u0nVar.g, u0nVar.h, u0nVar.i, u0nVar.j, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (x0nVar instanceof v0n) {
            fetVar.e0(102119144);
            v0n v0nVar = (v0n) x0nVar;
            fbc.y(mm40Var, v0nVar.f36589a, v0nVar.b, v0nVar.c, v0nVar.d, fetVar, i & 14);
            fetVar.r(false);
            return;
        }
        if (!(x0nVar instanceof w0n)) {
            throw b1j.f(141782019, fetVar, false);
        }
        fetVar.e0(102495980);
        w0n w0nVar = (w0n) x0nVar;
        bsr0.n(mm40Var, w0nVar.f38357a, w0nVar.b, w0nVar.c, w0nVar.d, w0nVar.e, w0nVar.f, w0nVar.g, fetVar, i & 14);
        fetVar.r(false);
    }

    public static final void j(int i, fet fetVar) {
        fetVar.g0(-195967417);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            long jI = qbc.i(64.0f, 92.0f);
            ugg0 ugg0VarA = vgg0.a(16.0f);
            lh80 lh80Var = new lh80(8.0f, 6.0f, 8.0f, 6.0f);
            long jI2 = qbc.i(48.0f, 12.0f);
            ugg0 ugg0VarA2 = vgg0.a(360.0f);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarO = o7k0.o(jI, jm40Var);
            x5d x5dVarA = w5d.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarO);
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
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.n(jm40Var, 64.0f), ugg0VarA), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(lgb.J(o7k0.o(jI2, s5x0.I(o7k0.d(jm40Var, 1.0f), lh80Var)), ugg0VarA2), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f4m(i, (byte) 19);
        }
    }

    public static final void k(xkk xkkVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-198489330);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(xkkVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = b5o.f2012a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            int i3 = i2 & 14;
            boolean zI = (i3 == 4) | fetVar.i(clzVar);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new qzn(xkkVar, clzVar, (byte) 7);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            boolean zI2 = fetVar.i(clzVar) | (i3 == 4);
            Object objP3 = fetVar.P();
            if (zI2 || objP3 == cl5Var) {
                objP3 = new fun(xkkVar, clzVar, (byte) 6);
                fetVar.o0(objP3);
            }
            idm0.j(mm40Var, xkkVar, xdrVar, null, function1, (Function2) objP3, fetVar, ((i2 << 3) & 112) | 384, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z4o(xkkVar, i, b);
        }
    }

    public static final void l(mm40 mm40Var, jpm jpmVar, ipm ipmVar, j83 j83Var, float f, zcl zclVar, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        y9q0 y9q0Var = jpmVar.c;
        fetVar.g0(-1848273984);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(jpmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(ipmVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(j83Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.d(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.g(zclVar) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, f);
            boolean z = ((i2 & 896) == 256) | ((458752 & i2) == 131072);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new dpl((Object) zclVar, (Object) ipmVar, (byte) 18);
                fetVar.o0(objP);
            }
            mm40 mm40VarL = rq8.L(mm40VarN, (Function1) objP);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
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
            zcl zclVar2 = qmk.f28987a;
            mm40Var2 = jm40Var;
            v8q0.b(j83Var, o2e.e0(s5x0.L(jm40Var, 2.0f, 0.0f, 2), "BasicScoreTextTag"), 0L, new n05(jpmVar.b, y9q0Var.f42262a.b, qmk.n), 0L, null, 0L, null, qmk.B, 0, false, 1, 0, null, null, y9q0.a(y9q0Var, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447), fetVar, (i2 >> 9) & 14, 24576, 243700);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zh2(mm40Var2, jpmVar, ipmVar, j83Var, f, zclVar, i, (byte) 2);
        }
    }

    public static final void m(mm40 mm40Var, final jpm jpmVar, final kpm kpmVar, final float f, final zcl zclVar, fet fetVar, final int i) {
        kpm kpmVar2;
        final mm40 mm40Var2;
        yfe0 yfe0VarU;
        Function2 function2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-227543169);
        int i2 = i | 6 | (fetVar2.g(jpmVar) ? 32 : 16) | (fetVar2.g(kpmVar) ? 256 : 128) | (fetVar2.d(f) ? 2048 : 1024) | (fetVar2.g(zclVar) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            j83 j83Var = kpmVar.c;
            String str = j83Var.b;
            int iV = StringsKt.V(str, Separators.COLON, 0, false, 6);
            final jm40 jm40Var = jm40.b;
            if (iV == -1) {
                yfe0VarU = fetVar2.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b = 0;
                function2 = new Function2(jm40Var, jpmVar, kpmVar, f, zclVar, i, b) { // from class: a.epm

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ byte f8195a;
                    public final /* synthetic */ mm40 b;
                    public final /* synthetic */ jpm c;
                    public final /* synthetic */ kpm d;
                    public final /* synthetic */ float e;
                    public final /* synthetic */ zcl f;

                    {
                        this.f8195a = b;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f8195a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iL = x8x.L(1);
                                e3c.m(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iL2 = x8x.L(1);
                                e3c.m(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                j83 j83VarQ0 = ohq0.q0(j83Var.subSequence(0, iV));
                j83 j83VarQ1 = ohq0.q0(j83Var.subSequence(iV + 1, str.length()));
                zcl zclVar2 = qmk.f28987a;
                thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
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
                int i3 = i2 & 112;
                int i4 = i2 << 3;
                int i5 = i3 | (57344 & i4) | (i4 & 458752);
                l(null, jpmVar, kpmVar.b, j83VarQ0, f, zclVar, fetVar2, i5);
                v8q0.a(Separators.COLON, o7k0.s(jm40Var, 8.0f), jpmVar.d, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0.a(jpmVar.c, 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447), fetVar, 6, 0, 131064);
                kpmVar2 = kpmVar;
                fetVar2 = fetVar;
                l(null, jpmVar, kpmVar2.b, j83VarQ1, f, zclVar, fetVar2, i5);
                fetVar2.r(true);
                mm40Var2 = jm40Var;
            }
            yfe0VarU.d = function2;
        }
        kpmVar2 = kpmVar;
        fetVar2.X();
        mm40Var2 = mm40Var;
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            final byte b2 = 1;
            final kpm kpmVar3 = kpmVar2;
            function2 = new Function2(mm40Var2, jpmVar, kpmVar3, f, zclVar, i, b2) { // from class: a.epm

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f8195a;
                public final /* synthetic */ mm40 b;
                public final /* synthetic */ jpm c;
                public final /* synthetic */ kpm d;
                public final /* synthetic */ float e;
                public final /* synthetic */ zcl f;

                {
                    this.f8195a = b2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f8195a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iL = x8x.L(1);
                            e3c.m(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iL2 = x8x.L(1);
                            e3c.m(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL2);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void n(bby bbyVar) {
        if (bbyVar == null || !bbyVar.isActive()) {
            return;
        }
        bbyVar.cancel(null);
    }

    public static final void o(AbstractMap abstractMap, jvn jvnVar) {
        jvnVar.getClass();
        abstractMap.put("cfView", Integer.valueOf(jvnVar.getId()));
    }

    public static final void p(AbstractMap abstractMap, Set set) {
        set.getClass();
        if (set.isEmpty()) {
            return;
        }
        abstractMap.put("champIds", CollectionsKt.b0(CollectionsKt.z0(set), Separators.COMMA, null, null, null, 62));
    }

    public static void q(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        hny.u(f140.k(obj, "null value in entry: ", "=null"));
    }

    public static final boolean r(kzv kzvVar, boolean z) {
        kzvVar.getClass();
        return z && kzvVar.Z == azv.d && kzvVar.b == q4f.c;
    }

    public static void s(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static vsg0 t(int i, long j) {
        return new vsg0(new pne(j, (i & 2) != 0 ? 0L : 1000L, (i & 4) == 0 ? 100L : 1000L, null, (byte) 0));
    }

    public static final void u(LinkedHashMap linkedHashMap, Set set) {
        set.getClass();
        if (set.isEmpty()) {
            return;
        }
        linkedHashMap.put("countryIds", CollectionsKt.b0(CollectionsKt.z0(set), Separators.COMMA, null, null, null, 62));
    }

    public static n8m v(fet fetVar) {
        zfn zfnVar = zaq0.b;
        return new n8m(((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), ((ThemeColors) fetVar.k(zfnVar)).getSeparator60(), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary(), ((ThemeColors) fetVar.k(zfnVar)).getSecondary(), qmk.i);
    }

    public static final ArrayList w(c0o c0oVar, boolean z) {
        c0oVar.getClass();
        List listJ = z ? q3d.j(e9l.MINI_MAP, e9l.SELECTED_HEROES) : kotlin.collections.a.c(e9l.MINI_MAP_SELECTED_HEROES);
        ArrayList arrayList = new ArrayList();
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            Object next = y2Var.next();
            if (!listJ.contains((e9l) next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final int x(fet fetVar) {
        fetVar.getClass();
        return Long.hashCode(fetVar.T);
    }

    public static final gbn y(Function1 function1) {
        return new gbn(new zuh((byte) 17), new pue(3, (byte) 28), new olh(function1, (byte) 16), zdh.k);
    }

    public static final d280 z(tca tcaVar, boolean z) {
        String str;
        if (tcaVar.i) {
            return new b280(z ? R.drawable.ic_glyph_color_logo_home : R.drawable.ic_glyph_color_logo_away);
        }
        String str2 = "";
        if (!z ? (str = (String) CollectionsKt.firstOrNull(tcaVar.c)) != null : (str = (String) CollectionsKt.firstOrNull(tcaVar.b)) != null) {
            str2 = str;
        }
        rpp0 rpp0Var = tcaVar.f33711a;
        return new c280(vsm0.s(z ? rpp0Var.a() : rpp0Var.c(), str2), R.drawable.ic_glyph_placeholder_player);
    }
}
