package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class pxk extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ txk j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pxk(txk txkVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = txkVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        txk txkVar = this.j;
        switch (b) {
            case 0:
                return new pxk(txkVar, yjeVar, (byte) 0);
            case 1:
                return new pxk(txkVar, yjeVar, (byte) 1);
            default:
                return new pxk(txkVar, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((pxk) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((pxk) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((pxk) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        txk txkVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                txk txkVar2 = this.j;
                sac.V(jiu0.a(txkVar2), new y6h(1, txkVar2, txk.class, "handleSearchError", "handleSearchError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, txkVar2.d.b, new fr9(txkVar2, null, (byte) 19), 10);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                txkVar.f.f(mxk.f22559a);
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = txkVar.e;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, oxk.a((oxk) value, lak0.c)));
                break;
        }
        return Unit.f46060a;
    }
}
