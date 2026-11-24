package a;

import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class hgg extends bnn0 implements Function1 {
    public Date i;
    public zwt j;
    public long k;
    public byte l;
    public final /* synthetic */ igg m;
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hgg(igg iggVar, int i, yje yjeVar) {
        super(1, yjeVar);
        this.m = iggVar;
        this.n = i;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new hgg(this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((hgg) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        if (r0 == r8) goto L33;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hgg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
