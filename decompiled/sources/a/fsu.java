package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class fsu extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 4;
    public byte j;
    public /* synthetic */ Object k;
    public long l;
    public final /* synthetic */ boolean m;
    public long n;
    public Object o;
    public Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsu(long j, yn00 yn00Var, boolean z, long j2, yje yjeVar) {
        super(2, yjeVar);
        this.l = j;
        this.q = yn00Var;
        this.m = z;
        this.n = j2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        boolean z = this.m;
        Object obj2 = this.q;
        switch (b) {
            case 0:
                fsu fsuVar = new fsu((wdu) this.p, z, (String) obj2, yjeVar);
                fsuVar.k = obj;
                return fsuVar;
            case 1:
                fsu fsuVar2 = new fsu((ywq0) obj2, this.l, this.m, this.n, yjeVar);
                fsuVar2.k = obj;
                return fsuVar2;
            case 2:
                fsu fsuVar3 = new fsu((qgd) obj2, this.l, this.n, this.m, yjeVar);
                fsuVar3.k = obj;
                return fsuVar3;
            case 3:
                fsu fsuVar4 = new fsu(z, (wdu) this.p, (Function1) obj2, yjeVar);
                fsuVar4.k = obj;
                return fsuVar4;
            default:
                fsu fsuVar5 = new fsu(this.l, (yn00) obj2, this.m, this.n, yjeVar);
                fsuVar5.k = obj;
                return fsuVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((fsu) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d3 A[PHI: r0 r1 r6 r11
  0x00d3: PHI (r0v71 a.pmi) = (r0v67 a.pmi), (r0v80 a.pmi) binds: [B:28:0x00d0, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r1v32 java.lang.Object) = (r1v30 java.lang.Object), (r1v35 java.lang.Object) binds: [B:28:0x00d0, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r6v2 a.fsu) = (r6v1 a.fsu), (r6v0 a.fsu) binds: [B:28:0x00d0, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r11v6 a.ql5) = (r11v5 a.ql5), (r11v7 a.ql5) binds: [B:28:0x00d0, B:10:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:37:0x010a A[PHI: r0 r1 r6
  0x010a: PHI (r0v84 a.dqr) = (r0v81 a.dqr), (r0v88 a.dqr) binds: [B:35:0x0107, B:8:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x010a: PHI (r1v39 a.ql5) = (r1v36 a.ql5), (r1v43 a.ql5) binds: [B:35:0x0107, B:8:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x010a: PHI (r6v4 a.fsu) = (r6v3 a.fsu), (r6v0 a.fsu) binds: [B:35:0x0107, B:8:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x03e0, code lost:
    
        if (a.slb.Q(r0, r1, r6) == r8) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0470, code lost:
    
        if (a.slb.Q(r8, (a.gmq) r0, r6) == r9) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        if (r0 == r8) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        if (r0 == r8) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0124, code lost:
    
        if (r15.a(r2, r6) == r8) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01f0, code lost:
    
        if (a.slb.Q(r7, r0, r6) == r8) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02e7, code lost:
    
        if (a.slb.Q(r0, r1, r6) == r7) goto L92;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fsu.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsu(qgd qgdVar, long j, long j2, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.q = qgdVar;
        this.l = j;
        this.n = j2;
        this.m = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsu(wdu wduVar, boolean z, String str, yje yjeVar) {
        super(2, yjeVar);
        this.p = wduVar;
        this.m = z;
        this.q = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsu(ywq0 ywq0Var, long j, boolean z, long j2, yje yjeVar) {
        super(2, yjeVar);
        this.q = ywq0Var;
        this.l = j;
        this.m = z;
        this.n = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsu(boolean z, wdu wduVar, Function1 function1, yje yjeVar) {
        super(2, yjeVar);
        this.m = z;
        this.p = wduVar;
        this.q = function1;
    }
}
