package a;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wvt extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ long j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvt(long j, yje yjeVar) {
        super(3, yjeVar);
        this.i = (byte) 1;
        this.j = j;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        switch (this.i) {
            case 0:
                long jLongValue = ((Number) obj2).longValue();
                wvt wvtVar = new wvt((jtj) this.l, (yje) obj3, (byte) 0);
                wvtVar.k = (Map) obj;
                wvtVar.j = jLongValue;
                return wvtVar.invokeSuspend(Unit.f46060a);
            case 1:
                wvt wvtVar2 = new wvt(this.j, (yje) obj3);
                wvtVar2.k = (mi1) obj;
                wvtVar2.l = (List) obj2;
                return wvtVar2.invokeSuspend(Unit.f46060a);
            default:
                long jLongValue2 = ((Number) obj).longValue();
                wvt wvtVar3 = new wvt((zos) this.l, (yje) obj3, (byte) 2);
                wvtVar3.j = jLongValue2;
                wvtVar3.k = (fs20) obj2;
                return wvtVar3.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Date date = null;
        switch (this.i) {
            case 0:
                jtj jtjVar = (jtj) this.l;
                Map map = (Map) this.k;
                long j = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                Set set = (Set) map.get(new Long(j));
                Set setE = set != null ? kotlin.collections.b.E(set) : null;
                if (setE == null) {
                    setE = xun.f41520a;
                }
                v5g0 v5g0Var = (v5g0) ((t5g0) ((lef0) jtjVar.c).f19899a).f33368a.getValue();
                Date dateZ = v5g0Var != null ? v5g0Var.b : null;
                if (!setE.contains(dateZ)) {
                    dateZ = null;
                }
                if (dateZ != null) {
                    date = dateZ;
                } else {
                    Set set2 = !setE.isEmpty() ? setE : null;
                    if (set2 != null && (dateZ = m2x.z(set2)) != null) {
                        ((lef0) jtjVar.c).m(dateZ);
                        date = dateZ;
                    }
                }
                return new Pair(setE, date);
            case 1:
                mi1 mi1Var = (mi1) this.k;
                List list = (List) this.l;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                long j2 = this.j;
                List<x2q> list2 = mi1Var.b;
                ArrayList arrayList = new ArrayList();
                for (x2q x2qVar : list2) {
                    if (Intrinsics.d(x2qVar.f40181a, "products")) {
                        x2q x2qVar2 = new x2q(x2qVar.f40181a, x2qVar.b, x2qVar.c, list);
                        if (list.isEmpty()) {
                            x2qVar = null;
                        } else {
                            x2qVar = x2qVar2;
                        }
                    } else if (x2qVar.d.isEmpty()) {
                        x2qVar = null;
                    }
                    if (x2qVar != null) {
                        arrayList.add(x2qVar);
                    }
                }
                return new mi1(j2, arrayList);
            default:
                long j3 = this.j;
                fs20 fs20Var = (fs20) this.k;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (!(fs20Var instanceof ds20) || j3 == 0 || j3 == ((zos) this.l).f44730a) {
                    return null;
                }
                return new Long(j3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wvt(Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.l = obj;
    }
}
