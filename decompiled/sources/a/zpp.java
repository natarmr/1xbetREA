package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class zpp extends bnn0 implements ydr {
    public boolean i;
    public boolean j;
    public /* synthetic */ Throwable k;
    public /* synthetic */ long l;
    public final /* synthetic */ aqp m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpp(aqp aqpVar, yje yjeVar) {
        super(4, yjeVar);
        this.m = aqpVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        Throwable th = this.k;
        long j = this.l;
        wne wneVar = wne.f39444a;
        boolean z3 = this.j;
        if (!z3) {
            z1x.P(obj);
            th.getClass();
            z = (th instanceof zhi0) && ((zhi0) th).c == i2o.IncorrectDataError;
            if (z) {
                this.m.b.i();
            }
            if (!z || j != 0) {
                this.k = null;
                this.l = j;
                this.i = z;
                this.j = true;
                if (qcc.O(30000L, this) == wneVar) {
                    return wneVar;
                }
                z2 = z;
            }
            return Boolean.valueOf(z);
        }
        if (!z3) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z2 = this.i;
        z1x.P(obj);
        z = z2;
        return Boolean.valueOf(z);
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        zpp zppVar = new zpp(this.m, (yje) obj4);
        zppVar.k = (Throwable) obj2;
        zppVar.l = jLongValue;
        return zppVar.invokeSuspend(Unit.f46060a);
    }
}
