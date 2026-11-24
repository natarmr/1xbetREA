package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class vgc extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ xgc k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vgc(xgc xgcVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = xgcVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        xgc xgcVar = this.k;
        switch (b) {
            case 0:
                vgc vgcVar = new vgc(xgcVar, yjeVar, (byte) 0);
                vgcVar.j = obj;
                return vgcVar;
            default:
                vgc vgcVar2 = new vgc(xgcVar, yjeVar, (byte) 1);
                vgcVar2.j = obj;
                return vgcVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((vgc) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((vgc) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        xgc xgcVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                List list = (List) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = xgc.t;
                p7m0 p7m0Var = xgcVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, qgc.a((qgc) value, null, list, 1)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                int i2 = xgc.t;
                p7m0 p7m0Var2 = xgcVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, qgc.a((qgc) value2, null, iun.f15405a, 1)));
                break;
        }
        return Unit.f46060a;
    }
}
