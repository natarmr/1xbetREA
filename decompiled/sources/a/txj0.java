package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class txj0 extends bnn0 implements Function2 {
    public double i;
    public m97 j;
    public long k;
    public boolean l;
    public byte m;
    public final /* synthetic */ xxj0 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txj0(xxj0 xxj0Var, boolean z, boolean z2, boolean z3, String str, yje yjeVar) {
        super(2, yjeVar);
        this.n = xxj0Var;
        this.o = z;
        this.p = z2;
        this.q = z3;
        this.r = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new txj0(this.n, this.o, this.p, this.q, this.r, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((txj0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004a A[PHI: r2 r3 r11 r14
  0x004a: PHI (r2v28 boolean) = (r2v20 boolean), (r2v35 boolean) binds: [B:47:0x00f9, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x004a: PHI (r3v5 java.lang.Object) = (r3v3 java.lang.Object), (r3v12 java.lang.Object) binds: [B:47:0x00f9, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x004a: PHI (r11v2 long) = (r11v1 long), (r11v5 long) binds: [B:47:0x00f9, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x004a: PHI (r14v4 double) = (r14v3 double), (r14v6 double) binds: [B:47:0x00f9, B:13:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:52:0x0154  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0176, code lost:
    
        if (r0.D((a.pa20) r0, r31.q, r7, r31.r, r1, r31) == r9) goto L55;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.txj0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
