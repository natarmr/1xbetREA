package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class nlb extends bnn0 implements Function1 {
    public byte i;
    public final /* synthetic */ plb j;
    public final /* synthetic */ long k;
    public final /* synthetic */ Long l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlb(plb plbVar, long j, Long l, yje yjeVar) {
        super(1, yjeVar);
        this.j = plbVar;
        this.k = j;
        this.l = l;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new nlb(this.j, this.k, this.l, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((nlb) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        if (r14 == r3) goto L25;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nlb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
