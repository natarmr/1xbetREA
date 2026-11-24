package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class itv0 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ float j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ itv0(Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = obj;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        float fFloatValue = ((Number) obj2).floatValue();
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                itv0 itv0Var = new itv0((ywv0) this.k, yjeVar, (byte) 0);
                itv0Var.j = fFloatValue;
                return itv0Var.invokeSuspend(Unit.f46060a);
            case 1:
                itv0 itv0Var2 = new itv0((ywv0) this.k, yjeVar, (byte) 1);
                itv0Var2.j = fFloatValue;
                return itv0Var2.invokeSuspend(Unit.f46060a);
            default:
                itv0 itv0Var3 = new itv0((Function1) this.k, yjeVar, (byte) 2);
                itv0Var3.j = fFloatValue;
                return itv0Var3.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                float f = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                hcp0 hcp0Var = ((ywv0) obj2).l.j;
                ((q99) hcp0Var.c).f(new qxv0(f));
                break;
            case 1:
                float f2 = this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                hcp0 hcp0Var2 = (hcp0) ((ywv0) obj2).m.e;
                ((q99) hcp0Var2.c).f(new juv0(f2));
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ((Function1) obj2).invoke(new Float(this.j));
                break;
        }
        return Unit.f46060a;
    }
}
