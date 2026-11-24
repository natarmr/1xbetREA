package a;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class xj60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ List k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj60(List list, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = list;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                xj60 xj60Var = new xj60(this.k, yjeVar, (byte) 0);
                xj60Var.j = obj;
                return xj60Var;
            default:
                xj60 xj60Var2 = new xj60(this.k, yjeVar, (byte) 1);
                xj60Var2.j = obj;
                return xj60Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xj60) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xj60) create((hzb0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        List list = this.k;
        yje yjeVar = null;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                vne vneVar = (vne) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    qjj.W(vneVar, null, null, new wj60((lge0) it.next(), yjeVar, (byte) 0), 3);
                }
                break;
            default:
                hzb0 hzb0Var = (hzb0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    qjj.W(hzb0Var, null, null, new kpb0((Object) hzb0Var, it2.next(), yjeVar, (byte) 28), 3);
                }
                break;
        }
        return Unit.f46060a;
    }
}
