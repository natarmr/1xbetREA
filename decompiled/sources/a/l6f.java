package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class l6f extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public r7f j;
    public q4f k;
    public byte l;
    public final /* synthetic */ r7f m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l6f(r7f r7fVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = r7fVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        r7f r7fVar = this.m;
        switch (b) {
            case 0:
                return new l6f(r7fVar, yjeVar, (byte) 0);
            default:
                return new l6f(r7fVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((l6f) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r2.Y(r1, (java.util.List) r10, r9) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
    
        if (r3.Y(r1, (java.util.List) r10, r9) == r0) goto L42;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.l6f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
