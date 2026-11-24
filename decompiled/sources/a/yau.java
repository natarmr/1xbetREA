package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class yau extends bnn0 implements xdr {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yau(long j, yje yjeVar) {
        super(3, yjeVar);
        this.l = j;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        kmq kmqVar = (kmq) obj;
        switch (this.i) {
            case 0:
                yau yauVar = new yau(this.l, (yje) obj3);
                yauVar.k = kmqVar;
                return yauVar.invokeSuspend(Unit.f46060a);
            default:
                long jLongValue = ((Number) obj2).longValue();
                yau yauVar2 = new yau(3, (yje) obj3);
                yauVar2.k = kmqVar;
                yauVar2.l = jLongValue;
                return yauVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                kmq kmqVar = this.k;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    mi1 mi1Var = new mi1(this.l, iun.f15405a);
                    this.k = null;
                    this.j = true;
                    if (kmqVar.a(mi1Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                kmq kmqVar2 = this.k;
                long j = this.l;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    Long l = new Long(j);
                    this.k = null;
                    this.l = j;
                    this.j = true;
                    if (kmqVar2.a(l, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Boolean.valueOf(j >= 0);
        }
    }

    public /* synthetic */ yau(int i, yje yjeVar) {
        super(i, yjeVar);
    }
}
