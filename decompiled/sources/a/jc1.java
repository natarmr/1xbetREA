package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class jc1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public Object j;
    public long k;
    public long l;
    public byte m;
    public Object n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc1(f1b0 f1b0Var, List list, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        this.n = f1b0Var;
        this.o = list;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    private final Object l(Object obj) throws Throwable {
        Throwable th;
        long j;
        long j2;
        long jCurrentTimeMillis;
        Throwable th2;
        xuf xufVar;
        xuf xufVar2;
        p7m0 p7m0Var;
        Object value;
        n6s0 n6s0Var = (n6s0) this.o;
        gu1 gu1Var = (gu1) this.n;
        wne wneVar = wne.f39444a;
        byte b = this.m;
        if (b == 0) {
            z1x.P(obj);
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            try {
                m0u m0uVar = n6s0Var.p;
                long j3 = gu1Var.e.c;
                this.n = gu1Var;
                this.k = 1000L;
                this.l = jCurrentTimeMillis2;
                this.m = (byte) 1;
                obj = m0uVar.f20973a.c(j3, this);
                if (obj != wneVar) {
                    j = jCurrentTimeMillis2;
                    j2 = 1000;
                }
            } catch (Throwable th3) {
                th = th3;
                j = jCurrentTimeMillis2;
                j2 = 1000;
                jCurrentTimeMillis = System.currentTimeMillis() - j;
                if (jCurrentTimeMillis < j2) {
                    throw th;
                }
                this.n = null;
                this.j = th;
                this.k = j2;
                this.l = j;
                this.m = (byte) 3;
                if (qcc.O(j2 - jCurrentTimeMillis, this) != wneVar) {
                    th2 = th;
                    throw th2;
                }
            }
            return wneVar;
        }
        if (b == 1) {
            j = this.l;
            j2 = this.k;
            try {
                z1x.P(obj);
            } catch (Throwable th4) {
                th = th4;
                jCurrentTimeMillis = System.currentTimeMillis() - j;
                if (jCurrentTimeMillis < j2) {
                    throw th;
                }
                this.n = null;
                this.j = th;
                this.k = j2;
                this.l = j;
                this.m = (byte) 3;
                if (qcc.O(j2 - jCurrentTimeMillis, this) != wneVar) {
                    th2 = th;
                    throw th2;
                }
            }
        } else {
            if (b != 2) {
                if (b != 3) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th2 = (Throwable) this.j;
                z1x.P(obj);
                throw th2;
            }
            xufVar2 = (xuf) this.j;
            z1x.P(obj);
        }
        xufVar = xufVar2;
        int i = n6s0.A;
        p7m0Var = n6s0Var.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
        } while (!p7m0Var.m(value, e6s0.a((e6s0) value, 0L, xufVar.f, new q7s0(gu1Var), false, null, false, 199)));
        return Unit.f46060a;
        xufVar = (xuf) obj;
        long jCurrentTimeMillis3 = System.currentTimeMillis() - j;
        if (jCurrentTimeMillis3 < j2) {
            this.n = gu1Var;
            this.j = xufVar;
            this.k = j2;
            this.l = j;
            this.m = (byte) 2;
            if (qcc.O(j2 - jCurrentTimeMillis3, this) != wneVar) {
                xufVar2 = xufVar;
                xufVar = xufVar2;
            }
            return wneVar;
        }
        int i2 = n6s0.A;
        p7m0Var = n6s0Var.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
        } while (!p7m0Var.m(value, e6s0.a((e6s0) value, 0L, xufVar.f, new q7s0(gu1Var), false, null, false, 199)));
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.o;
        switch (b) {
            case 0:
                return new jc1(obj2, yjeVar, (byte) 0);
            case 1:
                return new jc1(obj2, yjeVar, (byte) 1);
            case 2:
                return new jc1(obj2, yjeVar, (byte) 2);
            case 3:
                jc1 jc1Var = new jc1((ywq0) obj2, this.k, this.l, yjeVar, (byte) 3);
                jc1Var.j = obj;
                return jc1Var;
            case 4:
                jc1 jc1Var2 = new jc1((xzp) obj2, this.k, this.l, yjeVar, (byte) 4);
                jc1Var2.j = obj;
                return jc1Var2;
            case 5:
                jc1 jc1Var3 = new jc1((nc0) obj2, this.k, this.l, yjeVar, (byte) 5);
                jc1Var3.j = obj;
                return jc1Var3;
            case 6:
                jc1 jc1Var4 = new jc1(obj2, yjeVar, (byte) 6);
                jc1Var4.n = obj;
                return jc1Var4;
            case 7:
                jc1 jc1Var5 = new jc1((yuu) obj2, this.l, yjeVar);
                jc1Var5.n = obj;
                return jc1Var5;
            case 8:
                return new jc1((f1b0) this.n, (List) obj2, yjeVar);
            case 9:
                jc1 jc1Var6 = new jc1(obj2, yjeVar, (byte) 9);
                jc1Var6.n = obj;
                return jc1Var6;
            case 10:
                jc1 jc1Var7 = new jc1(obj2, yjeVar, (byte) 10);
                jc1Var7.n = obj;
                return jc1Var7;
            default:
                return new jc1(obj2, yjeVar, (byte) 11);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((jc1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((jc1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((jc1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((jc1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((jc1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((jc1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((jc1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((jc1) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((jc1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((jc1) create((gu1) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((jc1) create((gu1) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((jc1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:135:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:160:0x0363  */
    /* JADX WARN: Code duplicated, block: B:163:0x0368  */
    /* JADX WARN: Code duplicated, block: B:166:0x036d A[PHI: r0
  0x036d: PHI (r0v133 java.lang.Object) = (r0v132 java.lang.Object), (r0v139 java.lang.Object) binds: [B:164:0x036a, B:148:0x02f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:282:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:288:0x0619  */
    /* JADX WARN: Code duplicated, block: B:294:0x062c  */
    /* JADX WARN: Code duplicated, block: B:298:0x0647  */
    /* JADX WARN: Code duplicated, block: B:299:0x064a  */
    /* JADX WARN: Code duplicated, block: B:301:0x064e  */
    /* JADX WARN: Code duplicated, block: B:302:0x0655  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:312:0x0677  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6 A[Catch: all -> 0x0050, PHI: r0 r3 r6 r9
  0x00a6: PHI (r0v173 a.xuf) = (r0v172 a.xuf), (r0v181 a.xuf) binds: [B:29:0x00a2, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x00a6: PHI (r3v53 long) = (r3v52 long), (r3v54 long) binds: [B:29:0x00a2, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x00a6: PHI (r6v66 long) = (r6v0 long), (r6v67 long) binds: [B:29:0x00a2, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x00a6: PHI (r9v13 java.lang.Object) = (r9v12 java.lang.Object), (r9v17 java.lang.Object) binds: [B:29:0x00a2, B:16:0x004d] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:15:0x004a, B:31:0x00a6, B:28:0x008e), top: B:458:0x001b }] */
    /* JADX WARN: Code duplicated, block: B:349:0x075c  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:355:0x077e A[LOOP:7: B:353:0x0778->B:355:0x077e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:364:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:399:0x08fc A[PHI: r0 r2 r4 r5 r6 r8
  0x08fc: PHI (r0v4 java.lang.String) = (r0v3 java.lang.String), (r0v45 java.lang.String) binds: [B:397:0x08f9, B:386:0x086f] A[DONT_GENERATE, DONT_INLINE]
  0x08fc: PHI (r2v4 a.fv70) = (r2v3 a.fv70), (r2v15 a.fv70) binds: [B:397:0x08f9, B:386:0x086f] A[DONT_GENERATE, DONT_INLINE]
  0x08fc: PHI (r4v16 java.lang.Object) = (r4v15 java.lang.Object), (r4v27 java.lang.Object) binds: [B:397:0x08f9, B:386:0x086f] A[DONT_GENERATE, DONT_INLINE]
  0x08fc: PHI (r5v4 a.jc1) = (r5v3 a.jc1), (r5v0 a.jc1) binds: [B:397:0x08f9, B:386:0x086f] A[DONT_GENERATE, DONT_INLINE]
  0x08fc: PHI (r6v7 long) = (r6v6 long), (r6v11 long) binds: [B:397:0x08f9, B:386:0x086f] A[DONT_GENERATE, DONT_INLINE]
  0x08fc: PHI (r8v2 long) = (r8v1 long), (r8v8 long) binds: [B:397:0x08f9, B:386:0x086f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:487:0x0627 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:514:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:529:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:531:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:532:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:95:0x0201  */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0297, code lost:
    
        if (a.qcc.O(r10 - r8, r5) == r3) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x037c, code lost:
    
        if (r6.a(r1, r5) == r7) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03e8, code lost:
    
        if (a.qcc.O(r6 - r8, r5) == r1) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0456, code lost:
    
        if (r6.a(r0, r5) == r7) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04ac, code lost:
    
        if (r6.a(r1, r5) == r7) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x053f, code lost:
    
        if (a.slb.Q(r0, r2, r5) == r1) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x060b, code lost:
    
        if (a.qcc.O(r10 - r14, r5) == r3) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0770, code lost:
    
        if (a.qcc.O(r10 - r12, r5) == r9) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0948, code lost:
    
        if (r0 == r12) goto L409;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x09b6, code lost:
    
        if (r0 == r12) goto L409;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v46, types: [byte] */
    /* JADX WARN: Type inference failed for: r2v47, types: [long] */
    /* JADX WARN: Type inference failed for: r2v50, types: [long] */
    /* JADX WARN: Type inference failed for: r2v87 */
    /* JADX WARN: Type inference failed for: r2v88 */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r52) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.jc1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc1(yuu yuuVar, long j, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 7;
        this.o = yuuVar;
        this.l = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jc1(Object obj, long j, long j2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.o = obj;
        this.k = j;
        this.l = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jc1(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.o = obj;
    }
}
