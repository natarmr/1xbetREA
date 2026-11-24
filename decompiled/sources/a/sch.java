package a;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import org.xplatform.aggregator.impl.category.presentation.models.AggregatorProvidersFiltersUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class sch extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sch(Object obj, Object obj2, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.m;
        Object obj5 = this.l;
        switch (b) {
            case 0:
                sch schVar = new sch((lhf0) obj5, (sip) obj4, (yje) obj3, (byte) 0);
                schVar.j = (List) obj;
                schVar.k = (List) obj2;
                return schVar.invokeSuspend(Unit.f46060a);
            case 1:
                sch schVar2 = new sch((r3q) obj5, (cu) obj4, (yje) obj3, (byte) 1);
                schVar2.j = (AggregatorProvidersFiltersUiModel) obj;
                schVar2.k = (AggregatorProvidersFiltersUiModel) obj2;
                return schVar2.invokeSuspend(Unit.f46060a);
            default:
                sch schVar3 = new sch((lok0) obj5, (tpk0) obj4, (yje) obj3, (byte) 2);
                schVar3.j = (List) obj;
                schVar3.k = (List) obj2;
                return schVar3.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object next;
        Object value;
        Object value2;
        Object value3;
        byte b = this.i;
        Object obj2 = this.l;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                List list = (List) this.j;
                List list2 = (List) this.k;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    axq.t(((eeb) it.next()).f7663a, arrayList);
                }
                Set setP0 = CollectionsKt.P0(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list2) {
                    if (setP0.contains(new Long(((Number) obj4).longValue()))) {
                        arrayList2.add(obj4);
                    }
                }
                if (arrayList2.size() != list2.size()) {
                    lsn lsnVar = (lsn) ((lhf0) obj2).d;
                    sip sipVar = (sip) obj3;
                    sipVar.getClass();
                    rch rchVar = (rch) lsnVar.f20589a;
                    rchVar.getClass();
                    op1 op1Var = rchVar.f30238a;
                    List list3 = (List) ((Map) op1Var.f25617a.getValue()).getOrDefault(sipVar, iun.f15405a);
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : list3) {
                        if (arrayList2.contains(Long.valueOf(((Number) obj5).longValue()))) {
                            arrayList3.add(obj5);
                        }
                    }
                    op1Var.a(arrayList3, sipVar);
                }
                return arrayList2;
            case 1:
                AggregatorProvidersFiltersUiModel aggregatorProvidersFiltersUiModel = (AggregatorProvidersFiltersUiModel) this.j;
                AggregatorProvidersFiltersUiModel aggregatorProvidersFiltersUiModel2 = (AggregatorProvidersFiltersUiModel) this.k;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                AggregatorProvidersFiltersUiModel aggregatorProvidersFiltersUiModel3 = new AggregatorProvidersFiltersUiModel(((r3q) obj2).f29800a, aggregatorProvidersFiltersUiModel.b, aggregatorProvidersFiltersUiModel2.c);
                return ((b5c) ((cu) obj3).d).f1996a.b.d ? new r2b(aggregatorProvidersFiltersUiModel3) : new s2b(aggregatorProvidersFiltersUiModel3);
            default:
                tpk0 tpk0Var = (tpk0) obj3;
                ocj ocjVar = tpk0Var.i;
                List list4 = (List) this.j;
                List list5 = (List) this.k;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                lok0 lok0Var = (lok0) obj2;
                String str = lok0Var.u;
                if (lok0Var.h) {
                    Date time = Calendar.getInstance().getTime();
                    time.getClass();
                    Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
                    calendar.setTime(time);
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    Date time2 = calendar.getTime();
                    time2.getClass();
                    long time3 = time2.getTime();
                    ArrayList arrayListQ0 = CollectionsKt.q0(list4, list5);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj6 : arrayListQ0) {
                        d0t d0tVar = (d0t) obj6;
                        if (time3 < d0tVar.s * 1000 || d0tVar.C) {
                            arrayList4.add(obj6);
                        }
                    }
                    Iterator it2 = arrayList4.iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            long j = ((d0t) next).s;
                            do {
                                Object next2 = it2.next();
                                long j2 = ((d0t) next2).s;
                                if (j > j2) {
                                    next = next2;
                                    j = j2;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    d0t d0tVar2 = (d0t) next;
                    if (d0tVar2 == null) {
                        IntRange intRange = tpk0.Z;
                        p7m0 p7m0Var = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var.getValue();
                            value2.getClass();
                        } while (!p7m0Var.m(value2, jpk0.a((jpk0) value2, null, "", "", 0L, null, false, 2023)));
                    } else {
                        String strF = q5x.F(((jpk0) tpk0Var.D()).f16907a, str, String.valueOf(d0tVar2.q.f8731a), true);
                        String strF2 = q5x.F(((jpk0) tpk0Var.D()).f16907a, str, String.valueOf(d0tVar2.r.f8731a), false);
                        p7m0 p7m0Var2 = ocjVar.f25029a;
                        do {
                            value = p7m0Var2.getValue();
                            value.getClass();
                        } while (!p7m0Var2.m(value, jpk0.a((jpk0) value, null, strF, strF2, 0L, null, false, 2023)));
                    }
                } else {
                    IntRange intRange2 = tpk0.Z;
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                    } while (!p7m0Var3.m(value3, jpk0.a((jpk0) value3, null, "", "", 0L, null, false, 2023)));
                }
                return Unit.f46060a;
        }
    }
}
