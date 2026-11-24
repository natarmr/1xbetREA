package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class nc60 extends bnn0 implements aer {
    public /* synthetic */ List i;
    public /* synthetic */ List j;
    public /* synthetic */ List k;
    public /* synthetic */ HashMap l;
    public /* synthetic */ List m;
    public final /* synthetic */ long n;
    public final /* synthetic */ wdu o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc60(long j, wdu wduVar, yje yjeVar) {
        super(6, yjeVar);
        this.n = j;
        this.o = wduVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list = this.i;
        List list2 = this.j;
        List list3 = this.k;
        HashMap map = this.l;
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
            list3.getClass();
            list2.getClass();
            ArrayList<List> arrayList2 = sr20Var.f32656a;
            long j = sr20Var.e;
            int i = 10;
            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
            for (List<vr20> list5 : arrayList2) {
                ArrayList arrayList4 = new ArrayList(r3d.q(list5, i));
                for (vr20 vr20Var : list5) {
                    arrayList4.add(tlb.h0(vr20Var, n6x.D(list3, vr20Var, j), n6x.D(list2, vr20Var, j), uyc.IDLE));
                    list = list;
                    list2 = list2;
                }
                arrayList3.add(arrayList4);
                i = 10;
            }
            arrayList.add(new ou20(arrayList3, sr20Var.b, sr20Var.c, sr20Var.d, sr20Var.f, zBooleanValue, z2));
            it2 = it;
            list = list;
            list2 = list2;
        }
        List list6 = list;
        ArrayList arrayList5 = new ArrayList(q8x.C(arrayList, list4));
        long jF = q8x.F(arrayList5, list4);
        HashSet hashSet = new HashSet();
        Iterator it4 = list6.iterator();
        while (it4.hasNext()) {
            hashSet.add(new Long(((sr20) it4.next()).b));
        }
        wdu wduVar = this.o;
        q8x.N(arrayList5, map, hashSet, this.n, (b8u) wduVar.f, (a1d) wduVar.e);
        if (list6.isEmpty()) {
            return yw7.f43357a;
        }
        return !arrayList5.isEmpty() ? new ww7(jF, arrayList5) : new uw7(jF);
    }

    @Override // a.aer
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        nc60 nc60Var = new nc60(this.n, this.o, (yje) obj6);
        nc60Var.i = (List) obj;
        nc60Var.j = (List) obj2;
        nc60Var.k = (List) obj3;
        nc60Var.l = (HashMap) obj4;
        nc60Var.m = (List) obj5;
        return nc60Var.invokeSuspend(Unit.f46060a);
    }
}
