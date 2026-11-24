package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bo0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2908a;
    public final /* synthetic */ List b;

    public /* synthetic */ bo0(List list, byte b) {
        this.f2908a = b;
        this.b = list;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2908a;
        List<rpw> list = this.b;
        switch (b) {
            case 0:
                ln0 ln0Var = (ln0) obj2;
                ((oyg0) obj).getClass();
                ln0Var.getClass();
                Map map = ln0Var.j;
                int iA = wp20.a(r3d.q(list, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA >= 16 ? iA : 16);
                for (Object obj3 : list) {
                    linkedHashMap.put(Long.valueOf(((mlr) obj3).f22006a), obj3);
                }
                return ln0.a(ln0Var, null, false, null, xp20.j(map, linkedHashMap), null, null, null, null, 0L, false, 65023);
            case 1:
                ln0 ln0Var2 = (ln0) obj2;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((mlr) it.next()).f22006a));
                }
                return ln0.a(ln0Var2, null, false, null, null, CollectionsKt.P0(arrayList), null, null, null, 0L, false, 64511);
            case 2:
                q11 q11Var = (q11) obj2;
                ArrayList arrayList2 = new ArrayList();
                List list2 = this.b;
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    w3d.u(arrayList2, ((j8b) it2.next()).c);
                }
                int iA2 = wp20.a(r3d.q(arrayList2, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2 >= 16 ? iA2 : 16);
                for (Object obj4 : arrayList2) {
                    linkedHashMap2.put(Long.valueOf(((mlr) obj4).f22006a), obj4);
                }
                return q11.a(q11Var, 0L, null, null, null, null, null, null, list2, linkedHashMap2, false, false, false, null, false, null, null, null, 536858623);
            case 3:
                q11 q11Var2 = (q11) obj2;
                ArrayList arrayList3 = new ArrayList(r3d.q(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Long.valueOf(((mlr) it3.next()).f22006a));
                }
                return q11.a(q11Var2, 0L, null, null, null, null, null, null, null, null, false, false, false, null, false, null, null, CollectionsKt.P0(arrayList3), 268435455);
            case 4:
                pf1 pf1Var = (pf1) obj2;
                ((oyg0) obj).getClass();
                pf1Var.getClass();
                return pf1.a(pf1Var, null, 0, 0, false, 0L, dyb.o0(list), false, null, null, new x5c0(dyb.o0(list)), null, null, null, false, null, false, -136314881, 15);
            case 5:
                j8d0 j8d0Var = (j8d0) obj2;
                ArrayList arrayList4 = new ArrayList(r3d.q(list, 10));
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    arrayList4.add(Long.valueOf(((mlr) it4.next()).f22006a));
                }
                return j8d0.a(j8d0Var, false, null, CollectionsKt.P0(arrayList4), null, 3583);
            case 6:
                yu1 yu1Var = (yu1) obj2;
                ArrayList arrayList5 = new ArrayList(r3d.q(list, 10));
                Iterator it5 = list.iterator();
                while (it5.hasNext()) {
                    arrayList5.add(Long.valueOf(((mlr) it5.next()).f22006a));
                }
                return yu1.a(yu1Var, null, false, null, null, null, null, null, null, null, false, false, false, null, null, null, CollectionsKt.P0(arrayList5), null, 25165823);
            case 7:
                xm2 xm2Var = (xm2) obj2;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj5 : list) {
                    if (obj5 instanceof oxy) {
                        arrayList6.add(obj5);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj6 : list) {
                    if (obj6 instanceof d0t) {
                        arrayList7.add(obj6);
                    }
                }
                return xm2.a(xm2Var, false, false, false, arrayList6, arrayList7, null, false, false, false, false, false, false, 262100);
            case 8:
                s75 s75Var = (s75) obj2;
                m65 m65Var = s75Var.f31733a;
                ArrayList arrayList8 = new ArrayList(r3d.q(list, 10));
                Iterator it6 = list.iterator();
                while (it6.hasNext()) {
                    arrayList8.add(Long.valueOf(((mlr) it6.next()).f22006a));
                }
                return s75.a(s75Var, m65.a(m65Var, false, false, null, false, CollectionsKt.P0(arrayList8), 15), false, false, 30);
            case 9:
                yx8 yx8Var = (yx8) obj2;
                ArrayList arrayList9 = new ArrayList(r3d.q(list, 10));
                Iterator it7 = list.iterator();
                while (it7.hasNext()) {
                    arrayList9.add(Long.valueOf(((mlr) it7.next()).f22006a));
                }
                Set setP0 = CollectionsKt.P0(arrayList9);
                wx8 wx8Var = yx8Var.f43408a;
                boolean z = wx8Var.f39919a;
                boolean z2 = wx8Var.b;
                List list3 = wx8Var.c;
                list3.getClass();
                setP0.getClass();
                return yx8.a(yx8Var, new wx8(z, z2, list3, setP0), null, null, false, null, null, null, null, false, 1048574);
            case 10:
                ((Integer) obj2).getClass();
                xia0.o(list, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 11:
                ((Integer) obj2).getClass();
                xbc.u(list, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 12:
                i9p i9pVar = (i9p) obj2;
                ArrayList arrayList10 = new ArrayList();
                List list4 = this.b;
                for (Object obj7 : list4) {
                    if (((pbv) obj7).b.contains(159891)) {
                        arrayList10.add(obj7);
                    }
                }
                return i9p.a(i9pVar, false, false, false, false, false, arrayList10, list4, null, false, 7949);
            case 13:
                pnp pnpVar = (pnp) obj2;
                ((oyg0) obj).getClass();
                pnpVar.getClass();
                return pnp.a(pnpVar, null, false, null, null, false, false, null, false, 0, dyb.o0(list), false, false, false, false, null, null, 2080767);
            case 14:
                return qnr.a((qnr) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, this.b, false, -1, 393215);
            case 15:
                return qnr.a((qnr) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, this.b, false, null, false, -1, 507903);
            case 16:
                qnr qnrVar = (qnr) obj2;
                ArrayList arrayList11 = new ArrayList();
                for (Object obj8 : list) {
                    if (obj8 instanceof rvm0) {
                        arrayList11.add(obj8);
                    }
                }
                boolean z3 = !arrayList11.isEmpty();
                ArrayList arrayList12 = new ArrayList();
                for (Object obj9 : list) {
                    if (obj9 instanceof uvm0) {
                        arrayList12.add(obj9);
                    }
                }
                return qnr.a(qnrVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, z3, false, null, false, false, false, false, false, false, false, !arrayList12.isEmpty(), false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -1074790401, 524287);
            case 17:
                return z2s.a((z2s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, false, this.b, -1, 32767);
            case 18:
                return z2s.a((z2s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, this.b, false, null, -1, 61439);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                z2s z2sVar = (z2s) obj2;
                ArrayList arrayList13 = new ArrayList();
                for (Object obj10 : list) {
                    if (obj10 instanceof rvm0) {
                        arrayList13.add(obj10);
                    }
                }
                boolean z4 = !arrayList13.isEmpty();
                ArrayList arrayList14 = new ArrayList();
                for (Object obj11 : list) {
                    if (obj11 instanceof uvm0) {
                        arrayList14.add(obj11);
                    }
                }
                return z2s.a(z2sVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, false, false, false, z4, false, null, false, !arrayList14.isEmpty(), false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, -68157441, 65535);
            case 20:
                return r7s.a((r7s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, null, this.b, false, -1, 786431);
            case 21:
                return r7s.a((r7s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, false, null, null, null, null, null, null, null, this.b, null, false, -1, 983039);
            case 22:
                r7s r7sVar = (r7s) obj2;
                ArrayList arrayList15 = new ArrayList();
                for (Object obj12 : list) {
                    if (obj12 instanceof rvm0) {
                        arrayList15.add(obj12);
                    }
                }
                boolean z5 = !arrayList15.isEmpty();
                ArrayList arrayList16 = new ArrayList();
                for (Object obj13 : list) {
                    if (obj13 instanceof uvm0) {
                        arrayList16.add(obj13);
                    }
                }
                return r7s.a(r7sVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, false, false, false, false, false, false, z5, false, null, null, false, false, false, false, false, false, null, false, !arrayList16.isEmpty(), false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, -2097153, 1048573);
            case 23:
                return njs.a((njs) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, this.b, -1, 32767);
            case 24:
                return njs.a((njs) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, this.b, null, -1, 57343);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                njs njsVar = (njs) obj2;
                ArrayList arrayList17 = new ArrayList();
                for (Object obj14 : list) {
                    if (obj14 instanceof rvm0) {
                        arrayList17.add(obj14);
                    }
                }
                boolean z6 = !arrayList17.isEmpty();
                ArrayList arrayList18 = new ArrayList();
                for (Object obj15 : list) {
                    if (obj15 instanceof uvm0) {
                        arrayList18.add(obj15);
                    }
                }
                return njs.a(njsVar, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, null, false, false, false, false, false, false, z6, false, null, false, false, false, false, !arrayList18.isEmpty(), false, false, null, null, null, null, null, null, null, null, null, null, -4194305, 65534);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                crw crwVar = (crw) obj2;
                ((oyg0) obj).getClass();
                crwVar.getClass();
                boolean zIsEmpty = list.isEmpty();
                ArrayList arrayList19 = new ArrayList(r3d.q(list, 10));
                for (rpw rpwVar : list) {
                    rpwVar.getClass();
                    arrayList19.add(new epw(rpwVar.f30905a, rpwVar.b, rpwVar.c, rpwVar.d, rpwVar.e, rpwVar.f, rpwVar.g, rpwVar.h, rpwVar.i, rpwVar.j, true));
                }
                return crw.a(crwVar, false, false, zIsEmpty, arrayList19, false, 16);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        Function2 function2 = (Function2) list.get(i);
                        int iHashCode = Long.hashCode(fetVar.T);
                        mkd.c0.getClass();
                        a7d a7dVar = gqw0.u;
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(a7dVar);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                        function2.invoke(fetVar, 0);
                        fetVar.r(true);
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                p650 p650Var = (p650) obj2;
                ArrayList arrayList20 = new ArrayList(r3d.q(list, 10));
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    arrayList20.add(Long.valueOf(((mlr) it8.next()).f22006a));
                }
                return p650.a(p650Var, null, null, CollectionsKt.P0(arrayList20), false, 261887);
            default:
                rs80 rs80Var = (rs80) obj2;
                ArrayList arrayList21 = new ArrayList(r3d.q(list, 10));
                Iterator it9 = list.iterator();
                while (it9.hasNext()) {
                    arrayList21.add(Long.valueOf(((mlr) it9.next()).f22006a));
                }
                return rs80.a(rs80Var, false, false, false, false, false, false, false, null, null, null, null, CollectionsKt.P0(arrayList21), null, null, null, null, null, false, null, 133955583);
        }
    }

    public /* synthetic */ bo0(List list, int i, byte b) {
        this.f2908a = b;
        this.b = list;
    }
}
