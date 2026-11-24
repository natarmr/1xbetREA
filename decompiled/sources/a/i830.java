package a;

import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class i830 extends bnn0 implements xdr {
    public final /* synthetic */ l830 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i830(l830 l830Var, yje yjeVar) {
        super(3, yjeVar);
        this.i = l830Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        return new i830(this.i, (yje) obj3).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        m730 m730Var;
        LinkedHashMap linkedHashMap;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        l830 l830Var = this.i;
        l830Var.u.g(idf0.f14583a);
        l830Var.q.b(lx7.f20801a);
        p7m0 p7m0Var = l830Var.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            m730Var = (m730) value;
            linkedHashMap = new LinkedHashMap(m730Var.b);
            linkedHashMap.put(Long.valueOf(l830Var.x.c), yw7.f43357a);
        } while (!p7m0Var.m(value, m730.a(m730Var, null, linkedHashMap, null, 0L, null, null, 253)));
        return Unit.f46060a;
    }
}
