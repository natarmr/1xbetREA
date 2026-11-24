package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.xplatform.aggregator.impl.category.presentation.models.AggregatorProvidersFiltersUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class opu extends bnn0 implements xdr {
    public final /* synthetic */ byte i = 0;
    public /* synthetic */ List j;
    public final /* synthetic */ long k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opu(long j, mp0 mp0Var, yje yjeVar) {
        super(3, yjeVar);
        this.k = j;
        this.m = mp0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        long j = this.k;
        Object obj4 = this.m;
        switch (b) {
            case 0:
                opu opuVar = new opu(j, (mp0) obj4, (yje) obj3);
                opuVar.l = (nh1) obj;
                opuVar.j = (List) obj2;
                return opuVar.invokeSuspend(Unit.f46060a);
            default:
                opu opuVar2 = new opu((w5z) obj4, j, (yje) obj3);
                opuVar2.j = (List) obj;
                opuVar2.l = (HashMap) obj2;
                return opuVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                mp0 mp0Var = (mp0) obj2;
                nh1 nh1Var = (nh1) this.l;
                List list = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (list.isEmpty()) {
                    List list2 = nh1Var.b;
                    arrayList = new ArrayList(r3d.q(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(l7x.c0((ezc0) it.next(), mp0Var));
                    }
                } else {
                    arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(l7x.c0((ezc0) it2.next(), mp0Var));
                    }
                }
                return new AggregatorProvidersFiltersUiModel(this.k, iun.f15405a, arrayList);
            default:
                List<sr20> list3 = this.j;
                HashMap map = (HashMap) this.l;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
                for (sr20 sr20Var : list3) {
                    Boolean bool = (Boolean) map.get(new Long(sr20Var.b));
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    ArrayList<List> arrayList3 = sr20Var.f32656a;
                    ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                    for (List list4 : arrayList3) {
                        ArrayList arrayList5 = new ArrayList(r3d.q(list4, 10));
                        Iterator it3 = list4.iterator();
                        while (it3.hasNext()) {
                            arrayList5.add(tlb.h0((vr20) it3.next(), false, false, uyc.IDLE));
                        }
                        arrayList4.add(arrayList5);
                    }
                    arrayList2.add(new mu20(arrayList4, sr20Var.b, sr20Var.c, sr20Var.d, zBooleanValue));
                }
                ArrayList arrayList6 = new ArrayList(arrayList2);
                w5z w5zVar = (w5z) obj2;
                w5zVar.getClass();
                if (map.isEmpty()) {
                    int i = 0;
                    for (Object obj3 : arrayList6) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        a1d.h((a1d) w5zVar.c, ((mu20) obj3).b, this.k, i < 3);
                        i = i2;
                    }
                }
                return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opu(w5z w5zVar, long j, yje yjeVar) {
        super(3, yjeVar);
        this.m = w5zVar;
        this.k = j;
    }
}
