package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class sc60 extends bnn0 implements aer {
    public /* synthetic */ List i;
    public /* synthetic */ List j;
    public /* synthetic */ List k;
    public /* synthetic */ Map l;
    public /* synthetic */ List m;
    public final /* synthetic */ rrd n;
    public final /* synthetic */ String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc60(rrd rrdVar, String str, yje yjeVar) {
        super(6, yjeVar);
        this.n = rrdVar;
        this.o = str;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Map mapK;
        Iterator it;
        List list = this.i;
        List list2 = this.j;
        List list3 = this.k;
        Map map = this.l;
        List list4 = this.m;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            sr20 sr20Var = (sr20) it2.next();
            Boolean bool = (Boolean) map.get(new Long(sr20Var.b));
            boolean z = false;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            if (list4 != null && list4.isEmpty()) {
                it = it2;
                break;
            }
            Iterator it3 = list4.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    it = it2;
                    break;
                }
                vt20 vt20Var = (vt20) it3.next();
                it = it2;
                if (vt20Var.f37982a == sr20Var.b && vt20Var.c != 0) {
                    z = true;
                    break;
                }
                it2 = it;
            }
            boolean z2 = z;
            list2.getClass();
            list3.getClass();
            ArrayList<List> arrayList2 = sr20Var.f32656a;
            long j = sr20Var.e;
            int i = 10;
            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
            for (List<vr20> list5 : arrayList2) {
                ArrayList arrayList4 = new ArrayList(r3d.q(list5, i));
                for (vr20 vr20Var : list5) {
                    arrayList4.add(tlb.h0(vr20Var, p7x.C(list2, vr20Var, j), p7x.C(list3, vr20Var, j), uyc.IDLE));
                    list2 = list2;
                    list3 = list3;
                }
                arrayList3.add(arrayList4);
                i = 10;
            }
            arrayList.add(new i6a0(arrayList3, sr20Var.b, sr20Var.c, zBooleanValue, sr20Var.d, z2));
            it2 = it;
            list2 = list2;
            list3 = list3;
        }
        rrd rrdVar = this.n;
        rrdVar.getClass();
        int iA = wp20.a(r3d.q(list4, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj2 : list4) {
            linkedHashMap.put(Long.valueOf(((vt20) obj2).f37982a), obj2);
        }
        List listA0 = CollectionsKt.A0(arrayList, new sr0(new b0c(linkedHashMap, (byte) 5), linkedHashMap, (byte) 4));
        omo omoVar = (omo) rrdVar.h;
        List listD0 = CollectionsKt.D0(list, 3);
        ArrayList arrayList5 = new ArrayList(r3d.q(listD0, 10));
        Iterator it4 = listD0.iterator();
        while (it4.hasNext()) {
            axq.t(((sr20) it4.next()).b, arrayList5);
        }
        noo nooVar = omoVar.f25512a;
        nooVar.getClass();
        moo mooVar = nooVar.f23877a;
        mooVar.getClass();
        p7m0 p7m0Var = mooVar.f22144a;
        do {
            value = p7m0Var.getValue();
            mapK = (Map) value;
            String str = this.o;
            Map map2 = (Map) mapK.get(str);
            if (map2 == null || map2.isEmpty()) {
                int iA2 = wp20.a(r3d.q(arrayList5, 10));
                if (iA2 < 16) {
                    iA2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA2);
                for (Object obj3 : arrayList5) {
                    ((Number) obj3).longValue();
                    linkedHashMap2.put(obj3, Boolean.TRUE);
                }
                mapK = xp20.k(mapK, new Pair(str, linkedHashMap2));
            }
        } while (!p7m0Var.m(value, mapK));
        return listA0;
    }

    @Override // a.aer
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        sc60 sc60Var = new sc60(this.n, this.o, (yje) obj6);
        sc60Var.i = (List) obj;
        sc60Var.j = (List) obj2;
        sc60Var.k = (List) obj3;
        sc60Var.l = (Map) obj4;
        sc60Var.m = (List) obj5;
        return sc60Var.invokeSuspend(Unit.f46060a);
    }
}
