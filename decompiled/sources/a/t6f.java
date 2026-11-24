package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class t6f extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 0;
    public int j;
    public int k;
    public byte l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6f(int i, int i2, r7f r7fVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = i;
        this.k = i2;
        this.n = r7fVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new t6f(this.j, this.k, (r7f) this.n, yjeVar);
            default:
                t6f t6fVar = new t6f((g670) this.s, yjeVar);
                t6fVar.r = obj;
                return t6fVar;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((t6f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((t6f) create((prs0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0210  */
    /* JADX WARN: Code duplicated, block: B:132:0x030f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0331  */
    /* JADX WARN: Code duplicated, block: B:140:0x0355  */
    /* JADX WARN: Code duplicated, block: B:51:0x012b  */
    /* JADX WARN: Code duplicated, block: B:52:0x012d A[Catch: all -> 0x0058, PHI: r0 r1 r6 r10 r12 r13 r14
  0x012d: PHI (r0v41 ??) = (r0v62 ??), (r0v63 ??) binds: [B:50:0x0129, B:23:0x0095] A[DONT_GENERATE, DONT_INLINE]
  0x012d: PHI (r1v37 a.gz60) = (r1v39 a.gz60), (r1v48 a.gz60) binds: [B:50:0x0129, B:23:0x0095] A[DONT_GENERATE, DONT_INLINE]
  0x012d: PHI (r6v16 java.lang.Object) = (r6v18 java.lang.Object), (r6v28 java.lang.Object) binds: [B:50:0x0129, B:23:0x0095] A[DONT_GENERATE, DONT_INLINE]
  0x012d: PHI (r10v21 a.qz40) = (r10v23 a.qz40), (r10v29 a.qz40) binds: [B:50:0x0129, B:23:0x0095] A[DONT_GENERATE, DONT_INLINE]
  0x012d: PHI (r12v6 java.lang.String) = (r12v8 java.lang.String), (r12v14 java.lang.String) binds: [B:50:0x0129, B:23:0x0095] A[DONT_GENERATE, DONT_INLINE]
  0x012d: PHI (r13v5 a.g670) = (r13v21 a.g670), (r13v22 a.g670) binds: [B:50:0x0129, B:23:0x0095] A[DONT_GENERATE, DONT_INLINE]
  0x012d: PHI (r14v5 java.lang.Object) = (r14v13 java.lang.Object), (r14v15 java.lang.Object) binds: [B:50:0x0129, B:23:0x0095] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0058, blocks: (B:14:0x0051, B:70:0x018d, B:72:0x0193, B:84:0x01cb, B:93:0x01e2, B:95:0x01f7, B:49:0x010c, B:52:0x012d, B:54:0x0135, B:60:0x0145, B:64:0x0168, B:66:0x0170, B:75:0x019d, B:76:0x01a1, B:78:0x01a7, B:19:0x0071, B:22:0x0092, B:25:0x009d, B:40:0x00da, B:48:0x00f7, B:34:0x00c3, B:36:0x00c9, B:41:0x00e1, B:43:0x00e7), top: B:146:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0135 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:14:0x0051, B:70:0x018d, B:72:0x0193, B:84:0x01cb, B:93:0x01e2, B:95:0x01f7, B:49:0x010c, B:52:0x012d, B:54:0x0135, B:60:0x0145, B:64:0x0168, B:66:0x0170, B:75:0x019d, B:76:0x01a1, B:78:0x01a7, B:19:0x0071, B:22:0x0092, B:25:0x009d, B:40:0x00da, B:48:0x00f7, B:34:0x00c3, B:36:0x00c9, B:41:0x00e1, B:43:0x00e7), top: B:146:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0142  */
    /* JADX WARN: Code duplicated, block: B:60:0x0145 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:14:0x0051, B:70:0x018d, B:72:0x0193, B:84:0x01cb, B:93:0x01e2, B:95:0x01f7, B:49:0x010c, B:52:0x012d, B:54:0x0135, B:60:0x0145, B:64:0x0168, B:66:0x0170, B:75:0x019d, B:76:0x01a1, B:78:0x01a7, B:19:0x0071, B:22:0x0092, B:25:0x009d, B:40:0x00da, B:48:0x00f7, B:34:0x00c3, B:36:0x00c9, B:41:0x00e1, B:43:0x00e7), top: B:146:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x015f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0161  */
    /* JADX WARN: Code duplicated, block: B:66:0x0170 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:14:0x0051, B:70:0x018d, B:72:0x0193, B:84:0x01cb, B:93:0x01e2, B:95:0x01f7, B:49:0x010c, B:52:0x012d, B:54:0x0135, B:60:0x0145, B:64:0x0168, B:66:0x0170, B:75:0x019d, B:76:0x01a1, B:78:0x01a7, B:19:0x0071, B:22:0x0092, B:25:0x009d, B:40:0x00da, B:48:0x00f7, B:34:0x00c3, B:36:0x00c9, B:41:0x00e1, B:43:0x00e7), top: B:146:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x018a  */
    /* JADX WARN: Code duplicated, block: B:69:0x018c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0193 A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:14:0x0051, B:70:0x018d, B:72:0x0193, B:84:0x01cb, B:93:0x01e2, B:95:0x01f7, B:49:0x010c, B:52:0x012d, B:54:0x0135, B:60:0x0145, B:64:0x0168, B:66:0x0170, B:75:0x019d, B:76:0x01a1, B:78:0x01a7, B:19:0x0071, B:22:0x0092, B:25:0x009d, B:40:0x00da, B:48:0x00f7, B:34:0x00c3, B:36:0x00c9, B:41:0x00e1, B:43:0x00e7), top: B:146:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x019d A[Catch: all -> 0x0058, TryCatch #0 {all -> 0x0058, blocks: (B:14:0x0051, B:70:0x018d, B:72:0x0193, B:84:0x01cb, B:93:0x01e2, B:95:0x01f7, B:49:0x010c, B:52:0x012d, B:54:0x0135, B:60:0x0145, B:64:0x0168, B:66:0x0170, B:75:0x019d, B:76:0x01a1, B:78:0x01a7, B:19:0x0071, B:22:0x0092, B:25:0x009d, B:40:0x00da, B:48:0x00f7, B:34:0x00c3, B:36:0x00c9, B:41:0x00e1, B:43:0x00e7), top: B:146:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f7 A[Catch: all -> 0x0058, TRY_LEAVE, TryCatch #0 {all -> 0x0058, blocks: (B:14:0x0051, B:70:0x018d, B:72:0x0193, B:84:0x01cb, B:93:0x01e2, B:95:0x01f7, B:49:0x010c, B:52:0x012d, B:54:0x0135, B:60:0x0145, B:64:0x0168, B:66:0x0170, B:75:0x019d, B:76:0x01a1, B:78:0x01a7, B:19:0x0071, B:22:0x0092, B:25:0x009d, B:40:0x00da, B:48:0x00f7, B:34:0x00c3, B:36:0x00c9, B:41:0x00e1, B:43:0x00e7), top: B:146:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01fc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40, types: [int] */
    /* JADX WARN: Type inference failed for: r0v41, types: [int] */
    /* JADX WARN: Type inference failed for: r0v42, types: [int] */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r0v58 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v62 */
    /* JADX WARN: Type inference failed for: r0v63 */
    /* JADX WARN: Type inference failed for: r0v64 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x018c -> B:70:0x018d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x01c4 -> B:84:0x01cb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.zw5
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.t6f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6f(g670 g670Var, yje yjeVar) {
        super(2, yjeVar);
        this.s = g670Var;
    }
}
