package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class rpl0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xpl0 k;
    public final /* synthetic */ vne l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rpl0(xpl0 xpl0Var, vne vneVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xpl0Var;
        this.l = vneVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        vne vneVar = this.l;
        xpl0 xpl0Var = this.k;
        switch (b) {
            case 0:
                rpl0 rpl0Var = new rpl0(xpl0Var, vneVar, yjeVar, (byte) 0);
                rpl0Var.j = obj;
                return rpl0Var;
            default:
                rpl0 rpl0Var2 = new rpl0(xpl0Var, vneVar, yjeVar, (byte) 1);
                rpl0Var2.j = obj;
                return rpl0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Throwable th = (Throwable) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((rpl0) create(th, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        vne vneVar = this.l;
        xpl0 xpl0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                th.printStackTrace();
                int i = xpl0.P;
                p7m0 p7m0Var = xpl0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, hpl0.a((hpl0) value, false, false, null, null, false, null, null, null, new jhh0(th), null, null, null, null, null, null, false, 261887)));
                if (th instanceof hr30) {
                    d5c.G(vneVar, null);
                }
                break;
            default:
                Throwable th2 = (Throwable) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                th2.printStackTrace();
                int i2 = xpl0.P;
                p7m0 p7m0Var2 = xpl0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, hpl0.a((hpl0) value2, false, false, null, null, false, null, null, new jhh0(th2), null, null, null, null, null, null, null, false, 262015)));
                if (th2 instanceof hr30) {
                    d5c.G(vneVar, null);
                }
                break;
        }
        return Unit.f46060a;
    }
}
