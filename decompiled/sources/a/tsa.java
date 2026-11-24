package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class tsa extends bnn0 implements ydr {
    public /* synthetic */ List i;
    public /* synthetic */ int j;
    public /* synthetic */ int k;
    public final /* synthetic */ wsa l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsa(wsa wsaVar, yje yjeVar) {
        super(4, yjeVar);
        this.l = wsaVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        List list = this.i;
        int i = this.j;
        int i2 = this.k;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        wsa wsaVar = this.l;
        i3t0.A(wsaVar, wsaVar.u, new did(list), null, null, 6);
        p7m0 p7m0Var = wsaVar.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
        } while (!p7m0Var.m(value, gsa.a((gsa) value, null, null, false, list, i, i2, null, false, false, null, 3971)));
        return Unit.f46060a;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        tsa tsaVar = new tsa(this.l, (yje) obj4);
        tsaVar.i = (List) obj;
        tsaVar.j = iIntValue;
        tsaVar.k = iIntValue2;
        return tsaVar.invokeSuspend(Unit.f46060a);
    }
}
