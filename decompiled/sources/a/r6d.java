package a;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes4.dex */
public final class r6d implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29929a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public r6d(kmq kmqVar, List list, Object obj, lie0 lie0Var, hie0 hie0Var, z2r0 z2r0Var) {
        this.b = kmqVar;
        this.d = list;
        this.c = obj;
        this.e = lie0Var;
        this.f = hie0Var;
        this.g = z2r0Var;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0290  */
    /* JADX WARN: Code duplicated, block: B:119:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0034  */
    /* JADX WARN: Code duplicated, block: B:120:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00de  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:35:0x0107 A[LOOP:1: B:30:0x00e8->B:35:0x0107, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x011c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0142  */
    /* JADX WARN: Code duplicated, block: B:45:0x0154  */
    /* JADX WARN: Code duplicated, block: B:46:0x015d  */
    /* JADX WARN: Code duplicated, block: B:48:0x016a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0170  */
    /* JADX WARN: Code duplicated, block: B:51:0x0172  */
    /* JADX WARN: Code duplicated, block: B:53:0x0178  */
    /* JADX WARN: Code duplicated, block: B:56:0x0187  */
    /* JADX WARN: Code duplicated, block: B:58:0x0197  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x01af  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fa A[PHI: r5
  0x01fa: PHI (r5v10 int) = (r5v9 int), (r5v13 int) binds: [B:68:0x01cd, B:71:0x01d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x020d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00c5 -> B:26:0x00c9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.kmq
    public final java.lang.Object a(java.lang.Object r32, a.yje r33) {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r6d.a(java.lang.Object, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba A[Catch: all -> 0x005a, PHI: r4 r12 r13
  0x00ba: PHI (r4v8 java.util.Iterator) = (r4v9 java.util.Iterator), (r4v11 java.util.Iterator) binds: [B:37:0x00b7, B:18:0x0056] A[DONT_GENERATE, DONT_INLINE]
  0x00ba: PHI (r12v9 java.lang.String) = (r12v12 java.lang.String), (r12v17 java.lang.String) binds: [B:37:0x00b7, B:18:0x0056] A[DONT_GENERATE, DONT_INLINE]
  0x00ba: PHI (r13v13 java.lang.Object) = (r13v19 java.lang.Object), (r13v1 java.lang.Object) binds: [B:37:0x00b7, B:18:0x0056] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x005a, blocks: (B:36:0x00a9, B:39:0x00ba, B:18:0x0056), top: B:57:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f1 A[PHI: r4 r13
  0x00f1: PHI (r4v5 java.util.Iterator) = (r4v6 java.util.Iterator), (r4v7 java.util.Iterator) binds: [B:48:0x00ec, B:43:0x00cb] A[DONT_GENERATE, DONT_INLINE]
  0x00f1: PHI (r13v5 java.lang.Object) = (r13v8 java.lang.Object), (r13v9 java.lang.Object) binds: [B:48:0x00ec, B:43:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e9, code lost:
    
        if (((a.o8f) r13).c(r2, r9, false) == r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0107, code lost:
    
        if (r13.a(r9, r2) == r3) goto L51;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0107 -> B:52:0x010a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.util.List r12, a.yje r13) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r6d.b(java.util.List, a.yje):java.lang.Object");
    }

    public r6d(Set set, kie0 kie0Var, vne vneVar, pxs0 pxs0Var, AtomicBoolean atomicBoolean, String str, String str2) {
        this.d = set;
        this.c = kie0Var;
        this.e = pxs0Var;
        this.b = atomicBoolean;
        this.f = str;
        this.g = str2;
    }

    public r6d(CoroutineContext coroutineContext, Object obj, hzb0 hzb0Var, kmq kmqVar, xdr xdrVar, dby dbyVar) {
        this.d = coroutineContext;
        this.c = obj;
        this.e = hzb0Var;
        this.b = kmqVar;
        this.f = xdrVar;
        this.g = dbyVar;
    }
}
