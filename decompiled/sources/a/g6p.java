package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class g6p extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ k6p j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6p(k6p k6pVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = k6pVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        k6p k6pVar = this.j;
        switch (b) {
            case 0:
                return new g6p(k6pVar, yjeVar, (byte) 0);
            default:
                return new g6p(k6pVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((g6p) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((g6p) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        k6p k6pVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                c4m0 c4m0Var = k6pVar.r;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    yje yjeVar = null;
                    k6pVar.r = slb.U(new dnq(new fnq(k6pVar.n.b(), new j6p(k6pVar, yjeVar, (byte) 0), (byte) 4), new rj((Object) k6pVar, yjeVar, (byte) 23), (byte) 1), jiu0.a(k6pVar));
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = k6pVar.u;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, new d6p(k6pVar.w())));
                break;
        }
        return Unit.f46060a;
    }
}
