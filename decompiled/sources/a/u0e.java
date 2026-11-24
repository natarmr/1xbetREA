package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class u0e extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public final /* synthetic */ g1e j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0e(g1e g1eVar, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.j = g1eVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        g1e g1eVar = this.j;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                return new u0e(g1eVar, yjeVar, (byte) 0).invokeSuspend(Unit.f46060a);
            default:
                return new u0e(g1eVar, yjeVar, (byte) 1).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        g1e g1eVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                c4m0 c4m0Var = g1eVar.G;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                v3c.N(g1eVar.D);
                v3c.N(g1eVar.E);
                break;
        }
        return Unit.f46060a;
    }
}
