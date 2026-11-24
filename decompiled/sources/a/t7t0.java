package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class t7t0 extends bnn0 implements ydr {
    public boolean i;
    public /* synthetic */ Throwable j;
    public /* synthetic */ long k;

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            Throwable th = this.j;
            long j = this.k;
            wv00.f().e(u7t0.f35202a, "Cannot check for unfinished work", th);
            long jMin = Math.min(j * 30000, u7t0.b);
            this.i = true;
            if (qcc.O(jMin, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Boolean.TRUE;
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        t7t0 t7t0Var = new t7t0(4, (yje) obj4);
        t7t0Var.j = (Throwable) obj2;
        t7t0Var.k = jLongValue;
        return t7t0Var.invokeSuspend(Unit.f46060a);
    }
}
