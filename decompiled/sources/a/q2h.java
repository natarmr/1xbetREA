package a;

import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class q2h extends bnn0 implements aer {
    public /* synthetic */ Object i;
    public /* synthetic */ List j;
    public /* synthetic */ wcb k;
    public /* synthetic */ String l;
    public /* synthetic */ Map m;

    public q2h(yje yjeVar) {
        super(6, yjeVar);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.i;
        List list = this.j;
        wcb wcbVar = this.k;
        String str = this.l;
        Map map = this.m;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        return new mig(obj2, list, wcbVar, str, map);
    }

    @Override // a.aer
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object obj7 = ((j0g0) obj).f15681a;
        q2h q2hVar = new q2h((yje) obj6);
        q2hVar.i = obj7;
        q2hVar.j = (List) obj2;
        q2hVar.k = (wcb) obj3;
        q2hVar.l = (String) obj4;
        q2hVar.m = (Map) obj5;
        return q2hVar.invokeSuspend(Unit.f46060a);
    }
}
