package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.statistic.champ_statistic.presentation.models.ChampMenuType;
import org.xplatform.statistic.champ_statistic.presentation.models.ChampSubMenuItem;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xuh implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41511a;
    public final /* synthetic */ ocl b;
    public final /* synthetic */ r9u c;

    public /* synthetic */ xuh(ocl oclVar, r9u r9uVar, byte b) {
        this.f41511a = b;
        this.b = oclVar;
        this.c = r9uVar;
    }

    private final Object a(Object obj) throws Throwable {
        Throwable th;
        int i;
        ArrayList arrayList;
        hd30 hd30Var;
        List list;
        Iterator it;
        bd30 bd30Var;
        boolean z;
        a4x a4xVar;
        ArrayList arrayListQ0;
        int i2;
        int i3;
        ArrayList arrayList2;
        hd30 hd30Var2;
        ArrayList arrayList3;
        String string;
        long secondary;
        int i4;
        int i5;
        Collection collectionC;
        Iterable iterableC;
        String string2;
        long secondary2;
        int i6;
        int i7;
        StaticColors staticColors;
        long jM113getRed0d7_KjU;
        hd30 hd30Var3 = (hd30) obj;
        hd30Var3.getClass();
        ygp ygpVar = ygp.t;
        r9u r9uVar = this.c;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        nc5 nc5Var = hd30Var3.c;
        List list2 = hd30Var3.i;
        bd30 bd30Var2 = new bd30(ydx.c0(nc5Var), hd30Var3.b);
        boolean z2 = hd30Var3.f;
        ocl oclVar = this.b;
        if (z2) {
            return new od30(bd30Var2, zD, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        }
        if (hd30Var3.g) {
            return new od30(bd30Var2, zD, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
        }
        if (hd30Var3.d) {
            return new pd30(bd30Var2, zD, hd30Var3.h);
        }
        long j = hd30Var3.j;
        list2.getClass();
        int i8 = 10;
        ArrayList arrayList4 = new ArrayList(r3d.q(list2, 10));
        Iterator it2 = list2.iterator();
        int i9 = 0;
        while (true) {
            Throwable th2 = null;
            if (!it2.hasNext()) {
                int i10 = 1;
                a4x a4xVarO0 = dyb.o0(arrayList4);
                ArrayList arrayList5 = new ArrayList(r3d.q(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    List list3 = ((cd30) it3.next()).b;
                    long j2 = hd30Var3.f12851a;
                    pz40 pz40Var = s6t0.f31722a;
                    list3.getClass();
                    long j3 = 21;
                    if (q3d.j(4L, 21L).contains(Long.valueOf(j2))) {
                        th = th2;
                        Iterable iterableQ0 = iun.f15405a;
                        ArrayList arrayList6 = new ArrayList(r3d.q(list3, 10));
                        Iterator it4 = list3.iterator();
                        int i11 = 0;
                        while (it4.hasNext()) {
                            Object next = it4.next();
                            int i12 = i11 + 1;
                            if (i11 < 0) {
                                q3d.p();
                                throw th;
                            }
                            long j4 = j3;
                            aoa0 aoa0Var = (aoa0) next;
                            int i13 = aoa0Var.g;
                            List list4 = list2;
                            List list5 = aoa0Var.l;
                            Iterator it5 = it3;
                            int i14 = aoa0Var.d;
                            bd30 bd30Var3 = bd30Var2;
                            int i15 = aoa0Var.c;
                            boolean z3 = zD;
                            List list6 = aoa0Var.k;
                            a4x a4xVar2 = a4xVarO0;
                            boolean z4 = aoa0Var.h;
                            boolean z5 = i13 == i10;
                            boolean z6 = i13 == 2;
                            int size = list6.size();
                            if (i11 > 0) {
                                aoa0 aoa0Var2 = (aoa0) list3.get(i11 - 1);
                                i2 = aoa0Var2.c;
                                i3 = aoa0Var2.d;
                            } else {
                                i2 = 0;
                                i3 = 0;
                            }
                            boolean z7 = i15 != i2;
                            boolean z8 = i14 != i3;
                            List list7 = list3;
                            boolean z9 = z7;
                            if (list5.isEmpty()) {
                                arrayList2 = arrayList5;
                                hd30Var2 = hd30Var3;
                                arrayList3 = arrayList6;
                            } else {
                                List listC = kotlin.collections.a.c(goa0.f11622a);
                                ArrayList arrayList7 = new ArrayList(r3d.q(list5, 10));
                                Iterator it6 = list5.iterator();
                                int i16 = 0;
                                while (it6.hasNext()) {
                                    Object next2 = it6.next();
                                    int i17 = i16 + 1;
                                    if (i16 < 0) {
                                        q3d.p();
                                        throw th;
                                    }
                                    Iterator it7 = it6;
                                    tdq0 tdq0Var = (tdq0) next2;
                                    int i18 = i16;
                                    int i19 = tdq0Var.c;
                                    hd30 hd30Var4 = hd30Var3;
                                    int i20 = tdq0Var.b;
                                    ArrayList arrayList8 = arrayList5;
                                    int i21 = tdq0Var.f33782a;
                                    ArrayList arrayList9 = arrayList6;
                                    boolean z10 = tdq0Var.d;
                                    boolean z11 = i19 == 1;
                                    boolean z12 = i19 == 2;
                                    if (i18 > 0) {
                                        tdq0 tdq0Var2 = (tdq0) list5.get(i18 - 1);
                                        i4 = tdq0Var2.f33782a;
                                        i5 = tdq0Var2.b;
                                    } else {
                                        i4 = 0;
                                        i5 = 0;
                                    }
                                    boolean z13 = i21 != i4;
                                    boolean z14 = i20 != i5;
                                    boolean z15 = tdq0Var.e;
                                    Object objValueOf = Boolean.valueOf(z15);
                                    if (!z15) {
                                        objValueOf = th;
                                    }
                                    if (objValueOf == null || (collectionC = kotlin.collections.a.c(new voa0("", false, true, false, false, false))) == null) {
                                        collectionC = iun.f15405a;
                                    }
                                    boolean z16 = tdq0Var.f;
                                    Object objValueOf2 = Boolean.valueOf(z16);
                                    if (!z16) {
                                        objValueOf2 = th;
                                    }
                                    if (objValueOf2 == null || (iterableC = kotlin.collections.a.c(new voa0("", false, false, true, false, false))) == null) {
                                        iterableC = iun.f15405a;
                                    }
                                    ArrayList arrayListQ1 = CollectionsKt.q0(collectionC, iterableC);
                                    String strValueOf = String.valueOf(i21);
                                    String strValueOf2 = String.valueOf(i20);
                                    boolean z17 = z11 && z10;
                                    boolean z18 = z12 && z10;
                                    int i22 = j2 == j4 ? R.string.lose_throw : R.string.lose_serving;
                                    a4x a4xVarO1 = dyb.o0(arrayListQ1);
                                    if (j2 != 0) {
                                        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                                        rz4.s(j2, ".svg", bzuVarD);
                                        string2 = ((StringBuilder) bzuVarD.b).toString();
                                    } else {
                                        string2 = "";
                                    }
                                    if (z10) {
                                        pz40 pz40Var2 = s6t0.f31722a;
                                        secondary2 = StaticColors.INSTANCE.m113getRed0d7_KjU();
                                    } else {
                                        pz40 pz40Var3 = s6t0.f31722a;
                                        secondary2 = s6t0.b().f33626a.getSecondary();
                                    }
                                    arrayList7.add(new eoa0(strValueOf, strValueOf2, z13 ? StaticColors.INSTANCE.m87getDarkOrange0d7_KjU() : s6t0.b().f33626a.getSecondary(), z14 ? StaticColors.INSTANCE.m87getDarkOrange0d7_KjU() : s6t0.b().f33626a.getSecondary(), "", "", z11, z12, z17, z18, i22, a4xVarO1, string2, secondary2));
                                    i16 = i17;
                                    it6 = it7;
                                    hd30Var3 = hd30Var4;
                                    arrayList5 = arrayList8;
                                    arrayList6 = arrayList9;
                                }
                                arrayList2 = arrayList5;
                                hd30Var2 = hd30Var3;
                                arrayList3 = arrayList6;
                                iterableQ0 = CollectionsKt.q0(listC, arrayList7);
                            }
                            String strValueOf3 = String.valueOf(i15);
                            String strValueOf4 = String.valueOf(i14);
                            String str = aoa0Var.e;
                            String str2 = aoa0Var.f;
                            boolean z19 = z5 && z4;
                            boolean z20 = z6 && z4;
                            int i23 = j2 == j4 ? R.string.lose_throw : R.string.lose_serving;
                            ArrayList arrayList10 = new ArrayList(r3d.q(list6, 10));
                            int i24 = 0;
                            for (Object obj2 : list6) {
                                int i25 = i24 + 1;
                                if (i24 < 0) {
                                    q3d.p();
                                    throw th;
                                }
                                moa0 moa0Var = (moa0) obj2;
                                String str3 = strValueOf3;
                                String str4 = strValueOf4;
                                Iterable iterable = iterableQ0;
                                arrayList10.add(new voa0(ua80.i(moa0Var.f22126a, " : ", moa0Var.b, ((moa0Var.c || moa0Var.d || moa0Var.e || moa0Var.f || moa0Var.g) || i24 == size + (-1)) ? "" : Separators.COMMA), moa0Var.c, moa0Var.d, moa0Var.e, moa0Var.f, moa0Var.g));
                                iterableQ0 = iterable;
                                strValueOf3 = str3;
                                i24 = i25;
                                strValueOf4 = str4;
                            }
                            String str5 = strValueOf3;
                            String str6 = strValueOf4;
                            Iterable iterable2 = iterableQ0;
                            a4x a4xVarO2 = dyb.o0(arrayList10);
                            if (j2 != 0) {
                                bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                                rz4.s(j2, ".svg", bzuVarD2);
                                string = ((StringBuilder) bzuVarD2.b).toString();
                            } else {
                                string = r39;
                            }
                            if (z4) {
                                pz40 pz40Var4 = s6t0.f31722a;
                                secondary = StaticColors.INSTANCE.m113getRed0d7_KjU();
                            } else {
                                pz40 pz40Var5 = s6t0.f31722a;
                                secondary = s6t0.b().f33626a.getSecondary();
                            }
                            ArrayList arrayList11 = arrayList3;
                            arrayList11.add(new eoa0(str5, str6, z9 ? StaticColors.INSTANCE.m87getDarkOrange0d7_KjU() : s6t0.b().f33626a.getTextPrimary(), z8 ? StaticColors.INSTANCE.m87getDarkOrange0d7_KjU() : s6t0.b().f33626a.getTextPrimary(), str, str2, z5, z6, z19, z20, i23, a4xVarO2, string, secondary));
                            iterableQ0 = iterable2;
                            arrayList6 = arrayList11;
                            list2 = list4;
                            i11 = i12;
                            j3 = j4;
                            it3 = it5;
                            bd30Var2 = bd30Var3;
                            zD = z3;
                            a4xVarO0 = a4xVar2;
                            list3 = list7;
                            it4 = it4;
                            i10 = 1;
                            hd30Var3 = hd30Var2;
                            arrayList5 = arrayList2;
                        }
                        i = i10;
                        arrayList = arrayList5;
                        hd30Var = hd30Var3;
                        list = list2;
                        it = it3;
                        bd30Var = bd30Var2;
                        z = zD;
                        a4xVar = a4xVarO0;
                        arrayListQ0 = CollectionsKt.q0(arrayList6, iterableQ0);
                    } else {
                        arrayListQ0 = new ArrayList(r3d.q(list3, i8));
                        int i26 = 0;
                        for (Object obj3 : list3) {
                            int i27 = i26 + 1;
                            if (i26 < 0) {
                                Throwable th3 = th2;
                                q3d.p();
                                throw th3;
                            }
                            aoa0 aoa0Var3 = (aoa0) obj3;
                            if (i26 > 0) {
                                aoa0 aoa0Var4 = (aoa0) list3.get(i26 - 1);
                                i7 = aoa0Var4.c;
                                i6 = aoa0Var4.d;
                            } else {
                                i6 = 0;
                                i7 = 0;
                            }
                            Throwable th4 = th2;
                            int i28 = aoa0Var3.c;
                            int i29 = aoa0Var3.d;
                            int i30 = i28 != i7 ? i10 : 0;
                            int i31 = i29 != i6 ? i10 : 0;
                            String strValueOf5 = String.valueOf(i28);
                            String strValueOf6 = String.valueOf(i29);
                            pz40 pz40Var6 = s6t0.f31722a;
                            long jM87getDarkOrange0d7_KjU = i30 != 0 ? StaticColors.INSTANCE.m87getDarkOrange0d7_KjU() : s6t0.b().f33626a.getSecondary();
                            long jM87getDarkOrange0d7_KjU2 = i31 != 0 ? StaticColors.INSTANCE.m87getDarkOrange0d7_KjU() : s6t0.b().f33626a.getSecondary();
                            String str7 = aoa0Var3.i;
                            String str8 = aoa0Var3.j;
                            if (i30 != 0) {
                                staticColors = StaticColors.INSTANCE;
                                jM113getRed0d7_KjU = staticColors.m98getGreen0d7_KjU();
                            } else {
                                staticColors = StaticColors.INSTANCE;
                                jM113getRed0d7_KjU = staticColors.m113getRed0d7_KjU();
                            }
                            arrayListQ0.add(new foa0(strValueOf5, strValueOf6, jM87getDarkOrange0d7_KjU, jM87getDarkOrange0d7_KjU2, str7, str8, jM113getRed0d7_KjU, i31 != 0 ? staticColors.m98getGreen0d7_KjU() : staticColors.m113getRed0d7_KjU()));
                            i26 = i27;
                            th2 = th4;
                        }
                        th = th2;
                        i = i10;
                        arrayList = arrayList5;
                        hd30Var = hd30Var3;
                        list = list2;
                        it = it3;
                        bd30Var = bd30Var2;
                        z = zD;
                        a4xVar = a4xVarO0;
                    }
                    ArrayList arrayList12 = arrayList;
                    arrayList12.add(dyb.o0(arrayListQ0));
                    arrayList5 = arrayList12;
                    th2 = th;
                    list2 = list;
                    it3 = it;
                    bd30Var2 = bd30Var;
                    zD = z;
                    a4xVarO0 = a4xVar;
                    i10 = i;
                    hd30Var3 = hd30Var;
                    i8 = 10;
                }
                return new qd30(bd30Var2, zD, list2.size(), a4xVarO0, dyb.o0(arrayList5), hd30Var3.j);
            }
            Object next3 = it2.next();
            int i32 = i9 + 1;
            if (i9 < 0) {
                q3d.p();
                throw null;
            }
            long j5 = i9;
            arrayList4.add(new lxl(j5, (dyl) new xxl(((cd30) next3).f4143a), (Integer) 1, false, (j5 > j ? 1 : (j5 == j ? 0 : -1)) == 0 ? uxl.b : uxl.f36445a, (cwl) null));
            i9 = i32;
        }
    }

    private final Object b(Object obj) {
        zdm0 ydm0Var;
        ChampMenuType champMenuType;
        tdb tdbVar;
        dcm0 dcm0Var = (dcm0) obj;
        dcm0Var.getClass();
        ygp ygpVar = ygp.t;
        r9u r9uVar = this.c;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        boolean zD = j1q0Var.f15748a.d(ygpVar);
        j9m0 j9m0VarC0 = ydx.c0(dcm0Var.f);
        sfb sfbVar = dcm0Var.d;
        eme emeVar = dcm0Var.e;
        String str = dcm0Var.g;
        ofb ofbVar = sfbVar.b;
        String str2 = ofbVar.b;
        List<udb> list = ofbVar.d;
        if (str2.length() == 0) {
            ydm0Var = new wdm0(emeVar);
        } else {
            StringBuilder sb = new StringBuilder(ujn.h);
            String str3 = ofbVar.c;
            if (str3.length() == 0) {
                sb.setLength(0);
            } else if (StringsKt.O(str3, ujn.h, false) || kotlin.text.c.x(str3, "https://", false)) {
                sb.setLength(0);
                sb.append(str3);
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(str3, '/'));
            }
            ydm0Var = new ydm0(emeVar, new udm0(str, sb.toString(), str2, new jom0("")));
        }
        if (dcm0Var.b) {
            return new hcm0(j9m0VarC0, ydm0Var, zD);
        }
        boolean z = dcm0Var.c;
        ocl oclVar = this.b;
        if (z) {
            return new gcm0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), j9m0VarC0, ydm0Var, zD);
        }
        if (list.isEmpty()) {
            return new gcm0(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990), j9m0VarC0, ydm0Var, zD);
        }
        ArrayList arrayList = new ArrayList();
        for (udb udbVar : list) {
            switch (udbVar.f35469a) {
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    champMenuType = ChampMenuType.ChampTourNet.c;
                    break;
                case 32:
                    champMenuType = ChampMenuType.ChampTourTable.c;
                    break;
                case 33:
                    champMenuType = ChampMenuType.ChampCompletedGames.c;
                    break;
                case 34:
                    champMenuType = ChampMenuType.ChampUpcomingGames.c;
                    break;
                default:
                    champMenuType = ChampMenuType.Undefined.c;
                    break;
            }
            if (champMenuType instanceof ChampMenuType.Undefined) {
                tdbVar = null;
            } else {
                List<zdb> list2 = udbVar.c;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                for (zdb zdbVar : list2) {
                    arrayList2.add(new ChampSubMenuItem(champMenuType, zdbVar.f44204a, zdbVar.b));
                }
                tdbVar = new tdb(champMenuType, udbVar.b, arrayList2);
            }
            if (tdbVar != null) {
                arrayList.add(tdbVar);
            }
        }
        return new icm0(j9m0VarC0, ydm0Var, zD, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:204:0x0675  */
    /* JADX WARN: Code duplicated, block: B:247:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:248:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:250:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:252:0x0809  */
    /* JADX WARN: Code duplicated, block: B:254:0x080f  */
    /* JADX WARN: Code duplicated, block: B:255:0x0831  */
    /* JADX WARN: Code duplicated, block: B:299:0x0957  */
    /* JADX WARN: Code duplicated, block: B:302:0x098b A[LOOP:12: B:300:0x0985->B:302:0x098b, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v136 */
    /* JADX WARN: Type inference failed for: r0v137 */
    /* JADX WARN: Type inference failed for: r0v138 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r27v6, types: [java.lang.Throwable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ouq ouqVar;
        tbs tbsVar;
        na00 na00Var;
        boolean z;
        boolean z2;
        boolean z3;
        l800 l800Var;
        ehm0 ehm0Var;
        List list;
        boolean zIsEmpty;
        bwh0 bwh0Var;
        boolean z4;
        boolean z5;
        ArrayList arrayList;
        Iterator it;
        db00 wa00Var;
        i4 i4Var;
        boolean z6;
        Object next;
        Object objK;
        r020 n020Var;
        ?? ValueOf;
        vw50 vw50Var;
        ctp0 ctp0Var;
        byte b = this.f41511a;
        int i = 1;
        String str = null;
        int i2 = 10;
        r9u r9uVar = this.c;
        switch (b) {
            case 0:
                ruh ruhVar = (ruh) obj;
                ruhVar.getClass();
                llm0 llm0Var = ruhVar.g;
                ygp ygpVar = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                boolean zD = j1q0Var.f15748a.d(ygpVar);
                zdm0 zdm0Var = ruhVar.b;
                nc5 nc5Var = ruhVar.c;
                ydm0 ydm0Var = new ydm0(zdm0Var.a(), new qdm0(ruhVar.j, ruhVar.k, new jom0(ruhVar.l)));
                boolean z7 = ruhVar.e;
                ocl oclVar = this.b;
                if (z7) {
                    return new tuh(ydm0Var, ydx.c0(nc5Var), llm0Var, zD, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                if (ruhVar.f) {
                    return new tuh(ydm0Var, ydx.c0(nc5Var), llm0Var, zD, ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
                }
                if (ruhVar.d) {
                    return new uuh(ydm0Var, ydx.c0(nc5Var), llm0Var, zD);
                }
                j9m0 j9m0VarC0 = ydx.c0(nc5Var);
                List<vz30> list2 = ruhVar.m;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                for (vz30 vz30Var : list2) {
                    vz30Var.getClass();
                    String str2 = vz30Var.b;
                    int i3 = vz30Var.f38281a;
                    arrayList2.add(new j240(i3 != 18 ? i3 != 52 ? kvh.b : ivh.b : jvh.b, str2));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (!(((j240) obj2).f15765a instanceof kvh)) {
                        arrayList3.add(obj2);
                    }
                }
                return new suh(ydm0Var, j9m0VarC0, llm0Var, zD, dyb.o0(arrayList3));
            case 1:
                mvo mvoVar = (mvo) obj;
                mvoVar.getClass();
                ygp ygpVar2 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var2 = r9uVar.f30104a;
                j1q0Var2.getClass();
                boolean zD2 = j1q0Var2.f15748a.d(ygpVar2);
                nc5 nc5Var2 = mvoVar.f;
                kvo kvoVar = mvoVar.d;
                jvo jvoVar = new jvo(ydx.c0(nc5Var2), mvoVar.e);
                if (mvoVar.b) {
                    return new uvo(jvoVar, zD2);
                }
                boolean z8 = mvoVar.c;
                ocl oclVar2 = this.b;
                if (z8) {
                    return new tvo(jvoVar, ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), zD2);
                }
                if (kvoVar != null) {
                    List list3 = kvoVar.b;
                    if (!list3.isEmpty()) {
                        return new vvo(list3, jvoVar, zD2);
                    }
                }
                return new tvo(jvoVar, ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.currently_no_events, 0, 0L, 0L, 990), zD2);
            case 2:
                suq suqVar = (suq) obj;
                suqVar.getClass();
                ygp ygpVar3 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var3 = r9uVar.f30104a;
                j1q0Var3.getClass();
                boolean zD3 = j1q0Var3.f15748a.d(ygpVar3);
                boolean z9 = suqVar.c;
                zdm0 zdm0Var2 = suqVar.g;
                nc5 nc5Var3 = suqVar.h;
                if (z9) {
                    return new puq(ydx.c0(nc5Var3), zdm0Var2, zD3);
                }
                boolean z10 = suqVar.f32833a;
                ocl oclVar3 = this.b;
                if (z10) {
                    ouqVar = new ouq(ocl.b(oclVar3, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), ydx.c0(nc5Var3), zdm0Var2, zD3);
                } else {
                    if (!suqVar.b) {
                        return new quq(zdm0Var2, ydx.c0(nc5Var3), zD3, suqVar.e, suqVar.f);
                    }
                    ouqVar = new ouq(ocl.b(oclVar3, pb10.g, null, 0, 0, R.string.currently_no_events, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), ydx.c0(nc5Var3), zdm0Var2, zD3);
                }
                return ouqVar;
            case 3:
                uas uasVar = (uas) obj;
                uasVar.getClass();
                ygp ygpVar4 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var4 = r9uVar.f30104a;
                j1q0Var4.getClass();
                boolean zD4 = j1q0Var4.f15748a.d(ygpVar4);
                boolean z11 = uasVar.c;
                List list4 = uasVar.f;
                zdm0 zdm0Var3 = uasVar.j;
                nc5 nc5Var4 = uasVar.k;
                if (z11) {
                    return new ubs(ydx.c0(nc5Var4), zdm0Var3, zD4);
                }
                boolean z12 = uasVar.d;
                ocl oclVar4 = this.b;
                if (z12) {
                    tbsVar = new tbs(ocl.b(oclVar4, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), ydx.c0(nc5Var4), zdm0Var3, zD4);
                } else {
                    if (!list4.isEmpty()) {
                        j9m0 j9m0VarC1 = ydx.c0(nc5Var4);
                        List<sbc> list5 = uasVar.e;
                        ArrayList arrayList4 = new ArrayList(r3d.q(list5, 10));
                        for (sbc sbcVar : list5) {
                            arrayList4.add(new lxl(sbcVar.f31925a ? 1L : 0L, (dyl) new xxl(sbcVar.b), (Integer) 1, false, sbcVar.c ? uxl.b : uxl.f36445a, (cwl) null));
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList4);
                        zcl zclVar = qmk.f28987a;
                        return new vbs(zdm0Var3, j9m0VarC1, zD4, new fyl(a4xVarO0, null, null, s5x0.u(8.0f, 0.0f, 8.0f, 0.0f, 10), null, 22), dyb.o0(list4));
                    }
                    tbsVar = new tbs(ocl.b(oclVar4, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990), ydx.c0(nc5Var4), zdm0Var3, zD4);
                }
                return tbsVar;
            case 4:
                guv guvVar = (guv) obj;
                guvVar.getClass();
                ygp ygpVar5 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var5 = r9uVar.f30104a;
                j1q0Var5.getClass();
                boolean zD5 = j1q0Var5.f15748a.d(ygpVar5);
                nc5 nc5Var5 = guvVar.f;
                List list6 = guvVar.d;
                ytv ytvVar = new ytv(ydx.c0(nc5Var5), guvVar.e);
                if (guvVar.b) {
                    return new muv(ytvVar, zD5);
                }
                boolean z13 = guvVar.c;
                ocl oclVar5 = this.b;
                if (z13) {
                    return new luv(ytvVar, ocl.b(oclVar5, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), zD5);
                }
                if (list6 == null || !list6.isEmpty()) {
                    Iterator it2 = list6.iterator();
                    while (it2.hasNext()) {
                        if (!((ztv) it2.next()).f44982a.b.isEmpty()) {
                            return new nuv(ytvVar, dyb.o0(list6), ocl.b(oclVar5, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990), zD5);
                        }
                    }
                }
                return new luv(ytvVar, ocl.b(oclVar5, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990), zD5);
            case 5:
                dqw dqwVar = (dqw) obj;
                dqwVar.getClass();
                ygp ygpVar6 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var6 = r9uVar.f30104a;
                j1q0Var6.getClass();
                boolean zD6 = j1q0Var6.f15748a.d(ygpVar6);
                j9m0 j9m0VarC2 = ydx.c0(dqwVar.j);
                String str3 = dqwVar.f;
                zdm0 zdm0Var4 = dqwVar.i;
                String str4 = dqwVar.g;
                String str5 = dqwVar.e;
                zdm0 wdm0Var = (str3.length() == 0 && str5.length() == 0 && str4.length() == 0) ? new wdm0(zdm0Var4.a()) : new ydm0(zdm0Var4.a(), new qdm0(str3, str5, new lom0(str4, "")));
                if (dqwVar.f6533a) {
                    return new kqw(j9m0VarC2, wdm0Var, zD6);
                }
                boolean z14 = dqwVar.c;
                ocl oclVar6 = this.b;
                if (z14) {
                    return new iqw(ocl.b(oclVar6, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990), j9m0VarC2, wdm0Var, zD6);
                }
                return dqwVar.b ? new jqw(ocl.b(oclVar6, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), j9m0VarC2, wdm0Var, zD6) : new hqw(dyb.o0(dqwVar.h), j9m0VarC2, wdm0Var, zD6);
            case 6:
                v020 v020Var = (v020) obj;
                v020Var.getClass();
                ehm0 ehm0Var2 = v020Var.t;
                ehm0 ehm0Var3 = v020Var.s;
                ehm0 ehm0Var4 = v020Var.r;
                ehm0 ehm0Var5 = v020Var.n;
                ehm0 ehm0Var6 = v020Var.m;
                ehm0 ehm0Var7 = v020Var.p;
                ehm0 ehm0Var8 = v020Var.u;
                ygp ygpVar7 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var7 = r9uVar.f30104a;
                j1q0Var7.getClass();
                boolean zD7 = j1q0Var7.f15748a.d(ygpVar7);
                zdm0 zdm0Var5 = v020Var.j;
                List list7 = v020Var.q;
                j9m0 j9m0VarC3 = ydx.c0(v020Var.k);
                boolean z15 = v020Var.b;
                ocl oclVar7 = this.b;
                if (z15) {
                    n020Var = new p020(new eb10(ocl.b(oclVar7, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE)));
                } else if (v020Var.f36563a) {
                    n020Var = q020.f27874a;
                } else {
                    llm0 llm0Var2 = v020Var.w;
                    boolean z16 = ehm0Var8.b;
                    boolean z17 = ehm0Var7.b;
                    int iOrdinal = llm0Var2.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1 && iOrdinal != 2) {
                            t9f.b();
                            return null;
                        }
                        if (!list7.isEmpty() || ehm0Var6.b || ehm0Var5.b || z17 || ehm0Var4.b || ehm0Var3.b || ehm0Var2.b || z16) {
                            a4x a4xVarO1 = dyb.o0(list7);
                            cgk0 cgk0VarB = androidx.compose.runtime.e.b(v020Var.g);
                            long j = v020Var.c;
                            a4x a4xVarO2 = dyb.o0(v020Var.l);
                            na00Var = v020Var.o;
                            long j2 = v020Var.c;
                            uaq0 uaq0Var = v020Var.v;
                            z = na00Var.f;
                            z2 = na00Var.h;
                            z3 = na00Var.g;
                            l800Var = na00Var.f23166a;
                            if (z) {
                                wa00Var = new ab00(z3, z2);
                                ehm0Var = ehm0Var5;
                            } else {
                                ehm0Var = ehm0Var5;
                                if (na00Var.e) {
                                    wa00Var = new ya00(z3, z2, ocl.b(oclVar7, pb10.r1, pdm.c, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 0L, na00Var.i, 348));
                                } else {
                                    List list8 = l800Var.b;
                                    List list9 = l800Var.d;
                                    list = l800Var.f19585a;
                                    zIsEmpty = list8.isEmpty();
                                    bwh0Var = bwh0.f3325a;
                                    if (!zIsEmpty || (list9 != null && list9.isEmpty())) {
                                        mdm mdmVarB = ocl.b(oclVar7, pb10.r1, pdm.c, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 988);
                                        z4 = na00Var.g;
                                        z5 = na00Var.h;
                                        arrayList = new ArrayList(r3d.q(list, 10));
                                        it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList.add(new yvh0(((ufp0) it.next()).b, bwh0Var));
                                            z4 = z4;
                                            z5 = z5;
                                        }
                                        wa00Var = new wa00(z4, z5, mdmVarB, dyb.r0(arrayList), na00Var.b, !list.isEmpty());
                                    } else {
                                        Iterator it3 = list9.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                mdm mdmVarB2 = ocl.b(oclVar7, pb10.r1, pdm.c, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 988);
                                                z4 = na00Var.g;
                                                z5 = na00Var.h;
                                                arrayList = new ArrayList(r3d.q(list, 10));
                                                it = list.iterator();
                                                while (it.hasNext()) {
                                                    arrayList.add(new yvh0(((ufp0) it.next()).b, bwh0Var));
                                                    z4 = z4;
                                                    z5 = z5;
                                                }
                                                wa00Var = new wa00(z4, z5, mdmVarB2, dyb.r0(arrayList), na00Var.b, !list.isEmpty());
                                            } else if (zdx.C((d800) it3.next())) {
                                                int i4 = na00Var.b;
                                                boolean z18 = na00Var.g;
                                                ArrayList arrayList5 = new ArrayList(r3d.q(list, 10));
                                                for (Iterator it4 = list.iterator(); it4.hasNext(); it4 = it4) {
                                                    arrayList5.add(new yvh0(((ufp0) it4.next()).b, bwh0Var));
                                                }
                                                i4 i4VarR0 = dyb.r0(arrayList5);
                                                boolean z19 = na00Var.h;
                                                ArrayList arrayList6 = new ArrayList(r3d.q(list, 10));
                                                int i5 = 0;
                                                for (Object obj3 : list) {
                                                    int i6 = i5 + 1;
                                                    if (i5 < 0) {
                                                        q3d.p();
                                                        throw null;
                                                    }
                                                    ufp0 ufp0Var = (ufp0) obj3;
                                                    Iterator it5 = list9.iterator();
                                                    while (true) {
                                                        if (it5.hasNext()) {
                                                            next = it5.next();
                                                            i4Var = i4VarR0;
                                                            d800 d800Var = (d800) next;
                                                            z6 = z19;
                                                            if (!d800Var.f5620a.equals(ufp0Var.f35586a) || !zdx.C(d800Var)) {
                                                                i4VarR0 = i4Var;
                                                                z19 = z6;
                                                            }
                                                        } else {
                                                            i4Var = i4VarR0;
                                                            z6 = z19;
                                                            next = null;
                                                        }
                                                    }
                                                    d800 d800Var2 = (d800) next;
                                                    if (d800Var2 != null) {
                                                        objK = xdx.K(d800Var2, j2, uaq0Var, l800Var.b, i5 == 0 ? na00Var.c : na00Var.d);
                                                    } else {
                                                        l800Var = l800Var;
                                                        objK = sa00.f31870a;
                                                    }
                                                    arrayList6.add(objK);
                                                    l800Var = l800Var;
                                                    i5 = i6;
                                                    i4VarR0 = i4Var;
                                                    z19 = z6;
                                                }
                                                wa00Var = new va00(z18, z19, i4VarR0, dyb.r0(arrayList6), i4, ocl.b(oclVar7, pb10.r1, pdm.c, 0, 0, R.string.statistic_empty_data, 0, 0L, 0L, 988));
                                            }
                                        }
                                    }
                                }
                                n020Var = new n020(new m020(cgk0VarB, a4xVarO2, j, a4xVarO1, wa00Var, ehm0Var6, ehm0Var, ehm0Var7, ehm0Var4, ehm0Var3, ehm0Var2, ehm0Var8));
                            }
                            n020Var = new n020(new m020(cgk0VarB, a4xVarO2, j, a4xVarO1, wa00Var, ehm0Var6, ehm0Var, ehm0Var7, ehm0Var4, ehm0Var3, ehm0Var2, ehm0Var8));
                        } else {
                            n020Var = new o020(new eb10(ocl.b(oclVar7, pb10.g, null, 0, 0, R.string.statistic_empty_data, 0, 0L, 0L, 990)));
                        }
                    } else if (!list7.isEmpty() || z17 || z16) {
                        a4x a4xVarO3 = dyb.o0(list7);
                        cgk0 cgk0VarB2 = androidx.compose.runtime.e.b(v020Var.g);
                        long j3 = v020Var.c;
                        a4x a4xVarO4 = dyb.o0(v020Var.l);
                        na00Var = v020Var.o;
                        long j4 = v020Var.c;
                        uaq0 uaq0Var2 = v020Var.v;
                        z = na00Var.f;
                        z2 = na00Var.h;
                        z3 = na00Var.g;
                        l800Var = na00Var.f23166a;
                        if (z) {
                            wa00Var = new ab00(z3, z2);
                            ehm0Var = ehm0Var5;
                        } else {
                            ehm0Var = ehm0Var5;
                            if (na00Var.e) {
                                wa00Var = new ya00(z3, z2, ocl.b(oclVar7, pb10.r1, pdm.c, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 0L, na00Var.i, 348));
                            } else {
                                List list10 = l800Var.b;
                                List list11 = l800Var.d;
                                list = l800Var.f19585a;
                                zIsEmpty = list10.isEmpty();
                                bwh0Var = bwh0.f3325a;
                                if (zIsEmpty) {
                                    mdm mdmVarB3 = ocl.b(oclVar7, pb10.r1, pdm.c, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 988);
                                    z4 = na00Var.g;
                                    z5 = na00Var.h;
                                    arrayList = new ArrayList(r3d.q(list, 10));
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(new yvh0(((ufp0) it.next()).b, bwh0Var));
                                        z4 = z4;
                                        z5 = z5;
                                    }
                                    wa00Var = new wa00(z4, z5, mdmVarB3, dyb.r0(arrayList), na00Var.b, !list.isEmpty());
                                } else {
                                    mdm mdmVarB4 = ocl.b(oclVar7, pb10.r1, pdm.c, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 988);
                                    z4 = na00Var.g;
                                    z5 = na00Var.h;
                                    arrayList = new ArrayList(r3d.q(list, 10));
                                    it = list.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(new yvh0(((ufp0) it.next()).b, bwh0Var));
                                        z4 = z4;
                                        z5 = z5;
                                    }
                                    wa00Var = new wa00(z4, z5, mdmVarB4, dyb.r0(arrayList), na00Var.b, !list.isEmpty());
                                }
                            }
                            n020Var = new n020(new m020(cgk0VarB2, a4xVarO4, j3, a4xVarO3, wa00Var, ehm0Var6, ehm0Var, ehm0Var7, ehm0Var4, ehm0Var3, ehm0Var2, ehm0Var8));
                        }
                        n020Var = new n020(new m020(cgk0VarB2, a4xVarO4, j3, a4xVarO3, wa00Var, ehm0Var6, ehm0Var, ehm0Var7, ehm0Var4, ehm0Var3, ehm0Var2, ehm0Var8));
                    } else {
                        n020Var = new o020(new eb10(ocl.b(oclVar7, pb10.g, null, 0, 0, R.string.statistic_empty_data, 0, 0L, 0L, 990)));
                    }
                }
                return new g120(zdm0Var5, j9m0VarC3, n020Var, zD7);
            case 7:
                hc30 hc30Var = (hc30) obj;
                hc30Var.getClass();
                ygp ygpVar8 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var8 = r9uVar.f30104a;
                j1q0Var8.getClass();
                boolean zD8 = j1q0Var8.f15748a.d(ygpVar8);
                nc5 nc5Var6 = hc30Var.c;
                List list12 = hc30Var.h;
                ad30 ad30Var = new ad30(ydx.c0(nc5Var6), hc30Var.b);
                boolean z20 = hc30Var.f;
                ocl oclVar8 = this.b;
                if (z20) {
                    return new lc30(ad30Var, ocl.b(oclVar8, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), zD8);
                }
                if (hc30Var.g) {
                    return new lc30(ad30Var, ocl.b(oclVar8, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990), zD8);
                }
                if (hc30Var.d) {
                    return new mc30(ad30Var, zD8);
                }
                long j5 = hc30Var.i;
                list12.getClass();
                ArrayList arrayList7 = new ArrayList(r3d.q(list12, 10));
                int i7 = 0;
                for (Object obj4 : list12) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        ?? r27 = str;
                        q3d.p();
                        throw r27;
                    }
                    int i9 = i;
                    long j6 = i7;
                    String str6 = str;
                    arrayList7.add(new lxl(j6, (dyl) new xxl(((ac30) obj4).b), Integer.valueOf(i9), false, ((j6 > j5 ? 1 : (j6 == j5 ? 0 : -1)) == 0 ? i9 : 0) != 0 ? uxl.b : uxl.f36445a, (cwl) null));
                    i7 = i8;
                    i = i9;
                    str = str6;
                }
                String str7 = str;
                a4x a4xVarO5 = dyb.o0(arrayList7);
                ArrayList arrayList8 = new ArrayList(r3d.q(list12, 10));
                Iterator it6 = list12.iterator();
                while (it6.hasNext()) {
                    List<sn5> list13 = ((ac30) it6.next()).d;
                    list13.getClass();
                    ArrayList arrayList9 = new ArrayList(r3d.q(list13, i2));
                    for (sn5 sn5Var : list13) {
                        String str8 = sn5Var.f32476a;
                        ycf ycfVar = sn5Var.b;
                        String str9 = ycfVar.f42383a;
                        List list14 = ycfVar.b;
                        a4x a4xVar = a4xVarO5;
                        ArrayList arrayList10 = new ArrayList(r3d.q(list14, i2));
                        Iterator it7 = list14.iterator();
                        while (it7.hasNext()) {
                            String str10 = (String) it7.next();
                            int iHashCode = str10.hashCode();
                            Iterator it8 = it7;
                            if (iHashCode != 52) {
                                if (iHashCode != 54) {
                                    if (iHashCode == 87 && str10.equals("W")) {
                                        ValueOf = Integer.valueOf(R.drawable.ic_cricket_w);
                                    } else {
                                        ValueOf = str7;
                                    }
                                } else if (str10.equals("6")) {
                                    ValueOf = Integer.valueOf(R.drawable.ic_cricket_6);
                                } else {
                                    ValueOf = str7;
                                }
                            } else if (str10.equals("4")) {
                                ValueOf = Integer.valueOf(R.drawable.ic_cricket_4);
                            } else {
                                ValueOf = str7;
                            }
                            arrayList10.add(ValueOf != 0 ? new ho5(ValueOf.intValue()) : new io5(str10));
                            it7 = it8;
                        }
                        cdf cdfVar = new cdf(str9, arrayList10);
                        edf edfVar = sn5Var.c;
                        arrayList9.add(new wn5(str8, cdfVar, new idf(edfVar.f7614a, edfVar.b)));
                        i2 = 10;
                        a4xVarO5 = a4xVar;
                    }
                    arrayList8.add(dyb.o0(arrayList9));
                    i2 = 10;
                    a4xVarO5 = a4xVarO5;
                }
                return new nc30(ad30Var, list12.size(), a4xVarO5, dyb.o0(arrayList8), hc30Var.i, ocl.b(oclVar8, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990), zD8);
            case 8:
                return a(obj);
            case 9:
                pw50 pw50Var = (pw50) obj;
                pw50Var.getClass();
                ygp ygpVar9 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var9 = r9uVar.f30104a;
                j1q0Var9.getClass();
                boolean zD9 = j1q0Var9.f15748a.d(ygpVar9);
                nc5 nc5Var7 = pw50Var.g;
                xu50 xu50Var = pw50Var.e;
                j9m0 j9m0VarC4 = ydx.c0(nc5Var7);
                zdm0 zdm0Var6 = pw50Var.f;
                eu50 eu50Var = new eu50(j9m0VarC4, zdm0Var6);
                if (pw50Var.b) {
                    return new ww50(eu50Var, zD9);
                }
                boolean z21 = pw50Var.c;
                ocl oclVar9 = this.b;
                if (z21) {
                    vw50Var = new vw50(eu50Var, zD9, ocl.b(oclVar9, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                } else {
                    if (xu50Var != null) {
                        List list15 = xu50Var.f41495a;
                        if (!list15.isEmpty()) {
                            ydm0 ydm0Var2 = zdm0Var6 instanceof ydm0 ? (ydm0) zdm0Var6 : null;
                            vdm0 vdm0Var = ydm0Var2 != null ? ydm0Var2.b : null;
                            tdm0 tdm0Var = vdm0Var instanceof tdm0 ? (tdm0) vdm0Var : null;
                            String str11 = tdm0Var != null ? tdm0Var.c.f44686a : null;
                            if (str11 == null) {
                                str11 = "";
                            }
                            List listY = n6x.y(str11, list15);
                            if (listY == null) {
                                listY = ((igp0) list15.get(0)).b;
                            }
                            List list16 = listY;
                            String str12 = tdm0Var != null ? tdm0Var.d.f44686a : null;
                            if (str12 == null) {
                                str12 = "";
                            }
                            List listY2 = n6x.y(str12, list15);
                            if (listY2 == null) {
                                listY2 = ((igp0) list15.get(1)).b;
                            }
                            List list17 = listY2;
                            int i10 = pw50Var.d;
                            lc00 lc00VarB = kotlin.collections.a.b();
                            String str13 = tdm0Var != null ? tdm0Var.c.b : null;
                            if (str13 == null) {
                                str13 = "";
                            }
                            lc00VarB.add(str13);
                            str = tdm0Var != null ? tdm0Var.d.b : null;
                            lc00VarB.add(str != null ? str : "");
                            return new xw50(eu50Var, zD9, i10, dyb.o0(kotlin.collections.a.a(lc00VarB)), list16, list17);
                        }
                    }
                    vw50Var = new vw50(eu50Var, zD9, ocl.b(oclVar9, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
                }
                return vw50Var;
            case 10:
                yqd0 yqd0Var = (yqd0) obj;
                yqd0Var.getClass();
                ygp ygpVar10 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var10 = r9uVar.f30104a;
                j1q0Var10.getClass();
                boolean zD10 = j1q0Var10.f15748a.d(ygpVar10);
                j9m0 j9m0VarC5 = ydx.c0(yqd0Var.j);
                String str14 = yqd0Var.e;
                zdm0 zdm0Var7 = yqd0Var.i;
                String str15 = yqd0Var.g;
                String str16 = yqd0Var.f;
                zdm0 wdm0Var2 = (str14.length() == 0 && str16.length() == 0 && str15.length() == 0) ? new wdm0(zdm0Var7.a()) : new ydm0(zdm0Var7.a(), new qdm0(str14, str16, new lom0(str15, "")));
                if (yqd0Var.f43071a) {
                    return new crd0(j9m0VarC5, wdm0Var2, zD10);
                }
                boolean z22 = yqd0Var.c;
                ocl oclVar10 = this.b;
                return z22 ? new ard0(ocl.b(oclVar10, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990), j9m0VarC5, wdm0Var2, zD10) : yqd0Var.b ? new brd0(ocl.b(oclVar10, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), j9m0VarC5, wdm0Var2, zD10) : new zqd0(dyb.o0(yqd0Var.h), j9m0VarC5, wdm0Var2, zD10);
            case 11:
                dje0 dje0Var = (dje0) obj;
                dje0Var.getClass();
                ygp ygpVar11 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var11 = r9uVar.f30104a;
                j1q0Var11.getClass();
                boolean zD11 = j1q0Var11.f15748a.d(ygpVar11);
                boolean z23 = dje0Var.f6182a;
                List<pie0> list18 = dje0Var.c;
                if (z23) {
                    return hje0.f13155a;
                }
                boolean z24 = dje0Var.b;
                ocl oclVar11 = this.b;
                if (z24) {
                    return new gje0(ocl.b(oclVar11, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                if (list18.isEmpty()) {
                    return new gje0(ocl.b(oclVar11, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
                }
                ArrayList arrayList11 = new ArrayList(r3d.q(list18, 10));
                for (pie0 pie0Var : list18) {
                    pie0Var.getClass();
                    String strT = vsm0.t(pie0Var.c);
                    String strT2 = vsm0.t(pie0Var.d);
                    String str17 = pie0Var.e;
                    String strValueOf = String.valueOf(pie0Var.f);
                    String strValueOf2 = String.valueOf(pie0Var.g);
                    d4d d4dVar = d4d.SECONDARY60;
                    w6n w6nVar = w6n.h;
                    t6n t6nVar = new t6n(d4dVar, w6nVar, new c280(strT, R.drawable.ic_glyph_placeholder_player));
                    t6n t6nVar2 = new t6n(d4dVar, w6nVar, new c280(strT2, R.drawable.ic_glyph_placeholder_player));
                    String str18 = pie0Var.f27039a;
                    String str19 = pie0Var.b;
                    rdj rdjVar = rdj.f30294a;
                    String strF = rdj.f(new znq0(pie0Var.h), sdj.UNIVERSAL, null, 60);
                    lmp0 lmp0Var = pie0Var.i;
                    String strValueOf3 = String.valueOf(lmp0Var.b);
                    String strValueOf4 = String.valueOf(lmp0Var.c);
                    String strValueOf5 = String.valueOf(lmp0Var.f20309a);
                    lmp0 lmp0Var2 = pie0Var.j;
                    arrayList11.add(new eje0(str17, strValueOf, strValueOf2, t6nVar, t6nVar2, str18, str19, strF, strValueOf3, strValueOf4, strValueOf5, String.valueOf(lmp0Var2.b), String.valueOf(lmp0Var2.c), String.valueOf(lmp0Var2.f20309a)));
                }
                return new fje0(dyb.o0(arrayList11), zD11);
            case 12:
                b5k0 b5k0Var = (b5k0) obj;
                b5k0Var.getClass();
                ygp ygpVar12 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var12 = r9uVar.f30104a;
                j1q0Var12.getClass();
                boolean zD12 = j1q0Var12.f15748a.d(ygpVar12);
                boolean z25 = b5k0Var.f;
                esp0 esp0Var = b5k0Var.d;
                nc5 nc5Var8 = b5k0Var.c;
                llm0 llm0Var3 = b5k0Var.f2007a;
                ocl oclVar12 = this.b;
                if (z25) {
                    return new d5k0(new z4k0(ydx.c0(nc5Var8), new xdm0(fxb.J(llm0Var3))), ocl.b(oclVar12, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE), zD12);
                }
                if (b5k0Var.g) {
                    return new d5k0(new z4k0(ydx.c0(nc5Var8), new wdm0(fxb.J(llm0Var3))), ocl.b(oclVar12, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990), zD12);
                }
                if (b5k0Var.e) {
                    return new e5k0(new z4k0(ydx.c0(nc5Var8), new wdm0(fxb.J(llm0Var3))), zD12);
                }
                if (esp0Var == null) {
                    return new d5k0(new z4k0(ydx.c0(nc5Var8), new wdm0(fxb.J(llm0Var3))), ocl.b(oclVar12, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990), zD12);
                }
                z4k0 z4k0Var = new z4k0(ydx.c0(nc5Var8), new ydm0(fxb.J(llm0Var3), new sdm0(b5k0Var.b, vsm0.s(0L, esp0Var.d), esp0Var.b, new lom0("", ""))));
                List<dsp0> list19 = esp0Var.f;
                ArrayList arrayList12 = new ArrayList(r3d.q(list19, 10));
                for (dsp0 dsp0Var : list19) {
                    String str20 = dsp0Var.b;
                    int i11 = dsp0Var.f6623a;
                    if (i11 != 55) {
                        switch (i11) {
                            case 17:
                                ctp0Var = xsp0.c;
                                break;
                            case 18:
                                ctp0Var = hsp0.c;
                                break;
                            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                ctp0Var = qsp0.c;
                                break;
                            case 20:
                                ctp0Var = osp0.c;
                                break;
                            case 21:
                                ctp0Var = nsp0.c;
                                break;
                            case 22:
                                ctp0Var = usp0.c;
                                break;
                            default:
                                ctp0Var = zsp0.c;
                                break;
                        }
                    } else {
                        ctp0Var = tsp0.c;
                    }
                    arrayList12.add(new etp0(str20, ctp0Var));
                }
                return new c5k0(z4k0Var, dyb.o0(arrayList12), zD12);
            case 13:
                return b(obj);
            default:
                vlv0 vlv0Var = (vlv0) obj;
                vlv0Var.getClass();
                llm0 llm0Var4 = vlv0Var.h;
                ygp ygpVar13 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var13 = r9uVar.f30104a;
                j1q0Var13.getClass();
                boolean zD13 = j1q0Var13.f15748a.d(ygpVar13);
                eme emeVar = vlv0Var.c;
                nc5 nc5Var9 = vlv0Var.d;
                ydm0 ydm0Var3 = new ydm0(emeVar, new qdm0(vlv0Var.k, vlv0Var.l, new jom0(vlv0Var.m)));
                boolean z26 = vlv0Var.f;
                ocl oclVar13 = this.b;
                if (z26) {
                    return new xlv0(ydm0Var3, ydx.c0(nc5Var9), llm0Var4, zD13, ocl.b(oclVar13, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                if (vlv0Var.g) {
                    return new xlv0(ydm0Var3, ydx.c0(nc5Var9), llm0Var4, zD13, ocl.b(oclVar13, pb10.g, null, 0, 0, R.string.data_is_missing, 0, 0L, 0L, 990));
                }
                if (vlv0Var.e) {
                    return new ylv0(ydm0Var3, ydx.c0(nc5Var9), llm0Var4, zD13);
                }
                j9m0 j9m0VarC6 = ydx.c0(nc5Var9);
                List<pkv0> list20 = vlv0Var.n;
                ArrayList arrayList13 = new ArrayList(r3d.q(list20, 10));
                for (pkv0 pkv0Var : list20) {
                    pkv0Var.getClass();
                    String str21 = pkv0Var.f27154a;
                    int i12 = pkv0Var.b;
                    arrayList13.add(new j240(i12 != 18 ? i12 != 48 ? vkv0.b : tkv0.b : ukv0.b, str21));
                }
                ArrayList arrayList14 = new ArrayList();
                for (Object obj5 : arrayList13) {
                    if (!(((j240) obj5).f15765a instanceof vkv0)) {
                        arrayList14.add(obj5);
                    }
                }
                return new wlv0(ydm0Var3, j9m0VarC6, llm0Var4, zD13, dyb.o0(arrayList14));
        }
    }
}
