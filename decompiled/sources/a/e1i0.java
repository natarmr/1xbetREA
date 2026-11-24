package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class e1i0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ g1i0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1i0(g1i0 g1i0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = g1i0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        g1i0 g1i0Var = this.k;
        switch (b) {
            case 0:
                return new e1i0(g1i0Var, yjeVar, (byte) 0);
            default:
                e1i0 e1i0Var = new e1i0(g1i0Var, yjeVar, (byte) 1);
                e1i0Var.j = ((Boolean) obj).booleanValue();
                return e1i0Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((e1i0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((e1i0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        g1i0 g1i0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    rou rouVar = g1i0Var.x;
                    this.j = true;
                    obj = rouVar.a(false, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                m2c0 m2c0Var = (m2c0) obj;
                int i = g1i0.G;
                p7m0 p7m0Var = g1i0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, s0i0.a((s0i0) value, Long.valueOf(m2c0Var.K), m2c0Var.J, null, false, false, 25)));
                return Unit.f46060a;
            default:
                boolean z2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!g1i0Var.F && z2) {
                    g1i0Var.M();
                }
                g1i0Var.F = z2;
                return Unit.f46060a;
        }
    }
}
