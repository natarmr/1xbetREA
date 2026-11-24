package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class e2c extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public long j;
    public byte k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public Object n;
    public Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2c(long j, m2c m2cVar, yje yjeVar, boolean z, boolean z2) {
        super(2, yjeVar);
        this.p = m2cVar;
        this.j = j;
        this.l = z;
        this.m = z2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                e2c e2cVar = new e2c(this.j, (m2c) obj2, yjeVar, this.l, this.m);
                e2cVar.o = obj;
                return e2cVar;
            default:
                return new e2c((r7f) obj2, this.l, this.m, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((e2c) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((e2c) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006f  */
    /* JADX WARN: Code duplicated, block: B:17:0x007a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0086  */
    /* JADX WARN: Code duplicated, block: B:21:0x0093  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cb A[PHI: r1 r2 r4 r6
  0x00cb: PHI (r1v4 java.lang.Object) = (r1v3 java.lang.Object), (r1v9 java.lang.Object) binds: [B:36:0x00c8, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r2v32 long) = (r2v28 long), (r2v33 long) binds: [B:36:0x00c8, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r4v13 java.util.List) = (r4v11 java.util.List), (r4v16 java.util.List) binds: [B:36:0x00c8, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r6v23 a.q4f) = (r6v20 a.q4f), (r6v24 a.q4f) binds: [B:36:0x00c8, B:9:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:50:0x011e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0126  */
    /* JADX WARN: Code duplicated, block: B:54:0x0134  */
    /* JADX WARN: Code duplicated, block: B:57:0x0147  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ae  */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02ba, code lost:
    
        if (r2 == r5) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0303, code lost:
    
        if (r2 == r5) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0324, code lost:
    
        if (r0.a(r3, r28) == r5) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0102, code lost:
    
        if (r0 == r12) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b0, code lost:
    
        if (r0 == r12) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01bf, code lost:
    
        if (r14.s0(r28, r1, r11) == r12) goto L83;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e2c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2c(r7f r7fVar, boolean z, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.p = r7fVar;
        this.l = z;
        this.m = z2;
    }
}
