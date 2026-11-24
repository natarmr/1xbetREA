package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class rkf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vne f30647a;
    public final kmq b;
    public final Function1 c;
    public final or30 d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final Function0 k;
    public long l;
    public boolean m;
    public c4m0 n;

    public rkf0(vne vneVar, kmq kmqVar, Function1 function1, or30 or30Var, long j, long j2, long j3, long j4, boolean z, boolean z2, Function0 function0) {
        vneVar.getClass();
        kmqVar.getClass();
        or30Var.getClass();
        this.f30647a = vneVar;
        this.b = kmqVar;
        this.c = function1;
        this.d = or30Var;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = z;
        this.j = z2;
        this.k = function0;
        this.l = j2;
    }

    public final long a() {
        Pair pair = (Pair) this.d.f25719a.getValue();
        Long l = pair != null ? (Long) pair.b : null;
        if (l == null) {
            jf4.n("Cache timestamp must be initialized.");
            return 0L;
        }
        uen uenVar = wen.b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        bfn bfnVar = bfn.MILLISECONDS;
        return wen.k(wen.j(this.h, wen.j(ibc.w0(jCurrentTimeMillis, bfnVar), ibc.w0(l.longValue(), bfnVar))), this.e);
    }

    public final Object b(Throwable th, boolean z, pkf0 pkf0Var) throws dag0 {
        long j = this.l;
        if (j == 0) {
            if (z) {
                this.d.a();
            }
            throw new dag0(th);
        }
        this.l = j - 1;
        Object objP = qcc.P(this.g, pkf0Var);
        return objP == wne.f39444a ? objP : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        if (a.qcc.P(r7.e, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(a.zje r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a.nkf0
            if (r0 == 0) goto L13
            r0 = r8
            a.nkf0 r0 = (a.nkf0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.nkf0 r0 = new a.nkf0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            a.z1x.P(r8)
            goto L6f
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r5
        L31:
            a.z1x.P(r8)
            goto L64
        L35:
            a.z1x.P(r8)
            a.c4m0 r8 = r7.n
            if (r8 == 0) goto L42
            boolean r8 = r8.isActive()
            if (r8 != 0) goto L51
        L42:
            a.qkf0 r8 = new a.qkf0
            r2 = 0
            r8.<init>(r7, r5, r2)
            r2 = 3
            a.vne r6 = r7.f30647a
            a.c4m0 r8 = a.qjj.W(r6, r5, r5, r8, r2)
            r7.n = r8
        L51:
            a.or30 r8 = r7.d
            java.lang.Object r8 = r8.b()
            if (r8 == 0) goto L64
            r0.k = r4
            a.kmq r2 = r7.b
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto L64
            goto L6e
        L64:
            r0.k = r3
            long r7 = r7.e
            java.lang.Object r7 = a.qcc.P(r7, r0)
            if (r7 != r1) goto L6f
        L6e:
            return r1
        L6f:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rkf0.c(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if (a.qcc.P(r8.e, r0) == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(a.zje r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a.okf0
            if (r0 == 0) goto L13
            r0 = r9
            a.okf0 r0 = (a.okf0) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.okf0 r0 = new a.okf0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            a.z1x.P(r9)
            goto L7c
        L2b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r5
        L31:
            a.z1x.P(r9)
            goto L71
        L35:
            a.z1x.P(r9)
            a.c4m0 r9 = r8.n
            a.or30 r2 = r8.d
            if (r9 == 0) goto L44
            boolean r9 = r9.isActive()
            if (r9 != 0) goto L58
        L44:
            java.lang.Object r9 = r2.b()
            if (r9 == 0) goto L58
            a.qkf0 r9 = new a.qkf0
            r9.<init>(r8, r5, r4)
            r6 = 3
            a.vne r7 = r8.f30647a
            a.c4m0 r9 = a.qjj.W(r7, r5, r5, r9, r6)
            r8.n = r9
        L58:
            java.lang.Object r9 = r2.b()
            if (r9 != 0) goto L64
            kotlin.jvm.functions.Function0 r9 = r8.k
            java.lang.Object r9 = r9.invoke()
        L64:
            if (r9 == 0) goto L71
            r0.k = r4
            a.kmq r2 = r8.b
            java.lang.Object r9 = r2.a(r9, r0)
            if (r9 != r1) goto L71
            goto L7b
        L71:
            r0.k = r3
            long r8 = r8.e
            java.lang.Object r8 = a.qcc.P(r8, r0)
            if (r8 != r1) goto L7c
        L7b:
            return r1
        L7c:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rkf0.d(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004a  */
    /* JADX WARN: Code duplicated, block: B:27:0x0054 A[Catch: all -> 0x003d, CancellationException -> 0x012b, TRY_ENTER, TryCatch #2 {CancellationException -> 0x012b, all -> 0x003d, blocks: (B:18:0x0039, B:27:0x0054, B:30:0x0060, B:33:0x007a, B:21:0x003f, B:22:0x0043), top: B:99:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060 A[Catch: all -> 0x003d, CancellationException -> 0x012b, PHI: r14
  0x0060: PHI (r14v19 java.lang.Object) = (r14v24 java.lang.Object), (r14v1 java.lang.Object) binds: [B:28:0x005c, B:22:0x0043] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x012b, all -> 0x003d, blocks: (B:18:0x0039, B:27:0x0054, B:30:0x0060, B:33:0x007a, B:21:0x003f, B:22:0x0043), top: B:99:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code duplicated, block: B:33:0x007a A[Catch: all -> 0x003d, CancellationException -> 0x012b, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x012b, all -> 0x003d, blocks: (B:18:0x0039, B:27:0x0054, B:30:0x0060, B:33:0x007a, B:21:0x003f, B:22:0x0043), top: B:99:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0082 -> B:25:0x004a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00cb -> B:25:0x004a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x011d -> B:25:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(a.zje r14) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rkf0.e(a.zje):java.lang.Object");
    }
}
