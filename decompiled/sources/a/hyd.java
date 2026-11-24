package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class hyd extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public final /* synthetic */ kyd j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hyd(kyd kydVar, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.j = kydVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        kyd kydVar = this.j;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                return new hyd(kydVar, yjeVar, (byte) 0).invokeSuspend(Unit.f46060a);
            default:
                return new hyd(kydVar, yjeVar, (byte) 1).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        kyd kydVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                c4m0 c4m0Var = kydVar.I;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                v3c.N(kydVar.F);
                v3c.N(kydVar.E);
                v3c.N(kydVar.H);
                break;
        }
        return Unit.f46060a;
    }
}
