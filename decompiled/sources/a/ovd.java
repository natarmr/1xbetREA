package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class ovd extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public final /* synthetic */ svd j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ovd(svd svdVar, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.j = svdVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        svd svdVar = this.j;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                return new ovd(svdVar, yjeVar, (byte) 0).invokeSuspend(Unit.f46060a);
            default:
                return new ovd(svdVar, yjeVar, (byte) 1).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        svd svdVar = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                c4m0 c4m0Var = svdVar.E;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                v3c.N(svdVar.B);
                v3c.N(svdVar.C);
                break;
        }
        return Unit.f46060a;
    }
}
