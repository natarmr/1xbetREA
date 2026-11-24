package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class l7c extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public /* synthetic */ long j;
    public final /* synthetic */ v7c k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7c(v7c v7cVar, long j, yje yjeVar) {
        super(2, yjeVar);
        this.k = v7cVar;
        this.j = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        v7c v7cVar = this.k;
        switch (b) {
            case 0:
                return new l7c(v7cVar, this.j, yjeVar);
            default:
                l7c l7cVar = new l7c(v7cVar, yjeVar);
                l7cVar.j = ((Number) obj).longValue();
                return l7cVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((l7c) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((l7c) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        v7c v7cVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                v7cVar.t.M(this.j);
                break;
            default:
                long j = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                long j2 = j / 1000;
                p7m0 p7m0Var = v7cVar.O;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, j2 == 0 ? o6c.f24727a : new q6c(j2)));
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7c(v7c v7cVar, yje yjeVar) {
        super(2, yjeVar);
        this.k = v7cVar;
    }
}
