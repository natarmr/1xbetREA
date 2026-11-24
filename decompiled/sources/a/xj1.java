package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class xj1 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public byte j;
    public boolean k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xj1(w5z w5zVar, ouj0 ouj0Var, int i, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        this.l = w5zVar;
        this.m = ouj0Var;
        this.j = i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0057  */
    /* JADX WARN: Code duplicated, block: B:18:0x0068 A[PHI: r6
  0x0068: PHI (r6v6 boolean) = (r6v3 boolean), (r6v3 boolean), (r6v7 boolean) binds: [B:14:0x0055, B:16:0x0064, B:8:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0081 A[PHI: r6 r13
  0x0081: PHI (r6v8 boolean) = (r6v6 boolean), (r6v9 boolean) binds: [B:19:0x007d, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]
  0x0081: PHI (r13v12 java.lang.Object) = (r13v11 java.lang.Object), (r13v0 java.lang.Object) binds: [B:19:0x007d, B:7:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f9  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        if (r3.f(a.ple.f27178a, r12) == r5) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ce, code lost:
    
        if (r0.H(r4, r12) == r5) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e2, code lost:
    
        if (r0.B(r13, r12) == r5) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0106, code lost:
    
        if (r0.a(r13, r12) == r5) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object l(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xj1.l(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007d  */
    private final Object m(Object obj) {
        boolean zG;
        m0u m0uVar;
        Object objB;
        Object objC;
        xuf xufVar;
        Object objZ;
        boolean z;
        tod0 tod0Var = (tod0) this.m;
        wne wneVar = wne.f39444a;
        byte b = this.j;
        if (b == 0) {
            z1x.P(obj);
            zG = tod0Var.d.g();
            m0uVar = tod0Var.i;
            ahu ahuVar = tod0Var.h;
            this.l = m0uVar;
            this.k = zG;
            this.j = (byte) 1;
            objB = ahuVar.b(bm5.f2822a, this);
            if (objB != wneVar) {
            }
            return wneVar;
        }
        if (b == 1) {
            zG = this.k;
            m0u m0uVar2 = (m0u) this.l;
            z1x.P(obj);
            m0uVar = m0uVar2;
            objB = obj;
        } else {
            if (b == 2) {
                zG = this.k;
                z1x.P(obj);
                objC = obj;
                xufVar = (xuf) objC;
                oif0 oif0Var = tod0Var.j;
                this.l = xufVar;
                this.k = zG;
                this.j = (byte) 3;
                objZ = oif0Var.z(this);
                if (objZ != wneVar) {
                    z = zG;
                }
                return wneVar;
            }
            if (b != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z2 = this.k;
            xuf xufVar2 = (xuf) this.l;
            z1x.P(obj);
            xufVar = xufVar2;
            z = z2;
            objZ = obj;
        }
        double dDoubleValue = ((Number) objZ).doubleValue();
        p7m0 p7m0Var = tod0Var.m;
        mod0 mod0Var = new mod0(z, z, z, xufVar.f, dDoubleValue, dDoubleValue, xufVar.i);
        p7m0Var.getClass();
        p7m0Var.o(null, mod0Var);
        return Unit.f46060a;
        long j = ((ql5) objB).e;
        this.l = null;
        this.k = zG;
        this.j = (byte) 2;
        objC = m0uVar.f20973a.c(j, this);
        if (objC != wneVar) {
            xufVar = (xuf) objC;
            oif0 oif0Var2 = tod0Var.j;
            this.l = xufVar;
            this.k = zG;
            this.j = (byte) 3;
            objZ = oif0Var2.z(this);
            if (objZ != wneVar) {
                z = zG;
                double dDoubleValue2 = ((Number) objZ).doubleValue();
                p7m0 p7m0Var2 = tod0Var.m;
                mod0 mod0Var2 = new mod0(z, z, z, xufVar.f, dDoubleValue2, dDoubleValue2, xufVar.i);
                p7m0Var2.getClass();
                p7m0Var2.o(null, mod0Var2);
                return Unit.f46060a;
            }
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0077 A[LOOP:1: B:17:0x0071->B:19:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:24:0x0095  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a2 A[PHI: r4
  0x00a2: PHI (r4v11 java.lang.Object) = (r4v9 java.lang.Object), (r4v13 java.lang.Object) binds: [B:25:0x009e, B:11:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:35:0x00dd A[PHI: r4
  0x00dd: PHI (r4v14 a.mja) = (r4v12 a.mja), (r4v15 a.mja) binds: [B:28:0x00bd, B:33:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:45:0x0104 A[PHI: r4
  0x0104: PHI (r4v18 a.mja) = (r4v14 a.mja), (r4v14 a.mja), (r4v19 a.mja) binds: [B:36:0x00df, B:38:0x00e3, B:43:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x016b A[PHI: r4
  0x016b: PHI (r4v22 a.mja) = (r4v15 a.mja), (r4v18 a.mja), (r4v19 a.mja), (r4v24 a.mja) binds: [B:34:0x00d4, B:46:0x010a, B:44:0x00fa, B:51:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0188  */
    /* JADX WARN: Code duplicated, block: B:62:0x018c  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c8, code lost:
    
        if (r8 == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ee, code lost:
    
        if (r8 == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0115, code lost:
    
        if (r5 == r3) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0197, code lost:
    
        if (r1.X(false, r26) == r3) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xj1.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r6.l(0, 0, r5) == r0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r6) {
        /*
            r5 = this;
            a.wne r0 = a.wne.f39444a
            byte r1 = r5.j
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L11
            a.z1x.P(r6)
            goto L3d
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L18:
            a.z1x.P(r6)
            goto L30
        L1c:
            a.z1x.P(r6)
            boolean r6 = r5.k
            if (r6 == 0) goto L3d
            java.lang.Object r6 = r5.l
            a.d9z r6 = (a.d9z) r6
            r5.j = r3
            java.lang.Object r6 = r6.l(r4, r4, r5)
            if (r6 != r0) goto L30
            goto L3c
        L30:
            java.lang.Object r6 = r5.m
            a.d9z r6 = (a.d9z) r6
            r5.j = r2
            java.lang.Object r5 = r6.l(r4, r4, r5)
            if (r5 != r0) goto L3d
        L3c:
            return r0
        L3d:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xj1.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x016e  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0092, code lost:
    
        if (r0 == r10) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xj1.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        if (r8 == r2) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object t(java.lang.Object r8) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r7.k
            java.lang.Object r1 = r7.l
            a.fht0 r1 = (a.fht0) r1
            a.wne r2 = a.wne.f39444a
            byte r3 = r7.j
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L24
            if (r3 == r6) goto L1e
            if (r3 != r5) goto L18
            a.z1x.P(r8)
            goto L96
        L18:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r4
        L1e:
            a.z1x.P(r8)     // Catch: java.lang.Exception -> L22
            return r8
        L22:
            r8 = move-exception
            goto L3c
        L24:
            a.z1x.P(r8)
            java.lang.Object r8 = r7.m     // Catch: java.lang.Exception -> L22
            a.c3c0 r8 = (a.c3c0) r8     // Catch: java.lang.Exception -> L22
            r7.j = r6     // Catch: java.lang.Exception -> L22
            if (r0 == 0) goto L34
            java.io.Serializable r7 = r1.c(r8, r7)     // Catch: java.lang.Exception -> L22
            goto L38
        L34:
            java.io.Serializable r7 = r1.b(r8, r7)     // Catch: java.lang.Exception -> L22
        L38:
            if (r7 != r2) goto L3b
            goto L95
        L3b:
            return r7
        L3c:
            boolean r3 = r8 instanceof java.net.UnknownHostException
            if (r3 != 0) goto L46
            boolean r3 = r8 instanceof java.net.SocketException
            if (r3 == 0) goto L45
            goto L46
        L45:
            throw r8
        L46:
            java.lang.String r8 = a.axq.g()
            java.lang.Object r3 = r1.b
            a.nb6 r3 = (a.nb6) r3
            r3.getClass()
            a.us00 r3 = r3.f23224a
            android.content.Context r6 = r3.getApplicationContext()
            r6.getClass()
            a.cpv0 r6 = a.cpv0.d(r6)
            r6.getClass()
            android.content.Context r3 = r3.getApplicationContext()
            r3.getClass()
            a.ga3.a(r6, r3, r8, r0)
            a.pnd0 r0 = new a.pnd0
            r3 = 21
            r0.<init>(r1, r8, r4, r3)
            a.vsg0 r8 = new a.vsg0
            r8.<init>(r0)
            a.uen r0 = a.wen.b
            r0 = 30
            a.bfn r3 = a.bfn.SECONDS
            long r0 = a.ibc.w0(r0, r3)
            a.anq r3 = new a.anq
            r3.<init>(r0, r8, r4)
            a.eu4 r8 = new a.eu4
            r0 = 9
            r8.<init>(r3, r0)
            r7.j = r5
            java.lang.Object r8 = a.ntb.K(r8, r7)
            if (r8 != r2) goto L96
        L95:
            return r2
        L96:
            a.vb6 r8 = (a.vb6) r8
            a.dqv0 r7 = r8.b
            boolean r8 = r7 instanceof a.bqv0
            if (r8 != 0) goto Lad
            boolean r8 = r7 instanceof a.cqv0
            if (r8 == 0) goto La9
            a.cqv0 r7 = (a.cqv0) r7
            java.lang.Object r7 = r7.f4815a
            java.util.List r7 = (java.util.List) r7
            return r7
        La9:
            a.t9f.b()
            return r4
        Lad:
            a.bqv0 r7 = (a.bqv0) r7
            java.lang.Exception r7 = r7.f3052a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xj1.t(java.lang.Object):java.lang.Object");
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                return new xj1(this.k, this.l, obj2, yjeVar, (byte) 0);
            case 1:
                return new xj1(this.k, this.l, obj2, yjeVar, (byte) 1);
            case 2:
                return new xj1((byte) 2, yjeVar, (i3t0) obj2, this.k);
            case 3:
                return new xj1((List) this.l, yjeVar, this.k, (g9a) obj2);
            case 4:
                return new xj1(this.l, this.k, obj2, yjeVar, (byte) 4);
            case 5:
                return new xj1(this.k, this.l, obj2, yjeVar, (byte) 5);
            case 6:
                return new xj1(this.k, this.l, obj2, yjeVar, (byte) 6);
            case 7:
                return new xj1(this.k, this.l, obj2, yjeVar, (byte) 7);
            case 8:
                xj1 xj1Var = new xj1((bu) this.l, (zz) obj2, yjeVar);
                xj1Var.k = ((Boolean) obj).booleanValue();
                return xj1Var;
            case 9:
                xj1 xj1Var2 = new xj1((diu0) obj2, yjeVar, (byte) 9);
                xj1Var2.k = ((Boolean) obj).booleanValue();
                return xj1Var2;
            case 10:
                return new xj1((y920) this.l, (String) obj2, this.k, yjeVar);
            case 11:
                return new xj1((w5z) this.l, (ouj0) obj2, this.j, yjeVar);
            case 12:
                return new xj1((diu0) obj2, yjeVar, (byte) 12);
            case 13:
                return new xj1((diu0) obj2, yjeVar, (byte) 13);
            case 14:
                return new xj1((diu0) obj2, this.k, yjeVar, (byte) 14);
            case 15:
                return new xj1((diu0) obj2, yjeVar, (byte) 15);
            case 16:
                return new xj1((diu0) obj2, yjeVar, (byte) 16);
            case 17:
                xj1 xj1Var3 = new xj1((diu0) obj2, yjeVar, (byte) 17);
                xj1Var3.k = ((Boolean) obj).booleanValue();
                return xj1Var3;
            case 18:
                return new xj1((diu0) obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new xj1((diu0) obj2, yjeVar, (byte) 19);
            case 20:
                return new xj1((diu0) obj2, this.k, yjeVar, (byte) 20);
            case 21:
                return new xj1(this.k, this.l, obj2, yjeVar, (byte) 21);
            case 22:
                return new xj1((byte) 22, yjeVar, (i3t0) obj2, this.k);
            case 23:
                return new xj1(this.l, this.k, obj2, yjeVar, (byte) 23);
            default:
                return new xj1((diu0) obj2, yjeVar, (byte) 24);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((xj1) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((xj1) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((xj1) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((xj1) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((xj1) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x044a  */
    /* JADX WARN: Code duplicated, block: B:154:0x044c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0472 A[LOOP:3: B:151:0x043b->B:159:0x0472, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:269:0x07c2  */
    /* JADX WARN: Code duplicated, block: B:352:0x091a  */
    /* JADX WARN: Code duplicated, block: B:353:0x091d  */
    /* JADX WARN: Code duplicated, block: B:447:0x0b17  */
    /* JADX WARN: Code duplicated, block: B:451:0x0b2d  */
    /* JADX WARN: Code duplicated, block: B:452:0x0b31  */
    /* JADX WARN: Code duplicated, block: B:454:0x0b35  */
    /* JADX WARN: Code duplicated, block: B:455:0x0b39  */
    /* JADX WARN: Code duplicated, block: B:498:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x046f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x01f2 A[LOOP:1: B:68:0x01b5->B:72:0x01f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x02e6 A[PHI: r1 r11
  0x02e6: PHI (r1v113 java.lang.Object) = (r1v112 java.lang.Object), (r1v117 java.lang.Object) binds: [B:94:0x02e3, B:81:0x0215] A[DONT_GENERATE, DONT_INLINE]
  0x02e6: PHI (r11v15 boolean) = (r11v14 boolean), (r11v17 boolean) binds: [B:94:0x02e3, B:81:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0341, code lost:
    
        if (r2 == r0) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x034a, code lost:
    
        if (r1.a((java.util.List) r2) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x06fe, code lost:
    
        if (r0 == r14) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x07ce, code lost:
    
        if (r0.f(a.jle.f16712a, r38) == r2) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x07fc, code lost:
    
        if (r2.invoke(r38) == r1) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0809, code lost:
    
        if (((a.zz) r4).invoke(r38) == r1) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0839, code lost:
    
        if (r1.c(r4, r38) == r0) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0844, code lost:
    
        if (r1.w(r4, r38) == r0) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x08a7, code lost:
    
        if (a.t33.a(r0, r1, null, null, null, r38, 14) == r8) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0924, code lost:
    
        if (a.qcc.O(r12, r38) == r9) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x09b6, code lost:
    
        if (r0 == r9) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0a05, code lost:
    
        if (r0 == r9) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0a99, code lost:
    
        if (((a.g9a) r4).q(1000000000, r38) == r0) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x0b80, code lost:
    
        if (r2.l(r38) == r1) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0b96, code lost:
    
        if (r0.r.b((java.lang.String) r4, r38) == r1) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0be0, code lost:
    
        if (r0.N0(r1, r2, r38, "") == r8) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0bf4, code lost:
    
        if (r0.I(r4, r2, "", r38) == r8) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0151, code lost:
    
        if (r4.o0((a.ql5) r2, r38) == r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02f4, code lost:
    
        if (r0.o0(r1, r38) == r8) goto L98;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 3120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.xj1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj1(bu buVar, zz zzVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 8;
        this.l = buVar;
        this.m = zzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj1(byte b, yje yjeVar, i3t0 i3t0Var, boolean z) {
        super(2, yjeVar);
        this.i = b;
        this.k = z;
        this.m = i3t0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj1(y920 y920Var, String str, boolean z, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        this.l = y920Var;
        this.m = str;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj1(diu0 diu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = diu0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj1(diu0 diu0Var, boolean z, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.m = diu0Var;
        this.k = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj1(Object obj, boolean z, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.k = z;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj1(List list, yje yjeVar, boolean z, g9a g9aVar) {
        super(2, yjeVar);
        this.i = (byte) 3;
        this.l = list;
        this.k = z;
        this.m = g9aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xj1(boolean z, Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = z;
        this.l = obj;
        this.m = obj2;
    }
}
