package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class p4z extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public Object j;
    public long k;
    public byte l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public /* synthetic */ Object r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4z(t33 t33Var, t33 t33Var2, t33 t33Var3, t33 t33Var4, p5m0 p5m0Var, zsf zsfVar, t33 t33Var5, long j, yje yjeVar) {
        super(2, yjeVar);
        this.m = t33Var;
        this.n = t33Var2;
        this.o = t33Var3;
        this.p = t33Var4;
        this.q = p5m0Var;
        this.s = zsfVar;
        this.j = t33Var5;
        this.k = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.s;
        switch (b) {
            case 0:
                p4z p4zVar = new p4z((pzu) obj2, this.k, (String) this.j, yjeVar);
                p4zVar.r = obj;
                return p4zVar;
            case 1:
                return new p4z((qg20) this.r, (Throwable) obj2, yjeVar);
            default:
                p4z p4zVar2 = new p4z((t33) this.m, (t33) this.n, (t33) this.o, (t33) this.p, (p5m0) this.q, (zsf) obj2, (t33) this.j, this.k, yjeVar);
                p4zVar2.r = obj;
                return p4zVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((p4z) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x036a  */
    /* JADX WARN: Code duplicated, block: B:101:0x036d  */
    /* JADX WARN: Code duplicated, block: B:104:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code duplicated, block: B:76:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:80:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x02de A[Catch: all -> 0x0230, PHI: r0 r3
  0x02de: PHI (r0v20 java.lang.Object) = (r0v14 java.lang.Object), (r0v40 java.lang.Object) binds: [B:79:0x02da, B:59:0x022c] A[DONT_GENERATE, DONT_INLINE]
  0x02de: PHI (r3v9 java.lang.Object) = (r3v50 java.lang.Object), (r3v51 java.lang.Object) binds: [B:79:0x02da, B:59:0x022c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0230, blocks: (B:58:0x0229, B:81:0x02de, B:78:0x02c4), top: B:107:0x01b3 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0301  */
    /* JADX WARN: Code duplicated, block: B:90:0x0315 A[PHI: r0 r1 r3 r4
  0x0315: PHI (r0v22 a.ueh) = (r0v18 a.ueh), (r0v42 a.ueh) binds: [B:88:0x0311, B:56:0x020d] A[DONT_GENERATE, DONT_INLINE]
  0x0315: PHI (r1v2 java.lang.Object) = (r1v1 java.lang.Object), (r1v11 java.lang.Object) binds: [B:88:0x0311, B:56:0x020d] A[DONT_GENERATE, DONT_INLINE]
  0x0315: PHI (r3v10 a.ljg) = (r3v49 a.ljg), (r3v21 a.ljg) binds: [B:88:0x0311, B:56:0x020d] A[DONT_GENERATE, DONT_INLINE]
  0x0315: PHI (r4v9 java.lang.Object) = (r4v7 java.lang.Object), (r4v15 java.lang.Object) binds: [B:88:0x0311, B:56:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:93:0x0329  */
    /* JADX WARN: Code duplicated, block: B:97:0x0344  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (r13.f(r31, r3) == r8) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x019b, code lost:
    
        if (r13.V(r10, r9, r3, r5, r1, r14, r8, r6, r31) == r12) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.p4z.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4z(pzu pzuVar, long j, String str, yje yjeVar) {
        super(2, yjeVar);
        this.s = pzuVar;
        this.k = j;
        this.j = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4z(qg20 qg20Var, Throwable th, yje yjeVar) {
        super(2, yjeVar);
        this.r = qg20Var;
        this.s = th;
    }
}
