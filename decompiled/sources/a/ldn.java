package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ldn extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ sdn k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ldn(sdn sdnVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = sdnVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        sdn sdnVar = this.k;
        switch (b) {
            case 0:
                return new ldn(sdnVar, yjeVar, (byte) 0);
            default:
                return new ldn(sdnVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ldn) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ldn) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        sdn sdnVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    clc clcVar = sdnVar.x;
                    this.j = true;
                    ((adn) clcVar.b).f687a.b.n(null);
                    if (Unit.f46060a == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(120000L, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = sdn.B;
                bby bbyVar = sdnVar.A;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                sdnVar.A = null;
                sdnVar.w.g(idf0.f14583a);
                p7m0 p7m0Var = sdnVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    sdnVar.f.getClass();
                } while (!p7m0Var.m(value, cdn.a((cdn) value, null, iun.f15405a, null, false, null, null, 237)));
                return Unit.f46060a;
        }
    }
}
