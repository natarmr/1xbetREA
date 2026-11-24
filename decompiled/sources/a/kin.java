package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class kin extends w46 {
    public final xcc b;
    public final d3c c;
    public final lzt d;
    public final fpi0 e;
    public final mne f;
    public final i5m0 g;
    public final fq h;
    public final mii0 i;
    public final s7t0 j;
    public final ivn k;
    public final qni0 l;
    public final ecs m;
    public final zri n;
    public final fhj o;
    public final rpt p;
    public final fvt0 q;
    public final ztt r;
    public final t0u s;
    public bby t;
    public bby u;
    public String v;
    public final p7m0 w;
    public final p7m0 x;
    public final p7m0 y;

    public kin(xcc xccVar, qa60 qa60Var, d3c d3cVar, lzt lztVar, fpi0 fpi0Var, mne mneVar, i5m0 i5m0Var, fq fqVar, mii0 mii0Var, s7t0 s7t0Var, ivn ivnVar, qni0 qni0Var, ecs ecsVar, zri zriVar, fhj fhjVar, rpt rptVar, fvt0 fvt0Var, ztt zttVar, t0u t0uVar) {
        xccVar.getClass();
        qa60Var.getClass();
        d3cVar.getClass();
        lztVar.getClass();
        fpi0Var.getClass();
        i5m0Var.getClass();
        fqVar.getClass();
        s7t0Var.getClass();
        qni0Var.getClass();
        ecsVar.getClass();
        zttVar.getClass();
        t0uVar.getClass();
        this.b = xccVar;
        this.c = d3cVar;
        this.d = lztVar;
        this.e = fpi0Var;
        this.f = mneVar;
        this.g = i5m0Var;
        this.h = fqVar;
        this.i = mii0Var;
        this.j = s7t0Var;
        this.k = ivnVar;
        this.l = qni0Var;
        this.m = ecsVar;
        this.n = zriVar;
        this.o = fhjVar;
        this.p = rptVar;
        this.q = fvt0Var;
        this.r = zttVar;
        this.s = t0uVar;
        this.v = "";
        this.w = q7m0.a(ajn.f985a);
        Boolean bool = Boolean.TRUE;
        this.x = q7m0.a(bool);
        this.y = q7m0.a(bool);
        yje yjeVar = null;
        int i = 2;
        Class<kin> cls = kin.class;
        String str = "handleEasternNightsError";
        String str2 = "handleEasternNightsError(Ljava/lang/Throwable;)V";
        sac.T(new fnq(qa60Var.a(), new sxk(this, yjeVar, (byte) 5), (byte) 4), jiu0.a(this), new pfl(i, this, cls, str, str2, 4, (byte) 4));
        sac.V(jiu0.a(this), new k0l(1, this, cls, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 25), null, mneVar.f22085a, new bin(this, yjeVar, (byte) 1), 10);
    }

    public final void A(Throwable th) {
        sac.V(jiu0.a(this), fin.f9597a, null, this.f.f22085a, new j0l((Object) this, (Object) th, (yje) null, (byte) 11), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        if (r20.h.f(r8, r3) == r4) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(a.cjn r21, a.zje r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = r2 instanceof a.iin
            if (r3 == 0) goto L19
            r3 = r2
            a.iin r3 = (a.iin) r3
            int r4 = r3.l
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.l = r4
            goto L1e
        L19:
            a.iin r3 = new a.iin
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.j
            a.wne r4 = a.wne.f39444a
            int r5 = r3.l
            r6 = 0
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L3d
            if (r5 == r8) goto L37
            if (r5 != r7) goto L31
            a.z1x.P(r2)
            goto L93
        L31:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            return r6
        L37:
            a.cjn r1 = r3.i
            a.z1x.P(r2)
            goto L63
        L3d:
            a.z1x.P(r2)
            a.xin r2 = new a.xin
            a.xhn r5 = new a.xhn
            java.lang.String r9 = r0.v
            r5.<init>(r9, r1)
            r2.<init>(r5)
            a.p7m0 r5 = r0.w
            r5.getClass()
            r5.o(r6, r2)
            a.ymx r2 = a.ymx.INTERVAL_100
            r3.i = r1
            r3.l = r8
            r8 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r2 = a.qcc.O(r8, r3)
            if (r2 != r4) goto L63
            goto L92
        L63:
            a.ly5 r8 = new a.ly5
            double r9 = r1.f
            a.lnm0 r11 = r1.e
            double r13 = r1.d
            a.ztt r2 = r0.r
            a.csr r2 = r2.a()
            a.bsr r2 = r2.f4905a
            a.esr r2 = r2.f3145a
            r21 = r8
            long r7 = r1.f4469a
            r12 = 0
            r15 = 0
            r17 = r2
            r18 = r7
            r8 = r21
            r8.<init>(r9, r11, r12, r13, r15, r17, r18)
            r3.i = r6
            r1 = 2
            r3.l = r1
            a.fq r0 = r0.h
            java.lang.Object r0 = r0.f(r8, r3)
            if (r0 != r4) goto L93
        L92:
            return r4
        L93:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kin.B(a.cjn, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object C(zje zjeVar) throws Exception {
        jin jinVar;
        if (zjeVar instanceof jin) {
            jinVar = (jin) zjeVar;
            int i = jinVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                jinVar.l = i - Integer.MIN_VALUE;
            } else {
                jinVar = new jin(this, zjeVar);
            }
        } else {
            jinVar = new jin(this, zjeVar);
        }
        Object objA = jinVar.j;
        wne wneVar = wne.f39444a;
        int i2 = jinVar.l;
        if (i2 == 0) {
            z1x.P(objA);
            jinVar.i = this;
            jinVar.l = 1;
            objA = this.s.a(jinVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = jinVar.i;
            z1x.P(objA);
        }
        this.v = (String) objA;
        return Unit.f46060a;
    }

    public final void w() {
        if (this.d.a()) {
            sac.V(jiu0.a(this), new yhn((Object) this, (byte) 0), null, this.f.b, new fr9(this, null, (byte) 23), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006d, code lost:
    
        if (r7.j.a(true, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(a.cjn r8, a.zje r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a.din
            if (r0 == 0) goto L13
            r0 = r9
            a.din r0 = (a.din) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.din r0 = new a.din
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            a.fq r3 = r7.h
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L3a
            if (r2 == r5) goto L36
            if (r2 != r4) goto L2f
            a.z1x.P(r9)
            goto L70
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            r7 = 0
            return r7
        L36:
            a.z1x.P(r9)
            goto L65
        L3a:
            a.z1x.P(r9)
            goto L57
        L3e:
            a.z1x.P(r9)
            a.ecs r9 = r7.m
            r2 = 0
            r9.a(r2)
            a.iy5 r9 = new a.iy5
            a.csr r8 = r8.j
            r9.<init>(r8)
            r0.k = r6
            java.lang.Object r8 = r3.f(r9, r0)
            if (r8 != r1) goto L57
            goto L6f
        L57:
            a.xy5 r8 = new a.xy5
            r8.<init>(r6)
            r0.k = r5
            java.lang.Object r8 = r3.f(r8, r0)
            if (r8 != r1) goto L65
            goto L6f
        L65:
            r0.k = r4
            a.s7t0 r7 = r7.j
            java.lang.Object r7 = r7.a(r6, r0)
            if (r7 != r1) goto L70
        L6f:
            return r1
        L70:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kin.x(a.cjn, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r6.h.f(a.my5.f22588a, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(a.cjn r7, a.zje r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a.ein
            if (r0 == 0) goto L13
            r0 = r8
            a.ein r0 = (a.ein) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.ein r0 = new a.ein
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            a.cjn r7 = r0.i
            a.z1x.P(r8)
            goto L56
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L33:
            a.cjn r7 = r0.i
            a.z1x.P(r8)
            goto L47
        L39:
            a.z1x.P(r8)
            r0.i = r7
            r0.l = r5
            java.lang.Object r8 = r6.C(r0)
            if (r8 != r1) goto L47
            goto L55
        L47:
            r0.i = r7
            r0.l = r4
            a.fq r8 = r6.h
            a.my5 r2 = a.my5.f22588a
            java.lang.Object r8 = r8.f(r2, r0)
            if (r8 != r1) goto L56
        L55:
            return r1
        L56:
            a.yin r8 = new a.yin
            a.xhn r0 = new a.xhn
            java.lang.String r1 = r6.v
            r0.<init>(r1, r7)
            r8.<init>(r0)
            a.p7m0 r6 = r6.w
            r6.getClass()
            r6.o(r3, r8)
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kin.y(a.cjn, a.zje):java.lang.Object");
    }

    public final void z(Throwable th) {
        yje yjeVar = null;
        zhi0 zhi0Var = th instanceof zhi0 ? (zhi0) th : null;
        kuw kuwVar = zhi0Var != null ? zhi0Var.c : null;
        if (kuwVar != l5t.h && kuwVar != l5t.j && kuwVar != l5t.k && kuwVar != l5t.d) {
            A(th);
            return;
        }
        sac.V(jiu0.a(this), zhn.f44402a, null, this.f.f22085a, new j0l((Object) this, (Object) ry5.f31296a, yjeVar, (byte) 10), 10);
        w();
    }
}
