package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class a63 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public final /* synthetic */ pz40 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a63(pz40 pz40Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.j = pz40Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        switch (this.i) {
            case 0:
                long j = ((ne60) obj2).f23370a;
                return new a63(this.j, (yje) obj3, (byte) 0).invokeSuspend(Unit.f46060a);
            case 1:
                long j2 = ((ne60) obj2).f23370a;
                return new a63(this.j, (yje) obj3, (byte) 1).invokeSuspend(Unit.f46060a);
            default:
                ((Number) obj2).floatValue();
                return new a63(this.j, (yje) obj3, (byte) 2).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pz40 pz40Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (pz40Var.getValue() != olx.c) {
                    pz40Var.setValue(olx.b);
                }
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                pz40Var.setValue(Boolean.TRUE);
                break;
            default:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                pz40Var.setValue(Boolean.FALSE);
                break;
        }
        return Unit.f46060a;
    }
}
