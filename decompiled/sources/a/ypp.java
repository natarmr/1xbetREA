package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class ypp extends bnn0 implements Function2 {
    public boolean i;
    public long j;
    public byte k;
    public final /* synthetic */ aqp l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ypp(aqp aqpVar, long j, long j2, yje yjeVar) {
        super(2, yjeVar);
        this.l = aqpVar;
        this.m = j;
        this.n = j2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new ypp(this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ypp) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r0 == r5) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f9, code lost:
    
        if (r0 == r5) goto L46;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ypp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
