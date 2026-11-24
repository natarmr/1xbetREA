package a;

import java.math.BigDecimal;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class c8u extends bnn0 implements Function2 {
    public xco i;
    public byte j;
    public final /* synthetic */ uii k;
    public final /* synthetic */ List l;
    public final /* synthetic */ List m;
    public final /* synthetic */ BigDecimal n;
    public final /* synthetic */ long o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8u(uii uiiVar, List list, List list2, BigDecimal bigDecimal, long j, long j2, long j3, yje yjeVar) {
        super(2, yjeVar);
        this.k = uiiVar;
        this.l = list;
        this.m = list2;
        this.n = bigDecimal;
        this.o = j;
        this.p = j2;
        this.q = j3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new c8u(this.k, this.l, this.m, this.n, this.o, this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c8u) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r1 == r4) goto L22;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.c8u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
