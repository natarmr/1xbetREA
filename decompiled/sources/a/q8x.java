package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class q8x {
    public static final qw00 A(q16 q16Var) throws ews0, n64, kj50, i660, fn50 {
        String str;
        String str2;
        pw00 pw00Var;
        q16Var.getClass();
        kuw kuwVar = q16Var.c;
        String str3 = q16Var.f27936a;
        Object obj = q16Var.d;
        qvq0 qvq0Var = (qvq0) kuwVar;
        String str4 = "";
        String str5 = null;
        switch (qvq0Var == null ? -1 : rw00.f31197a[qvq0Var.ordinal()]) {
            case 1:
                throw new n64();
            case 2:
                qw00 qw00Var = (qw00) obj;
                if (qw00Var == null || (str = qw00Var.c) == null) {
                    jf4.k(null);
                    return null;
                }
                str5 = qw00Var != null ? str : null;
                throw new kj50(str5 != null ? str5 : "");
            case 3:
                throw new ews0();
            case 4:
                throw new k6a("Captcha error");
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                if (str3 == null) {
                    jf4.k(null);
                    return null;
                }
                qw00 qw00Var2 = (qw00) obj;
                if (qw00Var2 == null || (str2 = qw00Var2.c) == null) {
                    jf4.k(null);
                    return null;
                }
                if (qw00Var2 == null) {
                    str2 = null;
                }
                String str6 = str2 == null ? "" : str2;
                String str7 = qw00Var2 != null ? qw00Var2.f : null;
                if (str7 == null) {
                    str7 = "";
                }
                String strL = kng0.l(str3, Separators.SP, str7);
                if (qw00Var2 != null && (pw00Var = qw00Var2.e) != null) {
                    str5 = pw00Var.f27687a;
                }
                String str8 = str5 == null ? "" : str5;
                boolean z = kuwVar == qvq0.f;
                boolean z2 = kuwVar == qvq0.d || kuwVar == qvq0.e;
                qvq0 qvq0Var2 = (qvq0) kuwVar;
                switch (qvq0Var2 != null ? rw00.f31197a[qvq0Var2.ordinal()] : -1) {
                    case 5:
                        str4 = "surname";
                        break;
                    case 6:
                        str4 = "phone_pinned";
                        break;
                    case 7:
                        str4 = "question";
                        break;
                    case 8:
                        str4 = "email";
                        break;
                    case 9:
                    case 11:
                        str4 = "phone_activate";
                        break;
                }
                throw new fn50(str6, strL, str8, str4, z, z2, kuwVar == qvq0.c || kuwVar == qvq0.f29398a || kuwVar == qvq0.b);
            case 12:
                if (str3 == null) {
                    str3 = "";
                }
                throw new i660(str3);
            default:
                return (qw00) q16Var.a();
        }
    }

    public static final List B(List list) {
        if (list == null) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ooa ooaVar = (ooa) obj;
            Integer num = ooaVar.b;
            int iIntValue = num != null ? num.intValue() : 0;
            Integer num2 = ooaVar.f25586a;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            long j = iIntValue;
            if (6 <= j && j < 16) {
                long j2 = iIntValue2;
                if (0 <= j2 && j2 < 4) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public static final List C(ArrayList arrayList, List list) {
        Object next;
        list.getClass();
        if (list.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = new ArrayList();
        ArrayList<vt20> arrayList4 = new ArrayList();
        for (Object obj : list) {
            if (((vt20) obj).c != 0) {
                arrayList4.add(obj);
            }
        }
        for (vt20 vt20Var : arrayList4) {
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((ou20) next).b != vt20Var.f37982a);
            ou20 ou20Var = (ou20) next;
            if (ou20Var != null) {
                arrayList2.remove(ou20Var);
                arrayList3.add(ou20Var);
            }
        }
        arrayList3.addAll(arrayList2);
        return arrayList3;
    }

    public static final iwk D(o1x o1xVar, kzj kzjVar) {
        uto0 uto0Var = o1xVar.c;
        if (!(uto0Var instanceof zjt)) {
            return new nr00(kzjVar);
        }
        mlu0 mlu0VarR = o5n0.r(((zjt) uto0Var).getView());
        synchronized (mlu0VarR) {
            fbv fbvVar = mlu0VarR.b;
            if (fbvVar != null) {
                Bitmap.Config[] configArr = lut0.f20691a;
                if (Intrinsics.d(Looper.myLooper(), Looper.getMainLooper()) && mlu0VarR.e) {
                    mlu0VarR.e = false;
                    fbvVar.b = kzjVar;
                    return fbvVar;
                }
            }
            bby bbyVar = mlu0VarR.c;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            mlu0VarR.c = null;
            View view = mlu0VarR.f22012a;
            fbv fbvVar2 = new fbv();
            fbvVar2.f9280a = view;
            fbvVar2.b = kzjVar;
            mlu0VarR.b = fbvVar2;
            return fbvVar2;
        }
    }

    public static final boolean E(Map map, dsh0 dsh0Var) {
        Boolean bool = (Boolean) map.get(dsh0Var);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final long F(ArrayList arrayList, List list) {
        Object next;
        list.getClass();
        long j = 0;
        if (!list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list) {
                if (((vt20) obj).d) {
                    arrayList3.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ou20 ou20Var = (ou20) it.next();
                Iterator it2 = arrayList3.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (((vt20) next).f37982a != ou20Var.b);
                if (((vt20) next) == null) {
                    arrayList2.add(ou20Var);
                } else {
                    j++;
                }
            }
            arrayList.clear();
            arrayList.addAll(arrayList2);
        }
        return j;
    }

    public static final void G(gx3 gx3Var, Function1 function1) {
        gx3 gx3Var2 = new gx3(999);
        int i = gx3Var.c;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            gx3Var2.put(gx3Var.f(i2), gx3Var.j(i2));
            i2++;
            i3++;
            if (i3 == 999) {
                function1.invoke(gx3Var2);
                gx3Var2.clear();
                i3 = 0;
            }
        }
        if (i3 > 0) {
            function1.invoke(gx3Var2);
        }
    }

    public static final void H(cp cpVar) {
        ((n2k) cpVar.u).c.setSubtitle(cpVar.w(R.string.promo_item_subtitle, String.valueOf(((t5c0) cpVar.u()).b), ((t5c0) cpVar.u()).c));
    }

    public static final long I(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final String J(ms2 ms2Var) {
        ms2Var.getClass();
        if (ms2Var == null) {
            return null;
        }
        if (ms2Var instanceof lr2) {
            return "popular_new_top";
        }
        if (ms2Var instanceof jr2) {
            return "popular_new_esports";
        }
        if (ms2Var instanceof kr2) {
            return "popular_new_sport";
        }
        return null;
    }

    public static final nas K(h600 h600Var, sip sipVar, String str, Long l, long j, Integer num) {
        ArrayList arrayList;
        String str2;
        Long l2;
        h600Var.getClass();
        sipVar.getClass();
        Long l3 = h600Var.f12506a;
        ua30 ua30Var = h600Var.E;
        long jLongValue = l3 != null ? l3.longValue() : 0L;
        Long l4 = h600Var.c;
        long jLongValue2 = l4 != null ? l4.longValue() : 0L;
        Long l5 = h600Var.s;
        String str3 = h600Var.j;
        String str4 = h600Var.m;
        String str5 = h600Var.h;
        lfu0 lfu0Var = h600Var.D;
        String str6 = lfu0Var != null ? lfu0Var.b : null;
        Boolean bool = lfu0Var != null ? lfu0Var.f19976a : null;
        String str7 = h600Var.l;
        Integer num2 = h600Var.b;
        String str8 = h600Var.e;
        iun iunVar = iun.f15405a;
        List list = h600Var.C;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(e3c.K((tdo) it.next(), sipVar));
                str7 = str7;
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        String str9 = str7;
        oas oasVarL0 = ucx.l0(h600Var.z);
        oas oasVarL1 = ucx.l0(h600Var.A);
        Long l6 = h600Var.f;
        Long lValueOf = l6 != null ? Long.valueOf(l6.longValue() - j) : null;
        s3n0 s3n0Var = h600Var.y;
        Long l7 = s3n0Var != null ? s3n0Var.f31567a : null;
        okl0 okl0Var = h600Var.w;
        long jLongValue3 = (okl0Var == null || (l2 = okl0Var.f25410a) == null) ? 0L : l2.longValue();
        ufs ufsVarR = ua30Var != null ? qxw.R(ua30Var) : null;
        Boolean bool2 = h600Var.F;
        Long lValueOf2 = (ua30Var == null || (str2 = ua30Var.m) == null) ? null : Long.valueOf(Long.parseLong(str2));
        Boolean bool3 = h600Var.p;
        Integer num3 = h600Var.q;
        boolean zD = Intrinsics.d(h600Var.v, Boolean.TRUE);
        q480 q480Var = h600Var.B;
        String str10 = q480Var != null ? q480Var.f28085a : null;
        boh.b.getClass();
        boh bohVarC = qud.c(num);
        Long l8 = h600Var.g;
        return new nas(jLongValue, jLongValue2, l5, str3, str4, str5, str6, bool, null, str9, num2, Boolean.FALSE, str8, null, iunVar, arrayList, l, sipVar, str, null, l6, lValueOf, l7, jLongValue3, oasVarL0, oasVarL1, zD, null, ufsVarR, null, bool2, lValueOf2, bool3, num3, null, str10, bohVarC, l8 != null ? Integer.valueOf((int) l8.longValue()) : null);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public static final eoy L(hoy hoyVar) {
        ?? arrayList;
        List listB;
        hoyVar.getClass();
        List list = hoyVar.b;
        List list2 = hoyVar.f13415a;
        List listQ0 = null;
        if (list == null || (listB = B(list)) == null) {
            arrayList = iun.f15405a;
        } else {
            if (listB.isEmpty()) {
                listB = list2 != null ? B(list2) : null;
            }
            if (listB != null) {
                arrayList = new ArrayList(r3d.q(listB, 10));
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    arrayList.add(x1x.Q((ooa) it.next()));
                }
            } else {
                arrayList = iun.f15405a;
            }
        }
        if (list2 != null) {
            if (list == null) {
                list = iun.f15405a;
            }
            listQ0 = CollectionsKt.q0(list2, list);
        }
        if (listQ0 == null) {
            listQ0 = iun.f15405a;
        }
        List listB2 = B(listQ0);
        ArrayList arrayList2 = new ArrayList(r3d.q(listB2, 10));
        Iterator it2 = listB2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(x1x.Q((ooa) it2.next()));
        }
        return new eoy(arrayList2, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e A[PHI: r3
  0x006e: PHI (r3v4 a.s9b0) = (r3v3 a.s9b0), (r3v5 a.s9b0), (r3v6 a.s9b0) binds: [B:38:0x00ad, B:27:0x0085, B:21:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:33:0x0098  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a4 A[LOOP:1: B:32:0x0096->B:36:0x00a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0090, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    public static final dq00 M(wrd wrdVar) {
        ?? arrayList;
        s9b0 s9b0Var;
        int i;
        wrdVar.getClass();
        Boolean bool = wrdVar.C.q;
        Boolean bool2 = Boolean.TRUE;
        Intrinsics.d(bool, bool2);
        Intrinsics.d(wrdVar.n0.b0, bool2);
        Intrinsics.d(wrdVar.o0.c0, bool2);
        Integer num = wrdVar.C6.b;
        Intrinsics.d(wrdVar.f0.T, bool2);
        List list = wrdVar.D6.c;
        if (list == null) {
            list = iun.f15405a;
        }
        List<String> list2 = wrdVar.E6.d;
        if (list2 != null) {
            arrayList = new ArrayList();
            for (String str : list2) {
                int iHashCode = str.hashCode();
                s9b0 s9b0Var2 = null;
                if (iHashCode != -1367569419) {
                    if (iHashCode != -761348791) {
                        if (iHashCode == 466165515 && str.equals("virtual")) {
                            s9b0Var = s9b0.AGGREGATOR;
                            if (ay3.W(wrdVar)) {
                                s9b0Var2 = s9b0Var;
                            }
                        } else {
                            for (s9b0 s9b0Var3 : s9b0.values()) {
                                if (s9b0Var3.f31846a.equals(str)) {
                                    s9b0Var2 = s9b0Var3;
                                    break;
                                }
                            }
                        }
                    } else if (str.equals("xgames")) {
                        s9b0Var = s9b0.ONE_X_GAMES;
                        if (Intrinsics.d(wrdVar.W2.l, Boolean.TRUE)) {
                            s9b0Var2 = s9b0Var;
                        }
                    } else {
                        while (i < r5) {
                            if (s9b0Var3.f31846a.equals(str)) {
                                s9b0Var2 = s9b0Var3;
                                break;
                            }
                        }
                    }
                } else if (str.equals("casino")) {
                    s9b0Var = s9b0.AGGREGATOR;
                    if (ay3.V(wrdVar)) {
                        s9b0Var2 = s9b0Var;
                    }
                } else {
                    while (i < r5) {
                        if (s9b0Var3.f31846a.equals(str)) {
                            s9b0Var2 = s9b0Var3;
                            break;
                        }
                    }
                }
                if (s9b0Var2 != null) {
                    arrayList.add(s9b0Var2);
                }
            }
        } else {
            arrayList = iun.f15405a;
        }
        return new dq00(list, (List) arrayList);
    }

    public static final void N(ArrayList arrayList, HashMap map, HashSet hashSet, long j, b8u b8uVar, a1d a1dVar) {
        int i;
        Boolean bool;
        a1d a1dVar2;
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            long jLongValue = ((Number) entry.getKey()).longValue();
            if (!((Boolean) entry.getValue()).booleanValue() || hashSet.contains(Long.valueOf(jLongValue))) {
                a1dVar2 = a1dVar;
            } else {
                a1dVar2 = a1dVar;
                a1d.h(a1dVar2, jLongValue, j, false);
            }
            a1dVar = a1dVar2;
        }
        a1d a1dVar3 = a1dVar;
        mno mnoVar = (mno) ((goo) b8uVar.f2175a).f11640a.f35973a.get(Long.valueOf(j));
        if (mnoVar != null ? mnoVar.b : false) {
            return;
        }
        Iterable iterableS0 = CollectionsKt.S0(arrayList);
        if ((iterableS0 instanceof Collection) && ((Collection) iterableS0).isEmpty()) {
            return;
        }
        Iterator it = iterableS0.iterator();
        do {
            iil iilVar = (iil) it;
            if (!iilVar.b.hasNext()) {
                return;
            }
            IndexedValue indexedValue = (IndexedValue) iilVar.next();
            i = indexedValue.f46061a;
            bool = (Boolean) map.get(Long.valueOf(((ou20) indexedValue.b).b));
        } while ((bool != null ? bool.booleanValue() : false) == (i < 3));
        int i2 = 0;
        for (Object obj : arrayList) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            long j2 = ((ou20) obj).b;
            boolean z = i2 < 3;
            a1d a1dVar4 = a1dVar3;
            a1d.h(a1dVar4, j2, j, z);
            a1dVar3 = a1dVar4;
            i2 = i3;
        }
    }

    public static final void a(mm40 mm40Var, bhl0 bhl0Var, s0 s0Var, ahl0 ahl0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        n2q n2qVar;
        fetVar.g0(2113969845);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(bhl0Var) ? 32 : 16) | (fetVar.g(s0Var) ? 256 : 128) | (fetVar.g(ahl0Var) ? 2048 : 1024) | (fetVar.i(function0) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = i3 >> 9;
            ahl0Var.getClass();
            boolean z = (((i4 & 14) ^ 6) > 4 && fetVar.g(ahl0Var)) || (i4 & 6) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                if (ahl0Var instanceof zgl0) {
                    pz40 pz40Var = s6t0.f31722a;
                    n2qVar = new n2q(s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getSecondary());
                } else if (!(ahl0Var instanceof ygl0)) {
                    t9f.b();
                    return;
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    StaticColors staticColors = StaticColors.INSTANCE;
                    n2qVar = new n2q(staticColors.m125getWhite100d7_KjU(), staticColors.m130getWhite600d7_KjU(), staticColors.m130getWhite600d7_KjU());
                }
                objP = n2qVar;
                fetVar.o0(objP);
            }
            n2q n2qVar2 = (n2q) objP;
            long j = n2qVar2.f22814a;
            ugd ugdVarM = u1c.M(2111185577, new nhl0(bhl0Var, n2qVar2, (byte) 3), fetVar);
            ugd ugdVarM2 = u1c.M(-64730744, new rqc0(n2qVar2, (byte) 22), fetVar);
            int i5 = 221184 | (i3 & 14);
            int i6 = i3 >> 3;
            b(mm40Var, s0Var, j, function0, ugdVarM, ugdVarM2, fetVar, i5 | (i6 & 112) | (i6 & 7168));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gja(mm40Var, bhl0Var, s0Var, ahl0Var, function0, i, (byte) 8);
        }
    }

    public static final void b(mm40 mm40Var, s0 s0Var, long j, Function0 function0, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        int i2;
        fetVar.g0(-659057945);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(s0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 131072 : 65536;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = (i2 & 7168) == 2048;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new xhl0(function0, b);
                fetVar.o0(objP2);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(jm40Var, gy40Var, null, false, null, (Function0) objP2, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = i120.Q(o7k0.e(s5x0.L(mm40VarW, 0.0f, 6.0f, 1), 36.0f), j, s0Var).e(mm40Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
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
            mm40 mm40VarE0 = o2e.e0(s5x0.L(jr8.f16991a.b(jm40Var, gqw0.e), 8.0f, 0.0f, 2), "MEDIUM_CARD_SMALL_TEAM_LOGO_ALL_MARKETS");
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE0);
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
            Object objValueOf = Integer.valueOf(((i2 >> 9) & 112) | 6);
            zhg0 zhg0Var = zhg0.f44392a;
            ugdVar.F(zhg0Var, fetVar, objValueOf);
            h97.p(((i2 >> 12) & 112) | 6, ugdVar2, zhg0Var, fetVar, true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jp(mm40Var, s0Var, j, function0, ugdVar, ugdVar2, i);
        }
    }

    public static final void c(mm40 mm40Var, pz40 pz40Var, final lil0 lil0Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        o2q o2qVar;
        long primary20;
        fetVar.g0(2109978706);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(pz40Var) ? 32 : 16) | (fetVar.g(lil0Var) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            ahl0 ahl0VarC = lil0Var.c();
            ahl0VarC.getClass();
            boolean zG = fetVar.g(ahl0VarC);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                if (ahl0VarC instanceof zgl0) {
                    pz40 pz40Var2 = s6t0.f31722a;
                    zgl0 zgl0Var = (zgl0) ahl0VarC;
                    o2qVar = new o2q(s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getPrimary20(), zgl0Var.f44350a, zgl0Var.b, s6t0.b().f33626a.getBackgroundContent(), s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getPrimary());
                } else {
                    if (!(ahl0VarC instanceof ygl0)) {
                        t9f.b();
                        return;
                    }
                    pz40 pz40Var3 = s6t0.f31722a;
                    StaticColors staticColors = StaticColors.INSTANCE;
                    ygl0 ygl0Var = (ygl0) ahl0VarC;
                    o2qVar = new o2q(staticColors.m125getWhite100d7_KjU(), staticColors.m126getWhite200d7_KjU(), ygl0Var.f42591a, ygl0Var.b, staticColors.m62getBlack0d7_KjU(), staticColors.m127getWhite300d7_KjU(), staticColors.m130getWhite600d7_KjU(), staticColors.m130getWhite600d7_KjU(), staticColors.m123getWhite0d7_KjU());
                }
                objP = o2qVar;
                fetVar.o0(objP);
            } else {
                i3 = i3;
            }
            final o2q o2qVar2 = (o2q) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = jgk0.b(new m9l0(pz40Var, (byte) 29));
                fetVar.o0(objP2);
            }
            final l7m0 l7m0Var = (l7m0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = jgk0.b(new zhl0(pz40Var, (byte) 0));
                fetVar.o0(objP3);
            }
            final l7m0 l7m0Var2 = (l7m0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = jgk0.b(new m9l0(pz40Var, (byte) 24));
                fetVar.o0(objP4);
            }
            final l7m0 l7m0Var3 = (l7m0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == cl5Var) {
                objP5 = jgk0.b(new m9l0(pz40Var, (byte) 25));
                fetVar.o0(objP5);
            }
            l7m0 l7m0Var4 = (l7m0) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == cl5Var) {
                objP6 = jgk0.b(new m9l0(pz40Var, (byte) 26));
                fetVar.o0(objP6);
            }
            final l7m0 l7m0Var5 = (l7m0) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == cl5Var) {
                objP7 = jgk0.b(new m9l0(pz40Var, (byte) 27));
                fetVar.o0(objP7);
            }
            final l7m0 l7m0Var6 = (l7m0) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == cl5Var) {
                objP8 = jgk0.b(new m9l0(pz40Var, (byte) 28));
                fetVar.o0(objP8);
            }
            l7m0 l7m0Var7 = (l7m0) objP8;
            Object objP9 = fetVar.P();
            if (objP9 == cl5Var) {
                objP9 = jgk0.b(new hhl0(pz40Var, l7m0Var5, l7m0Var6, (byte) 6));
                fetVar.o0(objP9);
            }
            final l7m0 l7m0Var8 = (l7m0) objP9;
            Object objP10 = fetVar.P();
            if (objP10 == cl5Var) {
                objP10 = jgk0.b(new hhl0(pz40Var, l7m0Var5, l7m0Var6, (byte) 7));
                fetVar.o0(objP10);
            }
            final l7m0 l7m0Var9 = (l7m0) objP10;
            if (((Boolean) l7m0Var7.getValue()).booleanValue() && (lil0Var.c() instanceof zgl0)) {
                pz40 pz40Var4 = s6t0.f31722a;
                primary20 = s6t0.b().f33626a.getPrimary20();
            } else {
                primary20 = o2qVar2.f;
            }
            long j = o2qVar2.e;
            boolean zF = fetVar.f(o2qVar2.g) | fetVar.f(primary20) | fetVar.f(j);
            Object objP11 = fetVar.P();
            if (zF || objP11 == cl5Var) {
                long j2 = primary20;
                objP11 = new q1m(j2, o2qVar2.e, o2qVar2.g);
                primary20 = j2;
                fetVar.o0(objP11);
            }
            final q1m q1mVar = (q1m) objP11;
            boolean zF2 = fetVar.f(primary20) | fetVar.f(j);
            Object objP12 = fetVar.P();
            if (zF2 || objP12 == cl5Var) {
                objP12 = new k1m(primary20, j);
                fetVar.o0(objP12);
            }
            final k1m k1mVar = (k1m) objP12;
            boolean zF3 = fetVar.f(primary20) | fetVar.f(j) | fetVar.f(o2qVar2.h);
            Object objP13 = fetVar.P();
            if (zF3 || objP13 == cl5Var) {
                long j3 = primary20;
                objP13 = new b1m(j3, o2qVar2.e, o2qVar2.h);
                primary20 = j3;
                fetVar.o0(objP13);
            }
            final b1m b1mVar = (b1m) objP13;
            boolean zF4 = fetVar.f(primary20) | fetVar.f(j);
            Object objP14 = fetVar.P();
            if (zF4 || objP14 == cl5Var) {
                objP14 = new tsl(new qsl(primary20, j));
                fetVar.o0(objP14);
            }
            final tsl tslVar = (tsl) objP14;
            boolean zF5 = fetVar.f(primary20) | fetVar.f(j);
            Object objP15 = fetVar.P();
            if (zF5 || objP15 == cl5Var) {
                objP15 = new usl(new qsl(primary20, j));
                fetVar.o0(objP15);
            }
            final usl uslVar = (usl) objP15;
            iil0 iil0VarD = lil0Var.d();
            long j4 = o2qVar2.f24543a;
            long j5 = o2qVar2.b;
            long j6 = o2qVar2.i;
            ugd ugdVarM = u1c.M(-366527611, new xdr() { // from class: a.vhl0
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    ir8 ir8Var = (ir8) obj;
                    fet fetVar2 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ir8Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= fetVar2.g(ir8Var) ? 4 : 2;
                    }
                    if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                        l7m0 l7m0Var10 = l7m0Var;
                        lil0 lil0Var2 = lil0Var;
                        o2q o2qVar3 = o2qVar2;
                        l7m0 l7m0Var11 = l7m0Var3;
                        tfx.d(ir8Var, 0.0f, 0.0f, 0.0f, u1c.M(2135495442, new ajw((Object) l7m0Var10, (Object) lil0Var2, (Object) o2qVar3, (Object) l7m0Var11, (Object) l7m0Var2, (byte) 28), fetVar2), fetVar2, (iIntValue & 14) | 24576, 7);
                        mm40 mm40VarB = ir8Var.b(jm40.b, gqw0.c);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(ffb0.R(mm40VarB, 0.0f, -6.0f, 1), 0.0f, 0.0f, 2.0f, 0.0f, 11);
                        thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar2, 0);
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
                        if (l7m0Var11.getValue() == k0d.b) {
                            fetVar2.e0(2029538283);
                            agc.p(null, b1mVar, fetVar2, 0, 1);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(2029620929);
                            fetVar2.r(false);
                        }
                        if (((Boolean) l7m0Var5.getValue()).booleanValue()) {
                            fetVar2.e0(2029661291);
                            agc.p(null, q1mVar, fetVar2, 0, 1);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(2029743937);
                            fetVar2.r(false);
                        }
                        if (((Boolean) l7m0Var6.getValue()).booleanValue()) {
                            fetVar2.e0(2029784299);
                            agc.p(null, k1mVar, fetVar2, 0, 1);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(2029866945);
                            fetVar2.r(false);
                        }
                        if (((Boolean) l7m0Var8.getValue()).booleanValue()) {
                            fetVar2.e0(2029909291);
                            lgb.j(null, tslVar, fetVar2, 0, 1);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(2029991937);
                            fetVar2.r(false);
                        }
                        if (((Boolean) l7m0Var9.getValue()).booleanValue()) {
                            fetVar2.e0(2030036329);
                            lgb.j(null, uslVar, fetVar2, 0, 1);
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(2030120897);
                            fetVar2.r(false);
                        }
                        fetVar2.r(true);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar);
            int i4 = i3 << 15;
            d(mm40Var, iil0VarD, l7m0Var3, l7m0Var4, l7m0Var7, j4, j5, j6, function0, function1, ugdVarM, fetVar, (i3 & 14) | 28032 | (234881024 & i4) | (i4 & 1879048192));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gja(mm40Var, pz40Var, lil0Var, function0, function1, i, (byte) 9);
        }
    }

    public static final void d(final mm40 mm40Var, final iil0 iil0Var, final l7m0 l7m0Var, final l7m0 l7m0Var2, final l7m0 l7m0Var3, final long j, final long j2, final long j3, final Function0 function0, final Function0 function1, ugd ugdVar, fet fetVar, final int i) {
        int i2;
        l7m0 l7m0Var4;
        ugd ugdVar2;
        boolean z;
        fetVar.g0(489709993);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(iil0Var) : fetVar.i(iil0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(l7m0Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            l7m0Var4 = l7m0Var3;
            i2 |= fetVar.g(l7m0Var4) ? 16384 : 8192;
        } else {
            l7m0Var4 = l7m0Var3;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.f(j) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= fetVar.f(j2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= fetVar.f(j3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.i(function0) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= fetVar.i(function1) ? 536870912 : 268435456;
        }
        if (fetVar.U(i2 & 1, (306783379 & i2) != 306783378)) {
            boolean z2 = l7m0Var.getValue() == k0d.b;
            Context context = (Context) fetVar.k(dy2.b);
            mm40 mm40VarE0 = o2e.e0(epv0.N(jm40.b, z2 ? 0.5f : 1.0f), "SPORT_EXPRESS_WIDTH_MARKET_TAG");
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z3 = !z2;
            boolean zI = ((1879048192 & i2) == 536870912) | fetVar.i(context);
            Object objP2 = fetVar.P();
            if (zI || objP2 == obj) {
                objP2 = new jhl0(function1, context, (byte) 3);
                fetVar.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z4 = (234881024 & i2) == 67108864;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == obj) {
                objP3 = new l3c0(function0, (byte) 29);
                fetVar.o0(objP3);
            }
            mm40 mm40VarZ = y860.Z(mm40VarE0, gy40Var, z3, function2, (Function0) objP3, 440);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarB = o7k0.b(s5x0.L(mm40VarZ, 0.0f, 6.0f, 1), 0.0f, 36.0f, 1);
            boolean z5 = ((i2 & 29360128) == 8388608) | ((i2 & 7168) == 2048) | ((i2 & 112) == 32 || ((i2 & 64) != 0 && fetVar.i(iil0Var))) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | ((3670016 & i2) == 1048576);
            Object objP4 = fetVar.P();
            if (z5 || objP4 == obj) {
                z = false;
                Object dh20Var = new dh20(iil0Var, l7m0Var2, l7m0Var4, j, j2, j3);
                fetVar.o0(dh20Var);
                objP4 = dh20Var;
            } else {
                z = false;
            }
            mm40 mm40VarE = rq8.K(mm40VarB, (Function1) objP4).e(mm40Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, z);
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
            ugdVar2 = ugdVar;
            ua80.p(54, ugdVar2, jr8.f16991a, fetVar, true);
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final ugd ugdVar3 = ugdVar2;
            yfe0VarU.d = new Function2() { // from class: a.whl0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iL = x8x.L(i | 1);
                    q8x.d(mm40Var, iil0Var, l7m0Var, l7m0Var2, l7m0Var3, j, j2, j3, function0, function1, ugdVar3, (fet) obj2, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final long e(int i) {
        if (!(i > 0)) {
            adx.a("The span value should be higher than 0");
        }
        return i;
    }

    public static final void f(mm40 mm40Var, beo beoVar, boolean z, fet fetVar, int i) {
        ugd ugdVarM;
        beoVar.getClass();
        fetVar.g0(-1675939917);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(beoVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarE0 = o2e.e0(o7k0.d(mm40Var, 1.0f), "BET_DETAILS_EVENT_CARD_TAG");
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new h7w((byte) 21);
                fetVar.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40VarE0, (Function1) objP);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 12.0f, 7);
            if (beoVar.e.isEmpty()) {
                fetVar.e0(-2014352511);
                fetVar.r(false);
                ugdVarM = null;
            } else {
                fetVar.e0(-2016228724);
                ugdVarM = u1c.M(635354365, new xxv(beoVar, (byte) 17), fetVar);
                fetVar.r(false);
            }
            r8x.i(mm40VarN, beoVar, ugdVarM, fetVar, i2 & 112);
            e9x.p(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), beoVar.k, z, fetVar, i2 & 896);
            fetVar.e0(-1866083648);
            for (aeo aeoVar : beoVar.l) {
                fetVar.b0(1184744809, aeoVar.a());
                if (aeoVar instanceof wdo) {
                    fetVar.e0(-1927556505);
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    n4c.q(s5x0.N(mm40VarD2, 0.0f, 0.0f, 0.0f, 6.0f, 7), (wdo) aeoVar, fetVar, 0);
                    fetVar.r(false);
                } else if (aeoVar instanceof bao) {
                    fetVar.e0(-1927275893);
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar3 = qmk.f28987a;
                    xkb.s(s5x0.N(mm40VarD3, 0.0f, 0.0f, 0.0f, 6.0f, 7), (bao) aeoVar, fetVar, 0);
                    fetVar.r(false);
                } else if ((aeoVar instanceof ydo) && !z) {
                    fetVar.e0(-1926982137);
                    mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar4 = qmk.f28987a;
                    aac.s(s5x0.N(mm40VarD4, 0.0f, 0.0f, 0.0f, 6.0f, 7), (ydo) aeoVar, fetVar, 0);
                    fetVar.r(false);
                } else if (aeoVar instanceof meo) {
                    fetVar.e0(-1926698363);
                    mm40 mm40VarD5 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar5 = qmk.f28987a;
                    fbc.A(s5x0.N(mm40VarD5, 0.0f, 0.0f, 0.0f, 6.0f, 7), (meo) aeoVar, fetVar, 0);
                    fetVar.r(false);
                } else if (aeoVar instanceof dho) {
                    fetVar.e0(-1926410559);
                    mm40 mm40VarD6 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar6 = qmk.f28987a;
                    vbc.B(s5x0.N(mm40VarD6, 0.0f, 0.0f, 0.0f, 6.0f, 7), (dho) aeoVar, fetVar, 0);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-1926160141);
                    fetVar.r(false);
                }
                fetVar.r(false);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q2n((Object) mm40Var, (Object) beoVar, z, i, (byte) 7);
        }
    }

    public static final void g(mm40 mm40Var, apq0 apq0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(2090756626);
        int i2 = i | 6 | (fetVar2.g(apq0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            ugg0 ugg0Var2 = new ugg0(zclVar, zclVar, zclVar, zclVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarJ = s5x0.J(i120.Q(jm40Var, backgroundContent, ugg0Var2), 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            v8q0.a(xsm0.t(R.string.toto_jackpot_history_item_title, new Object[]{apq0Var.f1266a}, fetVar2), s5x0.N(new wkw(gqw0.n), 0.0f, 0.0f, 0.0f, 12.0f, 7), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            w(null, apq0Var, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), fetVar2, i2 & 112, 1);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(mm40Var2, apq0Var, i, (byte) 25);
        }
    }

    public static final void h(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(-298888805);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
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
            bsr0.j(0, 1, fetVar, null);
            long jM70getBlack200d7_KjU = StaticColors.INSTANCE.m70getBlack200d7_KjU();
            zcl zclVar = qmk.f28987a;
            pym0.c(null, jM70getBlack200d7_KjU, s5x0.t(qmk.a(fetVar).d, 0.0f, 2), fetVar, 0, 1);
            twn.v(6, ugdVar, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fb8(mm40Var, ugdVar, i, (byte) 7);
        }
    }

    public static final void i(mm40 mm40Var, j43 j43Var, xdr xdrVar, ugd ugdVar, fet fetVar, int i) {
        ugd ugdVar2;
        boolean z;
        fetVar.g0(-1255993687);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(j43Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = o7k0.w(s5x0.L(mm40VarD, 0.0f, 4.0f, 1), null, false, 3);
            thg0 thg0VarA = shg0.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            x7z x7zVar = new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, x7zVar);
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
            y5d y5dVar = y5d.f42040a;
            if (xdrVar == null) {
                fetVar.e0(-1070241594);
                z = false;
            } else {
                z = false;
                fetVar.e0(1489496731);
                xdrVar.F(y5dVar, fetVar, Integer.valueOf(((i2 >> 3) & 112) | 6));
            }
            fetVar.r(z);
            ugdVar2 = ugdVar;
            vqd.t(54, ugdVar2, y5dVar, fetVar, true);
            if (j43Var != null) {
                fetVar.e0(-2010937737);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                i4w0.g(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), j43Var, new ay6(null, null, 1023), fetVar, i2 & 112);
                fetVar.r(false);
            } else {
                fetVar.e0(-2010624451);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fy7((byte) 3, i, mm40Var, j43Var, xdrVar, ugdVar2);
        }
    }

    public static final void j(mm40 mm40Var, s0 s0Var, ahl0 ahl0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(1334978496);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(s0Var) ? 32 : 16) | (fetVar.g(ahl0Var) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 >> 6;
            ahl0Var.getClass();
            boolean z = (((i4 & 14) ^ 6) > 4 && fetVar.g(ahl0Var)) || (i4 & 6) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                if (ahl0Var instanceof zgl0) {
                    pz40 pz40Var = s6t0.f31722a;
                    objP = new p2q(s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getSecondary());
                } else if (!(ahl0Var instanceof ygl0)) {
                    t9f.b();
                    return;
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    StaticColors staticColors = StaticColors.INSTANCE;
                    objP = new p2q(staticColors.m125getWhite100d7_KjU(), staticColors.m130getWhite600d7_KjU());
                }
                fetVar.o0(objP);
            }
            p2q p2qVar = (p2q) objP;
            k(mm40Var, s0Var, p2qVar.f26263a, function0, u1c.M(2090726458, new rqc0(p2qVar, (byte) 21), fetVar), fetVar, (i3 & 14) | 24576 | (i3 & 112) | (i3 & 7168));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pr9(mm40Var, (Object) s0Var, ahl0Var, function0, i, (byte) 6);
        }
    }

    public static final void k(mm40 mm40Var, s0 s0Var, long j, Function0 function0, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-981552794);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(s0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = (i2 & 7168) == 2048;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new xhl0(function0, b);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(jm40.b, gy40Var, null, false, null, (Function0) objP2, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = i120.Q(o7k0.e(s5x0.L(mm40VarW, 0.0f, 6.0f, 1), 36.0f), j, s0Var).e(mm40Var);
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
            ua80.p(((i2 >> 9) & 112) | 6, ugdVar, jr8.f16991a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o040(mm40Var, s0Var, j, function0, ugdVar, i);
        }
    }

    public static final void l(mm40 mm40Var, dx40 dx40Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1941737935);
        int i2 = i | 6 | (fetVar2.g(dx40Var) ? 32 : 16);
        byte b = 14;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD, 8.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            x7z x7zVarI = ohs0.i(fetVar2, mm40VarC0, shdVar4, 1.0f, true);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4(b)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, x7zVarI);
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
            x(0, fetVar2, null, dx40Var.f6830a);
            x(0, fetVar2, null, dx40Var.b);
            fetVar2.r(true);
            v8q0.a(dx40Var.c, o7k0.u(jm40Var, 0.0f, 128.0f, 1), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar2), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ba30(mm40Var2, dx40Var, i, (byte) 14);
        }
    }

    public static final void m(mm40 mm40Var, bq90 bq90Var, fet fetVar, int i) {
        bq90Var.getClass();
        fetVar.g0(-350610062);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(bq90Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(mm40VarD, 16.0f, 8.0f);
            String str = bq90Var.f3017a;
            y9q0 y9q0Var = new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109);
            pz40 pz40Var = s6t0.f31722a;
            v8q0.a(str, mm40VarK, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0Var, fetVar, 0, 0, 131064);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(mm40Var, bq90Var, i, (byte) 14);
        }
    }

    public static final void n(mm40 mm40Var, a4x a4xVar, ucr0 ucr0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fet fetVar3 = fetVar;
        a4xVar.getClass();
        fetVar3.g0(1815014664);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar3.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar3.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar3.g(ucr0Var) ? 256 : 128;
        }
        boolean z = false;
        boolean z2 = true;
        if (fetVar3.U(i2 & 1, (i2 & 147) != 146)) {
            thg0 thg0VarA = shg0.a(ucr0Var.f, gqw0.k, fetVar3, 48);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40Var);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            Iterator itO = h97.o(fetVar3, mm40VarC0, gqw0.v, -748887910, a4xVar);
            while (itO.hasNext()) {
                ceo0 ceo0Var = (ceo0) itO.next();
                mm40 mm40VarL = s5x0.L(jm40.b, ucr0Var.c, 0.0f, i3);
                ycl yclVar = (ycl) ucr0Var.b.get(new kcm0(ceo0Var.f4222a));
                mm40 mm40VarS = o7k0.s(mm40VarL, yclVar != null ? yclVar.f42389a : ucr0Var.d);
                String str = ceo0Var.b;
                pz40 pz40Var = s6t0.f31722a;
                qrq qrqVar = j1t0.c;
                long j = qmk.r;
                fet fetVar4 = fetVar3;
                v8q0.a(str, mm40VarS, s6t0.b().f33626a.getSecondary(), new n05(qmk.p, j, qmk.n), 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, new y9q0(0L, j, null, qrqVar, 0L, null, 0, 0, qmk.F, 16646109), fetVar4, 0, 24960, 109552);
                z = z;
                fetVar3 = fetVar4;
                i3 = i3;
                z2 = true;
            }
            fetVar2 = fetVar3;
            fetVar2.r(z);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar3;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var, a4xVar, ucr0Var, i, (byte) 9);
        }
    }

    public static final void o(long j, y9q0 y9q0Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-684938728);
        if ((i & 6) == 0) {
            i2 = (fetVar.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(y9q0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = v8q0.f37000a;
            obc.e(new l5d0[]{yde.f42431a.a(new y3d(j)), zfnVar.a(((y9q0) fetVar.k(zfnVar)).d(y9q0Var))}, ugdVar, fetVar, ((i2 >> 3) & 112) | 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xhh(j, (Object) y9q0Var, (wdr) ugdVar, i, (byte) 9);
        }
    }

    public static final void p(mm40 mm40Var, String str, String str2, String str3, String str4, fet fetVar, int i) {
        fetVar.g0(-1978385511);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(str) ? 32 : 16) | (fetVar.g(str2) ? 256 : 128) | (fetVar.g(str3) ? 2048 : 1024) | (fetVar.g(str4) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
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
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            q(((i2 >> 6) & 112) | ((i2 << 3) & 896), fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), str3, str);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            q((i2 & 896) | ((i2 >> 9) & 112), fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), str4, str2);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ajw((Object) mm40Var, (Object) str, (Object) str2, (Object) str3, (Object) str4, i, (byte) 26);
        }
    }

    public static final void q(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(604606387);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(str2) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 18.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM126getWhite200d7_KjU = staticColors.m126getWhite200d7_KjU();
            zcl zclVar2 = qmk.c;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, jM126getWhite200d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar2, 54);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            k7x.a(str, null, jm40.b, gqw0.B, null, fetVar2, ((i2 >> 3) & 14) | 1573296, 1976);
            v8q0.a(str2, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, (i2 >> 6) & 14, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nd8(mm40Var, str, str2, i, (byte) 10);
        }
    }

    public static final void r(Function1 function1, mv00 mv00Var, mm40 mm40Var, fet fetVar, int i) {
        function1.getClass();
        mv00Var.getClass();
        fetVar.g0(640995102);
        int i2 = i | (fetVar.i(function1) ? 4 : 2) | (fetVar.g(mv00Var) ? 32 : 16) | (fetVar.g(mm40Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = x1j0.f40124a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new wvi0((byte) 15);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP3 = fetVar.P();
            byte b = 3;
            if (z || objP3 == cl5Var) {
                objP3 = new lb(mv00Var, function1, b);
                fetVar.o0(objP3);
            }
            y860.g(xdrVar, mm40Var, function2, null, (Function1) objP3, fetVar, ((i2 >> 3) & 112) | 390, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0(function1, (hej0) mv00Var, mm40Var, i, (byte) 4);
        }
    }

    public static final void s(zvj0 zvj0Var, Function1 function1, fet fetVar, int i) {
        ixo0 ixo0Var;
        boolean z;
        boolean z2;
        fet fetVar2 = fetVar;
        zvj0Var.getClass();
        yv6 yv6Var = zvj0Var.f45061a;
        function1.getClass();
        fetVar2.g0(-494870114);
        int i2 = i | (fetVar2.g(zvj0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 145) != 144)) {
            ixo0 ixo0Var2 = zvj0Var.b;
            boolean z3 = ixo0Var2.f15552a;
            if (yv6Var.g) {
                fetVar2.e0(1947376973);
                mx6 mx6Var = yv6Var.f43305a;
                oln0 oln0Var = yv6Var.b;
                xnb0 xnb0Var = yv6Var.c;
                jke jkeVar = yv6Var.d;
                fx6 fx6Var = yv6Var.e;
                String str = yv6Var.f;
                int i3 = i2 & 896;
                boolean z4 = i3 == 256;
                Object objP = fetVar2.P();
                cl5 cl5Var = ukd.f35823a;
                if (z4 || objP == cl5Var) {
                    objP = new nrj0(function1, (byte) 2);
                    fetVar2.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                boolean z5 = i3 == 256;
                Object objP2 = fetVar2.P();
                if (z5 || objP2 == cl5Var) {
                    objP2 = new nrj0(function1, (byte) 4);
                    fetVar2.o0(objP2);
                }
                Function0 function2 = (Function0) objP2;
                boolean z6 = i3 == 256;
                Object objP3 = fetVar2.P();
                if (z6 || objP3 == cl5Var) {
                    objP3 = new nrj0(function1, (byte) 6);
                    fetVar2.o0(objP3);
                }
                Function0 function3 = (Function0) objP3;
                boolean z7 = i3 == 256;
                Object objP4 = fetVar2.P();
                if (z7 || objP4 == cl5Var) {
                    objP4 = new abh0(function1, (byte) 15);
                    fetVar2.o0(objP4);
                }
                z = z3;
                ixo0Var = ixo0Var2;
                z2 = false;
                rsr0.f(null, mx6Var, oln0Var, xnb0Var, jkeVar, fx6Var, str, null, function0, function2, function3, (Function1) objP4, null, fetVar2, 0, 4225);
                fetVar2 = fetVar2;
                if (z) {
                    fetVar2.e0(1948377188);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(1948307035);
                    zcl zclVar = qmk.f28987a;
                    wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
                    fetVar2.r(false);
                }
                fetVar2.r(false);
            } else {
                ixo0Var = ixo0Var2;
                z = z3;
                z2 = false;
                fetVar2.e0(1948383140);
                fetVar2.r(false);
            }
            if (z) {
                fetVar2.e0(1948449666);
                zcl zclVar2 = qmk.f28987a;
                wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
                etm0.b(null, ixo0Var.b, ixo0Var.d, ixo0Var.e, ixo0Var.c, null, fetVar, 0);
                fetVar2 = fetVar;
                wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
                fetVar2.r(z2);
            } else {
                fetVar2.e0(1948882116);
                fetVar2.r(z2);
            }
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kqh0((Object) zvj0Var, function1, i, (byte) 27);
        }
    }

    public static final void t(mm40 mm40Var, ker0 ker0Var, d9z d9zVar, Function1 function1, fet fetVar, int i) {
        ker0Var.getClass();
        d9zVar.getClass();
        function1.getClass();
        fetVar.g0(-1749713811);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(ker0Var) ? 32 : 16) | (fetVar.g(d9zVar) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            byte b = 14;
            if (ker0Var instanceof jer0) {
                fetVar.e0(-2142752072);
                r8x.z(i2 & 14, fetVar, mm40Var);
                fetVar.r(false);
            } else {
                if (!(ker0Var instanceof ier0)) {
                    throw b1j.f(-2142753540, fetVar, false);
                }
                fetVar.e0(-2000702490);
                zcl zclVar = qmk.f28987a;
                m8x.F(mm40Var, (ier0) ker0Var, s5x0.t(qmk.a(fetVar).c, 0.0f, 2), d9zVar, new qw3(8.0f, true, new jf4(b)), new qw3(4.0f, true, new jf4(b)), function1, fetVar, ((i2 << 9) & 3670016) | (i2 & 126) | ((i2 << 3) & 7168));
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0(mm40Var, (Object) ker0Var, (Object) d9zVar, function1, i, (byte) 25);
        }
    }

    public static final void u(mm40 mm40Var, n4m0 n4m0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        n4m0Var.getClass();
        function1.getClass();
        fetVar.g0(1769773302);
        int i2 = i | 6 | (fetVar.g(n4m0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            float f = qmk.a(fetVar).c;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, f, 0.0f, 2), 1.0f);
            int iOrdinal = n4m0Var.b.ordinal();
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, (iOrdinal == 0 || iOrdinal == 3) ? 8.0f : 0.0f, 0.0f, 8.0f, 5);
            rqm rqmVar = n4m0Var.f22905a;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new yhl0(function1, (byte) 19);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new yhl0(function1, (byte) 20);
                fetVar.o0(objP2);
            }
            obc.q(mm40VarN, rqmVar, false, null, function0, null, (Function0) objP2, null, fetVar, 384, 168);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var2, n4m0Var, function1, i, (byte) 26);
        }
    }

    public static final void v(mm40 mm40Var, String str, String str2, long j, long j2, fet fetVar, int i) {
        int i2;
        String str3;
        fet fetVar2;
        fetVar.g0(-165853417);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= fetVar.g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.f(j2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            x7z x7zVar = new x7z(1.0f, true);
            zcl zclVar = qmk.f28987a;
            v8q0.a(str3, s5x0.N(x7zVar, 0.0f, 0.0f, 12.0f, 0.0f, 11), j, null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, (i2 >> 3) & 910, 24960, 109560);
            int i3 = i2 >> 6;
            v8q0.a(str2, o7k0.A(jm40.b, null, 3), j2, null, 0L, null, null, null, 0L, new f2q0(6), 0L, 0, false, 1, 0, null, g1t0.d(), fetVar, (i3 & 14) | 48 | (i3 & 896), 24576, 113656);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e15(mm40Var, str, str2, j, j2, i, (byte) 2);
        }
    }

    public static final void w(mm40 mm40Var, final apq0 apq0Var, final long j, final long j2, fet fetVar, final int i, final int i2) {
        mm40 mm40Var2;
        int i3;
        final mm40 mm40Var3;
        fetVar.g0(-898847746);
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
            i3 |= fetVar.g(apq0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.f(j2) ? 2048 : 1024;
        }
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40Var3 = i4 != 0 ? jm40Var : mm40Var2;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var3);
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
            int i5 = i3 << 3;
            v(o7k0.d(jm40Var, 1.0f), xsm0.s(R.string.cards_, fetVar), apq0Var.b, j, j2, fetVar, (i5 & 7168) | 6 | (i5 & 57344));
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            int i6 = i5 & 64512;
            v(s5x0.N(mm40VarD, 0.0f, 4.0f, 0.0f, 0.0f, 13), xsm0.s(R.string.variants_, fetVar), apq0Var.c, j, j2, fetVar, i6);
            v(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13), xsm0.s(R.string.unique_, fetVar), apq0Var.d, j, j2, fetVar, i6);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.d0y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q8x.w(mm40Var3, apq0Var, j, j2, (fet) obj, x8x.L(i | 1), i2 ? 1 : 0);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void x(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        String str2 = str;
        fetVar2.g0(-668586467);
        int i2 = i | 6 | (fetVar2.g(str2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 16.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
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
            v8q0.a(str, new x7z(1.0f, true), ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2, (i2 >> 3) & 14, 24960, 110584);
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
            yfe0VarU.d = new n040(mm40Var2, str2, i, (byte) 4);
        }
    }

    public static final lq0 z(float f, String str) {
        ijm ijmVar = new ijm(new qjm());
        kjm kjmVar = kjm.b;
        yo0 yo0Var = yo0.e;
        zcl zclVar = qmk.f28987a;
        return new lq0(str, new zo0(s5x0.u(16.0f, f, 16.0f, 0.0f, 8), s5x0.t(0.0f, 0.0f, 3), yo0Var), ijmVar, kjmVar);
    }

    public void y(emf0 emf0Var, Object obj) {
        MultipartBody.Part part = (MultipartBody.Part) obj;
        if (part != null) {
            emf0Var.i.c.add(part);
        }
    }
}
