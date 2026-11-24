package a;

/* JADX INFO: loaded from: classes3.dex */
public final class e2u implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7104a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e2u(Object obj, Object obj2, Object obj3, long j, long j2, byte b) {
        this.f7104a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = j;
        this.c = j2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:49|119|50|123|51|52|117|53|54|121|55|113|56|(0)) */
    /* JADX WARN: Code duplicated, block: B:102:0x0305  */
    /* JADX WARN: Code duplicated, block: B:105:0x0322  */
    /* JADX WARN: Code duplicated, block: B:107:0x032d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0339  */
    /* JADX WARN: Code duplicated, block: B:109:0x0348 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x034a  */
    /* JADX WARN: Code duplicated, block: B:112:0x0352  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x0227 A[Catch: all -> 0x0267, PHI: r0 r5 r6 r10 r11 r12 r13 r14 r16 r17 r19 r21 r23
  0x0227: PHI (r0v15 java.lang.Object) = (r0v32 java.lang.Object), (r0v36 java.lang.Object) binds: [B:57:0x0223, B:44:0x019b] A[DONT_GENERATE, DONT_INLINE]
  0x0227: PHI (r5v7 java.util.List) = (r5v8 java.util.List), (r5v12 java.util.List) binds: [B:57:0x0223, B:44:0x019b] A[DONT_GENERATE, DONT_INLINE]
  0x0227: PHI (r6v5 long) = (r6v6 long), (r6v9 long) binds: [B:57:0x0223, B:44:0x019b] A[DONT_GENERATE, DONT_INLINE]
  0x0227: PHI (r10v5 a.kmq) = (r10v6 a.kmq), (r10v10 a.kmq) binds: [B:57:0x0223, B:44:0x019b] A[DONT_GENERATE, DONT_INLINE]
  0x0227: PHI (r11v9 int) = (r11v10 int), (r11v14 int) binds: [B:57:0x0223, B:44:0x019b] A[DONT_GENERATE, DONT_INLINE]
  0x0227: PHI (r12v6 int) = (r12v7 int), (r12v12 int) binds: [B:57:0x0223, B:44:0x019b] A[DONT_GENERATE, DONT_INLINE]
  0x0227: PHI (r13v14 java.lang.Throwable) = (r13v15 java.lang.Throwable), (r13v19 java.lang.Throwable) binds: [B:57:0x0223, B:44:0x019b] A[DONT_GENERATE, DONT_INLINE]
  0x0227: PHI (r14v4 long) = (r14v5 long), (r14v9 long) binds: [B:57:0x0223, B:44:0x019b] A[DONT_GENERATE, DONT_INLINE]
  0x0227: PHI (r16v4 java.lang.Object) = (r16v5 java.lang.Object), (r16v7 java.lang.Object) binds: [B:57:0x0223, B:44:0x019b] A[DONT_GENERATE, DONT_INLINE]
  0x0227: PHI (r17v3 java.lang.Object) = (r17v4 java.lang.Object), (r17v8 java.lang.Object) binds: [B:57:0x0223, B:44:0x019b] A[DONT_GENERATE, DONT_INLINE]
  0x0227: PHI (r19v12 long) = (r19v13 long), (r19v16 long) binds: [B:57:0x0223, B:44:0x019b] A[DONT_GENERATE, DONT_INLINE]
  0x0227: PHI (r21v3 long) = (r21v7 long), (r21v10 long) binds: [B:57:0x0223, B:44:0x019b] A[DONT_GENERATE, DONT_INLINE]
  0x0227: PHI (r23v4 a.d2u) = (r23v9 a.d2u), (r23v11 a.d2u) binds: [B:57:0x0223, B:44:0x019b] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x0267, blocks: (B:55:0x0219, B:59:0x0227), top: B:121:0x0219 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0292 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0294  */
    /* JADX WARN: Code duplicated, block: B:81:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:83:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:84:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:87:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:90:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:92:0x02db  */
    /* JADX WARN: Code duplicated, block: B:94:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:96:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:98:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:99:0x0300  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x025f, code lost:
    
        if (r10.a(r0, r2) == r1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0267, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0268, code lost:
    
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x026a, code lost:
    
        r3 = r13;
        r13 = r0;
        r0 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0272, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0273, code lost:
    
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0276, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0279, code lost:
    
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x027d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x027e, code lost:
    
        r23 = r3;
        r21 = r8;
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0286, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0287, code lost:
    
        r21 = r8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:105:0x0322 -> B:106:0x0325). Please report as a decompilation issue!!! */
    @Override // a.kmq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r30, a.yje r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e2u.a(java.lang.Object, a.yje):java.lang.Object");
    }
}
