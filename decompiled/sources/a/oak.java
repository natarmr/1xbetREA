package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class oak extends bnn0 implements Function2 {
    public byte i;
    public final /* synthetic */ pak j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oak(pak pakVar, int i, int i2, yje yjeVar) {
        super(2, yjeVar);
        this.j = pakVar;
        this.k = i;
        this.l = i2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new oak(this.j, this.k, this.l, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((oak) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
    
        if (a.qcc.O(3500, r8) == r2) goto L27;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.oak.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
