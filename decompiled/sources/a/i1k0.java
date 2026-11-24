package a;

/* JADX INFO: loaded from: classes3.dex */
public final class i1k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i9u f14003a;
    public final b3c b;
    public final sjl0 c;
    public final q0u d;

    public i1k0(i9u i9uVar, b3c b3cVar, sjl0 sjl0Var, q0u q0uVar) {
        b3cVar.getClass();
        q0uVar.getClass();
        this.f14003a = i9uVar;
        this.b = b3cVar;
        this.c = sjl0Var;
        this.d = q0uVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:30:0x00db  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:41:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:45:0x0108  */
    /* JADX WARN: Code duplicated, block: B:47:0x010e A[PHI: r4 r5 r6 r9 r10 r12 r16
  0x010e: PHI (r4v17 java.util.Collection) = (r4v8 java.util.Collection), (r4v19 java.util.Collection) binds: [B:43:0x0105, B:46:0x010b] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r5v10 java.util.Collection) = (r5v4 java.util.Collection), (r5v13 java.util.Collection) binds: [B:43:0x0105, B:46:0x010b] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r6v12 a.j1k0) = (r6v4 a.j1k0), (r6v14 a.j1k0) binds: [B:43:0x0105, B:46:0x010b] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r9v18 boolean) = (r9v3 boolean), (r9v19 boolean) binds: [B:43:0x0105, B:46:0x010b] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r10v13 byte) = (r10v3 byte), (r10v14 byte) binds: [B:43:0x0105, B:46:0x010b] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r12v10 java.util.Iterator) = (r12v3 java.util.Iterator), (r12v14 java.util.Iterator) binds: [B:43:0x0105, B:46:0x010b] A[DONT_GENERATE, DONT_INLINE]
  0x010e: PHI (r16v7 long) = (r16v3 long), (r16v8 long) binds: [B:43:0x0105, B:46:0x010b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x0251  */
    /* JADX WARN: Code duplicated, block: B:59:0x025d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0269  */
    /* JADX WARN: Code duplicated, block: B:64:0x0271 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x0275  */
    /* JADX WARN: Code duplicated, block: B:69:0x0288  */
    /* JADX WARN: Code duplicated, block: B:70:0x028a  */
    /* JADX WARN: Code duplicated, block: B:74:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v9, types: [a.d0t, a.j1k0, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v12, types: [int] */
    /* JADX WARN: Type inference failed for: r4v16, types: [int] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x02bc -> B:75:0x02c4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.util.List r77, a.zje r78) {
        /*
            Method dump skipped, instruction units count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i1k0.a(java.util.List, a.zje):java.lang.Object");
    }
}
