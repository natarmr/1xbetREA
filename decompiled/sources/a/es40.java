package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class es40 extends zzf0 implements Function2 {
    public dpa0 j;
    public lie0 k;
    public byte l;
    public /* synthetic */ Object m;
    public final /* synthetic */ fs40 n;
    public final /* synthetic */ s43 o;
    public final /* synthetic */ hs40 p;
    public final /* synthetic */ gs40 q;
    public final /* synthetic */ gs40 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es40(fs40 fs40Var, s43 s43Var, hs40 hs40Var, gs40 gs40Var, gs40 gs40Var2, yje yjeVar) {
        super(2, yjeVar);
        this.n = fs40Var;
        this.o = s43Var;
        this.p = hs40Var;
        this.q = gs40Var;
        this.r = gs40Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        es40 es40Var = new es40(this.n, this.o, this.p, this.q, this.r, yjeVar);
        es40Var.m = obj;
        return es40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((es40) create((inn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0088 A[PHI: r2 r7 r9 r10
  0x0088: PHI (r2v6 a.lie0) = (r2v5 a.lie0), (r2v14 a.lie0) binds: [B:21:0x0085, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0088: PHI (r7v5 a.dpa0) = (r7v4 a.dpa0), (r7v12 a.dpa0) binds: [B:21:0x0085, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0088: PHI (r9v8 a.inn0) = (r9v7 a.inn0), (r9v10 a.inn0) binds: [B:21:0x0085, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0088: PHI (r10v2 java.lang.Object) = (r10v1 java.lang.Object), (r10v4 java.lang.Object) binds: [B:21:0x0085, B:10:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x008c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r7 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e5, code lost:
    
        if (r2 == r1) goto L30;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0085 -> B:23:0x0088). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.es40.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
