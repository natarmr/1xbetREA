package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class h790 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ j790 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h790(j790 j790Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = j790Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        j790 j790Var = this.k;
        switch (b) {
            case 0:
                h790 h790Var = new h790(j790Var, yjeVar, (byte) 0);
                h790Var.j = ((Boolean) obj).booleanValue();
                return h790Var;
            default:
                return new h790(j790Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((h790) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((h790) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        j790 j790Var = this.k;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                List list = j790.F;
                oyg0 oyg0Var = j790Var.f;
                ocj ocjVar = j790Var.i;
                if (z) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, y690.a((y690) value2, x690.f40352a, 0L, false, 6)));
                    j790Var.M(j790Var.o);
                } else {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value, y690.a((y690) value, x690.c, 0L, false, 6)));
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    hse0 hse0Var = j790Var.p;
                    this.j = true;
                    if (hse0.a(hse0Var, null, true, this, 5) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                j790Var.M(j790Var.o);
                return Unit.f46060a;
        }
    }
}
