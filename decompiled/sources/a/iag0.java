package a;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class iag0 {
    public static final gne0 i = new gne0((byte) 9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rrd f14437a;
    public final gx9 b;
    public final mii0 c;
    public final cao0 d;
    public final py2 e;
    public final x34 f;
    public final h1a g;
    public final qcq0 h;

    public iag0(rrd rrdVar, gx9 gx9Var, mii0 mii0Var, cao0 cao0Var, py2 py2Var, x34 x34Var, h1a h1aVar, qcq0 qcq0Var) {
        gx9Var.getClass();
        cao0Var.getClass();
        py2Var.getClass();
        x34Var.getClass();
        qcq0Var.getClass();
        this.f14437a = rrdVar;
        this.b = gx9Var;
        this.c = mii0Var;
        this.d = cao0Var;
        this.e = py2Var;
        this.f = x34Var;
        this.g = h1aVar;
        this.h = qcq0Var;
    }

    public final oa5 a(String str, ex9 ex9Var) {
        str.getClass();
        Log.d("CXCP", this + "#openAndAwaitCameraWithRetry(" + ((Object) g0a.b(str)) + ')');
        return (oa5) eeq.U(this.h.d, new pnd0((byte) 9, null, str, this, ex9Var));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0100  */
    /* JADX WARN: Code duplicated, block: B:38:0x011e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0124  */
    /* JADX WARN: Code duplicated, block: B:42:0x0128 A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:14:0x0043, B:74:0x0250, B:76:0x0258, B:35:0x010d, B:42:0x0128, B:45:0x0131, B:47:0x015a, B:49:0x016f, B:53:0x017d, B:55:0x0184, B:59:0x01fc, B:70:0x022d, B:62:0x0209, B:65:0x0219, B:79:0x0280, B:80:0x0283, B:22:0x0070, B:46:0x014e), top: B:89:0x002b, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0131 A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:14:0x0043, B:74:0x0250, B:76:0x0258, B:35:0x010d, B:42:0x0128, B:45:0x0131, B:47:0x015a, B:49:0x016f, B:53:0x017d, B:55:0x0184, B:59:0x01fc, B:70:0x022d, B:62:0x0209, B:65:0x0219, B:79:0x0280, B:80:0x0283, B:22:0x0070, B:46:0x014e), top: B:89:0x002b, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x016f A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:14:0x0043, B:74:0x0250, B:76:0x0258, B:35:0x010d, B:42:0x0128, B:45:0x0131, B:47:0x015a, B:49:0x016f, B:53:0x017d, B:55:0x0184, B:59:0x01fc, B:70:0x022d, B:62:0x0209, B:65:0x0219, B:79:0x0280, B:80:0x0283, B:22:0x0070, B:46:0x014e), top: B:89:0x002b, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0178  */
    /* JADX WARN: Code duplicated, block: B:54:0x0182 A[PHI: r18 r19
  0x0182: PHI (r18v2 a.cao0) = (r18v3 a.cao0), (r18v4 a.cao0) binds: [B:53:0x017d, B:50:0x0176] A[DONT_GENERATE, DONT_INLINE]
  0x0182: PHI (r19v1 a.wne) = (r19v2 a.wne), (r19v3 a.wne) binds: [B:53:0x017d, B:50:0x0176] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x0184 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #1 {all -> 0x0054, blocks: (B:14:0x0043, B:74:0x0250, B:76:0x0258, B:35:0x010d, B:42:0x0128, B:45:0x0131, B:47:0x015a, B:49:0x016f, B:53:0x017d, B:55:0x0184, B:59:0x01fc, B:70:0x022d, B:62:0x0209, B:65:0x0219, B:79:0x0280, B:80:0x0283, B:22:0x0070, B:46:0x014e), top: B:89:0x002b, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x0209 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:14:0x0043, B:74:0x0250, B:76:0x0258, B:35:0x010d, B:42:0x0128, B:45:0x0131, B:47:0x015a, B:49:0x016f, B:53:0x017d, B:55:0x0184, B:59:0x01fc, B:70:0x022d, B:62:0x0209, B:65:0x0219, B:79:0x0280, B:80:0x0283, B:22:0x0070, B:46:0x014e), top: B:89:0x002b, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0218  */
    /* JADX WARN: Code duplicated, block: B:65:0x0219 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:14:0x0043, B:74:0x0250, B:76:0x0258, B:35:0x010d, B:42:0x0128, B:45:0x0131, B:47:0x015a, B:49:0x016f, B:53:0x017d, B:55:0x0184, B:59:0x01fc, B:70:0x022d, B:62:0x0209, B:65:0x0219, B:79:0x0280, B:80:0x0283, B:22:0x0070, B:46:0x014e), top: B:89:0x002b, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0225  */
    /* JADX WARN: Code duplicated, block: B:69:0x022a  */
    /* JADX WARN: Code duplicated, block: B:73:0x0249  */
    /* JADX WARN: Code duplicated, block: B:76:0x0258 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:14:0x0043, B:74:0x0250, B:76:0x0258, B:35:0x010d, B:42:0x0128, B:45:0x0131, B:47:0x015a, B:49:0x016f, B:53:0x017d, B:55:0x0184, B:59:0x01fc, B:70:0x022d, B:62:0x0209, B:65:0x0219, B:79:0x0280, B:80:0x0283, B:22:0x0070, B:46:0x014e), top: B:89:0x002b, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0249 -> B:16:0x004d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(java.lang.String r36, a.ex9 r37, kotlin.jvm.functions.Function1 r38, a.zje r39) {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.iag0.b(java.lang.String, a.ex9, kotlin.jvm.functions.Function1, a.zje):java.lang.Object");
    }
}
