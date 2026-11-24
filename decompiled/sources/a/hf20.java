package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class hf20 extends bnn0 implements Function2 {
    public q4f i;
    public ql5 j;
    public double k;
    public byte l;
    public final /* synthetic */ qg20 m;
    public final /* synthetic */ ytb0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf20(qg20 qg20Var, ytb0 ytb0Var, yje yjeVar) {
        super(2, yjeVar);
        this.m = qg20Var;
        this.n = ytb0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new hf20(this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((hf20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f7 A[PHI: r0 r1 r2 r4 r11
  0x00f7: PHI (r0v12 a.qg20) = (r0v10 a.qg20), (r0v20 a.qg20) binds: [B:46:0x00f4, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r1v3 a.q4f) = (r1v1 a.q4f), (r1v5 a.q4f) binds: [B:46:0x00f4, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r2v10 double) = (r2v8 double), (r2v15 double) binds: [B:46:0x00f4, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r4v3 java.lang.Object) = (r4v2 java.lang.Object), (r4v6 java.lang.Object) binds: [B:46:0x00f4, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]
  0x00f7: PHI (r11v2 a.ql5) = (r11v1 a.ql5), (r11v4 a.ql5) binds: [B:46:0x00f4, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011b, code lost:
    
        if (r0.Y(r1, r11, r2, r17.n, r17) == r7) goto L53;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.hf20.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
