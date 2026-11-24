package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class f0l extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public n0l j;
    public byte k;
    public final /* synthetic */ l0l l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0l(l0l l0lVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = l0lVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new f0l(this.l, yjeVar, (byte) 0);
            default:
                return new f0l(this.l, yjeVar, (byte) 1);
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
        return ((f0l) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x010c A[PHI: r0
  0x010c: PHI (r0v11 a.n0l) = (r0v10 a.n0l), (r0v14 a.n0l) binds: [B:49:0x0109, B:38:0x00ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0120  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
    
        if (r14.f(a.my5.f22588a, r10) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012a, code lost:
    
        if (r14.a(true, r13) == r13) goto L56;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f0l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
