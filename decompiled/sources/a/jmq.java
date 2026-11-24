package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class jmq extends bnn0 implements ydr {
    public byte i;
    public /* synthetic */ Throwable j;
    public /* synthetic */ long k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ List m;
    public final /* synthetic */ List n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmq(Function1 function1, List list, List list2, yje yjeVar) {
        super(4, yjeVar);
        this.l = function1;
        this.m = list;
        this.n = list2;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (a.qcc.O(3000, r19) == r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e6, code lost:
    
        if (a.qcc.O(3000, r19) == r4) goto L48;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jmq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        List list = this.m;
        List list2 = this.n;
        jmq jmqVar = new jmq(this.l, list, list2, (yje) obj4);
        jmqVar.j = (Throwable) obj2;
        jmqVar.k = jLongValue;
        return jmqVar.invokeSuspend(Unit.f46060a);
    }
}
