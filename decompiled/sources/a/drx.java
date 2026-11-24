package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class drx extends bnn0 implements xdr {
    public boolean i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ tzi l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ List n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drx(yje yjeVar, tzi tziVar, boolean z, List list, boolean z2, long j) {
        super(3, yjeVar);
        this.l = tziVar;
        this.m = z;
        this.n = list;
        this.o = z2;
        this.p = j;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        drx drxVar = new drx((yje) obj3, this.l, this.m, this.n, this.o, this.p);
        drxVar.j = (kmq) obj;
        drxVar.k = obj2;
        return drxVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = this.j;
            jvn jvnVar = (jvn) this.k;
            vsg0 vsg0Var = new vsg0(new crx(this.l, this.m, this.n, this.o, this.p, jvnVar, null));
            this.j = null;
            this.k = null;
            this.i = true;
            if (slb.Q(kmqVar, vsg0Var, this) == wneVar) {
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
    }
}
