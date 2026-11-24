package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class p190 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public final /* synthetic */ t190 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p190(t190 t190Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.j = t190Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        t190 t190Var = this.j;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                return new p190(t190Var, yjeVar, (byte) 0).invokeSuspend(Unit.f46060a);
            default:
                return new p190(t190Var, yjeVar, (byte) 1).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        t190 t190Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                c4m0 c4m0Var = t190Var.w;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                c4m0 c4m0Var2 = t190Var.x;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                }
                break;
        }
        return Unit.f46060a;
    }
}
