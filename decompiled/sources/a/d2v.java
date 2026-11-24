package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class d2v extends bnn0 implements xdr {
    public boolean i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ zpu l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2v(yje yjeVar, zpu zpuVar, boolean z, boolean z2, boolean z3) {
        super(3, yjeVar);
        this.l = zpuVar;
        this.m = z;
        this.n = z2;
        this.o = z3;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        d2v d2vVar = new d2v((yje) obj3, this.l, this.m, this.n, this.o);
        d2vVar.j = (kmq) obj;
        d2vVar.k = obj2;
        return d2vVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = this.j;
            boolean zBooleanValue = ((Boolean) this.k).booleanValue();
            utb utbVarV = ((rrd) this.l.b).v(this.m, zBooleanValue, this.n, this.o, null);
            this.j = null;
            this.k = null;
            this.i = true;
            if (slb.Q(kmqVar, utbVarV, this) == wneVar) {
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
