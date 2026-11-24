package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ou70 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public final /* synthetic */ bv70 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ou70(bv70 bv70Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.j = bv70Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        bv70 bv70Var = this.j;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                return new ou70(bv70Var, yjeVar, (byte) 0).invokeSuspend(Unit.f46060a);
            default:
                return new ou70(bv70Var, yjeVar, (byte) 1).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        bv70 bv70Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                e3c.n(bv70Var.b0);
                e3c.n(bv70Var.c0);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                int i = bv70.g0;
                p7m0 p7m0Var = bv70Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, hu70.a((hu70) value, 0, 0, false, false, false, false, false, false, false, false, "00:00", false, false, false, null, false, null, null, false, 2095103)));
                break;
        }
        return Unit.f46060a;
    }
}
