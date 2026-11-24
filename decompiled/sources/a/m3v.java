package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class m3v extends bnn0 implements xdr {
    public boolean i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ nc0 l;
    public final /* synthetic */ long m;
    public final /* synthetic */ int n;
    public final /* synthetic */ byte o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m3v(yje yjeVar, nc0 nc0Var, long j, int i, int i2) {
        super(3, yjeVar);
        this.l = nc0Var;
        this.m = j;
        this.n = i;
        this.o = i2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        m3v m3vVar = new m3v((yje) obj3, this.l, this.m, this.n, this.o);
        m3vVar.j = (kmq) obj;
        m3vVar.k = obj2;
        return m3vVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = this.j;
            Object obj2 = ((j0g0) this.k).f15681a;
            nc0 nc0Var = this.l;
            q3v q3vVar = new q3v(((eat0) ((epi0) ((uyn) nc0Var.j).f36498a).b).f7486a, nc0Var, this.m, this.n, this.o, obj2);
            this.j = null;
            this.k = null;
            this.i = true;
            if (slb.Q(kmqVar, q3vVar, this) == wneVar) {
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
