package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class zau0 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public final /* synthetic */ abu0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zau0(abu0 abu0Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.j = abu0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        abu0 abu0Var = this.j;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                return new zau0(abu0Var, yjeVar, (byte) 0).invokeSuspend(Unit.f46060a);
            default:
                return new zau0(abu0Var, yjeVar, (byte) 1).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        abu0 abu0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                abu0Var.z(abu0Var.C);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                abu0Var.z(abu0Var.C);
                break;
        }
        return Unit.f46060a;
    }
}
