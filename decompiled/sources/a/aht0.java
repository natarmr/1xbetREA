package a;

/* JADX INFO: loaded from: classes.dex */
public final class aht0 {
    public static final p73 f = new p73(0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l5u0 f890a;
    public long b = Long.MIN_VALUE;
    public p73 c = f;
    public boolean d;
    public float e;

    public aht0(j73 j73Var) {
        this.f890a = j73Var.a(hp4.j);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007d A[Catch: all -> 0x003a, PHI: r0 r2 r4 r13
  0x007d: PHI (r0v16 kotlin.jvm.functions.Function1) = (r0v9 kotlin.jvm.functions.Function1), (r0v17 kotlin.jvm.functions.Function1) binds: [B:29:0x0075, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x007d: PHI (r2v5 kotlin.jvm.functions.Function0) = (r2v3 kotlin.jvm.functions.Function0), (r2v6 kotlin.jvm.functions.Function0) binds: [B:29:0x0075, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x007d: PHI (r4v4 a.zgt0) = (r4v2 a.zgt0), (r4v5 a.zgt0) binds: [B:29:0x0075, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x007d: PHI (r13v1 float) = (r13v0 float), (r13v2 float) binds: [B:29:0x0075, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d7, B:20:0x004b, B:36:0x00a9, B:30:0x007d, B:33:0x008b, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d7, B:20:0x004b, B:36:0x00a9, B:30:0x007d, B:33:0x008b, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9 A[Catch: all -> 0x003a, PHI: r0 r2 r4 r13
  0x00a9: PHI (r0v17 kotlin.jvm.functions.Function1) = (r0v16 kotlin.jvm.functions.Function1), (r0v20 kotlin.jvm.functions.Function1) binds: [B:34:0x00a6, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r2v6 kotlin.jvm.functions.Function0) = (r2v5 kotlin.jvm.functions.Function0), (r2v8 kotlin.jvm.functions.Function0) binds: [B:34:0x00a6, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r4v5 a.zgt0) = (r4v4 a.zgt0), (r4v7 a.zgt0) binds: [B:34:0x00a6, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r13v2 float) = (r13v1 float), (r13v4 float) binds: [B:34:0x00a6, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d7, B:20:0x004b, B:36:0x00a9, B:30:0x007d, B:33:0x008b, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0 A[Catch: all -> 0x003a, PHI: r0 r2 r4
  0x00b0: PHI (r0v12 kotlin.jvm.functions.Function1) = (r0v16 kotlin.jvm.functions.Function1), (r0v17 kotlin.jvm.functions.Function1) binds: [B:32:0x008a, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r2v4 kotlin.jvm.functions.Function0) = (r2v5 kotlin.jvm.functions.Function0), (r2v6 kotlin.jvm.functions.Function0) binds: [B:32:0x008a, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r4v3 a.zgt0) = (r4v4 a.zgt0), (r4v5 a.zgt0) binds: [B:32:0x008a, B:37:0x00ae] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d7, B:20:0x004b, B:36:0x00a9, B:30:0x007d, B:33:0x008b, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d7, B:20:0x004b, B:36:0x00a9, B:30:0x007d, B:33:0x008b, B:38:0x00b0, B:41:0x00bb), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a6 -> B:36:0x00a9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(a.sw8 r17, a.kk0 r18, a.zje r19) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.aht0.a(a.sw8, a.kk0, a.zje):java.lang.Object");
    }
}
