package a;

import android.gov.nist.core.Separators;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gva0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f11966a;
    public final Function1 b;
    public final ReentrantLock c = new ReentrantLock();
    public final k050 d = new k050();
    public int e;
    public boolean f;
    public final f2e[] g;
    public final gbi0 h;
    public final xw3 i;

    /* JADX WARN: Multi-variable type inference failed */
    public gva0(int i, Function1 function1) {
        this.f11966a = i;
        this.b = function1;
        this.g = new f2e[i];
        this.h = new gbi0(i);
        this.i = new xw3(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r12 == r2) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.zje r12) {
        /*
            r11 = this;
            a.xw3 r0 = r11.i
            boolean r1 = r12 instanceof a.dva0
            if (r1 == 0) goto L15
            r1 = r12
            a.dva0 r1 = (a.dva0) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.k = r2
            goto L1a
        L15:
            a.dva0 r1 = new a.dva0
            r1.<init>(r11, r12)
        L1a:
            java.lang.Object r12 = r1.i
            a.wne r2 = a.wne.f39444a
            int r3 = r1.k
            java.lang.String r4 = "Connection pool is closed"
            r5 = 21
            java.util.concurrent.locks.ReentrantLock r6 = r11.c
            a.gbi0 r7 = r11.h
            r8 = 2
            r9 = 0
            r10 = 1
            if (r3 == 0) goto L42
            if (r3 == r10) goto L3e
            if (r3 != r8) goto L38
            a.z1x.P(r12)     // Catch: java.lang.Throwable -> L35
            goto L80
        L35:
            r11 = move-exception
            goto Lb4
        L38:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r11)
            return r9
        L3e:
            a.z1x.P(r12)
            goto L4e
        L42:
            a.z1x.P(r12)
            r1.k = r10
            java.lang.Object r12 = r7.b(r1)
            if (r12 != r2) goto L4e
            goto L7f
        L4e:
            r6.lock()     // Catch: java.lang.Throwable -> L35
            boolean r12 = r11.f     // Catch: java.lang.Throwable -> L63
            if (r12 != 0) goto Lac
            boolean r12 = r0.isEmpty()     // Catch: java.lang.Throwable -> L63
            if (r12 != 0) goto L65
            java.lang.Object r11 = r0.removeLast()     // Catch: java.lang.Throwable -> L63
            r6.unlock()     // Catch: java.lang.Throwable -> L35
            return r11
        L63:
            r11 = move-exception
            goto Lb0
        L65:
            r6.unlock()     // Catch: java.lang.Throwable -> L35
            int r12 = r11.e     // Catch: java.lang.Throwable -> L35
            byte r0 = r11.f11966a     // Catch: java.lang.Throwable -> L35
            if (r12 >= r0) goto La4
            a.k050 r12 = r11.d     // Catch: java.lang.Throwable -> L35
            a.epp r0 = new a.epp     // Catch: java.lang.Throwable -> L35
            r3 = 29
            r0.<init>(r11, r9, r3)     // Catch: java.lang.Throwable -> L35
            r1.k = r8     // Catch: java.lang.Throwable -> L35
            java.lang.Object r12 = a.vdx.h0(r12, r0, r1)     // Catch: java.lang.Throwable -> L35
            if (r12 != r2) goto L80
        L7f:
            return r2
        L80:
            a.f2e r12 = (a.f2e) r12     // Catch: java.lang.Throwable -> L35
            r6.lock()     // Catch: java.lang.Throwable -> L35
            boolean r0 = r11.f     // Catch: java.lang.Throwable -> L97
            if (r0 != 0) goto L99
            a.f2e[] r0 = r11.g     // Catch: java.lang.Throwable -> L97
            int r1 = r11.e     // Catch: java.lang.Throwable -> L97
            int r2 = r1 + 1
            r11.e = r2     // Catch: java.lang.Throwable -> L97
            r0[r1] = r12     // Catch: java.lang.Throwable -> L97
            r6.unlock()     // Catch: java.lang.Throwable -> L35
            return r12
        L97:
            r11 = move-exception
            goto La0
        L99:
            r12.close()     // Catch: java.lang.Throwable -> L97
            a.m2x.J(r5, r4)     // Catch: java.lang.Throwable -> L97
            throw r9     // Catch: java.lang.Throwable -> L97
        La0:
            r6.unlock()     // Catch: java.lang.Throwable -> L35
            throw r11     // Catch: java.lang.Throwable -> L35
        La4:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L35
            java.lang.String r12 = "Check failed."
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L35
            throw r11     // Catch: java.lang.Throwable -> L35
        Lac:
            a.m2x.J(r5, r4)     // Catch: java.lang.Throwable -> L63
            throw r9     // Catch: java.lang.Throwable -> L63
        Lb0:
            r6.unlock()     // Catch: java.lang.Throwable -> L35
            throw r11     // Catch: java.lang.Throwable -> L35
        Lb4:
            r7.f()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gva0.a(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x006d A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:29:0x0069, B:31:0x006d, B:35:0x0075, B:39:0x007c), top: B:44:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0075 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:29:0x0069, B:31:0x006d, B:35:0x0075, B:39:0x007c), top: B:44:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0079 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x007c A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:29:0x0069, B:31:0x006d, B:35:0x0075, B:39:0x007c), top: B:44:0x0069 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0056 -> B:24:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(long r9, a.lf2 r11, a.zje r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof a.fva0
            if (r0 == 0) goto L13
            r0 = r12
            a.fva0 r0 = (a.fva0) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.fva0 r0 = new a.fva0
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.l
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            long r9 = r0.i
            a.mie0 r11 = r0.k
            kotlin.jvm.functions.Function0 r2 = r0.j
            a.z1x.P(r12)     // Catch: java.lang.Throwable -> L2e
            goto L58
        L2e:
            r12 = move-exception
            goto L64
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r4
        L36:
            a.z1x.P(r12)
        L39:
            a.mie0 r12 = new a.mie0
            r12.<init>()
            a.fra0 r2 = new a.fra0     // Catch: java.lang.Throwable -> L62
            r2.<init>(r12, r8, r4)     // Catch: java.lang.Throwable -> L62
            r0.j = r11     // Catch: java.lang.Throwable -> L62
            r0.k = r12     // Catch: java.lang.Throwable -> L62
            r0.i = r9     // Catch: java.lang.Throwable -> L62
            r0.n = r3     // Catch: java.lang.Throwable -> L62
            long r5 = a.qcc.g0(r9)     // Catch: java.lang.Throwable -> L62
            java.lang.Object r2 = a.msm0.t(r5, r2, r0)     // Catch: java.lang.Throwable -> L62
            if (r2 != r1) goto L56
            return r1
        L56:
            r2 = r11
            r11 = r12
        L58:
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r4
            goto L69
        L5d:
            r7 = r2
            r2 = r11
            r11 = r12
            r12 = r7
            goto L64
        L62:
            r2 = move-exception
            goto L5d
        L64:
            r7 = r12
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r7
        L69:
            boolean r5 = r0 instanceof a.gmq0     // Catch: java.lang.Throwable -> L71
            if (r5 == 0) goto L73
            r11.invoke()     // Catch: java.lang.Throwable -> L71
            goto L7a
        L71:
            r9 = move-exception
            goto L7d
        L73:
            if (r0 != 0) goto L7c
            java.lang.Object r12 = r12.f21842a     // Catch: java.lang.Throwable -> L71
            if (r12 == 0) goto L7a
            return r12
        L7a:
            r0 = r2
            goto L39
        L7c:
            throw r0     // Catch: java.lang.Throwable -> L71
        L7d:
            java.lang.Object r10 = r12.f21842a
            a.f2e r10 = (a.f2e) r10
            if (r10 == 0) goto L86
            r8.e(r10)
        L86:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.gva0.b(long, a.lf2, a.zje):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.f = true;
            for (f2e f2eVar : this.g) {
                if (f2eVar != null) {
                    f2eVar.close();
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(StringBuilder sb) {
        xw3 xw3Var = this.i;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            lc00 lc00VarB = kotlin.collections.a.b();
            int i = xw3Var.c;
            for (int i2 = 0; i2 < i; i2++) {
                lc00VarB.add(xw3Var.get(i2));
            }
            lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
            sb.append(Separators.HT + toString() + " (");
            sb.append("capacity=" + ((int) this.f11966a) + ", ");
            sb.append("permits=" + Math.max(defpackage.a.f0a.getIntVolatile(this.h, fbi0.f), 0) + ", ");
            sb.append("queue=(size=" + lc00VarA.b() + ")[" + CollectionsKt.b0(lc00VarA, null, null, null, null, 63) + "]");
            sb.append(Separators.RPAREN);
            sb.append('\n');
            f2e[] f2eVarArr = this.g;
            int length = f2eVarArr.length;
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                f2e f2eVar = f2eVarArr[i4];
                i3++;
                sb.append("\t\t[" + i3 + "] - " + (f2eVar != null ? f2eVar.f8807a.toString() : null));
                sb.append('\n');
                if (f2eVar != null) {
                    f2eVar.e(sb);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(f2e f2eVar) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.i.addLast(f2eVar);
            reentrantLock.unlock();
            this.h.f();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
