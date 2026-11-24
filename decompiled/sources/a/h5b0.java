package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class h5b0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ j5b0 k;
    public final /* synthetic */ vne l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h5b0(j5b0 j5b0Var, vne vneVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = j5b0Var;
        this.l = vneVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                h5b0 h5b0Var = new h5b0(this.k, this.l, yjeVar, (byte) 0);
                h5b0Var.j = obj;
                return h5b0Var;
            default:
                h5b0 h5b0Var2 = new h5b0(this.k, this.l, yjeVar, (byte) 1);
                h5b0Var2.j = obj;
                return h5b0Var2;
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
        return ((h5b0) create(th, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        vne vneVar = this.l;
        j5b0 j5b0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                th.printStackTrace();
                p7m0 p7m0Var = j5b0Var.m;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, vro.a((vro) value, null, new qro(th), 1)));
                if (th instanceof hr30) {
                    d5c.G(vneVar, null);
                }
                break;
            default:
                Throwable th2 = (Throwable) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                th2.printStackTrace();
                p7m0 p7m0Var2 = j5b0Var.m;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, vro.a((vro) value2, new qro(th2), null, 2)));
                if (th2 instanceof hr30) {
                    d5c.G(vneVar, null);
                }
                break;
        }
        return Unit.f46060a;
    }
}
