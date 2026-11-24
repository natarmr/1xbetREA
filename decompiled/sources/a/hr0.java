package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class hr0 extends bnn0 implements xdr {
    public byte i;
    public /* synthetic */ kmq j;
    public final /* synthetic */ long k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr0(long j, yje yjeVar) {
        super(3, yjeVar);
        this.k = j;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        hr0 hr0Var = new hr0(this.k, (yje) obj3);
        hr0Var.j = (kmq) obj;
        return hr0Var.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        kmq kmqVar = this.j;
        wne wneVar = wne.f39444a;
        byte b = this.i;
        if (b == 0) {
            z1x.P(obj);
            nh1 nh1Var = new nh1(this.k, kotlin.collections.a.c(new ezc0("0", "ALL_FILTER_DEFAULT_CHIP", true)));
            this.j = null;
            this.i = (byte) 1;
            if (kmqVar.a(nh1Var, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (b != 1 && b != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
