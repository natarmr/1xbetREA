package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class i890 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ j890 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i890(j890 j890Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = j890Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        j890 j890Var = this.k;
        switch (b) {
            case 0:
                i890 i890Var = new i890(j890Var, yjeVar, (byte) 0);
                i890Var.j = ((Boolean) obj).booleanValue();
                return i890Var;
            case 1:
                return new i890(j890Var, yjeVar, (byte) 1);
            default:
                return new i890(j890Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((i890) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((i890) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((i890) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        d890 d890Var;
        Object value2;
        byte b = this.i;
        j890 j890Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                boolean z2 = j890Var.w;
                j890Var.w = false;
                if (z && !z2) {
                    j890Var.v = 0;
                    bby bbyVar = j890Var.u;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    sac.V(jiu0.a(j890Var), new ev80((byte) 13), null, j890Var.q.f22085a, new h890(j890Var, null, (byte) 0), 10);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(3000L, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i = j890.x;
                p7m0 p7m0Var = j890Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    d890Var = (d890) value;
                } while (!p7m0Var.m(value, d890.a(d890Var, null, d890Var.d + 1, null, false, 55)));
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(2000L, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i2 = j890.x;
                p7m0 p7m0Var2 = j890Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    j890Var.f.getClass();
                } while (!p7m0Var2.m(value2, d890.a((d890) value2, null, 0L, null, true, 31)));
                return Unit.f46060a;
        }
    }
}
