package a;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class jdn extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ sdn j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdn(sdn sdnVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = sdnVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        jdn jdnVar = new jdn(this.j, yjeVar);
        jdnVar.i = obj;
        return jdnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((jdn) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        sdn sdnVar = this.j;
        ocj ocjVar = sdnVar.i;
        Pair pair = (Pair) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        List list = (List) pair.f46059a;
        List list2 = (List) pair.b;
        xfa0 xfa0Var = new xfa0(list, list2);
        if (list.isEmpty() || list2.isEmpty()) {
            i3t0.A(sdnVar, sdnVar.s, new v030(xfa0Var), null, null, 6);
            sdnVar.w.g(idf0.f14583a);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
            } while (!p7m0Var.m(value, cdn.a((cdn) value, null, iun.f15405a, null, false, null, null, 237)));
        } else if (!xfa0Var.equals(((cdn) sdnVar.D()).f)) {
            i3t0.A(sdnVar, sdnVar.s, new v030(xfa0Var), null, null, 6);
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
            } while (!p7m0Var2.m(value2, cdn.a((cdn) value2, null, iun.f15405a, null, true, xfa0Var, null, 205)));
            sdnVar.M(false);
        } else if (xfa0Var.equals(((cdn) sdnVar.D()).f)) {
            sdnVar.M(true);
        }
        return Unit.f46060a;
    }
}
