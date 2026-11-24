package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class jnq extends bnn0 implements ydr {
    public boolean i;
    public /* synthetic */ Throwable j;
    public /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ Function2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jnq(long j, Function2 function2, yje yjeVar) {
        super(4, yjeVar);
        this.l = j;
        this.m = function2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.j;
        long j = this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            if (j < this.l) {
                this.j = null;
                this.k = j;
                this.i = true;
                obj = this.m.invoke(th, this);
                if (obj == wneVar) {
                    return wneVar;
                }
            }
            return Boolean.valueOf(z);
        }
        if (!z) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        boolean z2 = ((Boolean) obj).booleanValue();
        return Boolean.valueOf(z2);
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        jnq jnqVar = new jnq(this.l, this.m, (yje) obj4);
        jnqVar.j = (Throwable) obj2;
        jnqVar.k = jLongValue;
        return jnqVar.invokeSuspend(Unit.f46060a);
    }
}
