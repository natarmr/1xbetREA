package a;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class mlu extends bnn0 implements zdr {
    public /* synthetic */ List i;
    public /* synthetic */ List j;
    public /* synthetic */ List k;
    public /* synthetic */ List l;
    public final /* synthetic */ Map m;
    public final /* synthetic */ boolean n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mlu(Map map, boolean z, yje yjeVar) {
        super(5, yjeVar);
        this.m = map;
        this.n = z;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        mlu mluVar = new mlu(this.m, this.n, (yje) obj5);
        mluVar.i = (List) obj;
        mluVar.j = (List) obj2;
        mluVar.k = (List) obj3;
        mluVar.l = (List) obj4;
        return mluVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        List list = this.i;
        List list2 = this.j;
        List list3 = this.k;
        List list4 = this.l;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        jo20 jo20Var = new jo20();
        boolean z = this.n;
        if (z) {
            jo20Var.put(r040.TOP, list3);
        }
        jo20 jo20VarB = jo20Var.b();
        jo20 jo20Var2 = new jo20();
        if (z) {
            jo20Var2.put(r040.OTHER, list);
        }
        jo20 jo20VarB2 = jo20Var2.b();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : (ko20) jo20VarB2.entrySet()) {
            if (!((List) entry.getValue()).isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return xp20.j(xp20.j(jo20VarB, this.m), linkedHashMap);
    }
}
