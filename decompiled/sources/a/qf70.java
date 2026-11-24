package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class qf70 extends w46 {
    public final hs60 A;
    public final l7k B;
    public final cmt C;
    public final d3c D;
    public final y5s E;
    public final e5c F;
    public final kyg0 G;
    public boolean H;
    public boolean I;
    public final p7m0 J;
    public final q99 K;
    public final p7m0 L;
    public final p7m0 M;
    public final p7m0 N;
    public c4m0 O;
    public final i1w0 b;
    public final cni0 c;
    public final fq d;
    public final fpx e;
    public final tni0 f;
    public final g9c g;
    public final dqx h;
    public final lzt i;
    public final zmi0 j;
    public final gmt k;
    public final spx l;
    public final r8u m;
    public final qpt n;
    public final qiu o;
    public final ztt p;
    public final vcu q;
    public final oqt r;
    public final gqx s;
    public final fqx t;
    public final bht0 u;
    public final mne v;
    public final v88 w;
    public final xcc x;
    public final m1e y;
    public final wsf0 z;

    public qf70(i1w0 i1w0Var, cni0 cni0Var, fq fqVar, fpx fpxVar, tni0 tni0Var, g9c g9cVar, dqx dqxVar, lzt lztVar, zmi0 zmi0Var, gmt gmtVar, spx spxVar, qa60 qa60Var, r8u r8uVar, qpt qptVar, qiu qiuVar, ztt zttVar, vcu vcuVar, oqt oqtVar, gqx gqxVar, fqx fqxVar, bht0 bht0Var, mne mneVar, v88 v88Var, xcc xccVar, m1e m1eVar, wsf0 wsf0Var, hs60 hs60Var, l7k l7kVar, cmt cmtVar, d3c d3cVar, y5s y5sVar, e5c e5cVar, kyg0 kyg0Var) {
        i1w0Var.getClass();
        cni0Var.getClass();
        fqVar.getClass();
        fpxVar.getClass();
        tni0Var.getClass();
        g9cVar.getClass();
        dqxVar.getClass();
        lztVar.getClass();
        zmi0Var.getClass();
        gmtVar.getClass();
        spxVar.getClass();
        qa60Var.getClass();
        r8uVar.getClass();
        qptVar.getClass();
        qiuVar.getClass();
        zttVar.getClass();
        vcuVar.getClass();
        oqtVar.getClass();
        gqxVar.getClass();
        fqxVar.getClass();
        bht0Var.getClass();
        xccVar.getClass();
        d3cVar.getClass();
        y5sVar.getClass();
        this.b = i1w0Var;
        this.c = cni0Var;
        this.d = fqVar;
        this.e = fpxVar;
        this.f = tni0Var;
        this.g = g9cVar;
        this.h = dqxVar;
        this.i = lztVar;
        this.j = zmi0Var;
        this.k = gmtVar;
        this.l = spxVar;
        this.m = r8uVar;
        this.n = qptVar;
        this.o = qiuVar;
        this.p = zttVar;
        this.q = vcuVar;
        this.r = oqtVar;
        this.s = gqxVar;
        this.t = fqxVar;
        this.u = bht0Var;
        this.v = mneVar;
        this.w = v88Var;
        this.x = xccVar;
        this.y = m1eVar;
        this.z = wsf0Var;
        this.A = hs60Var;
        this.B = l7kVar;
        this.C = cmtVar;
        this.D = d3cVar;
        this.E = y5sVar;
        this.F = e5cVar;
        this.G = kyg0Var;
        this.I = true;
        this.J = q7m0.a(new qe70(true, new ql5(0L, 0.0d, false, false, 0L, "", "", 0, txs0.b, "", "", false, ""), false, false));
        this.K = vtb.d(0, null, null, 7);
        Boolean bool = Boolean.FALSE;
        this.L = q7m0.a(bool);
        this.M = q7m0.a(Boolean.TRUE);
        this.N = q7m0.a(bool);
        fnq fnqVar = new fnq(new m430(qa60Var.a(), this, (byte) 7), new vf20(2, this, qf70.class, "handleCommand", "handleCommand(Lorg/xplatform/core/domain/GameCommand;)V", 4, (byte) 24), (byte) 4);
        byte b = 3;
        slb.U(new dnq(fnqVar, new pr60(b, null, b), (byte) 1), jiu0.a(this));
    }

    public final void A(Throwable th) {
        if (this.E.f42064a != s470.LUCKY_WHEEL || (this.y.c() && !agc.M(th))) {
            sac.V(jiu0.a(this), ff70.f9438a, null, this.v.f22085a, new ku60(this, th, null, (byte) 12), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (H(r7, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(a.ql5 r7, a.zje r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a.hf70
            if (r0 == 0) goto L13
            r0 = r8
            a.hf70 r0 = (a.hf70) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.hf70 r0 = new a.hf70
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r8)
            goto L52
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L31:
            a.ql5 r7 = r0.i
            a.z1x.P(r8)
            goto L47
        L37:
            a.z1x.P(r8)
            r0.i = r7
            r0.l = r5
            a.cni0 r8 = r6.c
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L47
            goto L51
        L47:
            r0.i = r3
            r0.l = r4
            java.lang.Object r6 = r6.H(r7, r0)
            if (r6 != r1) goto L52
        L51:
            return r1
        L52:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qf70.B(a.ql5, a.zje):java.lang.Object");
    }

    public final void C() {
        if (this.E.f42064a == s470.LUCKY_WHEEL) {
            return;
        }
        Boolean bool = Boolean.FALSE;
        p7m0 p7m0Var = this.L;
        p7m0Var.getClass();
        p7m0Var.o(null, bool);
        sac.V(jiu0.a(this), new cf70(1, this, qf70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, this.v.f22085a, new fj3((diu0) this, (yje) null, (byte) 14), 10);
    }

    public final void D() {
        sac.V(jiu0.a(this), new cf70(1, this, qf70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, this.v.b, new ef70(this, null, (byte) 2), 10);
    }

    public final void E(we70 we70Var) {
        sac.V(jiu0.a(this), new wk60((byte) 14), null, null, new ku60(this, we70Var, null, (byte) 13), 14);
    }

    public final void F(ql5 ql5Var) {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.J;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, qe70.a((qe70) value, ql5Var, false, false, 13)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        if (r13 == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(double r11, a.zje r13) throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r13 instanceof a.mf70
            if (r0 == 0) goto L13
            r0 = r13
            a.mf70 r0 = (a.mf70) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.mf70 r0 = new a.mf70
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r13)
            goto L70
        L2a:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r10)
            r10 = 0
            return r10
        L31:
            double r11 = r0.i
            a.z1x.P(r13)
        L36:
            r5 = r11
            goto L46
        L38:
            a.z1x.P(r13)
            r0.i = r11
            r0.l = r4
            java.lang.Object r13 = r10.z(r0)
            if (r13 != r1) goto L36
            goto L6f
        L46:
            r4 = r13
            a.ql5 r4 = (a.ql5) r4
            a.wsf0 r11 = r10.z
            a.ilt0 r12 = r11.a()
            long r7 = r4.f28916a
            r12.a(r5, r7)
            a.trm0 r11 = r11.s()
            a.bm5 r12 = a.bm5.d
            r8 = 0
            r9 = 8189(0x1ffd, float:1.1475E-41)
            r7 = 0
            a.ql5 r13 = a.ql5.a(r4, r5, r7, r8, r9)
            r11.l(r12, r13)
            r0.i = r5
            r0.l = r3
            java.lang.Object r13 = r10.z(r0)
            if (r13 != r1) goto L70
        L6f:
            return r1
        L70:
            a.ql5 r13 = (a.ql5) r13
            a.zmi0 r11 = r10.j
            r11.a(r13)
            double r1 = r13.b
            a.bht0 r11 = r10.u
            a.qpt r12 = r11.f2625a
            a.ql5 r0 = r12.a()
            if (r0 == 0) goto La0
            a.gmt r12 = r11.b
            a.ql5 r12 = r12.a()
            if (r12 == 0) goto La0
            long r3 = r0.f28916a
            long r5 = r12.f28916a
            int r12 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r12 != 0) goto La0
            a.dni0 r11 = r11.c
            r4 = 0
            r5 = 8189(0x1ffd, float:1.1475E-41)
            r3 = 0
            a.ql5 r12 = a.ql5.a(r0, r1, r3, r4, r5)
            r11.a(r12)
        La0:
            r10.F(r13)
            kotlin.Unit r10 = kotlin.Unit.f46060a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qf70.G(double, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H(ql5 ql5Var, zje zjeVar) {
        nf70 nf70Var;
        if (zjeVar instanceof nf70) {
            nf70Var = (nf70) zjeVar;
            int i = nf70Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nf70Var.k = i - Integer.MIN_VALUE;
            } else {
                nf70Var = new nf70(this, zjeVar);
            }
        } else {
            nf70Var = new nf70(this, zjeVar);
        }
        Object obj = nf70Var.i;
        wne wneVar = wne.f39444a;
        int i2 = nf70Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            F(ql5Var);
            hle hleVar = new hle(ql5Var, false);
            nf70Var.k = 1;
            if (this.d.f(hleVar, nf70Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r3 == r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(double r17, long r19, a.zje r21) throws java.lang.Exception {
        /*
            r16 = this;
            r0 = r16
            r1 = r19
            r3 = r21
            boolean r4 = r3 instanceof a.of70
            if (r4 == 0) goto L19
            r4 = r3
            a.of70 r4 = (a.of70) r4
            int r5 = r4.n
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L19
            int r5 = r5 - r6
            r4.n = r5
            goto L1e
        L19:
            a.of70 r4 = new a.of70
            r4.<init>(r0, r3)
        L1e:
            java.lang.Object r3 = r4.l
            a.wne r5 = a.wne.f39444a
            int r6 = r4.n
            r7 = 2
            r8 = 1
            a.wsf0 r9 = r0.z
            if (r6 == 0) goto L44
            if (r6 == r8) goto L3b
            if (r6 != r7) goto L34
            a.qf70 r0 = r4.k
            a.z1x.P(r3)
            goto L8a
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            r0 = 0
            return r0
        L3b:
            long r1 = r4.j
            double r10 = r4.i
            a.z1x.P(r3)
        L42:
            r11 = r10
            goto L5e
        L44:
            a.z1x.P(r3)
            java.lang.Object r3 = r9.b
            a.g45 r3 = (a.g45) r3
            a.nrt r3 = r3.q()
            r10 = r17
            r4.i = r10
            r4.j = r1
            r4.n = r8
            java.io.Serializable r3 = a.nrt.a(r3, r1, r4)
            if (r3 != r5) goto L42
            goto L89
        L5e:
            r10 = r3
            a.ql5 r10 = (a.ql5) r10
            a.ilt0 r3 = r9.a()
            long r13 = r10.f28916a
            r3.a(r11, r13)
            a.trm0 r3 = r9.s()
            a.bm5 r6 = a.bm5.d
            r14 = 0
            r15 = 8189(0x1ffd, float:1.1475E-41)
            r13 = 0
            a.ql5 r8 = a.ql5.a(r10, r11, r13, r14, r15)
            r3.l(r6, r8)
            r4.k = r0
            r4.i = r11
            r4.j = r1
            r4.n = r7
            java.lang.Object r3 = r0.z(r4)
            if (r3 != r5) goto L8a
        L89:
            return r5
        L8a:
            a.ql5 r3 = (a.ql5) r3
            r0.F(r3)
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qf70.I(double, long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00dd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0105 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x012a A[DONT_INVERT, PHI: r2 r6 r10 r11 r12 r13
  0x012a: PHI (r2v7 kotlin.jvm.functions.Function2) = 
  (r2v5 kotlin.jvm.functions.Function2)
  (r2v5 kotlin.jvm.functions.Function2)
  (r2v5 kotlin.jvm.functions.Function2)
  (r2v8 kotlin.jvm.functions.Function2)
 binds: [B:34:0x0103, B:35:0x0105, B:37:0x010d, B:33:0x00fe] A[DONT_GENERATE, DONT_INLINE]
  0x012a: PHI (r6v5 a.ql5) = (r6v3 a.ql5), (r6v3 a.ql5), (r6v3 a.ql5), (r6v7 a.ql5) binds: [B:34:0x0103, B:35:0x0105, B:37:0x010d, B:33:0x00fe] A[DONT_GENERATE, DONT_INLINE]
  0x012a: PHI (r10v8 boolean) = (r10v4 boolean), (r10v4 boolean), (r10v4 boolean), (r10v11 boolean) binds: [B:34:0x0103, B:35:0x0105, B:37:0x010d, B:33:0x00fe] A[DONT_GENERATE, DONT_INLINE]
  0x012a: PHI (r11v7 boolean) = (r11v4 boolean), (r11v4 boolean), (r11v4 boolean), (r11v8 boolean) binds: [B:34:0x0103, B:35:0x0105, B:37:0x010d, B:33:0x00fe] A[DONT_GENERATE, DONT_INLINE]
  0x012a: PHI (r12v8 boolean) = (r12v5 boolean), (r12v5 boolean), (r12v5 boolean), (r12v11 boolean) binds: [B:34:0x0103, B:35:0x0105, B:37:0x010d, B:33:0x00fe] A[DONT_GENERATE, DONT_INLINE]
  0x012a: PHI (r13v14 boolean) = (r13v13 boolean), (r13v13 boolean), (r13v13 boolean), (r13v17 boolean) binds: [B:34:0x0103, B:35:0x0105, B:37:0x010d, B:33:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:49:0x014c  */
    /* JADX WARN: Code duplicated, block: B:52:0x016d  */
    /* JADX WARN: Code duplicated, block: B:56:0x017d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0182  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c4 A[DONT_INVERT, PHI: r2 r9 r10 r11 r12 r13
  0x01c4: PHI (r2v12 kotlin.jvm.functions.Function2) = (r2v10 kotlin.jvm.functions.Function2), (r2v13 kotlin.jvm.functions.Function2) binds: [B:58:0x0180, B:68:0x01be] A[DONT_GENERATE, DONT_INLINE]
  0x01c4: PHI (r9v17 boolean) = (r9v15 boolean), (r9v20 boolean) binds: [B:58:0x0180, B:68:0x01be] A[DONT_GENERATE, DONT_INLINE]
  0x01c4: PHI (r10v15 boolean) = (r10v13 boolean), (r10v16 boolean) binds: [B:58:0x0180, B:68:0x01be] A[DONT_GENERATE, DONT_INLINE]
  0x01c4: PHI (r11v12 boolean) = (r11v10 boolean), (r11v13 boolean) binds: [B:58:0x0180, B:68:0x01be] A[DONT_GENERATE, DONT_INLINE]
  0x01c4: PHI (r12v15 boolean) = (r12v13 boolean), (r12v16 boolean) binds: [B:58:0x0180, B:68:0x01be] A[DONT_GENERATE, DONT_INLINE]
  0x01c4: PHI (r13v24 a.ql5) = (r13v20 a.ql5), (r13v29 a.ql5) binds: [B:58:0x0180, B:68:0x01be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f6, code lost:
    
        if (r9.f(a.cme.f4599a, r0) == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fa, code lost:
    
        r12 = r10;
        r10 = r12;
        r9 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0126, code lost:
    
        if (r9.f(a.tle.f34139a, r0) == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0145, code lost:
    
        if (r2.invoke(r6, r0) == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0199, code lost:
    
        if (r13 == r1) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01db, code lost:
    
        if (r2.invoke(r13, r0) == r1) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(a.ql5 r10, boolean r11, kotlin.jvm.functions.Function2 r12, a.zje r13) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qf70.J(a.ql5, boolean, kotlin.jvm.functions.Function2, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(ql5 ql5Var, zje zjeVar) {
        ye70 ye70Var;
        if (zjeVar instanceof ye70) {
            ye70Var = (ye70) zjeVar;
            int i = ye70Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ye70Var.l = i - Integer.MIN_VALUE;
            } else {
                ye70Var = new ye70(this, zjeVar);
            }
        } else {
            ye70Var = new ye70(this, zjeVar);
        }
        Object obj = ye70Var.j;
        wne wneVar = wne.f39444a;
        int i2 = ye70Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            ye70Var.i = ql5Var;
            ye70Var.l = 1;
            if (this.c.a(ql5Var, ye70Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ql5Var = ye70Var.i;
            z1x.P(obj);
        }
        this.G.a(ql5Var.f28916a);
        wsf0 wsf0Var = this.z;
        ot otVarB = wsf0Var.b();
        bm5 bm5Var = bm5.d;
        otVarB.a(bm5Var, ql5Var);
        jyg0 jyg0VarQ = wsf0Var.q();
        jyg0VarQ.f17359a.z(bm5Var, ql5Var.f28916a);
        return Unit.f46060a;
    }

    public final void x(ql5 ql5Var) {
        ql5Var.getClass();
        m1e m1eVar = this.y;
        boolean zC = m1eVar.c();
        mne mneVar = this.v;
        yje yjeVar = null;
        if (!zC) {
            e3c.n(this.O);
            this.O = sac.T(new dnq(new fnq(dtb.U(new wk30(m1eVar.b(), (byte) 8), 1), new nf60(this, ql5Var, yjeVar, (byte) 15), (byte) 4), new qos((Object) this, yjeVar, (byte) 25), (byte) 1), d5c.S(jiu0.a(this), mneVar.b), foe.h);
            return;
        }
        hle hleVar = new hle(ql5Var, true);
        bvc bvcVarA = jiu0.a(this);
        rwj rwjVar = mneVar.f22085a;
        xe70 xe70Var = xe70.f40731a;
        byte b = 9;
        sac.V(bvcVarA, xe70Var, null, rwjVar, new ku60(this, hleVar, yjeVar, b), 10);
        if (this.q.a() != vrs.c || this.h.a()) {
            sac.V(jiu0.a(this), xe70Var, null, mneVar.f22085a, new ku60(this, ry5.f31296a, yjeVar, b), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        if (r10 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(a.zje r10) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qf70.y(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z(zje zjeVar) throws Exception {
        df70 df70Var;
        if (zjeVar instanceof df70) {
            df70Var = (df70) zjeVar;
            int i = df70Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                df70Var.k = i - Integer.MIN_VALUE;
            } else {
                df70Var = new df70(this, zjeVar);
            }
        } else {
            df70Var = new df70(this, zjeVar);
        }
        Object objA = df70Var.i;
        wne wneVar = wne.f39444a;
        int i2 = df70Var.k;
        wsf0 wsf0Var = this.z;
        if (i2 == 0) {
            z1x.P(objA);
            khf0 khf0VarG = ((g45) wsf0Var.b).G();
            bm5 bm5Var = bm5.d;
            df70Var.k = 1;
            objA = khf0VarG.A(bm5Var, tl5.c, df70Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        wsf0Var.s().l(bm5.d, (ql5) objA);
        return objA;
    }
}
