package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ydp extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ bep k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ydp(bep bepVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = bepVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        bep bepVar = this.k;
        switch (b) {
            case 0:
                return new ydp(bepVar, yjeVar, (byte) 0);
            default:
                ydp ydpVar = new ydp(bepVar, yjeVar, (byte) 1);
                ydpVar.j = ((Boolean) obj).booleanValue();
                return ydpVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ydp) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ydp) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        c4m0 c4m0Var;
        byte b = this.i;
        bep bepVar = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    peg0 peg0Var = bepVar.q;
                    a7p a7pVar = a7p.f382a;
                    this.j = true;
                    if (peg0Var.p(this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = bep.I;
                p7m0 p7m0Var = bepVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, e2p.a((e2p) value, false, true, false, false, false, false, null, null, null, false, 65519)));
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i2 = bep.I;
                ocj ocjVar = bepVar.i;
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, e2p.a((e2p) value2, false, false, false, false, false, false, null, null, null, z2, 32767)));
                if (z2 && ((c4m0Var = bepVar.H) == null || !c4m0Var.isActive())) {
                    bepVar.N();
                } else if (!z2 && ((e2p) bepVar.D()).c) {
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    do {
                        value3 = p7m0Var3.getValue();
                        value3.getClass();
                    } while (!p7m0Var3.m(value3, e2p.a((e2p) value3, false, false, false, true, false, false, null, null, null, false, 65467)));
                }
                return Unit.f46060a;
        }
    }
}
