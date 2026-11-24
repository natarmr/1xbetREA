package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class yvu extends bnn0 implements ydr {
    public int i;
    public int j;
    public int k;
    public boolean l;
    public byte m;
    public /* synthetic */ Throwable n;
    public /* synthetic */ long o;
    public final /* synthetic */ pwi p;
    public final /* synthetic */ xvu q;
    public final /* synthetic */ u5u r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvu(pwi pwiVar, xvu xvuVar, u5u u5uVar, boolean z, yje yjeVar) {
        super(4, yjeVar);
        this.p = pwiVar;
        this.q = xvuVar;
        this.r = u5uVar;
        this.s = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (a.qcc.P(r7, r17) == r4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x010f, code lost:
    
        if (a.qcc.P(r6, r17) == r4) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x017b, code lost:
    
        if (a.qcc.P(r6, r17) == r4) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yvu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        u5u u5uVar = this.r;
        boolean z = this.s;
        yvu yvuVar = new yvu(this.p, this.q, u5uVar, z, (yje) obj4);
        yvuVar.n = (Throwable) obj2;
        yvuVar.o = jLongValue;
        return yvuVar.invokeSuspend(Unit.f46060a);
    }
}
