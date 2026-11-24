package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class qne extends bnn0 implements ydr {
    public boolean i;
    public /* synthetic */ Throwable j;
    public /* synthetic */ long k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ Function0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qne(Function1 function1, Function0 function0, yje yjeVar) {
        super(4, yjeVar);
        this.l = function1;
        this.m = function0;
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
            if (j == 0 && ((Boolean) this.l.invoke(th)).booleanValue()) {
                this.m.invoke();
                this.j = null;
                this.k = j;
                this.i = true;
                if (qcc.O(8000L, this) == wneVar) {
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
        qne qneVar = new qne(this.l, this.m, (yje) obj4);
        qneVar.j = (Throwable) obj2;
        qneVar.k = jLongValue;
        return qneVar.invokeSuspend(Unit.f46060a);
    }
}
