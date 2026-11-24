package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class y5v extends bnn0 implements Function2 {
    public b6v i;
    public List j;
    public y5v k;
    public Throwable l;
    public long m;
    public long n;
    public int o;
    public int p;
    public int q;
    public byte r;
    public /* synthetic */ Object s;
    public final /* synthetic */ b6v t;
    public final /* synthetic */ List u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5v(b6v b6vVar, List list, yje yjeVar) {
        super(2, yjeVar);
        this.t = b6vVar;
        this.u = list;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        y5v y5vVar = new y5v(this.t, this.u, yjeVar);
        y5vVar.s = obj;
        return y5vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y5v) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a1 A[Catch: all -> 0x0082, TRY_ENTER, TryCatch #0 {all -> 0x0082, blocks: (B:28:0x00a1, B:31:0x00c1, B:20:0x007c), top: B:76:0x0010, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1 A[Catch: all -> 0x0082, PHI: r0 r4 r5 r7 r8 r9 r11 r13 r14 r15
  0x00c1: PHI (r0v17 java.lang.Object) = (r0v21 java.lang.Object), (r0v29 java.lang.Object) binds: [B:29:0x00bd, B:21:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x00c1: PHI (r4v7 int) = (r4v9 int), (r4v16 int) binds: [B:29:0x00bd, B:21:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x00c1: PHI (r5v4 int) = (r5v5 int), (r5v10 int) binds: [B:29:0x00bd, B:21:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x00c1: PHI (r7v11 java.lang.Throwable) = (r7v12 java.lang.Throwable), (r7v18 java.lang.Throwable) binds: [B:29:0x00bd, B:21:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x00c1: PHI (r8v11 byte) = (r8v12 byte), (r8v0 byte) binds: [B:29:0x00bd, B:21:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x00c1: PHI (r9v4 ??) = (r9v20 ??), (r9v21 ??) binds: [B:29:0x00bd, B:21:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x00c1: PHI (r11v1 long) = (r11v2 long), (r11v7 long) binds: [B:29:0x00bd, B:21:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x00c1: PHI (r13v1 a.y5v) = (r13v2 a.y5v), (r13v7 a.y5v) binds: [B:29:0x00bd, B:21:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x00c1: PHI (r14v1 java.util.List) = (r14v2 java.util.List), (r14v7 java.util.List) binds: [B:29:0x00bd, B:21:0x007f] A[DONT_GENERATE, DONT_INLINE]
  0x00c1: PHI (r15v1 a.b6v) = (r15v2 a.b6v), (r15v7 a.b6v) binds: [B:29:0x00bd, B:21:0x007f] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:28:0x00a1, B:31:0x00c1, B:20:0x007c), top: B:76:0x0010, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0169 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:67:0x016b A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:12:0x0037, B:32:0x00c3, B:67:0x016b, B:68:0x0172, B:69:0x0173, B:17:0x0062, B:33:0x00c7, B:36:0x00cf, B:37:0x00d8, B:41:0x00e2, B:43:0x00e6, B:49:0x010e, B:51:0x011c, B:53:0x0124, B:57:0x012d, B:59:0x0131, B:64:0x0156, B:65:0x015f, B:25:0x008c, B:28:0x00a1, B:31:0x00c1, B:20:0x007c), top: B:76:0x0010, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0173 A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #1 {all -> 0x004d, blocks: (B:12:0x0037, B:32:0x00c3, B:67:0x016b, B:68:0x0172, B:69:0x0173, B:17:0x0062, B:33:0x00c7, B:36:0x00cf, B:37:0x00d8, B:41:0x00e2, B:43:0x00e6, B:49:0x010e, B:51:0x011c, B:53:0x0124, B:57:0x012d, B:59:0x0131, B:64:0x0156, B:65:0x015f, B:25:0x008c, B:28:0x00a1, B:31:0x00c1, B:20:0x007c), top: B:76:0x0010, inners: #0 }] */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0193, code lost:
    
        if (r2.a(r4, r23) == r3) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [long] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12, types: [long] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3, types: [long] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [long] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00cf -> B:27:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x010e -> B:50:0x0119). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x014f -> B:63:0x0154). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0156 -> B:50:0x0119). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x015f -> B:48:0x010c). Please report as a decompilation issue!!! */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.y5v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
