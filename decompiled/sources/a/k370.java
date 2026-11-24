package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class k370 extends w46 {
    public final cyu b;
    public final jdu c;
    public final mne d;
    public final wtt e;
    public final n4u f;
    public final kqc g;
    public final jqc h;
    public final kqc i;
    public final jqc j;
    public final lbu k;
    public final nw20 l;
    public final nvu m;
    public final nhf0 n;
    public bby o;
    public final p7m0 p = q7m0.a(null);

    public k370(cyu cyuVar, jdu jduVar, mne mneVar, wtt wttVar, n4u n4uVar, kqc kqcVar, jqc jqcVar, kqc kqcVar2, jqc jqcVar2, lbu lbuVar, nw20 nw20Var, nvu nvuVar, nhf0 nhf0Var, kc60 kc60Var) {
        this.b = cyuVar;
        this.c = jduVar;
        this.d = mneVar;
        this.e = wttVar;
        this.f = n4uVar;
        this.g = kqcVar;
        this.h = jqcVar;
        this.i = kqcVar2;
        this.j = jqcVar2;
        this.k = lbuVar;
        this.l = nw20Var;
        this.m = nvuVar;
        this.n = nhf0Var;
        sac.T(new fnq(dtb.z(kc60Var.a(), 1), new nf60(this, null, (byte) 12), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), c370.h);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        if (x(r0) == r1) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(boolean r6, a.zje r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof a.f370
            if (r0 == 0) goto L13
            r0 = r7
            a.f370 r0 = (a.f370) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.f370 r0 = new a.f370
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2b
            a.z1x.P(r7)
            goto La0
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L32:
            boolean r6 = r0.i
            java.lang.Object r2 = r0.j
            a.k370 r2 = (a.k370) r2
            a.z1x.P(r7)     // Catch: java.lang.Throwable -> L3c
            goto L7d
        L3c:
            r7 = move-exception
            goto L85
        L3e:
            a.z1x.P(r7)
            a.e0g0 r7 = a.j0g0.b     // Catch: java.lang.Throwable -> L3c
            r5.H()     // Catch: java.lang.Throwable -> L3c
            a.kqc r7 = r5.i     // Catch: java.lang.Throwable -> L3c
            a.sub0 r7 = r7.a()     // Catch: java.lang.Throwable -> L3c
            a.sub0 r2 = a.sub0.SUCCESS     // Catch: java.lang.Throwable -> L3c
            if (r7 != r2) goto L55
            if (r6 == 0) goto L53
            goto L55
        L53:
            r2 = r5
            goto L7d
        L55:
            a.cyu r7 = r5.b     // Catch: java.lang.Throwable -> L3c
            r0.j = r5     // Catch: java.lang.Throwable -> L3c
            r0.i = r6     // Catch: java.lang.Throwable -> L3c
            r0.m = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r7.f5196a     // Catch: java.lang.Throwable -> L3c
            a.dhu r2 = (a.dhu) r2     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r4 = r7.b     // Catch: java.lang.Throwable -> L3c
            a.ntu r4 = (a.ntu) r4     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = r4.a()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r7 = r7.c     // Catch: java.lang.Throwable -> L3c
            a.k9c r7 = (a.k9c) r7     // Catch: java.lang.Throwable -> L3c
            boolean r7 = r7.a()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r7 = r2.a(r0, r4, r7)     // Catch: java.lang.Throwable -> L3c
            if (r7 != r1) goto L78
            goto L7a
        L78:
            kotlin.Unit r7 = kotlin.Unit.f46060a     // Catch: java.lang.Throwable -> L3c
        L7a:
            if (r7 != r1) goto L53
            goto L9f
        L7d:
            r2.I()     // Catch: java.lang.Throwable -> L3c
            kotlin.Unit r7 = kotlin.Unit.f46060a     // Catch: java.lang.Throwable -> L3c
            a.e0g0 r2 = a.j0g0.b     // Catch: java.lang.Throwable -> L3c
            goto L8d
        L85:
            a.e0g0 r2 = a.j0g0.b
            a.g0g0 r2 = new a.g0g0
            r2.<init>(r7)
            r7 = r2
        L8d:
            java.lang.Throwable r2 = a.j0g0.a(r7)
            if (r2 == 0) goto La0
            r0.j = r7
            r0.i = r6
            r0.m = r3
            java.lang.Object r5 = r5.x(r0)
            if (r5 != r1) goto La0
        L9f:
            return r1
        La0:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k370.A(boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:49|22|(1:25)|44) */
    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        r6 = r9;
        r9 = r1;
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0083, code lost:
    
        r10 = a.j0g0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        return new a.g0g0(r9);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00a4 -> B:46:0x00a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(kotlin.jvm.functions.Function1 r10, a.zje r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof a.g370
            if (r0 == 0) goto L13
            r0 = r11
            a.g370 r0 = (a.g370) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.o = r1
            goto L18
        L13:
            a.g370 r0 = new a.g370
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r9 = r0.m
            a.wne r11 = a.wne.f39444a
            int r1 = r0.o
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L48
            if (r1 == r4) goto L3a
            if (r1 != r2) goto L34
            int r10 = r0.k
            int r1 = r0.j
            kotlin.jvm.functions.Function1 r5 = r0.i
            a.z1x.P(r9)
            r9 = r5
            r5 = r1
            goto La6
        L34:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r3
        L3a:
            int r10 = r0.l
            int r1 = r0.k
            int r5 = r0.j
            kotlin.jvm.functions.Function1 r6 = r0.i
            a.z1x.P(r9)     // Catch: java.lang.Exception -> L46
            goto L69
        L46:
            r9 = move-exception
            goto L70
        L48:
            a.z1x.P(r9)
            r9 = 0
            r1 = 4
            r5 = r10
            r10 = r9
            r9 = r5
            r5 = r1
        L51:
            if (r10 >= r5) goto La8
            a.e0g0 r1 = a.j0g0.b     // Catch: java.lang.Exception -> L6c
            r0.i = r9     // Catch: java.lang.Exception -> L6c
            r0.j = r5     // Catch: java.lang.Exception -> L6c
            r0.k = r10     // Catch: java.lang.Exception -> L6c
            r0.l = r10     // Catch: java.lang.Exception -> L6c
            r0.o = r4     // Catch: java.lang.Exception -> L6c
            java.lang.Object r1 = r9.invoke(r0)     // Catch: java.lang.Exception -> L6c
            if (r1 != r11) goto L66
            goto La3
        L66:
            r6 = r9
            r9 = r1
            r1 = r10
        L69:
            a.e0g0 r10 = a.j0g0.b     // Catch: java.lang.Exception -> L46
            return r9
        L6c:
            r1 = move-exception
            r6 = r9
            r9 = r1
            r1 = r10
        L70:
            boolean r7 = r9 instanceof a.zhi0
            if (r7 == 0) goto L78
            r7 = r9
            a.zhi0 r7 = (a.zhi0) r7
            goto L79
        L78:
            r7 = r3
        L79:
            if (r7 == 0) goto L80
            boolean r7 = r7.e
            if (r7 != r4) goto L80
            goto L83
        L80:
            r7 = 3
            if (r10 != r7) goto L8b
        L83:
            a.e0g0 r10 = a.j0g0.b
            a.g0g0 r10 = new a.g0g0
            r10.<init>(r9)
            return r10
        L8b:
            a.uen r9 = a.wen.b
            a.bfn r9 = a.bfn.SECONDS
            long r7 = a.ibc.v0(r7, r9)
            r0.i = r6
            r0.j = r5
            r0.k = r1
            r0.l = r10
            r0.o = r2
            java.lang.Object r9 = a.qcc.P(r7, r0)
            if (r9 != r11) goto La4
        La3:
            return r11
        La4:
            r10 = r1
            r9 = r6
        La6:
            int r10 = r10 + r4
            goto L51
        La8:
            a.e0g0 r9 = a.j0g0.b
            java.util.concurrent.CancellationException r9 = new java.util.concurrent.CancellationException
            java.lang.String r10 = "Coroutine was cancelled"
            r9.<init>(r10)
            a.g0g0 r10 = new a.g0g0
            r10.<init>(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k370.B(kotlin.jvm.functions.Function1, a.zje):java.lang.Object");
    }

    public final void C() {
        p7m0 p7m0Var;
        Object value;
        b370 b370Var;
        kat katVar;
        do {
            p7m0Var = this.p;
            value = p7m0Var.getValue();
            b370Var = (b370) value;
            katVar = kat.f17982a;
            if (b370Var == null) {
                b370Var = new b370(katVar, katVar);
            }
        } while (!p7m0Var.m(value, b370.b(b370Var, katVar, null, 2)));
    }

    public final void D() {
        p7m0 p7m0Var;
        Object value;
        b370 b370Var;
        do {
            p7m0Var = this.p;
            value = p7m0Var.getValue();
            b370Var = (b370) value;
            if (b370Var == null) {
                kat katVar = kat.f17982a;
                b370Var = new b370(katVar, katVar);
            }
        } while (!p7m0Var.m(value, b370.b(b370Var, nat.f23207a, null, 2)));
    }

    public final void E() {
        p7m0 p7m0Var;
        Object value;
        do {
            p7m0Var = this.p;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, b370.a(oat.f24946a, mat.f21475a)));
    }

    public final void F() {
        p7m0 p7m0Var;
        Object value;
        mat matVar;
        do {
            p7m0Var = this.p;
            value = p7m0Var.getValue();
            matVar = mat.f21475a;
        } while (!p7m0Var.m(value, b370.a(matVar, matVar)));
    }

    public final void G() {
        p7m0 p7m0Var;
        Object value;
        b370 b370Var;
        do {
            p7m0Var = this.p;
            value = p7m0Var.getValue();
            b370Var = (b370) value;
            if (b370Var == null) {
                kat katVar = kat.f17982a;
                b370Var = new b370(katVar, katVar);
            }
        } while (!p7m0Var.m(value, b370.b(b370Var, null, mat.f21475a, 1)));
    }

    public final void H() {
        p7m0 p7m0Var;
        Object value;
        b370 b370Var;
        kat katVar;
        do {
            p7m0Var = this.p;
            value = p7m0Var.getValue();
            b370Var = (b370) value;
            katVar = kat.f17982a;
            if (b370Var == null) {
                b370Var = new b370(katVar, katVar);
            }
        } while (!p7m0Var.m(value, b370.b(b370Var, null, katVar, 1)));
    }

    public final void I() {
        p7m0 p7m0Var;
        Object value;
        b370 b370Var;
        do {
            p7m0Var = this.p;
            value = p7m0Var.getValue();
            b370Var = (b370) value;
            if (b370Var == null) {
                kat katVar = kat.f17982a;
                b370Var = new b370(katVar, katVar);
            }
        } while (!p7m0Var.m(value, b370.b(b370Var, null, nat.f23207a, 1)));
    }

    public final void J() {
        p7m0 p7m0Var;
        Object value;
        oat oatVar;
        do {
            p7m0Var = this.p;
            value = p7m0Var.getValue();
            oatVar = oat.f24946a;
        } while (!p7m0Var.m(value, b370.a(oatVar, oatVar)));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a0, code lost:
    
        if (L(r0) == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(a.zje r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a.h370
            if (r0 == 0) goto L13
            r0 = r9
            a.h370 r0 = (a.h370) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.h370 r0 = new a.h370
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.l
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L48
            if (r2 == r6) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            a.z1x.P(r9)
            goto La6
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r5
        L35:
            int r2 = r0.k
            boolean r4 = r0.j
            java.lang.Object r5 = r0.i
            a.z1x.P(r9)
            goto L85
        L3f:
            a.z1x.P(r9)
            a.j0g0 r9 = (a.j0g0) r9
            java.lang.Object r9 = r9.f15681a
        L46:
            r5 = r9
            goto L59
        L48:
            a.z1x.P(r9)
            a.tw r9 = new a.tw
            r9.<init>(r8, r5, r4)
            r0.n = r6
            java.lang.Object r9 = r8.B(r9, r0)
            if (r9 != r1) goto L46
            goto La2
        L59:
            java.lang.Throwable r9 = a.j0g0.a(r5)
            if (r9 == 0) goto La6
            a.jqc r9 = r8.h
            boolean r9 = r9.b()
            a.kqc r2 = r8.g
            a.sub0 r2 = r2.a()
            a.sub0 r7 = a.sub0.SUCCESS
            if (r2 != r7) goto L70
            goto L71
        L70:
            r6 = 0
        L71:
            r0.i = r5
            r0.j = r9
            r0.k = r6
            r0.n = r4
            a.jqc r2 = r8.j
            java.io.Serializable r2 = r2.a(r0)
            if (r2 != r1) goto L82
            goto La2
        L82:
            r4 = r9
            r9 = r2
            r2 = r6
        L85:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r4 == 0) goto La3
            if (r2 != 0) goto L91
            if (r9 == 0) goto La3
        L91:
            r8.D()
            r0.i = r5
            r0.j = r4
            r0.k = r2
            r0.n = r3
            java.lang.Object r8 = r8.L(r0)
            if (r8 != r1) goto La6
        La2:
            return r1
        La3:
            r8.F()
        La6:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k370.K(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (x(r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(a.zje r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof a.i370
            if (r0 == 0) goto L13
            r0 = r7
            a.i370 r0 = (a.i370) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.i370 r0 = new a.i370
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r7)
            goto L5b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L31:
            a.z1x.P(r7)
            a.j0g0 r7 = (a.j0g0) r7
            java.lang.Object r7 = r7.f15681a
            goto L4a
        L39:
            a.z1x.P(r7)
            a.j370 r7 = new a.j370
            r7.<init>(r6, r3)
            r0.l = r5
            java.lang.Object r7 = r6.B(r7, r0)
            if (r7 != r1) goto L4a
            goto L5a
        L4a:
            java.lang.Throwable r2 = a.j0g0.a(r7)
            if (r2 == 0) goto L5b
            r0.i = r7
            r0.l = r4
            java.lang.Object r6 = r6.x(r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k370.L(a.zje):java.lang.Object");
    }

    public final gmq w() {
        return new i89(this.p, (byte) 22);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(zje zjeVar) {
        d370 d370Var;
        if (zjeVar instanceof d370) {
            d370Var = (d370) zjeVar;
            int i = d370Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                d370Var.k = i - Integer.MIN_VALUE;
            } else {
                d370Var = new d370(this, zjeVar);
            }
        } else {
            d370Var = new d370(this, zjeVar);
        }
        Object objA = d370Var.i;
        Object obj = wne.f39444a;
        int i2 = d370Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            d370Var.k = 1;
            objA = this.j.a(d370Var);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        if (((Boolean) objA).booleanValue()) {
            I();
        } else {
            G();
        }
        return Unit.f46060a;
    }

    public final void y(a370 a370Var) {
        bby bbyVar = this.o;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.o = sac.V(jiu0.a(this), null, null, this.d.b, new er60(a370Var, this, null, (byte) 4), 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0087 A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:17:0x003b, B:43:0x009b, B:22:0x0047, B:37:0x007f, B:39:0x0087, B:40:0x008b, B:25:0x004e, B:28:0x005d, B:29:0x0061, B:34:0x0070), top: B:58:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x008b A[Catch: all -> 0x003f, TryCatch #0 {all -> 0x003f, blocks: (B:17:0x003b, B:43:0x009b, B:22:0x0047, B:37:0x007f, B:39:0x0087, B:40:0x008b, B:25:0x004e, B:28:0x005d, B:29:0x0061, B:34:0x0070), top: B:58:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x009a  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00dd, code lost:
    
        if (A(r8, r0) == r1) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(boolean r8, a.zje r9) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.k370.z(boolean, a.zje):java.lang.Object");
    }
}
