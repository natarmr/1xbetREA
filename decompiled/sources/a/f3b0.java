package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class f3b0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ v3b0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3b0(v3b0 v3b0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = v3b0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        v3b0 v3b0Var = this.k;
        switch (b) {
            case 0:
                f3b0 f3b0Var = new f3b0(v3b0Var, yjeVar, (byte) 0);
                f3b0Var.j = obj;
                return f3b0Var;
            default:
                f3b0 f3b0Var2 = new f3b0(v3b0Var, yjeVar, (byte) 1);
                f3b0Var2.j = obj;
                return f3b0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((f3b0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((f3b0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        v3b0 v3b0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                uaq0 uaq0Var = (uaq0) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = v3b0.W;
                p7m0 p7m0Var = v3b0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    uaq0.f35345a.getClass();
                } while (!p7m0Var.m(value, u2b0.a((u2b0) value, false, false, s9m0.l(uaq0Var), false, null, null, null, 4087)));
                break;
            default:
                List list = (List) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    axq.t(((mlr) it.next()).f22006a, arrayList);
                }
                Set setP0 = CollectionsKt.P0(arrayList);
                int i2 = v3b0.W;
                p7m0 p7m0Var2 = v3b0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, u2b0.a((u2b0) value2, false, false, false, false, setP0, null, null, 3583)));
                break;
        }
        return Unit.f46060a;
    }
}
