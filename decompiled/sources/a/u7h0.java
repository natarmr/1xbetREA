package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class u7h0 extends bnn0 implements ydr {
    public boolean i;
    public /* synthetic */ Throwable j;
    public /* synthetic */ long k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7h0(boolean z, yje yjeVar) {
        super(4, yjeVar);
        this.l = z;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.j;
        long j = this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        boolean z2 = true;
        if (!z) {
            z1x.P(obj);
            boolean z3 = !hic.C(th);
            if (th instanceof zhi0) {
                zhi0 zhi0Var = (zhi0) th;
                if (this.l) {
                    z3 = zhi0Var.f || zhi0Var.e;
                } else {
                    z3 = zhi0Var.e;
                }
            }
            if (z3) {
                return Boolean.FALSE;
            }
            if (j < 3) {
                uen uenVar = wen.b;
                long jW0 = ibc.w0(3L, bfn.SECONDS);
                this.j = null;
                this.k = j;
                this.i = true;
                if (qcc.P(jW0, this) == wneVar) {
                    return wneVar;
                }
            } else {
                z2 = false;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Boolean.valueOf(z2);
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        u7h0 u7h0Var = new u7h0(this.l, (yje) obj4);
        u7h0Var.j = (Throwable) obj2;
        u7h0Var.k = jLongValue;
        return u7h0Var.invokeSuspend(Unit.f46060a);
    }
}
